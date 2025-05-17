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
 * DC side of the voltage source converter (VSC).
 */
@SuppressWarnings("unused")
public class VsConverter extends ACDCConverter {

    private static final Logging LOG = Logging.getLogger(VsConverter.class);

    /**
     * Default constructor.
     */
    public VsConverter() {
        setCimType("VsConverter");
    }

    /**
     * All converters with this capability curve.
     */
    private VsCapabilityCurve CapabilityCurve; // ManyToOne

    public VsCapabilityCurve getCapabilityCurve() {
        return CapabilityCurve;
    }

    public void setCapabilityCurve(BaseClass _object_) {
        if (!(_object_ instanceof VsCapabilityCurve)) {
            throw new IllegalArgumentException("Object is not VsCapabilityCurve");
        }
        if (CapabilityCurve != _object_) {
            CapabilityCurve = (VsCapabilityCurve) _object_;
            CapabilityCurve.setVsConverterDCSides(this);
        }
    }

    public String CapabilityCurveToString() {
        return CapabilityCurve != null ? CapabilityCurve.getRdfid() : null;
    }

    private static void setCapabilityCurve(BaseClass _this_, BaseClass _object_) {
        ((VsConverter) _this_).setCapabilityCurve(_object_);
    }

    private static String CapabilityCurveToString(BaseClass _this_) {
        return ((VsConverter) _this_).CapabilityCurveToString();
    }

    /**
     * Angle between uf and uc. Converter state variable used in power flow.
     */
    private Double delta; // AngleDegrees

    public Double getDelta() {
        return delta;
    }

    public void setDelta(Double _value_) {
        delta = _value_;
    }

    public void setDelta(String _value_) {
        delta = getDoubleFromString(_value_);
    }

    public String deltaToString() {
        return delta != null ? delta.toString() : null;
    }

    private static void setDelta(BaseClass _this_, String _value_) {
        ((VsConverter) _this_).setDelta(_value_);
    }

    private static String deltaToString(BaseClass _this_) {
        return ((VsConverter) _this_).deltaToString();
    }

    /**
     * Droop constant; pu value is obtained as D [kV^2 / MW] x Sb / Ubdc^2.
     */
    private Double droop; // PU

    public Double getDroop() {
        return droop;
    }

    public void setDroop(Double _value_) {
        droop = _value_;
    }

    public void setDroop(String _value_) {
        droop = getDoubleFromString(_value_);
    }

    public String droopToString() {
        return droop != null ? droop.toString() : null;
    }

    private static void setDroop(BaseClass _this_, String _value_) {
        ((VsConverter) _this_).setDroop(_value_);
    }

    private static String droopToString(BaseClass _this_) {
        return ((VsConverter) _this_).droopToString();
    }

    /**
     * Compensation (resistance) constant. Used to compensate for voltage drop when controlling voltage at a distant bus.
     */
    private Double droopCompensation; // Resistance

    public Double getDroopCompensation() {
        return droopCompensation;
    }

    public void setDroopCompensation(Double _value_) {
        droopCompensation = _value_;
    }

    public void setDroopCompensation(String _value_) {
        droopCompensation = getDoubleFromString(_value_);
    }

    public String droopCompensationToString() {
        return droopCompensation != null ? droopCompensation.toString() : null;
    }

    private static void setDroopCompensation(BaseClass _this_, String _value_) {
        ((VsConverter) _this_).setDroopCompensation(_value_);
    }

    private static String droopCompensationToString(BaseClass _this_) {
        return ((VsConverter) _this_).droopCompensationToString();
    }

    /**
     * The max quotient between the AC converter voltage (Uc) and DC voltage (Ud). A factor typically less than 1. VSC configuration data used in power flow.
     */
    private Double maxModulationIndex; // Simple_Float

    public Double getMaxModulationIndex() {
        return maxModulationIndex;
    }

    public void setMaxModulationIndex(Double _value_) {
        maxModulationIndex = _value_;
    }

    public void setMaxModulationIndex(String _value_) {
        maxModulationIndex = getDoubleFromString(_value_);
    }

    public String maxModulationIndexToString() {
        return maxModulationIndex != null ? maxModulationIndex.toString() : null;
    }

    private static void setMaxModulationIndex(BaseClass _this_, String _value_) {
        ((VsConverter) _this_).setMaxModulationIndex(_value_);
    }

    private static String maxModulationIndexToString(BaseClass _this_) {
        return ((VsConverter) _this_).maxModulationIndexToString();
    }

    /**
     * The maximum current through a valve. This current limit is the basis for calculating the capability diagram. VSC  configuration data.
     */
    private Double maxValveCurrent; // CurrentFlow

    public Double getMaxValveCurrent() {
        return maxValveCurrent;
    }

    public void setMaxValveCurrent(Double _value_) {
        maxValveCurrent = _value_;
    }

    public void setMaxValveCurrent(String _value_) {
        maxValveCurrent = getDoubleFromString(_value_);
    }

    public String maxValveCurrentToString() {
        return maxValveCurrent != null ? maxValveCurrent.toString() : null;
    }

    private static void setMaxValveCurrent(BaseClass _this_, String _value_) {
        ((VsConverter) _this_).setMaxValveCurrent(_value_);
    }

    private static String maxValveCurrentToString(BaseClass _this_) {
        return ((VsConverter) _this_).maxValveCurrentToString();
    }

