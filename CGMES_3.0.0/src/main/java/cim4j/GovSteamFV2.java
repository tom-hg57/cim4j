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
 * Steam turbine governor with reheat time constants and modelling of the effects of fast valve closing to reduce mechanical power.
 */
@SuppressWarnings("unused")
public class GovSteamFV2 extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovSteamFV2.class);

    /**
     * Constructor.
     */
    public GovSteamFV2(String rdfid) {
        super("GovSteamFV2", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected GovSteamFV2(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * (&lt;i&gt;Dt&lt;/i&gt;).
     */
    private Double dt; // PU

    public Double getDt() {
        return dt;
    }

    public void setDt(Double _value_) {
        dt = _value_;
    }

    public void setDt(String _value_) {
        dt = getDoubleFromString(_value_);
    }

    public String dtToString() {
        return dt != null ? dt.toString() : null;
    }

    private static void setDt(BaseClass _this_, String _value_) {
        ((GovSteamFV2) _this_).setDt(_value_);
    }

    private static String dtToString(BaseClass _this_) {
        return ((GovSteamFV2) _this_).dtToString();
    }

    /**
     * Fraction of the turbine power developed by turbine sections not involved in fast valving (&lt;i&gt;K&lt;/i&gt;).
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
        ((GovSteamFV2) _this_).setK(_value_);
    }

    private static String kToString(BaseClass _this_) {
        return ((GovSteamFV2) _this_).kToString();
    }

    /**
     * Alternate base used instead of machine base in equipment model if necessary (&lt;i&gt;MWbase&lt;/i&gt;) (&amp;gt; 0).  Unit = MW.
     */
    private Double mwbase; // ActivePower

    public Double getMwbase() {
        return mwbase;
    }

    public void setMwbase(Double _value_) {
        mwbase = _value_;
    }

    public void setMwbase(String _value_) {
        mwbase = getDoubleFromString(_value_);
    }

    public String mwbaseToString() {
        return mwbase != null ? mwbase.toString() : null;
    }

    private static void setMwbase(BaseClass _this_, String _value_) {
        ((GovSteamFV2) _this_).setMwbase(_value_);
    }

    private static String mwbaseToString(BaseClass _this_) {
        return ((GovSteamFV2) _this_).mwbaseToString();
    }

    /**
     * (&lt;i&gt;R&lt;/i&gt;).
     */
    private Double r; // PU

    public Double getR() {
        return r;
    }

    public void setR(Double _value_) {
        r = _value_;
    }

    public void setR(String _value_) {
        r = getDoubleFromString(_value_);
    }

    public String rToString() {
        return r != null ? r.toString() : null;
    }

    private static void setR(BaseClass _this_, String _value_) {
        ((GovSteamFV2) _this_).setR(_value_);
    }

    private static String rToString(BaseClass _this_) {
        return ((GovSteamFV2) _this_).rToString();
    }

    /**
     * Governor time constant (&lt;i&gt;T1&lt;/i&gt;) (&amp;gt;= 0).
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
        ((GovSteamFV2) _this_).setT1(_value_);
    }

    private static String t1ToString(BaseClass _this_) {
        return ((GovSteamFV2) _this_).t1ToString();
    }

    /**
     * Reheater time constant (&lt;i&gt;T3&lt;/i&gt;) (&amp;gt;= 0).
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
        ((GovSteamFV2) _this_).setT3(_value_);
    }

    private static String t3ToString(BaseClass _this_) {
        return ((GovSteamFV2) _this_).t3ToString();
    }

    /**
     * Time after initial time for valve to close (&lt;i&gt;Ta&lt;/i&gt;) (&amp;gt;= 0).
     */
    private Double ta; // Seconds

    public Double getTa() {
        return ta;
    }

    public void setTa(Double _value_) {
        ta = _value_;
    }

    public void setTa(String _value_) {
        ta = getDoubleFromString(_value_);
    }

    public String taToString() {
        return ta != null ? ta.toString() : null;
    }

    private static void setTa(BaseClass _this_, String _value_) {
        ((GovSteamFV2) _this_).setTa(_value_);
    }

    private static String taToString(BaseClass _this_) {
        return ((GovSteamFV2) _this_).taToString();
    }

    /**
     * Time after initial time for valve to begin opening (&lt;i&gt;Tb&lt;/i&gt;) (&amp;gt;= 0).
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
        ((GovSteamFV2) _this_).setTb(_value_);
    }

    private static String tbToString(BaseClass _this_) {
        return ((GovSteamFV2) _this_).tbToString();
    }

    /**
     * Time after initial time for valve to become fully open (&lt;i&gt;Tc&lt;/i&gt;) (&amp;gt;= 0).
     */
    private Double tc; // Seconds

    public Double getTc() {
        return tc;
    }

    public void setTc(Double _value_) {
        tc = _value_;
    }

    public void setTc(String _value_) {
        tc = getDoubleFromString(_value_);
    }

    public String tcToString() {
        return tc != null ? tc.toString() : null;
    }

    private static void setTc(BaseClass _this_, String _value_) {
        ((GovSteamFV2) _this_).setTc(_value_);
    }

    private static String tcToString(BaseClass _this_) {
        return ((GovSteamFV2) _this_).tcToString();
    }

    /**
     * Time constant with which power falls off after intercept valve closure (&lt;i&gt;Tt&lt;/i&gt;) (&amp;gt;= 0).
     */
    private Double tt; // Seconds

    public Double getTt() {
        return tt;
    }

    public void setTt(Double _value_) {
        tt = _value_;
    }

    public void setTt(String _value_) {
        tt = getDoubleFromString(_value_);
    }

    public String ttToString() {
        return tt != null ? tt.toString() : null;
    }

    private static void setTt(BaseClass _this_, String _value_) {
        ((GovSteamFV2) _this_).setTt(_value_);
    }

    private static String ttToString(BaseClass _this_) {
        return ((GovSteamFV2) _this_).ttToString();
    }

    /**
     * (&lt;i&gt;Vmax&lt;/i&gt;) (&amp;gt; GovSteamFV2.vmin).
     */
    private Double vmax; // PU

    public Double getVmax() {
        return vmax;
    }

    public void setVmax(Double _value_) {
        vmax = _value_;
    }

    public void setVmax(String _value_) {
        vmax = getDoubleFromString(_value_);
    }

    public String vmaxToString() {
        return vmax != null ? vmax.toString() : null;
    }

    private static void setVmax(BaseClass _this_, String _value_) {
        ((GovSteamFV2) _this_).setVmax(_value_);
    }

    private static String vmaxToString(BaseClass _this_) {
        return ((GovSteamFV2) _this_).vmaxToString();
    }

    /**
     * (&lt;i&gt;Vmin&lt;/i&gt;) (&amp;lt; GovSteamFV2.vmax).
     */
    private Double vmin; // PU

    public Double getVmin() {
        return vmin;
    }

    public void setVmin(Double _value_) {
        vmin = _value_;
    }

    public void setVmin(String _value_) {
        vmin = getDoubleFromString(_value_);
    }

    public String vminToString() {
        return vmin != null ? vmin.toString() : null;
    }

    private static void setVmin(BaseClass _this_, String _value_) {
        ((GovSteamFV2) _this_).setVmin(_value_);
    }

    private static String vminToString(BaseClass _this_) {
        return ((GovSteamFV2) _this_).vminToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "GovSteamFV2", attrName));
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
                "GovSteamFV2", attrName, objectValue));
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
                "GovSteamFV2", attrName, stringValue));
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
            map.put("dt", new AttrDetails("GovSteamFV2.dt", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV2::dtToString, null, GovSteamFV2::setDt));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k", new AttrDetails("GovSteamFV2.k", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV2::kToString, null, GovSteamFV2::setK));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mwbase", new AttrDetails("GovSteamFV2.mwbase", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV2::mwbaseToString, null, GovSteamFV2::setMwbase));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("r", new AttrDetails("GovSteamFV2.r", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV2::rToString, null, GovSteamFV2::setR));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t1", new AttrDetails("GovSteamFV2.t1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV2::t1ToString, null, GovSteamFV2::setT1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t3", new AttrDetails("GovSteamFV2.t3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV2::t3ToString, null, GovSteamFV2::setT3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ta", new AttrDetails("GovSteamFV2.ta", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV2::taToString, null, GovSteamFV2::setTa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tb", new AttrDetails("GovSteamFV2.tb", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV2::tbToString, null, GovSteamFV2::setTb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tc", new AttrDetails("GovSteamFV2.tc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV2::tcToString, null, GovSteamFV2::setTc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tt", new AttrDetails("GovSteamFV2.tt", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV2::ttToString, null, GovSteamFV2::setTt));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vmax", new AttrDetails("GovSteamFV2.vmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV2::vmaxToString, null, GovSteamFV2::setVmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vmin", new AttrDetails("GovSteamFV2.vmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV2::vminToString, null, GovSteamFV2::setVmin));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new GovSteamFV2(null).allAttrDetailsMap());
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
