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
 * This class represents the external network and it is used for IEC 60909 calculations.
 */
@SuppressWarnings("unused")
public class ExternalNetworkInjection extends RegulatingCondEq {

    private static final Logging LOG = Logging.getLogger(ExternalNetworkInjection.class);

    /**
     * Default constructor.
     */
    public ExternalNetworkInjection() {
        setCimType("ExternalNetworkInjection");
    }

    /**
     * Power Frequency Bias. This is the change in power injection divided by the change in frequency and negated.  A positive value of the power frequency bias provides additional power injection upon a drop in frequency.
     */
    private Double governorSCD; // ActivePowerPerFrequency

    public Double getGovernorSCD() {
        return governorSCD;
    }

    public void setGovernorSCD(Double _value_) {
        governorSCD = _value_;
    }

    public void setGovernorSCD(String _value_) {
        governorSCD = getDoubleFromString(_value_);
    }

    public String governorSCDToString() {
        return governorSCD != null ? governorSCD.toString() : null;
    }

    private static void setGovernorSCD(BaseClass _this_, String _value_) {
        ((ExternalNetworkInjection) _this_).setGovernorSCD(_value_);
    }

    private static String governorSCDToString(BaseClass _this_) {
        return ((ExternalNetworkInjection) _this_).governorSCDToString();
    }

    /**
     * Indicates whether initial symmetrical short-circuit current and power have been calculated according to IEC (Ik`).  Used only if short circuit calculations are done according to superposition method.
     */
    private Boolean ikSecond; // Boolean

    public Boolean getIkSecond() {
        return ikSecond;
    }

    public void setIkSecond(Boolean _value_) {
        ikSecond = _value_;
    }

    public void setIkSecond(String _value_) {
        ikSecond = getBooleanFromString(_value_);
    }

    public String ikSecondToString() {
        return ikSecond != null ? ikSecond.toString() : null;
    }

    private static void setIkSecond(BaseClass _this_, String _value_) {
        ((ExternalNetworkInjection) _this_).setIkSecond(_value_);
    }

    private static String ikSecondToString(BaseClass _this_) {
        return ((ExternalNetworkInjection) _this_).ikSecondToString();
    }

    /**
     * Maximum initial symmetrical short-circuit currents (Ik` max) in A (Ik` = Sk`/(SQRT(3) Un)). Used for short circuit data exchange according to IEC 60909.
     */
    private Double maxInitialSymShCCurrent; // CurrentFlow

    public Double getMaxInitialSymShCCurrent() {
        return maxInitialSymShCCurrent;
    }

    public void setMaxInitialSymShCCurrent(Double _value_) {
        maxInitialSymShCCurrent = _value_;
    }

    public void setMaxInitialSymShCCurrent(String _value_) {
        maxInitialSymShCCurrent = getDoubleFromString(_value_);
    }

    public String maxInitialSymShCCurrentToString() {
        return maxInitialSymShCCurrent != null ? maxInitialSymShCCurrent.toString() : null;
    }

    private static void setMaxInitialSymShCCurrent(BaseClass _this_, String _value_) {
        ((ExternalNetworkInjection) _this_).setMaxInitialSymShCCurrent(_value_);
    }

    private static String maxInitialSymShCCurrentToString(BaseClass _this_) {
        return ((ExternalNetworkInjection) _this_).maxInitialSymShCCurrentToString();
    }

    /**
     * Maximum active power of the injection.
     */
    private Double maxP; // ActivePower

    public Double getMaxP() {
        return maxP;
    }

    public void setMaxP(Double _value_) {
        maxP = _value_;
    }

    public void setMaxP(String _value_) {
        maxP = getDoubleFromString(_value_);
    }

    public String maxPToString() {
        return maxP != null ? maxP.toString() : null;
    }

    private static void setMaxP(BaseClass _this_, String _value_) {
        ((ExternalNetworkInjection) _this_).setMaxP(_value_);
    }

    private static String maxPToString(BaseClass _this_) {
        return ((ExternalNetworkInjection) _this_).maxPToString();
    }

    /**
     * Maximum reactive power limit. It is used for modelling of infeed for load flow exchange and not for short circuit modelling.
     */
    private Double maxQ; // ReactivePower

    public Double getMaxQ() {
        return maxQ;
    }

