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
 * Simplified type UEL2 underexcitation limiter.  This model can be derived from UnderexcLimIEEE2.  The limit characteristic (look -up table) is a single straight-line, the same as UnderexcLimIEEE2 (see Figure 10.4 (p 32), IEEE 421.5-2005 Section 10.2).
 */
@SuppressWarnings("unused")
public class UnderexcLim2Simplified extends UnderexcitationLimiterDynamics {

    private static final Logging LOG = Logging.getLogger(UnderexcLim2Simplified.class);

    /**
     * Default constructor.
     */
    public UnderexcLim2Simplified() {
        setCimType("UnderexcLim2Simplified");
    }

    /**
     * Gain Under excitation limiter (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;UI&lt;/sub&gt;&lt;/i&gt;).  Typical value = 0,1.
     */
    private Double kui; // PU

    public Double getKui() {
        return kui;
    }

    public void setKui(Double _value_) {
        kui = _value_;
    }

    public void setKui(String _value_) {
        kui = getDoubleFromString(_value_);
    }

    public String kuiToString() {
        return kui != null ? kui.toString() : null;
    }

    private static void setKui(BaseClass _this_, String _value_) {
        ((UnderexcLim2Simplified) _this_).setKui(_value_);
    }

    private static String kuiToString(BaseClass _this_) {
        return ((UnderexcLim2Simplified) _this_).kuiToString();
    }

    /**
     * Segment P initial point (&lt;i&gt;P&lt;/i&gt;&lt;i&gt;&lt;sub&gt;0&lt;/sub&gt;&lt;/i&gt;).  Typical value = 0.
     */
    private Double p0; // PU

    public Double getP0() {
        return p0;
    }

    public void setP0(Double _value_) {
        p0 = _value_;
    }

    public void setP0(String _value_) {
        p0 = getDoubleFromString(_value_);
    }

    public String p0ToString() {
        return p0 != null ? p0.toString() : null;
    }

    private static void setP0(BaseClass _this_, String _value_) {
        ((UnderexcLim2Simplified) _this_).setP0(_value_);
    }

    private static String p0ToString(BaseClass _this_) {
        return ((UnderexcLim2Simplified) _this_).p0ToString();
    }

    /**
     * Segment P end point (&lt;i&gt;P&lt;/i&gt;&lt;i&gt;&lt;sub&gt;1&lt;/sub&gt;&lt;/i&gt;).  Typical value = 1.
     */
    private Double p1; // PU

    public Double getP1() {
        return p1;
    }

    public void setP1(Double _value_) {
        p1 = _value_;
    }

    public void setP1(String _value_) {
        p1 = getDoubleFromString(_value_);
    }

    public String p1ToString() {
        return p1 != null ? p1.toString() : null;
    }

    private static void setP1(BaseClass _this_, String _value_) {
        ((UnderexcLim2Simplified) _this_).setP1(_value_);
    }

    private static String p1ToString(BaseClass _this_) {
        return ((UnderexcLim2Simplified) _this_).p1ToString();
    }

    /**
     * Segment Q initial point (&lt;i&gt;Q&lt;/i&gt;&lt;i&gt;&lt;sub&gt;0&lt;/sub&gt;&lt;/i&gt;).  Typical value = -0,31.
     */
    private Double q0; // PU

    public Double getQ0() {
        return q0;
    }

    public void setQ0(Double _value_) {
        q0 = _value_;
    }

    public void setQ0(String _value_) {
        q0 = getDoubleFromString(_value_);
    }

    public String q0ToString() {
        return q0 != null ? q0.toString() : null;
    }

    private static void setQ0(BaseClass _this_, String _value_) {
        ((UnderexcLim2Simplified) _this_).setQ0(_value_);
    }

    private static String q0ToString(BaseClass _this_) {
        return ((UnderexcLim2Simplified) _this_).q0ToString();
    }

    /**
     * Segment Q end point (&lt;i&gt;Q&lt;/i&gt;&lt;i&gt;&lt;sub&gt;1&lt;/sub&gt;&lt;/i&gt;).  Typical value = -0,1.
     */
    private Double q1; // PU

