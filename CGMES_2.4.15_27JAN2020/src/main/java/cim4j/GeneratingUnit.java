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
 * A single or set of synchronous machines for converting mechanical power into alternating-current power. For example, individual machines within a set may be defined for scheduling purposes while a single control signal is derived for the set. In this case there would be a GeneratingUnit for each member of the set and an additional GeneratingUnit corresponding to the set.
 */
@SuppressWarnings("unused")
public class GeneratingUnit extends Equipment {

    private static final Logging LOG = Logging.getLogger(GeneratingUnit.class);

    /**
     * Constructor.
     */
    public GeneratingUnit(String rdfid) {
        super("GeneratingUnit", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected GeneratingUnit(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * ControlArea specifications for this generating unit.
     *
     * NOT USED
     */
    private Set<ControlAreaGeneratingUnit> ControlAreaGeneratingUnit = new HashSet<>(); // OneToMany

    public Set<ControlAreaGeneratingUnit> getControlAreaGeneratingUnit() {
        return ControlAreaGeneratingUnit;
    }

    public void setControlAreaGeneratingUnit(BaseClass _object_) {
        if (!(_object_ instanceof ControlAreaGeneratingUnit)) {
            throw new IllegalArgumentException("Object is not ControlAreaGeneratingUnit");
        }
        if (!ControlAreaGeneratingUnit.contains(_object_)) {
            ControlAreaGeneratingUnit.add((ControlAreaGeneratingUnit) _object_);
            ((ControlAreaGeneratingUnit) _object_).setGeneratingUnit(this);
        }
    }

    public String ControlAreaGeneratingUnitToString() {
        return getStringFromSet(ControlAreaGeneratingUnit);
    }

    private static void setControlAreaGeneratingUnit(BaseClass _this_, BaseClass _object_) {
        ((GeneratingUnit) _this_).setControlAreaGeneratingUnit(_object_);
    }

    private static String ControlAreaGeneratingUnitToString(BaseClass _this_) {
        return ((GeneratingUnit) _this_).ControlAreaGeneratingUnitToString();
    }

    /**
     * A generating unit may have a gross active power to net active power curve, describing the losses and auxiliary power requirements of the unit.
     *
     * NOT USED
     */
    private Set<GrossToNetActivePowerCurve> GrossToNetActivePowerCurves = new HashSet<>(); // OneToMany

    public Set<GrossToNetActivePowerCurve> getGrossToNetActivePowerCurves() {
        return GrossToNetActivePowerCurves;
    }

    public void setGrossToNetActivePowerCurves(BaseClass _object_) {
        if (!(_object_ instanceof GrossToNetActivePowerCurve)) {
            throw new IllegalArgumentException("Object is not GrossToNetActivePowerCurve");
        }
        if (!GrossToNetActivePowerCurves.contains(_object_)) {
            GrossToNetActivePowerCurves.add((GrossToNetActivePowerCurve) _object_);
            ((GrossToNetActivePowerCurve) _object_).setGeneratingUnit(this);
        }
    }

    public String GrossToNetActivePowerCurvesToString() {
        return getStringFromSet(GrossToNetActivePowerCurves);
    }

    private static void setGrossToNetActivePowerCurves(BaseClass _this_, BaseClass _object_) {
        ((GeneratingUnit) _this_).setGrossToNetActivePowerCurves(_object_);
    }

    private static String GrossToNetActivePowerCurvesToString(BaseClass _this_) {
        return ((GeneratingUnit) _this_).GrossToNetActivePowerCurvesToString();
    }

    /**
     * A synchronous machine may operate as a generator and as such becomes a member of a generating unit.
     *
     * NOT USED
     */
    private Set<RotatingMachine> RotatingMachine = new HashSet<>(); // OneToMany

    public Set<RotatingMachine> getRotatingMachine() {
        return RotatingMachine;
    }

    public void setRotatingMachine(BaseClass _object_) {
        if (!(_object_ instanceof RotatingMachine)) {
            throw new IllegalArgumentException("Object is not RotatingMachine");
        }
        if (!RotatingMachine.contains(_object_)) {
            RotatingMachine.add((RotatingMachine) _object_);
            ((RotatingMachine) _object_).setGeneratingUnit(this);
        }
    }

    public String RotatingMachineToString() {
        return getStringFromSet(RotatingMachine);
    }

    private static void setRotatingMachine(BaseClass _this_, BaseClass _object_) {
        ((GeneratingUnit) _this_).setRotatingMachine(_object_);
    }

    private static String RotatingMachineToString(BaseClass _this_) {
        return ((GeneratingUnit) _this_).RotatingMachineToString();
    }

    /**
     * The source of controls for a generating unit.
     */
    private String genControlSource; // GeneratorControlSource

    public String getGenControlSource() {
        return genControlSource;
    }

    public void setGenControlSource(String _value_) {
        genControlSource = _value_;
    }

    public String genControlSourceToString() {
        return genControlSource;
    }

    private static void setGenControlSource(BaseClass _this_, String _value_) {
        ((GeneratingUnit) _this_).setGenControlSource(_value_);
    }

    private static String genControlSourceToString(BaseClass _this_) {
        return ((GeneratingUnit) _this_).genControlSourceToString();
    }

    /**
     * Governor Speed Changer Droop.   This is the change in generator power output divided by the change in frequency normalized by the nominal power of the generator and the nominal frequency and expressed in percent and negated. A positive value of speed change droop provides additional generator output upon a drop in frequency.
     */
    private Double governorSCD; // PerCent

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
        ((GeneratingUnit) _this_).setGovernorSCD(_value_);
    }

    private static String governorSCDToString(BaseClass _this_) {
        return ((GeneratingUnit) _this_).governorSCDToString();
    }

    /**
     * Default initial active power  which is used to store a powerflow result for the initial active power for this unit in this network configuration.
     */
    private Double initialP; // ActivePower

    public Double getInitialP() {
        return initialP;
    }

    public void setInitialP(Double _value_) {
        initialP = _value_;
    }

    public void setInitialP(String _value_) {
        initialP = getDoubleFromString(_value_);
    }

    public String initialPToString() {
        return initialP != null ? initialP.toString() : null;
    }

    private static void setInitialP(BaseClass _this_, String _value_) {
        ((GeneratingUnit) _this_).setInitialP(_value_);
    }

    private static String initialPToString(BaseClass _this_) {
        return ((GeneratingUnit) _this_).initialPToString();
    }

    /**
     * Generating unit long term economic participation factor.
     */
    private Double longPF; // Simple_Float

    public Double getLongPF() {
        return longPF;
    }

    public void setLongPF(Double _value_) {
        longPF = _value_;
    }

    public void setLongPF(String _value_) {
        longPF = getDoubleFromString(_value_);
    }

    public String longPFToString() {
        return longPF != null ? longPF.toString() : null;
    }

    private static void setLongPF(BaseClass _this_, String _value_) {
        ((GeneratingUnit) _this_).setLongPF(_value_);
    }

    private static String longPFToString(BaseClass _this_) {
        return ((GeneratingUnit) _this_).longPFToString();
    }

    /**
     * This is the maximum operating active power limit the dispatcher can enter for this unit.
     */
    private Double maxOperatingP; // ActivePower

    public Double getMaxOperatingP() {
        return maxOperatingP;
    }

    public void setMaxOperatingP(Double _value_) {
        maxOperatingP = _value_;
    }

    public void setMaxOperatingP(String _value_) {
        maxOperatingP = getDoubleFromString(_value_);
    }

    public String maxOperatingPToString() {
        return maxOperatingP != null ? maxOperatingP.toString() : null;
    }

    private static void setMaxOperatingP(BaseClass _this_, String _value_) {
        ((GeneratingUnit) _this_).setMaxOperatingP(_value_);
    }

    private static String maxOperatingPToString(BaseClass _this_) {
        return ((GeneratingUnit) _this_).maxOperatingPToString();
    }

    /**
     * Maximum allowable spinning reserve. Spinning reserve will never be considered greater than this value regardless of the current operating point.
     */
    private Double maximumAllowableSpinningReserve; // ActivePower

    public Double getMaximumAllowableSpinningReserve() {
        return maximumAllowableSpinningReserve;
    }

    public void setMaximumAllowableSpinningReserve(Double _value_) {
        maximumAllowableSpinningReserve = _value_;
    }

    public void setMaximumAllowableSpinningReserve(String _value_) {
        maximumAllowableSpinningReserve = getDoubleFromString(_value_);
    }

    public String maximumAllowableSpinningReserveToString() {
        return maximumAllowableSpinningReserve != null ? maximumAllowableSpinningReserve.toString() : null;
    }

    private static void setMaximumAllowableSpinningReserve(BaseClass _this_, String _value_) {
        ((GeneratingUnit) _this_).setMaximumAllowableSpinningReserve(_value_);
    }

    private static String maximumAllowableSpinningReserveToString(BaseClass _this_) {
        return ((GeneratingUnit) _this_).maximumAllowableSpinningReserveToString();
    }

    /**
     * This is the minimum operating active power limit the dispatcher can enter for this unit.
     */
    private Double minOperatingP; // ActivePower

    public Double getMinOperatingP() {
        return minOperatingP;
    }

    public void setMinOperatingP(Double _value_) {
        minOperatingP = _value_;
    }

    public void setMinOperatingP(String _value_) {
        minOperatingP = getDoubleFromString(_value_);
    }

    public String minOperatingPToString() {
        return minOperatingP != null ? minOperatingP.toString() : null;
    }

    private static void setMinOperatingP(BaseClass _this_, String _value_) {
        ((GeneratingUnit) _this_).setMinOperatingP(_value_);
    }

    private static String minOperatingPToString(BaseClass _this_) {
        return ((GeneratingUnit) _this_).minOperatingPToString();
    }

    /**
     * The nominal power of the generating unit.  Used to give precise meaning to percentage based attributes such as the governor speed change droop (governorSCD attribute). The attribute shall be a positive value equal or less than RotatingMachine.ratedS.
     */
    private Double nominalP; // ActivePower

    public Double getNominalP() {
        return nominalP;
    }

    public void setNominalP(Double _value_) {
        nominalP = _value_;
    }

    public void setNominalP(String _value_) {
        nominalP = getDoubleFromString(_value_);
    }

    public String nominalPToString() {
        return nominalP != null ? nominalP.toString() : null;
    }

    private static void setNominalP(BaseClass _this_, String _value_) {
        ((GeneratingUnit) _this_).setNominalP(_value_);
    }

    private static String nominalPToString(BaseClass _this_) {
        return ((GeneratingUnit) _this_).nominalPToString();
    }

    /**
     * Generating unit economic participation factor.
     */
    private Double normalPF; // Simple_Float

    public Double getNormalPF() {
        return normalPF;
    }

    public void setNormalPF(Double _value_) {
        normalPF = _value_;
    }

    public void setNormalPF(String _value_) {
        normalPF = getDoubleFromString(_value_);
    }

    public String normalPFToString() {
        return normalPF != null ? normalPF.toString() : null;
    }

    private static void setNormalPF(BaseClass _this_, String _value_) {
        ((GeneratingUnit) _this_).setNormalPF(_value_);
    }

    private static String normalPFToString(BaseClass _this_) {
        return ((GeneratingUnit) _this_).normalPFToString();
    }

    /**
     * The unit`s gross rated maximum capacity (book value).
     */
    private Double ratedGrossMaxP; // ActivePower

    public Double getRatedGrossMaxP() {
        return ratedGrossMaxP;
    }

    public void setRatedGrossMaxP(Double _value_) {
        ratedGrossMaxP = _value_;
    }

    public void setRatedGrossMaxP(String _value_) {
        ratedGrossMaxP = getDoubleFromString(_value_);
    }

    public String ratedGrossMaxPToString() {
        return ratedGrossMaxP != null ? ratedGrossMaxP.toString() : null;
    }

    private static void setRatedGrossMaxP(BaseClass _this_, String _value_) {
        ((GeneratingUnit) _this_).setRatedGrossMaxP(_value_);
    }

    private static String ratedGrossMaxPToString(BaseClass _this_) {
        return ((GeneratingUnit) _this_).ratedGrossMaxPToString();
    }

    /**
     * The gross rated minimum generation level which the unit can safely operate at while delivering power to the transmission grid.
     */
    private Double ratedGrossMinP; // ActivePower

    public Double getRatedGrossMinP() {
        return ratedGrossMinP;
    }

    public void setRatedGrossMinP(Double _value_) {
        ratedGrossMinP = _value_;
    }

    public void setRatedGrossMinP(String _value_) {
        ratedGrossMinP = getDoubleFromString(_value_);
    }

    public String ratedGrossMinPToString() {
        return ratedGrossMinP != null ? ratedGrossMinP.toString() : null;
    }

    private static void setRatedGrossMinP(BaseClass _this_, String _value_) {
        ((GeneratingUnit) _this_).setRatedGrossMinP(_value_);
    }

    private static String ratedGrossMinPToString(BaseClass _this_) {
        return ((GeneratingUnit) _this_).ratedGrossMinPToString();
    }

    /**
     * The net rated maximum capacity determined by subtracting the auxiliary power used to operate the internal plant machinery from the rated gross maximum capacity.
     */
    private Double ratedNetMaxP; // ActivePower

    public Double getRatedNetMaxP() {
        return ratedNetMaxP;
    }

    public void setRatedNetMaxP(Double _value_) {
        ratedNetMaxP = _value_;
    }

    public void setRatedNetMaxP(String _value_) {
        ratedNetMaxP = getDoubleFromString(_value_);
    }

    public String ratedNetMaxPToString() {
        return ratedNetMaxP != null ? ratedNetMaxP.toString() : null;
    }

    private static void setRatedNetMaxP(BaseClass _this_, String _value_) {
        ((GeneratingUnit) _this_).setRatedNetMaxP(_value_);
    }

    private static String ratedNetMaxPToString(BaseClass _this_) {
        return ((GeneratingUnit) _this_).ratedNetMaxPToString();
    }

    /**
     * Generating unit short term economic participation factor.
     */
    private Double shortPF; // Simple_Float

    public Double getShortPF() {
        return shortPF;
    }

    public void setShortPF(Double _value_) {
        shortPF = _value_;
    }

    public void setShortPF(String _value_) {
        shortPF = getDoubleFromString(_value_);
    }

    public String shortPFToString() {
        return shortPF != null ? shortPF.toString() : null;
    }

    private static void setShortPF(BaseClass _this_, String _value_) {
        ((GeneratingUnit) _this_).setShortPF(_value_);
    }

    private static String shortPFToString(BaseClass _this_) {
        return ((GeneratingUnit) _this_).shortPFToString();
    }

    /**
     * The initial startup cost incurred for each start of the GeneratingUnit.
     */
    private Double startupCost; // Money

    public Double getStartupCost() {
        return startupCost;
    }

    public void setStartupCost(Double _value_) {
        startupCost = _value_;
    }

    public void setStartupCost(String _value_) {
        startupCost = getDoubleFromString(_value_);
    }

    public String startupCostToString() {
        return startupCost != null ? startupCost.toString() : null;
    }

    private static void setStartupCost(BaseClass _this_, String _value_) {
        ((GeneratingUnit) _this_).setStartupCost(_value_);
    }

    private static String startupCostToString(BaseClass _this_) {
        return ((GeneratingUnit) _this_).startupCostToString();
    }

    /**
     * The efficiency of the unit in converting the fuel into electrical energy.
     */
    private Double totalEfficiency; // PerCent

    public Double getTotalEfficiency() {
        return totalEfficiency;
    }

    public void setTotalEfficiency(Double _value_) {
        totalEfficiency = _value_;
    }

    public void setTotalEfficiency(String _value_) {
        totalEfficiency = getDoubleFromString(_value_);
    }

    public String totalEfficiencyToString() {
        return totalEfficiency != null ? totalEfficiency.toString() : null;
    }

    private static void setTotalEfficiency(BaseClass _this_, String _value_) {
        ((GeneratingUnit) _this_).setTotalEfficiency(_value_);
    }

    private static String totalEfficiencyToString(BaseClass _this_) {
        return ((GeneratingUnit) _this_).totalEfficiencyToString();
    }

    /**
     * The variable cost component of production per unit of ActivePower.
     */
    private Double variableCost; // Money

    public Double getVariableCost() {
        return variableCost;
    }

    public void setVariableCost(Double _value_) {
        variableCost = _value_;
    }

    public void setVariableCost(String _value_) {
        variableCost = getDoubleFromString(_value_);
    }

    public String variableCostToString() {
        return variableCost != null ? variableCost.toString() : null;
    }

    private static void setVariableCost(BaseClass _this_, String _value_) {
        ((GeneratingUnit) _this_).setVariableCost(_value_);
    }

    private static String variableCostToString(BaseClass _this_) {
        return ((GeneratingUnit) _this_).variableCostToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "GeneratingUnit", attrName));
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
                "GeneratingUnit", attrName, objectValue));
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
                "GeneratingUnit", attrName, stringValue));
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
            profiles.add(CGMESProfile.EQ);
            map.put("ControlAreaGeneratingUnit", new AttrDetails("GeneratingUnit.ControlAreaGeneratingUnit", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, GeneratingUnit::ControlAreaGeneratingUnitToString, GeneratingUnit::setControlAreaGeneratingUnit, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("GrossToNetActivePowerCurves", new AttrDetails("GeneratingUnit.GrossToNetActivePowerCurves", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, GeneratingUnit::GrossToNetActivePowerCurvesToString, GeneratingUnit::setGrossToNetActivePowerCurves, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("RotatingMachine", new AttrDetails("GeneratingUnit.RotatingMachine", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, GeneratingUnit::RotatingMachineToString, GeneratingUnit::setRotatingMachine, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("genControlSource", new AttrDetails("GeneratingUnit.genControlSource", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true, GeneratingUnit::genControlSourceToString, null, GeneratingUnit::setGenControlSource));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("governorSCD", new AttrDetails("GeneratingUnit.governorSCD", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GeneratingUnit::governorSCDToString, null, GeneratingUnit::setGovernorSCD));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("initialP", new AttrDetails("GeneratingUnit.initialP", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GeneratingUnit::initialPToString, null, GeneratingUnit::setInitialP));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("longPF", new AttrDetails("GeneratingUnit.longPF", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GeneratingUnit::longPFToString, null, GeneratingUnit::setLongPF));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("maxOperatingP", new AttrDetails("GeneratingUnit.maxOperatingP", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GeneratingUnit::maxOperatingPToString, null, GeneratingUnit::setMaxOperatingP));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("maximumAllowableSpinningReserve", new AttrDetails("GeneratingUnit.maximumAllowableSpinningReserve", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GeneratingUnit::maximumAllowableSpinningReserveToString, null, GeneratingUnit::setMaximumAllowableSpinningReserve));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("minOperatingP", new AttrDetails("GeneratingUnit.minOperatingP", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GeneratingUnit::minOperatingPToString, null, GeneratingUnit::setMinOperatingP));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("nominalP", new AttrDetails("GeneratingUnit.nominalP", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GeneratingUnit::nominalPToString, null, GeneratingUnit::setNominalP));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("normalPF", new AttrDetails("GeneratingUnit.normalPF", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GeneratingUnit::normalPFToString, null, GeneratingUnit::setNormalPF));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("ratedGrossMaxP", new AttrDetails("GeneratingUnit.ratedGrossMaxP", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GeneratingUnit::ratedGrossMaxPToString, null, GeneratingUnit::setRatedGrossMaxP));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("ratedGrossMinP", new AttrDetails("GeneratingUnit.ratedGrossMinP", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GeneratingUnit::ratedGrossMinPToString, null, GeneratingUnit::setRatedGrossMinP));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("ratedNetMaxP", new AttrDetails("GeneratingUnit.ratedNetMaxP", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GeneratingUnit::ratedNetMaxPToString, null, GeneratingUnit::setRatedNetMaxP));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("shortPF", new AttrDetails("GeneratingUnit.shortPF", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GeneratingUnit::shortPFToString, null, GeneratingUnit::setShortPF));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("startupCost", new AttrDetails("GeneratingUnit.startupCost", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GeneratingUnit::startupCostToString, null, GeneratingUnit::setStartupCost));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("totalEfficiency", new AttrDetails("GeneratingUnit.totalEfficiency", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GeneratingUnit::totalEfficiencyToString, null, GeneratingUnit::setTotalEfficiency));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("variableCost", new AttrDetails("GeneratingUnit.variableCost", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GeneratingUnit::variableCostToString, null, GeneratingUnit::setVariableCost));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new GeneratingUnit(null).allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.EQ);
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
