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
 * DC side of the current source converter (CSC).
 */
@SuppressWarnings("unused")
public class CsConverter extends ACDCConverter {

    private static final Logging LOG = Logging.getLogger(CsConverter.class);

    /**
     * Default constructor.
     */
    public CsConverter() {
        setCimType("CsConverter");
    }

    /**
     * Firing angle, typical value between 10 and 18 degrees for a rectifier. CSC state variable, result from power flow.
     */
    private Double alpha; // AngleDegrees

    public Double getAlpha() {
        return alpha;
    }

    public void setAlpha(Double _value_) {
        alpha = _value_;
    }

    public void setAlpha(String _value_) {
        alpha = getDoubleFromString(_value_);
    }

    public String alphaToString() {
        return alpha != null ? alpha.toString() : null;
    }

    private static void setAlpha(BaseClass _this_, String _value_) {
        ((CsConverter) _this_).setAlpha(_value_);
    }

    private static String alphaToString(BaseClass _this_) {
        return ((CsConverter) _this_).alphaToString();
    }

    /**
     * Extinction angle. CSC state variable, result from power flow.
     */
    private Double gamma; // AngleDegrees

    public Double getGamma() {
        return gamma;
    }

    public void setGamma(Double _value_) {
        gamma = _value_;
    }

    public void setGamma(String _value_) {
        gamma = getDoubleFromString(_value_);
    }

    public String gammaToString() {
        return gamma != null ? gamma.toString() : null;
    }

    private static void setGamma(BaseClass _this_, String _value_) {
        ((CsConverter) _this_).setGamma(_value_);
    }

    private static String gammaToString(BaseClass _this_) {
        return ((CsConverter) _this_).gammaToString();
    }

    /**
     * Maximum firing angle. CSC configuration data used in power flow.
     */
    private Double maxAlpha; // AngleDegrees

    public Double getMaxAlpha() {
        return maxAlpha;
    }

    public void setMaxAlpha(Double _value_) {
        maxAlpha = _value_;
    }

    public void setMaxAlpha(String _value_) {
        maxAlpha = getDoubleFromString(_value_);
    }

    public String maxAlphaToString() {
        return maxAlpha != null ? maxAlpha.toString() : null;
    }

    private static void setMaxAlpha(BaseClass _this_, String _value_) {
        ((CsConverter) _this_).setMaxAlpha(_value_);
    }

    private static String maxAlphaToString(BaseClass _this_) {
        return ((CsConverter) _this_).maxAlphaToString();
    }

    /**
     * Maximum extinction angle. CSC configuration data used in power flow.
     */
    private Double maxGamma; // AngleDegrees

    public Double getMaxGamma() {
        return maxGamma;
    }

    public void setMaxGamma(Double _value_) {
        maxGamma = _value_;
    }

    public void setMaxGamma(String _value_) {
        maxGamma = getDoubleFromString(_value_);
    }

    public String maxGammaToString() {
        return maxGamma != null ? maxGamma.toString() : null;
    }

    private static void setMaxGamma(BaseClass _this_, String _value_) {
        ((CsConverter) _this_).setMaxGamma(_value_);
    }

    private static String maxGammaToString(BaseClass _this_) {
        return ((CsConverter) _this_).maxGammaToString();
    }

    /**
     * The maximum direct current (Id) on the DC side at which the converter should operate. Converter configuration data use in power flow.
     */
    private Double maxIdc; // CurrentFlow

    public Double getMaxIdc() {
        return maxIdc;
    }

    public void setMaxIdc(Double _value_) {
        maxIdc = _value_;
    }

    public void setMaxIdc(String _value_) {
        maxIdc = getDoubleFromString(_value_);
    }

    public String maxIdcToString() {
        return maxIdc != null ? maxIdc.toString() : null;
    }

    private static void setMaxIdc(BaseClass _this_, String _value_) {
        ((CsConverter) _this_).setMaxIdc(_value_);
    }

    private static String maxIdcToString(BaseClass _this_) {
        return ((CsConverter) _this_).maxIdcToString();
    }

    /**
     * Minimum firing angle. CSC configuration data used in power flow.
     */
    private Double minAlpha; // AngleDegrees

    public Double getMinAlpha() {
        return minAlpha;
    }

    public void setMinAlpha(Double _value_) {
        minAlpha = _value_;
    }

