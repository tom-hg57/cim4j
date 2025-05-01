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
 * Parent class supporting relationships to IEC wind turbines type 3 including their control models.
 */
@Entity
@SuppressWarnings("unused")
@Table(name = "WindTurbineType3IEC")
public class WindTurbineType3IEC extends WindTurbineType3or4IEC {

    private static final Logging LOG = Logging.getLogger(WindTurbineType3IEC.class);

    /**
     * Default constructor.
     */
    public WindTurbineType3IEC() {
        setCimType("WindTurbineType3IEC");
    }

    /**
     * Wind aerodynamic model associated with this wind generator type 3 model.
     */
    @Transient
    private WindAeroOneDimIEC WindAeroOneDimIEC; // OneToOne

    @Column(name = "WindAeroOneDimIEC")
    private String WindAeroOneDimIECId;

    public WindAeroOneDimIEC getWindAeroOneDimIEC() {
        return WindAeroOneDimIEC;
    }

    public void setWindAeroOneDimIEC(BaseClass _object_) {
        if (!(_object_ instanceof WindAeroOneDimIEC)) {
            throw new IllegalArgumentException("Object is not WindAeroOneDimIEC");
        }
        if (!Objects.equals(_object_.getCimModel(), getCimModel())) {
            throw new IllegalArgumentException("Object belongs to different model");
        }
        if (WindAeroOneDimIEC != _object_) {
            WindAeroOneDimIEC = (WindAeroOneDimIEC) _object_;
            WindAeroOneDimIEC.setWindTurbineType3IEC(this);
            WindAeroOneDimIECId = WindAeroOneDimIEC.getRdfid();
        }
    }

    public String WindAeroOneDimIECToString() {
        return WindAeroOneDimIECId;
    }

    /**
     * Wind aerodynamic model associated with this wind turbine type 3 model.
     */
    @Transient
    private WindAeroTwoDimIEC WindAeroTwoDimIEC; // OneToOne

    @Column(name = "WindAeroTwoDimIEC")
    private String WindAeroTwoDimIECId;

    public WindAeroTwoDimIEC getWindAeroTwoDimIEC() {
        return WindAeroTwoDimIEC;
    }

    public void setWindAeroTwoDimIEC(BaseClass _object_) {
        if (!(_object_ instanceof WindAeroTwoDimIEC)) {
            throw new IllegalArgumentException("Object is not WindAeroTwoDimIEC");
        }
        if (!Objects.equals(_object_.getCimModel(), getCimModel())) {
            throw new IllegalArgumentException("Object belongs to different model");
        }
        if (WindAeroTwoDimIEC != _object_) {
            WindAeroTwoDimIEC = (WindAeroTwoDimIEC) _object_;
            WindAeroTwoDimIEC.setWindTurbineType3IEC(this);
            WindAeroTwoDimIECId = WindAeroTwoDimIEC.getRdfid();
        }
    }

    public String WindAeroTwoDimIECToString() {
        return WindAeroTwoDimIECId;
    }

    /**
     * Wind control P type 3 model associated with this wind turbine type 3 model.
     */
    @Transient
    private WindContPType3IEC WindContPType3IEC; // OneToOne

    @Column(name = "WindContPType3IEC")
    private String WindContPType3IECId;

    public WindContPType3IEC getWindContPType3IEC() {
        return WindContPType3IEC;
    }

    public void setWindContPType3IEC(BaseClass _object_) {
        if (!(_object_ instanceof WindContPType3IEC)) {
            throw new IllegalArgumentException("Object is not WindContPType3IEC");
        }
        if (!Objects.equals(_object_.getCimModel(), getCimModel())) {
            throw new IllegalArgumentException("Object belongs to different model");
        }
        if (WindContPType3IEC != _object_) {
            WindContPType3IEC = (WindContPType3IEC) _object_;
            WindContPType3IEC.setWindTurbineType3IEC(this);
            WindContPType3IECId = WindContPType3IEC.getRdfid();
        }
    }

    public String WindContPType3IECToString() {
        return WindContPType3IECId;
    }

    /**
     * Wind control pitch angle model associated with this wind turbine type 3.
     */
    @Transient
    private WindContPitchAngleIEC WindContPitchAngleIEC; // OneToOne

    @Column(name = "WindContPitchAngleIEC")
    private String WindContPitchAngleIECId;

    public WindContPitchAngleIEC getWindContPitchAngleIEC() {
        return WindContPitchAngleIEC;
    }

    public void setWindContPitchAngleIEC(BaseClass _object_) {
        if (!(_object_ instanceof WindContPitchAngleIEC)) {
            throw new IllegalArgumentException("Object is not WindContPitchAngleIEC");
        }
        if (!Objects.equals(_object_.getCimModel(), getCimModel())) {
            throw new IllegalArgumentException("Object belongs to different model");
        }
        if (WindContPitchAngleIEC != _object_) {
            WindContPitchAngleIEC = (WindContPitchAngleIEC) _object_;
            WindContPitchAngleIEC.setWindTurbineType3IEC(this);
            WindContPitchAngleIECId = WindContPitchAngleIEC.getRdfid();
        }
    }

