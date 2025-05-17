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
 * The operational meaning of a category of limits.
 */
@SuppressWarnings("unused")
public class OperationalLimitType extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(OperationalLimitType.class);

    /**
     * Default constructor.
     */
    public OperationalLimitType() {
        setCimType("OperationalLimitType");
    }

    /**
     * The operational limits associated with this type of limit.
     *
     * NOT USED
     */
    private Set<OperationalLimit> OperationalLimit = new HashSet<>(); // OneToMany

    public Set<OperationalLimit> getOperationalLimit() {
        return OperationalLimit;
    }

    public void setOperationalLimit(BaseClass _object_) {
        if (!(_object_ instanceof OperationalLimit)) {
            throw new IllegalArgumentException("Object is not OperationalLimit");
        }
        if (!OperationalLimit.contains(_object_)) {
            OperationalLimit.add((OperationalLimit) _object_);
            ((OperationalLimit) _object_).setOperationalLimitType(this);
        }
    }

    public String OperationalLimitToString() {
        return getStringFromSet(OperationalLimit);
    }

    private static void setOperationalLimit(BaseClass _this_, BaseClass _object_) {
        ((OperationalLimitType) _this_).setOperationalLimit(_object_);
    }

    private static String OperationalLimitToString(BaseClass _this_) {
        return ((OperationalLimitType) _this_).OperationalLimitToString();
    }

    /**
     * The nominal acceptable duration of the limit. Limits are commonly expressed in terms of the time limit for which the limit is normally acceptable. The actual acceptable duration of a specific limit may depend on other local factors such as temperature or wind speed. The attribute has meaning only if the flag isInfiniteDuration is set to false, hence it shall not be exchanged when isInfiniteDuration is set to true.
     */
    private Double acceptableDuration; // Seconds

    public Double getAcceptableDuration() {
        return acceptableDuration;
    }

    public void setAcceptableDuration(Double _value_) {
        acceptableDuration = _value_;
    }

    public void setAcceptableDuration(String _value_) {
        acceptableDuration = getDoubleFromString(_value_);
    }

    public String acceptableDurationToString() {
        return acceptableDuration != null ? acceptableDuration.toString() : null;
    }

    private static void setAcceptableDuration(BaseClass _this_, String _value_) {
        ((OperationalLimitType) _this_).setAcceptableDuration(_value_);
    }

    private static String acceptableDurationToString(BaseClass _this_) {
        return ((OperationalLimitType) _this_).acceptableDurationToString();
    }

    /**
     * The direction of the limit.
     */
    private String direction; // OperationalLimitDirectionKind

    public String getDirection() {
        return direction;
    }

    public void setDirection(String _value_) {
        direction = _value_;
    }

    public String directionToString() {
        return direction;
    }

    private static void setDirection(BaseClass _this_, String _value_) {
        ((OperationalLimitType) _this_).setDirection(_value_);
    }

    private static String directionToString(BaseClass _this_) {
        return ((OperationalLimitType) _this_).directionToString();
    }

    /**
     * Defines if the operational limit type has infinite duration. If true, the limit has infinite duration. If false, the limit has definite duration which is defined by the attribute acceptableDuration.
     */
    private Boolean isInfiniteDuration; // Boolean

    public Boolean getIsInfiniteDuration() {
        return isInfiniteDuration;
    }

    public void setIsInfiniteDuration(Boolean _value_) {
        isInfiniteDuration = _value_;
    }

    public void setIsInfiniteDuration(String _value_) {
        isInfiniteDuration = getBooleanFromString(_value_);
    }

    public String isInfiniteDurationToString() {
        return isInfiniteDuration != null ? isInfiniteDuration.toString() : null;
    }

    private static void setIsInfiniteDuration(BaseClass _this_, String _value_) {
        ((OperationalLimitType) _this_).setIsInfiniteDuration(_value_);
    }

    private static String isInfiniteDurationToString(BaseClass _this_) {
        return ((OperationalLimitType) _this_).isInfiniteDurationToString();
    }

    /**
     * Types of limits defined in the ENTSO-E Operational Handbook Policy 3.
     */
    private String kind; // LimitKind

    public String getKind() {
        return kind;
    }

    public void setKind(String _value_) {
        kind = _value_;
    }

    public String kindToString() {
        return kind;
    }

    private static void setKind(BaseClass _this_, String _value_) {
        ((OperationalLimitType) _this_).setKind(_value_);
    }

    private static String kindToString(BaseClass _this_) {
        return ((OperationalLimitType) _this_).kindToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "OperationalLimitType", attrName));
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
                "OperationalLimitType", attrName, objectValue));
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
                "OperationalLimitType", attrName, stringValue));
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
            profiles.add(CGMESProfile.EQ);
            map.put("OperationalLimit", new AttrDetails("OperationalLimitType.OperationalLimit", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, OperationalLimitType::OperationalLimitToString, OperationalLimitType::setOperationalLimit, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("acceptableDuration", new AttrDetails("OperationalLimitType.acceptableDuration", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, OperationalLimitType::acceptableDurationToString, null, OperationalLimitType::setAcceptableDuration));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("direction", new AttrDetails("OperationalLimitType.direction", true, "http://iec.ch/TC57/CIM100#", profiles, false, true, OperationalLimitType::directionToString, null, OperationalLimitType::setDirection));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("isInfiniteDuration", new AttrDetails("OperationalLimitType.isInfiniteDuration", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, OperationalLimitType::isInfiniteDurationToString, null, OperationalLimitType::setIsInfiniteDuration));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("kind", new AttrDetails("OperationalLimitType.kind", true, "http://iec.ch/TC57/CIM100-European#", profiles, false, true, OperationalLimitType::kindToString, null, OperationalLimitType::setKind));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new OperationalLimitType().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.EQ);
        POSSIBLE_PROFILES = Collections.unmodifiableSet(profiles);
    }

    private static final CGMESProfile RECOMMENDED_PROFILE = CGMESProfile.EQ;

    private static final Set<CGMESProfile> POSSIBLE_PROFILES_INCLUDING_ATTRIBUTES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>(POSSIBLE_PROFILES);
        for (var attrDetails : ATTR_DETAILS_MAP.values()) {
            profiles.addAll(attrDetails.profiles);
        }
        POSSIBLE_PROFILES_INCLUDING_ATTRIBUTES = Collections.unmodifiableSet(profiles);
    }
}