    public void setMaxQ(Double _value_) {
        maxQ = _value_;
    }

    public void setMaxQ(String _value_) {
        maxQ = getDoubleFromString(_value_);
    }

    public String maxQToString() {
        return maxQ != null ? maxQ.toString() : null;
    }

    private static void setMaxQ(BaseClass _this_, String _value_) {
        ((ExternalNetworkInjection) _this_).setMaxQ(_value_);
    }

    private static String maxQToString(BaseClass _this_) {
        return ((ExternalNetworkInjection) _this_).maxQToString();
    }

    /**
     * Maximum ratio of zero sequence resistance of Network Feeder to its zero sequence reactance (R(0)/X(0) max). Used for short circuit data exchange according to IEC 60909.
     */
    private Float maxR0ToX0Ratio; // Float

    public Float getMaxR0ToX0Ratio() {
        return maxR0ToX0Ratio;
    }

    public void setMaxR0ToX0Ratio(Float _value_) {
        maxR0ToX0Ratio = _value_;
    }

    public void setMaxR0ToX0Ratio(String _value_) {
        maxR0ToX0Ratio = getFloatFromString(_value_);
    }

    public String maxR0ToX0RatioToString() {
        return maxR0ToX0Ratio != null ? maxR0ToX0Ratio.toString() : null;
    }

    private static void setMaxR0ToX0Ratio(BaseClass _this_, String _value_) {
        ((ExternalNetworkInjection) _this_).setMaxR0ToX0Ratio(_value_);
    }

    private static String maxR0ToX0RatioToString(BaseClass _this_) {
        return ((ExternalNetworkInjection) _this_).maxR0ToX0RatioToString();
    }

    /**
     * Maximum ratio of positive sequence resistance of Network Feeder to its positive sequence reactance (R(1)/X(1) max). Used for short circuit data exchange according to IEC 60909.
     */
    private Float maxR1ToX1Ratio; // Float

    public Float getMaxR1ToX1Ratio() {
        return maxR1ToX1Ratio;
    }

    public void setMaxR1ToX1Ratio(Float _value_) {
        maxR1ToX1Ratio = _value_;
    }

    public void setMaxR1ToX1Ratio(String _value_) {
        maxR1ToX1Ratio = getFloatFromString(_value_);
    }

    public String maxR1ToX1RatioToString() {
        return maxR1ToX1Ratio != null ? maxR1ToX1Ratio.toString() : null;
    }

    private static void setMaxR1ToX1Ratio(BaseClass _this_, String _value_) {
        ((ExternalNetworkInjection) _this_).setMaxR1ToX1Ratio(_value_);
    }

    private static String maxR1ToX1RatioToString(BaseClass _this_) {
        return ((ExternalNetworkInjection) _this_).maxR1ToX1RatioToString();
    }

    /**
     * Maximum ratio of zero sequence impedance to its positive sequence impedance (Z(0)/Z(1) max). Used for short circuit data exchange according to IEC 60909.
     */
    private Float maxZ0ToZ1Ratio; // Float

    public Float getMaxZ0ToZ1Ratio() {
        return maxZ0ToZ1Ratio;
    }

    public void setMaxZ0ToZ1Ratio(Float _value_) {
        maxZ0ToZ1Ratio = _value_;
    }

    public void setMaxZ0ToZ1Ratio(String _value_) {
        maxZ0ToZ1Ratio = getFloatFromString(_value_);
    }

    public String maxZ0ToZ1RatioToString() {
        return maxZ0ToZ1Ratio != null ? maxZ0ToZ1Ratio.toString() : null;
    }

    private static void setMaxZ0ToZ1Ratio(BaseClass _this_, String _value_) {
        ((ExternalNetworkInjection) _this_).setMaxZ0ToZ1Ratio(_value_);
    }

    private static String maxZ0ToZ1RatioToString(BaseClass _this_) {
        return ((ExternalNetworkInjection) _this_).maxZ0ToZ1RatioToString();
    }

    /**
     * Minimum initial symmetrical short-circuit currents (Ik` min) in A (Ik` = Sk`/(SQRT(3) Un)). Used for short circuit data exchange according to IEC 60909.
     */
    private Double minInitialSymShCCurrent; // CurrentFlow

    public Double getMinInitialSymShCCurrent() {
        return minInitialSymShCCurrent;
    }

