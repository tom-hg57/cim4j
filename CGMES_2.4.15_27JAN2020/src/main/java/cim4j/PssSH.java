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
 * Model for Siemens "H infinity" power system stabilizer with generator electrical power input.
 */
@SuppressWarnings("unused")
public class PssSH extends PowerSystemStabilizerDynamics {

    private static final Logging LOG = Logging.getLogger(PssSH.class);

    /**
     * Constructor.
     */
    public PssSH(String rdfid) {
        super("PssSH", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected PssSH(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Main gain (K).  Typical Value = 1.
     */
    private Double k; // PU

    public Double getK() {
        return k;
    }

    public void setK(Double _value_) {
        k = _value_;
    }

    public void setK(String _value_) {
        k = getDoubleFromString(_value_);
    }

    public String kToString() {
        return k != null ? k.toString() : null;
    }

    private static void setK(BaseClass _this_, String _value_) {
        ((PssSH) _this_).setK(_value_);
    }

    private static String kToString(BaseClass _this_) {
        return ((PssSH) _this_).kToString();
    }

    /**
     * Gain 0 (K0).  Typical Value = 0.012.
     */
    private Double k0; // PU

    public Double getK0() {
        return k0;
    }

    public void setK0(Double _value_) {
        k0 = _value_;
    }

    public void setK0(String _value_) {
        k0 = getDoubleFromString(_value_);
    }

    public String k0ToString() {
        return k0 != null ? k0.toString() : null;
    }

    private static void setK0(BaseClass _this_, String _value_) {
        ((PssSH) _this_).setK0(_value_);
    }

    private static String k0ToString(BaseClass _this_) {
        return ((PssSH) _this_).k0ToString();
    }

    /**
     * Gain 1 (K1).  Typical Value = 0.488.
     */
    private Double k1; // PU

    public Double getK1() {
        return k1;
    }

    public void setK1(Double _value_) {
        k1 = _value_;
    }

    public void setK1(String _value_) {
        k1 = getDoubleFromString(_value_);
    }

    public String k1ToString() {
        return k1 != null ? k1.toString() : null;
    }

    private static void setK1(BaseClass _this_, String _value_) {
        ((PssSH) _this_).setK1(_value_);
    }

    private static String k1ToString(BaseClass _this_) {
        return ((PssSH) _this_).k1ToString();
    }

    /**
     * Gain 2 (K2).  Typical Value = 0.064.
     */
    private Double k2; // PU

    public Double getK2() {
        return k2;
    }

    public void setK2(Double _value_) {
        k2 = _value_;
    }

    public void setK2(String _value_) {
        k2 = getDoubleFromString(_value_);
    }

    public String k2ToString() {
        return k2 != null ? k2.toString() : null;
    }

    private static void setK2(BaseClass _this_, String _value_) {
        ((PssSH) _this_).setK2(_value_);
    }

    private static String k2ToString(BaseClass _this_) {
        return ((PssSH) _this_).k2ToString();
    }

    /**
     * Gain 3 (K3).  Typical Value = 0.224.
     */
    private Double k3; // PU

    public Double getK3() {
        return k3;
    }

    public void setK3(Double _value_) {
        k3 = _value_;
    }

    public void setK3(String _value_) {
        k3 = getDoubleFromString(_value_);
    }

    public String k3ToString() {
        return k3 != null ? k3.toString() : null;
    }

    private static void setK3(BaseClass _this_, String _value_) {
        ((PssSH) _this_).setK3(_value_);
    }

    private static String k3ToString(BaseClass _this_) {
        return ((PssSH) _this_).k3ToString();
    }

    /**
     * Gain 4 (K4).  Typical Value = 0.1.
     */
    private Double k4; // PU

    public Double getK4() {
        return k4;
    }

    public void setK4(Double _value_) {
        k4 = _value_;
    }

    public void setK4(String _value_) {
        k4 = getDoubleFromString(_value_);
    }

    public String k4ToString() {
        return k4 != null ? k4.toString() : null;
    }

    private static void setK4(BaseClass _this_, String _value_) {
        ((PssSH) _this_).setK4(_value_);
    }

    private static String k4ToString(BaseClass _this_) {
        return ((PssSH) _this_).k4ToString();
    }

    /**
     * Time constant 1 (T1).  Typical Value = 0.076.
     */
    private Double t1; // Seconds

    public Double getT1() {
        return t1;
    }

    public void setT1(Double _value_) {
        t1 = _value_;
    }

    public void setT1(String _value_) {
        t1 = getDoubleFromString(_value_);
    }

    public String t1ToString() {
        return t1 != null ? t1.toString() : null;
    }

    private static void setT1(BaseClass _this_, String _value_) {
        ((PssSH) _this_).setT1(_value_);
    }

    private static String t1ToString(BaseClass _this_) {
        return ((PssSH) _this_).t1ToString();
    }

    /**
     * Time constant 2 (T2).  Typical Value = 0.086.
     */
    private Double t2; // Seconds

    public Double getT2() {
        return t2;
    }

    public void setT2(Double _value_) {
        t2 = _value_;
    }

    public void setT2(String _value_) {
        t2 = getDoubleFromString(_value_);
    }

    public String t2ToString() {
        return t2 != null ? t2.toString() : null;
    }

    private static void setT2(BaseClass _this_, String _value_) {
        ((PssSH) _this_).setT2(_value_);
    }

    private static String t2ToString(BaseClass _this_) {
        return ((PssSH) _this_).t2ToString();
    }

    /**
     * Time constant 3 (T3).   Typical Value = 1.068.
     */
    private Double t3; // Seconds

    public Double getT3() {
        return t3;
    }

    public void setT3(Double _value_) {
        t3 = _value_;
    }

    public void setT3(String _value_) {
        t3 = getDoubleFromString(_value_);
    }

    public String t3ToString() {
        return t3 != null ? t3.toString() : null;
    }

    private static void setT3(BaseClass _this_, String _value_) {
        ((PssSH) _this_).setT3(_value_);
    }

    private static String t3ToString(BaseClass _this_) {
        return ((PssSH) _this_).t3ToString();
    }

    /**
     * Time constant 4 (T4).  Typical Value = 1.913.
     */
    private Double t4; // Seconds

    public Double getT4() {
        return t4;
    }

    public void setT4(Double _value_) {
        t4 = _value_;
    }

    public void setT4(String _value_) {
        t4 = getDoubleFromString(_value_);
    }

    public String t4ToString() {
        return t4 != null ? t4.toString() : null;
    }

    private static void setT4(BaseClass _this_, String _value_) {
        ((PssSH) _this_).setT4(_value_);
    }

    private static String t4ToString(BaseClass _this_) {
        return ((PssSH) _this_).t4ToString();
    }

    /**
     * Input time constant (Td).  Typical Value = 10.
     */
    private Double td; // Seconds

    public Double getTd() {
        return td;
    }

    public void setTd(Double _value_) {
        td = _value_;
    }

    public void setTd(String _value_) {
        td = getDoubleFromString(_value_);
    }

    public String tdToString() {
        return td != null ? td.toString() : null;
    }

    private static void setTd(BaseClass _this_, String _value_) {
        ((PssSH) _this_).setTd(_value_);
    }

    private static String tdToString(BaseClass _this_) {
        return ((PssSH) _this_).tdToString();
    }

    /**
     * Output maximum limit (Vsmax).  Typical Value = 0.1.
     */
    private Double vsmax; // PU

    public Double getVsmax() {
        return vsmax;
    }

    public void setVsmax(Double _value_) {
        vsmax = _value_;
    }

    public void setVsmax(String _value_) {
        vsmax = getDoubleFromString(_value_);
    }

    public String vsmaxToString() {
        return vsmax != null ? vsmax.toString() : null;
    }

    private static void setVsmax(BaseClass _this_, String _value_) {
        ((PssSH) _this_).setVsmax(_value_);
    }

    private static String vsmaxToString(BaseClass _this_) {
        return ((PssSH) _this_).vsmaxToString();
    }

    /**
     * Output minimum limit (Vsmin).  Typical Value = -0.1.
     */
    private Double vsmin; // PU

    public Double getVsmin() {
        return vsmin;
    }

    public void setVsmin(Double _value_) {
        vsmin = _value_;
    }

    public void setVsmin(String _value_) {
        vsmin = getDoubleFromString(_value_);
    }

    public String vsminToString() {
        return vsmin != null ? vsmin.toString() : null;
    }

    private static void setVsmin(BaseClass _this_, String _value_) {
        ((PssSH) _this_).setVsmin(_value_);
    }

    private static String vsminToString(BaseClass _this_) {
        return ((PssSH) _this_).vsminToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "PssSH", attrName));
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
                "PssSH", attrName, objectValue));
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
                "PssSH", attrName, stringValue));
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
            map.put("k", new AttrDetails("PssSH.k", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssSH::kToString, null, PssSH::setK));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k0", new AttrDetails("PssSH.k0", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssSH::k0ToString, null, PssSH::setK0));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k1", new AttrDetails("PssSH.k1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssSH::k1ToString, null, PssSH::setK1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k2", new AttrDetails("PssSH.k2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssSH::k2ToString, null, PssSH::setK2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k3", new AttrDetails("PssSH.k3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssSH::k3ToString, null, PssSH::setK3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k4", new AttrDetails("PssSH.k4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssSH::k4ToString, null, PssSH::setK4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t1", new AttrDetails("PssSH.t1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssSH::t1ToString, null, PssSH::setT1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t2", new AttrDetails("PssSH.t2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssSH::t2ToString, null, PssSH::setT2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t3", new AttrDetails("PssSH.t3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssSH::t3ToString, null, PssSH::setT3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t4", new AttrDetails("PssSH.t4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssSH::t4ToString, null, PssSH::setT4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("td", new AttrDetails("PssSH.td", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssSH::tdToString, null, PssSH::setTd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vsmax", new AttrDetails("PssSH.vsmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssSH::vsmaxToString, null, PssSH::setVsmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vsmin", new AttrDetails("PssSH.vsmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PssSH::vsminToString, null, PssSH::setVsmin));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new PssSH(null).allAttrDetailsMap());
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