    /**
     * Kind of control of real power and/or DC voltage.
     */
    private String pPccControl; // VsPpccControlKind

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
        ((VsConverter) _this_).setPPccControl(_value_);
    }

    private static String pPccControlToString(BaseClass _this_) {
        return ((VsConverter) _this_).pPccControlToString();
    }

    /**
     */
    private String qPccControl; // VsQpccControlKind

    public String getQPccControl() {
        return qPccControl;
    }

    public void setQPccControl(String _value_) {
        qPccControl = _value_;
    }

    public String qPccControlToString() {
        return qPccControl;
    }

    private static void setQPccControl(BaseClass _this_, String _value_) {
        ((VsConverter) _this_).setQPccControl(_value_);
    }

    private static String qPccControlToString(BaseClass _this_) {
        return ((VsConverter) _this_).qPccControlToString();
    }

    /**
     * Reactive power sharing factor among parallel converters on Uac control.
     */
    private Double qShare; // PerCent

    public Double getQShare() {
        return qShare;
    }

    public void setQShare(Double _value_) {
        qShare = _value_;
    }

    public void setQShare(String _value_) {
        qShare = getDoubleFromString(_value_);
    }

    public String qShareToString() {
        return qShare != null ? qShare.toString() : null;
    }

    private static void setQShare(BaseClass _this_, String _value_) {
        ((VsConverter) _this_).setQShare(_value_);
    }

    private static String qShareToString(BaseClass _this_) {
        return ((VsConverter) _this_).qShareToString();
    }

    /**
     * Reactive power injection target in AC grid, at point of common coupling.
     */
    private Double targetQpcc; // ReactivePower

    public Double getTargetQpcc() {
        return targetQpcc;
    }

    public void setTargetQpcc(Double _value_) {
        targetQpcc = _value_;
    }

    public void setTargetQpcc(String _value_) {
        targetQpcc = getDoubleFromString(_value_);
    }

    public String targetQpccToString() {
        return targetQpcc != null ? targetQpcc.toString() : null;
    }

    private static void setTargetQpcc(BaseClass _this_, String _value_) {
        ((VsConverter) _this_).setTargetQpcc(_value_);
    }

    private static String targetQpccToString(BaseClass _this_) {
        return ((VsConverter) _this_).targetQpccToString();
    }

    /**
     * Voltage target in AC grid, at point of common coupling.
     */
    private Double targetUpcc; // Voltage

    public Double getTargetUpcc() {
        return targetUpcc;
    }

    public void setTargetUpcc(Double _value_) {
        targetUpcc = _value_;
    }

    public void setTargetUpcc(String _value_) {
        targetUpcc = getDoubleFromString(_value_);
    }

    public String targetUpccToString() {
        return targetUpcc != null ? targetUpcc.toString() : null;
    }

    private static void setTargetUpcc(BaseClass _this_, String _value_) {
        ((VsConverter) _this_).setTargetUpcc(_value_);
    }

    private static String targetUpccToString(BaseClass _this_) {
        return ((VsConverter) _this_).targetUpccToString();
    }

    /**
     * Filter bus voltage. Converter state variable, result from power flow.
     */
    private Double uf; // Voltage

    public Double getUf() {
        return uf;
    }

    public void setUf(Double _value_) {
        uf = _value_;
    }

    public void setUf(String _value_) {
        uf = getDoubleFromString(_value_);
    }

    public String ufToString() {
        return uf != null ? uf.toString() : null;
    }

    private static void setUf(BaseClass _this_, String _value_) {
        ((VsConverter) _this_).setUf(_value_);
    }

    private static String ufToString(BaseClass _this_) {
        return ((VsConverter) _this_).ufToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "VsConverter", attrName));
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
                "VsConverter", attrName, objectValue));
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
                "VsConverter", attrName, stringValue));
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
            map.put("CapabilityCurve", new AttrDetails("VsConverter.CapabilityCurve", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, VsConverter::CapabilityCurveToString, VsConverter::setCapabilityCurve, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SV);
            map.put("delta", new AttrDetails("VsConverter.delta", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, VsConverter::deltaToString, null, VsConverter::setDelta));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("droop", new AttrDetails("VsConverter.droop", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, VsConverter::droopToString, null, VsConverter::setDroop));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("droopCompensation", new AttrDetails("VsConverter.droopCompensation", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, VsConverter::droopCompensationToString, null, VsConverter::setDroopCompensation));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("maxModulationIndex", new AttrDetails("VsConverter.maxModulationIndex", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, VsConverter::maxModulationIndexToString, null, VsConverter::setMaxModulationIndex));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("maxValveCurrent", new AttrDetails("VsConverter.maxValveCurrent", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, VsConverter::maxValveCurrentToString, null, VsConverter::setMaxValveCurrent));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("pPccControl", new AttrDetails("VsConverter.pPccControl", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true, VsConverter::pPccControlToString, null, VsConverter::setPPccControl));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("qPccControl", new AttrDetails("VsConverter.qPccControl", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true, VsConverter::qPccControlToString, null, VsConverter::setQPccControl));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("qShare", new AttrDetails("VsConverter.qShare", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, VsConverter::qShareToString, null, VsConverter::setQShare));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("targetQpcc", new AttrDetails("VsConverter.targetQpcc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, VsConverter::targetQpccToString, null, VsConverter::setTargetQpcc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("targetUpcc", new AttrDetails("VsConverter.targetUpcc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, VsConverter::targetUpccToString, null, VsConverter::setTargetUpcc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SV);
            map.put("uf", new AttrDetails("VsConverter.uf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, VsConverter::ufToString, null, VsConverter::setUf));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new VsConverter().allAttrDetailsMap());
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
