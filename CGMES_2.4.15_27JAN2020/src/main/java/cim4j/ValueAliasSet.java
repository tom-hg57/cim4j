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
 * Describes the translation of a set of values into a name and is intendend to facilitate cusom translations. Each ValueAliasSet has a name, description etc. A specific Measurement may represent a discrete state like Open, Closed, Intermediate etc. This requires a translation from the MeasurementValue.value number to a string, e.g. 0->"Invalid", 1->"Open", 2->"Closed", 3->"Intermediate". Each ValueToAlias member in ValueAliasSet.Value describe a mapping for one particular value to a name.
 */
@SuppressWarnings("unused")
public class ValueAliasSet extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(ValueAliasSet.class);

    /**
     * Constructor.
     */
    public ValueAliasSet(String rdfid) {
        super("ValueAliasSet", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected ValueAliasSet(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * The Commands using the set for translation.
     *
     * NOT USED
     */
    private Set<Command> Commands = new HashSet<>(); // OneToMany

    public Set<Command> getCommands() {
        return Commands;
    }

    public void setCommands(BaseClass _object_) {
        if (!(_object_ instanceof Command)) {
            throw new IllegalArgumentException("Object is not Command");
        }
        if (!Commands.contains(_object_)) {
            Commands.add((Command) _object_);
            ((Command) _object_).setValueAliasSet(this);
        }
    }

    public String CommandsToString() {
        return getStringFromSet(Commands);
    }

    private static void setCommands(BaseClass _this_, BaseClass _object_) {
        ((ValueAliasSet) _this_).setCommands(_object_);
    }

    private static String CommandsToString(BaseClass _this_) {
        return ((ValueAliasSet) _this_).CommandsToString();
    }

    /**
     * The Measurements using the set for translation.
     *
     * NOT USED
     */
    private Set<Discrete> Discretes = new HashSet<>(); // OneToMany

    public Set<Discrete> getDiscretes() {
        return Discretes;
    }

    public void setDiscretes(BaseClass _object_) {
        if (!(_object_ instanceof Discrete)) {
            throw new IllegalArgumentException("Object is not Discrete");
        }
        if (!Discretes.contains(_object_)) {
            Discretes.add((Discrete) _object_);
            ((Discrete) _object_).setValueAliasSet(this);
        }
    }

    public String DiscretesToString() {
        return getStringFromSet(Discretes);
    }

    private static void setDiscretes(BaseClass _this_, BaseClass _object_) {
        ((ValueAliasSet) _this_).setDiscretes(_object_);
    }

    private static String DiscretesToString(BaseClass _this_) {
        return ((ValueAliasSet) _this_).DiscretesToString();
    }

    /**
     * The Commands using the set for translation.
     *
     * NOT USED
     */
    private Set<RaiseLowerCommand> RaiseLowerCommands = new HashSet<>(); // OneToMany

    public Set<RaiseLowerCommand> getRaiseLowerCommands() {
        return RaiseLowerCommands;
    }

    public void setRaiseLowerCommands(BaseClass _object_) {
        if (!(_object_ instanceof RaiseLowerCommand)) {
            throw new IllegalArgumentException("Object is not RaiseLowerCommand");
        }
        if (!RaiseLowerCommands.contains(_object_)) {
            RaiseLowerCommands.add((RaiseLowerCommand) _object_);
            ((RaiseLowerCommand) _object_).setValueAliasSet(this);
        }
    }

    public String RaiseLowerCommandsToString() {
        return getStringFromSet(RaiseLowerCommands);
    }

    private static void setRaiseLowerCommands(BaseClass _this_, BaseClass _object_) {
        ((ValueAliasSet) _this_).setRaiseLowerCommands(_object_);
    }

    private static String RaiseLowerCommandsToString(BaseClass _this_) {
        return ((ValueAliasSet) _this_).RaiseLowerCommandsToString();
    }

    /**
     * The ValueAliasSet having the ValueToAlias mappings.
     *
     * NOT USED
     */
    private Set<ValueToAlias> Values = new HashSet<>(); // OneToMany

    public Set<ValueToAlias> getValues() {
        return Values;
    }

    public void setValues(BaseClass _object_) {
        if (!(_object_ instanceof ValueToAlias)) {
            throw new IllegalArgumentException("Object is not ValueToAlias");
        }
        if (!Values.contains(_object_)) {
            Values.add((ValueToAlias) _object_);
            ((ValueToAlias) _object_).setValueAliasSet(this);
        }
    }

    public String ValuesToString() {
        return getStringFromSet(Values);
    }

    private static void setValues(BaseClass _this_, BaseClass _object_) {
        ((ValueAliasSet) _this_).setValues(_object_);
    }

    private static String ValuesToString(BaseClass _this_) {
        return ((ValueAliasSet) _this_).ValuesToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ValueAliasSet", attrName));
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
                "ValueAliasSet", attrName, objectValue));
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
                "ValueAliasSet", attrName, stringValue));
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
            map.put("Commands", new AttrDetails("ValueAliasSet.Commands", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, ValueAliasSet::CommandsToString, ValueAliasSet::setCommands, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("Discretes", new AttrDetails("ValueAliasSet.Discretes", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, ValueAliasSet::DiscretesToString, ValueAliasSet::setDiscretes, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("RaiseLowerCommands", new AttrDetails("ValueAliasSet.RaiseLowerCommands", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, ValueAliasSet::RaiseLowerCommandsToString, ValueAliasSet::setRaiseLowerCommands, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("Values", new AttrDetails("ValueAliasSet.Values", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, ValueAliasSet::ValuesToString, ValueAliasSet::setValues, null));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ValueAliasSet(null).allAttrDetailsMap());
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
