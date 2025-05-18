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
 * Synchronous machine detailed modelling types are defined by the combination of the attributes SynchronousMachineTimeConstantReactance.modelType and SynchronousMachineTimeConstantReactance.rotorType.   Parameter details: <ol> 	<li>The "p" in the time-related attribute names is a substitution for a "prime" in the usual parameter notation, e.g. tpdo refers to <i>T'do</i>.</li> 	<li>The parameters used for models expressed in time constant reactance form include:</li> </ol> - RotatingMachine.ratedS (<i>MVAbase</i>); - RotatingMachineDynamics.damping (<i>D</i>); - RotatingMachineDynamics.inertia (<i>H</i>); - RotatingMachineDynamics.saturationFactor (<i>S1</i>); - RotatingMachineDynamics.saturationFactor120 (<i>S12</i>); - RotatingMachineDynamics.statorLeakageReactance (<i>Xl</i>); - RotatingMachineDynamics.statorResistance (<i>Rs</i>); - SynchronousMachineTimeConstantReactance.ks (<i>Ks</i>); - SynchronousMachineDetailed.saturationFactorQAxis (<i>S1q</i>); - SynchronousMachineDetailed.saturationFactor120QAxis (<i>S12q</i>); - SynchronousMachineDetailed.efdBaseRatio; - SynchronousMachineDetailed.ifdBaseType; - .xDirectSync (<i>Xd</i>); - .xDirectTrans (<i>X'd</i>); - .xDirectSubtrans (<i>X''d</i>); - .xQuadSync (<i>Xq</i>); - .xQuadTrans (<i>X'q</i>); - .xQuadSubtrans (<i>X''q</i>); - .tpdo (<i>T'do</i>); - .tppdo (<i>T''do</i>); - .tpqo (<i>T'qo</i>); - .tppqo (<i>T''qo</i>); - .tc.
 */
@SuppressWarnings("unused")
public class SynchronousMachineTimeConstantReactance extends SynchronousMachineDetailed {

    private static final Logging LOG = Logging.getLogger(SynchronousMachineTimeConstantReactance.class);

    /**
     * Constructor.
     */
    public SynchronousMachineTimeConstantReactance(String rdfid) {
        super("SynchronousMachineTimeConstantReactance", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected SynchronousMachineTimeConstantReactance(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Saturation loading correction factor (&lt;i&gt;Ks&lt;/i&gt;) (&amp;gt;= 0).  Used only by type J model.  Typical value = 0.
     */
    private Float ks; // Float

    public Float getKs() {
        return ks;
    }

    public void setKs(Float _value_) {
        ks = _value_;
    }

    public void setKs(String _value_) {
        ks = getFloatFromString(_value_);
    }

    public String ksToString() {
        return ks != null ? ks.toString() : null;
    }

    private static void setKs(BaseClass _this_, String _value_) {
        ((SynchronousMachineTimeConstantReactance) _this_).setKs(_value_);
    }

    private static String ksToString(BaseClass _this_) {
        return ((SynchronousMachineTimeConstantReactance) _this_).ksToString();
    }

    /**
     * Type of synchronous machine model used in dynamic simulation applications.
     */
    private String modelType; // SynchronousMachineModelKind

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String _value_) {
        modelType = _value_;
    }

    public String modelTypeToString() {
        return modelType;
    }

    private static void setModelType(BaseClass _this_, String _value_) {
        ((SynchronousMachineTimeConstantReactance) _this_).setModelType(_value_);
    }

    private static String modelTypeToString(BaseClass _this_) {
        return ((SynchronousMachineTimeConstantReactance) _this_).modelTypeToString();
    }

    /**
     * Type of rotor on physical machine.
     */
    private String rotorType; // RotorKind

    public String getRotorType() {
        return rotorType;
    }

    public void setRotorType(String _value_) {
        rotorType = _value_;
    }

    public String rotorTypeToString() {
        return rotorType;
    }

    private static void setRotorType(BaseClass _this_, String _value_) {
        ((SynchronousMachineTimeConstantReactance) _this_).setRotorType(_value_);
    }

    private static String rotorTypeToString(BaseClass _this_) {
        return ((SynchronousMachineTimeConstantReactance) _this_).rotorTypeToString();
    }

    /**
     * Damping time constant for `Canay` reactance (&amp;gt;= 0).  Typical value = 0.
     */
    private Double tc; // Seconds

    public Double getTc() {
        return tc;
    }

    public void setTc(Double _value_) {
        tc = _value_;
    }

    public void setTc(String _value_) {
        tc = getDoubleFromString(_value_);
    }

    public String tcToString() {
        return tc != null ? tc.toString() : null;
    }

    private static void setTc(BaseClass _this_, String _value_) {
        ((SynchronousMachineTimeConstantReactance) _this_).setTc(_value_);
    }

    private static String tcToString(BaseClass _this_) {
        return ((SynchronousMachineTimeConstantReactance) _this_).tcToString();
    }

    /**
     * Direct-axis transient rotor time constant (&lt;i&gt;T`do&lt;/i&gt;) (&amp;gt; SynchronousMachineTimeConstantReactance.tppdo).  Typical value = 5.
     */
    private Double tpdo; // Seconds

    public Double getTpdo() {
        return tpdo;
    }

    public void setTpdo(Double _value_) {
        tpdo = _value_;
    }

    public void setTpdo(String _value_) {
        tpdo = getDoubleFromString(_value_);
    }

    public String tpdoToString() {
        return tpdo != null ? tpdo.toString() : null;
    }

    private static void setTpdo(BaseClass _this_, String _value_) {
        ((SynchronousMachineTimeConstantReactance) _this_).setTpdo(_value_);
    }

    private static String tpdoToString(BaseClass _this_) {
        return ((SynchronousMachineTimeConstantReactance) _this_).tpdoToString();
    }

    /**
     * Direct-axis subtransient rotor time constant (&lt;i&gt;T``do&lt;/i&gt;) (&amp;gt; 0).  Typical value = 0,03.
     */
    private Double tppdo; // Seconds

    public Double getTppdo() {
        return tppdo;
    }

    public void setTppdo(Double _value_) {
        tppdo = _value_;
    }

    public void setTppdo(String _value_) {
        tppdo = getDoubleFromString(_value_);
    }

    public String tppdoToString() {
        return tppdo != null ? tppdo.toString() : null;
    }

    private static void setTppdo(BaseClass _this_, String _value_) {
        ((SynchronousMachineTimeConstantReactance) _this_).setTppdo(_value_);
    }

    private static String tppdoToString(BaseClass _this_) {
        return ((SynchronousMachineTimeConstantReactance) _this_).tppdoToString();
    }

    /**
     * Quadrature-axis subtransient rotor time constant (&lt;i&gt;T``qo&lt;/i&gt;) (&amp;gt; 0). Typical value = 0,03.
     */
    private Double tppqo; // Seconds

    public Double getTppqo() {
        return tppqo;
    }

    public void setTppqo(Double _value_) {
        tppqo = _value_;
    }

    public void setTppqo(String _value_) {
        tppqo = getDoubleFromString(_value_);
    }

    public String tppqoToString() {
        return tppqo != null ? tppqo.toString() : null;
    }

    private static void setTppqo(BaseClass _this_, String _value_) {
        ((SynchronousMachineTimeConstantReactance) _this_).setTppqo(_value_);
    }

    private static String tppqoToString(BaseClass _this_) {
        return ((SynchronousMachineTimeConstantReactance) _this_).tppqoToString();
    }

    /**
     * Quadrature-axis transient rotor time constant (&lt;i&gt;T`qo&lt;/i&gt;) (&amp;gt; SynchronousMachineTimeConstantReactance.tppqo). Typical value = 0,5.
     */
    private Double tpqo; // Seconds

    public Double getTpqo() {
        return tpqo;
    }

    public void setTpqo(Double _value_) {
        tpqo = _value_;
    }

    public void setTpqo(String _value_) {
        tpqo = getDoubleFromString(_value_);
    }

    public String tpqoToString() {
        return tpqo != null ? tpqo.toString() : null;
    }

    private static void setTpqo(BaseClass _this_, String _value_) {
        ((SynchronousMachineTimeConstantReactance) _this_).setTpqo(_value_);
    }

    private static String tpqoToString(BaseClass _this_) {
        return ((SynchronousMachineTimeConstantReactance) _this_).tpqoToString();
    }

    /**
     * Direct-axis subtransient reactance (unsaturated) (&lt;i&gt;X``d&lt;/i&gt;) (&amp;gt; RotatingMachineDynamics.statorLeakageReactance).  Typical value = 0,2.
     */
    private Double xDirectSubtrans; // PU

    public Double getXDirectSubtrans() {
        return xDirectSubtrans;
    }

    public void setXDirectSubtrans(Double _value_) {
        xDirectSubtrans = _value_;
    }

    public void setXDirectSubtrans(String _value_) {
        xDirectSubtrans = getDoubleFromString(_value_);
    }

    public String xDirectSubtransToString() {
        return xDirectSubtrans != null ? xDirectSubtrans.toString() : null;
    }

    private static void setXDirectSubtrans(BaseClass _this_, String _value_) {
        ((SynchronousMachineTimeConstantReactance) _this_).setXDirectSubtrans(_value_);
    }

    private static String xDirectSubtransToString(BaseClass _this_) {
        return ((SynchronousMachineTimeConstantReactance) _this_).xDirectSubtransToString();
    }

    /**
     * Direct-axis synchronous reactance (&lt;i&gt;Xd&lt;/i&gt;) (&amp;gt;= SynchronousMachineTimeConstantReactance.xDirectTrans). The quotient of a sustained value of that AC component of armature voltage that is produced by the total direct-axis flux due to direct-axis armature current and the value of the AC component of this current, the machine running at rated speed.  Typical value = 1,8.
     */
    private Double xDirectSync; // PU

    public Double getXDirectSync() {
        return xDirectSync;
    }

    public void setXDirectSync(Double _value_) {
        xDirectSync = _value_;
    }

    public void setXDirectSync(String _value_) {
        xDirectSync = getDoubleFromString(_value_);
    }

    public String xDirectSyncToString() {
        return xDirectSync != null ? xDirectSync.toString() : null;
    }

    private static void setXDirectSync(BaseClass _this_, String _value_) {
        ((SynchronousMachineTimeConstantReactance) _this_).setXDirectSync(_value_);
    }

    private static String xDirectSyncToString(BaseClass _this_) {
        return ((SynchronousMachineTimeConstantReactance) _this_).xDirectSyncToString();
    }

    /**
     * Direct-axis transient reactance (unsaturated) (&lt;i&gt;X`d&lt;/i&gt;) (&amp;gt;= SynchronousMachineTimeConstantReactance.xDirectSubtrans).  Typical value = 0,5.
     */
    private Double xDirectTrans; // PU

    public Double getXDirectTrans() {
        return xDirectTrans;
    }

    public void setXDirectTrans(Double _value_) {
        xDirectTrans = _value_;
    }

    public void setXDirectTrans(String _value_) {
        xDirectTrans = getDoubleFromString(_value_);
    }

    public String xDirectTransToString() {
        return xDirectTrans != null ? xDirectTrans.toString() : null;
    }

    private static void setXDirectTrans(BaseClass _this_, String _value_) {
        ((SynchronousMachineTimeConstantReactance) _this_).setXDirectTrans(_value_);
    }

    private static String xDirectTransToString(BaseClass _this_) {
        return ((SynchronousMachineTimeConstantReactance) _this_).xDirectTransToString();
    }

    /**
     * Quadrature-axis subtransient reactance (&lt;i&gt;X``q&lt;/i&gt;) (&amp;gt; RotatingMachineDynamics.statorLeakageReactance).  Typical value = 0,2.
     */
    private Double xQuadSubtrans; // PU

    public Double getXQuadSubtrans() {
        return xQuadSubtrans;
    }

    public void setXQuadSubtrans(Double _value_) {
        xQuadSubtrans = _value_;
    }

    public void setXQuadSubtrans(String _value_) {
        xQuadSubtrans = getDoubleFromString(_value_);
    }

    public String xQuadSubtransToString() {
        return xQuadSubtrans != null ? xQuadSubtrans.toString() : null;
    }

    private static void setXQuadSubtrans(BaseClass _this_, String _value_) {
        ((SynchronousMachineTimeConstantReactance) _this_).setXQuadSubtrans(_value_);
    }

    private static String xQuadSubtransToString(BaseClass _this_) {
        return ((SynchronousMachineTimeConstantReactance) _this_).xQuadSubtransToString();
    }

    /**
     * Quadrature-axis synchronous reactance (&lt;i&gt;Xq&lt;/i&gt;) (&amp;gt;= SynchronousMachineTimeConstantReactance.xQuadTrans). The ratio of the component of reactive armature voltage, due to the quadrature-axis component of armature current, to this component of current, under steady state conditions and at rated frequency.  Typical value = 1,6.
     */
    private Double xQuadSync; // PU

    public Double getXQuadSync() {
        return xQuadSync;
    }

    public void setXQuadSync(Double _value_) {
        xQuadSync = _value_;
    }

    public void setXQuadSync(String _value_) {
        xQuadSync = getDoubleFromString(_value_);
    }

    public String xQuadSyncToString() {
        return xQuadSync != null ? xQuadSync.toString() : null;
    }

    private static void setXQuadSync(BaseClass _this_, String _value_) {
        ((SynchronousMachineTimeConstantReactance) _this_).setXQuadSync(_value_);
    }

    private static String xQuadSyncToString(BaseClass _this_) {
        return ((SynchronousMachineTimeConstantReactance) _this_).xQuadSyncToString();
    }

    /**
     * Quadrature-axis transient reactance (&lt;i&gt;X`q&lt;/i&gt;) (&amp;gt;= SynchronousMachineTimeConstantReactance.xQuadSubtrans).  Typical value = 0,3.
     */
    private Double xQuadTrans; // PU

    public Double getXQuadTrans() {
        return xQuadTrans;
    }

    public void setXQuadTrans(Double _value_) {
        xQuadTrans = _value_;
    }

    public void setXQuadTrans(String _value_) {
        xQuadTrans = getDoubleFromString(_value_);
    }

    public String xQuadTransToString() {
        return xQuadTrans != null ? xQuadTrans.toString() : null;
    }

    private static void setXQuadTrans(BaseClass _this_, String _value_) {
        ((SynchronousMachineTimeConstantReactance) _this_).setXQuadTrans(_value_);
    }

    private static String xQuadTransToString(BaseClass _this_) {
        return ((SynchronousMachineTimeConstantReactance) _this_).xQuadTransToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "SynchronousMachineTimeConstantReactance", attrName));
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
                "SynchronousMachineTimeConstantReactance", attrName, objectValue));
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
                "SynchronousMachineTimeConstantReactance", attrName, stringValue));
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
            map.put("ks", new AttrDetails("SynchronousMachineTimeConstantReactance.ks", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, SynchronousMachineTimeConstantReactance::ksToString, null, SynchronousMachineTimeConstantReactance::setKs));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("modelType", new AttrDetails("SynchronousMachineTimeConstantReactance.modelType", true, "http://iec.ch/TC57/CIM100#", profiles, false, true, SynchronousMachineTimeConstantReactance::modelTypeToString, null, SynchronousMachineTimeConstantReactance::setModelType));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rotorType", new AttrDetails("SynchronousMachineTimeConstantReactance.rotorType", true, "http://iec.ch/TC57/CIM100#", profiles, false, true, SynchronousMachineTimeConstantReactance::rotorTypeToString, null, SynchronousMachineTimeConstantReactance::setRotorType));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tc", new AttrDetails("SynchronousMachineTimeConstantReactance.tc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, SynchronousMachineTimeConstantReactance::tcToString, null, SynchronousMachineTimeConstantReactance::setTc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tpdo", new AttrDetails("SynchronousMachineTimeConstantReactance.tpdo", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, SynchronousMachineTimeConstantReactance::tpdoToString, null, SynchronousMachineTimeConstantReactance::setTpdo));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tppdo", new AttrDetails("SynchronousMachineTimeConstantReactance.tppdo", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, SynchronousMachineTimeConstantReactance::tppdoToString, null, SynchronousMachineTimeConstantReactance::setTppdo));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tppqo", new AttrDetails("SynchronousMachineTimeConstantReactance.tppqo", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, SynchronousMachineTimeConstantReactance::tppqoToString, null, SynchronousMachineTimeConstantReactance::setTppqo));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tpqo", new AttrDetails("SynchronousMachineTimeConstantReactance.tpqo", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, SynchronousMachineTimeConstantReactance::tpqoToString, null, SynchronousMachineTimeConstantReactance::setTpqo));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xDirectSubtrans", new AttrDetails("SynchronousMachineTimeConstantReactance.xDirectSubtrans", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, SynchronousMachineTimeConstantReactance::xDirectSubtransToString, null, SynchronousMachineTimeConstantReactance::setXDirectSubtrans));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xDirectSync", new AttrDetails("SynchronousMachineTimeConstantReactance.xDirectSync", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, SynchronousMachineTimeConstantReactance::xDirectSyncToString, null, SynchronousMachineTimeConstantReactance::setXDirectSync));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xDirectTrans", new AttrDetails("SynchronousMachineTimeConstantReactance.xDirectTrans", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, SynchronousMachineTimeConstantReactance::xDirectTransToString, null, SynchronousMachineTimeConstantReactance::setXDirectTrans));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xQuadSubtrans", new AttrDetails("SynchronousMachineTimeConstantReactance.xQuadSubtrans", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, SynchronousMachineTimeConstantReactance::xQuadSubtransToString, null, SynchronousMachineTimeConstantReactance::setXQuadSubtrans));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xQuadSync", new AttrDetails("SynchronousMachineTimeConstantReactance.xQuadSync", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, SynchronousMachineTimeConstantReactance::xQuadSyncToString, null, SynchronousMachineTimeConstantReactance::setXQuadSync));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xQuadTrans", new AttrDetails("SynchronousMachineTimeConstantReactance.xQuadTrans", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, SynchronousMachineTimeConstantReactance::xQuadTransToString, null, SynchronousMachineTimeConstantReactance::setXQuadTrans));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new SynchronousMachineTimeConstantReactance(null).allAttrDetailsMap());
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
