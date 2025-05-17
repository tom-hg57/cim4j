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
 * Power system stabilizer type RQB. This power system stabilizer is intended to be used together with excitation system type ExcRQB, which is primarily used in nuclear or thermal generating units.
 */
@SuppressWarnings("unused")
public class PssRQB extends PowerSystemStabilizerDynamics {

    private static final Logging LOG = Logging.getLogger(PssRQB.class);

    /**
     * Default constructor.
     */
    public PssRQB() {
        setCimType("PssRQB");
    }

    /**
     * Lead lag gain (&lt;i&gt;KDPM&lt;/i&gt;). Typical value = 0,185.
     */
    private Float kdpm; // Float

    public Float getKdpm() {
        return kdpm;
    }

    public void setKdpm(Float _value_) {
        kdpm = _value_;
    }

    public void setKdpm(String _value_) {
        kdpm = getFloatFromString(_value_);
    }

    public String kdpmToString() {
        return kdpm != null ? kdpm.toString() : null;
    }

    private static void setKdpm(BaseClass _this_, String _value_) {
        ((PssRQB) _this_).setKdpm(_value_);
    }

    private static String kdpmToString(BaseClass _this_) {
        return ((PssRQB) _this_).kdpmToString();
    }

    /**
     * Speed input gain (&lt;i&gt;Ki2&lt;/i&gt;). Typical value = 3,43.
     */
    private Float ki2; // Float

    public Float getKi2() {
        return ki2;
    }

    public void setKi2(Float _value_) {
        ki2 = _value_;
    }

    public void setKi2(String _value_) {
        ki2 = getFloatFromString(_value_);
    }

    public String ki2ToString() {
        return ki2 != null ? ki2.toString() : null;
    }

    private static void setKi2(BaseClass _this_, String _value_) {
        ((PssRQB) _this_).setKi2(_value_);
    }

    private static String ki2ToString(BaseClass _this_) {
        return ((PssRQB) _this_).ki2ToString();
    }

    /**
     * Electrical power input gain (&lt;i&gt;Ki3&lt;/i&gt;). Typical value = -11,45.
     */
    private Float ki3; // Float

    public Float getKi3() {
        return ki3;
    }

    public void setKi3(Float _value_) {
        ki3 = _value_;
    }

    public void setKi3(String _value_) {
        ki3 = getFloatFromString(_value_);
    }

    public String ki3ToString() {
        return ki3 != null ? ki3.toString() : null;
    }

    private static void setKi3(BaseClass _this_, String _value_) {
        ((PssRQB) _this_).setKi3(_value_);
    }

    private static String ki3ToString(BaseClass _this_) {
        return ((PssRQB) _this_).ki3ToString();
    }

    /**
     * Mechanical power input gain (&lt;i&gt;Ki4&lt;/i&gt;). Typical value = 11,86.
     */
    private Float ki4; // Float

    public Float getKi4() {
        return ki4;
    }

    public void setKi4(Float _value_) {
        ki4 = _value_;
    }

    public void setKi4(String _value_) {
        ki4 = getFloatFromString(_value_);
    }

    public String ki4ToString() {
        return ki4 != null ? ki4.toString() : null;
    }

    private static void setKi4(BaseClass _this_, String _value_) {
        ((PssRQB) _this_).setKi4(_value_);
    }

    private static String ki4ToString(BaseClass _this_) {
        return ((PssRQB) _this_).ki4ToString();
    }

    /**
     * Speed deadband (&lt;i&gt;SIBV&lt;/i&gt;). Typical value = 0,006.
     */
    private Double sibv; // PU

    public Double getSibv() {
        return sibv;
    }

    public void setSibv(Double _value_) {
        sibv = _value_;
    }

    public void setSibv(String _value_) {
        sibv = getDoubleFromString(_value_);
    }

    public String sibvToString() {
        return sibv != null ? sibv.toString() : null;
    }

    private static void setSibv(BaseClass _this_, String _value_) {
        ((PssRQB) _this_).setSibv(_value_);
    }

    private static String sibvToString(BaseClass _this_) {
        return ((PssRQB) _this_).sibvToString();
    }

    /**
     * Lead lag time constant (&lt;i&gt;T4F&lt;/i&gt;) (&amp;gt;= 0). Typical value = 0,045.
     */
    private Double t4f; // Seconds

    public Double getT4f() {
        return t4f;
    }

    public void setT4f(Double _value_) {
        t4f = _value_;
    }

    public void setT4f(String _value_) {
        t4f = getDoubleFromString(_value_);
    }

    public String t4fToString() {
        return t4f != null ? t4f.toString() : null;
    }

