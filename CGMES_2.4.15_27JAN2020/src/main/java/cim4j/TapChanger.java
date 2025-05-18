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
 * Mechanism for changing transformer winding tap positions.
 */
@SuppressWarnings("unused")
public class TapChanger extends PowerSystemResource {

    private static final Logging LOG = Logging.getLogger(TapChanger.class);

    /**
     * Constructor.
     */
    public TapChanger(String rdfid) {
        super("TapChanger", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected TapChanger(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * The tap step state associated with the tap changer.
     *
     * NOT USED
     */
    private SvTapStep SvTapStep; // OneToOne

    public SvTapStep getSvTapStep() {
        return SvTapStep;
    }

    public void setSvTapStep(BaseClass _object_) {
        if (!(_object_ instanceof SvTapStep)) {
            throw new IllegalArgumentException("Object is not SvTapStep");
        }
        if (SvTapStep != _object_) {
            SvTapStep = (SvTapStep) _object_;
            SvTapStep.setTapChanger(this);
        }
    }

    public String SvTapStepToString() {
        return SvTapStep != null ? SvTapStep.getRdfid() : null;
    }

    private static void setSvTapStep(BaseClass _this_, BaseClass _object_) {
        ((TapChanger) _this_).setSvTapStep(_object_);
    }

    private static String SvTapStepToString(BaseClass _this_) {
        return ((TapChanger) _this_).SvTapStepToString();
    }

    /**
     * The tap changers that participates in this regulating tap control scheme.
     */
    private TapChangerControl TapChangerControl; // ManyToOne

    public TapChangerControl getTapChangerControl() {
        return TapChangerControl;
    }

    public void setTapChangerControl(BaseClass _object_) {
        if (!(_object_ instanceof TapChangerControl)) {
            throw new IllegalArgumentException("Object is not TapChangerControl");
        }
        if (TapChangerControl != _object_) {
            TapChangerControl = (TapChangerControl) _object_;
            TapChangerControl.setTapChanger(this);
        }
    }

    public String TapChangerControlToString() {
        return TapChangerControl != null ? TapChangerControl.getRdfid() : null;
    }

    private static void setTapChangerControl(BaseClass _this_, BaseClass _object_) {
        ((TapChanger) _this_).setTapChangerControl(_object_);
    }

    private static String TapChangerControlToString(BaseClass _this_) {
        return ((TapChanger) _this_).TapChangerControlToString();
    }

    /**
     * A TapSchedule is associated with a TapChanger.
     *
     * NOT USED
     */
    private Set<TapSchedule> TapSchedules = new HashSet<>(); // OneToMany

    public Set<TapSchedule> getTapSchedules() {
        return TapSchedules;
    }

    public void setTapSchedules(BaseClass _object_) {
        if (!(_object_ instanceof TapSchedule)) {
            throw new IllegalArgumentException("Object is not TapSchedule");
        }
        if (!TapSchedules.contains(_object_)) {
            TapSchedules.add((TapSchedule) _object_);
            ((TapSchedule) _object_).setTapChanger(this);
        }
    }

    public String TapSchedulesToString() {
        return getStringFromSet(TapSchedules);
    }

    private static void setTapSchedules(BaseClass _this_, BaseClass _object_) {
        ((TapChanger) _this_).setTapSchedules(_object_);
    }

    private static String TapSchedulesToString(BaseClass _this_) {
        return ((TapChanger) _this_).TapSchedulesToString();
    }

    /**
     * Specifies the regulation status of the equipment.  True is regulating, false is not regulating.
     */
    private Boolean controlEnabled; // Boolean

    public Boolean getControlEnabled() {
        return controlEnabled;
    }

    public void setControlEnabled(Boolean _value_) {
        controlEnabled = _value_;
    }

    public void setControlEnabled(String _value_) {
        controlEnabled = getBooleanFromString(_value_);
    }

    public String controlEnabledToString() {
        return controlEnabled != null ? controlEnabled.toString() : null;
    }

    private static void setControlEnabled(BaseClass _this_, String _value_) {
        ((TapChanger) _this_).setControlEnabled(_value_);
    }

    private static String controlEnabledToString(BaseClass _this_) {
        return ((TapChanger) _this_).controlEnabledToString();
    }

    /**
     * Highest possible tap step position, advance from neutral. The attribute shall be greater than lowStep.
     */
    private Integer highStep; // Integer

    public Integer getHighStep() {
        return highStep;
    }

    public void setHighStep(Integer _value_) {
        highStep = _value_;
    }

    public void setHighStep(String _value_) {
        highStep = getIntegerFromString(_value_);
    }

    public String highStepToString() {
        return highStep != null ? highStep.toString() : null;
    }

    private static void setHighStep(BaseClass _this_, String _value_) {
        ((TapChanger) _this_).setHighStep(_value_);
    }

    private static String highStepToString(BaseClass _this_) {
        return ((TapChanger) _this_).highStepToString();
    }

    /**
     * Lowest possible tap step position, retard from neutral
     */
    private Integer lowStep; // Integer

    public Integer getLowStep() {
        return lowStep;
    }

    public void setLowStep(Integer _value_) {
        lowStep = _value_;
    }

    public void setLowStep(String _value_) {
        lowStep = getIntegerFromString(_value_);
    }

    public String lowStepToString() {
        return lowStep != null ? lowStep.toString() : null;
    }

    private static void setLowStep(BaseClass _this_, String _value_) {
        ((TapChanger) _this_).setLowStep(_value_);
    }

    private static String lowStepToString(BaseClass _this_) {
        return ((TapChanger) _this_).lowStepToString();
    }

    /**
     * Specifies whether or not a TapChanger has load tap changing capabilities.
     */
    private Boolean ltcFlag; // Boolean

    public Boolean getLtcFlag() {
        return ltcFlag;
    }

    public void setLtcFlag(Boolean _value_) {
        ltcFlag = _value_;
    }

    public void setLtcFlag(String _value_) {
        ltcFlag = getBooleanFromString(_value_);
    }

    public String ltcFlagToString() {
        return ltcFlag != null ? ltcFlag.toString() : null;
    }

    private static void setLtcFlag(BaseClass _this_, String _value_) {
        ((TapChanger) _this_).setLtcFlag(_value_);
    }

    private static String ltcFlagToString(BaseClass _this_) {
        return ((TapChanger) _this_).ltcFlagToString();
    }

    /**
     * The neutral tap step position for this winding. The attribute shall be equal or greater than lowStep and equal or less than highStep.
     */
    private Integer neutralStep; // Integer

    public Integer getNeutralStep() {
        return neutralStep;
    }

    public void setNeutralStep(Integer _value_) {
        neutralStep = _value_;
    }

    public void setNeutralStep(String _value_) {
        neutralStep = getIntegerFromString(_value_);
    }

    public String neutralStepToString() {
        return neutralStep != null ? neutralStep.toString() : null;
    }

    private static void setNeutralStep(BaseClass _this_, String _value_) {
        ((TapChanger) _this_).setNeutralStep(_value_);
    }

    private static String neutralStepToString(BaseClass _this_) {
        return ((TapChanger) _this_).neutralStepToString();
    }

    /**
     * Voltage at which the winding operates at the neutral tap setting.
     */
    private Double neutralU; // Voltage

    public Double getNeutralU() {
        return neutralU;
    }

    public void setNeutralU(Double _value_) {
        neutralU = _value_;
    }

    public void setNeutralU(String _value_) {
        neutralU = getDoubleFromString(_value_);
    }

    public String neutralUToString() {
        return neutralU != null ? neutralU.toString() : null;
    }

    private static void setNeutralU(BaseClass _this_, String _value_) {
        ((TapChanger) _this_).setNeutralU(_value_);
    }

    private static String neutralUToString(BaseClass _this_) {
        return ((TapChanger) _this_).neutralUToString();
    }

    /**
     * The tap step position used in `normal` network operation for this winding. For a `Fixed` tap changer indicates the current physical tap setting. The attribute shall be equal or greater than lowStep and equal or less than highStep.
     */
    private Integer normalStep; // Integer

    public Integer getNormalStep() {
        return normalStep;
    }

    public void setNormalStep(Integer _value_) {
        normalStep = _value_;
    }

    public void setNormalStep(String _value_) {
        normalStep = getIntegerFromString(_value_);
    }

    public String normalStepToString() {
        return normalStep != null ? normalStep.toString() : null;
    }

    private static void setNormalStep(BaseClass _this_, String _value_) {
        ((TapChanger) _this_).setNormalStep(_value_);
    }

    private static String normalStepToString(BaseClass _this_) {
        return ((TapChanger) _this_).normalStepToString();
    }

    /**
     * Tap changer position. Starting step for a steady state solution. Non integer values are allowed to support continuous tap variables. The reasons for continuous value are to support study cases where no discrete tap changers has yet been designed, a solutions where a narrow voltage band force the tap step to oscillate or accommodate for a continuous solution as input. The attribute shall be equal or greater than lowStep and equal or less than highStep.
     */
    private Double step; // Simple_Float

    public Double getStep() {
        return step;
    }

    public void setStep(Double _value_) {
        step = _value_;
    }

    public void setStep(String _value_) {
        step = getDoubleFromString(_value_);
    }

    public String stepToString() {
        return step != null ? step.toString() : null;
    }

    private static void setStep(BaseClass _this_, String _value_) {
        ((TapChanger) _this_).setStep(_value_);
    }

    private static String stepToString(BaseClass _this_) {
        return ((TapChanger) _this_).stepToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "TapChanger", attrName));
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
                "TapChanger", attrName, objectValue));
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
                "TapChanger", attrName, stringValue));
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
            map.put("SvTapStep", new AttrDetails("TapChanger.SvTapStep", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, TapChanger::SvTapStepToString, TapChanger::setSvTapStep, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("TapChangerControl", new AttrDetails("TapChanger.TapChangerControl", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, TapChanger::TapChangerControlToString, TapChanger::setTapChangerControl, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("TapSchedules", new AttrDetails("TapChanger.TapSchedules", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, TapChanger::TapSchedulesToString, TapChanger::setTapSchedules, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("controlEnabled", new AttrDetails("TapChanger.controlEnabled", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, TapChanger::controlEnabledToString, null, TapChanger::setControlEnabled));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("highStep", new AttrDetails("TapChanger.highStep", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, TapChanger::highStepToString, null, TapChanger::setHighStep));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("lowStep", new AttrDetails("TapChanger.lowStep", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, TapChanger::lowStepToString, null, TapChanger::setLowStep));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("ltcFlag", new AttrDetails("TapChanger.ltcFlag", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, TapChanger::ltcFlagToString, null, TapChanger::setLtcFlag));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("neutralStep", new AttrDetails("TapChanger.neutralStep", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, TapChanger::neutralStepToString, null, TapChanger::setNeutralStep));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("neutralU", new AttrDetails("TapChanger.neutralU", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, TapChanger::neutralUToString, null, TapChanger::setNeutralU));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("normalStep", new AttrDetails("TapChanger.normalStep", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, TapChanger::normalStepToString, null, TapChanger::setNormalStep));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("step", new AttrDetails("TapChanger.step", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, TapChanger::stepToString, null, TapChanger::setStep));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new TapChanger(null).allAttrDetailsMap());
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