    public void setMinAlpha(String _value_) {
        minAlpha = getDoubleFromString(_value_);
    }

    public String minAlphaToString() {
        return minAlpha != null ? minAlpha.toString() : null;
    }

    private static void setMinAlpha(BaseClass _this_, String _value_) {
        ((CsConverter) _this_).setMinAlpha(_value_);
    }

    private static String minAlphaToString(BaseClass _this_) {
        return ((CsConverter) _this_).minAlphaToString();
    }

    /**
     * Minimum extinction angle. CSC configuration data used in power flow.
     */
    private Double minGamma; // AngleDegrees

    public Double getMinGamma() {
        return minGamma;
    }

    public void setMinGamma(Double _value_) {
        minGamma = _value_;
    }

    public void setMinGamma(String _value_) {
        minGamma = getDoubleFromString(_value_);
    }

    public String minGammaToString() {
        return minGamma != null ? minGamma.toString() : null;
    }

    private static void setMinGamma(BaseClass _this_, String _value_) {
        ((CsConverter) _this_).setMinGamma(_value_);
    }

    private static String minGammaToString(BaseClass _this_) {
        return ((CsConverter) _this_).minGammaToString();
    }

    /**
     * The minimum direct current (Id) on the DC side at which the converter should operate. CSC configuration data used in power flow.
     */
    private Double minIdc; // CurrentFlow

    public Double getMinIdc() {
        return minIdc;
    }

    public void setMinIdc(Double _value_) {
        minIdc = _value_;
    }

    public void setMinIdc(String _value_) {
        minIdc = getDoubleFromString(_value_);
    }

    public String minIdcToString() {
        return minIdc != null ? minIdc.toString() : null;
    }

    private static void setMinIdc(BaseClass _this_, String _value_) {
        ((CsConverter) _this_).setMinIdc(_value_);
    }

    private static String minIdcToString(BaseClass _this_) {
        return ((CsConverter) _this_).minIdcToString();
    }

    /**
     * Indicates whether the DC pole is operating as an inverter or as a rectifier. CSC control variable used in power flow.
     */
    private String operatingMode; // CsOperatingModeKind

    public String getOperatingMode() {
        return operatingMode;
    }

    public void setOperatingMode(String _value_) {
        operatingMode = _value_;
    }

    public String operatingModeToString() {
        return operatingMode;
    }

    private static void setOperatingMode(BaseClass _this_, String _value_) {
        ((CsConverter) _this_).setOperatingMode(_value_);
    }

    private static String operatingModeToString(BaseClass _this_) {
        return ((CsConverter) _this_).operatingModeToString();
    }

    /**
     */
    private String pPccControl; // CsPpccControlKind

    public String getPPccControl() {
        return pPccControl;
    }

    public void setPPccControl(String _value_) {
        pPccControl = _value_;
    }

    public String pPccControlToString() {
        return pPccControl;
    }

    private static void setPPccControl(BaseClass _this_, String _value_) {
        ((CsConverter) _this_).setPPccControl(_value_);
    }

    private static String pPccControlToString(BaseClass _this_) {
        return ((CsConverter) _this_).pPccControlToString();
    }

    /**
     * Rated converter DC current, also called IdN. Converter configuration data used in power flow.
     */
    private Double ratedIdc; // CurrentFlow

    public Double getRatedIdc() {
        return ratedIdc;
    }

    public void setRatedIdc(Double _value_) {
        ratedIdc = _value_;
    }

    public void setRatedIdc(String _value_) {
        ratedIdc = getDoubleFromString(_value_);
    }

    public String ratedIdcToString() {
        return ratedIdc != null ? ratedIdc.toString() : null;
    }

    private static void setRatedIdc(BaseClass _this_, String _value_) {
        ((CsConverter) _this_).setRatedIdc(_value_);
    }

    private static String ratedIdcToString(BaseClass _this_) {
        return ((CsConverter) _this_).ratedIdcToString();
    }

    /**
     * Target firing angle. CSC control variable used in power flow.
     */
    private Double targetAlpha; // AngleDegrees

    public Double getTargetAlpha() {
        return targetAlpha;
    }

    public void setTargetAlpha(Double _value_) {
        targetAlpha = _value_;
    }

    public void setTargetAlpha(String _value_) {
        targetAlpha = getDoubleFromString(_value_);
    }

