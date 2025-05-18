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
 * Generic turbogas with acceleration and temperature controller.
 */
@SuppressWarnings("unused")
public class GovGAST3 extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovGAST3.class);

    /**
     * Constructor.
     */
    public GovGAST3(String rdfid) {
        super("GovGAST3", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected GovGAST3(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Acceleration limit set-point (Bca).  Unit = 1/s.  Typical Value = 0.01.
     */
    private Double bca; // Simple_Float

    public Double getBca() {
        return bca;
    }

    public void setBca(Double _value_) {
        bca = _value_;
    }

    public void setBca(String _value_) {
        bca = getDoubleFromString(_value_);
    }

    public String bcaToString() {
        return bca != null ? bca.toString() : null;
    }

    private static void setBca(BaseClass _this_, String _value_) {
        ((GovGAST3) _this_).setBca(_value_);
    }

    private static String bcaToString(BaseClass _this_) {
        return ((GovGAST3) _this_).bcaToString();
    }

    /**
     * Droop (bp).  Typical Value = 0.05.
     */
    private Double bp; // PU

    public Double getBp() {
        return bp;
    }

    public void setBp(Double _value_) {
        bp = _value_;
    }

    public void setBp(String _value_) {
        bp = getDoubleFromString(_value_);
    }

    public String bpToString() {
        return bp != null ? bp.toString() : null;
    }

    private static void setBp(BaseClass _this_, String _value_) {
        ((GovGAST3) _this_).setBp(_value_);
    }

    private static String bpToString(BaseClass _this_) {
        return ((GovGAST3) _this_).bpToString();
    }

    /**
     * Exhaust temperature variation due to fuel flow increasing from 0 to 1 PU (deltaTc).  Typical Value = 390.
     */
    private Double dtc; // Temperature

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
        ((GovGAST3) _this_).setDtc(_value_);
    }

    private static String dtcToString(BaseClass _this_) {
        return ((GovGAST3) _this_).dtcToString();
    }

    /**
     * Minimum fuel flow (Ka).  Typical Value = 0.23.
     */
    private Double ka; // PU

    public Double getKa() {
        return ka;
    }

    public void setKa(Double _value_) {
        ka = _value_;
    }

    public void setKa(String _value_) {
        ka = getDoubleFromString(_value_);
    }

    public String kaToString() {
        return ka != null ? ka.toString() : null;
    }

    private static void setKa(BaseClass _this_, String _value_) {
        ((GovGAST3) _this_).setKa(_value_);
    }

    private static String kaToString(BaseClass _this_) {
        return ((GovGAST3) _this_).kaToString();
    }

    /**
     * Fuel system feedback (K).  Typical Value = 0.
     */
    private Double kac; // Simple_Float

    public Double getKac() {
        return kac;
    }

    public void setKac(Double _value_) {
        kac = _value_;
    }

    public void setKac(String _value_) {
        kac = getDoubleFromString(_value_);
    }

    public String kacToString() {
        return kac != null ? kac.toString() : null;
    }

    private static void setKac(BaseClass _this_, String _value_) {
        ((GovGAST3) _this_).setKac(_value_);
    }

    private static String kacToString(BaseClass _this_) {
        return ((GovGAST3) _this_).kacToString();
    }

    /**
     * Acceleration control integral gain (Kca). Unit = 1/s.  Typical Value = 100.
     */
    private Double kca; // Simple_Float

    public Double getKca() {
        return kca;
    }

    public void setKca(Double _value_) {
        kca = _value_;
    }

    public void setKca(String _value_) {
        kca = getDoubleFromString(_value_);
    }

    public String kcaToString() {
        return kca != null ? kca.toString() : null;
    }

    private static void setKca(BaseClass _this_, String _value_) {
        ((GovGAST3) _this_).setKca(_value_);
    }

    private static String kcaToString(BaseClass _this_) {
        return ((GovGAST3) _this_).kcaToString();
    }

    /**
     * Gain of radiation shield (Ksi).  Typical Value = 0.8.
     */
    private Double ksi; // Simple_Float

    public Double getKsi() {
        return ksi;
    }

    public void setKsi(Double _value_) {
        ksi = _value_;
    }

    public void setKsi(String _value_) {
        ksi = getDoubleFromString(_value_);
    }

    public String ksiToString() {
        return ksi != null ? ksi.toString() : null;
    }

    private static void setKsi(BaseClass _this_, String _value_) {
        ((GovGAST3) _this_).setKsi(_value_);
    }

    private static String ksiToString(BaseClass _this_) {
        return ((GovGAST3) _this_).ksiToString();
    }

    /**
     * Coefficient of transfer function of fuel valve positioner (Ky).  Typical Value = 1.
     */
    private Double ky; // Simple_Float

    public Double getKy() {
        return ky;
    }

    public void setKy(Double _value_) {
        ky = _value_;
    }

    public void setKy(String _value_) {
        ky = getDoubleFromString(_value_);
    }

    public String kyToString() {
        return ky != null ? ky.toString() : null;
    }

    private static void setKy(BaseClass _this_, String _value_) {
        ((GovGAST3) _this_).setKy(_value_);
    }

    private static String kyToString(BaseClass _this_) {
        return ((GovGAST3) _this_).kyToString();
    }

    /**
     * Fuel flow maximum negative error value (MN).  Typical Value = -0.05.
     */
    private Double mnef; // PU

    public Double getMnef() {
        return mnef;
    }

    public void setMnef(Double _value_) {
        mnef = _value_;
    }

    public void setMnef(String _value_) {
        mnef = getDoubleFromString(_value_);
    }

    public String mnefToString() {
        return mnef != null ? mnef.toString() : null;
    }

    private static void setMnef(BaseClass _this_, String _value_) {
        ((GovGAST3) _this_).setMnef(_value_);
    }

    private static String mnefToString(BaseClass _this_) {
        return ((GovGAST3) _this_).mnefToString();
    }

    /**
     * Fuel flow maximum positive error value (MX).  Typical Value = 0.05.
     */
    private Double mxef; // PU

    public Double getMxef() {
        return mxef;
    }

    public void setMxef(Double _value_) {
        mxef = _value_;
    }

    public void setMxef(String _value_) {
        mxef = getDoubleFromString(_value_);
    }

    public String mxefToString() {
        return mxef != null ? mxef.toString() : null;
    }

    private static void setMxef(BaseClass _this_, String _value_) {
        ((GovGAST3) _this_).setMxef(_value_);
    }

    private static String mxefToString(BaseClass _this_) {
        return ((GovGAST3) _this_).mxefToString();
    }

    /**
     * Minimum fuel flow (RCMN).  Typical Value = -0.1.
     */
    private Double rcmn; // PU

    public Double getRcmn() {
        return rcmn;
    }

    public void setRcmn(Double _value_) {
        rcmn = _value_;
    }

    public void setRcmn(String _value_) {
        rcmn = getDoubleFromString(_value_);
    }

    public String rcmnToString() {
        return rcmn != null ? rcmn.toString() : null;
    }

    private static void setRcmn(BaseClass _this_, String _value_) {
        ((GovGAST3) _this_).setRcmn(_value_);
    }

    private static String rcmnToString(BaseClass _this_) {
        return ((GovGAST3) _this_).rcmnToString();
    }

    /**
     * Maximum fuel flow (RCMX).  Typical Value = 1.
     */
    private Double rcmx; // PU

    public Double getRcmx() {
        return rcmx;
    }

    public void setRcmx(Double _value_) {
        rcmx = _value_;
    }

    public void setRcmx(String _value_) {
        rcmx = getDoubleFromString(_value_);
    }

    public String rcmxToString() {
        return rcmx != null ? rcmx.toString() : null;
    }

    private static void setRcmx(BaseClass _this_, String _value_) {
        ((GovGAST3) _this_).setRcmx(_value_);
    }

    private static String rcmxToString(BaseClass _this_) {
        return ((GovGAST3) _this_).rcmxToString();
    }

    /**
     * Fuel control time constant (Tac).  Typical Value = 0.1.
     */
    private Double tac; // Seconds

    public Double getTac() {
        return tac;
    }

    public void setTac(Double _value_) {
        tac = _value_;
    }

    public void setTac(String _value_) {
        tac = getDoubleFromString(_value_);
    }

    public String tacToString() {
        return tac != null ? tac.toString() : null;
    }

    private static void setTac(BaseClass _this_, String _value_) {
        ((GovGAST3) _this_).setTac(_value_);
    }

    private static String tacToString(BaseClass _this_) {
        return ((GovGAST3) _this_).tacToString();
    }

    /**
     * Compressor discharge volume time constant (Tc).  Typical Value = 0.2.
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
        ((GovGAST3) _this_).setTc(_value_);
    }

    private static String tcToString(BaseClass _this_) {
        return ((GovGAST3) _this_).tcToString();
    }

    /**
     * Temperature controller derivative gain (Td).  Typical Value = 3.3.
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
        ((GovGAST3) _this_).setTd(_value_);
    }

    private static String tdToString(BaseClass _this_) {
        return ((GovGAST3) _this_).tdToString();
    }

    /**
     * Turbine rated exhaust temperature correspondent to Pm=1 PU (Tfen).  Typical Value = 540.
     */
    private Double tfen; // Temperature

    public Double getTfen() {
        return tfen;
    }

    public void setTfen(Double _value_) {
        tfen = _value_;
    }

    public void setTfen(String _value_) {
        tfen = getDoubleFromString(_value_);
    }

    public String tfenToString() {
        return tfen != null ? tfen.toString() : null;
    }

    private static void setTfen(BaseClass _this_, String _value_) {
        ((GovGAST3) _this_).setTfen(_value_);
    }

    private static String tfenToString(BaseClass _this_) {
        return ((GovGAST3) _this_).tfenToString();
    }

    /**
     * Time constant of speed governor (Tg).  Typical Value = 0.05.
     */
    private Double tg; // Seconds

    public Double getTg() {
        return tg;
    }

    public void setTg(Double _value_) {
        tg = _value_;
    }

    public void setTg(String _value_) {
        tg = getDoubleFromString(_value_);
    }

    public String tgToString() {
        return tg != null ? tg.toString() : null;
    }

    private static void setTg(BaseClass _this_, String _value_) {
        ((GovGAST3) _this_).setTg(_value_);
    }

    private static String tgToString(BaseClass _this_) {
        return ((GovGAST3) _this_).tgToString();
    }

    /**
     * Time constant of radiation shield (Tsi).  Typical Value = 15.
     */
    private Double tsi; // Seconds

    public Double getTsi() {
        return tsi;
    }

    public void setTsi(Double _value_) {
        tsi = _value_;
    }

    public void setTsi(String _value_) {
        tsi = getDoubleFromString(_value_);
    }

    public String tsiToString() {
        return tsi != null ? tsi.toString() : null;
    }

    private static void setTsi(BaseClass _this_, String _value_) {
        ((GovGAST3) _this_).setTsi(_value_);
    }

    private static String tsiToString(BaseClass _this_) {
        return ((GovGAST3) _this_).tsiToString();
    }

    /**
     * Temperature controller integration rate (Tt).  Typical Value = 250.
     */
    private Double tt; // Temperature

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
        ((GovGAST3) _this_).setTt(_value_);
    }

    private static String ttToString(BaseClass _this_) {
        return ((GovGAST3) _this_).ttToString();
    }

    /**
     * Time constant of thermocouple (Ttc).  Typical Value = 2.5.
     */
    private Double ttc; // Seconds

    public Double getTtc() {
        return ttc;
    }

    public void setTtc(Double _value_) {
        ttc = _value_;
    }

    public void setTtc(String _value_) {
        ttc = getDoubleFromString(_value_);
    }

    public String ttcToString() {
        return ttc != null ? ttc.toString() : null;
    }

    private static void setTtc(BaseClass _this_, String _value_) {
        ((GovGAST3) _this_).setTtc(_value_);
    }

    private static String ttcToString(BaseClass _this_) {
        return ((GovGAST3) _this_).ttcToString();
    }

    /**
     * Time constant of fuel valve positioner (Ty).  Typical Value = 0.2.
     */
    private Double ty; // Seconds

    public Double getTy() {
        return ty;
    }

    public void setTy(Double _value_) {
        ty = _value_;
    }

    public void setTy(String _value_) {
        ty = getDoubleFromString(_value_);
    }

    public String tyToString() {
        return ty != null ? ty.toString() : null;
    }

    private static void setTy(BaseClass _this_, String _value_) {
        ((GovGAST3) _this_).setTy(_value_);
    }

    private static String tyToString(BaseClass _this_) {
        return ((GovGAST3) _this_).tyToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "GovGAST3", attrName));
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
                "GovGAST3", attrName, objectValue));
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
                "GovGAST3", attrName, stringValue));
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
            map.put("bca", new AttrDetails("GovGAST3.bca", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGAST3::bcaToString, null, GovGAST3::setBca));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("bp", new AttrDetails("GovGAST3.bp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGAST3::bpToString, null, GovGAST3::setBp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dtc", new AttrDetails("GovGAST3.dtc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGAST3::dtcToString, null, GovGAST3::setDtc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ka", new AttrDetails("GovGAST3.ka", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGAST3::kaToString, null, GovGAST3::setKa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kac", new AttrDetails("GovGAST3.kac", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGAST3::kacToString, null, GovGAST3::setKac));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kca", new AttrDetails("GovGAST3.kca", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGAST3::kcaToString, null, GovGAST3::setKca));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ksi", new AttrDetails("GovGAST3.ksi", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGAST3::ksiToString, null, GovGAST3::setKsi));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ky", new AttrDetails("GovGAST3.ky", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGAST3::kyToString, null, GovGAST3::setKy));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mnef", new AttrDetails("GovGAST3.mnef", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGAST3::mnefToString, null, GovGAST3::setMnef));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mxef", new AttrDetails("GovGAST3.mxef", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGAST3::mxefToString, null, GovGAST3::setMxef));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rcmn", new AttrDetails("GovGAST3.rcmn", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGAST3::rcmnToString, null, GovGAST3::setRcmn));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rcmx", new AttrDetails("GovGAST3.rcmx", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGAST3::rcmxToString, null, GovGAST3::setRcmx));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tac", new AttrDetails("GovGAST3.tac", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGAST3::tacToString, null, GovGAST3::setTac));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tc", new AttrDetails("GovGAST3.tc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGAST3::tcToString, null, GovGAST3::setTc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("td", new AttrDetails("GovGAST3.td", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGAST3::tdToString, null, GovGAST3::setTd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tfen", new AttrDetails("GovGAST3.tfen", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGAST3::tfenToString, null, GovGAST3::setTfen));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tg", new AttrDetails("GovGAST3.tg", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGAST3::tgToString, null, GovGAST3::setTg));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tsi", new AttrDetails("GovGAST3.tsi", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGAST3::tsiToString, null, GovGAST3::setTsi));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tt", new AttrDetails("GovGAST3.tt", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGAST3::ttToString, null, GovGAST3::setTt));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ttc", new AttrDetails("GovGAST3.ttc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGAST3::ttcToString, null, GovGAST3::setTtc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ty", new AttrDetails("GovGAST3.ty", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovGAST3::tyToString, null, GovGAST3::setTy));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new GovGAST3(null).allAttrDetailsMap());
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
