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
 * Parent class supporting relationships to IEC wind turbines type 3 and type 4 including their control models.
 */
@Entity
@SuppressWarnings("unused")
@Table(name = "WindTurbineType3or4IEC")
public class WindTurbineType3or4IEC extends WindTurbineType3or4Dynamics {

    private static final Logging LOG = Logging.getLogger(WindTurbineType3or4IEC.class);

    /**
     * Default constructor.
     */
    public WindTurbineType3or4IEC() {
        setCimType("WindTurbineType3or4IEC");
    }

    /**
     * Wind control Q model associated with this wind turbine type 3 or type 4 model.
     */
    @Transient
    private WindContQIEC WIndContQIEC; // OneToOne

    @Column(name = "WIndContQIEC")
    private String WIndContQIECId;

    public WindContQIEC getWIndContQIEC() {
        return WIndContQIEC;
    }

    public void setWIndContQIEC(BaseClass _object_) {
        if (!(_object_ instanceof WindContQIEC)) {
            throw new IllegalArgumentException("Object is not WindContQIEC");
        }
        if (!Objects.equals(_object_.getCimModel(), getCimModel())) {
            throw new IllegalArgumentException("Object belongs to different model");
        }
        if (WIndContQIEC != _object_) {
            WIndContQIEC = (WindContQIEC) _object_;
            WIndContQIEC.setWindTurbineType3or4IEC(this);
            WIndContQIECId = WIndContQIEC.getRdfid();
        }
    }

    public String WIndContQIECToString() {
        return WIndContQIECId;
    }

    /**
     * Wind control current limitation model associated with this wind turbine type 3 or type 4 model.
     */
    @Transient
    private WindContCurrLimIEC WindContCurrLimIEC; // OneToOne

    @Column(name = "WindContCurrLimIEC")
    private String WindContCurrLimIECId;

    public WindContCurrLimIEC getWindContCurrLimIEC() {
        return WindContCurrLimIEC;
    }

    public void setWindContCurrLimIEC(BaseClass _object_) {
        if (!(_object_ instanceof WindContCurrLimIEC)) {
            throw new IllegalArgumentException("Object is not WindContCurrLimIEC");
        }
        if (!Objects.equals(_object_.getCimModel(), getCimModel())) {
            throw new IllegalArgumentException("Object belongs to different model");
        }
        if (WindContCurrLimIEC != _object_) {
            WindContCurrLimIEC = (WindContCurrLimIEC) _object_;
            WindContCurrLimIEC.setWindTurbineType3or4IEC(this);
            WindContCurrLimIECId = WindContCurrLimIEC.getRdfid();
        }
    }

    public String WindContCurrLimIECToString() {
        return WindContCurrLimIECId;
    }

    /**
     * Constant Q limitation model associated with this wind generator type 3 or type 4 model.
     */
    @Transient
    private WindContQLimIEC WindContQLimIEC; // OneToOne

    @Column(name = "WindContQLimIEC")
    private String WindContQLimIECId;

    public WindContQLimIEC getWindContQLimIEC() {
        return WindContQLimIEC;
    }

    public void setWindContQLimIEC(BaseClass _object_) {
        if (!(_object_ instanceof WindContQLimIEC)) {
            throw new IllegalArgumentException("Object is not WindContQLimIEC");
        }
        if (!Objects.equals(_object_.getCimModel(), getCimModel())) {
            throw new IllegalArgumentException("Object belongs to different model");
        }
        if (WindContQLimIEC != _object_) {
            WindContQLimIEC = (WindContQLimIEC) _object_;
            WindContQLimIEC.setWindTurbineType3or4IEC(this);
            WindContQLimIECId = WindContQLimIEC.getRdfid();
        }
    }

    public String WindContQLimIECToString() {
        return WindContQLimIECId;
    }

    /**
     * QP and QU limitation model associated with this wind generator type 3 or type 4 model.
     */
    @Transient
    private WindContQPQULimIEC WindContQPQULimIEC; // OneToOne

    @Column(name = "WindContQPQULimIEC")
    private String WindContQPQULimIECId;

    public WindContQPQULimIEC getWindContQPQULimIEC() {
        return WindContQPQULimIEC;
    }

    public void setWindContQPQULimIEC(BaseClass _object_) {
        if (!(_object_ instanceof WindContQPQULimIEC)) {
            throw new IllegalArgumentException("Object is not WindContQPQULimIEC");
        }
        if (!Objects.equals(_object_.getCimModel(), getCimModel())) {
            throw new IllegalArgumentException("Object belongs to different model");
        }
        if (WindContQPQULimIEC != _object_) {
            WindContQPQULimIEC = (WindContQPQULimIEC) _object_;
            WindContQPQULimIEC.setWindTurbineType3or4IEC(this);
            WindContQPQULimIECId = WindContQPQULimIEC.getRdfid();
        }
    }

