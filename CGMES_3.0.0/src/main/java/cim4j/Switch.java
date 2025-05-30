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
 * A generic device designed to close, or open, or both, one or more electric circuits.  All switches are two terminal devices including grounding switches. The ACDCTerminal.connected at the two sides of the switch shall not be considered for assessing switch connectivity, i.e. only Switch.open, .normalOpen and .locked are relevant.
 */
@SuppressWarnings("unused")
public class Switch extends ConductingEquipment {

    private static final Logging LOG = Logging.getLogger(Switch.class);

    /**
     * Default constructor.
     */
    public Switch() {
        setCimType("Switch");
    }

    /**
     * The switch state associated with the switch.
     *
     * NOT USED
     */
    private Set<SvSwitch> SvSwitch = new HashSet<>(); // OneToMany

    public Set<SvSwitch> getSvSwitch() {
        return SvSwitch;
    }

    public void setSvSwitch(BaseClass _object_) {
        if (!(_object_ instanceof SvSwitch)) {
            throw new IllegalArgumentException("Object is not SvSwitch");
        }
        if (!SvSwitch.contains(_object_)) {
            SvSwitch.add((SvSwitch) _object_);
            ((SvSwitch) _object_).setSwitch(this);
        }
    }

    public String SvSwitchToString() {
        return getStringFromSet(SvSwitch);
    }

    /**
     * A Switch can be associated with SwitchSchedules.
     *
     * NOT USED
     */
    private Set<SwitchSchedule> SwitchSchedules = new HashSet<>(); // OneToMany

    public Set<SwitchSchedule> getSwitchSchedules() {
        return SwitchSchedules;
    }

    public void setSwitchSchedules(BaseClass _object_) {
        if (!(_object_ instanceof SwitchSchedule)) {
            throw new IllegalArgumentException("Object is not SwitchSchedule");
        }
        if (!SwitchSchedules.contains(_object_)) {
            SwitchSchedules.add((SwitchSchedule) _object_);
            ((SwitchSchedule) _object_).setSwitch(this);
        }
    }

    public String SwitchSchedulesToString() {
        return getStringFromSet(SwitchSchedules);
    }

    /**
     * If true, the switch is locked. The resulting switch state is a combination of locked and Switch.open attributes as follows: &lt;ul&gt; 	&lt;li&gt;locked=true and Switch.open=true. The resulting state is open and locked;&lt;/li&gt; 	&lt;li&gt;locked=false and Switch.open=true. The resulting state is open;&lt;/li&gt; 	&lt;li&gt;locked=false and Switch.open=false. The resulting state is closed.&lt;/li&gt; &lt;/ul&gt;
     */
    private Boolean locked; // Boolean

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean _value_) {
        locked = _value_;
    }

    public void setLocked(String _value_) {
        locked = getBooleanFromString(_value_);
    }

    public String lockedToString() {
        return locked != null ? locked.toString() : null;
    }

    /**
     * The attribute is used in cases when no Measurement for the status value is present. If the Switch has a status measurement the Discrete.normalValue is expected to match with the Switch.normalOpen.
     */
    private Boolean normalOpen; // Boolean

    public Boolean getNormalOpen() {
        return normalOpen;
    }

    public void setNormalOpen(Boolean _value_) {
        normalOpen = _value_;
    }

    public void setNormalOpen(String _value_) {
        normalOpen = getBooleanFromString(_value_);
    }

    public String normalOpenToString() {
        return normalOpen != null ? normalOpen.toString() : null;
    }

    /**
     * The attribute tells if the switch is considered open when used as input to topology processing.
     */
    private Boolean open; // Boolean

    public Boolean getOpen() {
        return open;
    }

    public void setOpen(Boolean _value_) {
        open = _value_;
    }

    public void setOpen(String _value_) {
        open = getBooleanFromString(_value_);
    }

    public String openToString() {
        return open != null ? open.toString() : null;
    }

    /**
     * The maximum continuous current carrying capacity in amps governed by the device material and construction. The attribute shall be a positive value.
     */
    private Double ratedCurrent; // CurrentFlow

    public Double getRatedCurrent() {
        return ratedCurrent;
    }

    public void setRatedCurrent(Double _value_) {
        ratedCurrent = _value_;
    }

    public void setRatedCurrent(String _value_) {
        ratedCurrent = getDoubleFromString(_value_);
    }

    public String ratedCurrentToString() {
        return ratedCurrent != null ? ratedCurrent.toString() : null;
    }

    /**
     * Branch is retained in the topological solution.  The flow through retained switches will normally be calculated in power flow.
     */
    private Boolean retained; // Boolean

    public Boolean getRetained() {
        return retained;
    }

    public void setRetained(Boolean _value_) {
        retained = _value_;
    }

    public void setRetained(String _value_) {
        retained = getBooleanFromString(_value_);
    }

    public String retainedToString() {
        return retained != null ? retained.toString() : null;
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
        return getAttribute("Switch", attrName);
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
        setAttribute("Switch", attrName, objectValue);
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
        setAttribute("Switch", attrName, stringValue);
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
            profiles.add(CGMESProfile.SV);
            map.put("SvSwitch", new AttrDetails("Switch.SvSwitch", false, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("SwitchSchedules", new AttrDetails("Switch.SwitchSchedules", false, "http://iec.ch/TC57/CIM100#", profiles, false, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("locked", new AttrDetails("Switch.locked", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("normalOpen", new AttrDetails("Switch.normalOpen", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("open", new AttrDetails("Switch.open", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("ratedCurrent", new AttrDetails("Switch.ratedCurrent", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("retained", new AttrDetails("Switch.retained", true, "http://iec.ch/TC57/CIM100#", profiles, true, false));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new Switch().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private final Map<String, GetterSetter> classGetterSetterMap = fillGetterSetterMap();
    private final Map<String, GetterSetter> fillGetterSetterMap() {
        Map<String, GetterSetter> map = new LinkedHashMap<>();
        map.put("SvSwitch", new GetterSetter(this::SvSwitchToString, this::setSvSwitch, null));
        map.put("SwitchSchedules", new GetterSetter(this::SwitchSchedulesToString, this::setSwitchSchedules, null));
        map.put("locked", new GetterSetter(this::lockedToString, null, this::setLocked));
        map.put("normalOpen", new GetterSetter(this::normalOpenToString, null, this::setNormalOpen));
        map.put("open", new GetterSetter(this::openToString, null, this::setOpen));
        map.put("ratedCurrent", new GetterSetter(this::ratedCurrentToString, null, this::setRatedCurrent));
        map.put("retained", new GetterSetter(this::retainedToString, null, this::setRetained));
        return map;
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.EQ);
        profiles.add(CGMESProfile.SSH);
        profiles.add(CGMESProfile.SV);
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
