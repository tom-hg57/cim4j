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
 * This class represents equivalent injections (generation or load).  Voltage regulation is allowed only at the point of connection.
 */
@SuppressWarnings("unused")
public class EquivalentInjection extends EquivalentEquipment {

    private static final Logging LOG = Logging.getLogger(EquivalentInjection.class);

    /**
     * Constructor.
     */
    public EquivalentInjection(String rdfid) {
        super("EquivalentInjection", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected EquivalentInjection(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * The equivalent injection using this reactive capability curve.
     */
    private ReactiveCapabilityCurve ReactiveCapabilityCurve; // ManyToOne

    public ReactiveCapabilityCurve getReactiveCapabilityCurve() {
        return ReactiveCapabilityCurve;
    }

    public void setReactiveCapabilityCurve(BaseClass _object_) {
        if (!(_object_ instanceof ReactiveCapabilityCurve)) {
            throw new IllegalArgumentException("Object is not ReactiveCapabilityCurve");
        }
        if (ReactiveCapabilityCurve != _object_) {
            ReactiveCapabilityCurve = (ReactiveCapabilityCurve) _object_;
            ReactiveCapabilityCurve.setEquivalentInjection(this);
        }
    }

    public String ReactiveCapabilityCurveToString() {
        return ReactiveCapabilityCurve != null ? ReactiveCapabilityCurve.getRdfid() : null;
    }

    private static void setReactiveCapabilityCurve(BaseClass _this_, BaseClass _object_) {
        ((EquivalentInjection) _this_).setReactiveCapabilityCurve(_object_);
    }

    private static String ReactiveCapabilityCurveToString(BaseClass _this_) {
        return ((EquivalentInjection) _this_).ReactiveCapabilityCurveToString();
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
        ((EquivalentInjection) _this_).setMaxP(_value_);
    }

    private static String maxPToString(BaseClass _this_) {
        return ((EquivalentInjection) _this_).maxPToString();
    }

    /**
     * Used for modeling of infeed for load flow exchange. Not used for short circuit modeling.  If maxQ and minQ are not used ReactiveCapabilityCurve can be used.
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
        ((EquivalentInjection) _this_).setMaxQ(_value_);
    }

    private static String maxQToString(BaseClass _this_) {
        return ((EquivalentInjection) _this_).maxQToString();
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
        ((EquivalentInjection) _this_).setMinP(_value_);
    }

    private static String minPToString(BaseClass _this_) {
        return ((EquivalentInjection) _this_).minPToString();
    }

    /**
     * Used for modeling of infeed for load flow exchange. Not used for short circuit modeling.  If maxQ and minQ are not used ReactiveCapabilityCurve can be used.
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
        ((EquivalentInjection) _this_).setMinQ(_value_);
    }

    private static String minQToString(BaseClass _this_) {
        return ((EquivalentInjection) _this_).minQToString();
    }

    /**
     * Equivalent active power injection. Load sign convention is used, i.e. positive sign means flow out from a node. Starting value for steady state solutions.
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
        ((EquivalentInjection) _this_).setP(_value_);
    }

    private static String pToString(BaseClass _this_) {
        return ((EquivalentInjection) _this_).pToString();
    }

    /**
     * Equivalent reactive power injection. Load sign convention is used, i.e. positive sign means flow out from a node. Starting value for steady state solutions.
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
        ((EquivalentInjection) _this_).setQ(_value_);
    }

    private static String qToString(BaseClass _this_) {
        return ((EquivalentInjection) _this_).qToString();
    }

    /**
     * Positive sequence resistance. Used to represent Extended-Ward (IEC 60909). Usage : Extended-Ward is a result of network reduction prior to the data exchange.
     */
    private Double r; // Resistance

    public Double getR() {
        return r;
    }

    public void setR(Double _value_) {
        r = _value_;
    }

    public void setR(String _value_) {
        r = getDoubleFromString(_value_);
    }

    public String rToString() {
        return r != null ? r.toString() : null;
    }

    private static void setR(BaseClass _this_, String _value_) {
        ((EquivalentInjection) _this_).setR(_value_);
    }

    private static String rToString(BaseClass _this_) {
        return ((EquivalentInjection) _this_).rToString();
    }

    /**
     * Zero sequence resistance. Used to represent Extended-Ward (IEC 60909). Usage : Extended-Ward is a result of network reduction prior to the data exchange.
     */
    private Double r0; // Resistance

    public Double getR0() {
        return r0;
    }

    public void setR0(Double _value_) {
        r0 = _value_;
    }

    public void setR0(String _value_) {
        r0 = getDoubleFromString(_value_);
    }

    public String r0ToString() {
        return r0 != null ? r0.toString() : null;
    }

    private static void setR0(BaseClass _this_, String _value_) {
        ((EquivalentInjection) _this_).setR0(_value_);
    }

    private static String r0ToString(BaseClass _this_) {
        return ((EquivalentInjection) _this_).r0ToString();
    }

    /**
     * Negative sequence resistance. Used to represent Extended-Ward (IEC 60909). Usage : Extended-Ward is a result of network reduction prior to the data exchange.
     */
    private Double r2; // Resistance

    public Double getR2() {
        return r2;
    }

    public void setR2(Double _value_) {
        r2 = _value_;
    }

    public void setR2(String _value_) {
        r2 = getDoubleFromString(_value_);
    }

    public String r2ToString() {
        return r2 != null ? r2.toString() : null;
    }

    private static void setR2(BaseClass _this_, String _value_) {
        ((EquivalentInjection) _this_).setR2(_value_);
    }

    private static String r2ToString(BaseClass _this_) {
        return ((EquivalentInjection) _this_).r2ToString();
    }

    /**
     * Specifies whether or not the EquivalentInjection has the capability to regulate the local voltage.
     */
    private Boolean regulationCapability; // Boolean

    public Boolean getRegulationCapability() {
        return regulationCapability;
    }

    public void setRegulationCapability(Boolean _value_) {
        regulationCapability = _value_;
    }

    public void setRegulationCapability(String _value_) {
        regulationCapability = getBooleanFromString(_value_);
    }

    public String regulationCapabilityToString() {
        return regulationCapability != null ? regulationCapability.toString() : null;
    }

    private static void setRegulationCapability(BaseClass _this_, String _value_) {
        ((EquivalentInjection) _this_).setRegulationCapability(_value_);
    }

    private static String regulationCapabilityToString(BaseClass _this_) {
        return ((EquivalentInjection) _this_).regulationCapabilityToString();
    }

    /**
     * Specifies the default regulation status of the EquivalentInjection.  True is regulating.  False is not regulating.
     */
    private Boolean regulationStatus; // Boolean

    public Boolean getRegulationStatus() {
        return regulationStatus;
    }

    public void setRegulationStatus(Boolean _value_) {
        regulationStatus = _value_;
    }

    public void setRegulationStatus(String _value_) {
        regulationStatus = getBooleanFromString(_value_);
    }

    public String regulationStatusToString() {
        return regulationStatus != null ? regulationStatus.toString() : null;
    }

    private static void setRegulationStatus(BaseClass _this_, String _value_) {
        ((EquivalentInjection) _this_).setRegulationStatus(_value_);
    }

    private static String regulationStatusToString(BaseClass _this_) {
        return ((EquivalentInjection) _this_).regulationStatusToString();
    }

    /**
     * The target voltage for voltage regulation.
     */
    private Double regulationTarget; // Voltage

    public Double getRegulationTarget() {
        return regulationTarget;
    }

    public void setRegulationTarget(Double _value_) {
        regulationTarget = _value_;
    }

    public void setRegulationTarget(String _value_) {
        regulationTarget = getDoubleFromString(_value_);
    }

    public String regulationTargetToString() {
        return regulationTarget != null ? regulationTarget.toString() : null;
    }

    private static void setRegulationTarget(BaseClass _this_, String _value_) {
        ((EquivalentInjection) _this_).setRegulationTarget(_value_);
    }

    private static String regulationTargetToString(BaseClass _this_) {
        return ((EquivalentInjection) _this_).regulationTargetToString();
    }

    /**
     * Positive sequence reactance. Used to represent Extended-Ward (IEC 60909). Usage : Extended-Ward is a result of network reduction prior to the data exchange.
     */
    private Double x; // Reactance

    public Double getX() {
        return x;
    }

    public void setX(Double _value_) {
        x = _value_;
    }

    public void setX(String _value_) {
        x = getDoubleFromString(_value_);
    }

    public String xToString() {
        return x != null ? x.toString() : null;
    }

    private static void setX(BaseClass _this_, String _value_) {
        ((EquivalentInjection) _this_).setX(_value_);
    }

    private static String xToString(BaseClass _this_) {
        return ((EquivalentInjection) _this_).xToString();
    }

    /**
     * Zero sequence reactance. Used to represent Extended-Ward (IEC 60909). Usage : Extended-Ward is a result of network reduction prior to the data exchange.
     */
    private Double x0; // Reactance

    public Double getX0() {
        return x0;
    }

    public void setX0(Double _value_) {
        x0 = _value_;
    }

    public void setX0(String _value_) {
        x0 = getDoubleFromString(_value_);
    }

    public String x0ToString() {
        return x0 != null ? x0.toString() : null;
    }

    private static void setX0(BaseClass _this_, String _value_) {
        ((EquivalentInjection) _this_).setX0(_value_);
    }

    private static String x0ToString(BaseClass _this_) {
        return ((EquivalentInjection) _this_).x0ToString();
    }

    /**
     * Negative sequence reactance. Used to represent Extended-Ward (IEC 60909). Usage : Extended-Ward is a result of network reduction prior to the data exchange.
     */
    private Double x2; // Reactance

    public Double getX2() {
        return x2;
    }

    public void setX2(Double _value_) {
        x2 = _value_;
    }

    public void setX2(String _value_) {
        x2 = getDoubleFromString(_value_);
    }

    public String x2ToString() {
        return x2 != null ? x2.toString() : null;
    }

    private static void setX2(BaseClass _this_, String _value_) {
        ((EquivalentInjection) _this_).setX2(_value_);
    }

    private static String x2ToString(BaseClass _this_) {
        return ((EquivalentInjection) _this_).x2ToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "EquivalentInjection", attrName));
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
                "EquivalentInjection", attrName, objectValue));
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
                "EquivalentInjection", attrName, stringValue));
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
            map.put("ReactiveCapabilityCurve", new AttrDetails("EquivalentInjection.ReactiveCapabilityCurve", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, EquivalentInjection::ReactiveCapabilityCurveToString, EquivalentInjection::setReactiveCapabilityCurve, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("maxP", new AttrDetails("EquivalentInjection.maxP", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, EquivalentInjection::maxPToString, null, EquivalentInjection::setMaxP));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("maxQ", new AttrDetails("EquivalentInjection.maxQ", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, EquivalentInjection::maxQToString, null, EquivalentInjection::setMaxQ));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("minP", new AttrDetails("EquivalentInjection.minP", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, EquivalentInjection::minPToString, null, EquivalentInjection::setMinP));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("minQ", new AttrDetails("EquivalentInjection.minQ", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, EquivalentInjection::minQToString, null, EquivalentInjection::setMinQ));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("p", new AttrDetails("EquivalentInjection.p", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, EquivalentInjection::pToString, null, EquivalentInjection::setP));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("q", new AttrDetails("EquivalentInjection.q", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, EquivalentInjection::qToString, null, EquivalentInjection::setQ));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("r", new AttrDetails("EquivalentInjection.r", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, EquivalentInjection::rToString, null, EquivalentInjection::setR));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("r0", new AttrDetails("EquivalentInjection.r0", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, EquivalentInjection::r0ToString, null, EquivalentInjection::setR0));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("r2", new AttrDetails("EquivalentInjection.r2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, EquivalentInjection::r2ToString, null, EquivalentInjection::setR2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("regulationCapability", new AttrDetails("EquivalentInjection.regulationCapability", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, EquivalentInjection::regulationCapabilityToString, null, EquivalentInjection::setRegulationCapability));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("regulationStatus", new AttrDetails("EquivalentInjection.regulationStatus", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, EquivalentInjection::regulationStatusToString, null, EquivalentInjection::setRegulationStatus));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("regulationTarget", new AttrDetails("EquivalentInjection.regulationTarget", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, EquivalentInjection::regulationTargetToString, null, EquivalentInjection::setRegulationTarget));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("x", new AttrDetails("EquivalentInjection.x", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, EquivalentInjection::xToString, null, EquivalentInjection::setX));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("x0", new AttrDetails("EquivalentInjection.x0", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, EquivalentInjection::x0ToString, null, EquivalentInjection::setX0));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("x2", new AttrDetails("EquivalentInjection.x2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, EquivalentInjection::x2ToString, null, EquivalentInjection::setX2));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new EquivalentInjection(null).allAttrDetailsMap());
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
