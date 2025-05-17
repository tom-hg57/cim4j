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
 * Hydro turbine and governor. Represents plants with straightforward penstock configurations and "three term" electro-hydraulic governors (i.e. Woodward<sup>TM</sup> electronic). [Footnote: Woodward electronic governors are an example of suitable products available commercially. This information is given for the convenience of users of this document and does not constitute an endorsement by IEC of these products.]
 */
@SuppressWarnings("unused")
public class GovHydroPID2 extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovHydroPID2.class);

    /**
     * Default constructor.
     */
    public GovHydroPID2() {
        setCimType("GovHydroPID2");
    }

    /**
     * Factor multiplying &lt;i&gt;Tw&lt;/i&gt; (&lt;i&gt;Atw&lt;/i&gt;).  Typical value = 0.
     */
    private Double atw; // PU

    public Double getAtw() {
        return atw;
    }

    public void setAtw(Double _value_) {
        atw = _value_;
    }

    public void setAtw(String _value_) {
        atw = getDoubleFromString(_value_);
    }

    public String atwToString() {
        return atw != null ? atw.toString() : null;
    }

    private static void setAtw(BaseClass _this_, String _value_) {
        ((GovHydroPID2) _this_).setAtw(_value_);
    }

    private static String atwToString(BaseClass _this_) {
        return ((GovHydroPID2) _this_).atwToString();
    }

    /**
     * Turbine damping factor (&lt;i&gt;D&lt;/i&gt;).  Unit = delta P / delta speed.  Typical value = 0.
     */
    private Double d; // PU

    public Double getD() {
        return d;
    }

    public void setD(Double _value_) {
        d = _value_;
    }

    public void setD(String _value_) {
        d = getDoubleFromString(_value_);
    }

    public String dToString() {
        return d != null ? d.toString() : null;
    }

    private static void setD(BaseClass _this_, String _value_) {
        ((GovHydroPID2) _this_).setD(_value_);
    }

    private static String dToString(BaseClass _this_) {
        return ((GovHydroPID2) _this_).dToString();
    }

    /**
     * Feedback signal type flag (&lt;i&gt;Flag&lt;/i&gt;). true = use gate position feedback signal false = use Pe.
     */
    private Boolean feedbackSignal; // Boolean

    public Boolean getFeedbackSignal() {
        return feedbackSignal;
    }

    public void setFeedbackSignal(Boolean _value_) {
        feedbackSignal = _value_;
    }

    public void setFeedbackSignal(String _value_) {
        feedbackSignal = getBooleanFromString(_value_);
    }

    public String feedbackSignalToString() {
        return feedbackSignal != null ? feedbackSignal.toString() : null;
    }

    private static void setFeedbackSignal(BaseClass _this_, String _value_) {
        ((GovHydroPID2) _this_).setFeedbackSignal(_value_);
    }

    private static String feedbackSignalToString(BaseClass _this_) {
        return ((GovHydroPID2) _this_).feedbackSignalToString();
    }

    /**
     * Gate opening at speed no load (&lt;i&gt;G0&lt;/i&gt;).  Typical value = 0.
     */
    private Double g0; // PU

    public Double getG0() {
        return g0;
    }

    public void setG0(Double _value_) {
        g0 = _value_;
    }

    public void setG0(String _value_) {
        g0 = getDoubleFromString(_value_);
    }

    public String g0ToString() {
        return g0 != null ? g0.toString() : null;
    }

    private static void setG0(BaseClass _this_, String _value_) {
        ((GovHydroPID2) _this_).setG0(_value_);
    }

    private static String g0ToString(BaseClass _this_) {
        return ((GovHydroPID2) _this_).g0ToString();
    }

    /**
     * Intermediate gate opening (&lt;i&gt;G1&lt;/i&gt;).  Typical value = 0.
     */
    private Double g1; // PU

    public Double getG1() {
        return g1;
    }

    public void setG1(Double _value_) {
        g1 = _value_;
    }

    public void setG1(String _value_) {
        g1 = getDoubleFromString(_value_);
    }

    public String g1ToString() {
        return g1 != null ? g1.toString() : null;
    }

    private static void setG1(BaseClass _this_, String _value_) {
        ((GovHydroPID2) _this_).setG1(_value_);
    }

    private static String g1ToString(BaseClass _this_) {
        return ((GovHydroPID2) _this_).g1ToString();
    }

    /**
     * Intermediate gate opening (&lt;i&gt;G2&lt;/i&gt;).  Typical value = 0.
     */
    private Double g2; // PU

    public Double getG2() {
        return g2;
    }

    public void setG2(Double _value_) {
        g2 = _value_;
    }

    public void setG2(String _value_) {
        g2 = getDoubleFromString(_value_);
    }

    public String g2ToString() {
        return g2 != null ? g2.toString() : null;
    }

    private static void setG2(BaseClass _this_, String _value_) {
        ((GovHydroPID2) _this_).setG2(_value_);
    }

    private static String g2ToString(BaseClass _this_) {
        return ((GovHydroPID2) _this_).g2ToString();
    }

    /**
     * Maximum gate opening (&lt;i&gt;Gmax&lt;/i&gt;) (&amp;gt; GovHydroPID2.gmin).  Typical value = 0.
     */
    private Double gmax; // PU

    public Double getGmax() {
        return gmax;
    }

    public void setGmax(Double _value_) {
        gmax = _value_;
    }

    public void setGmax(String _value_) {
        gmax = getDoubleFromString(_value_);
    }

    public String gmaxToString() {
        return gmax != null ? gmax.toString() : null;
    }

    private static void setGmax(BaseClass _this_, String _value_) {
        ((GovHydroPID2) _this_).setGmax(_value_);
    }

    private static String gmaxToString(BaseClass _this_) {
        return ((GovHydroPID2) _this_).gmaxToString();
    }

    /**
     * Minimum gate opening (&lt;i&gt;Gmin&lt;/i&gt;) (&amp;gt; GovHydroPID2.gmax).  Typical value = 0.
     */
    private Double gmin; // PU

    public Double getGmin() {
        return gmin;
    }

    public void setGmin(Double _value_) {
        gmin = _value_;
    }

    public void setGmin(String _value_) {
        gmin = getDoubleFromString(_value_);
    }

    public String gminToString() {
        return gmin != null ? gmin.toString() : null;
    }

    private static void setGmin(BaseClass _this_, String _value_) {
        ((GovHydroPID2) _this_).setGmin(_value_);
    }

    private static String gminToString(BaseClass _this_) {
        return ((GovHydroPID2) _this_).gminToString();
    }

    /**
     * Derivative gain (&lt;i&gt;Kd&lt;/i&gt;).  Typical value = 0.
     */
    private Double kd; // PU

    public Double getKd() {
        return kd;
    }

    public void setKd(Double _value_) {
        kd = _value_;
    }

    public void setKd(String _value_) {
        kd = getDoubleFromString(_value_);
    }

    public String kdToString() {
        return kd != null ? kd.toString() : null;
    }

    private static void setKd(BaseClass _this_, String _value_) {
        ((GovHydroPID2) _this_).setKd(_value_);
    }

    private static String kdToString(BaseClass _this_) {
        return ((GovHydroPID2) _this_).kdToString();
    }

    /**
     * Reset gain (&lt;i&gt;Ki&lt;/i&gt;).  Unit = PU/s.  Typical value = 0.
     */
    private Float ki; // Float

    public Float getKi() {
        return ki;
    }

    public void setKi(Float _value_) {
        ki = _value_;
    }

    public void setKi(String _value_) {
        ki = getFloatFromString(_value_);
    }

    public String kiToString() {
        return ki != null ? ki.toString() : null;
    }

    private static void setKi(BaseClass _this_, String _value_) {
        ((GovHydroPID2) _this_).setKi(_value_);
    }

    private static String kiToString(BaseClass _this_) {
        return ((GovHydroPID2) _this_).kiToString();
    }

    /**
     * Proportional gain (&lt;i&gt;Kp&lt;/i&gt;).  Typical value = 0.
     */
    private Double kp; // PU

    public Double getKp() {
        return kp;
    }

    public void setKp(Double _value_) {
        kp = _value_;
    }

    public void setKp(String _value_) {
        kp = getDoubleFromString(_value_);
    }

    public String kpToString() {
        return kp != null ? kp.toString() : null;
    }

    private static void setKp(BaseClass _this_, String _value_) {
        ((GovHydroPID2) _this_).setKp(_value_);
    }

    private static String kpToString(BaseClass _this_) {
        return ((GovHydroPID2) _this_).kpToString();
    }

    /**
     * Base for power values (&lt;i&gt;MWbase&lt;/i&gt;) (&amp;gt;0).  Unit = MW.
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
        ((GovHydroPID2) _this_).setMwbase(_value_);
    }

    private static String mwbaseToString(BaseClass _this_) {
        return ((GovHydroPID2) _this_).mwbaseToString();
    }

    /**
     * Power at gate opening &lt;i&gt;G1&lt;/i&gt; (&lt;i&gt;P1&lt;/i&gt;).  Typical value = 0.
     */
    private Double p1; // PU

    public Double getP1() {
        return p1;
    }

    public void setP1(Double _value_) {
        p1 = _value_;
    }

    public void setP1(String _value_) {
        p1 = getDoubleFromString(_value_);
    }

    public String p1ToString() {
        return p1 != null ? p1.toString() : null;
    }

    private static void setP1(BaseClass _this_, String _value_) {
        ((GovHydroPID2) _this_).setP1(_value_);
    }

    private static String p1ToString(BaseClass _this_) {
        return ((GovHydroPID2) _this_).p1ToString();
    }

    /**
     * Power at gate opening G2 (&lt;i&gt;P2&lt;/i&gt;).  Typical value = 0.
     */
    private Double p2; // PU

    public Double getP2() {
        return p2;
    }

    public void setP2(Double _value_) {
        p2 = _value_;
    }

    public void setP2(String _value_) {
        p2 = getDoubleFromString(_value_);
    }

    public String p2ToString() {
        return p2 != null ? p2.toString() : null;
    }

    private static void setP2(BaseClass _this_, String _value_) {
        ((GovHydroPID2) _this_).setP2(_value_);
    }

    private static String p2ToString(BaseClass _this_) {
        return ((GovHydroPID2) _this_).p2ToString();
    }

    /**
     * Power at full opened gate (&lt;i&gt;P3&lt;/i&gt;).  Typical value = 0.
     */
    private Double p3; // PU

    public Double getP3() {
        return p3;
    }

    public void setP3(Double _value_) {
        p3 = _value_;
    }

    public void setP3(String _value_) {
        p3 = getDoubleFromString(_value_);
    }

    public String p3ToString() {
        return p3 != null ? p3.toString() : null;
    }

    private static void setP3(BaseClass _this_, String _value_) {
        ((GovHydroPID2) _this_).setP3(_value_);
    }

    private static String p3ToString(BaseClass _this_) {
        return ((GovHydroPID2) _this_).p3ToString();
    }

    /**
     * Permanent drop (&lt;i&gt;Rperm&lt;/i&gt;).  Typical value = 0.
     */
    private Double rperm; // PU

    public Double getRperm() {
        return rperm;
    }

    public void setRperm(Double _value_) {
        rperm = _value_;
    }

    public void setRperm(String _value_) {
        rperm = getDoubleFromString(_value_);
    }

    public String rpermToString() {
        return rperm != null ? rperm.toString() : null;
    }

    private static void setRperm(BaseClass _this_, String _value_) {
        ((GovHydroPID2) _this_).setRperm(_value_);
    }

    private static String rpermToString(BaseClass _this_) {
        return ((GovHydroPID2) _this_).rpermToString();
    }

    /**
     * Controller time constant (&lt;i&gt;Ta&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
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
        ((GovHydroPID2) _this_).setTa(_value_);
    }

    private static String taToString(BaseClass _this_) {
        return ((GovHydroPID2) _this_).taToString();
    }

    /**
     * Gate servo time constant (&lt;i&gt;Tb&lt;/i&gt;) (&amp;gt; 0).
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
        ((GovHydroPID2) _this_).setTb(_value_);
    }

    private static String tbToString(BaseClass _this_) {
        return ((GovHydroPID2) _this_).tbToString();
    }

    /**
     * Speed detector time constant (&lt;i&gt;Treg&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
     */
    private Double treg; // Seconds

    public Double getTreg() {
        return treg;
    }

    public void setTreg(Double _value_) {
        treg = _value_;
    }

    public void setTreg(String _value_) {
        treg = getDoubleFromString(_value_);
    }

    public String tregToString() {
        return treg != null ? treg.toString() : null;
    }

    private static void setTreg(BaseClass _this_, String _value_) {
        ((GovHydroPID2) _this_).setTreg(_value_);
    }

    private static String tregToString(BaseClass _this_) {
        return ((GovHydroPID2) _this_).tregToString();
    }

    /**
     * Water inertia time constant (&lt;i&gt;Tw&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
     */
    private Double tw; // Seconds

    public Double getTw() {
        return tw;
    }

    public void setTw(Double _value_) {
        tw = _value_;
    }

    public void setTw(String _value_) {
        tw = getDoubleFromString(_value_);
    }

    public String twToString() {
        return tw != null ? tw.toString() : null;
    }

    private static void setTw(BaseClass _this_, String _value_) {
        ((GovHydroPID2) _this_).setTw(_value_);
    }

    private static String twToString(BaseClass _this_) {
        return ((GovHydroPID2) _this_).twToString();
    }

    /**
     * Maximum gate opening velocity (&lt;i&gt;Velmax&lt;/i&gt;) (&amp;lt; GovHydroPID2.velmin).  Unit = PU / s.  Typical value = 0.
     */
    private Float velmax; // Float

    public Float getVelmax() {
        return velmax;
    }

    public void setVelmax(Float _value_) {
        velmax = _value_;
    }

    public void setVelmax(String _value_) {
        velmax = getFloatFromString(_value_);
    }

    public String velmaxToString() {
        return velmax != null ? velmax.toString() : null;
    }

    private static void setVelmax(BaseClass _this_, String _value_) {
        ((GovHydroPID2) _this_).setVelmax(_value_);
    }

    private static String velmaxToString(BaseClass _this_) {
        return ((GovHydroPID2) _this_).velmaxToString();
    }

    /**
     * Maximum gate closing velocity (&lt;i&gt;Velmin&lt;/i&gt;) (&amp;gt; GovHydroPID2.velmax).  Unit = PU / s.  Typical value = 0.
     */
    private Float velmin; // Float

    public Float getVelmin() {
        return velmin;
    }

    public void setVelmin(Float _value_) {
        velmin = _value_;
    }

    public void setVelmin(String _value_) {
        velmin = getFloatFromString(_value_);
    }

    public String velminToString() {
        return velmin != null ? velmin.toString() : null;
    }

    private static void setVelmin(BaseClass _this_, String _value_) {
        ((GovHydroPID2) _this_).setVelmin(_value_);
    }

    private static String velminToString(BaseClass _this_) {
        return ((GovHydroPID2) _this_).velminToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "GovHydroPID2", attrName));
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
                "GovHydroPID2", attrName, objectValue));
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
                "GovHydroPID2", attrName, stringValue));
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
            map.put("atw", new AttrDetails("GovHydroPID2.atw", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID2::atwToString, null, GovHydroPID2::setAtw));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("d", new AttrDetails("GovHydroPID2.d", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID2::dToString, null, GovHydroPID2::setD));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("feedbackSignal", new AttrDetails("GovHydroPID2.feedbackSignal", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID2::feedbackSignalToString, null, GovHydroPID2::setFeedbackSignal));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("g0", new AttrDetails("GovHydroPID2.g0", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID2::g0ToString, null, GovHydroPID2::setG0));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("g1", new AttrDetails("GovHydroPID2.g1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID2::g1ToString, null, GovHydroPID2::setG1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("g2", new AttrDetails("GovHydroPID2.g2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID2::g2ToString, null, GovHydroPID2::setG2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gmax", new AttrDetails("GovHydroPID2.gmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID2::gmaxToString, null, GovHydroPID2::setGmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gmin", new AttrDetails("GovHydroPID2.gmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID2::gminToString, null, GovHydroPID2::setGmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kd", new AttrDetails("GovHydroPID2.kd", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID2::kdToString, null, GovHydroPID2::setKd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ki", new AttrDetails("GovHydroPID2.ki", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID2::kiToString, null, GovHydroPID2::setKi));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kp", new AttrDetails("GovHydroPID2.kp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID2::kpToString, null, GovHydroPID2::setKp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mwbase", new AttrDetails("GovHydroPID2.mwbase", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID2::mwbaseToString, null, GovHydroPID2::setMwbase));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("p1", new AttrDetails("GovHydroPID2.p1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID2::p1ToString, null, GovHydroPID2::setP1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("p2", new AttrDetails("GovHydroPID2.p2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID2::p2ToString, null, GovHydroPID2::setP2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("p3", new AttrDetails("GovHydroPID2.p3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID2::p3ToString, null, GovHydroPID2::setP3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rperm", new AttrDetails("GovHydroPID2.rperm", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID2::rpermToString, null, GovHydroPID2::setRperm));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ta", new AttrDetails("GovHydroPID2.ta", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID2::taToString, null, GovHydroPID2::setTa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tb", new AttrDetails("GovHydroPID2.tb", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID2::tbToString, null, GovHydroPID2::setTb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("treg", new AttrDetails("GovHydroPID2.treg", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID2::tregToString, null, GovHydroPID2::setTreg));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tw", new AttrDetails("GovHydroPID2.tw", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID2::twToString, null, GovHydroPID2::setTw));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("velmax", new AttrDetails("GovHydroPID2.velmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID2::velmaxToString, null, GovHydroPID2::setVelmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("velmin", new AttrDetails("GovHydroPID2.velmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPID2::velminToString, null, GovHydroPID2::setVelmin));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new GovHydroPID2().allAttrDetailsMap());
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
