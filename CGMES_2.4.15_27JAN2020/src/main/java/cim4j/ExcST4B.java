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
 * Modified IEEE ST4B static excitation system with maximum inner loop feedback gain .
 */
@SuppressWarnings("unused")
public class ExcST4B extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcST4B.class);

    /**
     * Default constructor.
     */
    public ExcST4B() {
        setCimType("ExcST4B");
    }

    /**
     * Rectifier loading factor proportional to commutating reactance (Kc). Typical Value = 0.113.
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
        ((ExcST4B) _this_).setKc(_value_);
    }

    private static String kcToString(BaseClass _this_) {
        return ((ExcST4B) _this_).kcToString();
    }

    /**
     * Feedback gain constant of the inner loop field regulator (Kg). Typical Value = 0.
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
        ((ExcST4B) _this_).setKg(_value_);
    }

    private static String kgToString(BaseClass _this_) {
        return ((ExcST4B) _this_).kgToString();
    }

    /**
     * Potential circuit gain coefficient (Ki).  Typical Value = 0.
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
        ((ExcST4B) _this_).setKi(_value_);
    }

    private static String kiToString(BaseClass _this_) {
        return ((ExcST4B) _this_).kiToString();
    }

    /**
     * Voltage regulator integral gain output (Kim).  Typical Value = 0.
     */
    private Double kim; // PU

    public Double getKim() {
        return kim;
    }

    public void setKim(Double _value_) {
        kim = _value_;
    }

    public void setKim(String _value_) {
        kim = getDoubleFromString(_value_);
    }

    public String kimToString() {
        return kim != null ? kim.toString() : null;
    }

    private static void setKim(BaseClass _this_, String _value_) {
        ((ExcST4B) _this_).setKim(_value_);
    }

    private static String kimToString(BaseClass _this_) {
        return ((ExcST4B) _this_).kimToString();
    }

    /**
     * Voltage regulator integral gain (Kir).  Typical Value = 10.75.
     */
    private Double kir; // PU

    public Double getKir() {
        return kir;
    }

    public void setKir(Double _value_) {
        kir = _value_;
    }

    public void setKir(String _value_) {
        kir = getDoubleFromString(_value_);
    }

    public String kirToString() {
        return kir != null ? kir.toString() : null;
    }

    private static void setKir(BaseClass _this_, String _value_) {
        ((ExcST4B) _this_).setKir(_value_);
    }

    private static String kirToString(BaseClass _this_) {
        return ((ExcST4B) _this_).kirToString();
    }

    /**
     * Potential circuit gain coefficient (Kp).  Typical Value = 9.3.
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
        ((ExcST4B) _this_).setKp(_value_);
    }

    private static String kpToString(BaseClass _this_) {
        return ((ExcST4B) _this_).kpToString();
    }

    /**
     * Voltage regulator proportional gain output (Kpm).  Typical Value = 1.
     */
    private Double kpm; // PU

    public Double getKpm() {
        return kpm;
    }

    public void setKpm(Double _value_) {
        kpm = _value_;
    }

    public void setKpm(String _value_) {
        kpm = getDoubleFromString(_value_);
    }

    public String kpmToString() {
        return kpm != null ? kpm.toString() : null;
    }

    private static void setKpm(BaseClass _this_, String _value_) {
        ((ExcST4B) _this_).setKpm(_value_);
    }

    private static String kpmToString(BaseClass _this_) {
        return ((ExcST4B) _this_).kpmToString();
    }

    /**
     * Voltage regulator proportional gain (Kpr).  Typical Value = 10.75.
     */
    private Double kpr; // PU

    public Double getKpr() {
        return kpr;
    }

    public void setKpr(Double _value_) {
        kpr = _value_;
    }

    public void setKpr(String _value_) {
        kpr = getDoubleFromString(_value_);
    }

    public String kprToString() {
        return kpr != null ? kpr.toString() : null;
    }

    private static void setKpr(BaseClass _this_, String _value_) {
        ((ExcST4B) _this_).setKpr(_value_);
    }

    private static String kprToString(BaseClass _this_) {
        return ((ExcST4B) _this_).kprToString();
    }

    /**
     * Selector (LVgate). true = LVgate is part of the block diagram false = LVgate is not part of the block diagram.  Typical Value = false.
     */
    private Boolean lvgate; // Boolean

    public Boolean getLvgate() {
        return lvgate;
    }

    public void setLvgate(Boolean _value_) {
        lvgate = _value_;
    }

    public void setLvgate(String _value_) {
        lvgate = getBooleanFromString(_value_);
    }

    public String lvgateToString() {
        return lvgate != null ? lvgate.toString() : null;
    }

    private static void setLvgate(BaseClass _this_, String _value_) {
        ((ExcST4B) _this_).setLvgate(_value_);
    }

    private static String lvgateToString(BaseClass _this_) {
        return ((ExcST4B) _this_).lvgateToString();
    }

    /**
     * Voltage regulator time constant (Ta).  Typical Value = 0.02.
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
        ((ExcST4B) _this_).setTa(_value_);
    }

    private static String taToString(BaseClass _this_) {
        return ((ExcST4B) _this_).taToString();
    }

    /**
     * Potential circuit phase angle (thetap).  Typical Value = 0.
     */
    private Double thetap; // AngleDegrees

    public Double getThetap() {
        return thetap;
    }

    public void setThetap(Double _value_) {
        thetap = _value_;
    }

    public void setThetap(String _value_) {
        thetap = getDoubleFromString(_value_);
    }

    public String thetapToString() {
        return thetap != null ? thetap.toString() : null;
    }

    private static void setThetap(BaseClass _this_, String _value_) {
        ((ExcST4B) _this_).setThetap(_value_);
    }

    private static String thetapToString(BaseClass _this_) {
        return ((ExcST4B) _this_).thetapToString();
    }

    /**
     * Selector (Uel). true = UEL is part of block diagram false = UEL is not part of block diagram.  Typical Value = false.
     */
    private Boolean uel; // Boolean

    public Boolean getUel() {
        return uel;
    }

    public void setUel(Boolean _value_) {
        uel = _value_;
    }

    public void setUel(String _value_) {
        uel = getBooleanFromString(_value_);
    }

    public String uelToString() {
        return uel != null ? uel.toString() : null;
    }

    private static void setUel(BaseClass _this_, String _value_) {
        ((ExcST4B) _this_).setUel(_value_);
    }

    private static String uelToString(BaseClass _this_) {
        return ((ExcST4B) _this_).uelToString();
    }

    /**
     * Maximum excitation voltage (Vbmax).  Typical Value = 11.63.
     */
    private Double vbmax; // PU

    public Double getVbmax() {
        return vbmax;
    }

    public void setVbmax(Double _value_) {
        vbmax = _value_;
    }

    public void setVbmax(String _value_) {
        vbmax = getDoubleFromString(_value_);
    }

    public String vbmaxToString() {
        return vbmax != null ? vbmax.toString() : null;
    }

    private static void setVbmax(BaseClass _this_, String _value_) {
        ((ExcST4B) _this_).setVbmax(_value_);
    }

    private static String vbmaxToString(BaseClass _this_) {
        return ((ExcST4B) _this_).vbmaxToString();
    }

    /**
     * Maximum inner loop feedback voltage (Vgmax).  Typical Value = 5.8.
     */
    private Double vgmax; // PU

    public Double getVgmax() {
        return vgmax;
    }

    public void setVgmax(Double _value_) {
        vgmax = _value_;
    }

    public void setVgmax(String _value_) {
        vgmax = getDoubleFromString(_value_);
    }

    public String vgmaxToString() {
        return vgmax != null ? vgmax.toString() : null;
    }

    private static void setVgmax(BaseClass _this_, String _value_) {
        ((ExcST4B) _this_).setVgmax(_value_);
    }

    private static String vgmaxToString(BaseClass _this_) {
        return ((ExcST4B) _this_).vgmaxToString();
    }

    /**
     * Maximum inner loop output (Vmmax).  Typical Value = 99.
     */
    private Double vmmax; // PU

    public Double getVmmax() {
        return vmmax;
    }

    public void setVmmax(Double _value_) {
        vmmax = _value_;
    }

    public void setVmmax(String _value_) {
        vmmax = getDoubleFromString(_value_);
    }

    public String vmmaxToString() {
        return vmmax != null ? vmmax.toString() : null;
    }

    private static void setVmmax(BaseClass _this_, String _value_) {
        ((ExcST4B) _this_).setVmmax(_value_);
    }

    private static String vmmaxToString(BaseClass _this_) {
        return ((ExcST4B) _this_).vmmaxToString();
    }

    /**
     * Minimum inner loop output (Vmmin).  Typical Value = -99.
     */
    private Double vmmin; // PU

    public Double getVmmin() {
        return vmmin;
    }

    public void setVmmin(Double _value_) {
        vmmin = _value_;
    }

    public void setVmmin(String _value_) {
        vmmin = getDoubleFromString(_value_);
    }

    public String vmminToString() {
        return vmmin != null ? vmmin.toString() : null;
    }

    private static void setVmmin(BaseClass _this_, String _value_) {
        ((ExcST4B) _this_).setVmmin(_value_);
    }

    private static String vmminToString(BaseClass _this_) {
        return ((ExcST4B) _this_).vmminToString();
    }

    /**
     * Maximum voltage regulator output (Vrmax).  Typical Value = 1.
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
        ((ExcST4B) _this_).setVrmax(_value_);
    }

    private static String vrmaxToString(BaseClass _this_) {
        return ((ExcST4B) _this_).vrmaxToString();
    }

    /**
     * Minimum voltage regulator output (Vrmin).  Typical Value = -0.87.
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
        ((ExcST4B) _this_).setVrmin(_value_);
    }

    private static String vrminToString(BaseClass _this_) {
        return ((ExcST4B) _this_).vrminToString();
    }

    /**
     * Reactance associated with potential source (Xl).  Typical Value = 0.124.
     */
    private Double xl; // PU

    public Double getXl() {
        return xl;
    }

    public void setXl(Double _value_) {
        xl = _value_;
    }

    public void setXl(String _value_) {
        xl = getDoubleFromString(_value_);
    }

    public String xlToString() {
        return xl != null ? xl.toString() : null;
    }

    private static void setXl(BaseClass _this_, String _value_) {
        ((ExcST4B) _this_).setXl(_value_);
    }

    private static String xlToString(BaseClass _this_) {
        return ((ExcST4B) _this_).xlToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ExcST4B", attrName));
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
                "ExcST4B", attrName, objectValue));
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
                "ExcST4B", attrName, stringValue));
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
            map.put("kc", new AttrDetails("ExcST4B.kc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST4B::kcToString, null, ExcST4B::setKc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kg", new AttrDetails("ExcST4B.kg", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST4B::kgToString, null, ExcST4B::setKg));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ki", new AttrDetails("ExcST4B.ki", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST4B::kiToString, null, ExcST4B::setKi));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kim", new AttrDetails("ExcST4B.kim", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST4B::kimToString, null, ExcST4B::setKim));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kir", new AttrDetails("ExcST4B.kir", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST4B::kirToString, null, ExcST4B::setKir));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kp", new AttrDetails("ExcST4B.kp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST4B::kpToString, null, ExcST4B::setKp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpm", new AttrDetails("ExcST4B.kpm", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST4B::kpmToString, null, ExcST4B::setKpm));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpr", new AttrDetails("ExcST4B.kpr", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST4B::kprToString, null, ExcST4B::setKpr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("lvgate", new AttrDetails("ExcST4B.lvgate", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST4B::lvgateToString, null, ExcST4B::setLvgate));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ta", new AttrDetails("ExcST4B.ta", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST4B::taToString, null, ExcST4B::setTa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("thetap", new AttrDetails("ExcST4B.thetap", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST4B::thetapToString, null, ExcST4B::setThetap));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("uel", new AttrDetails("ExcST4B.uel", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST4B::uelToString, null, ExcST4B::setUel));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vbmax", new AttrDetails("ExcST4B.vbmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST4B::vbmaxToString, null, ExcST4B::setVbmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vgmax", new AttrDetails("ExcST4B.vgmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST4B::vgmaxToString, null, ExcST4B::setVgmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vmmax", new AttrDetails("ExcST4B.vmmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST4B::vmmaxToString, null, ExcST4B::setVmmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vmmin", new AttrDetails("ExcST4B.vmmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST4B::vmminToString, null, ExcST4B::setVmmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmax", new AttrDetails("ExcST4B.vrmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST4B::vrmaxToString, null, ExcST4B::setVrmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmin", new AttrDetails("ExcST4B.vrmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST4B::vrminToString, null, ExcST4B::setVrmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("xl", new AttrDetails("ExcST4B.xl", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcST4B::xlToString, null, ExcST4B::setXl));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcST4B().allAttrDetailsMap());
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
