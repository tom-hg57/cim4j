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
 * PTI microprocessor-based stabilizer type 1.
 */
@SuppressWarnings("unused")
public class PssPTIST1 extends PowerSystemStabilizerDynamics {

    private static final Logging LOG = Logging.getLogger(PssPTIST1.class);

    /**
     * Default constructor.
     */
    public PssPTIST1() {
        setCimType("PssPTIST1");
    }

    /**
     * Time step related to activation of controls (&lt;i&gt;deltatc&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,025.
     */
    private Double dtc; // Seconds

    public Double getDtc() {
        return dtc;
    }

    public void setDtc(Double _value_) {
        dtc = _value_;
    }

    public void setDtc(String _value_) {
        dtc = getDoubleFromString(_value_);
    }

    public String dtcToString() {
        return dtc != null ? dtc.toString() : null;
    }

    private static void setDtc(BaseClass _this_, String _value_) {
        ((PssPTIST1) _this_).setDtc(_value_);
    }

    private static String dtcToString(BaseClass _this_) {
        return ((PssPTIST1) _this_).dtcToString();
    }

    /**
     * Time step frequency calculation (&lt;i&gt;deltatf&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,025.
     */
    private Double dtf; // Seconds

    public Double getDtf() {
        return dtf;
    }

    public void setDtf(Double _value_) {
        dtf = _value_;
    }

    public void setDtf(String _value_) {
        dtf = getDoubleFromString(_value_);
    }

    public String dtfToString() {
        return dtf != null ? dtf.toString() : null;
    }

    private static void setDtf(BaseClass _this_, String _value_) {
        ((PssPTIST1) _this_).setDtf(_value_);
    }

    private static String dtfToString(BaseClass _this_) {
        return ((PssPTIST1) _this_).dtfToString();
    }

    /**
     * Time step active power calculation (&lt;i&gt;deltatp&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,0125.
     */
    private Double dtp; // Seconds

    public Double getDtp() {
        return dtp;
    }

    public void setDtp(Double _value_) {
        dtp = _value_;
    }

    public void setDtp(String _value_) {
        dtp = getDoubleFromString(_value_);
    }

    public String dtpToString() {
        return dtp != null ? dtp.toString() : null;
    }

    private static void setDtp(BaseClass _this_, String _value_) {
        ((PssPTIST1) _this_).setDtp(_value_);
    }

    private static String dtpToString(BaseClass _this_) {
        return ((PssPTIST1) _this_).dtpToString();
    }

    /**
     * Gain (&lt;i&gt;K&lt;/i&gt;).  Typical value = 9.
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
        ((PssPTIST1) _this_).setK(_value_);
    }

    private static String kToString(BaseClass _this_) {
        return ((PssPTIST1) _this_).kToString();
    }

    /**
     * (&lt;i&gt;M&lt;/i&gt;).  &lt;i&gt;M &lt;/i&gt;= 2 x &lt;i&gt;H&lt;/i&gt;.  Typical value = 5.
     */
    private Double m; // PU

    public Double getM() {
        return m;
    }

    public void setM(Double _value_) {
        m = _value_;
    }

    public void setM(String _value_) {
        m = getDoubleFromString(_value_);
    }

    public String mToString() {
        return m != null ? m.toString() : null;
    }

    private static void setM(BaseClass _this_, String _value_) {
        ((PssPTIST1) _this_).setM(_value_);
    }

    private static String mToString(BaseClass _this_) {
        return ((PssPTIST1) _this_).mToString();
    }

    /**
     * Time constant (&lt;i&gt;T1&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,3.
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
        ((PssPTIST1) _this_).setT1(_value_);
    }

    private static String t1ToString(BaseClass _this_) {
        return ((PssPTIST1) _this_).t1ToString();
    }

    /**
     * Time constant (&lt;i&gt;T2&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 1.
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
        ((PssPTIST1) _this_).setT2(_value_);
    }

    private static String t2ToString(BaseClass _this_) {
        return ((PssPTIST1) _this_).t2ToString();
    }

    /**
     * Time constant (&lt;i&gt;T3&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,2.
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
        ((PssPTIST1) _this_).setT3(_value_);
    }

    private static String t3ToString(BaseClass _this_) {
        return ((PssPTIST1) _this_).t3ToString();
    }

    /**
     * Time constant (&lt;i&gt;T4&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,05.
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
        ((PssPTIST1) _this_).setT4(_value_);
    }

    private static String t4ToString(BaseClass _this_) {
        return ((PssPTIST1) _this_).t4ToString();
    }

    /**
     * Time constant (&lt;i&gt;Tf&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,2.
     */
    private Double tf; // Seconds

    public Double getTf() {
        return tf;
    }

    public void setTf(Double _value_) {
        tf = _value_;
    }

    public void setTf(String _value_) {
        tf = getDoubleFromString(_value_);
    }

    public String tfToString() {
        return tf != null ? tf.toString() : null;
    }

    private static void setTf(BaseClass _this_, String _value_) {
        ((PssPTIST1) _this_).setTf(_value_);
    }

    private static String tfToString(BaseClass _this_) {
        return ((PssPTIST1) _this_).tfToString();
    }

    /**
     * Time constant (&lt;i&gt;Tp&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,2.
     */
    private Double tp; // Seconds

    public Double getTp() {
        return tp;
    }

    public void setTp(Double _value_) {
        tp = _value_;
    }

    public void setTp(String _value_) {
        tp = getDoubleFromString(_value_);
    }

    public String tpToString() {
        return tp != null ? tp.toString() : null;
    }

    private static void setTp(BaseClass _this_, String _value_) {
        ((PssPTIST1) _this_).setTp(_value_);
    }

    private static String tpToString(BaseClass _this_) {
        return ((PssPTIST1) _this_).tpToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "PssPTIST1", attrName));
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
                "PssPTIST1", attrName, objectValue));
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
                "PssPTIST1", attrName, stringValue));
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
            map.put("dtc", new AttrDetails("PssPTIST1.dtc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssPTIST1::dtcToString, null, PssPTIST1::setDtc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dtf", new AttrDetails("PssPTIST1.dtf", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssPTIST1::dtfToString, null, PssPTIST1::setDtf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dtp", new AttrDetails("PssPTIST1.dtp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssPTIST1::dtpToString, null, PssPTIST1::setDtp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k", new AttrDetails("PssPTIST1.k", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssPTIST1::kToString, null, PssPTIST1::setK));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("m", new AttrDetails("PssPTIST1.m", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssPTIST1::mToString, null, PssPTIST1::setM));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t1", new AttrDetails("PssPTIST1.t1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssPTIST1::t1ToString, null, PssPTIST1::setT1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t2", new AttrDetails("PssPTIST1.t2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssPTIST1::t2ToString, null, PssPTIST1::setT2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t3", new AttrDetails("PssPTIST1.t3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssPTIST1::t3ToString, null, PssPTIST1::setT3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t4", new AttrDetails("PssPTIST1.t4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssPTIST1::t4ToString, null, PssPTIST1::setT4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf", new AttrDetails("PssPTIST1.tf", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssPTIST1::tfToString, null, PssPTIST1::setTf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tp", new AttrDetails("PssPTIST1.tp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssPTIST1::tpToString, null, PssPTIST1::setTp));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new PssPTIST1().allAttrDetailsMap());
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
