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
 * Proportional/Integral Regulator Excitation System Model.  This model can be used to represent excitation systems with a proportional-integral (PI) voltage regulator controller.
 */
@SuppressWarnings("unused")
public class ExcPIC extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcPIC.class);

    /**
     * Constructor.
     */
    public ExcPIC(String rdfid) {
        super("ExcPIC", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected ExcPIC(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Field voltage value 1 (E1).  Typical Value = 0.
     */
    private Double e1; // PU

    public Double getE1() {
        return e1;
    }

    public void setE1(Double _value_) {
        e1 = _value_;
    }

    public void setE1(String _value_) {
        e1 = getDoubleFromString(_value_);
    }

    public String e1ToString() {
        return e1 != null ? e1.toString() : null;
    }

    private static void setE1(BaseClass _this_, String _value_) {
        ((ExcPIC) _this_).setE1(_value_);
    }

    private static String e1ToString(BaseClass _this_) {
        return ((ExcPIC) _this_).e1ToString();
    }

    /**
     * Field voltage value 2 (E2).  Typical Value = 0.
     */
    private Double e2; // PU

    public Double getE2() {
        return e2;
    }

    public void setE2(Double _value_) {
        e2 = _value_;
    }

    public void setE2(String _value_) {
        e2 = getDoubleFromString(_value_);
    }

    public String e2ToString() {
        return e2 != null ? e2.toString() : null;
    }

    private static void setE2(BaseClass _this_, String _value_) {
        ((ExcPIC) _this_).setE2(_value_);
    }

    private static String e2ToString(BaseClass _this_) {
        return ((ExcPIC) _this_).e2ToString();
    }

    /**
     * Exciter maximum limit (Efdmax).  Typical Value = 8.
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
        ((ExcPIC) _this_).setEfdmax(_value_);
    }

    private static String efdmaxToString(BaseClass _this_) {
        return ((ExcPIC) _this_).efdmaxToString();
    }

    /**
     * Exciter minimum limit (Efdmin).  Typical Value = -0.87.
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
        ((ExcPIC) _this_).setEfdmin(_value_);
    }

    private static String efdminToString(BaseClass _this_) {
        return ((ExcPIC) _this_).efdminToString();
    }

    /**
     * PI controller gain (Ka).  Typical Value = 3.15.
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
        ((ExcPIC) _this_).setKa(_value_);
    }

    private static String kaToString(BaseClass _this_) {
        return ((ExcPIC) _this_).kaToString();
    }

    /**
     * Exciter regulation factor (Kc).  Typical Value = 0.08.
     */
    private Double kc; // PU

    public Double getKc() {
        return kc;
    }

    public void setKc(Double _value_) {
        kc = _value_;
    }

    public void setKc(String _value_) {
        kc = getDoubleFromString(_value_);
    }

    public String kcToString() {
        return kc != null ? kc.toString() : null;
    }

    private static void setKc(BaseClass _this_, String _value_) {
        ((ExcPIC) _this_).setKc(_value_);
    }

    private static String kcToString(BaseClass _this_) {
        return ((ExcPIC) _this_).kcToString();
    }

    /**
     * Exciter constant (Ke).  Typical Value = 0.
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
        ((ExcPIC) _this_).setKe(_value_);
    }

    private static String keToString(BaseClass _this_) {
        return ((ExcPIC) _this_).keToString();
    }

    /**
     * Rate feedback gain (Kf).  Typical Value = 0.
     */
    private Double kf; // PU

    public Double getKf() {
        return kf;
    }

    public void setKf(Double _value_) {
        kf = _value_;
    }

    public void setKf(String _value_) {
        kf = getDoubleFromString(_value_);
    }

    public String kfToString() {
        return kf != null ? kf.toString() : null;
    }

    private static void setKf(BaseClass _this_, String _value_) {
        ((ExcPIC) _this_).setKf(_value_);
    }

    private static String kfToString(BaseClass _this_) {
        return ((ExcPIC) _this_).kfToString();
    }

    /**
     * Current source gain (Ki).  Typical Value = 0.
     */
    private Double ki; // PU

    public Double getKi() {
        return ki;
    }

    public void setKi(Double _value_) {
        ki = _value_;
    }

    public void setKi(String _value_) {
        ki = getDoubleFromString(_value_);
    }

    public String kiToString() {
        return ki != null ? ki.toString() : null;
    }

    private static void setKi(BaseClass _this_, String _value_) {
        ((ExcPIC) _this_).setKi(_value_);
    }

    private static String kiToString(BaseClass _this_) {
        return ((ExcPIC) _this_).kiToString();
    }

    /**
     * Potential source gain (Kp).  Typical Value = 6.5.
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
        ((ExcPIC) _this_).setKp(_value_);
    }

    private static String kpToString(BaseClass _this_) {
        return ((ExcPIC) _this_).kpToString();
    }

    /**
     * Saturation factor at E1 (Se1).  Typical Value = 0.
     */
    private Double se1; // PU

    public Double getSe1() {
        return se1;
    }

    public void setSe1(Double _value_) {
        se1 = _value_;
    }

    public void setSe1(String _value_) {
        se1 = getDoubleFromString(_value_);
    }

    public String se1ToString() {
        return se1 != null ? se1.toString() : null;
    }

    private static void setSe1(BaseClass _this_, String _value_) {
        ((ExcPIC) _this_).setSe1(_value_);
    }

    private static String se1ToString(BaseClass _this_) {
        return ((ExcPIC) _this_).se1ToString();
    }

    /**
     * Saturation factor at E2 (Se2).  Typical Value = 0.
     */
    private Double se2; // PU

    public Double getSe2() {
        return se2;
    }

    public void setSe2(Double _value_) {
        se2 = _value_;
    }

    public void setSe2(String _value_) {
        se2 = getDoubleFromString(_value_);
    }

    public String se2ToString() {
        return se2 != null ? se2.toString() : null;
    }

    private static void setSe2(BaseClass _this_, String _value_) {
        ((ExcPIC) _this_).setSe2(_value_);
    }

    private static String se2ToString(BaseClass _this_) {
        return ((ExcPIC) _this_).se2ToString();
    }

    /**
     * PI controller time constant (Ta1).  Typical Value = 1.
     */
    private Double ta1; // Seconds

    public Double getTa1() {
        return ta1;
    }

    public void setTa1(Double _value_) {
        ta1 = _value_;
    }

    public void setTa1(String _value_) {
        ta1 = getDoubleFromString(_value_);
    }

    public String ta1ToString() {
        return ta1 != null ? ta1.toString() : null;
    }

    private static void setTa1(BaseClass _this_, String _value_) {
        ((ExcPIC) _this_).setTa1(_value_);
    }

    private static String ta1ToString(BaseClass _this_) {
        return ((ExcPIC) _this_).ta1ToString();
    }

    /**
     * Voltage regulator time constant (Ta2).  Typical Value = 0.01.
     */
    private Double ta2; // Seconds

    public Double getTa2() {
        return ta2;
    }

    public void setTa2(Double _value_) {
        ta2 = _value_;
    }

    public void setTa2(String _value_) {
        ta2 = getDoubleFromString(_value_);
    }

    public String ta2ToString() {
        return ta2 != null ? ta2.toString() : null;
    }

    private static void setTa2(BaseClass _this_, String _value_) {
        ((ExcPIC) _this_).setTa2(_value_);
    }

    private static String ta2ToString(BaseClass _this_) {
        return ((ExcPIC) _this_).ta2ToString();
    }

    /**
     * Lead time constant (Ta3).  Typical Value = 0.
     */
    private Double ta3; // Seconds

    public Double getTa3() {
        return ta3;
    }

    public void setTa3(Double _value_) {
        ta3 = _value_;
    }

    public void setTa3(String _value_) {
        ta3 = getDoubleFromString(_value_);
    }

    public String ta3ToString() {
        return ta3 != null ? ta3.toString() : null;
    }

    private static void setTa3(BaseClass _this_, String _value_) {
        ((ExcPIC) _this_).setTa3(_value_);
    }

    private static String ta3ToString(BaseClass _this_) {
        return ((ExcPIC) _this_).ta3ToString();
    }

    /**
     * Lag time constant (Ta4).  Typical Value = 0.
     */
    private Double ta4; // Seconds

    public Double getTa4() {
        return ta4;
    }

    public void setTa4(Double _value_) {
        ta4 = _value_;
    }

    public void setTa4(String _value_) {
        ta4 = getDoubleFromString(_value_);
    }

    public String ta4ToString() {
        return ta4 != null ? ta4.toString() : null;
    }

    private static void setTa4(BaseClass _this_, String _value_) {
        ((ExcPIC) _this_).setTa4(_value_);
    }

    private static String ta4ToString(BaseClass _this_) {
        return ((ExcPIC) _this_).ta4ToString();
    }

    /**
     * Exciter time constant (Te).  Typical Value = 0.
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
        ((ExcPIC) _this_).setTe(_value_);
    }

    private static String teToString(BaseClass _this_) {
        return ((ExcPIC) _this_).teToString();
    }

    /**
     * Rate feedback time constant (Tf1).  Typical Value = 0.
     */
    private Double tf1; // Seconds

    public Double getTf1() {
        return tf1;
    }

    public void setTf1(Double _value_) {
        tf1 = _value_;
    }

    public void setTf1(String _value_) {
        tf1 = getDoubleFromString(_value_);
    }

    public String tf1ToString() {
        return tf1 != null ? tf1.toString() : null;
    }

    private static void setTf1(BaseClass _this_, String _value_) {
        ((ExcPIC) _this_).setTf1(_value_);
    }

    private static String tf1ToString(BaseClass _this_) {
        return ((ExcPIC) _this_).tf1ToString();
    }

    /**
     * Rate feedback lag time constant (Tf2).  Typical Value = 0.
     */
    private Double tf2; // Seconds

    public Double getTf2() {
        return tf2;
    }

    public void setTf2(Double _value_) {
        tf2 = _value_;
    }

    public void setTf2(String _value_) {
        tf2 = getDoubleFromString(_value_);
    }

    public String tf2ToString() {
        return tf2 != null ? tf2.toString() : null;
    }

    private static void setTf2(BaseClass _this_, String _value_) {
        ((ExcPIC) _this_).setTf2(_value_);
    }

    private static String tf2ToString(BaseClass _this_) {
        return ((ExcPIC) _this_).tf2ToString();
    }

    /**
     * PI maximum limit (Vr1).  Typical Value = 1.
     */
    private Double vr1; // PU

    public Double getVr1() {
        return vr1;
    }

    public void setVr1(Double _value_) {
        vr1 = _value_;
    }

    public void setVr1(String _value_) {
        vr1 = getDoubleFromString(_value_);
    }

    public String vr1ToString() {
        return vr1 != null ? vr1.toString() : null;
    }

    private static void setVr1(BaseClass _this_, String _value_) {
        ((ExcPIC) _this_).setVr1(_value_);
    }

    private static String vr1ToString(BaseClass _this_) {
        return ((ExcPIC) _this_).vr1ToString();
    }

    /**
     * PI minimum limit (Vr2).  Typical Value = -0.87.
     */
    private Double vr2; // PU

    public Double getVr2() {
        return vr2;
    }

    public void setVr2(Double _value_) {
        vr2 = _value_;
    }

    public void setVr2(String _value_) {
        vr2 = getDoubleFromString(_value_);
    }

    public String vr2ToString() {
        return vr2 != null ? vr2.toString() : null;
    }

    private static void setVr2(BaseClass _this_, String _value_) {
        ((ExcPIC) _this_).setVr2(_value_);
    }

    private static String vr2ToString(BaseClass _this_) {
        return ((ExcPIC) _this_).vr2ToString();
    }

    /**
     * Voltage regulator maximum limit (Vrmax).  Typical Value = 1.
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
        ((ExcPIC) _this_).setVrmax(_value_);
    }

    private static String vrmaxToString(BaseClass _this_) {
        return ((ExcPIC) _this_).vrmaxToString();
    }

    /**
     * Voltage regulator minimum limit (Vrmin).  Typical Value = -0.87.
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
        ((ExcPIC) _this_).setVrmin(_value_);
    }

    private static String vrminToString(BaseClass _this_) {
        return ((ExcPIC) _this_).vrminToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ExcPIC", attrName));
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
                "ExcPIC", attrName, objectValue));
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
                "ExcPIC", attrName, stringValue));
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
            map.put("e1", new AttrDetails("ExcPIC.e1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcPIC::e1ToString, null, ExcPIC::setE1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("e2", new AttrDetails("ExcPIC.e2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcPIC::e2ToString, null, ExcPIC::setE2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("efdmax", new AttrDetails("ExcPIC.efdmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcPIC::efdmaxToString, null, ExcPIC::setEfdmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("efdmin", new AttrDetails("ExcPIC.efdmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcPIC::efdminToString, null, ExcPIC::setEfdmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ka", new AttrDetails("ExcPIC.ka", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcPIC::kaToString, null, ExcPIC::setKa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kc", new AttrDetails("ExcPIC.kc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcPIC::kcToString, null, ExcPIC::setKc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ke", new AttrDetails("ExcPIC.ke", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcPIC::keToString, null, ExcPIC::setKe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kf", new AttrDetails("ExcPIC.kf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcPIC::kfToString, null, ExcPIC::setKf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ki", new AttrDetails("ExcPIC.ki", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcPIC::kiToString, null, ExcPIC::setKi));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kp", new AttrDetails("ExcPIC.kp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcPIC::kpToString, null, ExcPIC::setKp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("se1", new AttrDetails("ExcPIC.se1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcPIC::se1ToString, null, ExcPIC::setSe1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("se2", new AttrDetails("ExcPIC.se2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcPIC::se2ToString, null, ExcPIC::setSe2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ta1", new AttrDetails("ExcPIC.ta1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcPIC::ta1ToString, null, ExcPIC::setTa1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ta2", new AttrDetails("ExcPIC.ta2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcPIC::ta2ToString, null, ExcPIC::setTa2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ta3", new AttrDetails("ExcPIC.ta3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcPIC::ta3ToString, null, ExcPIC::setTa3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ta4", new AttrDetails("ExcPIC.ta4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcPIC::ta4ToString, null, ExcPIC::setTa4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("te", new AttrDetails("ExcPIC.te", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcPIC::teToString, null, ExcPIC::setTe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf1", new AttrDetails("ExcPIC.tf1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcPIC::tf1ToString, null, ExcPIC::setTf1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf2", new AttrDetails("ExcPIC.tf2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcPIC::tf2ToString, null, ExcPIC::setTf2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vr1", new AttrDetails("ExcPIC.vr1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcPIC::vr1ToString, null, ExcPIC::setVr1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vr2", new AttrDetails("ExcPIC.vr2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcPIC::vr2ToString, null, ExcPIC::setVr2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmax", new AttrDetails("ExcPIC.vrmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcPIC::vrmaxToString, null, ExcPIC::setVrmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmin", new AttrDetails("ExcPIC.vrmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcPIC::vrminToString, null, ExcPIC::setVrmin));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcPIC(null).allAttrDetailsMap());
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
