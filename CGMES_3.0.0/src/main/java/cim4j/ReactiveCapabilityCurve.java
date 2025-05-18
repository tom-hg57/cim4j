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
 * Reactive power rating envelope versus the synchronous machine's active power, in both the generating and motoring modes. For each active power value there is a corresponding high and low reactive power limit  value. Typically there will be a separate curve for each coolant condition, such as hydrogen pressure.  The Y1 axis values represent reactive minimum and the Y2 axis values represent reactive maximum.
 */
@SuppressWarnings("unused")
public class ReactiveCapabilityCurve extends Curve {

    private static final Logging LOG = Logging.getLogger(ReactiveCapabilityCurve.class);

    /**
     * Constructor.
     */
    public ReactiveCapabilityCurve(String rdfid) {
        super("ReactiveCapabilityCurve", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected ReactiveCapabilityCurve(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * The equivalent injection using this reactive capability curve.
     *
     * NOT USED
     */
    private Set<EquivalentInjection> EquivalentInjection = new HashSet<>(); // OneToMany

    public Set<EquivalentInjection> getEquivalentInjection() {
        return EquivalentInjection;
    }

    public void setEquivalentInjection(BaseClass _object_) {
        if (!(_object_ instanceof EquivalentInjection)) {
            throw new IllegalArgumentException("Object is not EquivalentInjection");
        }
        if (!EquivalentInjection.contains(_object_)) {
            EquivalentInjection.add((EquivalentInjection) _object_);
            ((EquivalentInjection) _object_).setReactiveCapabilityCurve(this);
        }
    }

    public String EquivalentInjectionToString() {
        return getStringFromSet(EquivalentInjection);
    }

    private static void setEquivalentInjection(BaseClass _this_, BaseClass _object_) {
        ((ReactiveCapabilityCurve) _this_).setEquivalentInjection(_object_);
    }

    private static String EquivalentInjectionToString(BaseClass _this_) {
        return ((ReactiveCapabilityCurve) _this_).EquivalentInjectionToString();
    }

    /**
     * Synchronous machines using this curve as default.
     *
     * NOT USED
     */
    private Set<SynchronousMachine> InitiallyUsedBySynchronousMachines = new HashSet<>(); // OneToMany

    public Set<SynchronousMachine> getInitiallyUsedBySynchronousMachines() {
        return InitiallyUsedBySynchronousMachines;
    }

    public void setInitiallyUsedBySynchronousMachines(BaseClass _object_) {
        if (!(_object_ instanceof SynchronousMachine)) {
            throw new IllegalArgumentException("Object is not SynchronousMachine");
        }
        if (!InitiallyUsedBySynchronousMachines.contains(_object_)) {
            InitiallyUsedBySynchronousMachines.add((SynchronousMachine) _object_);
            ((SynchronousMachine) _object_).setInitialReactiveCapabilityCurve(this);
        }
    }

    public String InitiallyUsedBySynchronousMachinesToString() {
        return getStringFromSet(InitiallyUsedBySynchronousMachines);
    }

    private static void setInitiallyUsedBySynchronousMachines(BaseClass _this_, BaseClass _object_) {
        ((ReactiveCapabilityCurve) _this_).setInitiallyUsedBySynchronousMachines(_object_);
    }

    private static String InitiallyUsedBySynchronousMachinesToString(BaseClass _this_) {
        return ((ReactiveCapabilityCurve) _this_).InitiallyUsedBySynchronousMachinesToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ReactiveCapabilityCurve", attrName));
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
                "ReactiveCapabilityCurve", attrName, objectValue));
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
                "ReactiveCapabilityCurve", attrName, stringValue));
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
            profiles.add(CGMESProfile.EQ);
            map.put("EquivalentInjection", new AttrDetails("ReactiveCapabilityCurve.EquivalentInjection", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, ReactiveCapabilityCurve::EquivalentInjectionToString, ReactiveCapabilityCurve::setEquivalentInjection, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("InitiallyUsedBySynchronousMachines", new AttrDetails("ReactiveCapabilityCurve.InitiallyUsedBySynchronousMachines", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, ReactiveCapabilityCurve::InitiallyUsedBySynchronousMachinesToString, ReactiveCapabilityCurve::setInitiallyUsedBySynchronousMachines, null));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ReactiveCapabilityCurve(null).allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.EQ);
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
