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
 * Italian excitation system. It represents static field voltage or excitation current feedback excitation system.
 */
@SuppressWarnings("unused")
public class ExcANS extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcANS.class);

    /**
     * Constructor.
     */
    public ExcANS(String rdfid) {
        super("ExcANS", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected ExcANS(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Governor Control Flag (BLINT).  0 = lead-lag regulator 1 = proportional integral regulator. Typical Value = 0.
     */
    private Integer blint; // Integer

    public Integer getBlint() {
        return blint;
    }

    public void setBlint(Integer _value_) {
        blint = _value_;
    }

    public void setBlint(String _value_) {
        blint = getIntegerFromString(_value_);
    }

    public String blintToString() {
        return blint != null ? blint.toString() : null;
    }

    private static void setBlint(BaseClass _this_, String _value_) {
        ((ExcANS) _this_).setBlint(_value_);
    }

    private static String blintToString(BaseClass _this_) {
        return ((ExcANS) _this_).blintToString();
    }

    /**
     * Minimum exciter current (I).  Typical Value = -5.2.
     */
    private Double ifmn; // PU

    public Double getIfmn() {
        return ifmn;
    }

    public void setIfmn(Double _value_) {
        ifmn = _value_;
    }

    public void setIfmn(String _value_) {
        ifmn = getDoubleFromString(_value_);
    }

    public String ifmnToString() {
        return ifmn != null ? ifmn.toString() : null;
    }

    private static void setIfmn(BaseClass _this_, String _value_) {
        ((ExcANS) _this_).setIfmn(_value_);
    }

    private static String ifmnToString(BaseClass _this_) {
        return ((ExcANS) _this_).ifmnToString();
    }

    /**
     * Maximum exciter current (I).  Typical Value = 6.5.
     */
    private Double ifmx; // PU

    public Double getIfmx() {
        return ifmx;
    }

    public void setIfmx(Double _value_) {
        ifmx = _value_;
    }

    public void setIfmx(String _value_) {
        ifmx = getDoubleFromString(_value_);
    }

    public String ifmxToString() {
        return ifmx != null ? ifmx.toString() : null;
    }

    private static void setIfmx(BaseClass _this_, String _value_) {
        ((ExcANS) _this_).setIfmx(_value_);
    }

    private static String ifmxToString(BaseClass _this_) {
        return ((ExcANS) _this_).ifmxToString();
    }

    /**
     * Exciter gain (K).  Typical Value = 20.
     */
    private Double k2; // Simple_Float

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
        ((ExcANS) _this_).setK2(_value_);
    }

    private static String k2ToString(BaseClass _this_) {
        return ((ExcANS) _this_).k2ToString();
    }

    /**
     * AVR gain (K).  Typical Value = 1000.
     */
    private Double k3; // Simple_Float

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
        ((ExcANS) _this_).setK3(_value_);
    }

    private static String k3ToString(BaseClass _this_) {
        return ((ExcANS) _this_).k3ToString();
    }

    /**
     * Ceiling factor (K).  Typical Value = 1.
     */
    private Double kce; // Simple_Float

    public Double getKce() {
        return kce;
    }

    public void setKce(Double _value_) {
        kce = _value_;
    }

    public void setKce(String _value_) {
        kce = getDoubleFromString(_value_);
    }

    public String kceToString() {
        return kce != null ? kce.toString() : null;
    }

    private static void setKce(BaseClass _this_, String _value_) {
        ((ExcANS) _this_).setKce(_value_);
    }

    private static String kceToString(BaseClass _this_) {
        return ((ExcANS) _this_).kceToString();
    }

    /**
     * Feedback enabling (K).  0 = Open loop control 1 = Closed loop control. Typical Value = 1.
     */
    private Integer krvecc; // Integer

    public Integer getKrvecc() {
        return krvecc;
    }

    public void setKrvecc(Integer _value_) {
        krvecc = _value_;
    }

    public void setKrvecc(String _value_) {
        krvecc = getIntegerFromString(_value_);
    }

    public String krveccToString() {
        return krvecc != null ? krvecc.toString() : null;
    }

    private static void setKrvecc(BaseClass _this_, String _value_) {
        ((ExcANS) _this_).setKrvecc(_value_);
    }

    private static String krveccToString(BaseClass _this_) {
        return ((ExcANS) _this_).krveccToString();
    }

    /**
     * Rate feedback signal flag (K).  0 = output voltage of the exciter 1 = exciter field current. Typical Value = 0.
     */
    private Integer kvfif; // Integer

    public Integer getKvfif() {
        return kvfif;
    }

    public void setKvfif(Integer _value_) {
        kvfif = _value_;
    }

    public void setKvfif(String _value_) {
        kvfif = getIntegerFromString(_value_);
    }

    public String kvfifToString() {
        return kvfif != null ? kvfif.toString() : null;
    }

    private static void setKvfif(BaseClass _this_, String _value_) {
        ((ExcANS) _this_).setKvfif(_value_);
    }

    private static String kvfifToString(BaseClass _this_) {
        return ((ExcANS) _this_).kvfifToString();
    }

    /**
     * Time constant (T).  Typical Value = 20.
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
        ((ExcANS) _this_).setT1(_value_);
    }

    private static String t1ToString(BaseClass _this_) {
        return ((ExcANS) _this_).t1ToString();
    }

    /**
     * Time constant (T).  Typical Value = 0.05.
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
        ((ExcANS) _this_).setT2(_value_);
    }

    private static String t2ToString(BaseClass _this_) {
        return ((ExcANS) _this_).t2ToString();
    }

    /**
     * Time constant (T).  Typical Value = 1.6.
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
        ((ExcANS) _this_).setT3(_value_);
    }

    private static String t3ToString(BaseClass _this_) {
        return ((ExcANS) _this_).t3ToString();
    }

    /**
     * Exciter time constant (T).  Typical Value = 0.04.
     */
    private Double tb; // Seconds

    public Double getTb() {
        return tb;
    }

    public void setTb(Double _value_) {
        tb = _value_;
    }

    public void setTb(String _value_) {
        tb = getDoubleFromString(_value_);
    }

    public String tbToString() {
        return tb != null ? tb.toString() : null;
    }

    private static void setTb(BaseClass _this_, String _value_) {
        ((ExcANS) _this_).setTb(_value_);
    }

    private static String tbToString(BaseClass _this_) {
        return ((ExcANS) _this_).tbToString();
    }

    /**
     * Maximum AVR output (V).  Typical Value = -5.2.
     */
    private Double vrmn; // PU

    public Double getVrmn() {
        return vrmn;
    }

    public void setVrmn(Double _value_) {
        vrmn = _value_;
    }

    public void setVrmn(String _value_) {
        vrmn = getDoubleFromString(_value_);
    }

    public String vrmnToString() {
        return vrmn != null ? vrmn.toString() : null;
    }

    private static void setVrmn(BaseClass _this_, String _value_) {
        ((ExcANS) _this_).setVrmn(_value_);
    }

    private static String vrmnToString(BaseClass _this_) {
        return ((ExcANS) _this_).vrmnToString();
    }

    /**
     * Minimum AVR output (V).  Typical Value = 6.5.
     */
    private Double vrmx; // PU

    public Double getVrmx() {
        return vrmx;
    }

    public void setVrmx(Double _value_) {
        vrmx = _value_;
    }

    public void setVrmx(String _value_) {
        vrmx = getDoubleFromString(_value_);
    }

    public String vrmxToString() {
        return vrmx != null ? vrmx.toString() : null;
    }

    private static void setVrmx(BaseClass _this_, String _value_) {
        ((ExcANS) _this_).setVrmx(_value_);
    }

    private static String vrmxToString(BaseClass _this_) {
        return ((ExcANS) _this_).vrmxToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ExcANS", attrName));
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
                "ExcANS", attrName, objectValue));
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
                "ExcANS", attrName, stringValue));
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
            map.put("blint", new AttrDetails("ExcANS.blint", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcANS::blintToString, null, ExcANS::setBlint));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ifmn", new AttrDetails("ExcANS.ifmn", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcANS::ifmnToString, null, ExcANS::setIfmn));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ifmx", new AttrDetails("ExcANS.ifmx", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcANS::ifmxToString, null, ExcANS::setIfmx));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k2", new AttrDetails("ExcANS.k2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcANS::k2ToString, null, ExcANS::setK2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k3", new AttrDetails("ExcANS.k3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcANS::k3ToString, null, ExcANS::setK3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kce", new AttrDetails("ExcANS.kce", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcANS::kceToString, null, ExcANS::setKce));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("krvecc", new AttrDetails("ExcANS.krvecc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcANS::krveccToString, null, ExcANS::setKrvecc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kvfif", new AttrDetails("ExcANS.kvfif", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcANS::kvfifToString, null, ExcANS::setKvfif));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t1", new AttrDetails("ExcANS.t1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcANS::t1ToString, null, ExcANS::setT1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t2", new AttrDetails("ExcANS.t2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcANS::t2ToString, null, ExcANS::setT2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t3", new AttrDetails("ExcANS.t3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcANS::t3ToString, null, ExcANS::setT3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tb", new AttrDetails("ExcANS.tb", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcANS::tbToString, null, ExcANS::setTb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmn", new AttrDetails("ExcANS.vrmn", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcANS::vrmnToString, null, ExcANS::setVrmn));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmx", new AttrDetails("ExcANS.vrmx", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcANS::vrmxToString, null, ExcANS::setVrmx));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcANS(null).allAttrDetailsMap());
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
