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
 * The class represents IEEE Std 421.5-2005 type AC5A model. The model represents a simplified model for brushless excitation systems. The regulator is supplied from a source, such as a permanent magnet generator, which is not affected by system disturbances.  Unlike other ac models, this model uses loaded rather than open circuit exciter saturation data in the same way as it is used for the dc models.  Because the model has been widely implemented by the industry, it is sometimes used to represent other types of systems when either detailed data for them are not available or simplified models are required.   Reference: IEEE Standard 421.5-2005 Section 6.5.
 */
@SuppressWarnings("unused")
public class ExcIEEEAC5A extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcIEEEAC5A.class);

    /**
     * Default constructor.
     */
    public ExcIEEEAC5A() {
        setCimType("ExcIEEEAC5A");
    }

    /**
     * Exciter voltage at which exciter saturation is defined (E).  Typical Value = 5.6.
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
        ((ExcIEEEAC5A) _this_).setEfd1(_value_);
    }

    private static String efd1ToString(BaseClass _this_) {
        return ((ExcIEEEAC5A) _this_).efd1ToString();
    }

    /**
     * Exciter voltage at which exciter saturation is defined (E).  Typical Value = 4.2.
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
        ((ExcIEEEAC5A) _this_).setEfd2(_value_);
    }

    private static String efd2ToString(BaseClass _this_) {
        return ((ExcIEEEAC5A) _this_).efd2ToString();
    }

    /**
     * Voltage regulator gain (K).  Typical Value = 400.
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
        ((ExcIEEEAC5A) _this_).setKa(_value_);
    }

    private static String kaToString(BaseClass _this_) {
        return ((ExcIEEEAC5A) _this_).kaToString();
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
        ((ExcIEEEAC5A) _this_).setKe(_value_);
    }

    private static String keToString(BaseClass _this_) {
        return ((ExcIEEEAC5A) _this_).keToString();
    }

    /**
     * Excitation control system stabilizer gains (K).  Typical Value = 0.03.
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
        ((ExcIEEEAC5A) _this_).setKf(_value_);
    }

    private static String kfToString(BaseClass _this_) {
        return ((ExcIEEEAC5A) _this_).kfToString();
    }

    /**
     * Exciter saturation function value at the corresponding exciter voltage, E (S[E]).  Typical Value = 0.86.
     */
    private Double seefd1; // Simple_Float

    public Double getSeefd1() {
        return seefd1;
    }

    public void setSeefd1(Double _value_) {
        seefd1 = _value_;
    }

    public void setSeefd1(String _value_) {
        seefd1 = getDoubleFromString(_value_);
    }

    public String seefd1ToString() {
        return seefd1 != null ? seefd1.toString() : null;
    }

    private static void setSeefd1(BaseClass _this_, String _value_) {
        ((ExcIEEEAC5A) _this_).setSeefd1(_value_);
    }

    private static String seefd1ToString(BaseClass _this_) {
        return ((ExcIEEEAC5A) _this_).seefd1ToString();
    }

    /**
     * Exciter saturation function value at the corresponding exciter voltage, E (S[E]).  Typical Value = 0.5.
     */
    private Double seefd2; // Simple_Float

    public Double getSeefd2() {
        return seefd2;
    }

    public void setSeefd2(Double _value_) {
        seefd2 = _value_;
    }

    public void setSeefd2(String _value_) {
        seefd2 = getDoubleFromString(_value_);
    }

    public String seefd2ToString() {
        return seefd2 != null ? seefd2.toString() : null;
    }

    private static void setSeefd2(BaseClass _this_, String _value_) {
        ((ExcIEEEAC5A) _this_).setSeefd2(_value_);
    }

    private static String seefd2ToString(BaseClass _this_) {
        return ((ExcIEEEAC5A) _this_).seefd2ToString();
    }

    /**
     * Voltage regulator time constant (T).  Typical Value = 0.02.
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
        ((ExcIEEEAC5A) _this_).setTa(_value_);
    }

    private static String taToString(BaseClass _this_) {
        return ((ExcIEEEAC5A) _this_).taToString();
    }

    /**
     * Exciter time constant, integration rate associated with exciter control (T).  Typical Value = 0.8.
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
        ((ExcIEEEAC5A) _this_).setTe(_value_);
    }

    private static String teToString(BaseClass _this_) {
        return ((ExcIEEEAC5A) _this_).teToString();
    }

    /**
     * Excitation control system stabilizer time constant (T).  Typical Value = 1.
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
        ((ExcIEEEAC5A) _this_).setTf1(_value_);
    }

    private static String tf1ToString(BaseClass _this_) {
        return ((ExcIEEEAC5A) _this_).tf1ToString();
    }

    /**
     * Excitation control system stabilizer time constant (T).  Typical Value = 1.
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
        ((ExcIEEEAC5A) _this_).setTf2(_value_);
    }

    private static String tf2ToString(BaseClass _this_) {
        return ((ExcIEEEAC5A) _this_).tf2ToString();
    }

    /**
     * Excitation control system stabilizer time constant (T).  Typical Value = 1.
     */
    private Double tf3; // Seconds

    public Double getTf3() {
        return tf3;
    }

    public void setTf3(Double _value_) {
        tf3 = _value_;
    }

    public void setTf3(String _value_) {
        tf3 = getDoubleFromString(_value_);
    }

    public String tf3ToString() {
        return tf3 != null ? tf3.toString() : null;
    }

    private static void setTf3(BaseClass _this_, String _value_) {
        ((ExcIEEEAC5A) _this_).setTf3(_value_);
    }

    private static String tf3ToString(BaseClass _this_) {
        return ((ExcIEEEAC5A) _this_).tf3ToString();
    }

    /**
     * Maximum voltage regulator output (V).  Typical Value = 7.3.
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
        ((ExcIEEEAC5A) _this_).setVrmax(_value_);
    }

    private static String vrmaxToString(BaseClass _this_) {
        return ((ExcIEEEAC5A) _this_).vrmaxToString();
    }

    /**
     * Minimum voltage regulator output (V).  Typical Value = -7.3.
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
        ((ExcIEEEAC5A) _this_).setVrmin(_value_);
    }

    private static String vrminToString(BaseClass _this_) {
        return ((ExcIEEEAC5A) _this_).vrminToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ExcIEEEAC5A", attrName));
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
                "ExcIEEEAC5A", attrName, objectValue));
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
                "ExcIEEEAC5A", attrName, stringValue));
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
            map.put("efd1", new AttrDetails("ExcIEEEAC5A.efd1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcIEEEAC5A::efd1ToString, null, ExcIEEEAC5A::setEfd1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("efd2", new AttrDetails("ExcIEEEAC5A.efd2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcIEEEAC5A::efd2ToString, null, ExcIEEEAC5A::setEfd2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ka", new AttrDetails("ExcIEEEAC5A.ka", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcIEEEAC5A::kaToString, null, ExcIEEEAC5A::setKa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ke", new AttrDetails("ExcIEEEAC5A.ke", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcIEEEAC5A::keToString, null, ExcIEEEAC5A::setKe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kf", new AttrDetails("ExcIEEEAC5A.kf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcIEEEAC5A::kfToString, null, ExcIEEEAC5A::setKf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("seefd1", new AttrDetails("ExcIEEEAC5A.seefd1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcIEEEAC5A::seefd1ToString, null, ExcIEEEAC5A::setSeefd1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("seefd2", new AttrDetails("ExcIEEEAC5A.seefd2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcIEEEAC5A::seefd2ToString, null, ExcIEEEAC5A::setSeefd2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ta", new AttrDetails("ExcIEEEAC5A.ta", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcIEEEAC5A::taToString, null, ExcIEEEAC5A::setTa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("te", new AttrDetails("ExcIEEEAC5A.te", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcIEEEAC5A::teToString, null, ExcIEEEAC5A::setTe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf1", new AttrDetails("ExcIEEEAC5A.tf1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcIEEEAC5A::tf1ToString, null, ExcIEEEAC5A::setTf1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf2", new AttrDetails("ExcIEEEAC5A.tf2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcIEEEAC5A::tf2ToString, null, ExcIEEEAC5A::setTf2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf3", new AttrDetails("ExcIEEEAC5A.tf3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcIEEEAC5A::tf3ToString, null, ExcIEEEAC5A::setTf3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmax", new AttrDetails("ExcIEEEAC5A.vrmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcIEEEAC5A::vrmaxToString, null, ExcIEEEAC5A::setVrmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmin", new AttrDetails("ExcIEEEAC5A.vrmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcIEEEAC5A::vrminToString, null, ExcIEEEAC5A::setVrmin));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcIEEEAC5A().allAttrDetailsMap());
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
