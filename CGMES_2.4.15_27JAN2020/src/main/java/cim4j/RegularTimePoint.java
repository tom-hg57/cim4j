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
 * Time point for a schedule where the time between the consecutive points is constant.
 */
@SuppressWarnings("unused")
public class RegularTimePoint extends BaseClass {

    private static final Logging LOG = Logging.getLogger(RegularTimePoint.class);

    /**
     * Constructor.
     */
    public RegularTimePoint(String rdfid) {
        super("RegularTimePoint", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected RegularTimePoint(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Regular interval schedule containing this time point.
     */
    private RegularIntervalSchedule IntervalSchedule; // ManyToOne

    public RegularIntervalSchedule getIntervalSchedule() {
        return IntervalSchedule;
    }

    public void setIntervalSchedule(BaseClass _object_) {
        if (!(_object_ instanceof RegularIntervalSchedule)) {
            throw new IllegalArgumentException("Object is not RegularIntervalSchedule");
        }
        if (IntervalSchedule != _object_) {
            IntervalSchedule = (RegularIntervalSchedule) _object_;
            IntervalSchedule.setTimePoints(this);
        }
    }

    public String IntervalScheduleToString() {
        return IntervalSchedule != null ? IntervalSchedule.getRdfid() : null;
    }

    private static void setIntervalSchedule(BaseClass _this_, BaseClass _object_) {
        ((RegularTimePoint) _this_).setIntervalSchedule(_object_);
    }

    private static String IntervalScheduleToString(BaseClass _this_) {
        return ((RegularTimePoint) _this_).IntervalScheduleToString();
    }

    /**
     * The position of the regular time point in the sequence. Note that time points don`t have to be sequential, i.e. time points may be omitted. The actual time for a RegularTimePoint is computed by multiplying the associated regular interval schedule`s time step with the regular time point sequence number and adding the associated schedules start time.
     */
    private Integer sequenceNumber; // Integer

    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(Integer _value_) {
        sequenceNumber = _value_;
    }

    public void setSequenceNumber(String _value_) {
        sequenceNumber = getIntegerFromString(_value_);
    }

    public String sequenceNumberToString() {
        return sequenceNumber != null ? sequenceNumber.toString() : null;
    }

    private static void setSequenceNumber(BaseClass _this_, String _value_) {
        ((RegularTimePoint) _this_).setSequenceNumber(_value_);
    }

    private static String sequenceNumberToString(BaseClass _this_) {
        return ((RegularTimePoint) _this_).sequenceNumberToString();
    }

    /**
     * The first value at the time. The meaning of the value is defined by the derived type of the associated schedule.
     */
    private Double value1; // Simple_Float

    public Double getValue1() {
        return value1;
    }

    public void setValue1(Double _value_) {
        value1 = _value_;
    }

    public void setValue1(String _value_) {
        value1 = getDoubleFromString(_value_);
    }

    public String value1ToString() {
        return value1 != null ? value1.toString() : null;
    }

    private static void setValue1(BaseClass _this_, String _value_) {
        ((RegularTimePoint) _this_).setValue1(_value_);
    }

    private static String value1ToString(BaseClass _this_) {
        return ((RegularTimePoint) _this_).value1ToString();
    }

    /**
     * The second value at the time. The meaning of the value is defined by the derived type of the associated schedule.
     */
    private Double value2; // Simple_Float

    public Double getValue2() {
        return value2;
    }

    public void setValue2(Double _value_) {
        value2 = _value_;
    }

    public void setValue2(String _value_) {
        value2 = getDoubleFromString(_value_);
    }

    public String value2ToString() {
        return value2 != null ? value2.toString() : null;
    }

    private static void setValue2(BaseClass _this_, String _value_) {
        ((RegularTimePoint) _this_).setValue2(_value_);
    }

    private static String value2ToString(BaseClass _this_) {
        return ((RegularTimePoint) _this_).value2ToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "RegularTimePoint", attrName));
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
                "RegularTimePoint", attrName, objectValue));
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
                "RegularTimePoint", attrName, stringValue));
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
            map.put("IntervalSchedule", new AttrDetails("RegularTimePoint.IntervalSchedule", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, RegularTimePoint::IntervalScheduleToString, RegularTimePoint::setIntervalSchedule, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("sequenceNumber", new AttrDetails("RegularTimePoint.sequenceNumber", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, RegularTimePoint::sequenceNumberToString, null, RegularTimePoint::setSequenceNumber));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("value1", new AttrDetails("RegularTimePoint.value1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, RegularTimePoint::value1ToString, null, RegularTimePoint::setValue1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("value2", new AttrDetails("RegularTimePoint.value2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, RegularTimePoint::value2ToString, null, RegularTimePoint::setValue2));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new RegularTimePoint(null).allAttrDetailsMap());
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
