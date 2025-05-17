/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Simplified plant voltage and reactive power control model for use with type 3 and type 4 wind turbine models. Reference: IEC 61400-27-1:2015, Annex D.
 */
@SuppressWarnings("unused")
public class WindPlantReactiveControlIEC extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(WindPlantReactiveControlIEC.class);

    /**
     * Default constructor.
     */
    public WindPlantReactiveControlIEC() {
        setCimType("WindPlantReactiveControlIEC");
    }

    /**
     * The wind dynamics lookup table associated with this voltage and reactive power wind plant model.
     *
     * NOT USED
     */
    private Set<WindDynamicsLookupTable> WindDynamicsLookupTable = new HashSet<>(); // OneToMany

    public Set<WindDynamicsLookupTable> getWindDynamicsLookupTable() {
        return WindDynamicsLookupTable;
    }

    public void setWindDynamicsLookupTable(BaseClass _object_) {
        if (!(_object_ instanceof WindDynamicsLookupTable)) {
            throw new IllegalArgumentException("Object is not WindDynamicsLookupTable");
        }
        if (!WindDynamicsLookupTable.contains(_object_)) {
            WindDynamicsLookupTable.add((WindDynamicsLookupTable) _object_);
            ((WindDynamicsLookupTable) _object_).setWindPlantReactiveControlIEC(this);
        }
    }

    public String WindDynamicsLookupTableToString() {
        return getStringFromSet(WindDynamicsLookupTable);
    }

    private static void setWindDynamicsLookupTable(BaseClass _this_, BaseClass _object_) {
        ((WindPlantReactiveControlIEC) _this_).setWindDynamicsLookupTable(_object_);
    }

    private static String WindDynamicsLookupTableToString(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).WindDynamicsLookupTableToString();
    }

    /**
     * Wind plant reactive control model associated with this wind plant.
     *
     * NOT USED
     */
    private WindPlantIEC WindPlantIEC; // OneToOne

    public WindPlantIEC getWindPlantIEC() {
        return WindPlantIEC;
    }

    public void setWindPlantIEC(BaseClass _object_) {
        if (!(_object_ instanceof WindPlantIEC)) {
            throw new IllegalArgumentException("Object is not WindPlantIEC");
        }
        if (WindPlantIEC != _object_) {
            WindPlantIEC = (WindPlantIEC) _object_;
            WindPlantIEC.setWindPlantReactiveControlIEC(this);
        }
    }

    public String WindPlantIECToString() {
        return WindPlantIEC != null ? WindPlantIEC.getRdfid() : null;
    }

    private static void setWindPlantIEC(BaseClass _this_, BaseClass _object_) {
        ((WindPlantReactiveControlIEC) _this_).setWindPlantIEC(_object_);
    }

    private static String WindPlantIECToString(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).WindPlantIECToString();
    }

    /**
     * Maximum positive ramp rate for wind turbine reactive power/voltage reference (&lt;i&gt;dx&lt;/i&gt;&lt;i&gt;&lt;sub&gt;refmax&lt;/sub&gt;&lt;/i&gt;) (&amp;gt; WindPlantReactiveControlIEC.dxrefmin). It is a project-dependent parameter.
     */
    private Double dxrefmax; // PU

    public Double getDxrefmax() {
        return dxrefmax;
    }

    public void setDxrefmax(Double _value_) {
        dxrefmax = _value_;
    }

    public void setDxrefmax(String _value_) {
        dxrefmax = getDoubleFromString(_value_);
    }

    public String dxrefmaxToString() {
        return dxrefmax != null ? dxrefmax.toString() : null;
    }

    private static void setDxrefmax(BaseClass _this_, String _value_) {
        ((WindPlantReactiveControlIEC) _this_).setDxrefmax(_value_);
    }

    private static String dxrefmaxToString(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).dxrefmaxToString();
    }

    /**
     * Maximum negative ramp rate for wind turbine reactive power/voltage reference (&lt;i&gt;dx&lt;/i&gt;&lt;i&gt;&lt;sub&gt;refmin&lt;/sub&gt;&lt;/i&gt;) (&amp;lt; WindPlantReactiveControlIEC.dxrefmax). It is a project-dependent parameter.
     */
    private Double dxrefmin; // PU

    public Double getDxrefmin() {
        return dxrefmin;
    }

    public void setDxrefmin(Double _value_) {
        dxrefmin = _value_;
    }

    public void setDxrefmin(String _value_) {
        dxrefmin = getDoubleFromString(_value_);
    }

    public String dxrefminToString() {
        return dxrefmin != null ? dxrefmin.toString() : null;
    }

    private static void setDxrefmin(BaseClass _this_, String _value_) {
        ((WindPlantReactiveControlIEC) _this_).setDxrefmin(_value_);
    }

    private static String dxrefminToString(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).dxrefminToString();
    }

    /**
     * Plant Q controller integral gain (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;IWPx&lt;/sub&gt;&lt;/i&gt;). It is a project-dependent parameter.
     */
    private Float kiwpx; // Float

    public Float getKiwpx() {
        return kiwpx;
    }

    public void setKiwpx(Float _value_) {
        kiwpx = _value_;
    }

    public void setKiwpx(String _value_) {
        kiwpx = getFloatFromString(_value_);
    }

    public String kiwpxToString() {
        return kiwpx != null ? kiwpx.toString() : null;
    }

    private static void setKiwpx(BaseClass _this_, String _value_) {
        ((WindPlantReactiveControlIEC) _this_).setKiwpx(_value_);
    }

    private static String kiwpxToString(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).kiwpxToString();
    }

    /**
     * Maximum reactive power/voltage reference from integration (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;IWPxmax&lt;/sub&gt;&lt;/i&gt;) (&amp;gt; WindPlantReactiveControlIEC.kiwpxmin). It is a project-dependent parameter.
     */
    private Double kiwpxmax; // PU

    public Double getKiwpxmax() {
        return kiwpxmax;
    }

    public void setKiwpxmax(Double _value_) {
        kiwpxmax = _value_;
    }

    public void setKiwpxmax(String _value_) {
        kiwpxmax = getDoubleFromString(_value_);
    }

    public String kiwpxmaxToString() {
        return kiwpxmax != null ? kiwpxmax.toString() : null;
    }

    private static void setKiwpxmax(BaseClass _this_, String _value_) {
        ((WindPlantReactiveControlIEC) _this_).setKiwpxmax(_value_);
    }

    private static String kiwpxmaxToString(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).kiwpxmaxToString();
    }

    /**
     * Minimum reactive power/voltage reference from integration (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;IWPxmin&lt;/sub&gt;&lt;/i&gt;) (&amp;lt; WindPlantReactiveControlIEC.kiwpxmax). It is a project-dependent parameter.
     */
    private Double kiwpxmin; // PU

    public Double getKiwpxmin() {
        return kiwpxmin;
    }

    public void setKiwpxmin(Double _value_) {
        kiwpxmin = _value_;
    }

    public void setKiwpxmin(String _value_) {
        kiwpxmin = getDoubleFromString(_value_);
    }

    public String kiwpxminToString() {
        return kiwpxmin != null ? kiwpxmin.toString() : null;
    }

    private static void setKiwpxmin(BaseClass _this_, String _value_) {
        ((WindPlantReactiveControlIEC) _this_).setKiwpxmin(_value_);
    }

    private static String kiwpxminToString(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).kiwpxminToString();
    }

    /**
     * Plant Q controller proportional gain (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;PWPx&lt;/sub&gt;&lt;/i&gt;). It is a project-dependent parameter.
     */
    private Float kpwpx; // Float

    public Float getKpwpx() {
        return kpwpx;
    }

    public void setKpwpx(Float _value_) {
        kpwpx = _value_;
    }

    public void setKpwpx(String _value_) {
        kpwpx = getFloatFromString(_value_);
    }

    public String kpwpxToString() {
        return kpwpx != null ? kpwpx.toString() : null;
    }

    private static void setKpwpx(BaseClass _this_, String _value_) {
        ((WindPlantReactiveControlIEC) _this_).setKpwpx(_value_);
    }

    private static String kpwpxToString(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).kpwpxToString();
    }

    /**
     * Reactive power reference gain (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;WPqref&lt;/sub&gt;&lt;/i&gt;). It is a project-dependent parameter.
     */
    private Double kwpqref; // PU

    public Double getKwpqref() {
        return kwpqref;
    }

    public void setKwpqref(Double _value_) {
        kwpqref = _value_;
    }

    public void setKwpqref(String _value_) {
        kwpqref = getDoubleFromString(_value_);
    }

    public String kwpqrefToString() {
        return kwpqref != null ? kwpqref.toString() : null;
    }

    private static void setKwpqref(BaseClass _this_, String _value_) {
        ((WindPlantReactiveControlIEC) _this_).setKwpqref(_value_);
    }

    private static String kwpqrefToString(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).kwpqrefToString();
    }

    /**
     * Plant voltage control droop (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;WPqu&lt;/sub&gt;&lt;/i&gt;). It is a project-dependent parameter.
     */
    private Double kwpqu; // PU

    public Double getKwpqu() {
        return kwpqu;
    }

    public void setKwpqu(Double _value_) {
        kwpqu = _value_;
    }

    public void setKwpqu(String _value_) {
        kwpqu = getDoubleFromString(_value_);
    }

    public String kwpquToString() {
        return kwpqu != null ? kwpqu.toString() : null;
    }

    private static void setKwpqu(BaseClass _this_, String _value_) {
        ((WindPlantReactiveControlIEC) _this_).setKwpqu(_value_);
    }

    private static String kwpquToString(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).kwpquToString();
    }

    /**
     * Filter time constant for voltage-dependent reactive power (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;uqfilt&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0). It is a project-dependent parameter.
     */
    private Double tuqfilt; // Seconds

    public Double getTuqfilt() {
        return tuqfilt;
    }

    public void setTuqfilt(Double _value_) {
        tuqfilt = _value_;
    }

    public void setTuqfilt(String _value_) {
        tuqfilt = getDoubleFromString(_value_);
    }

    public String tuqfiltToString() {
        return tuqfilt != null ? tuqfilt.toString() : null;
    }

    private static void setTuqfilt(BaseClass _this_, String _value_) {
        ((WindPlantReactiveControlIEC) _this_).setTuqfilt(_value_);
    }

    private static String tuqfiltToString(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).tuqfiltToString();
    }

    /**
     * Filter time constant for active power measurement (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;WPpfiltq&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0). It is a project-dependent parameter.
     */
    private Double twppfiltq; // Seconds

    public Double getTwppfiltq() {
        return twppfiltq;
    }

    public void setTwppfiltq(Double _value_) {
        twppfiltq = _value_;
    }

    public void setTwppfiltq(String _value_) {
        twppfiltq = getDoubleFromString(_value_);
    }

    public String twppfiltqToString() {
        return twppfiltq != null ? twppfiltq.toString() : null;
    }

    private static void setTwppfiltq(BaseClass _this_, String _value_) {
        ((WindPlantReactiveControlIEC) _this_).setTwppfiltq(_value_);
    }

    private static String twppfiltqToString(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).twppfiltqToString();
    }

    /**
     * Filter time constant for reactive power measurement (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;WPqfiltq&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0). It is a project-dependent parameter.
     */
    private Double twpqfiltq; // Seconds

    public Double getTwpqfiltq() {
        return twpqfiltq;
    }

    public void setTwpqfiltq(Double _value_) {
        twpqfiltq = _value_;
    }

    public void setTwpqfiltq(String _value_) {
        twpqfiltq = getDoubleFromString(_value_);
    }

    public String twpqfiltqToString() {
        return twpqfiltq != null ? twpqfiltq.toString() : null;
    }

    private static void setTwpqfiltq(BaseClass _this_, String _value_) {
        ((WindPlantReactiveControlIEC) _this_).setTwpqfiltq(_value_);
    }

    private static String twpqfiltqToString(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).twpqfiltqToString();
    }

    /**
     * Filter time constant for voltage measurement (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;WPufiltq&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0). It is a project-dependent parameter.
     */
    private Double twpufiltq; // Seconds

    public Double getTwpufiltq() {
        return twpufiltq;
    }

    public void setTwpufiltq(Double _value_) {
        twpufiltq = _value_;
    }

    public void setTwpufiltq(String _value_) {
        twpufiltq = getDoubleFromString(_value_);
    }

    public String twpufiltqToString() {
        return twpufiltq != null ? twpufiltq.toString() : null;
    }

    private static void setTwpufiltq(BaseClass _this_, String _value_) {
        ((WindPlantReactiveControlIEC) _this_).setTwpufiltq(_value_);
    }

    private static String twpufiltqToString(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).twpufiltqToString();
    }

    /**
     * Lead time constant in reference value transfer function (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;xft&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0). It is a project-dependent parameter.
     */
    private Double txft; // Seconds

    public Double getTxft() {
        return txft;
    }

    public void setTxft(Double _value_) {
        txft = _value_;
    }

    public void setTxft(String _value_) {
        txft = getDoubleFromString(_value_);
    }

    public String txftToString() {
        return txft != null ? txft.toString() : null;
    }

    private static void setTxft(BaseClass _this_, String _value_) {
        ((WindPlantReactiveControlIEC) _this_).setTxft(_value_);
    }

    private static String txftToString(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).txftToString();
    }

    /**
     * Lag time constant in reference value transfer function (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;xfv&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0). It is a project-dependent parameter.
     */
    private Double txfv; // Seconds

    public Double getTxfv() {
        return txfv;
    }

    public void setTxfv(Double _value_) {
        txfv = _value_;
    }

    public void setTxfv(String _value_) {
        txfv = getDoubleFromString(_value_);
    }

    public String txfvToString() {
        return txfv != null ? txfv.toString() : null;
    }

    private static void setTxfv(BaseClass _this_, String _value_) {
        ((WindPlantReactiveControlIEC) _this_).setTxfv(_value_);
    }

    private static String txfvToString(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).txfvToString();
    }

    /**
     * Voltage threshold for UVRT detection in Q control (&lt;i&gt;u&lt;/i&gt;&lt;i&gt;&lt;sub&gt;WPqdip&lt;/sub&gt;&lt;/i&gt;). It is a project-dependent parameter.
     */
    private Double uwpqdip; // PU

    public Double getUwpqdip() {
        return uwpqdip;
    }

    public void setUwpqdip(Double _value_) {
        uwpqdip = _value_;
    }

    public void setUwpqdip(String _value_) {
        uwpqdip = getDoubleFromString(_value_);
    }

    public String uwpqdipToString() {
        return uwpqdip != null ? uwpqdip.toString() : null;
    }

    private static void setUwpqdip(BaseClass _this_, String _value_) {
        ((WindPlantReactiveControlIEC) _this_).setUwpqdip(_value_);
    }

    private static String uwpqdipToString(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).uwpqdipToString();
    }

    /**
     * Reactive power/voltage controller mode (&lt;i&gt;M&lt;/i&gt;&lt;i&gt;&lt;sub&gt;WPqmode&lt;/sub&gt;&lt;/i&gt;). It is a case-dependent parameter.
     */
    private String windPlantQcontrolModesType; // WindPlantQcontrolModeKind

    public String getWindPlantQcontrolModesType() {
        return windPlantQcontrolModesType;
    }

    public void setWindPlantQcontrolModesType(String _value_) {
        windPlantQcontrolModesType = _value_;
    }

    public String windPlantQcontrolModesTypeToString() {
        return windPlantQcontrolModesType;
    }

    private static void setWindPlantQcontrolModesType(BaseClass _this_, String _value_) {
        ((WindPlantReactiveControlIEC) _this_).setWindPlantQcontrolModesType(_value_);
    }

    private static String windPlantQcontrolModesTypeToString(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).windPlantQcontrolModesTypeToString();
    }

    /**
     * Maximum &lt;i&gt;x&lt;/i&gt;&lt;sub&gt;WTref&lt;/sub&gt; (&lt;i&gt;q&lt;/i&gt;&lt;i&gt;&lt;sub&gt;WTref&lt;/sub&gt;&lt;/i&gt; or delta&lt;i&gt; u&lt;/i&gt;&lt;i&gt;&lt;sub&gt;WTref&lt;/sub&gt;&lt;/i&gt;) request from the plant controller (&lt;i&gt;x&lt;/i&gt;&lt;i&gt;&lt;sub&gt;refmax&lt;/sub&gt;&lt;/i&gt;) (&amp;gt; WindPlantReactiveControlIEC.xrefmin). It is a case-dependent parameter.
     */
    private Double xrefmax; // PU

    public Double getXrefmax() {
        return xrefmax;
    }

    public void setXrefmax(Double _value_) {
        xrefmax = _value_;
    }

    public void setXrefmax(String _value_) {
        xrefmax = getDoubleFromString(_value_);
    }

    public String xrefmaxToString() {
        return xrefmax != null ? xrefmax.toString() : null;
    }

    private static void setXrefmax(BaseClass _this_, String _value_) {
        ((WindPlantReactiveControlIEC) _this_).setXrefmax(_value_);
    }

    private static String xrefmaxToString(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).xrefmaxToString();
    }

    /**
     * Minimum &lt;i&gt;x&lt;/i&gt;&lt;i&gt;&lt;sub&gt;WTref&lt;/sub&gt;&lt;/i&gt; (&lt;i&gt;q&lt;/i&gt;&lt;i&gt;&lt;sub&gt;WTref&lt;/sub&gt;&lt;/i&gt; or delta &lt;i&gt;u&lt;/i&gt;&lt;i&gt;&lt;sub&gt;WTref&lt;/sub&gt;&lt;/i&gt;) request from the plant controller (&lt;i&gt;x&lt;/i&gt;&lt;i&gt;&lt;sub&gt;refmin&lt;/sub&gt;&lt;/i&gt;) (&amp;lt; WindPlantReactiveControlIEC.xrefmax). It is a project-dependent parameter.
     */
    private Double xrefmin; // PU

    public Double getXrefmin() {
        return xrefmin;
    }

    public void setXrefmin(Double _value_) {
        xrefmin = _value_;
    }

    public void setXrefmin(String _value_) {
        xrefmin = getDoubleFromString(_value_);
    }

    public String xrefminToString() {
        return xrefmin != null ? xrefmin.toString() : null;
    }

    private static void setXrefmin(BaseClass _this_, String _value_) {
        ((WindPlantReactiveControlIEC) _this_).setXrefmin(_value_);
    }

    private static String xrefminToString(BaseClass _this_) {
        return ((WindPlantReactiveControlIEC) _this_).xrefminToString();
    }

    /**
     * Get a list of all attribute names of the CIM type.
     *
     * The list includes all inherited attributes. The attribute name is only the
     * last part of the full name (without the class name).
     *
     * @return All attributes of the CIM type
     */
    @Override
    public List<String> getAttributeNames() {
        return ATTR_NAMES_LIST;
    }

    @Override
    protected Map<String, AttrDetails> allAttrDetailsMap() {
        Map<String, AttrDetails> map = new LinkedHashMap<>(CLASS_ATTR_DETAILS_MAP);
        map.putAll(super.allAttrDetailsMap());
        return map;
    }

    /**
     * Get the full name of an attribute.
     *
     * The full name is "<class_name>.<attribute_name>".
     *
     * @param attrName The attribute name
     * @return         The full name
     */
    @Override
    public String getAttributeFullName(String attrName) {
        return ATTR_DETAILS_MAP.containsKey(attrName) ? ATTR_DETAILS_MAP.get(attrName).fullName : null;
    }

    /**
     * Get an attribute value as string.
     *
     * @param attrName The attribute name
     * @return         The attribute value
     */
    @Override
    public String getAttribute(String attrName) {
        if (ATTR_DETAILS_MAP.containsKey(attrName)) {
            var getterFunction = ATTR_DETAILS_MAP.get(attrName).getter;
            return getterFunction.apply(this);
        }
        LOG.error(String.format("No-one knows an attribute %s.%s", "WindPlantReactiveControlIEC", attrName));
        return "";
    }

    /**
     * Set an attribute value as object (for class and list attributes).
     *
     * @param attrName    The attribute name
     * @param objectValue The attribute value as object
     */
    @Override
    public void setAttribute(String attrName, BaseClass objectValue) {
        if (ATTR_DETAILS_MAP.containsKey(attrName)) {
            var setterFunction = ATTR_DETAILS_MAP.get(attrName).objectSetter;
            setterFunction.accept(this, objectValue);
        } else {
            LOG.error(String.format("No-one knows what to do with attribute %s.%s and value %s",
                "WindPlantReactiveControlIEC", attrName, objectValue));
        }
    }

    /**
     * Set an attribute value as string (for primitive (including datatype) and enum attributes).
     *
     * @param attrName    The attribute name
     * @param stringValue The attribute value as string
     */
    @Override
    public void setAttribute(String attrName, String stringValue) {
        if (ATTR_DETAILS_MAP.containsKey(attrName)) {
            var setterFunction = ATTR_DETAILS_MAP.get(attrName).stringSetter;
            setterFunction.accept(this, stringValue);
        } else {
            LOG.error(String.format("No-one knows what to do with attribute %s.%s and value %s",
                "WindPlantReactiveControlIEC", attrName, stringValue));
        }
    }

    /**
     * Check if the attribute is a primitive attribute.
     *
     * This includes datatype_attributes.
     *
     * @param attrName The attribute name
     * @return         Is it a primitive attribute?
     */
    @Override
    public boolean isPrimitiveAttribute(String attrName) {
        return ATTR_DETAILS_MAP.containsKey(attrName) && ATTR_DETAILS_MAP.get(attrName).isPrimitive;
    }

    /**
     * Check if the attribute is an enum attribute.
     *
     * @param attrName The attribute name
     * @return         Is it an enum attribute?
     */
    @Override
    public boolean isEnumAttribute(String attrName) {
        return ATTR_DETAILS_MAP.containsKey(attrName) && ATTR_DETAILS_MAP.get(attrName).isEnum;
    }

    /**
     * Check if the attribute is used.
     *
     * Some attributes are declared as unused in the CGMES definition. In most cases
     * these are list attributes, i.e. lists of links to other CIM objects. But
     * there are some exceptions, e.g. the list of ToplogicalNodes in
     * TopologicalIsland.
     *
     * @param attrName The attribute name
     * @return         Is the attribute used?
     */
    @Override
    public boolean isUsedAttribute(String attrName) {
        return ATTR_DETAILS_MAP.containsKey(attrName) && ATTR_DETAILS_MAP.get(attrName).isUsed;
    }

    /**
     * Get the namespace URL of an object of this class.
     *
     * @return The namespace URL
     */
    @Override
    public String getClassNamespaceUrl() {
        return CLASS_NAMESPACE;
    }

    /**
     * Get the namespace URL of an attribute (also for inherited attributes).
     *
     * @return The namespace URL
     */
    @Override
    public String getAttributeNamespaceUrl(String attrName) {
        return ATTR_DETAILS_MAP.containsKey(attrName) ? ATTR_DETAILS_MAP.get(attrName).nameSpace : null;
    }

    /**
     * A resource can be used by multiple profiles. This is the set of profiles
     * where this element can be found.
     *
     * @return All possible profiles for an object of this class
     */
    @Override
    public Set<CGMESProfile> getPossibleProfiles() {
        return POSSIBLE_PROFILES;
    }

    /**
     * This is the profile with most of the attributes.
     * It should be used to write the data to as few as possible files.
     *
     * @return The recommended profiles for an object of this class
     */
    @Override
    public CGMESProfile getRecommendedProfile() {
        return RECOMMENDED_PROFILE;
    }

    /**
     * Get the possible profiles of an attribute (also for inherited attributes).
     *
     * @return All possible profiles for an attribute
     */
    @Override
    public Set<CGMESProfile> getPossibleAttributeProfiles(String attrName) {
        return ATTR_DETAILS_MAP.containsKey(attrName) ? ATTR_DETAILS_MAP.get(attrName).profiles : null;
    }

    /**
     * Get the possible profiles for an object of this class including the possible
     * profiles of all direct or inherited attributes.
     *
     * A resource can be used by multiple profiles. This is the set of profiles
     * where this element or an attribute of this element can be found.
     *
     * @return All possible profiles for an object of this class and its attributes
     */
    @Override
    public Set<CGMESProfile> getPossibleProfilesIncludingAttributes() {
        return POSSIBLE_PROFILES_INCLUDING_ATTRIBUTES;
    }

    /**
     * Private infos.
     */

    private static final String CLASS_NAMESPACE = "http://iec.ch/TC57/CIM100#";

    private static final List<String> ATTR_NAMES_LIST;
    private static final Map<String, AttrDetails> ATTR_DETAILS_MAP;
    private static final Map<String, AttrDetails> CLASS_ATTR_DETAILS_MAP;
    static {
        Map<String, AttrDetails> map = new LinkedHashMap<>();
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindDynamicsLookupTable", new AttrDetails("WindPlantReactiveControlIEC.WindDynamicsLookupTable", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, WindPlantReactiveControlIEC::WindDynamicsLookupTableToString, WindPlantReactiveControlIEC::setWindDynamicsLookupTable, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindPlantIEC", new AttrDetails("WindPlantReactiveControlIEC.WindPlantIEC", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, WindPlantReactiveControlIEC::WindPlantIECToString, WindPlantReactiveControlIEC::setWindPlantIEC, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dxrefmax", new AttrDetails("WindPlantReactiveControlIEC.dxrefmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPlantReactiveControlIEC::dxrefmaxToString, null, WindPlantReactiveControlIEC::setDxrefmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dxrefmin", new AttrDetails("WindPlantReactiveControlIEC.dxrefmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPlantReactiveControlIEC::dxrefminToString, null, WindPlantReactiveControlIEC::setDxrefmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kiwpx", new AttrDetails("WindPlantReactiveControlIEC.kiwpx", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPlantReactiveControlIEC::kiwpxToString, null, WindPlantReactiveControlIEC::setKiwpx));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kiwpxmax", new AttrDetails("WindPlantReactiveControlIEC.kiwpxmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPlantReactiveControlIEC::kiwpxmaxToString, null, WindPlantReactiveControlIEC::setKiwpxmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kiwpxmin", new AttrDetails("WindPlantReactiveControlIEC.kiwpxmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPlantReactiveControlIEC::kiwpxminToString, null, WindPlantReactiveControlIEC::setKiwpxmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpwpx", new AttrDetails("WindPlantReactiveControlIEC.kpwpx", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPlantReactiveControlIEC::kpwpxToString, null, WindPlantReactiveControlIEC::setKpwpx));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kwpqref", new AttrDetails("WindPlantReactiveControlIEC.kwpqref", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPlantReactiveControlIEC::kwpqrefToString, null, WindPlantReactiveControlIEC::setKwpqref));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kwpqu", new AttrDetails("WindPlantReactiveControlIEC.kwpqu", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPlantReactiveControlIEC::kwpquToString, null, WindPlantReactiveControlIEC::setKwpqu));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tuqfilt", new AttrDetails("WindPlantReactiveControlIEC.tuqfilt", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPlantReactiveControlIEC::tuqfiltToString, null, WindPlantReactiveControlIEC::setTuqfilt));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("twppfiltq", new AttrDetails("WindPlantReactiveControlIEC.twppfiltq", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPlantReactiveControlIEC::twppfiltqToString, null, WindPlantReactiveControlIEC::setTwppfiltq));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("twpqfiltq", new AttrDetails("WindPlantReactiveControlIEC.twpqfiltq", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPlantReactiveControlIEC::twpqfiltqToString, null, WindPlantReactiveControlIEC::setTwpqfiltq));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("twpufiltq", new AttrDetails("WindPlantReactiveControlIEC.twpufiltq", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPlantReactiveControlIEC::twpufiltqToString, null, WindPlantReactiveControlIEC::setTwpufiltq));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("txft", new AttrDetails("WindPlantReactiveControlIEC.txft", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPlantReactiveControlIEC::txftToString, null, WindPlantReactiveControlIEC::setTxft));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("txfv", new AttrDetails("WindPlantReactiveControlIEC.txfv", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPlantReactiveControlIEC::txfvToString, null, WindPlantReactiveControlIEC::setTxfv));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("uwpqdip", new AttrDetails("WindPlantReactiveControlIEC.uwpqdip", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPlantReactiveControlIEC::uwpqdipToString, null, WindPlantReactiveControlIEC::setUwpqdip));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("windPlantQcontrolModesType", new AttrDetails("WindPlantReactiveControlIEC.windPlantQcontrolModesType", true, "http://iec.ch/TC57/CIM100#", profiles, false, true, WindPlantReactiveControlIEC::windPlantQcontrolModesTypeToString, null, WindPlantReactiveControlIEC::setWindPlantQcontrolModesType));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xrefmax", new AttrDetails("WindPlantReactiveControlIEC.xrefmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPlantReactiveControlIEC::xrefmaxToString, null, WindPlantReactiveControlIEC::setXrefmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xrefmin", new AttrDetails("WindPlantReactiveControlIEC.xrefmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPlantReactiveControlIEC::xrefminToString, null, WindPlantReactiveControlIEC::setXrefmin));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new WindPlantReactiveControlIEC().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.DY);
        POSSIBLE_PROFILES = Collections.unmodifiableSet(profiles);
    }

    private static final CGMESProfile RECOMMENDED_PROFILE = CGMESProfile.DY;

    private static final Set<CGMESProfile> POSSIBLE_PROFILES_INCLUDING_ATTRIBUTES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>(POSSIBLE_PROFILES);
        for (var attrDetails : ATTR_DETAILS_MAP.values()) {
            profiles.addAll(attrDetails.profiles);
        }
        POSSIBLE_PROFILES_INCLUDING_ATTRIBUTES = Collections.unmodifiableSet(profiles);
    }
}
