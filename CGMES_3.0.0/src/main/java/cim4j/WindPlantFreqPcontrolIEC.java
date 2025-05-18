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
 * Frequency and active power controller model. Reference: IEC 61400-27-1:2015, Annex D.
 */
@SuppressWarnings("unused")
public class WindPlantFreqPcontrolIEC extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(WindPlantFreqPcontrolIEC.class);

    /**
     * Constructor.
     */
    public WindPlantFreqPcontrolIEC(String rdfid) {
        super("WindPlantFreqPcontrolIEC", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected WindPlantFreqPcontrolIEC(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * The wind dynamics lookup table associated with this frequency and active power wind plant model.
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
            ((WindDynamicsLookupTable) _object_).setWindPlantFreqPcontrolIEC(this);
        }
    }

    public String WindDynamicsLookupTableToString() {
        return getStringFromSet(WindDynamicsLookupTable);
    }

    private static void setWindDynamicsLookupTable(BaseClass _this_, BaseClass _object_) {
        ((WindPlantFreqPcontrolIEC) _this_).setWindDynamicsLookupTable(_object_);
    }

    private static String WindDynamicsLookupTableToString(BaseClass _this_) {
        return ((WindPlantFreqPcontrolIEC) _this_).WindDynamicsLookupTableToString();
    }

    /**
     * Wind plant model with which this wind plant frequency and active power control is associated.
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
            WindPlantIEC.setWindPlantFreqPcontrolIEC(this);
        }
    }

    public String WindPlantIECToString() {
        return WindPlantIEC != null ? WindPlantIEC.getRdfid() : null;
    }

    private static void setWindPlantIEC(BaseClass _this_, BaseClass _object_) {
        ((WindPlantFreqPcontrolIEC) _this_).setWindPlantIEC(_object_);
    }

    private static String WindPlantIECToString(BaseClass _this_) {
        return ((WindPlantFreqPcontrolIEC) _this_).WindPlantIECToString();
    }

    /**
     * Maximum ramp rate of &lt;i&gt;p&lt;/i&gt;&lt;i&gt;&lt;sub&gt;WTref&lt;/sub&gt;&lt;/i&gt; request from the plant controller to the wind turbines (&lt;i&gt;dp&lt;/i&gt;&lt;i&gt;&lt;sub&gt;refmax&lt;/sub&gt;&lt;/i&gt;) (&amp;gt; WindPlantFreqPcontrolIEC.dprefmin). It is a case-dependent parameter.
     */
    private Double dprefmax; // PU

    public Double getDprefmax() {
        return dprefmax;
    }

    public void setDprefmax(Double _value_) {
        dprefmax = _value_;
    }

    public void setDprefmax(String _value_) {
        dprefmax = getDoubleFromString(_value_);
    }

    public String dprefmaxToString() {
        return dprefmax != null ? dprefmax.toString() : null;
    }

    private static void setDprefmax(BaseClass _this_, String _value_) {
        ((WindPlantFreqPcontrolIEC) _this_).setDprefmax(_value_);
    }

    private static String dprefmaxToString(BaseClass _this_) {
        return ((WindPlantFreqPcontrolIEC) _this_).dprefmaxToString();
    }

    /**
     * Minimum (negative) ramp rate of &lt;i&gt;p&lt;/i&gt;&lt;i&gt;&lt;sub&gt;WTref&lt;/sub&gt;&lt;/i&gt; request from the plant controller to the wind turbines (&lt;i&gt;dp&lt;/i&gt;&lt;i&gt;&lt;sub&gt;refmin&lt;/sub&gt;&lt;/i&gt;) (&amp;lt; WindPlantFreqPcontrolIEC.dprefmax). It is a project-dependent parameter.
     */
    private Double dprefmin; // PU

    public Double getDprefmin() {
        return dprefmin;
    }

    public void setDprefmin(Double _value_) {
        dprefmin = _value_;
    }

    public void setDprefmin(String _value_) {
        dprefmin = getDoubleFromString(_value_);
    }

    public String dprefminToString() {
        return dprefmin != null ? dprefmin.toString() : null;
    }

    private static void setDprefmin(BaseClass _this_, String _value_) {
        ((WindPlantFreqPcontrolIEC) _this_).setDprefmin(_value_);
    }

    private static String dprefminToString(BaseClass _this_) {
        return ((WindPlantFreqPcontrolIEC) _this_).dprefminToString();
    }

    /**
     * Maximum positive ramp rate for wind plant power reference (&lt;i&gt;dp&lt;/i&gt;&lt;i&gt;&lt;sub&gt;WPrefmax&lt;/sub&gt;&lt;/i&gt;) (&amp;gt; WindPlantFreqPcontrolIEC.dpwprefmin). It is a project-dependent parameter.
     */
    private Double dpwprefmax; // PU

    public Double getDpwprefmax() {
        return dpwprefmax;
    }

    public void setDpwprefmax(Double _value_) {
        dpwprefmax = _value_;
    }

    public void setDpwprefmax(String _value_) {
        dpwprefmax = getDoubleFromString(_value_);
    }

    public String dpwprefmaxToString() {
        return dpwprefmax != null ? dpwprefmax.toString() : null;
    }

    private static void setDpwprefmax(BaseClass _this_, String _value_) {
        ((WindPlantFreqPcontrolIEC) _this_).setDpwprefmax(_value_);
    }

    private static String dpwprefmaxToString(BaseClass _this_) {
        return ((WindPlantFreqPcontrolIEC) _this_).dpwprefmaxToString();
    }

    /**
     * Maximum negative ramp rate for wind plant power reference (&lt;i&gt;dp&lt;/i&gt;&lt;i&gt;&lt;sub&gt;WPrefmin&lt;/sub&gt;&lt;/i&gt;) (&amp;lt; WindPlantFreqPcontrolIEC.dpwprefmax). It is a project-dependent parameter.
     */
    private Double dpwprefmin; // PU

    public Double getDpwprefmin() {
        return dpwprefmin;
    }

    public void setDpwprefmin(Double _value_) {
        dpwprefmin = _value_;
    }

    public void setDpwprefmin(String _value_) {
        dpwprefmin = getDoubleFromString(_value_);
    }

    public String dpwprefminToString() {
        return dpwprefmin != null ? dpwprefmin.toString() : null;
    }

    private static void setDpwprefmin(BaseClass _this_, String _value_) {
        ((WindPlantFreqPcontrolIEC) _this_).setDpwprefmin(_value_);
    }

    private static String dpwprefminToString(BaseClass _this_) {
        return ((WindPlantFreqPcontrolIEC) _this_).dpwprefminToString();
    }

    /**
     * Plant P controller integral gain (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;IWPp&lt;/sub&gt;&lt;/i&gt;). It is a project-dependent parameter.
     */
    private Float kiwpp; // Float

    public Float getKiwpp() {
        return kiwpp;
    }

    public void setKiwpp(Float _value_) {
        kiwpp = _value_;
    }

    public void setKiwpp(String _value_) {
        kiwpp = getFloatFromString(_value_);
    }

    public String kiwppToString() {
        return kiwpp != null ? kiwpp.toString() : null;
    }

    private static void setKiwpp(BaseClass _this_, String _value_) {
        ((WindPlantFreqPcontrolIEC) _this_).setKiwpp(_value_);
    }

    private static String kiwppToString(BaseClass _this_) {
        return ((WindPlantFreqPcontrolIEC) _this_).kiwppToString();
    }

    /**
     * Maximum PI integrator term (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;IWPpmax&lt;/sub&gt;&lt;/i&gt;) (&amp;gt; WindPlantFreqPcontrolIEC.kiwppmin). It is a project-dependent parameter.
     */
    private Double kiwppmax; // PU

    public Double getKiwppmax() {
        return kiwppmax;
    }

    public void setKiwppmax(Double _value_) {
        kiwppmax = _value_;
    }

    public void setKiwppmax(String _value_) {
        kiwppmax = getDoubleFromString(_value_);
    }

    public String kiwppmaxToString() {
        return kiwppmax != null ? kiwppmax.toString() : null;
    }

    private static void setKiwppmax(BaseClass _this_, String _value_) {
        ((WindPlantFreqPcontrolIEC) _this_).setKiwppmax(_value_);
    }

    private static String kiwppmaxToString(BaseClass _this_) {
        return ((WindPlantFreqPcontrolIEC) _this_).kiwppmaxToString();
    }

    /**
     * Minimum PI integrator term (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;IWPpmin&lt;/sub&gt;&lt;/i&gt;) (&amp;lt; WindPlantFreqPcontrolIEC.kiwppmax). It is a project-dependent parameter.
     */
    private Double kiwppmin; // PU

    public Double getKiwppmin() {
        return kiwppmin;
    }

    public void setKiwppmin(Double _value_) {
        kiwppmin = _value_;
    }

    public void setKiwppmin(String _value_) {
        kiwppmin = getDoubleFromString(_value_);
    }

    public String kiwppminToString() {
        return kiwppmin != null ? kiwppmin.toString() : null;
    }

    private static void setKiwppmin(BaseClass _this_, String _value_) {
        ((WindPlantFreqPcontrolIEC) _this_).setKiwppmin(_value_);
    }

    private static String kiwppminToString(BaseClass _this_) {
        return ((WindPlantFreqPcontrolIEC) _this_).kiwppminToString();
    }

    /**
     * Plant P controller proportional gain (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;PWPp&lt;/sub&gt;&lt;/i&gt;). It is a project-dependent parameter.
     */
    private Float kpwpp; // Float

    public Float getKpwpp() {
        return kpwpp;
    }

    public void setKpwpp(Float _value_) {
        kpwpp = _value_;
    }

    public void setKpwpp(String _value_) {
        kpwpp = getFloatFromString(_value_);
    }

    public String kpwppToString() {
        return kpwpp != null ? kpwpp.toString() : null;
    }

    private static void setKpwpp(BaseClass _this_, String _value_) {
        ((WindPlantFreqPcontrolIEC) _this_).setKpwpp(_value_);
    }

    private static String kpwppToString(BaseClass _this_) {
        return ((WindPlantFreqPcontrolIEC) _this_).kpwppToString();
    }

    /**
     * Power reference gain (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;WPpref&lt;/sub&gt;&lt;/i&gt;). It is a project-dependent parameter.
     */
    private Double kwppref; // PU

    public Double getKwppref() {
        return kwppref;
    }

    public void setKwppref(Double _value_) {
        kwppref = _value_;
    }

    public void setKwppref(String _value_) {
        kwppref = getDoubleFromString(_value_);
    }

    public String kwpprefToString() {
        return kwppref != null ? kwppref.toString() : null;
    }

    private static void setKwppref(BaseClass _this_, String _value_) {
        ((WindPlantFreqPcontrolIEC) _this_).setKwppref(_value_);
    }

    private static String kwpprefToString(BaseClass _this_) {
        return ((WindPlantFreqPcontrolIEC) _this_).kwpprefToString();
    }

    /**
     * Maximum &lt;i&gt;p&lt;/i&gt;&lt;i&gt;&lt;sub&gt;WTref&lt;/sub&gt;&lt;/i&gt; request from the plant controller to the wind turbines (&lt;i&gt;p&lt;/i&gt;&lt;i&gt;&lt;sub&gt;refmax&lt;/sub&gt;&lt;/i&gt;) (&amp;gt; WindPlantFreqPcontrolIEC.prefmin). It is a project-dependent parameter.
     */
    private Double prefmax; // PU

    public Double getPrefmax() {
        return prefmax;
    }

    public void setPrefmax(Double _value_) {
        prefmax = _value_;
    }

    public void setPrefmax(String _value_) {
        prefmax = getDoubleFromString(_value_);
    }

    public String prefmaxToString() {
        return prefmax != null ? prefmax.toString() : null;
    }

    private static void setPrefmax(BaseClass _this_, String _value_) {
        ((WindPlantFreqPcontrolIEC) _this_).setPrefmax(_value_);
    }

    private static String prefmaxToString(BaseClass _this_) {
        return ((WindPlantFreqPcontrolIEC) _this_).prefmaxToString();
    }

    /**
     * Minimum &lt;i&gt;p&lt;/i&gt;&lt;i&gt;&lt;sub&gt;WTref&lt;/sub&gt;&lt;/i&gt; request from the plant controller to the wind turbines (&lt;i&gt;p&lt;/i&gt;&lt;i&gt;&lt;sub&gt;refmin&lt;/sub&gt;&lt;/i&gt;) (&amp;lt; WindPlantFreqPcontrolIEC.prefmax). It is a project-dependent parameter.
     */
    private Double prefmin; // PU

    public Double getPrefmin() {
        return prefmin;
    }

    public void setPrefmin(Double _value_) {
        prefmin = _value_;
    }

    public void setPrefmin(String _value_) {
        prefmin = getDoubleFromString(_value_);
    }

    public String prefminToString() {
        return prefmin != null ? prefmin.toString() : null;
    }

    private static void setPrefmin(BaseClass _this_, String _value_) {
        ((WindPlantFreqPcontrolIEC) _this_).setPrefmin(_value_);
    }

    private static String prefminToString(BaseClass _this_) {
        return ((WindPlantFreqPcontrolIEC) _this_).prefminToString();
    }

    /**
     * Lead time constant in reference value transfer function (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;pft&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0). It is a project-dependent parameter.
     */
    private Double tpft; // Seconds

    public Double getTpft() {
        return tpft;
    }

    public void setTpft(Double _value_) {
        tpft = _value_;
    }

    public void setTpft(String _value_) {
        tpft = getDoubleFromString(_value_);
    }

    public String tpftToString() {
        return tpft != null ? tpft.toString() : null;
    }

    private static void setTpft(BaseClass _this_, String _value_) {
        ((WindPlantFreqPcontrolIEC) _this_).setTpft(_value_);
    }

    private static String tpftToString(BaseClass _this_) {
        return ((WindPlantFreqPcontrolIEC) _this_).tpftToString();
    }

    /**
     * Lag time constant in reference value transfer function (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;pfv&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0). It is a project-dependent parameter.
     */
    private Double tpfv; // Seconds

    public Double getTpfv() {
        return tpfv;
    }

    public void setTpfv(Double _value_) {
        tpfv = _value_;
    }

    public void setTpfv(String _value_) {
        tpfv = getDoubleFromString(_value_);
    }

    public String tpfvToString() {
        return tpfv != null ? tpfv.toString() : null;
    }

    private static void setTpfv(BaseClass _this_, String _value_) {
        ((WindPlantFreqPcontrolIEC) _this_).setTpfv(_value_);
    }

    private static String tpfvToString(BaseClass _this_) {
        return ((WindPlantFreqPcontrolIEC) _this_).tpfvToString();
    }

    /**
     * Filter time constant for frequency measurement (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;WPffiltp&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0). It is a project-dependent parameter.
     */
    private Double twpffiltp; // Seconds

    public Double getTwpffiltp() {
        return twpffiltp;
    }

    public void setTwpffiltp(Double _value_) {
        twpffiltp = _value_;
    }

    public void setTwpffiltp(String _value_) {
        twpffiltp = getDoubleFromString(_value_);
    }

    public String twpffiltpToString() {
        return twpffiltp != null ? twpffiltp.toString() : null;
    }

    private static void setTwpffiltp(BaseClass _this_, String _value_) {
        ((WindPlantFreqPcontrolIEC) _this_).setTwpffiltp(_value_);
    }

    private static String twpffiltpToString(BaseClass _this_) {
        return ((WindPlantFreqPcontrolIEC) _this_).twpffiltpToString();
    }

    /**
     * Filter time constant for active power measurement (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;WPpfiltp&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0). It is a project-dependent parameter.
     */
    private Double twppfiltp; // Seconds

    public Double getTwppfiltp() {
        return twppfiltp;
    }

    public void setTwppfiltp(Double _value_) {
        twppfiltp = _value_;
    }

    public void setTwppfiltp(String _value_) {
        twppfiltp = getDoubleFromString(_value_);
    }

    public String twppfiltpToString() {
        return twppfiltp != null ? twppfiltp.toString() : null;
    }

    private static void setTwppfiltp(BaseClass _this_, String _value_) {
        ((WindPlantFreqPcontrolIEC) _this_).setTwppfiltp(_value_);
    }

    private static String twppfiltpToString(BaseClass _this_) {
        return ((WindPlantFreqPcontrolIEC) _this_).twppfiltpToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "WindPlantFreqPcontrolIEC", attrName));
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
                "WindPlantFreqPcontrolIEC", attrName, objectValue));
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
                "WindPlantFreqPcontrolIEC", attrName, stringValue));
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
            map.put("WindDynamicsLookupTable", new AttrDetails("WindPlantFreqPcontrolIEC.WindDynamicsLookupTable", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, WindPlantFreqPcontrolIEC::WindDynamicsLookupTableToString, WindPlantFreqPcontrolIEC::setWindDynamicsLookupTable, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindPlantIEC", new AttrDetails("WindPlantFreqPcontrolIEC.WindPlantIEC", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, WindPlantFreqPcontrolIEC::WindPlantIECToString, WindPlantFreqPcontrolIEC::setWindPlantIEC, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dprefmax", new AttrDetails("WindPlantFreqPcontrolIEC.dprefmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPlantFreqPcontrolIEC::dprefmaxToString, null, WindPlantFreqPcontrolIEC::setDprefmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dprefmin", new AttrDetails("WindPlantFreqPcontrolIEC.dprefmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPlantFreqPcontrolIEC::dprefminToString, null, WindPlantFreqPcontrolIEC::setDprefmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dpwprefmax", new AttrDetails("WindPlantFreqPcontrolIEC.dpwprefmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPlantFreqPcontrolIEC::dpwprefmaxToString, null, WindPlantFreqPcontrolIEC::setDpwprefmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dpwprefmin", new AttrDetails("WindPlantFreqPcontrolIEC.dpwprefmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPlantFreqPcontrolIEC::dpwprefminToString, null, WindPlantFreqPcontrolIEC::setDpwprefmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kiwpp", new AttrDetails("WindPlantFreqPcontrolIEC.kiwpp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPlantFreqPcontrolIEC::kiwppToString, null, WindPlantFreqPcontrolIEC::setKiwpp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kiwppmax", new AttrDetails("WindPlantFreqPcontrolIEC.kiwppmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPlantFreqPcontrolIEC::kiwppmaxToString, null, WindPlantFreqPcontrolIEC::setKiwppmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kiwppmin", new AttrDetails("WindPlantFreqPcontrolIEC.kiwppmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPlantFreqPcontrolIEC::kiwppminToString, null, WindPlantFreqPcontrolIEC::setKiwppmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpwpp", new AttrDetails("WindPlantFreqPcontrolIEC.kpwpp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPlantFreqPcontrolIEC::kpwppToString, null, WindPlantFreqPcontrolIEC::setKpwpp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kwppref", new AttrDetails("WindPlantFreqPcontrolIEC.kwppref", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPlantFreqPcontrolIEC::kwpprefToString, null, WindPlantFreqPcontrolIEC::setKwppref));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("prefmax", new AttrDetails("WindPlantFreqPcontrolIEC.prefmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPlantFreqPcontrolIEC::prefmaxToString, null, WindPlantFreqPcontrolIEC::setPrefmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("prefmin", new AttrDetails("WindPlantFreqPcontrolIEC.prefmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPlantFreqPcontrolIEC::prefminToString, null, WindPlantFreqPcontrolIEC::setPrefmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tpft", new AttrDetails("WindPlantFreqPcontrolIEC.tpft", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPlantFreqPcontrolIEC::tpftToString, null, WindPlantFreqPcontrolIEC::setTpft));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tpfv", new AttrDetails("WindPlantFreqPcontrolIEC.tpfv", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPlantFreqPcontrolIEC::tpfvToString, null, WindPlantFreqPcontrolIEC::setTpfv));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("twpffiltp", new AttrDetails("WindPlantFreqPcontrolIEC.twpffiltp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPlantFreqPcontrolIEC::twpffiltpToString, null, WindPlantFreqPcontrolIEC::setTwpffiltp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("twppfiltp", new AttrDetails("WindPlantFreqPcontrolIEC.twppfiltp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindPlantFreqPcontrolIEC::twppfiltpToString, null, WindPlantFreqPcontrolIEC::setTwppfiltp));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new WindPlantFreqPcontrolIEC(null).allAttrDetailsMap());
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
