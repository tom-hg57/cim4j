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
 * Town details, in the context of address.
 */
@SuppressWarnings("unused")
public class TownDetail extends BaseClass {

    private static final Logging LOG = Logging.getLogger(TownDetail.class);

    /**
     * Constructor.
     */
    public TownDetail(String rdfid) {
        super("TownDetail", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected TownDetail(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Town code.
     */
    private String code; // String

    public String getCode() {
        return code;
    }

    public void setCode(String _value_) {
        code = _value_;
    }

    public String codeToString() {
        return code != null ? code.toString() : null;
    }

    private static void setCode(BaseClass _this_, String _value_) {
        ((TownDetail) _this_).setCode(_value_);
    }

    private static String codeToString(BaseClass _this_) {
        return ((TownDetail) _this_).codeToString();
    }

    /**
     * Name of the country.
     */
    private String country; // String

    public String getCountry() {
        return country;
    }

    public void setCountry(String _value_) {
        country = _value_;
    }

    public String countryToString() {
        return country != null ? country.toString() : null;
    }

    private static void setCountry(BaseClass _this_, String _value_) {
        ((TownDetail) _this_).setCountry(_value_);
    }

    private static String countryToString(BaseClass _this_) {
        return ((TownDetail) _this_).countryToString();
    }

    /**
     * Town name.
     */
    private String name; // String

    public String getName() {
        return name;
    }

    public void setName(String _value_) {
        name = _value_;
    }

    public String nameToString() {
        return name != null ? name.toString() : null;
    }

    private static void setName(BaseClass _this_, String _value_) {
        ((TownDetail) _this_).setName(_value_);
    }

    private static String nameToString(BaseClass _this_) {
        return ((TownDetail) _this_).nameToString();
    }

    /**
     * Town section. For example, it is common for there to be 36 sections per township.
     */
    private String section; // String

    public String getSection() {
        return section;
    }

    public void setSection(String _value_) {
        section = _value_;
    }

    public String sectionToString() {
        return section != null ? section.toString() : null;
    }

    private static void setSection(BaseClass _this_, String _value_) {
        ((TownDetail) _this_).setSection(_value_);
    }

    private static String sectionToString(BaseClass _this_) {
        return ((TownDetail) _this_).sectionToString();
    }

    /**
     * Name of the state or province.
     */
    private String stateOrProvince; // String

    public String getStateOrProvince() {
        return stateOrProvince;
    }

    public void setStateOrProvince(String _value_) {
        stateOrProvince = _value_;
    }

    public String stateOrProvinceToString() {
        return stateOrProvince != null ? stateOrProvince.toString() : null;
    }

    private static void setStateOrProvince(BaseClass _this_, String _value_) {
        ((TownDetail) _this_).setStateOrProvince(_value_);
    }

    private static String stateOrProvinceToString(BaseClass _this_) {
        return ((TownDetail) _this_).stateOrProvinceToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "TownDetail", attrName));
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
                "TownDetail", attrName, objectValue));
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
                "TownDetail", attrName, stringValue));
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
            profiles.add(CGMESProfile.GL);
            map.put("code", new AttrDetails("TownDetail.code", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, TownDetail::codeToString, null, TownDetail::setCode));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("country", new AttrDetails("TownDetail.country", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, TownDetail::countryToString, null, TownDetail::setCountry));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("name", new AttrDetails("TownDetail.name", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, TownDetail::nameToString, null, TownDetail::setName));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("section", new AttrDetails("TownDetail.section", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, TownDetail::sectionToString, null, TownDetail::setSection));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.GL);
            map.put("stateOrProvince", new AttrDetails("TownDetail.stateOrProvince", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, TownDetail::stateOrProvinceToString, null, TownDetail::setStateOrProvince));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new TownDetail(null).allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.GL);
        POSSIBLE_PROFILES = Collections.unmodifiableSet(profiles);
    }

    private static final CGMESProfile RECOMMENDED_PROFILE = CGMESProfile.GL;

    private static final Set<CGMESProfile> POSSIBLE_PROFILES_INCLUDING_ATTRIBUTES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>(POSSIBLE_PROFILES);
        for (var attrDetails : ATTR_DETAILS_MAP.values()) {
            profiles.addAll(attrDetails.profiles);
        }
        POSSIBLE_PROFILES_INCLUDING_ATTRIBUTES = Collections.unmodifiableSet(profiles);
    }
}
