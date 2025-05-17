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
 * The class represents IEEE Std 421.5-2005 type ST2A model. Some static systems utilize both current and voltage sources (generator terminal quantities) to comprise the power source.  The regulator controls the exciter output through controlled saturation of the power transformer components.  These compound-source rectifier excitation systems are designated Type ST2A and are represented by ExcIEEEST2A.  Reference: IEEE Standard 421.5-2005 Section 7.2.
 */
@SuppressWarnings("unused")
public class ExcIEEEST2A extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcIEEEST2A.class);

    /**
     * Default constructor.
     */
    public ExcIEEEST2A() {
        setCimType("ExcIEEEST2A");
    }

    /**
     * Maximum field voltage (E).  Typical Value = 99.
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
        ((ExcIEEEST2A) _this_).setEfdmax(_value_);
    }

    private static String efdmaxToString(BaseClass _this_) {
        return ((ExcIEEEST2A) _this_).efdmaxToString();
    }

    /**
     * Voltage regulator gain (K).  Typical Value = 120.
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
        ((ExcIEEEST2A) _this_).setKa(_value_);
    }

    private static String kaToString(BaseClass _this_) {
        return ((ExcIEEEST2A) _this_).kaToString();
    }

    /**
     * Rectifier loading factor proportional to commutating reactance (K). Typical Value = 1.82.
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
        ((ExcIEEEST2A) _this_).setKc(_value_);
    }

    private static String kcToString(BaseClass _this_) {
        return ((ExcIEEEST2A) _this_).kcToString();
    }

    /**
     * Exciter constant related to self-excited field (K).  Typical Value = 1.
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
        ((ExcIEEEST2A) _this_).setKe(_value_);
    }

    private static String keToString(BaseClass _this_) {
        return ((ExcIEEEST2A) _this_).keToString();
    }

    /**
     * Excitation control system stabilizer gains (K).  Typical Value = 0.05.
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
        ((ExcIEEEST2A) _this_).setKf(_value_);
    }

    private static String kfToString(BaseClass _this_) {
        return ((ExcIEEEST2A) _this_).kfToString();
    }

    /**
     * Potential circuit gain coefficient (K).  Typical Value = 8.
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
        ((ExcIEEEST2A) _this_).setKi(_value_);
    }

    private static String kiToString(BaseClass _this_) {
        return ((ExcIEEEST2A) _this_).kiToString();
    }

    /**
     * Potential circuit gain coefficient (K).  Typical Value = 4.88.
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
        ((ExcIEEEST2A) _this_).setKp(_value_);
    }

    private static String kpToString(BaseClass _this_) {
        return ((ExcIEEEST2A) _this_).kpToString();
    }

    /**
     * Voltage regulator time constant (T).  Typical Value = 0.15.
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
        ((ExcIEEEST2A) _this_).setTa(_value_);
    }

    private static String taToString(BaseClass _this_) {
        return ((ExcIEEEST2A) _this_).taToString();
    }

    /**
     * Exciter time constant, integration rate associated with exciter control (T).  Typical Value = 0.5.
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
        ((ExcIEEEST2A) _this_).setTe(_value_);
    }

    private static String teToString(BaseClass _this_) {
        return ((ExcIEEEST2A) _this_).teToString();
    }

    /**
     * Excitation control system stabilizer time constant (T).  Typical Value = 1.
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
        ((ExcIEEEST2A) _this_).setTf(_value_);
    }

    private static String tfToString(BaseClass _this_) {
        return ((ExcIEEEST2A) _this_).tfToString();
    }

    /**
     * UEL input (UELin). true = HV gate false = add to error signal. Typical Value = true.
     */
    private Boolean uelin; // Boolean

    public Boolean getUelin() {
        return uelin;
    }

    public void setUelin(Boolean _value_) {
        uelin = _value_;
    }

    public void setUelin(String _value_) {
        uelin = getBooleanFromString(_value_);
    }

    public String uelinToString() {
        return uelin != null ? uelin.toString() : null;
    }

    private static void setUelin(BaseClass _this_, String _value_) {
        ((ExcIEEEST2A) _this_).setUelin(_value_);
    }

    private static String uelinToString(BaseClass _this_) {
        return ((ExcIEEEST2A) _this_).uelinToString();
    }

    /**
     * Maximum voltage regulator outputs (V).  Typical Value = 1.
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
        ((ExcIEEEST2A) _this_).setVrmax(_value_);
    }

    private static String vrmaxToString(BaseClass _this_) {
        return ((ExcIEEEST2A) _this_).vrmaxToString();
    }

    /**
     * Minimum voltage regulator outputs (V).  Typical Value = 0.
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
        ((ExcIEEEST2A) _this_).setVrmin(_value_);
    }

    private static String vrminToString(BaseClass _this_) {
        return ((ExcIEEEST2A) _this_).vrminToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ExcIEEEST2A", attrName));
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
                "ExcIEEEST2A", attrName, objectValue));
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
                "ExcIEEEST2A", attrName, stringValue));
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
            map.put("efdmax", new AttrDetails("ExcIEEEST2A.efdmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcIEEEST2A::efdmaxToString, null, ExcIEEEST2A::setEfdmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ka", new AttrDetails("ExcIEEEST2A.ka", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcIEEEST2A::kaToString, null, ExcIEEEST2A::setKa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kc", new AttrDetails("ExcIEEEST2A.kc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcIEEEST2A::kcToString, null, ExcIEEEST2A::setKc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ke", new AttrDetails("ExcIEEEST2A.ke", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcIEEEST2A::keToString, null, ExcIEEEST2A::setKe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kf", new AttrDetails("ExcIEEEST2A.kf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcIEEEST2A::kfToString, null, ExcIEEEST2A::setKf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ki", new AttrDetails("ExcIEEEST2A.ki", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcIEEEST2A::kiToString, null, ExcIEEEST2A::setKi));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kp", new AttrDetails("ExcIEEEST2A.kp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcIEEEST2A::kpToString, null, ExcIEEEST2A::setKp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ta", new AttrDetails("ExcIEEEST2A.ta", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcIEEEST2A::taToString, null, ExcIEEEST2A::setTa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("te", new AttrDetails("ExcIEEEST2A.te", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcIEEEST2A::teToString, null, ExcIEEEST2A::setTe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf", new AttrDetails("ExcIEEEST2A.tf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcIEEEST2A::tfToString, null, ExcIEEEST2A::setTf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("uelin", new AttrDetails("ExcIEEEST2A.uelin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcIEEEST2A::uelinToString, null, ExcIEEEST2A::setUelin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmax", new AttrDetails("ExcIEEEST2A.vrmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcIEEEST2A::vrmaxToString, null, ExcIEEEST2A::setVrmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmin", new AttrDetails("ExcIEEEST2A.vrmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcIEEEST2A::vrminToString, null, ExcIEEEST2A::setVrmin));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcIEEEST2A().allAttrDetailsMap());
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
