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
 * Static PI transformer fed excitation system: ELIN (VATECH) - simplified model.  This model represents an all-static excitation system. A PI voltage controller establishes a desired field current set point for a proportional current controller. The integrator of the PI controller has a follow-up input to match its signal to the present field current.  A power system stabilizer with power input is included in the model.
 */
@SuppressWarnings("unused")
public class ExcELIN1 extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcELIN1.class);

    /**
     * Constructor.
     */
    public ExcELIN1(String rdfid) {
        super("ExcELIN1", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected ExcELIN1(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Controller follow up dead band (Dpnf).  Typical Value = 0.
     */
    private Double dpnf; // PU

    public Double getDpnf() {
        return dpnf;
    }

    public void setDpnf(Double _value_) {
        dpnf = _value_;
    }

    public void setDpnf(String _value_) {
        dpnf = getDoubleFromString(_value_);
    }

    public String dpnfToString() {
        return dpnf != null ? dpnf.toString() : null;
    }

    private static void setDpnf(BaseClass _this_, String _value_) {
        ((ExcELIN1) _this_).setDpnf(_value_);
    }

    private static String dpnfToString(BaseClass _this_) {
        return ((ExcELIN1) _this_).dpnfToString();
    }

    /**
     * Maximum open circuit excitation voltage (Efmax).  Typical Value = 5.
     */
    private Double efmax; // PU

    public Double getEfmax() {
        return efmax;
    }

    public void setEfmax(Double _value_) {
        efmax = _value_;
    }

    public void setEfmax(String _value_) {
        efmax = getDoubleFromString(_value_);
    }

    public String efmaxToString() {
        return efmax != null ? efmax.toString() : null;
    }

    private static void setEfmax(BaseClass _this_, String _value_) {
        ((ExcELIN1) _this_).setEfmax(_value_);
    }

    private static String efmaxToString(BaseClass _this_) {
        return ((ExcELIN1) _this_).efmaxToString();
    }

    /**
     * Minimum open circuit excitation voltage (Efmin).  Typical Value = -5.
     */
    private Double efmin; // PU

    public Double getEfmin() {
        return efmin;
    }

    public void setEfmin(Double _value_) {
        efmin = _value_;
    }

    public void setEfmin(String _value_) {
        efmin = getDoubleFromString(_value_);
    }

    public String efminToString() {
        return efmin != null ? efmin.toString() : null;
    }

    private static void setEfmin(BaseClass _this_, String _value_) {
        ((ExcELIN1) _this_).setEfmin(_value_);
    }

    private static String efminToString(BaseClass _this_) {
        return ((ExcELIN1) _this_).efminToString();
    }

    /**
     * Stabilizer Gain 1 (Ks1).  Typical Value = 0.
     */
    private Double ks1; // PU

    public Double getKs1() {
        return ks1;
    }

    public void setKs1(Double _value_) {
        ks1 = _value_;
    }

    public void setKs1(String _value_) {
        ks1 = getDoubleFromString(_value_);
    }

    public String ks1ToString() {
        return ks1 != null ? ks1.toString() : null;
    }

    private static void setKs1(BaseClass _this_, String _value_) {
        ((ExcELIN1) _this_).setKs1(_value_);
    }

    private static String ks1ToString(BaseClass _this_) {
        return ((ExcELIN1) _this_).ks1ToString();
    }

    /**
     * Stabilizer Gain 2 (Ks2).  Typical Value = 0.
     */
    private Double ks2; // PU

    public Double getKs2() {
        return ks2;
    }

    public void setKs2(Double _value_) {
        ks2 = _value_;
    }

    public void setKs2(String _value_) {
        ks2 = getDoubleFromString(_value_);
    }

    public String ks2ToString() {
        return ks2 != null ? ks2.toString() : null;
    }

    private static void setKs2(BaseClass _this_, String _value_) {
        ((ExcELIN1) _this_).setKs2(_value_);
    }

    private static String ks2ToString(BaseClass _this_) {
        return ((ExcELIN1) _this_).ks2ToString();
    }

    /**
     * Stabilizer Limit Output (smax).  Typical Value = 0.1.
     */
    private Double smax; // PU

    public Double getSmax() {
        return smax;
    }

    public void setSmax(Double _value_) {
        smax = _value_;
    }

    public void setSmax(String _value_) {
        smax = getDoubleFromString(_value_);
    }

    public String smaxToString() {
        return smax != null ? smax.toString() : null;
    }

    private static void setSmax(BaseClass _this_, String _value_) {
        ((ExcELIN1) _this_).setSmax(_value_);
    }

    private static String smaxToString(BaseClass _this_) {
        return ((ExcELIN1) _this_).smaxToString();
    }

    /**
     * Current transducer time constant (Tfi).  Typical Value = 0.
     */
    private Double tfi; // Seconds

    public Double getTfi() {
        return tfi;
    }

    public void setTfi(Double _value_) {
        tfi = _value_;
    }

    public void setTfi(String _value_) {
        tfi = getDoubleFromString(_value_);
    }

    public String tfiToString() {
        return tfi != null ? tfi.toString() : null;
    }

    private static void setTfi(BaseClass _this_, String _value_) {
        ((ExcELIN1) _this_).setTfi(_value_);
    }

    private static String tfiToString(BaseClass _this_) {
        return ((ExcELIN1) _this_).tfiToString();
    }

    /**
     * Controller reset time constant (Tnu).  Typical Value = 2.
     */
    private Double tnu; // Seconds

    public Double getTnu() {
        return tnu;
    }

    public void setTnu(Double _value_) {
        tnu = _value_;
    }

    public void setTnu(String _value_) {
        tnu = getDoubleFromString(_value_);
    }

    public String tnuToString() {
        return tnu != null ? tnu.toString() : null;
    }

    private static void setTnu(BaseClass _this_, String _value_) {
        ((ExcELIN1) _this_).setTnu(_value_);
    }

    private static String tnuToString(BaseClass _this_) {
        return ((ExcELIN1) _this_).tnuToString();
    }

    /**
     * Stabilizer Phase Lag Time Constant (Ts1).  Typical Value = 1.
     */
    private Double ts1; // Seconds

    public Double getTs1() {
        return ts1;
    }

    public void setTs1(Double _value_) {
        ts1 = _value_;
    }

    public void setTs1(String _value_) {
        ts1 = getDoubleFromString(_value_);
    }

    public String ts1ToString() {
        return ts1 != null ? ts1.toString() : null;
    }

    private static void setTs1(BaseClass _this_, String _value_) {
        ((ExcELIN1) _this_).setTs1(_value_);
    }

    private static String ts1ToString(BaseClass _this_) {
        return ((ExcELIN1) _this_).ts1ToString();
    }

    /**
     * Stabilizer Filter Time Constant (Ts2).  Typical Value = 1.
     */
    private Double ts2; // Seconds

    public Double getTs2() {
        return ts2;
    }

    public void setTs2(Double _value_) {
        ts2 = _value_;
    }

    public void setTs2(String _value_) {
        ts2 = getDoubleFromString(_value_);
    }

    public String ts2ToString() {
        return ts2 != null ? ts2.toString() : null;
    }

    private static void setTs2(BaseClass _this_, String _value_) {
        ((ExcELIN1) _this_).setTs2(_value_);
    }

    private static String ts2ToString(BaseClass _this_) {
        return ((ExcELIN1) _this_).ts2ToString();
    }

    /**
     * Stabilizer parameters (Tsw).  Typical Value = 3.
     */
    private Double tsw; // Seconds

    public Double getTsw() {
        return tsw;
    }

    public void setTsw(Double _value_) {
        tsw = _value_;
    }

    public void setTsw(String _value_) {
        tsw = getDoubleFromString(_value_);
    }

    public String tswToString() {
        return tsw != null ? tsw.toString() : null;
    }

    private static void setTsw(BaseClass _this_, String _value_) {
        ((ExcELIN1) _this_).setTsw(_value_);
    }

    private static String tswToString(BaseClass _this_) {
        return ((ExcELIN1) _this_).tswToString();
    }

    /**
     * Current controller gain (Vpi).  Typical Value = 12.45.
     */
    private Double vpi; // PU

    public Double getVpi() {
        return vpi;
    }

    public void setVpi(Double _value_) {
        vpi = _value_;
    }

    public void setVpi(String _value_) {
        vpi = getDoubleFromString(_value_);
    }

    public String vpiToString() {
        return vpi != null ? vpi.toString() : null;
    }

    private static void setVpi(BaseClass _this_, String _value_) {
        ((ExcELIN1) _this_).setVpi(_value_);
    }

    private static String vpiToString(BaseClass _this_) {
        return ((ExcELIN1) _this_).vpiToString();
    }

    /**
     * Controller follow up gain (Vpnf).  Typical Value = 2.
     */
    private Double vpnf; // PU

    public Double getVpnf() {
        return vpnf;
    }

    public void setVpnf(Double _value_) {
        vpnf = _value_;
    }

    public void setVpnf(String _value_) {
        vpnf = getDoubleFromString(_value_);
    }

    public String vpnfToString() {
        return vpnf != null ? vpnf.toString() : null;
    }

    private static void setVpnf(BaseClass _this_, String _value_) {
        ((ExcELIN1) _this_).setVpnf(_value_);
    }

    private static String vpnfToString(BaseClass _this_) {
        return ((ExcELIN1) _this_).vpnfToString();
    }

    /**
     * Voltage controller proportional gain (Vpu).  Typical Value = 34.5.
     */
    private Double vpu; // PU

    public Double getVpu() {
        return vpu;
    }

    public void setVpu(Double _value_) {
        vpu = _value_;
    }

    public void setVpu(String _value_) {
        vpu = getDoubleFromString(_value_);
    }

    public String vpuToString() {
        return vpu != null ? vpu.toString() : null;
    }

    private static void setVpu(BaseClass _this_, String _value_) {
        ((ExcELIN1) _this_).setVpu(_value_);
    }

    private static String vpuToString(BaseClass _this_) {
        return ((ExcELIN1) _this_).vpuToString();
    }

    /**
     * Excitation transformer effective reactance (Xe) (&gt;=0).  Xe represents the regulation of the transformer/rectifier unit.  Typical Value = 0.06.
     */
    private Double xe; // PU

    public Double getXe() {
        return xe;
    }

    public void setXe(Double _value_) {
        xe = _value_;
    }

    public void setXe(String _value_) {
        xe = getDoubleFromString(_value_);
    }

    public String xeToString() {
        return xe != null ? xe.toString() : null;
    }

    private static void setXe(BaseClass _this_, String _value_) {
        ((ExcELIN1) _this_).setXe(_value_);
    }

    private static String xeToString(BaseClass _this_) {
        return ((ExcELIN1) _this_).xeToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ExcELIN1", attrName));
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
                "ExcELIN1", attrName, objectValue));
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
                "ExcELIN1", attrName, stringValue));
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
            map.put("dpnf", new AttrDetails("ExcELIN1.dpnf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcELIN1::dpnfToString, null, ExcELIN1::setDpnf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("efmax", new AttrDetails("ExcELIN1.efmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcELIN1::efmaxToString, null, ExcELIN1::setEfmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("efmin", new AttrDetails("ExcELIN1.efmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcELIN1::efminToString, null, ExcELIN1::setEfmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ks1", new AttrDetails("ExcELIN1.ks1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcELIN1::ks1ToString, null, ExcELIN1::setKs1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ks2", new AttrDetails("ExcELIN1.ks2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcELIN1::ks2ToString, null, ExcELIN1::setKs2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("smax", new AttrDetails("ExcELIN1.smax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcELIN1::smaxToString, null, ExcELIN1::setSmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tfi", new AttrDetails("ExcELIN1.tfi", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcELIN1::tfiToString, null, ExcELIN1::setTfi));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tnu", new AttrDetails("ExcELIN1.tnu", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcELIN1::tnuToString, null, ExcELIN1::setTnu));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ts1", new AttrDetails("ExcELIN1.ts1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcELIN1::ts1ToString, null, ExcELIN1::setTs1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ts2", new AttrDetails("ExcELIN1.ts2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcELIN1::ts2ToString, null, ExcELIN1::setTs2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tsw", new AttrDetails("ExcELIN1.tsw", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcELIN1::tswToString, null, ExcELIN1::setTsw));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vpi", new AttrDetails("ExcELIN1.vpi", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcELIN1::vpiToString, null, ExcELIN1::setVpi));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vpnf", new AttrDetails("ExcELIN1.vpnf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcELIN1::vpnfToString, null, ExcELIN1::setVpnf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vpu", new AttrDetails("ExcELIN1.vpu", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcELIN1::vpuToString, null, ExcELIN1::setVpu));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xe", new AttrDetails("ExcELIN1.xe", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcELIN1::xeToString, null, ExcELIN1::setXe));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcELIN1(null).allAttrDetailsMap());
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
