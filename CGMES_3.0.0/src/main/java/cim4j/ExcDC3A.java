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
 * Modified IEEE DC3A direct current commutator exciter with speed input, and deadband.  DC old type 4.
 */
@SuppressWarnings("unused")
public class ExcDC3A extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcDC3A.class);

    /**
     * Default constructor.
     */
    public ExcDC3A() {
        setCimType("ExcDC3A");
    }

    /**
     * Exciter voltage at which exciter saturation is defined (&lt;i&gt;Efd&lt;/i&gt;&lt;i&gt;&lt;sub&gt;1&lt;/sub&gt;&lt;/i&gt;) (&amp;gt; 0).  Typical value = 2,6.
     */
    private Double efd1; // PU

    public Double getEfd1() {
        return efd1;
    }

    public void setEfd1(Double _value_) {
        efd1 = _value_;
    }

    public void setEfd1(String _value_) {
        efd1 = getDoubleFromString(_value_);
    }

    public String efd1ToString() {
        return efd1 != null ? efd1.toString() : null;
    }

    private static void setEfd1(BaseClass _this_, String _value_) {
        ((ExcDC3A) _this_).setEfd1(_value_);
    }

    private static String efd1ToString(BaseClass _this_) {
        return ((ExcDC3A) _this_).efd1ToString();
    }

    /**
     * Exciter voltage at which exciter saturation is defined (&lt;i&gt;Efd&lt;/i&gt;&lt;i&gt;&lt;sub&gt;2&lt;/sub&gt;&lt;/i&gt;) (&amp;gt; 0).  Typical value = 3,45.
     */
    private Double efd2; // PU

    public Double getEfd2() {
        return efd2;
    }

    public void setEfd2(Double _value_) {
        efd2 = _value_;
    }

    public void setEfd2(String _value_) {
        efd2 = getDoubleFromString(_value_);
    }

    public String efd2ToString() {
        return efd2 != null ? efd2.toString() : null;
    }

    private static void setEfd2(BaseClass _this_, String _value_) {
        ((ExcDC3A) _this_).setEfd2(_value_);
    }

    private static String efd2ToString(BaseClass _this_) {
        return ((ExcDC3A) _this_).efd2ToString();
    }

    /**
     * (&lt;i&gt;Efdlim&lt;/i&gt;). true = exciter output limiter is active false = exciter output limiter not active. Typical value = true.
     */
    private Boolean efdlim; // Boolean

    public Boolean getEfdlim() {
        return efdlim;
    }

    public void setEfdlim(Boolean _value_) {
        efdlim = _value_;
    }

    public void setEfdlim(String _value_) {
        efdlim = getBooleanFromString(_value_);
    }

    public String efdlimToString() {
        return efdlim != null ? efdlim.toString() : null;
    }

    private static void setEfdlim(BaseClass _this_, String _value_) {
        ((ExcDC3A) _this_).setEfdlim(_value_);
    }

    private static String efdlimToString(BaseClass _this_) {
        return ((ExcDC3A) _this_).efdlimToString();
    }

    /**
     * Maximum voltage exciter output limiter (&lt;i&gt;Efdmax&lt;/i&gt;) (&amp;gt; ExcDC3A.efdmin).  Typical value = 99.
     */
    private Double efdmax; // PU

    public Double getEfdmax() {
        return efdmax;
    }

    public void setEfdmax(Double _value_) {
        efdmax = _value_;
    }

    public void setEfdmax(String _value_) {
        efdmax = getDoubleFromString(_value_);
    }

    public String efdmaxToString() {
        return efdmax != null ? efdmax.toString() : null;
    }

    private static void setEfdmax(BaseClass _this_, String _value_) {
        ((ExcDC3A) _this_).setEfdmax(_value_);
    }

    private static String efdmaxToString(BaseClass _this_) {
        return ((ExcDC3A) _this_).efdmaxToString();
    }

    /**
     * Minimum voltage exciter output limiter (&lt;i&gt;Efdmin&lt;/i&gt;) (&amp;lt; ExcDC3A.efdmax).  Typical value = -99.
     */
    private Double efdmin; // PU

    public Double getEfdmin() {
        return efdmin;
    }

    public void setEfdmin(Double _value_) {
        efdmin = _value_;
    }

    public void setEfdmin(String _value_) {
        efdmin = getDoubleFromString(_value_);
    }

    public String efdminToString() {
        return efdmin != null ? efdmin.toString() : null;
    }

    private static void setEfdmin(BaseClass _this_, String _value_) {
        ((ExcDC3A) _this_).setEfdmin(_value_);
    }

    private static String efdminToString(BaseClass _this_) {
        return ((ExcDC3A) _this_).efdminToString();
    }

    /**
     * (&lt;i&gt;exclim&lt;/i&gt;).  IEEE standard is ambiguous about lower limit on exciter output. true = a lower limit of zero is applied to integrator output false = a lower limit of zero not applied to integrator output. Typical value = true.
     */
    private Boolean exclim; // Boolean

    public Boolean getExclim() {
        return exclim;
    }

    public void setExclim(Boolean _value_) {
        exclim = _value_;
    }

    public void setExclim(String _value_) {
        exclim = getBooleanFromString(_value_);
    }

    public String exclimToString() {
        return exclim != null ? exclim.toString() : null;
    }

    private static void setExclim(BaseClass _this_, String _value_) {
        ((ExcDC3A) _this_).setExclim(_value_);
    }

    private static String exclimToString(BaseClass _this_) {
        return ((ExcDC3A) _this_).exclimToString();
    }

    /**
     * Exciter constant related to self-excited field (&lt;i&gt;Ke&lt;/i&gt;).  Typical value = 1.
     */
    private Double ke; // PU

    public Double getKe() {
        return ke;
    }

    public void setKe(Double _value_) {
        ke = _value_;
    }

    public void setKe(String _value_) {
        ke = getDoubleFromString(_value_);
    }

    public String keToString() {
        return ke != null ? ke.toString() : null;
    }

    private static void setKe(BaseClass _this_, String _value_) {
        ((ExcDC3A) _this_).setKe(_value_);
    }

    private static String keToString(BaseClass _this_) {
        return ((ExcDC3A) _this_).keToString();
    }

    /**
     * Deadband (&lt;i&gt;Kr&lt;/i&gt;).  Typical value = 0.
     */
    private Double kr; // PU

    public Double getKr() {
        return kr;
    }

    public void setKr(Double _value_) {
        kr = _value_;
    }

    public void setKr(String _value_) {
        kr = getDoubleFromString(_value_);
    }

    public String krToString() {
        return kr != null ? kr.toString() : null;
    }

    private static void setKr(BaseClass _this_, String _value_) {
        ((ExcDC3A) _this_).setKr(_value_);
    }

    private static String krToString(BaseClass _this_) {
        return ((ExcDC3A) _this_).krToString();
    }

    /**
     * Coefficient to allow different usage of the model-speed coefficient (&lt;i&gt;Ks&lt;/i&gt;).  Typical value = 0.
     */
    private Double ks; // PU

    public Double getKs() {
        return ks;
    }

    public void setKs(Double _value_) {
        ks = _value_;
    }

    public void setKs(String _value_) {
        ks = getDoubleFromString(_value_);
    }

    public String ksToString() {
        return ks != null ? ks.toString() : null;
    }

    private static void setKs(BaseClass _this_, String _value_) {
        ((ExcDC3A) _this_).setKs(_value_);
    }

    private static String ksToString(BaseClass _this_) {
        return ((ExcDC3A) _this_).ksToString();
    }

    /**
     * Fast raise/lower contact setting (&lt;i&gt;Kv&lt;/i&gt;) (&amp;gt; 0).  Typical value = 0,05.
     */
    private Double kv; // PU

    public Double getKv() {
        return kv;
    }

    public void setKv(Double _value_) {
        kv = _value_;
    }

    public void setKv(String _value_) {
        kv = getDoubleFromString(_value_);
    }

    public String kvToString() {
        return kv != null ? kv.toString() : null;
    }

    private static void setKv(BaseClass _this_, String _value_) {
        ((ExcDC3A) _this_).setKv(_value_);
    }

    private static String kvToString(BaseClass _this_) {
        return ((ExcDC3A) _this_).kvToString();
    }

    /**
     * Exciter saturation function value at the corresponding exciter voltage, &lt;i&gt;Efd&lt;/i&gt;&lt;i&gt;&lt;sub&gt;1&lt;/sub&gt;&lt;/i&gt; (&lt;i&gt;Se[Efd&lt;/i&gt;&lt;i&gt;&lt;sub&gt;1&lt;/sub&gt;&lt;/i&gt;&lt;i&gt;]&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,1.
     */
    private Float seefd1; // Float

    public Float getSeefd1() {
        return seefd1;
    }

    public void setSeefd1(Float _value_) {
        seefd1 = _value_;
    }

    public void setSeefd1(String _value_) {
        seefd1 = getFloatFromString(_value_);
    }

    public String seefd1ToString() {
        return seefd1 != null ? seefd1.toString() : null;
    }

    private static void setSeefd1(BaseClass _this_, String _value_) {
        ((ExcDC3A) _this_).setSeefd1(_value_);
    }

    private static String seefd1ToString(BaseClass _this_) {
        return ((ExcDC3A) _this_).seefd1ToString();
    }

    /**
     * Exciter saturation function value at the corresponding exciter voltage, &lt;i&gt;Efd&lt;/i&gt;&lt;i&gt;&lt;sub&gt;2&lt;/sub&gt;&lt;/i&gt; (&lt;i&gt;Se[Efd&lt;/i&gt;&lt;i&gt;&lt;sub&gt;2&lt;/sub&gt;&lt;/i&gt;&lt;i&gt;]&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,35.
     */
    private Float seefd2; // Float

    public Float getSeefd2() {
        return seefd2;
    }

    public void setSeefd2(Float _value_) {
        seefd2 = _value_;
    }

    public void setSeefd2(String _value_) {
        seefd2 = getFloatFromString(_value_);
    }

    public String seefd2ToString() {
        return seefd2 != null ? seefd2.toString() : null;
    }

    private static void setSeefd2(BaseClass _this_, String _value_) {
        ((ExcDC3A) _this_).setSeefd2(_value_);
    }

    private static String seefd2ToString(BaseClass _this_) {
        return ((ExcDC3A) _this_).seefd2ToString();
    }

    /**
     * Exciter time constant, integration rate associated with exciter control (&lt;i&gt;Te&lt;/i&gt;) (&amp;gt; 0).  Typical value = 1,83.
     */
    private Double te; // Seconds

    public Double getTe() {
        return te;
    }

    public void setTe(Double _value_) {
        te = _value_;
    }

    public void setTe(String _value_) {
        te = getDoubleFromString(_value_);
    }

    public String teToString() {
        return te != null ? te.toString() : null;
    }

    private static void setTe(BaseClass _this_, String _value_) {
        ((ExcDC3A) _this_).setTe(_value_);
    }

    private static String teToString(BaseClass _this_) {
        return ((ExcDC3A) _this_).teToString();
    }

    /**
     * Rheostat travel time (&lt;i&gt;Trh&lt;/i&gt;) (&amp;gt; 0).  Typical value = 20.
     */
    private Double trh; // Seconds

    public Double getTrh() {
        return trh;
    }

    public void setTrh(Double _value_) {
        trh = _value_;
    }

    public void setTrh(String _value_) {
        trh = getDoubleFromString(_value_);
    }

    public String trhToString() {
        return trh != null ? trh.toString() : null;
    }

    private static void setTrh(BaseClass _this_, String _value_) {
        ((ExcDC3A) _this_).setTrh(_value_);
    }

    private static String trhToString(BaseClass _this_) {
        return ((ExcDC3A) _this_).trhToString();
    }

    /**
     * Maximum voltage regulator output (&lt;i&gt;Vrmax&lt;/i&gt;) (&amp;gt; 0).  Typical value = 5.
     */
    private Double vrmax; // PU

    public Double getVrmax() {
        return vrmax;
    }

    public void setVrmax(Double _value_) {
        vrmax = _value_;
    }

    public void setVrmax(String _value_) {
        vrmax = getDoubleFromString(_value_);
    }

    public String vrmaxToString() {
        return vrmax != null ? vrmax.toString() : null;
    }

    private static void setVrmax(BaseClass _this_, String _value_) {
        ((ExcDC3A) _this_).setVrmax(_value_);
    }

    private static String vrmaxToString(BaseClass _this_) {
        return ((ExcDC3A) _this_).vrmaxToString();
    }

    /**
     * Minimum voltage regulator output (&lt;i&gt;Vrmin&lt;/i&gt;) (&amp;lt;= 0).  Typical value = 0.
     */
    private Double vrmin; // PU

    public Double getVrmin() {
        return vrmin;
    }

    public void setVrmin(Double _value_) {
        vrmin = _value_;
    }

    public void setVrmin(String _value_) {
        vrmin = getDoubleFromString(_value_);
    }

    public String vrminToString() {
        return vrmin != null ? vrmin.toString() : null;
    }

    private static void setVrmin(BaseClass _this_, String _value_) {
        ((ExcDC3A) _this_).setVrmin(_value_);
    }

    private static String vrminToString(BaseClass _this_) {
        return ((ExcDC3A) _this_).vrminToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ExcDC3A", attrName));
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
                "ExcDC3A", attrName, objectValue));
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
                "ExcDC3A", attrName, stringValue));
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
            map.put("efd1", new AttrDetails("ExcDC3A.efd1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcDC3A::efd1ToString, null, ExcDC3A::setEfd1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("efd2", new AttrDetails("ExcDC3A.efd2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcDC3A::efd2ToString, null, ExcDC3A::setEfd2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("efdlim", new AttrDetails("ExcDC3A.efdlim", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcDC3A::efdlimToString, null, ExcDC3A::setEfdlim));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("efdmax", new AttrDetails("ExcDC3A.efdmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcDC3A::efdmaxToString, null, ExcDC3A::setEfdmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("efdmin", new AttrDetails("ExcDC3A.efdmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcDC3A::efdminToString, null, ExcDC3A::setEfdmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("exclim", new AttrDetails("ExcDC3A.exclim", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcDC3A::exclimToString, null, ExcDC3A::setExclim));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ke", new AttrDetails("ExcDC3A.ke", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcDC3A::keToString, null, ExcDC3A::setKe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kr", new AttrDetails("ExcDC3A.kr", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcDC3A::krToString, null, ExcDC3A::setKr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ks", new AttrDetails("ExcDC3A.ks", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcDC3A::ksToString, null, ExcDC3A::setKs));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kv", new AttrDetails("ExcDC3A.kv", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcDC3A::kvToString, null, ExcDC3A::setKv));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("seefd1", new AttrDetails("ExcDC3A.seefd1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcDC3A::seefd1ToString, null, ExcDC3A::setSeefd1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("seefd2", new AttrDetails("ExcDC3A.seefd2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcDC3A::seefd2ToString, null, ExcDC3A::setSeefd2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("te", new AttrDetails("ExcDC3A.te", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcDC3A::teToString, null, ExcDC3A::setTe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("trh", new AttrDetails("ExcDC3A.trh", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcDC3A::trhToString, null, ExcDC3A::setTrh));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmax", new AttrDetails("ExcDC3A.vrmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcDC3A::vrmaxToString, null, ExcDC3A::setVrmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmin", new AttrDetails("ExcDC3A.vrmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcDC3A::vrminToString, null, ExcDC3A::setVrmin));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcDC3A().allAttrDetailsMap());
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
