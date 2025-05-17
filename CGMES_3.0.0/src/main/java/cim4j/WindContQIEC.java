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
 * Q control model. Reference: IEC 61400-27-1:2015, 5.6.5.7.
 */
@SuppressWarnings("unused")
public class WindContQIEC extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(WindContQIEC.class);

    /**
     * Default constructor.
     */
    public WindContQIEC() {
        setCimType("WindContQIEC");
    }

    /**
     * Wind turbine type 3 or type 4 model with which this reactive control model is associated.
     *
     * NOT USED
     */
    private WindTurbineType3or4IEC WindTurbineType3or4IEC; // OneToOne

    public WindTurbineType3or4IEC getWindTurbineType3or4IEC() {
        return WindTurbineType3or4IEC;
    }

    public void setWindTurbineType3or4IEC(BaseClass _object_) {
        if (!(_object_ instanceof WindTurbineType3or4IEC)) {
            throw new IllegalArgumentException("Object is not WindTurbineType3or4IEC");
        }
        if (WindTurbineType3or4IEC != _object_) {
            WindTurbineType3or4IEC = (WindTurbineType3or4IEC) _object_;
            WindTurbineType3or4IEC.setWIndContQIEC(this);
        }
    }

    public String WindTurbineType3or4IECToString() {
        return WindTurbineType3or4IEC != null ? WindTurbineType3or4IEC.getRdfid() : null;
    }

    private static void setWindTurbineType3or4IEC(BaseClass _this_, BaseClass _object_) {
        ((WindContQIEC) _this_).setWindTurbineType3or4IEC(_object_);
    }

    private static String WindTurbineType3or4IECToString(BaseClass _this_) {
        return ((WindContQIEC) _this_).WindTurbineType3or4IECToString();
    }

    /**
     * Maximum reactive current injection during dip (&lt;i&gt;i&lt;/i&gt;&lt;i&gt;&lt;sub&gt;qh1&lt;/sub&gt;&lt;/i&gt;). It is a type-dependent parameter.
     */
    private Double iqh1; // PU

    public Double getIqh1() {
        return iqh1;
    }

    public void setIqh1(Double _value_) {
        iqh1 = _value_;
    }

    public void setIqh1(String _value_) {
        iqh1 = getDoubleFromString(_value_);
    }

    public String iqh1ToString() {
        return iqh1 != null ? iqh1.toString() : null;
    }

    private static void setIqh1(BaseClass _this_, String _value_) {
        ((WindContQIEC) _this_).setIqh1(_value_);
    }

    private static String iqh1ToString(BaseClass _this_) {
        return ((WindContQIEC) _this_).iqh1ToString();
    }

    /**
     * Maximum reactive current injection (&lt;i&gt;i&lt;/i&gt;&lt;i&gt;&lt;sub&gt;qmax&lt;/sub&gt;&lt;/i&gt;) (&amp;gt; WindContQIEC.iqmin). It is a type-dependent parameter.
     */
    private Double iqmax; // PU

    public Double getIqmax() {
        return iqmax;
    }

    public void setIqmax(Double _value_) {
        iqmax = _value_;
    }

    public void setIqmax(String _value_) {
        iqmax = getDoubleFromString(_value_);
    }

    public String iqmaxToString() {
        return iqmax != null ? iqmax.toString() : null;
    }

    private static void setIqmax(BaseClass _this_, String _value_) {
        ((WindContQIEC) _this_).setIqmax(_value_);
    }

    private static String iqmaxToString(BaseClass _this_) {
        return ((WindContQIEC) _this_).iqmaxToString();
    }

    /**
     * Minimum reactive current injection (&lt;i&gt;i&lt;/i&gt;&lt;i&gt;&lt;sub&gt;qmin&lt;/sub&gt;&lt;/i&gt;) (&amp;lt; WindContQIEC.iqmax). It is a type-dependent parameter.
     */
    private Double iqmin; // PU

    public Double getIqmin() {
        return iqmin;
    }

    public void setIqmin(Double _value_) {
        iqmin = _value_;
    }

    public void setIqmin(String _value_) {
        iqmin = getDoubleFromString(_value_);
    }

    public String iqminToString() {
        return iqmin != null ? iqmin.toString() : null;
    }

    private static void setIqmin(BaseClass _this_, String _value_) {
        ((WindContQIEC) _this_).setIqmin(_value_);
    }

    private static String iqminToString(BaseClass _this_) {
        return ((WindContQIEC) _this_).iqminToString();
    }

    /**
     * Post fault reactive current injection (&lt;i&gt;i&lt;/i&gt;&lt;i&gt;&lt;sub&gt;qpost&lt;/sub&gt;&lt;/i&gt;). It is a project-dependent parameter.
     */
    private Double iqpost; // PU

    public Double getIqpost() {
        return iqpost;
    }

    public void setIqpost(Double _value_) {
        iqpost = _value_;
    }

    public void setIqpost(String _value_) {
        iqpost = getDoubleFromString(_value_);
    }

    public String iqpostToString() {
        return iqpost != null ? iqpost.toString() : null;
    }

    private static void setIqpost(BaseClass _this_, String _value_) {
        ((WindContQIEC) _this_).setIqpost(_value_);
    }

    private static String iqpostToString(BaseClass _this_) {
        return ((WindContQIEC) _this_).iqpostToString();
    }

    /**
     * Reactive power PI controller integration gain (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;I,q&lt;/sub&gt;&lt;/i&gt;). It is a type-dependent parameter.
     */
    private Double kiq; // PU

    public Double getKiq() {
        return kiq;
    }

    public void setKiq(Double _value_) {
        kiq = _value_;
    }

    public void setKiq(String _value_) {
        kiq = getDoubleFromString(_value_);
    }

    public String kiqToString() {
        return kiq != null ? kiq.toString() : null;
    }

    private static void setKiq(BaseClass _this_, String _value_) {
        ((WindContQIEC) _this_).setKiq(_value_);
    }

    private static String kiqToString(BaseClass _this_) {
        return ((WindContQIEC) _this_).kiqToString();
    }

    /**
     * Voltage PI controller integration gain (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;I,u&lt;/sub&gt;&lt;/i&gt;). It is a type-dependent parameter.
     */
    private Double kiu; // PU

    public Double getKiu() {
        return kiu;
    }

    public void setKiu(Double _value_) {
        kiu = _value_;
    }

    public void setKiu(String _value_) {
        kiu = getDoubleFromString(_value_);
    }

    public String kiuToString() {
        return kiu != null ? kiu.toString() : null;
    }

    private static void setKiu(BaseClass _this_, String _value_) {
        ((WindContQIEC) _this_).setKiu(_value_);
    }

    private static String kiuToString(BaseClass _this_) {
        return ((WindContQIEC) _this_).kiuToString();
    }

    /**
     * Reactive power PI controller proportional gain (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;P,q&lt;/sub&gt;&lt;/i&gt;). It is a type-dependent parameter.
     */
    private Double kpq; // PU

    public Double getKpq() {
        return kpq;
    }

    public void setKpq(Double _value_) {
        kpq = _value_;
    }

    public void setKpq(String _value_) {
        kpq = getDoubleFromString(_value_);
    }

    public String kpqToString() {
        return kpq != null ? kpq.toString() : null;
    }

    private static void setKpq(BaseClass _this_, String _value_) {
        ((WindContQIEC) _this_).setKpq(_value_);
    }

    private static String kpqToString(BaseClass _this_) {
        return ((WindContQIEC) _this_).kpqToString();
    }

    /**
     * Voltage PI controller proportional gain (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;P,u&lt;/sub&gt;&lt;/i&gt;). It is a type-dependent parameter.
     */
    private Double kpu; // PU

    public Double getKpu() {
        return kpu;
    }

    public void setKpu(Double _value_) {
        kpu = _value_;
    }

    public void setKpu(String _value_) {
        kpu = getDoubleFromString(_value_);
    }

    public String kpuToString() {
        return kpu != null ? kpu.toString() : null;
    }

    private static void setKpu(BaseClass _this_, String _value_) {
        ((WindContQIEC) _this_).setKpu(_value_);
    }

    private static String kpuToString(BaseClass _this_) {
        return ((WindContQIEC) _this_).kpuToString();
    }

    /**
     * Voltage scaling factor for UVRT current (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;qv&lt;/sub&gt;&lt;/i&gt;). It is a project-dependent parameter.
     */
    private Double kqv; // PU

    public Double getKqv() {
        return kqv;
    }

    public void setKqv(Double _value_) {
        kqv = _value_;
    }

    public void setKqv(String _value_) {
        kqv = getDoubleFromString(_value_);
    }

    public String kqvToString() {
        return kqv != null ? kqv.toString() : null;
    }

    private static void setKqv(BaseClass _this_, String _value_) {
        ((WindContQIEC) _this_).setKqv(_value_);
    }

    private static String kqvToString(BaseClass _this_) {
        return ((WindContQIEC) _this_).kqvToString();
    }

    /**
     * Resistive component of voltage drop impedance (&lt;i&gt;r&lt;/i&gt;&lt;i&gt;&lt;sub&gt;droop&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0). It is a project-dependent parameter.
     */
    private Double rdroop; // PU

    public Double getRdroop() {
        return rdroop;
    }

    public void setRdroop(Double _value_) {
        rdroop = _value_;
    }

    public void setRdroop(String _value_) {
        rdroop = getDoubleFromString(_value_);
    }

    public String rdroopToString() {
        return rdroop != null ? rdroop.toString() : null;
    }

    private static void setRdroop(BaseClass _this_, String _value_) {
        ((WindContQIEC) _this_).setRdroop(_value_);
    }

    private static String rdroopToString(BaseClass _this_) {
        return ((WindContQIEC) _this_).rdroopToString();
    }

    /**
     * Power measurement filter time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;pfiltq&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0). It is a type-dependent parameter.
     */
    private Double tpfiltq; // Seconds

    public Double getTpfiltq() {
        return tpfiltq;
    }

    public void setTpfiltq(Double _value_) {
        tpfiltq = _value_;
    }

    public void setTpfiltq(String _value_) {
        tpfiltq = getDoubleFromString(_value_);
    }

    public String tpfiltqToString() {
        return tpfiltq != null ? tpfiltq.toString() : null;
    }

    private static void setTpfiltq(BaseClass _this_, String _value_) {
        ((WindContQIEC) _this_).setTpfiltq(_value_);
    }

    private static String tpfiltqToString(BaseClass _this_) {
        return ((WindContQIEC) _this_).tpfiltqToString();
    }

    /**
     * Length of time period where post fault reactive power is injected (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;post&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0). It is a project-dependent parameter.
     */
    private Double tpost; // Seconds

    public Double getTpost() {
        return tpost;
    }

    public void setTpost(Double _value_) {
        tpost = _value_;
    }

    public void setTpost(String _value_) {
        tpost = getDoubleFromString(_value_);
    }

    public String tpostToString() {
        return tpost != null ? tpost.toString() : null;
    }

    private static void setTpost(BaseClass _this_, String _value_) {
        ((WindContQIEC) _this_).setTpost(_value_);
    }

    private static String tpostToString(BaseClass _this_) {
        return ((WindContQIEC) _this_).tpostToString();
    }

    /**
     * Time constant in reactive power order lag (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;qord&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0). It is a type-dependent parameter.
     */
    private Double tqord; // Seconds

    public Double getTqord() {
        return tqord;
    }

    public void setTqord(Double _value_) {
        tqord = _value_;
    }

    public void setTqord(String _value_) {
        tqord = getDoubleFromString(_value_);
    }

    public String tqordToString() {
        return tqord != null ? tqord.toString() : null;
    }

    private static void setTqord(BaseClass _this_, String _value_) {
        ((WindContQIEC) _this_).setTqord(_value_);
    }

    private static String tqordToString(BaseClass _this_) {
        return ((WindContQIEC) _this_).tqordToString();
    }

    /**
     * Voltage measurement filter time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;ufiltq&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0). It is a type-dependent parameter.
     */
    private Double tufiltq; // Seconds

    public Double getTufiltq() {
        return tufiltq;
    }

    public void setTufiltq(Double _value_) {
        tufiltq = _value_;
    }

    public void setTufiltq(String _value_) {
        tufiltq = getDoubleFromString(_value_);
    }

    public String tufiltqToString() {
        return tufiltq != null ? tufiltq.toString() : null;
    }

    private static void setTufiltq(BaseClass _this_, String _value_) {
        ((WindContQIEC) _this_).setTufiltq(_value_);
    }

    private static String tufiltqToString(BaseClass _this_) {
        return ((WindContQIEC) _this_).tufiltqToString();
    }

    /**
     * Voltage deadband lower limit (&lt;i&gt;u&lt;/i&gt;&lt;i&gt;&lt;sub&gt;db1&lt;/sub&gt;&lt;/i&gt;). It is a type-dependent parameter.
     */
    private Double udb1; // PU

    public Double getUdb1() {
        return udb1;
    }

    public void setUdb1(Double _value_) {
        udb1 = _value_;
    }

    public void setUdb1(String _value_) {
        udb1 = getDoubleFromString(_value_);
    }

    public String udb1ToString() {
        return udb1 != null ? udb1.toString() : null;
    }

    private static void setUdb1(BaseClass _this_, String _value_) {
        ((WindContQIEC) _this_).setUdb1(_value_);
    }

    private static String udb1ToString(BaseClass _this_) {
        return ((WindContQIEC) _this_).udb1ToString();
    }

    /**
     * Voltage deadband upper limit (&lt;i&gt;u&lt;/i&gt;&lt;i&gt;&lt;sub&gt;db2&lt;/sub&gt;&lt;/i&gt;). It is a type-dependent parameter.
     */
    private Double udb2; // PU

    public Double getUdb2() {
        return udb2;
    }

    public void setUdb2(Double _value_) {
        udb2 = _value_;
    }

    public void setUdb2(String _value_) {
        udb2 = getDoubleFromString(_value_);
    }

    public String udb2ToString() {
        return udb2 != null ? udb2.toString() : null;
    }

    private static void setUdb2(BaseClass _this_, String _value_) {
        ((WindContQIEC) _this_).setUdb2(_value_);
    }

    private static String udb2ToString(BaseClass _this_) {
        return ((WindContQIEC) _this_).udb2ToString();
    }

    /**
     * Maximum voltage in voltage PI controller integral term (&lt;i&gt;u&lt;/i&gt;&lt;i&gt;&lt;sub&gt;max&lt;/sub&gt;&lt;/i&gt;) (&amp;gt; WindContQIEC.umin). It is a type-dependent parameter.
     */
    private Double umax; // PU

    public Double getUmax() {
        return umax;
    }

    public void setUmax(Double _value_) {
        umax = _value_;
    }

    public void setUmax(String _value_) {
        umax = getDoubleFromString(_value_);
    }

    public String umaxToString() {
        return umax != null ? umax.toString() : null;
    }

    private static void setUmax(BaseClass _this_, String _value_) {
        ((WindContQIEC) _this_).setUmax(_value_);
    }

    private static String umaxToString(BaseClass _this_) {
        return ((WindContQIEC) _this_).umaxToString();
    }

    /**
     * Minimum voltage in voltage PI controller integral term (&lt;i&gt;u&lt;/i&gt;&lt;i&gt;&lt;sub&gt;min&lt;/sub&gt;&lt;/i&gt;) (&amp;lt; WindContQIEC.umax). It is a type-dependent parameter.
     */
    private Double umin; // PU

    public Double getUmin() {
        return umin;
    }

    public void setUmin(Double _value_) {
        umin = _value_;
    }

    public void setUmin(String _value_) {
        umin = getDoubleFromString(_value_);
    }

    public String uminToString() {
        return umin != null ? umin.toString() : null;
    }

    private static void setUmin(BaseClass _this_, String _value_) {
        ((WindContQIEC) _this_).setUmin(_value_);
    }

    private static String uminToString(BaseClass _this_) {
        return ((WindContQIEC) _this_).uminToString();
    }

    /**
     * Voltage threshold for UVRT detection in Q control (&lt;i&gt;u&lt;/i&gt;&lt;i&gt;&lt;sub&gt;qdip&lt;/sub&gt;&lt;/i&gt;). It is a type-dependent parameter.
     */
    private Double uqdip; // PU

    public Double getUqdip() {
        return uqdip;
    }

    public void setUqdip(Double _value_) {
        uqdip = _value_;
    }

    public void setUqdip(String _value_) {
        uqdip = getDoubleFromString(_value_);
    }

    public String uqdipToString() {
        return uqdip != null ? uqdip.toString() : null;
    }

    private static void setUqdip(BaseClass _this_, String _value_) {
        ((WindContQIEC) _this_).setUqdip(_value_);
    }

    private static String uqdipToString(BaseClass _this_) {
        return ((WindContQIEC) _this_).uqdipToString();
    }

    /**
     * User-defined bias in voltage reference (&lt;i&gt;u&lt;/i&gt;&lt;i&gt;&lt;sub&gt;ref0&lt;/sub&gt;&lt;/i&gt;). It is a case-dependent parameter.
     */
    private Double uref0; // PU

    public Double getUref0() {
        return uref0;
    }

    public void setUref0(Double _value_) {
        uref0 = _value_;
    }

    public void setUref0(String _value_) {
        uref0 = getDoubleFromString(_value_);
    }

    public String uref0ToString() {
        return uref0 != null ? uref0.toString() : null;
    }

    private static void setUref0(BaseClass _this_, String _value_) {
        ((WindContQIEC) _this_).setUref0(_value_);
    }

    private static String uref0ToString(BaseClass _this_) {
        return ((WindContQIEC) _this_).uref0ToString();
    }

    /**
     * Types of general wind turbine Q control modes (&lt;i&gt;M&lt;/i&gt;&lt;i&gt;&lt;sub&gt;qG&lt;/sub&gt;&lt;/i&gt;).  It is a project-dependent parameter.
     */
    private String windQcontrolModesType; // WindQcontrolModeKind

    public String getWindQcontrolModesType() {
        return windQcontrolModesType;
    }

    public void setWindQcontrolModesType(String _value_) {
        windQcontrolModesType = _value_;
    }

    public String windQcontrolModesTypeToString() {
        return windQcontrolModesType;
    }

    private static void setWindQcontrolModesType(BaseClass _this_, String _value_) {
        ((WindContQIEC) _this_).setWindQcontrolModesType(_value_);
    }

    private static String windQcontrolModesTypeToString(BaseClass _this_) {
        return ((WindContQIEC) _this_).windQcontrolModesTypeToString();
    }

    /**
     * Types of UVRT Q control modes (&lt;i&gt;M&lt;/i&gt;&lt;i&gt;&lt;sub&gt;qUVRT&lt;/sub&gt;&lt;/i&gt;). It is a project-dependent parameter.
     */
    private String windUVRTQcontrolModesType; // WindUVRTQcontrolModeKind

    public String getWindUVRTQcontrolModesType() {
        return windUVRTQcontrolModesType;
    }

    public void setWindUVRTQcontrolModesType(String _value_) {
        windUVRTQcontrolModesType = _value_;
    }

    public String windUVRTQcontrolModesTypeToString() {
        return windUVRTQcontrolModesType;
    }

    private static void setWindUVRTQcontrolModesType(BaseClass _this_, String _value_) {
        ((WindContQIEC) _this_).setWindUVRTQcontrolModesType(_value_);
    }

    private static String windUVRTQcontrolModesTypeToString(BaseClass _this_) {
        return ((WindContQIEC) _this_).windUVRTQcontrolModesTypeToString();
    }

    /**
     * Inductive component of voltage drop impedance (&lt;i&gt;x&lt;/i&gt;&lt;i&gt;&lt;sub&gt;droop&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0). It is a project-dependent parameter.
     */
    private Double xdroop; // PU

    public Double getXdroop() {
        return xdroop;
    }

    public void setXdroop(Double _value_) {
        xdroop = _value_;
    }

    public void setXdroop(String _value_) {
        xdroop = getDoubleFromString(_value_);
    }

    public String xdroopToString() {
        return xdroop != null ? xdroop.toString() : null;
    }

    private static void setXdroop(BaseClass _this_, String _value_) {
        ((WindContQIEC) _this_).setXdroop(_value_);
    }

    private static String xdroopToString(BaseClass _this_) {
        return ((WindContQIEC) _this_).xdroopToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "WindContQIEC", attrName));
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
                "WindContQIEC", attrName, objectValue));
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
                "WindContQIEC", attrName, stringValue));
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
            map.put("WindTurbineType3or4IEC", new AttrDetails("WindContQIEC.WindTurbineType3or4IEC", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, WindContQIEC::WindTurbineType3or4IECToString, WindContQIEC::setWindTurbineType3or4IEC, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("iqh1", new AttrDetails("WindContQIEC.iqh1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContQIEC::iqh1ToString, null, WindContQIEC::setIqh1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("iqmax", new AttrDetails("WindContQIEC.iqmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContQIEC::iqmaxToString, null, WindContQIEC::setIqmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("iqmin", new AttrDetails("WindContQIEC.iqmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContQIEC::iqminToString, null, WindContQIEC::setIqmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("iqpost", new AttrDetails("WindContQIEC.iqpost", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContQIEC::iqpostToString, null, WindContQIEC::setIqpost));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kiq", new AttrDetails("WindContQIEC.kiq", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContQIEC::kiqToString, null, WindContQIEC::setKiq));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kiu", new AttrDetails("WindContQIEC.kiu", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContQIEC::kiuToString, null, WindContQIEC::setKiu));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpq", new AttrDetails("WindContQIEC.kpq", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContQIEC::kpqToString, null, WindContQIEC::setKpq));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpu", new AttrDetails("WindContQIEC.kpu", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContQIEC::kpuToString, null, WindContQIEC::setKpu));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kqv", new AttrDetails("WindContQIEC.kqv", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContQIEC::kqvToString, null, WindContQIEC::setKqv));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rdroop", new AttrDetails("WindContQIEC.rdroop", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContQIEC::rdroopToString, null, WindContQIEC::setRdroop));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tpfiltq", new AttrDetails("WindContQIEC.tpfiltq", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContQIEC::tpfiltqToString, null, WindContQIEC::setTpfiltq));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tpost", new AttrDetails("WindContQIEC.tpost", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContQIEC::tpostToString, null, WindContQIEC::setTpost));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tqord", new AttrDetails("WindContQIEC.tqord", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContQIEC::tqordToString, null, WindContQIEC::setTqord));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tufiltq", new AttrDetails("WindContQIEC.tufiltq", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContQIEC::tufiltqToString, null, WindContQIEC::setTufiltq));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("udb1", new AttrDetails("WindContQIEC.udb1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContQIEC::udb1ToString, null, WindContQIEC::setUdb1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("udb2", new AttrDetails("WindContQIEC.udb2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContQIEC::udb2ToString, null, WindContQIEC::setUdb2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("umax", new AttrDetails("WindContQIEC.umax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContQIEC::umaxToString, null, WindContQIEC::setUmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("umin", new AttrDetails("WindContQIEC.umin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContQIEC::uminToString, null, WindContQIEC::setUmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("uqdip", new AttrDetails("WindContQIEC.uqdip", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContQIEC::uqdipToString, null, WindContQIEC::setUqdip));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("uref0", new AttrDetails("WindContQIEC.uref0", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContQIEC::uref0ToString, null, WindContQIEC::setUref0));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("windQcontrolModesType", new AttrDetails("WindContQIEC.windQcontrolModesType", true, "http://iec.ch/TC57/CIM100#", profiles, false, true, WindContQIEC::windQcontrolModesTypeToString, null, WindContQIEC::setWindQcontrolModesType));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("windUVRTQcontrolModesType", new AttrDetails("WindContQIEC.windUVRTQcontrolModesType", true, "http://iec.ch/TC57/CIM100#", profiles, false, true, WindContQIEC::windUVRTQcontrolModesTypeToString, null, WindContQIEC::setWindUVRTQcontrolModesType));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xdroop", new AttrDetails("WindContQIEC.xdroop", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindContQIEC::xdroopToString, null, WindContQIEC::setXdroop));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new WindContQIEC().allAttrDetailsMap());
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
