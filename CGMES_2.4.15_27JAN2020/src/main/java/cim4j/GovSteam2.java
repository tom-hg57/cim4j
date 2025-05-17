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
 * Simplified governor model.
 */
@SuppressWarnings("unused")
public class GovSteam2 extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovSteam2.class);

    /**
     * Default constructor.
     */
    public GovSteam2() {
        setCimType("GovSteam2");
    }

    /**
     * Frequency dead band (DBF).  Typical Value = 0.
     */
    private Double dbf; // PU

    public Double getDbf() {
        return dbf;
    }

    public void setDbf(Double _value_) {
        dbf = _value_;
    }

    public void setDbf(String _value_) {
        dbf = getDoubleFromString(_value_);
    }

    public String dbfToString() {
        return dbf != null ? dbf.toString() : null;
    }

    private static void setDbf(BaseClass _this_, String _value_) {
        ((GovSteam2) _this_).setDbf(_value_);
    }

    private static String dbfToString(BaseClass _this_) {
        return ((GovSteam2) _this_).dbfToString();
    }

    /**
     * Governor gain (reciprocal of droop) (K).  Typical Value = 20.
     */
    private Double k; // Simple_Float

    public Double getK() {
        return k;
    }

    public void setK(Double _value_) {
        k = _value_;
    }

    public void setK(String _value_) {
        k = getDoubleFromString(_value_);
    }

    public String kToString() {
        return k != null ? k.toString() : null;
    }

    private static void setK(BaseClass _this_, String _value_) {
        ((GovSteam2) _this_).setK(_value_);
    }

    private static String kToString(BaseClass _this_) {
        return ((GovSteam2) _this_).kToString();
    }

    /**
     * Fuel flow maximum negative error value (MN).  Typical Value = -1.
     */
    private Double mnef; // PU

    public Double getMnef() {
        return mnef;
    }

    public void setMnef(Double _value_) {
        mnef = _value_;
    }

    public void setMnef(String _value_) {
        mnef = getDoubleFromString(_value_);
    }

    public String mnefToString() {
        return mnef != null ? mnef.toString() : null;
    }

    private static void setMnef(BaseClass _this_, String _value_) {
        ((GovSteam2) _this_).setMnef(_value_);
    }

    private static String mnefToString(BaseClass _this_) {
        return ((GovSteam2) _this_).mnefToString();
    }

    /**
     * Fuel flow maximum positive error value (MX).  Typical Value = 1.
     */
    private Double mxef; // PU

    public Double getMxef() {
        return mxef;
    }

    public void setMxef(Double _value_) {
        mxef = _value_;
    }

    public void setMxef(String _value_) {
        mxef = getDoubleFromString(_value_);
    }

    public String mxefToString() {
        return mxef != null ? mxef.toString() : null;
    }

    private static void setMxef(BaseClass _this_, String _value_) {
        ((GovSteam2) _this_).setMxef(_value_);
    }

    private static String mxefToString(BaseClass _this_) {
        return ((GovSteam2) _this_).mxefToString();
    }

    /**
     * Maximum fuel flow (P).  Typical Value = 1.
     */
    private Double pmax; // PU

    public Double getPmax() {
        return pmax;
    }

    public void setPmax(Double _value_) {
        pmax = _value_;
    }

    public void setPmax(String _value_) {
        pmax = getDoubleFromString(_value_);
    }

    public String pmaxToString() {
        return pmax != null ? pmax.toString() : null;
    }

    private static void setPmax(BaseClass _this_, String _value_) {
        ((GovSteam2) _this_).setPmax(_value_);
    }

    private static String pmaxToString(BaseClass _this_) {
        return ((GovSteam2) _this_).pmaxToString();
    }

    /**
     * Minimum fuel flow (P).  Typical Value = 0.
     */
    private Double pmin; // PU

    public Double getPmin() {
        return pmin;
    }

    public void setPmin(Double _value_) {
        pmin = _value_;
    }

    public void setPmin(String _value_) {
        pmin = getDoubleFromString(_value_);
    }

    public String pminToString() {
        return pmin != null ? pmin.toString() : null;
    }

    private static void setPmin(BaseClass _this_, String _value_) {
        ((GovSteam2) _this_).setPmin(_value_);
    }

    private static String pminToString(BaseClass _this_) {
        return ((GovSteam2) _this_).pminToString();
    }

    /**
     * Governor lag time constant (T) (&gt;0).  Typical Value = 0.45.
     */
    private Double t1; // Seconds

    public Double getT1() {
        return t1;
    }

    public void setT1(Double _value_) {
        t1 = _value_;
    }

    public void setT1(String _value_) {
        t1 = getDoubleFromString(_value_);
    }

    public String t1ToString() {
        return t1 != null ? t1.toString() : null;
    }

    private static void setT1(BaseClass _this_, String _value_) {
        ((GovSteam2) _this_).setT1(_value_);
    }

    private static String t1ToString(BaseClass _this_) {
        return ((GovSteam2) _this_).t1ToString();
    }

    /**
     * Governor lead time constant (T) (may be 0).  Typical Value = 0.
     */
    private Double t2; // Seconds

    public Double getT2() {
        return t2;
    }

    public void setT2(Double _value_) {
        t2 = _value_;
    }

    public void setT2(String _value_) {
        t2 = getDoubleFromString(_value_);
    }

    public String t2ToString() {
        return t2 != null ? t2.toString() : null;
    }

    private static void setT2(BaseClass _this_, String _value_) {
        ((GovSteam2) _this_).setT2(_value_);
    }

    private static String t2ToString(BaseClass _this_) {
        return ((GovSteam2) _this_).t2ToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "GovSteam2", attrName));
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
                "GovSteam2", attrName, objectValue));
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
                "GovSteam2", attrName, stringValue));
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

    private static final String CLASS_NAMESPACE = "http://iec.ch/TC57/2013/CIM-schema-cim16#";

    private static final List<String> ATTR_NAMES_LIST;
    private static final Map<String, AttrDetails> ATTR_DETAILS_MAP;
    private static final Map<String, AttrDetails> CLASS_ATTR_DETAILS_MAP;
    static {
        Map<String, AttrDetails> map = new LinkedHashMap<>();
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dbf", new AttrDetails("GovSteam2.dbf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam2::dbfToString, null, GovSteam2::setDbf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k", new AttrDetails("GovSteam2.k", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam2::kToString, null, GovSteam2::setK));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mnef", new AttrDetails("GovSteam2.mnef", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam2::mnefToString, null, GovSteam2::setMnef));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mxef", new AttrDetails("GovSteam2.mxef", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam2::mxefToString, null, GovSteam2::setMxef));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmax", new AttrDetails("GovSteam2.pmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam2::pmaxToString, null, GovSteam2::setPmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmin", new AttrDetails("GovSteam2.pmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam2::pminToString, null, GovSteam2::setPmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t1", new AttrDetails("GovSteam2.t1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam2::t1ToString, null, GovSteam2::setT1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t2", new AttrDetails("GovSteam2.t2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam2::t2ToString, null, GovSteam2::setT2));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new GovSteam2().allAttrDetailsMap());
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