    public Double getQ1() {
        return q1;
    }

    public void setQ1(Double _value_) {
        q1 = _value_;
    }

    public void setQ1(String _value_) {
        q1 = getDoubleFromString(_value_);
    }

    public String q1ToString() {
        return q1 != null ? q1.toString() : null;
    }

    private static void setQ1(BaseClass _this_, String _value_) {
        ((UnderexcLim2Simplified) _this_).setQ1(_value_);
    }

    private static String q1ToString(BaseClass _this_) {
        return ((UnderexcLim2Simplified) _this_).q1ToString();
    }

    /**
     * Maximum error signal (&lt;i&gt;V&lt;/i&gt;&lt;i&gt;&lt;sub&gt;UIMAX&lt;/sub&gt;&lt;/i&gt;) (&amp;gt; UnderexcLim2Simplified.vuimin).  Typical value = 1.
     */
    private Double vuimax; // PU

    public Double getVuimax() {
        return vuimax;
    }

    public void setVuimax(Double _value_) {
        vuimax = _value_;
    }

    public void setVuimax(String _value_) {
        vuimax = getDoubleFromString(_value_);
    }

    public String vuimaxToString() {
        return vuimax != null ? vuimax.toString() : null;
    }

    private static void setVuimax(BaseClass _this_, String _value_) {
        ((UnderexcLim2Simplified) _this_).setVuimax(_value_);
    }

    private static String vuimaxToString(BaseClass _this_) {
        return ((UnderexcLim2Simplified) _this_).vuimaxToString();
    }

    /**
     * Minimum error signal (&lt;i&gt;V&lt;/i&gt;&lt;i&gt;&lt;sub&gt;UIMIN&lt;/sub&gt;&lt;/i&gt;) (&amp;lt; UnderexcLim2Simplified.vuimax).  Typical value = 0.
     */
    private Double vuimin; // PU

    public Double getVuimin() {
        return vuimin;
    }

    public void setVuimin(Double _value_) {
        vuimin = _value_;
    }

    public void setVuimin(String _value_) {
        vuimin = getDoubleFromString(_value_);
    }

    public String vuiminToString() {
        return vuimin != null ? vuimin.toString() : null;
    }

    private static void setVuimin(BaseClass _this_, String _value_) {
        ((UnderexcLim2Simplified) _this_).setVuimin(_value_);
    }

    private static String vuiminToString(BaseClass _this_) {
        return ((UnderexcLim2Simplified) _this_).vuiminToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "UnderexcLim2Simplified", attrName));
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
                "UnderexcLim2Simplified", attrName, objectValue));
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
                "UnderexcLim2Simplified", attrName, stringValue));
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
            map.put("kui", new AttrDetails("UnderexcLim2Simplified.kui", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, UnderexcLim2Simplified::kuiToString, null, UnderexcLim2Simplified::setKui));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("p0", new AttrDetails("UnderexcLim2Simplified.p0", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, UnderexcLim2Simplified::p0ToString, null, UnderexcLim2Simplified::setP0));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("p1", new AttrDetails("UnderexcLim2Simplified.p1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, UnderexcLim2Simplified::p1ToString, null, UnderexcLim2Simplified::setP1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("q0", new AttrDetails("UnderexcLim2Simplified.q0", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, UnderexcLim2Simplified::q0ToString, null, UnderexcLim2Simplified::setQ0));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("q1", new AttrDetails("UnderexcLim2Simplified.q1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, UnderexcLim2Simplified::q1ToString, null, UnderexcLim2Simplified::setQ1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vuimax", new AttrDetails("UnderexcLim2Simplified.vuimax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, UnderexcLim2Simplified::vuimaxToString, null, UnderexcLim2Simplified::setVuimax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vuimin", new AttrDetails("UnderexcLim2Simplified.vuimin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, UnderexcLim2Simplified::vuiminToString, null, UnderexcLim2Simplified::setVuimin));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new UnderexcLim2Simplified().allAttrDetailsMap());
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