    public String WindContPitchAngleIECToString() {
        return WindContPitchAngleIECId;
    }

    /**
     * Wind generator type 3 model associated with this wind turbine type 3 model.
     */
    @Transient
    private WindGenType3IEC WindGenType3IEC; // OneToOne

    @Column(name = "WindGenType3IEC")
    private String WindGenType3IECId;

    public WindGenType3IEC getWindGenType3IEC() {
        return WindGenType3IEC;
    }

    public void setWindGenType3IEC(BaseClass _object_) {
        if (!(_object_ instanceof WindGenType3IEC)) {
            throw new IllegalArgumentException("Object is not WindGenType3IEC");
        }
        if (!Objects.equals(_object_.getCimModel(), getCimModel())) {
            throw new IllegalArgumentException("Object belongs to different model");
        }
        if (WindGenType3IEC != _object_) {
            WindGenType3IEC = (WindGenType3IEC) _object_;
            WindGenType3IEC.setWindTurbineType3IEC(this);
            WindGenType3IECId = WindGenType3IEC.getRdfid();
        }
    }

    public String WindGenType3IECToString() {
        return WindGenType3IECId;
    }

    /**
     * Wind mechanical model associated with this wind turbine type 3 model.
     */
    @Transient
    private WindMechIEC WindMechIEC; // OneToOne

    @Column(name = "WindMechIEC")
    private String WindMechIECId;

    public WindMechIEC getWindMechIEC() {
        return WindMechIEC;
    }

    public void setWindMechIEC(BaseClass _object_) {
        if (!(_object_ instanceof WindMechIEC)) {
            throw new IllegalArgumentException("Object is not WindMechIEC");
        }
        if (!Objects.equals(_object_.getCimModel(), getCimModel())) {
            throw new IllegalArgumentException("Object belongs to different model");
        }
        if (WindMechIEC != _object_) {
            WindMechIEC = (WindMechIEC) _object_;
            WindMechIEC.setWindTurbineType3IEC(this);
            WindMechIECId = WindMechIEC.getRdfid();
        }
    }

    public String WindMechIECToString() {
        return WindMechIECId;
    }

    /**
     * Nested repository. The implementation is automatically created.
     */
    public interface Repository extends CrudRepository<WindTurbineType3IEC, Long> {
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
        return getAttribute("WindTurbineType3IEC", attrName);
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
        setAttribute("WindTurbineType3IEC", attrName, objectValue);
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
        setAttribute("WindTurbineType3IEC", attrName, stringValue);
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

    private static final String CLASS_NAMESPACE = "http://iec.ch/TC57/CIM100#";

    private static final List<String> ATTR_NAMES_LIST;
    private static final Map<String, AttrDetails> ATTR_DETAILS_MAP;
    private static final Map<String, AttrDetails> CLASS_ATTR_DETAILS_MAP;
    static {
        Map<String, AttrDetails> map = new LinkedHashMap<>();
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindAeroOneDimIEC", new AttrDetails("WindTurbineType3IEC.WindAeroOneDimIEC", true, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindAeroTwoDimIEC", new AttrDetails("WindTurbineType3IEC.WindAeroTwoDimIEC", true, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindContPType3IEC", new AttrDetails("WindTurbineType3IEC.WindContPType3IEC", true, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindContPitchAngleIEC", new AttrDetails("WindTurbineType3IEC.WindContPitchAngleIEC", true, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindGenType3IEC", new AttrDetails("WindTurbineType3IEC.WindGenType3IEC", true, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindMechIEC", new AttrDetails("WindTurbineType3IEC.WindMechIEC", true, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new WindTurbineType3IEC().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    @Transient
    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("WindAeroOneDimIEC", new GetterSetter(this::WindAeroOneDimIECToString, this::setWindAeroOneDimIEC, null));
        map.put("WindAeroTwoDimIEC", new GetterSetter(this::WindAeroTwoDimIECToString, this::setWindAeroTwoDimIEC, null));
        map.put("WindContPType3IEC", new GetterSetter(this::WindContPType3IECToString, this::setWindContPType3IEC, null));
        map.put("WindContPitchAngleIEC", new GetterSetter(this::WindContPitchAngleIECToString, this::setWindContPitchAngleIEC, null));
        map.put("WindGenType3IEC", new GetterSetter(this::WindGenType3IECToString, this::setWindGenType3IEC, null));
        map.put("WindMechIEC", new GetterSetter(this::WindMechIECToString, this::setWindMechIEC, null));
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