    public String targetAlphaToString() {
        return targetAlpha != null ? targetAlpha.toString() : null;
    }

    private static void setTargetAlpha(BaseClass _this_, String _value_) {
        ((CsConverter) _this_).setTargetAlpha(_value_);
    }

    private static String targetAlphaToString(BaseClass _this_) {
        return ((CsConverter) _this_).targetAlphaToString();
    }

    /**
     * Target extinction angle. CSC  control variable used in power flow.
     */
    private Double targetGamma; // AngleDegrees

    public Double getTargetGamma() {
        return targetGamma;
    }

    public void setTargetGamma(Double _value_) {
        targetGamma = _value_;
    }

    public void setTargetGamma(String _value_) {
        targetGamma = getDoubleFromString(_value_);
    }

    public String targetGammaToString() {
        return targetGamma != null ? targetGamma.toString() : null;
    }

    private static void setTargetGamma(BaseClass _this_, String _value_) {
        ((CsConverter) _this_).setTargetGamma(_value_);
    }

    private static String targetGammaToString(BaseClass _this_) {
        return ((CsConverter) _this_).targetGammaToString();
    }

    /**
     * DC current target value. CSC control variable used in power flow.
     */
    private Double targetIdc; // CurrentFlow

    public Double getTargetIdc() {
        return targetIdc;
    }

    public void setTargetIdc(Double _value_) {
        targetIdc = _value_;
    }

    public void setTargetIdc(String _value_) {
        targetIdc = getDoubleFromString(_value_);
    }

    public String targetIdcToString() {
        return targetIdc != null ? targetIdc.toString() : null;
    }

    private static void setTargetIdc(BaseClass _this_, String _value_) {
        ((CsConverter) _this_).setTargetIdc(_value_);
    }

    private static String targetIdcToString(BaseClass _this_) {
        return ((CsConverter) _this_).targetIdcToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "CsConverter", attrName));
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
                "CsConverter", attrName, objectValue));
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
                "CsConverter", attrName, stringValue));
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
            profiles.add(CGMESProfile.SV);
            map.put("alpha", new AttrDetails("CsConverter.alpha", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, CsConverter::alphaToString, null, CsConverter::setAlpha));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SV);
            map.put("gamma", new AttrDetails("CsConverter.gamma", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, CsConverter::gammaToString, null, CsConverter::setGamma));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("maxAlpha", new AttrDetails("CsConverter.maxAlpha", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, CsConverter::maxAlphaToString, null, CsConverter::setMaxAlpha));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("maxGamma", new AttrDetails("CsConverter.maxGamma", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, CsConverter::maxGammaToString, null, CsConverter::setMaxGamma));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("maxIdc", new AttrDetails("CsConverter.maxIdc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, CsConverter::maxIdcToString, null, CsConverter::setMaxIdc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("minAlpha", new AttrDetails("CsConverter.minAlpha", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, CsConverter::minAlphaToString, null, CsConverter::setMinAlpha));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("minGamma", new AttrDetails("CsConverter.minGamma", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, CsConverter::minGammaToString, null, CsConverter::setMinGamma));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("minIdc", new AttrDetails("CsConverter.minIdc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, CsConverter::minIdcToString, null, CsConverter::setMinIdc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("operatingMode", new AttrDetails("CsConverter.operatingMode", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true, CsConverter::operatingModeToString, null, CsConverter::setOperatingMode));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("pPccControl", new AttrDetails("CsConverter.pPccControl", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true, CsConverter::pPccControlToString, null, CsConverter::setPPccControl));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("ratedIdc", new AttrDetails("CsConverter.ratedIdc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, CsConverter::ratedIdcToString, null, CsConverter::setRatedIdc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("targetAlpha", new AttrDetails("CsConverter.targetAlpha", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, CsConverter::targetAlphaToString, null, CsConverter::setTargetAlpha));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("targetGamma", new AttrDetails("CsConverter.targetGamma", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, CsConverter::targetGammaToString, null, CsConverter::setTargetGamma));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("targetIdc", new AttrDetails("CsConverter.targetIdc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, CsConverter::targetIdcToString, null, CsConverter::setTargetIdc));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new CsConverter().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.EQ);
        profiles.add(CGMESProfile.SV);
        profiles.add(CGMESProfile.SSH);
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
