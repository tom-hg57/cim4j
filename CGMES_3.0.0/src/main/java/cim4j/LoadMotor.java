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
 * Aggregate induction motor load. This model is used to represent a fraction of an ordinary load as "induction motor load".  It allows a load that is treated as an ordinary constant power in power flow analysis to be represented by an induction motor in dynamic simulation. This model is intended for representation of aggregations of many motors dispersed through a load represented at a high voltage bus but where there is no information on the characteristics of individual motors. Either a "one-cage" or "two-cage" model of the induction machine can be modelled. Magnetic saturation is not modelled. This model treats a fraction of the constant power part of a load as a motor. During initialisation, the initial power drawn by the motor is set equal to <i>Pfrac</i> times the constant <i>P</i> part of the static load.  The remainder of the load is left as a static load. The reactive power demand of the motor is calculated during initialisation as a function of voltage at the load bus. This reactive power demand can be less than or greater than the constant <i>Q</i> component of the load.  If the motor's reactive demand is greater than the constant <i>Q</i> component of the load, the model inserts a shunt capacitor at the terminal of the motor to bring its reactive demand down to equal the constant <i>Q</i> reactive load.   If an induction motor load model and a static load model are both present for a load, the motor <i>Pfrac</i> is assumed to be subtracted from the power flow constant <i>P</i> load before the static load model is applied.  The remainder of the load, if any, is then represented by the static load model.
 */