    public String WindContQPQULimIECToString() {
        return WindContQPQULimIECId;
    }

    /**
     * Wind turbune protection model associated with this wind generator type 3 or type 4 model.
     */
    @Transient
    private WindProtectionIEC WindProtectionIEC; // OneToOne

    @Column(name = "WindProtectionIEC")
    private String WindProtectionIECId;

    public WindProtectionIEC getWindProtectionIEC() {
        return WindProtectionIEC;
    }

    public void setWindProtectionIEC(BaseClass _object_) {
        if (!(_object_ instanceof WindProtectionIEC)) {
            throw new IllegalArgumentException("Object is not WindProtectionIEC");
        }
        if (!Objects.equals(_object_.getCimModel(), getCimModel())) {
            throw new IllegalArgumentException("Object belongs to different model");
        }
        if (WindProtectionIEC != _object_) {
            WindProtectionIEC = (WindProtectionIEC) _object_;
            WindProtectionIEC.setWindTurbineType3or4IEC(this);
            WindProtectionIECId = WindProtectionIEC.getRdfid();
        }
    }

    public String WindProtectionIECToString() {
        return WindProtectionIECId;
    }

    /**
     * Reference frame rotation model associated with this wind turbine type 3 or type 4 model.
     */
    @Transient
    private WindRefFrameRotIEC WindRefFrameRotIEC; // OneToOne

    @Column(name = "WindRefFrameRotIEC")
    private String WindRefFrameRotIECId;

    public WindRefFrameRotIEC getWindRefFrameRotIEC() {
        return WindRefFrameRotIEC;
    }

    public void setWindRefFrameRotIEC(BaseClass _object_) {
        if (!(_object_ instanceof WindRefFrameRotIEC)) {
            throw new IllegalArgumentException("Object is not WindRefFrameRotIEC");
        }
        if (!Objects.equals(_object_.getCimModel(), getCimModel())) {
            throw new IllegalArgumentException("Object belongs to different model");
        }
        if (WindRefFrameRotIEC != _object_) {
            WindRefFrameRotIEC = (WindRefFrameRotIEC) _object_;
            WindRefFrameRotIEC.setWindTurbineType3or4IEC(this);
            WindRefFrameRotIECId = WindRefFrameRotIEC.getRdfid();
        }
    }

    public String WindRefFrameRotIECToString() {
        return WindRefFrameRotIECId;
    }

    /**
     * Nested repository. The implementation is automatically created.
     */
    public interface Repository extends CrudRepository<WindTurbineType3or4IEC, Long> {
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
        return getAttribute("WindTurbineType3or4IEC", attrName);
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
        setAttribute("WindTurbineType3or4IEC", attrName, objectValue);
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
        setAttribute("WindTurbineType3or4IEC", attrName, stringValue);
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
            map.put("WIndContQIEC", new AttrDetails("WindTurbineType3or4IEC.WIndContQIEC", true, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindContCurrLimIEC", new AttrDetails("WindTurbineType3or4IEC.WindContCurrLimIEC", true, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindContQLimIEC", new AttrDetails("WindTurbineType3or4IEC.WindContQLimIEC", true, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindContQPQULimIEC", new AttrDetails("WindTurbineType3or4IEC.WindContQPQULimIEC", true, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindProtectionIEC", new AttrDetails("WindTurbineType3or4IEC.WindProtectionIEC", true, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindRefFrameRotIEC", new AttrDetails("WindTurbineType3or4IEC.WindRefFrameRotIEC", true, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new WindTurbineType3or4IEC().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    @Transient
    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("WIndContQIEC", new GetterSetter(this::WIndContQIECToString, this::setWIndContQIEC, null));
        map.put("WindContCurrLimIEC", new GetterSetter(this::WindContCurrLimIECToString, this::setWindContCurrLimIEC, null));
        map.put("WindContQLimIEC", new GetterSetter(this::WindContQLimIECToString, this::setWindContQLimIEC, null));
        map.put("WindContQPQULimIEC", new GetterSetter(this::WindContQPQULimIECToString, this::setWindContQPQULimIEC, null));
        map.put("WindProtectionIEC", new GetterSetter(this::WindProtectionIECToString, this::setWindProtectionIEC, null));
        map.put("WindRefFrameRotIEC", new GetterSetter(this::WindRefFrameRotIECToString, this::setWindRefFrameRotIEC, null));
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
