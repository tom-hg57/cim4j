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
 * A multi-purpose curve or functional relationship between an independent variable (X-axis) and dependent (Y-axis) variables.
 */
@SuppressWarnings("unused")
public class Curve extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(Curve.class);

    /**
     * Constructor.
     */
    public Curve(String rdfid) {
        super("Curve", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected Curve(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * The curve of  this curve data point.
     *
     * NOT USED
     */
    private Set<CurveData> CurveDatas = new HashSet<>(); // OneToMany

    public Set<CurveData> getCurveDatas() {
        return CurveDatas;
    }

    public void setCurveDatas(BaseClass _object_) {
        if (!(_object_ instanceof CurveData)) {
            throw new IllegalArgumentException("Object is not CurveData");
        }
        if (!CurveDatas.contains(_object_)) {
            CurveDatas.add((CurveData) _object_);
            ((CurveData) _object_).setCurve(this);
        }
    }

    public String CurveDatasToString() {
        return getStringFromSet(CurveDatas);
    }

    private static void setCurveDatas(BaseClass _this_, BaseClass _object_) {
        ((Curve) _this_).setCurveDatas(_object_);
    }

    private static String CurveDatasToString(BaseClass _this_) {
        return ((Curve) _this_).CurveDatasToString();
    }

    /**
     * The style or shape of the curve.
     */
    private String curveStyle; // CurveStyle

    public String getCurveStyle() {
        return curveStyle;
    }

    public void setCurveStyle(String _value_) {
        curveStyle = _value_;
    }

    public String curveStyleToString() {
        return curveStyle;
    }

    private static void setCurveStyle(BaseClass _this_, String _value_) {
        ((Curve) _this_).setCurveStyle(_value_);
    }

    private static String curveStyleToString(BaseClass _this_) {
        return ((Curve) _this_).curveStyleToString();
    }

    /**
     * The X-axis units of measure.
     */
    private String xUnit; // UnitSymbol

    public String getXUnit() {
        return xUnit;
    }

    public void setXUnit(String _value_) {
        xUnit = _value_;
    }

    public String xUnitToString() {
        return xUnit;
    }

    private static void setXUnit(BaseClass _this_, String _value_) {
        ((Curve) _this_).setXUnit(_value_);
    }

    private static String xUnitToString(BaseClass _this_) {
        return ((Curve) _this_).xUnitToString();
    }

    /**
     * The Y1-axis units of measure.
     */
    private String y1Unit; // UnitSymbol

    public String getY1Unit() {
        return y1Unit;
    }

    public void setY1Unit(String _value_) {
        y1Unit = _value_;
    }

    public String y1UnitToString() {
        return y1Unit;
    }

    private static void setY1Unit(BaseClass _this_, String _value_) {
        ((Curve) _this_).setY1Unit(_value_);
    }

    private static String y1UnitToString(BaseClass _this_) {
        return ((Curve) _this_).y1UnitToString();
    }

    /**
     * The Y2-axis units of measure.
     */
    private String y2Unit; // UnitSymbol

    public String getY2Unit() {
        return y2Unit;
    }

    public void setY2Unit(String _value_) {
        y2Unit = _value_;
    }

    public String y2UnitToString() {
        return y2Unit;
    }

    private static void setY2Unit(BaseClass _this_, String _value_) {
        ((Curve) _this_).setY2Unit(_value_);
    }

    private static String y2UnitToString(BaseClass _this_) {
        return ((Curve) _this_).y2UnitToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "Curve", attrName));
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
                "Curve", attrName, objectValue));
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
                "Curve", attrName, stringValue));
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
            map.put("CurveDatas", new AttrDetails("Curve.CurveDatas", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, Curve::CurveDatasToString, Curve::setCurveDatas, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("curveStyle", new AttrDetails("Curve.curveStyle", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true, Curve::curveStyleToString, null, Curve::setCurveStyle));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("xUnit", new AttrDetails("Curve.xUnit", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true, Curve::xUnitToString, null, Curve::setXUnit));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("y1Unit", new AttrDetails("Curve.y1Unit", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true, Curve::y1UnitToString, null, Curve::setY1Unit));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("y2Unit", new AttrDetails("Curve.y2Unit", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true, Curve::y2UnitToString, null, Curve::setY2Unit));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new Curve(null).allAttrDetailsMap());
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
