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
 * IEC Type 3B generator set model.  Reference: IEC Standard 61400-27-1 Section 6.6.3.3.
 */
@SuppressWarnings("unused")
public class WindGenTurbineType3bIEC extends WindGenTurbineType3IEC {

    private static final Logging LOG = Logging.getLogger(WindGenTurbineType3bIEC.class);

    /**
     * Default constructor.
     */
    public WindGenTurbineType3bIEC() {
        setCimType("WindGenTurbineType3bIEC");
    }

    /**
     * Crowbar duration versus voltage variation look-up table (f()). It is case dependent parameter.
     */
    private Double fducw; // Simple_Float

    public Double getFducw() {
        return fducw;
    }

    public void setFducw(Double _value_) {
        fducw = _value_;
    }

    public void setFducw(String _value_) {
        fducw = getDoubleFromString(_value_);
    }

    public String fducwToString() {
        return fducw != null ? fducw.toString() : null;
    }

    private static void setFducw(BaseClass _this_, String _value_) {
        ((WindGenTurbineType3bIEC) _this_).setFducw(_value_);
    }

    private static String fducwToString(BaseClass _this_) {
        return ((WindGenTurbineType3bIEC) _this_).fducwToString();
    }

    /**
     * Crowbar control mode ().   The parameter is case dependent parameter.
     */
    private Boolean mwtcwp; // Boolean

    public Boolean getMwtcwp() {
        return mwtcwp;
    }

    public void setMwtcwp(Boolean _value_) {
        mwtcwp = _value_;
    }

    public void setMwtcwp(String _value_) {
        mwtcwp = getBooleanFromString(_value_);
    }

    public String mwtcwpToString() {
        return mwtcwp != null ? mwtcwp.toString() : null;
    }

    private static void setMwtcwp(BaseClass _this_, String _value_) {
        ((WindGenTurbineType3bIEC) _this_).setMwtcwp(_value_);
    }

    private static String mwtcwpToString(BaseClass _this_) {
        return ((WindGenTurbineType3bIEC) _this_).mwtcwpToString();
    }

    /**
     * Current generation Time constant (). It is type dependent parameter.
     */
    private Double tg; // Seconds

    public Double getTg() {
        return tg;
    }

    public void setTg(Double _value_) {
        tg = _value_;
    }

    public void setTg(String _value_) {
        tg = getDoubleFromString(_value_);
    }

    public String tgToString() {
        return tg != null ? tg.toString() : null;
    }

    private static void setTg(BaseClass _this_, String _value_) {
        ((WindGenTurbineType3bIEC) _this_).setTg(_value_);
    }

    private static String tgToString(BaseClass _this_) {
        return ((WindGenTurbineType3bIEC) _this_).tgToString();
    }

    /**
     * Time constant for crowbar washout filter (). It is case dependent parameter.
     */
    private Double two; // Seconds

    public Double getTwo() {
        return two;
    }

    public void setTwo(Double _value_) {
        two = _value_;
    }

    public void setTwo(String _value_) {
        two = getDoubleFromString(_value_);
    }

    public String twoToString() {
        return two != null ? two.toString() : null;
    }

    private static void setTwo(BaseClass _this_, String _value_) {
        ((WindGenTurbineType3bIEC) _this_).setTwo(_value_);
    }

    private static String twoToString(BaseClass _this_) {
        return ((WindGenTurbineType3bIEC) _this_).twoToString();
    }

    /**
     * Electromagnetic transient reactance (x). It is type dependent parameter.
     */
    private Double xs; // PU

    public Double getXs() {
        return xs;
    }

    public void setXs(Double _value_) {
        xs = _value_;
    }

    public void setXs(String _value_) {
        xs = getDoubleFromString(_value_);
    }

    public String xsToString() {
        return xs != null ? xs.toString() : null;
    }

    private static void setXs(BaseClass _this_, String _value_) {
        ((WindGenTurbineType3bIEC) _this_).setXs(_value_);
    }

    private static String xsToString(BaseClass _this_) {
        return ((WindGenTurbineType3bIEC) _this_).xsToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "WindGenTurbineType3bIEC", attrName));
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
                "WindGenTurbineType3bIEC", attrName, objectValue));
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
                "WindGenTurbineType3bIEC", attrName, stringValue));
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
            map.put("fducw", new AttrDetails("WindGenTurbineType3bIEC.fducw", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindGenTurbineType3bIEC::fducwToString, null, WindGenTurbineType3bIEC::setFducw));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mwtcwp", new AttrDetails("WindGenTurbineType3bIEC.mwtcwp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindGenTurbineType3bIEC::mwtcwpToString, null, WindGenTurbineType3bIEC::setMwtcwp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tg", new AttrDetails("WindGenTurbineType3bIEC.tg", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindGenTurbineType3bIEC::tgToString, null, WindGenTurbineType3bIEC::setTg));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("two", new AttrDetails("WindGenTurbineType3bIEC.two", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindGenTurbineType3bIEC::twoToString, null, WindGenTurbineType3bIEC::setTwo));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xs", new AttrDetails("WindGenTurbineType3bIEC.xs", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindGenTurbineType3bIEC::xsToString, null, WindGenTurbineType3bIEC::setXs));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new WindGenTurbineType3bIEC().allAttrDetailsMap());
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