@SuppressWarnings("unused")
public class LoadMotor extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(LoadMotor.class);

    /**
     * Default constructor.
     */
    public LoadMotor() {
        setCimType("LoadMotor");
    }

    /**
     * Aggregate load to which this aggregate motor (dynamic) load belongs.
     */
    private LoadAggregate LoadAggregate; // OneToOne

    public LoadAggregate getLoadAggregate() {
        return LoadAggregate;
    }

    public void setLoadAggregate(BaseClass _object_) {
        if (!(_object_ instanceof LoadAggregate)) {
            throw new IllegalArgumentException("Object is not LoadAggregate");
        }
        if (LoadAggregate != _object_) {
            LoadAggregate = (LoadAggregate) _object_;
            LoadAggregate.setLoadMotor(this);
        }
    }

    public String LoadAggregateToString() {
        return LoadAggregate != null ? LoadAggregate.getRdfid() : null;
    }

    private static void setLoadAggregate(BaseClass _this_, BaseClass _object_) {
        ((LoadMotor) _this_).setLoadAggregate(_object_);
    }

    private static String LoadAggregateToString(BaseClass _this_) {
        return ((LoadMotor) _this_).LoadAggregateToString();
    }

    /**
     * Damping factor (&lt;i&gt;D&lt;/i&gt;).  Unit = delta &lt;i&gt;P&lt;/i&gt;/delta speed.  Typical value = 2.
     */
    private Float d; // Float

    public Float getD() {
        return d;
    }

    public void setD(Float _value_) {
        d = _value_;
    }

    public void setD(String _value_) {
        d = getFloatFromString(_value_);
    }

    public String dToString() {
        return d != null ? d.toString() : null;
    }

    private static void setD(BaseClass _this_, String _value_) {
        ((LoadMotor) _this_).setD(_value_);
    }

    private static String dToString(BaseClass _this_) {
        return ((LoadMotor) _this_).dToString();
    }

    /**
     * Inertia constant (&lt;i&gt;H&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,4.
     */
    private Double h; // Seconds

    public Double getH() {
        return h;
    }

    public void setH(Double _value_) {
        h = _value_;
    }

    public void setH(String _value_) {
        h = getDoubleFromString(_value_);
    }

    public String hToString() {
        return h != null ? h.toString() : null;
    }

    private static void setH(BaseClass _this_, String _value_) {
        ((LoadMotor) _this_).setH(_value_);
    }

    private static String hToString(BaseClass _this_) {
        return ((LoadMotor) _this_).hToString();
    }

    /**
     * Loading factor (&lt;i&gt;Lfac&lt;/i&gt;). The ratio of initial &lt;i&gt;P&lt;/i&gt; to motor MVA base.  Typical value = 0,8.
     */
    private Float lfac; // Float

    public Float getLfac() {
        return lfac;
    }

    public void setLfac(Float _value_) {
        lfac = _value_;
    }

    public void setLfac(String _value_) {
        lfac = getFloatFromString(_value_);
    }

    public String lfacToString() {
        return lfac != null ? lfac.toString() : null;
    }

    private static void setLfac(BaseClass _this_, String _value_) {
        ((LoadMotor) _this_).setLfac(_value_);
    }

    private static String lfacToString(BaseClass _this_) {
        return ((LoadMotor) _this_).lfacToString();
    }

    /**
     * Transient reactance (&lt;i&gt;Lp&lt;/i&gt;).  Typical value = 0,15.
     */
    private Double lp; // PU

    public Double getLp() {
        return lp;
    }

    public void setLp(Double _value_) {
        lp = _value_;
    }

    public void setLp(String _value_) {
        lp = getDoubleFromString(_value_);
    }

    public String lpToString() {
        return lp != null ? lp.toString() : null;
    }

    private static void setLp(BaseClass _this_, String _value_) {
        ((LoadMotor) _this_).setLp(_value_);
    }

    private static String lpToString(BaseClass _this_) {
        return ((LoadMotor) _this_).lpToString();
    }

    /**
     * Subtransient reactance (&lt;i&gt;Lpp&lt;/i&gt;).  Typical value = 0,15.
     */
    private Double lpp; // PU

    public Double getLpp() {
        return lpp;
    }

    public void setLpp(Double _value_) {
        lpp = _value_;
    }

    public void setLpp(String _value_) {
        lpp = getDoubleFromString(_value_);
    }

    public String lppToString() {
        return lpp != null ? lpp.toString() : null;
    }

    private static void setLpp(BaseClass _this_, String _value_) {
        ((LoadMotor) _this_).setLpp(_value_);
    }

    private static String lppToString(BaseClass _this_) {
        return ((LoadMotor) _this_).lppToString();
    }

    /**
     * Synchronous reactance (&lt;i&gt;Ls&lt;/i&gt;).  Typical value = 3,2.
     */
    private Double ls; // PU

    public Double getLs() {
        return ls;
    }

    public void setLs(Double _value_) {
        ls = _value_;
    }

    public void setLs(String _value_) {
        ls = getDoubleFromString(_value_);
    }

    public String lsToString() {
        return ls != null ? ls.toString() : null;
    }

    private static void setLs(BaseClass _this_, String _value_) {
        ((LoadMotor) _this_).setLs(_value_);
    }

    private static String lsToString(BaseClass _this_) {
        return ((LoadMotor) _this_).lsToString();
    }

    /**
     * Fraction of constant-power load to be represented by this motor model (&lt;i&gt;Pfrac&lt;/i&gt;) (&amp;gt;= 0,0 and &amp;lt;= 1,0).  Typical value = 0,3.
     */
    private Float pfrac; // Float

    public Float getPfrac() {
        return pfrac;
    }

    public void setPfrac(Float _value_) {
        pfrac = _value_;
    }

    public void setPfrac(String _value_) {
        pfrac = getFloatFromString(_value_);
    }

    public String pfracToString() {
        return pfrac != null ? pfrac.toString() : null;
    }

    private static void setPfrac(BaseClass _this_, String _value_) {
        ((LoadMotor) _this_).setPfrac(_value_);
    }

    private static String pfracToString(BaseClass _this_) {
        return ((LoadMotor) _this_).pfracToString();
    }

    /**
     * Stator resistance (&lt;i&gt;Ra&lt;/i&gt;).  Typical value = 0.
     */
    private Double ra; // PU

    public Double getRa() {
        return ra;
    }

    public void setRa(Double _value_) {
        ra = _value_;
    }

    public void setRa(String _value_) {
        ra = getDoubleFromString(_value_);
    }

    public String raToString() {
        return ra != null ? ra.toString() : null;
    }

    private static void setRa(BaseClass _this_, String _value_) {
        ((LoadMotor) _this_).setRa(_value_);
    }

    private static String raToString(BaseClass _this_) {
        return ((LoadMotor) _this_).raToString();
    }

    /**
     * Circuit breaker operating time (&lt;i&gt;Tbkr&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,08.
     */
    private Double tbkr; // Seconds

    public Double getTbkr() {
        return tbkr;
    }

    public void setTbkr(Double _value_) {
        tbkr = _value_;
    }

    public void setTbkr(String _value_) {
        tbkr = getDoubleFromString(_value_);
    }

    public String tbkrToString() {
        return tbkr != null ? tbkr.toString() : null;
    }

    private static void setTbkr(BaseClass _this_, String _value_) {
        ((LoadMotor) _this_).setTbkr(_value_);
    }

    private static String tbkrToString(BaseClass _this_) {
        return ((LoadMotor) _this_).tbkrToString();
    }

    /**
     * Transient rotor time constant (&lt;i&gt;Tpo&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 1.
     */
    private Double tpo; // Seconds

    public Double getTpo() {
        return tpo;
    }

    public void setTpo(Double _value_) {
        tpo = _value_;
    }

    public void setTpo(String _value_) {
        tpo = getDoubleFromString(_value_);
    }

    public String tpoToString() {
        return tpo != null ? tpo.toString() : null;
    }

    private static void setTpo(BaseClass _this_, String _value_) {
        ((LoadMotor) _this_).setTpo(_value_);
    }

    private static String tpoToString(BaseClass _this_) {
        return ((LoadMotor) _this_).tpoToString();
    }

    /**
     * Subtransient rotor time constant (&lt;i&gt;Tppo&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,02.
     */
    private Double tppo; // Seconds

    public Double getTppo() {
        return tppo;
    }

    public void setTppo(Double _value_) {
        tppo = _value_;
    }

    public void setTppo(String _value_) {
        tppo = getDoubleFromString(_value_);
    }

    public String tppoToString() {
        return tppo != null ? tppo.toString() : null;
    }

    private static void setTppo(BaseClass _this_, String _value_) {
        ((LoadMotor) _this_).setTppo(_value_);
    }

    private static String tppoToString(BaseClass _this_) {
        return ((LoadMotor) _this_).tppoToString();
    }

    /**
     * Voltage trip pickup time (&lt;i&gt;Tv&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,1.
     */
    private Double tv; // Seconds

    public Double getTv() {
        return tv;
    }

    public void setTv(Double _value_) {
        tv = _value_;
    }

    public void setTv(String _value_) {
        tv = getDoubleFromString(_value_);
    }

    public String tvToString() {
        return tv != null ? tv.toString() : null;
    }

    private static void setTv(BaseClass _this_, String _value_) {
        ((LoadMotor) _this_).setTv(_value_);
    }

    private static String tvToString(BaseClass _this_) {
        return ((LoadMotor) _this_).tvToString();
    }

    /**
     * Voltage threshold for tripping (&lt;i&gt;Vt&lt;/i&gt;).  Typical value = 0,7.
     */
    private Double vt; // PU

    public Double getVt() {
        return vt;
    }

    public void setVt(Double _value_) {
        vt = _value_;
    }

    public void setVt(String _value_) {
        vt = getDoubleFromString(_value_);
    }

    public String vtToString() {
        return vt != null ? vt.toString() : null;
    }

    private static void setVt(BaseClass _this_, String _value_) {
        ((LoadMotor) _this_).setVt(_value_);
    }

    private static String vtToString(BaseClass _this_) {
        return ((LoadMotor) _this_).vtToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "LoadMotor", attrName));
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
                "LoadMotor", attrName, objectValue));
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
                "LoadMotor", attrName, stringValue));
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
            map.put("LoadAggregate", new AttrDetails("LoadMotor.LoadAggregate", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, LoadMotor::LoadAggregateToString, LoadMotor::setLoadAggregate, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("d", new AttrDetails("LoadMotor.d", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, LoadMotor::dToString, null, LoadMotor::setD));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("h", new AttrDetails("LoadMotor.h", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, LoadMotor::hToString, null, LoadMotor::setH));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("lfac", new AttrDetails("LoadMotor.lfac", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, LoadMotor::lfacToString, null, LoadMotor::setLfac));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("lp", new AttrDetails("LoadMotor.lp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, LoadMotor::lpToString, null, LoadMotor::setLp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("lpp", new AttrDetails("LoadMotor.lpp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, LoadMotor::lppToString, null, LoadMotor::setLpp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ls", new AttrDetails("LoadMotor.ls", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, LoadMotor::lsToString, null, LoadMotor::setLs));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pfrac", new AttrDetails("LoadMotor.pfrac", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, LoadMotor::pfracToString, null, LoadMotor::setPfrac));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ra", new AttrDetails("LoadMotor.ra", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, LoadMotor::raToString, null, LoadMotor::setRa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tbkr", new AttrDetails("LoadMotor.tbkr", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, LoadMotor::tbkrToString, null, LoadMotor::setTbkr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tpo", new AttrDetails("LoadMotor.tpo", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, LoadMotor::tpoToString, null, LoadMotor::setTpo));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tppo", new AttrDetails("LoadMotor.tppo", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, LoadMotor::tppoToString, null, LoadMotor::setTppo));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tv", new AttrDetails("LoadMotor.tv", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, LoadMotor::tvToString, null, LoadMotor::setTv));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vt", new AttrDetails("LoadMotor.vt", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, LoadMotor::vtToString, null, LoadMotor::setVt));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new LoadMotor().allAttrDetailsMap());
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
