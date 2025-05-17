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
 * The grid protection model includes protection against over and under voltage, and against over and under frequency.  Reference: IEC Standard 614000-27-1 Section 6.6.6.
 */
@SuppressWarnings("unused")
public class WindProtectionIEC extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(WindProtectionIEC.class);

    /**
     * Default constructor.
     */
    public WindProtectionIEC() {
        setCimType("WindProtectionIEC");
    }

    /**
     * Wind generator type 1 or 2 model with which this wind turbine protection model is associated.
     *
     * NOT USED
     */
    private WindTurbineType1or2IEC WindTurbineType1or2IEC; // OneToOne

    public WindTurbineType1or2IEC getWindTurbineType1or2IEC() {
        return WindTurbineType1or2IEC;
    }

    public void setWindTurbineType1or2IEC(BaseClass _object_) {
        if (!(_object_ instanceof WindTurbineType1or2IEC)) {
            throw new IllegalArgumentException("Object is not WindTurbineType1or2IEC");
        }
        if (WindTurbineType1or2IEC != _object_) {
            WindTurbineType1or2IEC = (WindTurbineType1or2IEC) _object_;
            WindTurbineType1or2IEC.setWindProtectionIEC(this);
        }
    }

    public String WindTurbineType1or2IECToString() {
        return WindTurbineType1or2IEC != null ? WindTurbineType1or2IEC.getRdfid() : null;
    }

    private static void setWindTurbineType1or2IEC(BaseClass _this_, BaseClass _object_) {
        ((WindProtectionIEC) _this_).setWindTurbineType1or2IEC(_object_);
    }

    private static String WindTurbineType1or2IECToString(BaseClass _this_) {
        return ((WindProtectionIEC) _this_).WindTurbineType1or2IECToString();
    }

    /**
     * Wind generator type 3 or 4 model with which this wind turbine protection model is associated.
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
            WindTurbineType3or4IEC.setWindProtectionIEC(this);
        }
    }

    public String WindTurbineType3or4IECToString() {
        return WindTurbineType3or4IEC != null ? WindTurbineType3or4IEC.getRdfid() : null;
    }

    private static void setWindTurbineType3or4IEC(BaseClass _this_, BaseClass _object_) {
        ((WindProtectionIEC) _this_).setWindTurbineType3or4IEC(_object_);
    }

    private static String WindTurbineType3or4IECToString(BaseClass _this_) {
        return ((WindProtectionIEC) _this_).WindTurbineType3or4IECToString();
    }

    /**
     * Set of wind turbine over frequency protection levels (). It is project dependent parameter.
     */
    private Double fover; // PU

    public Double getFover() {
        return fover;
    }

    public void setFover(Double _value_) {
        fover = _value_;
    }

    public void setFover(String _value_) {
        fover = getDoubleFromString(_value_);
    }

    public String foverToString() {
        return fover != null ? fover.toString() : null;
    }

    private static void setFover(BaseClass _this_, String _value_) {
        ((WindProtectionIEC) _this_).setFover(_value_);
    }

    private static String foverToString(BaseClass _this_) {
        return ((WindProtectionIEC) _this_).foverToString();
    }

    /**
     * Set of wind turbine under frequency protection levels (). It is project dependent parameter.
     */
    private Double funder; // PU

    public Double getFunder() {
        return funder;
    }

    public void setFunder(Double _value_) {
        funder = _value_;
    }

    public void setFunder(String _value_) {
        funder = getDoubleFromString(_value_);
    }

    public String funderToString() {
        return funder != null ? funder.toString() : null;
    }

    private static void setFunder(BaseClass _this_, String _value_) {
        ((WindProtectionIEC) _this_).setFunder(_value_);
    }

    private static String funderToString(BaseClass _this_) {
        return ((WindProtectionIEC) _this_).funderToString();
    }

    /**
     * Set of corresponding wind turbine over frequency protection disconnection times (). It is project dependent parameter.
     */
    private Double tfover; // Seconds

    public Double getTfover() {
        return tfover;
    }

    public void setTfover(Double _value_) {
        tfover = _value_;
    }

    public void setTfover(String _value_) {
        tfover = getDoubleFromString(_value_);
    }

    public String tfoverToString() {
        return tfover != null ? tfover.toString() : null;
    }

    private static void setTfover(BaseClass _this_, String _value_) {
        ((WindProtectionIEC) _this_).setTfover(_value_);
    }

    private static String tfoverToString(BaseClass _this_) {
        return ((WindProtectionIEC) _this_).tfoverToString();
    }

    /**
     * Set of corresponding wind turbine under frequency protection disconnection times (). It is project dependent parameter.
     */
    private Double tfunder; // Seconds

    public Double getTfunder() {
        return tfunder;
    }

    public void setTfunder(Double _value_) {
        tfunder = _value_;
    }

    public void setTfunder(String _value_) {
        tfunder = getDoubleFromString(_value_);
    }

    public String tfunderToString() {
        return tfunder != null ? tfunder.toString() : null;
    }

    private static void setTfunder(BaseClass _this_, String _value_) {
        ((WindProtectionIEC) _this_).setTfunder(_value_);
    }

    private static String tfunderToString(BaseClass _this_) {
        return ((WindProtectionIEC) _this_).tfunderToString();
    }

    /**
     * Set of corresponding wind turbine over voltage protection disconnection times (). It is project dependent parameter.
     */
    private Double tuover; // Seconds

    public Double getTuover() {
        return tuover;
    }

    public void setTuover(Double _value_) {
        tuover = _value_;
    }

    public void setTuover(String _value_) {
        tuover = getDoubleFromString(_value_);
    }

    public String tuoverToString() {
        return tuover != null ? tuover.toString() : null;
    }

    private static void setTuover(BaseClass _this_, String _value_) {
        ((WindProtectionIEC) _this_).setTuover(_value_);
    }

    private static String tuoverToString(BaseClass _this_) {
        return ((WindProtectionIEC) _this_).tuoverToString();
    }

    /**
     * Set of corresponding wind turbine under voltage protection disconnection times (). It is project dependent parameter.
     */
    private Double tuunder; // Seconds

    public Double getTuunder() {
        return tuunder;
    }

    public void setTuunder(Double _value_) {
        tuunder = _value_;
    }

    public void setTuunder(String _value_) {
        tuunder = getDoubleFromString(_value_);
    }

    public String tuunderToString() {
        return tuunder != null ? tuunder.toString() : null;
    }

    private static void setTuunder(BaseClass _this_, String _value_) {
        ((WindProtectionIEC) _this_).setTuunder(_value_);
    }

    private static String tuunderToString(BaseClass _this_) {
        return ((WindProtectionIEC) _this_).tuunderToString();
    }

    /**
     * Set of wind turbine over voltage protection levels (). It is project dependent parameter.
     */
    private Double uover; // PU

    public Double getUover() {
        return uover;
    }

    public void setUover(Double _value_) {
        uover = _value_;
    }

    public void setUover(String _value_) {
        uover = getDoubleFromString(_value_);
    }

    public String uoverToString() {
        return uover != null ? uover.toString() : null;
    }

    private static void setUover(BaseClass _this_, String _value_) {
        ((WindProtectionIEC) _this_).setUover(_value_);
    }

    private static String uoverToString(BaseClass _this_) {
        return ((WindProtectionIEC) _this_).uoverToString();
    }

    /**
     * Set of wind turbine under voltage protection levels (). It is project dependent parameter.
     */
    private Double uunder; // PU

    public Double getUunder() {
        return uunder;
    }

    public void setUunder(Double _value_) {
        uunder = _value_;
    }

    public void setUunder(String _value_) {
        uunder = getDoubleFromString(_value_);
    }

    public String uunderToString() {
        return uunder != null ? uunder.toString() : null;
    }

    private static void setUunder(BaseClass _this_, String _value_) {
        ((WindProtectionIEC) _this_).setUunder(_value_);
    }

    private static String uunderToString(BaseClass _this_) {
        return ((WindProtectionIEC) _this_).uunderToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "WindProtectionIEC", attrName));
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
                "WindProtectionIEC", attrName, objectValue));
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
                "WindProtectionIEC", attrName, stringValue));
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
            map.put("WindTurbineType1or2IEC", new AttrDetails("WindProtectionIEC.WindTurbineType1or2IEC", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, WindProtectionIEC::WindTurbineType1or2IECToString, WindProtectionIEC::setWindTurbineType1or2IEC, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindTurbineType3or4IEC", new AttrDetails("WindProtectionIEC.WindTurbineType3or4IEC", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, WindProtectionIEC::WindTurbineType3or4IECToString, WindProtectionIEC::setWindTurbineType3or4IEC, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("fover", new AttrDetails("WindProtectionIEC.fover", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindProtectionIEC::foverToString, null, WindProtectionIEC::setFover));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("funder", new AttrDetails("WindProtectionIEC.funder", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindProtectionIEC::funderToString, null, WindProtectionIEC::setFunder));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tfover", new AttrDetails("WindProtectionIEC.tfover", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindProtectionIEC::tfoverToString, null, WindProtectionIEC::setTfover));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tfunder", new AttrDetails("WindProtectionIEC.tfunder", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindProtectionIEC::tfunderToString, null, WindProtectionIEC::setTfunder));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tuover", new AttrDetails("WindProtectionIEC.tuover", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindProtectionIEC::tuoverToString, null, WindProtectionIEC::setTuover));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tuunder", new AttrDetails("WindProtectionIEC.tuunder", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindProtectionIEC::tuunderToString, null, WindProtectionIEC::setTuunder));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("uover", new AttrDetails("WindProtectionIEC.uover", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindProtectionIEC::uoverToString, null, WindProtectionIEC::setUover));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("uunder", new AttrDetails("WindProtectionIEC.uunder", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindProtectionIEC::uunderToString, null, WindProtectionIEC::setUunder));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new WindProtectionIEC().allAttrDetailsMap());
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
