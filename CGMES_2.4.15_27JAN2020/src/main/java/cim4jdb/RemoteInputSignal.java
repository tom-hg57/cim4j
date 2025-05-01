/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4jdb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

import org.springframework.data.repository.CrudRepository;

/**
 * Supports connection to a terminal associated with a remote bus from which an input signal of a specific type is coming.
 */
@Entity
@SuppressWarnings("unused")
@Table(name = "RemoteInputSignal")
public class RemoteInputSignal extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(RemoteInputSignal.class);

    /**
     * Default constructor.
     */
    public RemoteInputSignal() {
        setCimType("RemoteInputSignal");
    }

    /**
     * Discontinuous excitation control model using this remote input signal.
     */
    @Transient
    private DiscontinuousExcitationControlDynamics DiscontinuousExcitationControlDynamics; // OneToOne

    @Column(name = "DiscontinuousExcitationControlDynamics")
    private String DiscontinuousExcitationControlDynamicsId;

    public DiscontinuousExcitationControlDynamics getDiscontinuousExcitationControlDynamics() {
        return DiscontinuousExcitationControlDynamics;
    }

    public void setDiscontinuousExcitationControlDynamics(BaseClass _object_) {
        if (!(_object_ instanceof DiscontinuousExcitationControlDynamics)) {
            throw new IllegalArgumentException("Object is not DiscontinuousExcitationControlDynamics");
        }
        if (!Objects.equals(_object_.getCimModel(), getCimModel())) {
            throw new IllegalArgumentException("Object belongs to different model");
        }
        if (DiscontinuousExcitationControlDynamics != _object_) {
            DiscontinuousExcitationControlDynamics = (DiscontinuousExcitationControlDynamics) _object_;
            DiscontinuousExcitationControlDynamics.setRemoteInputSignal(this);
            DiscontinuousExcitationControlDynamicsId = DiscontinuousExcitationControlDynamics.getRdfid();
        }
    }

    public String DiscontinuousExcitationControlDynamicsToString() {
        return DiscontinuousExcitationControlDynamicsId;
    }

    /**
     * Power Factor or VAr controller Type I model using this remote input signal.
     */
    @Transient
    private PFVArControllerType1Dynamics PFVArControllerType1Dynamics; // OneToOne

    @Column(name = "PFVArControllerType1Dynamics")
    private String PFVArControllerType1DynamicsId;

    public PFVArControllerType1Dynamics getPFVArControllerType1Dynamics() {
        return PFVArControllerType1Dynamics;
    }

    public void setPFVArControllerType1Dynamics(BaseClass _object_) {
        if (!(_object_ instanceof PFVArControllerType1Dynamics)) {
            throw new IllegalArgumentException("Object is not PFVArControllerType1Dynamics");
        }
        if (!Objects.equals(_object_.getCimModel(), getCimModel())) {
            throw new IllegalArgumentException("Object belongs to different model");
        }
        if (PFVArControllerType1Dynamics != _object_) {
            PFVArControllerType1Dynamics = (PFVArControllerType1Dynamics) _object_;
            PFVArControllerType1Dynamics.setRemoteInputSignal(this);
            PFVArControllerType1DynamicsId = PFVArControllerType1Dynamics.getRdfid();
        }
    }

    public String PFVArControllerType1DynamicsToString() {
        return PFVArControllerType1DynamicsId;
    }

    /**
     * Power system stabilizer model using this remote input signal.
     */
    @Transient
    private PowerSystemStabilizerDynamics PowerSystemStabilizerDynamics; // ManyToOne

    @Column(name = "PowerSystemStabilizerDynamics")
    private String PowerSystemStabilizerDynamicsId;

    public PowerSystemStabilizerDynamics getPowerSystemStabilizerDynamics() {
        return PowerSystemStabilizerDynamics;
    }

    public void setPowerSystemStabilizerDynamics(BaseClass _object_) {
        if (!(_object_ instanceof PowerSystemStabilizerDynamics)) {
            throw new IllegalArgumentException("Object is not PowerSystemStabilizerDynamics");
        }
        if (!Objects.equals(_object_.getCimModel(), getCimModel())) {
            throw new IllegalArgumentException("Object belongs to different model");
        }
        if (PowerSystemStabilizerDynamics != _object_) {
            PowerSystemStabilizerDynamics = (PowerSystemStabilizerDynamics) _object_;
            PowerSystemStabilizerDynamics.setRemoteInputSignal(this);
            PowerSystemStabilizerDynamicsId = PowerSystemStabilizerDynamics.getRdfid();
        }
    }

    public String PowerSystemStabilizerDynamicsToString() {
        return PowerSystemStabilizerDynamicsId;
    }

    /**
     * Remote terminal with which this input signal is associated.
     */
    @Transient
    private Terminal Terminal; // ManyToOne

    @Column(name = "Terminal")
    private String TerminalId;

    public Terminal getTerminal() {
        return Terminal;
    }

    public void setTerminal(BaseClass _object_) {
        if (!(_object_ instanceof Terminal)) {
            throw new IllegalArgumentException("Object is not Terminal");
        }
        if (!Objects.equals(_object_.getCimModel(), getCimModel())) {
            throw new IllegalArgumentException("Object belongs to different model");
        }
        if (Terminal != _object_) {
            Terminal = (Terminal) _object_;
            Terminal.setRemoteInputSignal(this);
            TerminalId = Terminal.getRdfid();
        }
    }

    public String TerminalToString() {
        return TerminalId;
    }

    /**
     * Underexcitation limiter model using this remote input signal.
     */
    @Transient
    private UnderexcitationLimiterDynamics UnderexcitationLimiterDynamics; // OneToOne

    @Column(name = "UnderexcitationLimiterDynamics")
    private String UnderexcitationLimiterDynamicsId;

    public UnderexcitationLimiterDynamics getUnderexcitationLimiterDynamics() {
        return UnderexcitationLimiterDynamics;
    }

    public void setUnderexcitationLimiterDynamics(BaseClass _object_) {
        if (!(_object_ instanceof UnderexcitationLimiterDynamics)) {
            throw new IllegalArgumentException("Object is not UnderexcitationLimiterDynamics");
        }
        if (!Objects.equals(_object_.getCimModel(), getCimModel())) {
            throw new IllegalArgumentException("Object belongs to different model");
        }
        if (UnderexcitationLimiterDynamics != _object_) {
            UnderexcitationLimiterDynamics = (UnderexcitationLimiterDynamics) _object_;
            UnderexcitationLimiterDynamics.setRemoteInputSignal(this);
            UnderexcitationLimiterDynamicsId = UnderexcitationLimiterDynamics.getRdfid();
        }
    }

    public String UnderexcitationLimiterDynamicsToString() {
        return UnderexcitationLimiterDynamicsId;
    }

    /**
     * Voltage compensator model using this remote input signal.
     */
    @Transient
    private VoltageCompensatorDynamics VoltageCompensatorDynamics; // OneToOne

    @Column(name = "VoltageCompensatorDynamics")
    private String VoltageCompensatorDynamicsId;

    public VoltageCompensatorDynamics getVoltageCompensatorDynamics() {
        return VoltageCompensatorDynamics;
    }

    public void setVoltageCompensatorDynamics(BaseClass _object_) {
        if (!(_object_ instanceof VoltageCompensatorDynamics)) {
            throw new IllegalArgumentException("Object is not VoltageCompensatorDynamics");
        }
        if (!Objects.equals(_object_.getCimModel(), getCimModel())) {
            throw new IllegalArgumentException("Object belongs to different model");
        }
        if (VoltageCompensatorDynamics != _object_) {
            VoltageCompensatorDynamics = (VoltageCompensatorDynamics) _object_;
            VoltageCompensatorDynamics.setRemoteInputSignal(this);
            VoltageCompensatorDynamicsId = VoltageCompensatorDynamics.getRdfid();
        }
    }

    public String VoltageCompensatorDynamicsToString() {
        return VoltageCompensatorDynamicsId;
    }

    /**
     * The remote signal with which this power plant is associated.
     *
     * NOT USED
     */
    @Transient
    private WindPlantDynamics WindPlantDynamics; // OneToOne

    public WindPlantDynamics getWindPlantDynamics() {
        return WindPlantDynamics;
    }

    public void setWindPlantDynamics(BaseClass _object_) {
        if (!(_object_ instanceof WindPlantDynamics)) {
            throw new IllegalArgumentException("Object is not WindPlantDynamics");
        }
        if (!Objects.equals(_object_.getCimModel(), getCimModel())) {
            throw new IllegalArgumentException("Object belongs to different model");
        }
        if (WindPlantDynamics != _object_) {
            WindPlantDynamics = (WindPlantDynamics) _object_;
            WindPlantDynamics.setRemoteInputSignal(this);
        }
    }

    public String WindPlantDynamicsToString() {
        return WindPlantDynamics != null ? WindPlantDynamics.getRdfid() : null;
    }

    /**
     * Wind generator Type 1 or Type 2 model using this remote input signal.
     *
     * NOT USED
     */
    @Transient
    private WindTurbineType1or2Dynamics WindTurbineType1or2Dynamics; // OneToOne

    public WindTurbineType1or2Dynamics getWindTurbineType1or2Dynamics() {
        return WindTurbineType1or2Dynamics;
    }

    public void setWindTurbineType1or2Dynamics(BaseClass _object_) {
        if (!(_object_ instanceof WindTurbineType1or2Dynamics)) {
            throw new IllegalArgumentException("Object is not WindTurbineType1or2Dynamics");
        }
        if (!Objects.equals(_object_.getCimModel(), getCimModel())) {
            throw new IllegalArgumentException("Object belongs to different model");
        }
        if (WindTurbineType1or2Dynamics != _object_) {
            WindTurbineType1or2Dynamics = (WindTurbineType1or2Dynamics) _object_;
            WindTurbineType1or2Dynamics.setRemoteInputSignal(this);
        }
    }

    public String WindTurbineType1or2DynamicsToString() {
        return WindTurbineType1or2Dynamics != null ? WindTurbineType1or2Dynamics.getRdfid() : null;
    }

    /**
     * Remote input signal used by these wind turbine Type 3 or 4 models.
     *
     * NOT USED
     */
    @Transient
    private WindTurbineType3or4Dynamics WindTurbineType3or4Dynamics; // OneToOne

    public WindTurbineType3or4Dynamics getWindTurbineType3or4Dynamics() {
        return WindTurbineType3or4Dynamics;
    }

    public void setWindTurbineType3or4Dynamics(BaseClass _object_) {
        if (!(_object_ instanceof WindTurbineType3or4Dynamics)) {
            throw new IllegalArgumentException("Object is not WindTurbineType3or4Dynamics");
        }
        if (!Objects.equals(_object_.getCimModel(), getCimModel())) {
            throw new IllegalArgumentException("Object belongs to different model");
        }
        if (WindTurbineType3or4Dynamics != _object_) {
            WindTurbineType3or4Dynamics = (WindTurbineType3or4Dynamics) _object_;
            WindTurbineType3or4Dynamics.setRemoteInputSignal(this);
        }
    }

    public String WindTurbineType3or4DynamicsToString() {
        return WindTurbineType3or4Dynamics != null ? WindTurbineType3or4Dynamics.getRdfid() : null;
    }

    /**
     * Type of input signal.
     */
    @Column(name = "remoteSignalType")
    private String remoteSignalType; // RemoteSignalKind

    public String getRemoteSignalType() {
        return remoteSignalType;
    }

    public void setRemoteSignalType(String _value_) {
        remoteSignalType = _value_;
    }

    public String remoteSignalTypeToString() {
        return remoteSignalType;
    }

    /**
     * Nested repository. The implementation is automatically created.
     */
    public interface Repository extends CrudRepository<RemoteInputSignal, Long> {
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
        return getAttribute("RemoteInputSignal", attrName);
    }

    @Override
    protected String getAttribute(String className, String attrName) {
        if (classGetterSetterMap.containsKey(attrName)) {
            var getterFunction = classGetterSetterMap.get(attrName).getter;
            return getterFunction.get();
        }
        return super.getAttribute(className, attrName);
    }

    /**
     * Set an attribute value as object (for class and list attributes).
     *
     * @param attrName    The attribute name
     * @param objectValue The attribute value as object
     */
    @Override
    public void setAttribute(String attrName, BaseClass objectValue) {
        setAttribute("RemoteInputSignal", attrName, objectValue);
    }

    @Override
    protected void setAttribute(String className, String attrName, BaseClass objectValue) {
        if (classGetterSetterMap.containsKey(attrName)) {
            var setterFunction = classGetterSetterMap.get(attrName).objectSetter;
            setterFunction.accept(objectValue);
        } else {
            super.setAttribute(className, attrName, objectValue);
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
        setAttribute("RemoteInputSignal", attrName, stringValue);
    }

    @Override
    protected void setAttribute(String className, String attrName, String stringValue) {
        if (classGetterSetterMap.containsKey(attrName)) {
            var setterFunction = classGetterSetterMap.get(attrName).stringSetter;
            setterFunction.accept(stringValue);
        } else {
            super.setAttribute(className, attrName, stringValue);
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
            map.put("DiscontinuousExcitationControlDynamics", new AttrDetails("RemoteInputSignal.DiscontinuousExcitationControlDynamics", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("PFVArControllerType1Dynamics", new AttrDetails("RemoteInputSignal.PFVArControllerType1Dynamics", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("PowerSystemStabilizerDynamics", new AttrDetails("RemoteInputSignal.PowerSystemStabilizerDynamics", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("Terminal", new AttrDetails("RemoteInputSignal.Terminal", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("UnderexcitationLimiterDynamics", new AttrDetails("RemoteInputSignal.UnderexcitationLimiterDynamics", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("VoltageCompensatorDynamics", new AttrDetails("RemoteInputSignal.VoltageCompensatorDynamics", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindPlantDynamics", new AttrDetails("RemoteInputSignal.WindPlantDynamics", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindTurbineType1or2Dynamics", new AttrDetails("RemoteInputSignal.WindTurbineType1or2Dynamics", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindTurbineType3or4Dynamics", new AttrDetails("RemoteInputSignal.WindTurbineType3or4Dynamics", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("remoteSignalType", new AttrDetails("RemoteInputSignal.remoteSignalType", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new RemoteInputSignal().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    @Transient
    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("DiscontinuousExcitationControlDynamics", new GetterSetter(this::DiscontinuousExcitationControlDynamicsToString, this::setDiscontinuousExcitationControlDynamics, null));
        map.put("PFVArControllerType1Dynamics", new GetterSetter(this::PFVArControllerType1DynamicsToString, this::setPFVArControllerType1Dynamics, null));
        map.put("PowerSystemStabilizerDynamics", new GetterSetter(this::PowerSystemStabilizerDynamicsToString, this::setPowerSystemStabilizerDynamics, null));
        map.put("Terminal", new GetterSetter(this::TerminalToString, this::setTerminal, null));
        map.put("UnderexcitationLimiterDynamics", new GetterSetter(this::UnderexcitationLimiterDynamicsToString, this::setUnderexcitationLimiterDynamics, null));
        map.put("VoltageCompensatorDynamics", new GetterSetter(this::VoltageCompensatorDynamicsToString, this::setVoltageCompensatorDynamics, null));
        map.put("WindPlantDynamics", new GetterSetter(this::WindPlantDynamicsToString, this::setWindPlantDynamics, null));
        map.put("WindTurbineType1or2Dynamics", new GetterSetter(this::WindTurbineType1or2DynamicsToString, this::setWindTurbineType1or2Dynamics, null));
        map.put("WindTurbineType3or4Dynamics", new GetterSetter(this::WindTurbineType3or4DynamicsToString, this::setWindTurbineType3or4Dynamics, null));
        map.put("remoteSignalType", new GetterSetter(this::remoteSignalTypeToString, null, this::setRemoteSignalType));
        return map;
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
