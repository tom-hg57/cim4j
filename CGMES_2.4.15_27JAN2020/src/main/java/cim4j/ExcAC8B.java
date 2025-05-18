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
 * Modified IEEE AC8B alternator-supplied rectifier excitation system with speed input and input limiter.
 */
@SuppressWarnings("unused")
public class ExcAC8B extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcAC8B.class);

    /**
     * Constructor.
     */
    public ExcAC8B(String rdfid) {
        super("ExcAC8B", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected ExcAC8B(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Input limiter indicator. true = input limiter Vimax and Vimin is considered false = input limiter Vimax and Vimin is not considered. Typical Value = true.
     */
    private Boolean inlim; // Boolean

    public Boolean getInlim() {
        return inlim;
    }

    public void setInlim(Boolean _value_) {
        inlim = _value_;
    }

    public void setInlim(String _value_) {
        inlim = getBooleanFromString(_value_);
    }

    public String inlimToString() {
        return inlim != null ? inlim.toString() : null;
    }

    private static void setInlim(BaseClass _this_, String _value_) {
        ((ExcAC8B) _this_).setInlim(_value_);
    }

    private static String inlimToString(BaseClass _this_) {
        return ((ExcAC8B) _this_).inlimToString();
    }

    /**
     * Voltage regulator gain (Ka).  Typical Value = 1.
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
        ((ExcAC8B) _this_).setKa(_value_);
    }

    private static String kaToString(BaseClass _this_) {
        return ((ExcAC8B) _this_).kaToString();
    }

    /**
     * Rectifier loading factor proportional to commutating reactance (Kc). Typical Value = 0.55.
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
        ((ExcAC8B) _this_).setKc(_value_);
    }

    private static String kcToString(BaseClass _this_) {
        return ((ExcAC8B) _this_).kcToString();
    }

    /**
     * Demagnetizing factor, a function of exciter alternator reactances (Kd).  Typical Value = 1.1.
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
        ((ExcAC8B) _this_).setKd(_value_);
    }

    private static String kdToString(BaseClass _this_) {
        return ((ExcAC8B) _this_).kdToString();
    }

    /**
     * Voltage regulator derivative gain (Kdr).  Typical Value = 10.
     */
    private Double kdr; // PU

    public Double getKdr() {
        return kdr;
    }

    public void setKdr(Double _value_) {
        kdr = _value_;
    }

    public void setKdr(String _value_) {
        kdr = getDoubleFromString(_value_);
    }

    public String kdrToString() {
        return kdr != null ? kdr.toString() : null;
    }

    private static void setKdr(BaseClass _this_, String _value_) {
        ((ExcAC8B) _this_).setKdr(_value_);
    }

    private static String kdrToString(BaseClass _this_) {
        return ((ExcAC8B) _this_).kdrToString();
    }

    /**
     * Exciter constant related to self-excited field (Ke).  Typical Value = 1.
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
        ((ExcAC8B) _this_).setKe(_value_);
    }

    private static String keToString(BaseClass _this_) {
        return ((ExcAC8B) _this_).keToString();
    }

    /**
     * Voltage regulator integral gain (Kir).  Typical Value = 5.
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
        ((ExcAC8B) _this_).setKir(_value_);
    }

    private static String kirToString(BaseClass _this_) {
        return ((ExcAC8B) _this_).kirToString();
    }

    /**
     * Voltage regulator proportional gain (Kpr).  Typical Value = 80.
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
        ((ExcAC8B) _this_).setKpr(_value_);
    }

    private static String kprToString(BaseClass _this_) {
        return ((ExcAC8B) _this_).kprToString();
    }

    /**
     * Coefficient to allow different usage of the model-speed coefficient (Ks).  Typical Value = 0.
     */
    private Double ks; // PU

    public Double getKs() {
        return ks;
    }

    public void setKs(Double _value_) {
        ks = _value_;
    }

    public void setKs(String _value_) {
        ks = getDoubleFromString(_value_);
    }

    public String ksToString() {
        return ks != null ? ks.toString() : null;
    }

    private static void setKs(BaseClass _this_, String _value_) {
        ((ExcAC8B) _this_).setKs(_value_);
    }

    private static String ksToString(BaseClass _this_) {
        return ((ExcAC8B) _this_).ksToString();
    }

    /**
     * PID limiter indicator. true = input limiter Vpidmax and Vpidmin is considered false = input limiter Vpidmax and Vpidmin is not considered. Typical Value = true.
     */
    private Boolean pidlim; // Boolean

    public Boolean getPidlim() {
        return pidlim;
    }

    public void setPidlim(Boolean _value_) {
        pidlim = _value_;
    }

    public void setPidlim(String _value_) {
        pidlim = getBooleanFromString(_value_);
    }

    public String pidlimToString() {
        return pidlim != null ? pidlim.toString() : null;
    }

    private static void setPidlim(BaseClass _this_, String _value_) {
        ((ExcAC8B) _this_).setPidlim(_value_);
    }

    private static String pidlimToString(BaseClass _this_) {
        return ((ExcAC8B) _this_).pidlimToString();
    }

    /**
     * Exciter saturation function value at the corresponding exciter voltage, Ve, back of commutating reactance (Se[Ve1]).  Typical Value = 0.3.
     */
    private Double seve1; // Simple_Float

    public Double getSeve1() {
        return seve1;
    }

    public void setSeve1(Double _value_) {
        seve1 = _value_;
    }

    public void setSeve1(String _value_) {
        seve1 = getDoubleFromString(_value_);
    }

    public String seve1ToString() {
        return seve1 != null ? seve1.toString() : null;
    }

    private static void setSeve1(BaseClass _this_, String _value_) {
        ((ExcAC8B) _this_).setSeve1(_value_);
    }

    private static String seve1ToString(BaseClass _this_) {
        return ((ExcAC8B) _this_).seve1ToString();
    }

    /**
     * Exciter saturation function value at the corresponding exciter voltage, Ve, back of commutating reactance (Se[Ve2]).  Typical Value = 3.
     */
    private Double seve2; // Simple_Float

    public Double getSeve2() {
        return seve2;
    }

    public void setSeve2(Double _value_) {
        seve2 = _value_;
    }

    public void setSeve2(String _value_) {
        seve2 = getDoubleFromString(_value_);
    }

    public String seve2ToString() {
        return seve2 != null ? seve2.toString() : null;
    }

    private static void setSeve2(BaseClass _this_, String _value_) {
        ((ExcAC8B) _this_).setSeve2(_value_);
    }

    private static String seve2ToString(BaseClass _this_) {
        return ((ExcAC8B) _this_).seve2ToString();
    }

    /**
     * Voltage regulator time constant (Ta).  Typical Value = 0.
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
        ((ExcAC8B) _this_).setTa(_value_);
    }

    private static String taToString(BaseClass _this_) {
        return ((ExcAC8B) _this_).taToString();
    }

    /**
     * Lag time constant (Tdr).  Typical Value = 0.1.
     */
    private Double tdr; // Seconds

    public Double getTdr() {
        return tdr;
    }

    public void setTdr(Double _value_) {
        tdr = _value_;
    }

    public void setTdr(String _value_) {
        tdr = getDoubleFromString(_value_);
    }

    public String tdrToString() {
        return tdr != null ? tdr.toString() : null;
    }

    private static void setTdr(BaseClass _this_, String _value_) {
        ((ExcAC8B) _this_).setTdr(_value_);
    }

    private static String tdrToString(BaseClass _this_) {
        return ((ExcAC8B) _this_).tdrToString();
    }

    /**
     * Exciter time constant, integration rate associated with exciter control (Te).  Typical Value = 1.2.
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
        ((ExcAC8B) _this_).setTe(_value_);
    }

    private static String teToString(BaseClass _this_) {
        return ((ExcAC8B) _this_).teToString();
    }

    /**
     * Selector for the limiter on the block [1/sTe].  See diagram for meaning of true and false. Typical Value = false.
     */
    private Boolean telim; // Boolean

    public Boolean getTelim() {
        return telim;
    }

    public void setTelim(Boolean _value_) {
        telim = _value_;
    }

    public void setTelim(String _value_) {
        telim = getBooleanFromString(_value_);
    }

    public String telimToString() {
        return telim != null ? telim.toString() : null;
    }

    private static void setTelim(BaseClass _this_, String _value_) {
        ((ExcAC8B) _this_).setTelim(_value_);
    }

    private static String telimToString(BaseClass _this_) {
        return ((ExcAC8B) _this_).telimToString();
    }

    /**
     * Exciter alternator output voltages back of commutating reactance at which saturation is defined (Ve) equals V (Ve1).  Typical Value = 6.5.
     */
    private Double ve1; // PU

    public Double getVe1() {
        return ve1;
    }

    public void setVe1(Double _value_) {
        ve1 = _value_;
    }

    public void setVe1(String _value_) {
        ve1 = getDoubleFromString(_value_);
    }

    public String ve1ToString() {
        return ve1 != null ? ve1.toString() : null;
    }

    private static void setVe1(BaseClass _this_, String _value_) {
        ((ExcAC8B) _this_).setVe1(_value_);
    }

    private static String ve1ToString(BaseClass _this_) {
        return ((ExcAC8B) _this_).ve1ToString();
    }

    /**
     * Exciter alternator output voltages back of commutating reactance at which saturation is defined (Ve).  Typical Value = 9.
     */
    private Double ve2; // PU

    public Double getVe2() {
        return ve2;
    }

    public void setVe2(Double _value_) {
        ve2 = _value_;
    }

    public void setVe2(String _value_) {
        ve2 = getDoubleFromString(_value_);
    }

    public String ve2ToString() {
        return ve2 != null ? ve2.toString() : null;
    }

    private static void setVe2(BaseClass _this_, String _value_) {
        ((ExcAC8B) _this_).setVe2(_value_);
    }

    private static String ve2ToString(BaseClass _this_) {
        return ((ExcAC8B) _this_).ve2ToString();
    }

    /**
     * Minimum exciter voltage output (Vemin).  Typical Value = 0.
     */
    private Double vemin; // PU

    public Double getVemin() {
        return vemin;
    }

    public void setVemin(Double _value_) {
        vemin = _value_;
    }

    public void setVemin(String _value_) {
        vemin = getDoubleFromString(_value_);
    }

    public String veminToString() {
        return vemin != null ? vemin.toString() : null;
    }

    private static void setVemin(BaseClass _this_, String _value_) {
        ((ExcAC8B) _this_).setVemin(_value_);
    }

    private static String veminToString(BaseClass _this_) {
        return ((ExcAC8B) _this_).veminToString();
    }

    /**
     * Exciter field current limit reference (Vfemax).  Typical Value = 6.
     */
    private Double vfemax; // PU

    public Double getVfemax() {
        return vfemax;
    }

    public void setVfemax(Double _value_) {
        vfemax = _value_;
    }

    public void setVfemax(String _value_) {
        vfemax = getDoubleFromString(_value_);
    }

    public String vfemaxToString() {
        return vfemax != null ? vfemax.toString() : null;
    }

    private static void setVfemax(BaseClass _this_, String _value_) {
        ((ExcAC8B) _this_).setVfemax(_value_);
    }

    private static String vfemaxToString(BaseClass _this_) {
        return ((ExcAC8B) _this_).vfemaxToString();
    }

    /**
     * Input signal maximum (Vimax).  Typical Value = 35.
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
        ((ExcAC8B) _this_).setVimax(_value_);
    }

    private static String vimaxToString(BaseClass _this_) {
        return ((ExcAC8B) _this_).vimaxToString();
    }

    /**
     * Input signal minimum (Vimin).  Typical Value = -10.
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
        ((ExcAC8B) _this_).setVimin(_value_);
    }

    private static String viminToString(BaseClass _this_) {
        return ((ExcAC8B) _this_).viminToString();
    }

    /**
     * PID maximum controller output (Vpidmax).  Typical Value = 35.
     */
    private Double vpidmax; // PU

    public Double getVpidmax() {
        return vpidmax;
    }

    public void setVpidmax(Double _value_) {
        vpidmax = _value_;
    }

    public void setVpidmax(String _value_) {
        vpidmax = getDoubleFromString(_value_);
    }

    public String vpidmaxToString() {
        return vpidmax != null ? vpidmax.toString() : null;
    }

    private static void setVpidmax(BaseClass _this_, String _value_) {
        ((ExcAC8B) _this_).setVpidmax(_value_);
    }

    private static String vpidmaxToString(BaseClass _this_) {
        return ((ExcAC8B) _this_).vpidmaxToString();
    }

    /**
     * PID minimum controller output (Vpidmin).  Typical Value = -10.
     */
    private Double vpidmin; // PU

    public Double getVpidmin() {
        return vpidmin;
    }

    public void setVpidmin(Double _value_) {
        vpidmin = _value_;
    }

    public void setVpidmin(String _value_) {
        vpidmin = getDoubleFromString(_value_);
    }

    public String vpidminToString() {
        return vpidmin != null ? vpidmin.toString() : null;
    }

    private static void setVpidmin(BaseClass _this_, String _value_) {
        ((ExcAC8B) _this_).setVpidmin(_value_);
    }

    private static String vpidminToString(BaseClass _this_) {
        return ((ExcAC8B) _this_).vpidminToString();
    }

    /**
     * Maximum voltage regulator output (Vrmax). Typical Value = 35.
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
        ((ExcAC8B) _this_).setVrmax(_value_);
    }

    private static String vrmaxToString(BaseClass _this_) {
        return ((ExcAC8B) _this_).vrmaxToString();
    }

    /**
     * Minimum voltage regulator output (Vrmin).  Typical Value = 0.
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
        ((ExcAC8B) _this_).setVrmin(_value_);
    }

    private static String vrminToString(BaseClass _this_) {
        return ((ExcAC8B) _this_).vrminToString();
    }

    /**
     * Multiply by generator`s terminal voltage indicator. true =the limits Vrmax and Vrmin are multiplied by the generator`s terminal voltage to represent a thyristor power stage fed from the generator terminals false = limits are not multiplied by generator`s terminal voltage.  Typical Value = false.
     */
    private Boolean vtmult; // Boolean

    public Boolean getVtmult() {
        return vtmult;
    }

    public void setVtmult(Boolean _value_) {
        vtmult = _value_;
    }

    public void setVtmult(String _value_) {
        vtmult = getBooleanFromString(_value_);
    }

    public String vtmultToString() {
        return vtmult != null ? vtmult.toString() : null;
    }

    private static void setVtmult(BaseClass _this_, String _value_) {
        ((ExcAC8B) _this_).setVtmult(_value_);
    }

    private static String vtmultToString(BaseClass _this_) {
        return ((ExcAC8B) _this_).vtmultToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ExcAC8B", attrName));
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
                "ExcAC8B", attrName, objectValue));
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
                "ExcAC8B", attrName, stringValue));
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
            map.put("inlim", new AttrDetails("ExcAC8B.inlim", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::inlimToString, null, ExcAC8B::setInlim));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ka", new AttrDetails("ExcAC8B.ka", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::kaToString, null, ExcAC8B::setKa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kc", new AttrDetails("ExcAC8B.kc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::kcToString, null, ExcAC8B::setKc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kd", new AttrDetails("ExcAC8B.kd", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::kdToString, null, ExcAC8B::setKd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kdr", new AttrDetails("ExcAC8B.kdr", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::kdrToString, null, ExcAC8B::setKdr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ke", new AttrDetails("ExcAC8B.ke", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::keToString, null, ExcAC8B::setKe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kir", new AttrDetails("ExcAC8B.kir", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::kirToString, null, ExcAC8B::setKir));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpr", new AttrDetails("ExcAC8B.kpr", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::kprToString, null, ExcAC8B::setKpr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ks", new AttrDetails("ExcAC8B.ks", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::ksToString, null, ExcAC8B::setKs));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pidlim", new AttrDetails("ExcAC8B.pidlim", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::pidlimToString, null, ExcAC8B::setPidlim));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("seve1", new AttrDetails("ExcAC8B.seve1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::seve1ToString, null, ExcAC8B::setSeve1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("seve2", new AttrDetails("ExcAC8B.seve2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::seve2ToString, null, ExcAC8B::setSeve2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ta", new AttrDetails("ExcAC8B.ta", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::taToString, null, ExcAC8B::setTa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tdr", new AttrDetails("ExcAC8B.tdr", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::tdrToString, null, ExcAC8B::setTdr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("te", new AttrDetails("ExcAC8B.te", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::teToString, null, ExcAC8B::setTe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("telim", new AttrDetails("ExcAC8B.telim", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::telimToString, null, ExcAC8B::setTelim));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ve1", new AttrDetails("ExcAC8B.ve1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::ve1ToString, null, ExcAC8B::setVe1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ve2", new AttrDetails("ExcAC8B.ve2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::ve2ToString, null, ExcAC8B::setVe2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vemin", new AttrDetails("ExcAC8B.vemin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::veminToString, null, ExcAC8B::setVemin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vfemax", new AttrDetails("ExcAC8B.vfemax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::vfemaxToString, null, ExcAC8B::setVfemax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vimax", new AttrDetails("ExcAC8B.vimax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::vimaxToString, null, ExcAC8B::setVimax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vimin", new AttrDetails("ExcAC8B.vimin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::viminToString, null, ExcAC8B::setVimin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vpidmax", new AttrDetails("ExcAC8B.vpidmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::vpidmaxToString, null, ExcAC8B::setVpidmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vpidmin", new AttrDetails("ExcAC8B.vpidmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::vpidminToString, null, ExcAC8B::setVpidmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmax", new AttrDetails("ExcAC8B.vrmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::vrmaxToString, null, ExcAC8B::setVrmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmin", new AttrDetails("ExcAC8B.vrmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::vrminToString, null, ExcAC8B::setVrmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vtmult", new AttrDetails("ExcAC8B.vtmult", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ExcAC8B::vtmultToString, null, ExcAC8B::setVtmult));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcAC8B(null).allAttrDetailsMap());
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
