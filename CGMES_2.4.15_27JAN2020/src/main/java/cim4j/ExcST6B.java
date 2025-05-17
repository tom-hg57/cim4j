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
 * Modified IEEE ST6B static excitation system with PID controller and optional inner feedbacks loop.
 */
@SuppressWarnings("unused")
public class ExcST6B extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcST6B.class);

    /**
     * Default constructor.
     */
    public ExcST6B() {
        setCimType("ExcST6B");
    }

    /**
     * Exciter output current limit reference (Ilr).  Typical Value = 4.164.
     */
    private Double ilr; // PU

    public Double getIlr() {
        return ilr;
    }

    public void setIlr(Double _value_) {
        ilr = _value_;
    }

    public void setIlr(String _value_) {
        ilr = getDoubleFromString(_value_);
    }

    public String ilrToString() {
        return ilr != null ? ilr.toString() : null;
    }

    private static void setIlr(BaseClass _this_, String _value_) {
        ((ExcST6B) _this_).setIlr(_value_);
    }

    private static String ilrToString(BaseClass _this_) {
        return ((ExcST6B) _this_).ilrToString();
    }

    /**
     * Selector (K1). true = feedback is from Ifd false = feedback is not from Ifd. Typical Value = true.
     */
    private Boolean k1; // Boolean

    public Boolean getK1() {
        return k1;
    }

    public void setK1(Boolean _value_) {
        k1 = _value_;
    }

    public void setK1(String _value_) {
        k1 = getBooleanFromString(_value_);
    }

    public String k1ToString() {
        return k1 != null ? k1.toString() : null;
    }

    private static void setK1(BaseClass _this_, String _value_) {
        ((ExcST6B) _this_).setK1(_value_);
    }

    private static String k1ToString(BaseClass _this_) {
        return ((ExcST6B) _this_).k1ToString();
    }

    /**
     * Exciter output current limit adjustment (Kcl).  Typical Value = 1.0577.
     */
    private Double kcl; // PU

    public Double getKcl() {
        return kcl;
    }

    public void setKcl(Double _value_) {
        kcl = _value_;
    }

    public void setKcl(String _value_) {
        kcl = getDoubleFromString(_value_);
    }

    public String kclToString() {
        return kcl != null ? kcl.toString() : null;
    }

    private static void setKcl(BaseClass _this_, String _value_) {
        ((ExcST6B) _this_).setKcl(_value_);
    }

    private static String kclToString(BaseClass _this_) {
        return ((ExcST6B) _this_).kclToString();
    }

    /**
     * Pre-control gain constant of the inner loop field regulator (Kff).  Typical Value = 1.
     */
    private Double kff; // PU

    public Double getKff() {
        return kff;
    }

    public void setKff(Double _value_) {
        kff = _value_;
    }

    public void setKff(String _value_) {
        kff = getDoubleFromString(_value_);
    }

    public String kffToString() {
        return kff != null ? kff.toString() : null;
    }

    private static void setKff(BaseClass _this_, String _value_) {
        ((ExcST6B) _this_).setKff(_value_);
    }

    private static String kffToString(BaseClass _this_) {
        return ((ExcST6B) _this_).kffToString();
    }

    /**
     * Feedback gain constant of the inner loop field regulator (Kg).  Typical Value = 1.
     */
    private Double kg; // PU

    public Double getKg() {
        return kg;
    }

    public void setKg(Double _value_) {
        kg = _value_;
    }

    public void setKg(String _value_) {
        kg = getDoubleFromString(_value_);
    }

    public String kgToString() {
        return kg != null ? kg.toString() : null;
    }

    private static void setKg(BaseClass _this_, String _value_) {
        ((ExcST6B) _this_).setKg(_value_);
    }

    private static String kgToString(BaseClass _this_) {
        return ((ExcST6B) _this_).kgToString();
    }

    /**
     * Voltage regulator integral gain (Kia).  Typical Value = 45.094.
     */
    private Double kia; // PU

    public Double getKia() {
        return kia;
    }

    public void setKia(Double _value_) {
        kia = _value_;
    }

    public void setKia(String _value_) {
        kia = getDoubleFromString(_value_);
    }

    public String kiaToString() {
        return kia != null ? kia.toString() : null;
    }

    private static void setKia(BaseClass _this_, String _value_) {
        ((ExcST6B) _this_).setKia(_value_);
    }

    private static String kiaToString(BaseClass _this_) {
        return ((ExcST6B) _this_).kiaToString();
    }

    /**
     * Exciter output current limit adjustment (Kcl).  Typical Value = 17.33.
     */
    private Double klr; // PU

    public Double getKlr() {
        return klr;
    }

    public void setKlr(Double _value_) {
        klr = _value_;
    }

    public void setKlr(String _value_) {
        klr = getDoubleFromString(_value_);
    }

    public String klrToString() {
        return klr != null ? klr.toString() : null;
    }

    private static void setKlr(BaseClass _this_, String _value_) {
        ((ExcST6B) _this_).setKlr(_value_);
    }

    private static String klrToString(BaseClass _this_) {
        return ((ExcST6B) _this_).klrToString();
    }

    /**
     * Forward gain constant of the inner loop field regulator (Km).  Typical Value = 1.
     */
    private Double km; // PU

    public Double getKm() {
        return km;
    }

    public void setKm(Double _value_) {
        km = _value_;
    }

    public void setKm(String _value_) {
        km = getDoubleFromString(_value_);
    }

    public String kmToString() {
        return km != null ? km.toString() : null;
    }

    private static void setKm(BaseClass _this_, String _value_) {
        ((ExcST6B) _this_).setKm(_value_);
    }

    private static String kmToString(BaseClass _this_) {
        return ((ExcST6B) _this_).kmToString();
    }

    /**
     * Voltage regulator proportional gain (Kpa).  Typical Value = 18.038.
     */
    private Double kpa; // PU

    public Double getKpa() {
        return kpa;
    }

    public void setKpa(Double _value_) {
        kpa = _value_;
    }

    public void setKpa(String _value_) {
        kpa = getDoubleFromString(_value_);
    }

    public String kpaToString() {
        return kpa != null ? kpa.toString() : null;
    }

    private static void setKpa(BaseClass _this_, String _value_) {
        ((ExcST6B) _this_).setKpa(_value_);
    }

    private static String kpaToString(BaseClass _this_) {
        return ((ExcST6B) _this_).kpaToString();
    }

    /**
     * Voltage regulator derivative gain (Kvd).  Typical Value = 0.
     */
    private Double kvd; // PU

    public Double getKvd() {
        return kvd;
    }

    public void setKvd(Double _value_) {
        kvd = _value_;
    }

    public void setKvd(String _value_) {
        kvd = getDoubleFromString(_value_);
    }

    public String kvdToString() {
        return kvd != null ? kvd.toString() : null;
    }

    private static void setKvd(BaseClass _this_, String _value_) {
        ((ExcST6B) _this_).setKvd(_value_);
    }

    private static String kvdToString(BaseClass _this_) {
        return ((ExcST6B) _this_).kvdToString();
    }

    /**
     * OEL input selector (OELin). Typical Value = noOELinput.
     */
    private String oelin; // ExcST6BOELselectorKind

    public String getOelin() {
        return oelin;
    }

    public void setOelin(String _value_) {
        oelin = _value_;
    }

    public String oelinToString() {
        return oelin;
    }

    private static void setOelin(BaseClass _this_, String _value_) {
        ((ExcST6B) _this_).setOelin(_value_);
    }

    private static String oelinToString(BaseClass _this_) {
        return ((ExcST6B) _this_).oelinToString();
    }

    /**
     * Feedback time constant of inner loop field voltage regulator (Tg).  Typical Value = 0.02.
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
        ((ExcST6B) _this_).setTg(_value_);
    }

    private static String tgToString(BaseClass _this_) {
        return ((ExcST6B) _this_).tgToString();
    }

    /**
     * Rectifier firing time constant (Ts).  Typical Value = 0.
     */
    private Double ts; // Seconds

    public Double getTs() {
        return ts;
    }

    public void setTs(Double _value_) {
        ts = _value_;
    }

    public void setTs(String _value_) {
        ts = getDoubleFromString(_value_);
    }

    public String tsToString() {
        return ts != null ? ts.toString() : null;
    }

    private static void setTs(BaseClass _this_, String _value_) {
        ((ExcST6B) _this_).setTs(_value_);
    }

    private static String tsToString(BaseClass _this_) {
        return ((ExcST6B) _this_).tsToString();
    }

    /**
     * Voltage regulator derivative gain (Tvd).  Typical Value = 0.
     */
    private Double tvd; // Seconds

    public Double getTvd() {
        return tvd;
    }

    public void setTvd(Double _value_) {
        tvd = _value_;
    }

    public void setTvd(String _value_) {
        tvd = getDoubleFromString(_value_);
    }

    public String tvdToString() {
        return tvd != null ? tvd.toString() : null;
    }

    private static void setTvd(BaseClass _this_, String _value_) {
        ((ExcST6B) _this_).setTvd(_value_);
    }

    private static String tvdToString(BaseClass _this_) {
        return ((ExcST6B) _this_).tvdToString();
    }

    /**
     * Maximum voltage regulator output (Vamax).  Typical Value = 4.81.
     */
    private Double vamax; // PU

    public Double getVamax() {
        return vamax;
    }

    public void setVamax(Double _value_) {
        vamax = _value_;
    }

    public void setVamax(String _value_) {
        vamax = getDoubleFromString(_value_);
    }

    public String vamaxToString() {
        return vamax != null ? vamax.toString() : null;
    }

    private static void setVamax(BaseClass _this_, String _value_) {
        ((ExcST6B) _this_).setVamax(_value_);
    }

    private static String vamaxToString(BaseClass _this_) {
        return ((ExcST6B) _this_).vamaxToString();
    }

    /**
     * Minimum voltage regulator output (Vamin).  Typical Value = -3.85.
     */
    private Double vamin; // PU

    public Double getVamin() {
        return vamin;
    }

    public void setVamin(Double _value_) {
        vamin = _value_;
    }

    public void setVamin(String _value_) {
        vamin = getDoubleFromString(_value_);
    }

    public String vaminToString() {
        return vamin != null ? vamin.toString() : null;
    }

    private static void setVamin(BaseClass _this_, String _value_) {
        ((ExcST6B) _this_).setVamin(_value_);
    }

    private static String vaminToString(BaseClass _this_) {
        return ((ExcST6B) _this_).vaminToString();
    }

    /**
     * Selector (Vilim). true = Vimin-Vimax limiter is active false = Vimin-Vimax limiter is not active. Typical Value = true.
     */
    private Boolean vilim; // Boolean

    public Boolean getVilim() {
        return vilim;
    }

    public void setVilim(Boolean _value_) {
        vilim = _value_;
    }

    public void setVilim(String _value_) {
        vilim = getBooleanFromString(_value_);
    }

    public String vilimToString() {
        return vilim != null ? vilim.toString() : null;
    }

    private static void setVilim(BaseClass _this_, String _value_) {
        ((ExcST6B) _this_).setVilim(_value_);
    }

    private static String vilimToString(BaseClass _this_) {
        return ((ExcST6B) _this_).vilimToString();
    }

    /**
     * Maximum voltage regulator input limit (Vimax).  Typical Value = 10.
     */
    private Double vimax; // PU

    public Double getVimax() {
        return vimax;
    }

    public void setVimax(Double _value_) {
        vimax = _value_;
    }

    public void setVimax(String _value_) {
        vimax = getDoubleFromString(_value_);
    }

    public String vimaxToString() {
        return vimax != null ? vimax.toString() : null;
    }

    private static void setVimax(BaseClass _this_, String _value_) {
        ((ExcST6B) _this_).setVimax(_value_);
    }

    private static String vimaxToString(BaseClass _this_) {
        return ((ExcST6B) _this_).vimaxToString();
    }

    /**
     * Minimum voltage regulator input limit (Vimin).  Typical Value = -10.
     */
    private Double vimin; // PU

    public Double getVimin() {
        return vimin;
    }

    public void setVimin(Double _value_) {
        vimin = _value_;
    }

    public void setVimin(String _value_) {
        vimin = getDoubleFromString(_value_);
    }

    public String viminToString() {
        return vimin != null ? vimin.toString() : null;
    }

    private static void setVimin(BaseClass _this_, String _value_) {
        ((ExcST6B) _this_).setVimin(_value_);
    }

    private static String viminToString(BaseClass _this_) {
        return ((ExcST6B) _this_).viminToString();
    }

    /**
     * Selector (Vmult). true = multiply regulator output by terminal voltage false = do not multiply regulator output by terminal voltage.  Typical Value = true.
     */
    private Boolean vmult; // Boolean

    public Boolean getVmult() {
        return vmult;
    }

    public void setVmult(Boolean _value_) {
        vmult = _value_;
    }

    public void setVmult(String _value_) {
        vmult = getBooleanFromString(_value_);
    }

    public String vmultToString() {
        return vmult != null ? vmult.toString() : null;
    }

    private static void setVmult(BaseClass _this_, String _value_) {
        ((ExcST6B) _this_).setVmult(_value_);
    }

    private static String vmultToString(BaseClass _this_) {
        return ((ExcST6B) _this_).vmultToString();
    }

    /**
     * Maximum voltage regulator output (Vrmax).  Typical Value = 4.81.
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
        ((ExcST6B) _this_).setVrmax(_value_);
    }

    private static String vrmaxToString(BaseClass _this_) {
        return ((ExcST6B) _this_).vrmaxToString();
    }

    /**
     * Minimum voltage regulator output (Vrmin).  Typical Value = -3.85.
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
        ((ExcST6B) _this_).setVrmin(_value_);
    }

    private static String vrminToString(BaseClass _this_) {
        return ((ExcST6B) _this_).vrminToString();
    }

    /**
     * Excitation source reactance (Xc).  Typical Value = 0.05.
     */
    private Double xc; // PU

    public Double getXc() {
        return xc;
    }

    public void setXc(Double _value_) {
        xc = _value_;
    }

    public void setXc(String _value_) {
        xc = getDoubleFromString(_value_);
    }

    public String xcToString() {
        return xc != null ? xc.toString() : null;
    }

    private static void setXc(BaseClass _this_, String _value_) {
        ((ExcST6B) _this_).setXc(_value_);
    }

    private static String xcToString(BaseClass _this_) {
        return ((ExcST6B) _this_).xcToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ExcST6B", attrName));
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
                "ExcST6B", attrName, objectValue));
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
                "ExcST6B", attrName, stringValue));
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
            map.put("ilr", new AttrDetails("ExcST6B.ilr", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST6B::ilrToString, null, ExcST6B::setIlr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k1", new AttrDetails("ExcST6B.k1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST6B::k1ToString, null, ExcST6B::setK1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kcl", new AttrDetails("ExcST6B.kcl", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST6B::kclToString, null, ExcST6B::setKcl));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kff", new AttrDetails("ExcST6B.kff", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST6B::kffToString, null, ExcST6B::setKff));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kg", new AttrDetails("ExcST6B.kg", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST6B::kgToString, null, ExcST6B::setKg));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kia", new AttrDetails("ExcST6B.kia", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST6B::kiaToString, null, ExcST6B::setKia));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("klr", new AttrDetails("ExcST6B.klr", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST6B::klrToString, null, ExcST6B::setKlr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("km", new AttrDetails("ExcST6B.km", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST6B::kmToString, null, ExcST6B::setKm));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpa", new AttrDetails("ExcST6B.kpa", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST6B::kpaToString, null, ExcST6B::setKpa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kvd", new AttrDetails("ExcST6B.kvd", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST6B::kvdToString, null, ExcST6B::setKvd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("oelin", new AttrDetails("ExcST6B.oelin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true, ExcST6B::oelinToString, null, ExcST6B::setOelin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tg", new AttrDetails("ExcST6B.tg", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST6B::tgToString, null, ExcST6B::setTg));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ts", new AttrDetails("ExcST6B.ts", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST6B::tsToString, null, ExcST6B::setTs));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tvd", new AttrDetails("ExcST6B.tvd", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST6B::tvdToString, null, ExcST6B::setTvd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vamax", new AttrDetails("ExcST6B.vamax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST6B::vamaxToString, null, ExcST6B::setVamax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vamin", new AttrDetails("ExcST6B.vamin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST6B::vaminToString, null, ExcST6B::setVamin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vilim", new AttrDetails("ExcST6B.vilim", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST6B::vilimToString, null, ExcST6B::setVilim));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vimax", new AttrDetails("ExcST6B.vimax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST6B::vimaxToString, null, ExcST6B::setVimax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vimin", new AttrDetails("ExcST6B.vimin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST6B::viminToString, null, ExcST6B::setVimin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vmult", new AttrDetails("ExcST6B.vmult", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST6B::vmultToString, null, ExcST6B::setVmult));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmax", new AttrDetails("ExcST6B.vrmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST6B::vrmaxToString, null, ExcST6B::setVrmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmin", new AttrDetails("ExcST6B.vrmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST6B::vrminToString, null, ExcST6B::setVrmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xc", new AttrDetails("ExcST6B.xc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST6B::xcToString, null, ExcST6B::setXc));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcST6B().allAttrDetailsMap());
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