    private static void setT4f(BaseClass _this_, String _value_) {
        ((PssRQB) _this_).setT4f(_value_);
    }

    private static String t4fToString(BaseClass _this_) {
        return ((PssRQB) _this_).t4fToString();
    }

    /**
     * Input time constant (&lt;i&gt;T4M&lt;/i&gt;) (&amp;gt;= 0). Typical value = 5.
     */
    private Double t4m; // Seconds

    public Double getT4m() {
        return t4m;
    }

    public void setT4m(Double _value_) {
        t4m = _value_;
    }

    public void setT4m(String _value_) {
        t4m = getDoubleFromString(_value_);
    }

    public String t4mToString() {
        return t4m != null ? t4m.toString() : null;
    }

    private static void setT4m(BaseClass _this_, String _value_) {
        ((PssRQB) _this_).setT4m(_value_);
    }

    private static String t4mToString(BaseClass _this_) {
        return ((PssRQB) _this_).t4mToString();
    }

    /**
     * Speed time constant (&lt;i&gt;T4MOM&lt;/i&gt;) (&amp;gt;= 0). Typical value = 1,27.
     */
    private Double t4mom; // Seconds

    public Double getT4mom() {
        return t4mom;
    }

    public void setT4mom(Double _value_) {
        t4mom = _value_;
    }

    public void setT4mom(String _value_) {
        t4mom = getDoubleFromString(_value_);
    }

    public String t4momToString() {
        return t4mom != null ? t4mom.toString() : null;
    }

    private static void setT4mom(BaseClass _this_, String _value_) {
        ((PssRQB) _this_).setT4mom(_value_);
    }

    private static String t4momToString(BaseClass _this_) {
        return ((PssRQB) _this_).t4momToString();
    }

    /**
     * Speed delay (&lt;i&gt;TOMD&lt;/i&gt;) (&amp;gt;= 0). Typical value = 0,02.
     */
    private Double tomd; // Seconds

    public Double getTomd() {
        return tomd;
    }

    public void setTomd(Double _value_) {
        tomd = _value_;
    }

    public void setTomd(String _value_) {
        tomd = getDoubleFromString(_value_);
    }

    public String tomdToString() {
        return tomd != null ? tomd.toString() : null;
    }

    private static void setTomd(BaseClass _this_, String _value_) {
        ((PssRQB) _this_).setTomd(_value_);
    }

    private static String tomdToString(BaseClass _this_) {
        return ((PssRQB) _this_).tomdToString();
    }

    /**
     * Speed time constant (&lt;i&gt;TOMSL&lt;/i&gt;) (&amp;gt;= 0). Typical value = 0,04.
     */
    private Double tomsl; // Seconds

    public Double getTomsl() {
        return tomsl;
    }

    public void setTomsl(Double _value_) {
        tomsl = _value_;
    }

    public void setTomsl(String _value_) {
        tomsl = getDoubleFromString(_value_);
    }

    public String tomslToString() {
        return tomsl != null ? tomsl.toString() : null;
    }

    private static void setTomsl(BaseClass _this_, String _value_) {
        ((PssRQB) _this_).setTomsl(_value_);
    }

    private static String tomslToString(BaseClass _this_) {
        return ((PssRQB) _this_).tomslToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "PssRQB", attrName));
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
                "PssRQB", attrName, objectValue));
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
                "PssRQB", attrName, stringValue));
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
            map.put("kdpm", new AttrDetails("PssRQB.kdpm", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssRQB::kdpmToString, null, PssRQB::setKdpm));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ki2", new AttrDetails("PssRQB.ki2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssRQB::ki2ToString, null, PssRQB::setKi2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ki3", new AttrDetails("PssRQB.ki3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssRQB::ki3ToString, null, PssRQB::setKi3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ki4", new AttrDetails("PssRQB.ki4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssRQB::ki4ToString, null, PssRQB::setKi4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("sibv", new AttrDetails("PssRQB.sibv", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssRQB::sibvToString, null, PssRQB::setSibv));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t4f", new AttrDetails("PssRQB.t4f", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssRQB::t4fToString, null, PssRQB::setT4f));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t4m", new AttrDetails("PssRQB.t4m", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssRQB::t4mToString, null, PssRQB::setT4m));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t4mom", new AttrDetails("PssRQB.t4mom", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssRQB::t4momToString, null, PssRQB::setT4mom));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tomd", new AttrDetails("PssRQB.tomd", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssRQB::tomdToString, null, PssRQB::setTomd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tomsl", new AttrDetails("PssRQB.tomsl", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssRQB::tomslToString, null, PssRQB::setTomsl));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new PssRQB().allAttrDetailsMap());
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