    public void setMinInitialSymShCCurrent(Double _value_) {
        minInitialSymShCCurrent = _value_;
    }

    public void setMinInitialSymShCCurrent(String _value_) {
        minInitialSymShCCurrent = getDoubleFromString(_value_);
    }

    public String minInitialSymShCCurrentToString() {
        return minInitialSymShCCurrent != null ? minInitialSymShCCurrent.toString() : null;
    }

    private static void setMinInitialSymShCCurrent(BaseClass _this_, String _value_) {
        ((ExternalNetworkInjection) _this_).setMinInitialSymShCCurrent(_value_);
    }

    private static String minInitialSymShCCurrentToString(BaseClass _this_) {
        return ((ExternalNetworkInjection) _this_).minInitialSymShCCurrentToString();
    }

    /**
     * Minimum active power of the injection.
     */
    private Double minP; // ActivePower

    public Double getMinP() {
        return minP;
    }

    public void setMinP(Double _value_) {
        minP = _value_;
    }

    public void setMinP(String _value_) {
        minP = getDoubleFromString(_value_);
    }

    public String minPToString() {
        return minP != null ? minP.toString() : null;
    }

    private static void setMinP(BaseClass _this_, String _value_) {
        ((ExternalNetworkInjection) _this_).setMinP(_value_);
    }

    private static String minPToString(BaseClass _this_) {
        return ((ExternalNetworkInjection) _this_).minPToString();
    }

    /**
     * Minimum reactive power limit. It is used for modelling of infeed for load flow exchange and not for short circuit modelling.
     */
    private Double minQ; // ReactivePower

    public Double getMinQ() {
        return minQ;
    }

    public void setMinQ(Double _value_) {
        minQ = _value_;
    }

    public void setMinQ(String _value_) {
        minQ = getDoubleFromString(_value_);
    }

    public String minQToString() {
        return minQ != null ? minQ.toString() : null;
    }

    private static void setMinQ(BaseClass _this_, String _value_) {
        ((ExternalNetworkInjection) _this_).setMinQ(_value_);
    }

    private static String minQToString(BaseClass _this_) {
        return ((ExternalNetworkInjection) _this_).minQToString();
    }

    /**
     * Indicates whether initial symmetrical short-circuit current and power have been calculated according to IEC (Ik`). Used for short circuit data exchange according to IEC 6090.
     */
    private Float minR0ToX0Ratio; // Float

    public Float getMinR0ToX0Ratio() {
        return minR0ToX0Ratio;
    }

    public void setMinR0ToX0Ratio(Float _value_) {
        minR0ToX0Ratio = _value_;
    }

    public void setMinR0ToX0Ratio(String _value_) {
        minR0ToX0Ratio = getFloatFromString(_value_);
    }

    public String minR0ToX0RatioToString() {
        return minR0ToX0Ratio != null ? minR0ToX0Ratio.toString() : null;
    }

    private static void setMinR0ToX0Ratio(BaseClass _this_, String _value_) {
        ((ExternalNetworkInjection) _this_).setMinR0ToX0Ratio(_value_);
    }

    private static String minR0ToX0RatioToString(BaseClass _this_) {
        return ((ExternalNetworkInjection) _this_).minR0ToX0RatioToString();
    }

    /**
     * Minimum ratio of positive sequence resistance of Network Feeder to its positive sequence reactance (R(1)/X(1) min). Used for short circuit data exchange according to IEC 60909.
     */
    private Float minR1ToX1Ratio; // Float

    public Float getMinR1ToX1Ratio() {
        return minR1ToX1Ratio;
    }

    public void setMinR1ToX1Ratio(Float _value_) {
        minR1ToX1Ratio = _value_;
    }

    public void setMinR1ToX1Ratio(String _value_) {
        minR1ToX1Ratio = getFloatFromString(_value_);
    }

    public String minR1ToX1RatioToString() {
        return minR1ToX1Ratio != null ? minR1ToX1Ratio.toString() : null;
    }

    private static void setMinR1ToX1Ratio(BaseClass _this_, String _value_) {
        ((ExternalNetworkInjection) _this_).setMinR1ToX1Ratio(_value_);
    }

