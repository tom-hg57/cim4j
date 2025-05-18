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
 * Look up table for the purpose of wind standard models.
 */
@SuppressWarnings("unused")
public class WindDynamicsLookupTable extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(WindDynamicsLookupTable.class);

    /**
     * Constructor.
     */
    public WindDynamicsLookupTable(String rdfid) {
        super("WindDynamicsLookupTable", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected WindDynamicsLookupTable(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * The current control limitation model with which this wind dynamics lookup table is associated.
     */
    private WindContCurrLimIEC WindContCurrLimIEC; // ManyToOne

    public WindContCurrLimIEC getWindContCurrLimIEC() {
        return WindContCurrLimIEC;
    }

    public void setWindContCurrLimIEC(BaseClass _object_) {
        if (!(_object_ instanceof WindContCurrLimIEC)) {
            throw new IllegalArgumentException("Object is not WindContCurrLimIEC");
        }
        if (WindContCurrLimIEC != _object_) {
            WindContCurrLimIEC = (WindContCurrLimIEC) _object_;
            WindContCurrLimIEC.setWindDynamicsLookupTable(this);
        }
    }

    public String WindContCurrLimIECToString() {
        return WindContCurrLimIEC != null ? WindContCurrLimIEC.getRdfid() : null;
    }

    private static void setWindContCurrLimIEC(BaseClass _this_, BaseClass _object_) {
        ((WindDynamicsLookupTable) _this_).setWindContCurrLimIEC(_object_);
    }

    private static String WindContCurrLimIECToString(BaseClass _this_) {
        return ((WindDynamicsLookupTable) _this_).WindContCurrLimIECToString();
    }

    /**
     * The P control type 3 model with which this wind dynamics lookup table is associated.
     */
    private WindContPType3IEC WindContPType3IEC; // ManyToOne

    public WindContPType3IEC getWindContPType3IEC() {
        return WindContPType3IEC;
    }

    public void setWindContPType3IEC(BaseClass _object_) {
        if (!(_object_ instanceof WindContPType3IEC)) {
            throw new IllegalArgumentException("Object is not WindContPType3IEC");
        }
        if (WindContPType3IEC != _object_) {
            WindContPType3IEC = (WindContPType3IEC) _object_;
            WindContPType3IEC.setWindDynamicsLookupTable(this);
        }
    }

    public String WindContPType3IECToString() {
        return WindContPType3IEC != null ? WindContPType3IEC.getRdfid() : null;
    }

    private static void setWindContPType3IEC(BaseClass _this_, BaseClass _object_) {
        ((WindDynamicsLookupTable) _this_).setWindContPType3IEC(_object_);
    }

    private static String WindContPType3IECToString(BaseClass _this_) {
        return ((WindDynamicsLookupTable) _this_).WindContPType3IECToString();
    }

    /**
     * The QP and QU limitation model with which this wind dynamics lookup table is associated.
     */
    private WindContQPQULimIEC WindContQPQULimIEC; // ManyToOne

    public WindContQPQULimIEC getWindContQPQULimIEC() {
        return WindContQPQULimIEC;
    }

    public void setWindContQPQULimIEC(BaseClass _object_) {
        if (!(_object_ instanceof WindContQPQULimIEC)) {
            throw new IllegalArgumentException("Object is not WindContQPQULimIEC");
        }
        if (WindContQPQULimIEC != _object_) {
            WindContQPQULimIEC = (WindContQPQULimIEC) _object_;
            WindContQPQULimIEC.setWindDynamicsLookupTable(this);
        }
    }

    public String WindContQPQULimIECToString() {
        return WindContQPQULimIEC != null ? WindContQPQULimIEC.getRdfid() : null;
    }

    private static void setWindContQPQULimIEC(BaseClass _this_, BaseClass _object_) {
        ((WindDynamicsLookupTable) _this_).setWindContQPQULimIEC(_object_);
    }

    private static String WindContQPQULimIECToString(BaseClass _this_) {
        return ((WindDynamicsLookupTable) _this_).WindContQPQULimIECToString();
    }

    /**
     * The rotor resistance control model with which this wind dynamics lookup table is associated.
     */
    private WindContRotorRIEC WindContRotorRIEC; // ManyToOne

    public WindContRotorRIEC getWindContRotorRIEC() {
        return WindContRotorRIEC;
    }

    public void setWindContRotorRIEC(BaseClass _object_) {
        if (!(_object_ instanceof WindContRotorRIEC)) {
            throw new IllegalArgumentException("Object is not WindContRotorRIEC");
        }
        if (WindContRotorRIEC != _object_) {
            WindContRotorRIEC = (WindContRotorRIEC) _object_;
            WindContRotorRIEC.setWindDynamicsLookupTable(this);
        }
    }

    public String WindContRotorRIECToString() {
        return WindContRotorRIEC != null ? WindContRotorRIEC.getRdfid() : null;
    }

    private static void setWindContRotorRIEC(BaseClass _this_, BaseClass _object_) {
        ((WindDynamicsLookupTable) _this_).setWindContRotorRIEC(_object_);
    }

    private static String WindContRotorRIECToString(BaseClass _this_) {
        return ((WindDynamicsLookupTable) _this_).WindContRotorRIECToString();
    }

    /**
     * The generator type 3B model with which this wind dynamics lookup table is associated.
     */
    private WindGenType3bIEC WindGenType3bIEC; // ManyToOne

    public WindGenType3bIEC getWindGenType3bIEC() {
        return WindGenType3bIEC;
    }

    public void setWindGenType3bIEC(BaseClass _object_) {
        if (!(_object_ instanceof WindGenType3bIEC)) {
            throw new IllegalArgumentException("Object is not WindGenType3bIEC");
        }
        if (WindGenType3bIEC != _object_) {
            WindGenType3bIEC = (WindGenType3bIEC) _object_;
            WindGenType3bIEC.setWindDynamicsLookupTable(this);
        }
    }

    public String WindGenType3bIECToString() {
        return WindGenType3bIEC != null ? WindGenType3bIEC.getRdfid() : null;
    }

    private static void setWindGenType3bIEC(BaseClass _this_, BaseClass _object_) {
        ((WindDynamicsLookupTable) _this_).setWindGenType3bIEC(_object_);
    }

    private static String WindGenType3bIECToString(BaseClass _this_) {
        return ((WindDynamicsLookupTable) _this_).WindGenType3bIECToString();
    }

    /**
     * The pitch control power model with which this wind dynamics lookup table is associated.
     */
    private WindPitchContPowerIEC WindPitchContPowerIEC; // ManyToOne

    public WindPitchContPowerIEC getWindPitchContPowerIEC() {
        return WindPitchContPowerIEC;
    }

    public void setWindPitchContPowerIEC(BaseClass _object_) {
        if (!(_object_ instanceof WindPitchContPowerIEC)) {
            throw new IllegalArgumentException("Object is not WindPitchContPowerIEC");
        }
        if (WindPitchContPowerIEC != _object_) {
            WindPitchContPowerIEC = (WindPitchContPowerIEC) _object_;
            WindPitchContPowerIEC.setWindDynamicsLookupTable(this);
        }
    }

    public String WindPitchContPowerIECToString() {
        return WindPitchContPowerIEC != null ? WindPitchContPowerIEC.getRdfid() : null;
    }

    private static void setWindPitchContPowerIEC(BaseClass _this_, BaseClass _object_) {
        ((WindDynamicsLookupTable) _this_).setWindPitchContPowerIEC(_object_);
    }

    private static String WindPitchContPowerIECToString(BaseClass _this_) {
        return ((WindDynamicsLookupTable) _this_).WindPitchContPowerIECToString();
    }

    /**
     * The frequency and active power wind plant control model with which this wind dynamics lookup table is associated.
     */
    private WindPlantFreqPcontrolIEC WindPlantFreqPcontrolIEC; // ManyToOne

    public WindPlantFreqPcontrolIEC getWindPlantFreqPcontrolIEC() {
        return WindPlantFreqPcontrolIEC;
    }

    public void setWindPlantFreqPcontrolIEC(BaseClass _object_) {
        if (!(_object_ instanceof WindPlantFreqPcontrolIEC)) {
            throw new IllegalArgumentException("Object is not WindPlantFreqPcontrolIEC");
        }
        if (WindPlantFreqPcontrolIEC != _object_) {
            WindPlantFreqPcontrolIEC = (WindPlantFreqPcontrolIEC) _object_;
            WindPlantFreqPcontrolIEC.setWindDynamicsLookupTable(this);
        }
    }

    public String WindPlantFreqPcontrolIECToString() {
        return WindPlantFreqPcontrolIEC != null ? WindPlantFreqPcontrolIEC.getRdfid() : null;
    }

    private static void setWindPlantFreqPcontrolIEC(BaseClass _this_, BaseClass _object_) {
        ((WindDynamicsLookupTable) _this_).setWindPlantFreqPcontrolIEC(_object_);
    }

    private static String WindPlantFreqPcontrolIECToString(BaseClass _this_) {
        return ((WindDynamicsLookupTable) _this_).WindPlantFreqPcontrolIECToString();
    }

    /**
     * The voltage and reactive power wind plant control model with which this wind dynamics lookup table is associated.
     */
    private WindPlantReactiveControlIEC WindPlantReactiveControlIEC; // ManyToOne

    public WindPlantReactiveControlIEC getWindPlantReactiveControlIEC() {
        return WindPlantReactiveControlIEC;
    }

    public void setWindPlantReactiveControlIEC(BaseClass _object_) {
        if (!(_object_ instanceof WindPlantReactiveControlIEC)) {
            throw new IllegalArgumentException("Object is not WindPlantReactiveControlIEC");
        }
        if (WindPlantReactiveControlIEC != _object_) {
            WindPlantReactiveControlIEC = (WindPlantReactiveControlIEC) _object_;
            WindPlantReactiveControlIEC.setWindDynamicsLookupTable(this);
        }
    }

    public String WindPlantReactiveControlIECToString() {
        return WindPlantReactiveControlIEC != null ? WindPlantReactiveControlIEC.getRdfid() : null;
    }

    private static void setWindPlantReactiveControlIEC(BaseClass _this_, BaseClass _object_) {
        ((WindDynamicsLookupTable) _this_).setWindPlantReactiveControlIEC(_object_);
    }

    private static String WindPlantReactiveControlIECToString(BaseClass _this_) {
        return ((WindDynamicsLookupTable) _this_).WindPlantReactiveControlIECToString();
    }

    /**
     * The grid protection model with which this wind dynamics lookup table is associated.
     */
    private WindProtectionIEC WindProtectionIEC; // ManyToOne

    public WindProtectionIEC getWindProtectionIEC() {
        return WindProtectionIEC;
    }

    public void setWindProtectionIEC(BaseClass _object_) {
        if (!(_object_ instanceof WindProtectionIEC)) {
            throw new IllegalArgumentException("Object is not WindProtectionIEC");
        }
        if (WindProtectionIEC != _object_) {
            WindProtectionIEC = (WindProtectionIEC) _object_;
            WindProtectionIEC.setWindDynamicsLookupTable(this);
        }
    }

    public String WindProtectionIECToString() {
        return WindProtectionIEC != null ? WindProtectionIEC.getRdfid() : null;
    }

    private static void setWindProtectionIEC(BaseClass _this_, BaseClass _object_) {
        ((WindDynamicsLookupTable) _this_).setWindProtectionIEC(_object_);
    }

    private static String WindProtectionIECToString(BaseClass _this_) {
        return ((WindDynamicsLookupTable) _this_).WindProtectionIECToString();
    }

    /**
     * Input value (&lt;i&gt;x&lt;/i&gt;) for the lookup table function.
     */
    private Float input; // Float

    public Float getInput() {
        return input;
    }

    public void setInput(Float _value_) {
        input = _value_;
    }

    public void setInput(String _value_) {
        input = getFloatFromString(_value_);
    }

    public String inputToString() {
        return input != null ? input.toString() : null;
    }

    private static void setInput(BaseClass _this_, String _value_) {
        ((WindDynamicsLookupTable) _this_).setInput(_value_);
    }

    private static String inputToString(BaseClass _this_) {
        return ((WindDynamicsLookupTable) _this_).inputToString();
    }

    /**
     * Type of the lookup table function.
     */
    private String lookupTableFunctionType; // WindLookupTableFunctionKind

    public String getLookupTableFunctionType() {
        return lookupTableFunctionType;
    }

    public void setLookupTableFunctionType(String _value_) {
        lookupTableFunctionType = _value_;
    }

    public String lookupTableFunctionTypeToString() {
        return lookupTableFunctionType;
    }

    private static void setLookupTableFunctionType(BaseClass _this_, String _value_) {
        ((WindDynamicsLookupTable) _this_).setLookupTableFunctionType(_value_);
    }

    private static String lookupTableFunctionTypeToString(BaseClass _this_) {
        return ((WindDynamicsLookupTable) _this_).lookupTableFunctionTypeToString();
    }

    /**
     * Output value (&lt;i&gt;y&lt;/i&gt;) for the lookup table function.
     */
    private Float output; // Float

    public Float getOutput() {
        return output;
    }

    public void setOutput(Float _value_) {
        output = _value_;
    }

    public void setOutput(String _value_) {
        output = getFloatFromString(_value_);
    }

    public String outputToString() {
        return output != null ? output.toString() : null;
    }

    private static void setOutput(BaseClass _this_, String _value_) {
        ((WindDynamicsLookupTable) _this_).setOutput(_value_);
    }

    private static String outputToString(BaseClass _this_) {
        return ((WindDynamicsLookupTable) _this_).outputToString();
    }

    /**
     * Sequence numbers of the pairs of the input (&lt;i&gt;x&lt;/i&gt;) and the output (&lt;i&gt;y&lt;/i&gt;) of the lookup table function.
     */
    private Integer sequence; // Integer

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer _value_) {
        sequence = _value_;
    }

    public void setSequence(String _value_) {
        sequence = getIntegerFromString(_value_);
    }

    public String sequenceToString() {
        return sequence != null ? sequence.toString() : null;
    }

    private static void setSequence(BaseClass _this_, String _value_) {
        ((WindDynamicsLookupTable) _this_).setSequence(_value_);
    }

    private static String sequenceToString(BaseClass _this_) {
        return ((WindDynamicsLookupTable) _this_).sequenceToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "WindDynamicsLookupTable", attrName));
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
                "WindDynamicsLookupTable", attrName, objectValue));
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
                "WindDynamicsLookupTable", attrName, stringValue));
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
            profiles.add(CGMESProfile.DY);
            map.put("WindContCurrLimIEC", new AttrDetails("WindDynamicsLookupTable.WindContCurrLimIEC", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, WindDynamicsLookupTable::WindContCurrLimIECToString, WindDynamicsLookupTable::setWindContCurrLimIEC, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindContPType3IEC", new AttrDetails("WindDynamicsLookupTable.WindContPType3IEC", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, WindDynamicsLookupTable::WindContPType3IECToString, WindDynamicsLookupTable::setWindContPType3IEC, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindContQPQULimIEC", new AttrDetails("WindDynamicsLookupTable.WindContQPQULimIEC", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, WindDynamicsLookupTable::WindContQPQULimIECToString, WindDynamicsLookupTable::setWindContQPQULimIEC, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindContRotorRIEC", new AttrDetails("WindDynamicsLookupTable.WindContRotorRIEC", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, WindDynamicsLookupTable::WindContRotorRIECToString, WindDynamicsLookupTable::setWindContRotorRIEC, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindGenType3bIEC", new AttrDetails("WindDynamicsLookupTable.WindGenType3bIEC", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, WindDynamicsLookupTable::WindGenType3bIECToString, WindDynamicsLookupTable::setWindGenType3bIEC, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindPitchContPowerIEC", new AttrDetails("WindDynamicsLookupTable.WindPitchContPowerIEC", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, WindDynamicsLookupTable::WindPitchContPowerIECToString, WindDynamicsLookupTable::setWindPitchContPowerIEC, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindPlantFreqPcontrolIEC", new AttrDetails("WindDynamicsLookupTable.WindPlantFreqPcontrolIEC", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, WindDynamicsLookupTable::WindPlantFreqPcontrolIECToString, WindDynamicsLookupTable::setWindPlantFreqPcontrolIEC, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindPlantReactiveControlIEC", new AttrDetails("WindDynamicsLookupTable.WindPlantReactiveControlIEC", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, WindDynamicsLookupTable::WindPlantReactiveControlIECToString, WindDynamicsLookupTable::setWindPlantReactiveControlIEC, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindProtectionIEC", new AttrDetails("WindDynamicsLookupTable.WindProtectionIEC", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, WindDynamicsLookupTable::WindProtectionIECToString, WindDynamicsLookupTable::setWindProtectionIEC, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("input", new AttrDetails("WindDynamicsLookupTable.input", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindDynamicsLookupTable::inputToString, null, WindDynamicsLookupTable::setInput));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("lookupTableFunctionType", new AttrDetails("WindDynamicsLookupTable.lookupTableFunctionType", true, "http://iec.ch/TC57/CIM100#", profiles, false, true, WindDynamicsLookupTable::lookupTableFunctionTypeToString, null, WindDynamicsLookupTable::setLookupTableFunctionType));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("output", new AttrDetails("WindDynamicsLookupTable.output", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindDynamicsLookupTable::outputToString, null, WindDynamicsLookupTable::setOutput));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("sequence", new AttrDetails("WindDynamicsLookupTable.sequence", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, WindDynamicsLookupTable::sequenceToString, null, WindDynamicsLookupTable::setSequence));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new WindDynamicsLookupTable(null).allAttrDetailsMap());
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
