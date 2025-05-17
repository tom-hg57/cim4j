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
 * A tap changer that changes the voltage ratio impacting the voltage magnitude but not the phase angle across the transformer.
 */
@SuppressWarnings("unused")
public class RatioTapChanger extends TapChanger {

    private static final Logging LOG = Logging.getLogger(RatioTapChanger.class);

    /**
     * Default constructor.
     */
    public RatioTapChanger() {
        setCimType("RatioTapChanger");
    }

    /**
     * The ratio tap changer of this tap ratio table.
     */
    private RatioTapChangerTable RatioTapChangerTable; // ManyToOne

    public RatioTapChangerTable getRatioTapChangerTable() {
        return RatioTapChangerTable;
    }

    public void setRatioTapChangerTable(BaseClass _object_) {
        if (!(_object_ instanceof RatioTapChangerTable)) {
            throw new IllegalArgumentException("Object is not RatioTapChangerTable");
        }
        if (RatioTapChangerTable != _object_) {
            RatioTapChangerTable = (RatioTapChangerTable) _object_;
            RatioTapChangerTable.setRatioTapChanger(this);
        }
    }

    public String RatioTapChangerTableToString() {
        return RatioTapChangerTable != null ? RatioTapChangerTable.getRdfid() : null;
    }

    private static void setRatioTapChangerTable(BaseClass _this_, BaseClass _object_) {
        ((RatioTapChanger) _this_).setRatioTapChangerTable(_object_);
    }

    private static String RatioTapChangerTableToString(BaseClass _this_) {
        return ((RatioTapChanger) _this_).RatioTapChangerTableToString();
    }

    /**
     * Ratio tap changer associated with this transformer end.
     */
    private TransformerEnd TransformerEnd; // OneToOne

    public TransformerEnd getTransformerEnd() {
        return TransformerEnd;
    }

    public void setTransformerEnd(BaseClass _object_) {
        if (!(_object_ instanceof TransformerEnd)) {
            throw new IllegalArgumentException("Object is not TransformerEnd");
        }
        if (TransformerEnd != _object_) {
            TransformerEnd = (TransformerEnd) _object_;
            TransformerEnd.setRatioTapChanger(this);
        }
    }

    public String TransformerEndToString() {
        return TransformerEnd != null ? TransformerEnd.getRdfid() : null;
    }

    private static void setTransformerEnd(BaseClass _this_, BaseClass _object_) {
        ((RatioTapChanger) _this_).setTransformerEnd(_object_);
    }

    private static String TransformerEndToString(BaseClass _this_) {
        return ((RatioTapChanger) _this_).TransformerEndToString();
    }

    /**
     * Tap step increment, in per cent of nominal voltage, per step position.
     */
    private Double stepVoltageIncrement; // PerCent

    public Double getStepVoltageIncrement() {
        return stepVoltageIncrement;
    }

    public void setStepVoltageIncrement(Double _value_) {
        stepVoltageIncrement = _value_;
    }

    public void setStepVoltageIncrement(String _value_) {
        stepVoltageIncrement = getDoubleFromString(_value_);
    }

    public String stepVoltageIncrementToString() {
        return stepVoltageIncrement != null ? stepVoltageIncrement.toString() : null;
    }

    private static void setStepVoltageIncrement(BaseClass _this_, String _value_) {
        ((RatioTapChanger) _this_).setStepVoltageIncrement(_value_);
    }

    private static String stepVoltageIncrementToString(BaseClass _this_) {
        return ((RatioTapChanger) _this_).stepVoltageIncrementToString();
    }

    /**
     * Specifies the regulation control mode (voltage or reactive) of the RatioTapChanger.
     */
    private String tculControlMode; // TransformerControlMode

    public String getTculControlMode() {
        return tculControlMode;
    }

    public void setTculControlMode(String _value_) {
        tculControlMode = _value_;
    }

    public String tculControlModeToString() {
        return tculControlMode;
    }

    private static void setTculControlMode(BaseClass _this_, String _value_) {
        ((RatioTapChanger) _this_).setTculControlMode(_value_);
    }

    private static String tculControlModeToString(BaseClass _this_) {
        return ((RatioTapChanger) _this_).tculControlModeToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "RatioTapChanger", attrName));
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
                "RatioTapChanger", attrName, objectValue));
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
                "RatioTapChanger", attrName, stringValue));
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
            map.put("RatioTapChangerTable", new AttrDetails("RatioTapChanger.RatioTapChangerTable", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, RatioTapChanger::RatioTapChangerTableToString, RatioTapChanger::setRatioTapChangerTable, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("TransformerEnd", new AttrDetails("RatioTapChanger.TransformerEnd", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, RatioTapChanger::TransformerEndToString, RatioTapChanger::setTransformerEnd, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("stepVoltageIncrement", new AttrDetails("RatioTapChanger.stepVoltageIncrement", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, RatioTapChanger::stepVoltageIncrementToString, null, RatioTapChanger::setStepVoltageIncrement));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("tculControlMode", new AttrDetails("RatioTapChanger.tculControlMode", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true, RatioTapChanger::tculControlModeToString, null, RatioTapChanger::setTculControlMode));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new RatioTapChanger().allAttrDetailsMap());
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