    private static String minR1ToX1RatioToString(BaseClass _this_) {
        return ((ExternalNetworkInjection) _this_).minR1ToX1RatioToString();
    }

    /**
     * Minimum ratio of zero sequence impedance to its positive sequence impedance (Z(0)/Z(1) min). Used for short circuit data exchange according to IEC 60909.
     */
    private Float minZ0ToZ1Ratio; // Float

    public Float getMinZ0ToZ1Ratio() {
        return minZ0ToZ1Ratio;
    }

    public void setMinZ0ToZ1Ratio(Float _value_) {
        minZ0ToZ1Ratio = _value_;
    }

    public void setMinZ0ToZ1Ratio(String _value_) {
        minZ0ToZ1Ratio = getFloatFromString(_value_);
    }

    public String minZ0ToZ1RatioToString() {
        return minZ0ToZ1Ratio != null ? minZ0ToZ1Ratio.toString() : null;
    }

    private static void setMinZ0ToZ1Ratio(BaseClass _this_, String _value_) {
        ((ExternalNetworkInjection) _this_).setMinZ0ToZ1Ratio(_value_);
    }

    private static String minZ0ToZ1RatioToString(BaseClass _this_) {
        return ((ExternalNetworkInjection) _this_).minZ0ToZ1RatioToString();
    }

    /**
     * Active power injection. Load sign convention is used, i.e. positive sign means flow out from a node. Starting value for steady state solutions.
     */
    private Double p; // ActivePower

    public Double getP() {
        return p;
    }

    public void setP(Double _value_) {
        p = _value_;
    }

    public void setP(String _value_) {
        p = getDoubleFromString(_value_);
    }

    public String pToString() {
        return p != null ? p.toString() : null;
    }

    private static void setP(BaseClass _this_, String _value_) {
        ((ExternalNetworkInjection) _this_).setP(_value_);
    }

    private static String pToString(BaseClass _this_) {
        return ((ExternalNetworkInjection) _this_).pToString();
    }

    /**
     * Reactive power injection. Load sign convention is used, i.e. positive sign means flow out from a node. Starting value for steady state solutions.
     */
    private Double q; // ReactivePower

    public Double getQ() {
        return q;
    }

    public void setQ(Double _value_) {
        q = _value_;
    }

    public void setQ(String _value_) {
        q = getDoubleFromString(_value_);
    }

    public String qToString() {
        return q != null ? q.toString() : null;
    }

    private static void setQ(BaseClass _this_, String _value_) {
        ((ExternalNetworkInjection) _this_).setQ(_value_);
    }

    private static String qToString(BaseClass _this_) {
        return ((ExternalNetworkInjection) _this_).qToString();
    }

    /**
     * Priority of unit for use as powerflow voltage phase angle reference bus selection. 0 = don t care (default) 1 = highest priority. 2 is less than 1 and so on.
     */
    private Integer referencePriority; // Integer

    public Integer getReferencePriority() {
        return referencePriority;
    }

    public void setReferencePriority(Integer _value_) {
        referencePriority = _value_;
    }

    public void setReferencePriority(String _value_) {
        referencePriority = getIntegerFromString(_value_);
    }

    public String referencePriorityToString() {
        return referencePriority != null ? referencePriority.toString() : null;
    }

    private static void setReferencePriority(BaseClass _this_, String _value_) {
        ((ExternalNetworkInjection) _this_).setReferencePriority(_value_);
    }

    private static String referencePriorityToString(BaseClass _this_) {
        return ((ExternalNetworkInjection) _this_).referencePriorityToString();
    }

    /**
     * Voltage factor in pu, which was used to calculate short-circuit current Ik` and power Sk`.  Used only if short circuit calculations are done according to superposition method.
     */
    private Double voltageFactor; // PU

    public Double getVoltageFactor() {
        return voltageFactor;
    }

    public void setVoltageFactor(Double _value_) {
        voltageFactor = _value_;
    }

    public void setVoltageFactor(String _value_) {
        voltageFactor = getDoubleFromString(_value_);
    }

    public String voltageFactorToString() {
        return voltageFactor != null ? voltageFactor.toString() : null;
    }

    private static void setVoltageFactor(BaseClass _this_, String _value_) {
        ((ExternalNetworkInjection) _this_).setVoltageFactor(_value_);
    }

    private static String voltageFactorToString(BaseClass _this_) {
        return ((ExternalNetworkInjection) _this_).voltageFactorToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ExternalNetworkInjection", attrName));
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
                "ExternalNetworkInjection", attrName, objectValue));
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
                "ExternalNetworkInjection", attrName, stringValue));
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
            map.put("governorSCD", new AttrDetails("ExternalNetworkInjection.governorSCD", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExternalNetworkInjection::governorSCDToString, null, ExternalNetworkInjection::setGovernorSCD));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("ikSecond", new AttrDetails("ExternalNetworkInjection.ikSecond", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExternalNetworkInjection::ikSecondToString, null, ExternalNetworkInjection::setIkSecond));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("maxInitialSymShCCurrent", new AttrDetails("ExternalNetworkInjection.maxInitialSymShCCurrent", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExternalNetworkInjection::maxInitialSymShCCurrentToString, null, ExternalNetworkInjection::setMaxInitialSymShCCurrent));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("maxP", new AttrDetails("ExternalNetworkInjection.maxP", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExternalNetworkInjection::maxPToString, null, ExternalNetworkInjection::setMaxP));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("maxQ", new AttrDetails("ExternalNetworkInjection.maxQ", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExternalNetworkInjection::maxQToString, null, ExternalNetworkInjection::setMaxQ));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("maxR0ToX0Ratio", new AttrDetails("ExternalNetworkInjection.maxR0ToX0Ratio", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExternalNetworkInjection::maxR0ToX0RatioToString, null, ExternalNetworkInjection::setMaxR0ToX0Ratio));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("maxR1ToX1Ratio", new AttrDetails("ExternalNetworkInjection.maxR1ToX1Ratio", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExternalNetworkInjection::maxR1ToX1RatioToString, null, ExternalNetworkInjection::setMaxR1ToX1Ratio));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("maxZ0ToZ1Ratio", new AttrDetails("ExternalNetworkInjection.maxZ0ToZ1Ratio", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExternalNetworkInjection::maxZ0ToZ1RatioToString, null, ExternalNetworkInjection::setMaxZ0ToZ1Ratio));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("minInitialSymShCCurrent", new AttrDetails("ExternalNetworkInjection.minInitialSymShCCurrent", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExternalNetworkInjection::minInitialSymShCCurrentToString, null, ExternalNetworkInjection::setMinInitialSymShCCurrent));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("minP", new AttrDetails("ExternalNetworkInjection.minP", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExternalNetworkInjection::minPToString, null, ExternalNetworkInjection::setMinP));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("minQ", new AttrDetails("ExternalNetworkInjection.minQ", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExternalNetworkInjection::minQToString, null, ExternalNetworkInjection::setMinQ));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("minR0ToX0Ratio", new AttrDetails("ExternalNetworkInjection.minR0ToX0Ratio", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExternalNetworkInjection::minR0ToX0RatioToString, null, ExternalNetworkInjection::setMinR0ToX0Ratio));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("minR1ToX1Ratio", new AttrDetails("ExternalNetworkInjection.minR1ToX1Ratio", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExternalNetworkInjection::minR1ToX1RatioToString, null, ExternalNetworkInjection::setMinR1ToX1Ratio));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("minZ0ToZ1Ratio", new AttrDetails("ExternalNetworkInjection.minZ0ToZ1Ratio", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExternalNetworkInjection::minZ0ToZ1RatioToString, null, ExternalNetworkInjection::setMinZ0ToZ1Ratio));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("p", new AttrDetails("ExternalNetworkInjection.p", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExternalNetworkInjection::pToString, null, ExternalNetworkInjection::setP));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("q", new AttrDetails("ExternalNetworkInjection.q", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExternalNetworkInjection::qToString, null, ExternalNetworkInjection::setQ));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("referencePriority", new AttrDetails("ExternalNetworkInjection.referencePriority", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExternalNetworkInjection::referencePriorityToString, null, ExternalNetworkInjection::setReferencePriority));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("voltageFactor", new AttrDetails("ExternalNetworkInjection.voltageFactor", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExternalNetworkInjection::voltageFactorToString, null, ExternalNetworkInjection::setVoltageFactor));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExternalNetworkInjection().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.EQ);
        profiles.add(CGMESProfile.SC);
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
