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
 * Modified IEEE AC2A alternator-supplied rectifier excitation system with different field current limit.
 */
@SuppressWarnings("unused")
public class ExcAC2A extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcAC2A.class);

    /**
     * Default constructor.
     */
    public ExcAC2A() {
        setCimType("ExcAC2A");
    }

    /**
     * Indicates if HV gate is active (&lt;i&gt;HVgate&lt;/i&gt;). true = gate is used false = gate is not used. Typical value = true.
     */
    private Boolean hvgate; // Boolean

    public Boolean getHvgate() {
        return hvgate;
    }

    public void setHvgate(Boolean _value_) {
        hvgate = _value_;
    }

    public void setHvgate(String _value_) {
        hvgate = getBooleanFromString(_value_);
    }

    public String hvgateToString() {
        return hvgate != null ? hvgate.toString() : null;
    }

    private static void setHvgate(BaseClass _this_, String _value_) {
        ((ExcAC2A) _this_).setHvgate(_value_);
    }

    private static String hvgateToString(BaseClass _this_) {
        return ((ExcAC2A) _this_).hvgateToString();
    }

    /**
     * Voltage regulator gain (&lt;i&gt;Ka&lt;/i&gt;) (&amp;gt; 0).  Typical value = 400.
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
        ((ExcAC2A) _this_).setKa(_value_);
    }

    private static String kaToString(BaseClass _this_) {
        return ((ExcAC2A) _this_).kaToString();
    }

    /**
     * Second stage regulator gain (&lt;i&gt;Kb&lt;/i&gt;) (&amp;gt; 0).  Exciter field current controller gain.  Typical value = 25.
     */
    private Double kb; // PU

    public Double getKb() {
        return kb;
    }

    public void setKb(Double _value_) {
        kb = _value_;
    }

    public void setKb(String _value_) {
        kb = getDoubleFromString(_value_);
    }

    public String kbToString() {
        return kb != null ? kb.toString() : null;
    }

    private static void setKb(BaseClass _this_, String _value_) {
        ((ExcAC2A) _this_).setKb(_value_);
    }

    private static String kbToString(BaseClass _this_) {
        return ((ExcAC2A) _this_).kbToString();
    }

    /**
     * Second stage regulator gain (&lt;i&gt;Kb1&lt;/i&gt;). It is exciter field current controller gain used as alternative to &lt;i&gt;Kb&lt;/i&gt; to represent a variant of the ExcAC2A model.  Typical value = 25.
     */
    private Double kb1; // PU

    public Double getKb1() {
        return kb1;
    }

    public void setKb1(Double _value_) {
        kb1 = _value_;
    }

    public void setKb1(String _value_) {
        kb1 = getDoubleFromString(_value_);
    }

    public String kb1ToString() {
        return kb1 != null ? kb1.toString() : null;
    }

    private static void setKb1(BaseClass _this_, String _value_) {
        ((ExcAC2A) _this_).setKb1(_value_);
    }

    private static String kb1ToString(BaseClass _this_) {
        return ((ExcAC2A) _this_).kb1ToString();
    }

    /**
     * Rectifier loading factor proportional to commutating reactance (&lt;i&gt;Kc&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,28.
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
        ((ExcAC2A) _this_).setKc(_value_);
    }

    private static String kcToString(BaseClass _this_) {
        return ((ExcAC2A) _this_).kcToString();
    }

    /**
     * Demagnetizing factor, a function of exciter alternator reactances (&lt;i&gt;Kd&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,35.
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
        ((ExcAC2A) _this_).setKd(_value_);
    }

    private static String kdToString(BaseClass _this_) {
        return ((ExcAC2A) _this_).kdToString();
    }

    /**
     * Exciter constant related to self-excited field (&lt;i&gt;Ke&lt;/i&gt;).  Typical value = 1.
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
        ((ExcAC2A) _this_).setKe(_value_);
    }

    private static String keToString(BaseClass _this_) {
        return ((ExcAC2A) _this_).keToString();
    }

    /**
     * Excitation control system stabilizer gains (&lt;i&gt;Kf&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,03.
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
        ((ExcAC2A) _this_).setKf(_value_);
    }

    private static String kfToString(BaseClass _this_) {
        return ((ExcAC2A) _this_).kfToString();
    }

    /**
     * Exciter field current feedback gain (&lt;i&gt;Kh&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 1.
     */
    private Double kh; // PU

    public Double getKh() {
        return kh;
    }

    public void setKh(Double _value_) {
        kh = _value_;
    }

    public void setKh(String _value_) {
        kh = getDoubleFromString(_value_);
    }

    public String khToString() {
        return kh != null ? kh.toString() : null;
    }

    private static void setKh(BaseClass _this_, String _value_) {
        ((ExcAC2A) _this_).setKh(_value_);
    }

    private static String khToString(BaseClass _this_) {
        return ((ExcAC2A) _this_).khToString();
    }

    /**
     * Exciter field current limiter gain (&lt;i&gt;Kl&lt;/i&gt;).  Typical value = 10.
     */
    private Double kl; // PU

    public Double getKl() {
        return kl;
    }

    public void setKl(Double _value_) {
        kl = _value_;
    }

    public void setKl(String _value_) {
        kl = getDoubleFromString(_value_);
    }

    public String klToString() {
        return kl != null ? kl.toString() : null;
    }

    private static void setKl(BaseClass _this_, String _value_) {
        ((ExcAC2A) _this_).setKl(_value_);
    }

    private static String klToString(BaseClass _this_) {
        return ((ExcAC2A) _this_).klToString();
    }

    /**
     * Coefficient to allow different usage of the model (&lt;i&gt;Kl1&lt;/i&gt;).  Typical value = 1.
     */
    private Double kl1; // PU

    public Double getKl1() {
        return kl1;
    }

    public void setKl1(Double _value_) {
        kl1 = _value_;
    }

    public void setKl1(String _value_) {
        kl1 = getDoubleFromString(_value_);
    }

    public String kl1ToString() {
        return kl1 != null ? kl1.toString() : null;
    }

    private static void setKl1(BaseClass _this_, String _value_) {
        ((ExcAC2A) _this_).setKl1(_value_);
    }

    private static String kl1ToString(BaseClass _this_) {
        return ((ExcAC2A) _this_).kl1ToString();
    }

    /**
     * Coefficient to allow different usage of the model-speed coefficient (&lt;i&gt;Ks&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
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
        ((ExcAC2A) _this_).setKs(_value_);
    }

    private static String ksToString(BaseClass _this_) {
        return ((ExcAC2A) _this_).ksToString();
    }

    /**
     * Indicates if LV gate is active (&lt;i&gt;LVgate&lt;/i&gt;). true = gate is used false = gate is not used. Typical value = true.
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
        ((ExcAC2A) _this_).setLvgate(_value_);
    }

    private static String lvgateToString(BaseClass _this_) {
        return ((ExcAC2A) _this_).lvgateToString();
    }

    /**
     * Exciter saturation function value at the corresponding exciter voltage, &lt;i&gt;Ve&lt;/i&gt;&lt;i&gt;&lt;sub&gt;1&lt;/sub&gt;&lt;/i&gt;, back of commutating reactance (&lt;i&gt;Se[Ve&lt;/i&gt;&lt;i&gt;&lt;sub&gt;1&lt;/sub&gt;&lt;/i&gt;&lt;i&gt;]&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,037.
     */
    private Float seve1; // Float

    public Float getSeve1() {
        return seve1;
    }

    public void setSeve1(Float _value_) {
        seve1 = _value_;
    }

    public void setSeve1(String _value_) {
        seve1 = getFloatFromString(_value_);
    }

    public String seve1ToString() {
        return seve1 != null ? seve1.toString() : null;
    }

    private static void setSeve1(BaseClass _this_, String _value_) {
        ((ExcAC2A) _this_).setSeve1(_value_);
    }

    private static String seve1ToString(BaseClass _this_) {
        return ((ExcAC2A) _this_).seve1ToString();
    }

    /**
     * Exciter saturation function value at the corresponding exciter voltage, &lt;i&gt;Ve&lt;/i&gt;&lt;i&gt;&lt;sub&gt;2&lt;/sub&gt;&lt;/i&gt;, back of commutating reactance (&lt;i&gt;Se[Ve&lt;/i&gt;&lt;i&gt;&lt;sub&gt;2&lt;/sub&gt;&lt;/i&gt;&lt;i&gt;]&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,012.
     */
    private Float seve2; // Float

    public Float getSeve2() {
        return seve2;
    }

    public void setSeve2(Float _value_) {
        seve2 = _value_;
    }

    public void setSeve2(String _value_) {
        seve2 = getFloatFromString(_value_);
    }

    public String seve2ToString() {
        return seve2 != null ? seve2.toString() : null;
    }

    private static void setSeve2(BaseClass _this_, String _value_) {
        ((ExcAC2A) _this_).setSeve2(_value_);
    }

    private static String seve2ToString(BaseClass _this_) {
        return ((ExcAC2A) _this_).seve2ToString();
    }

    /**
     * Voltage regulator time constant (&lt;i&gt;Ta&lt;/i&gt;) (&amp;gt; 0).  Typical value = 0,02.
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
        ((ExcAC2A) _this_).setTa(_value_);
    }

    private static String taToString(BaseClass _this_) {
        return ((ExcAC2A) _this_).taToString();
    }

    /**
     * Voltage regulator time constant (&lt;i&gt;Tb&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
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
        ((ExcAC2A) _this_).setTb(_value_);
    }

    private static String tbToString(BaseClass _this_) {
        return ((ExcAC2A) _this_).tbToString();
    }

    /**
     * Voltage regulator time constant (&lt;i&gt;Tc&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
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
        ((ExcAC2A) _this_).setTc(_value_);
    }

    private static String tcToString(BaseClass _this_) {
        return ((ExcAC2A) _this_).tcToString();
    }

    /**
     * Exciter time constant, integration rate associated with exciter control (&lt;i&gt;Te&lt;/i&gt;) (&amp;gt; 0).  Typical value = 0,6.
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
        ((ExcAC2A) _this_).setTe(_value_);
    }

    private static String teToString(BaseClass _this_) {
        return ((ExcAC2A) _this_).teToString();
    }

    /**
     * Excitation control system stabilizer time constant (&lt;i&gt;Tf&lt;/i&gt;) (&amp;gt; 0).  Typical value = 1.
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
        ((ExcAC2A) _this_).setTf(_value_);
    }

    private static String tfToString(BaseClass _this_) {
        return ((ExcAC2A) _this_).tfToString();
    }

    /**
     * Maximum voltage regulator output (&lt;i&gt;Vamax&lt;/i&gt;) (&amp;gt; 0).  Typical value = 8.
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
        ((ExcAC2A) _this_).setVamax(_value_);
    }

    private static String vamaxToString(BaseClass _this_) {
        return ((ExcAC2A) _this_).vamaxToString();
    }

    /**
     * Minimum voltage regulator output (&lt;i&gt;Vamin&lt;/i&gt;) (&amp;lt; 0).  Typical value = -8.
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
        ((ExcAC2A) _this_).setVamin(_value_);
    }

    private static String vaminToString(BaseClass _this_) {
        return ((ExcAC2A) _this_).vaminToString();
    }

    /**
     * Exciter alternator output voltages back of commutating reactance at which saturation is defined (&lt;i&gt;Ve&lt;/i&gt;&lt;i&gt;&lt;sub&gt;1&lt;/sub&gt;&lt;/i&gt;) (&amp;gt; 0).  Typical value = 4,4.
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
        ((ExcAC2A) _this_).setVe1(_value_);
    }

    private static String ve1ToString(BaseClass _this_) {
        return ((ExcAC2A) _this_).ve1ToString();
    }

    /**
     * Exciter alternator output voltages back of commutating reactance at which saturation is defined (&lt;i&gt;Ve&lt;/i&gt;&lt;i&gt;&lt;sub&gt;2&lt;/sub&gt;&lt;/i&gt;) (&amp;gt; 0).  Typical value = 3,3.
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
        ((ExcAC2A) _this_).setVe2(_value_);
    }

    private static String ve2ToString(BaseClass _this_) {
        return ((ExcAC2A) _this_).ve2ToString();
    }

    /**
     * Exciter field current limit reference (&lt;i&gt;Vfemax&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 4,4.
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
        ((ExcAC2A) _this_).setVfemax(_value_);
    }

    private static String vfemaxToString(BaseClass _this_) {
        return ((ExcAC2A) _this_).vfemaxToString();
    }

    /**
     * Maximum exciter field current (&lt;i&gt;Vlr&lt;/i&gt;) (&amp;gt; 0).  Typical value = 4,4.
     */
    private Double vlr; // PU

    public Double getVlr() {
        return vlr;
    }

    public void setVlr(Double _value_) {
        vlr = _value_;
    }

    public void setVlr(String _value_) {
        vlr = getDoubleFromString(_value_);
    }

    public String vlrToString() {
        return vlr != null ? vlr.toString() : null;
    }

    private static void setVlr(BaseClass _this_, String _value_) {
        ((ExcAC2A) _this_).setVlr(_value_);
    }

    private static String vlrToString(BaseClass _this_) {
        return ((ExcAC2A) _this_).vlrToString();
    }

    /**
     * Maximum voltage regulator outputs (&lt;i&gt;Vrmax&lt;/i&gt;) (&amp;gt; 0).  Typical value = 105.
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
        ((ExcAC2A) _this_).setVrmax(_value_);
    }

    private static String vrmaxToString(BaseClass _this_) {
        return ((ExcAC2A) _this_).vrmaxToString();
    }

    /**
     * Minimum voltage regulator outputs (&lt;i&gt;Vrmin&lt;/i&gt;) (&amp;lt; 0).  Typical value = -95.
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
        ((ExcAC2A) _this_).setVrmin(_value_);
    }

    private static String vrminToString(BaseClass _this_) {
        return ((ExcAC2A) _this_).vrminToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ExcAC2A", attrName));
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
                "ExcAC2A", attrName, objectValue));
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
                "ExcAC2A", attrName, stringValue));
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
            map.put("hvgate", new AttrDetails("ExcAC2A.hvgate", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::hvgateToString, null, ExcAC2A::setHvgate));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ka", new AttrDetails("ExcAC2A.ka", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::kaToString, null, ExcAC2A::setKa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kb", new AttrDetails("ExcAC2A.kb", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::kbToString, null, ExcAC2A::setKb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kb1", new AttrDetails("ExcAC2A.kb1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::kb1ToString, null, ExcAC2A::setKb1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kc", new AttrDetails("ExcAC2A.kc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::kcToString, null, ExcAC2A::setKc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kd", new AttrDetails("ExcAC2A.kd", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::kdToString, null, ExcAC2A::setKd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ke", new AttrDetails("ExcAC2A.ke", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::keToString, null, ExcAC2A::setKe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kf", new AttrDetails("ExcAC2A.kf", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::kfToString, null, ExcAC2A::setKf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kh", new AttrDetails("ExcAC2A.kh", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::khToString, null, ExcAC2A::setKh));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kl", new AttrDetails("ExcAC2A.kl", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::klToString, null, ExcAC2A::setKl));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kl1", new AttrDetails("ExcAC2A.kl1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::kl1ToString, null, ExcAC2A::setKl1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ks", new AttrDetails("ExcAC2A.ks", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::ksToString, null, ExcAC2A::setKs));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("lvgate", new AttrDetails("ExcAC2A.lvgate", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::lvgateToString, null, ExcAC2A::setLvgate));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("seve1", new AttrDetails("ExcAC2A.seve1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::seve1ToString, null, ExcAC2A::setSeve1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("seve2", new AttrDetails("ExcAC2A.seve2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::seve2ToString, null, ExcAC2A::setSeve2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ta", new AttrDetails("ExcAC2A.ta", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::taToString, null, ExcAC2A::setTa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tb", new AttrDetails("ExcAC2A.tb", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::tbToString, null, ExcAC2A::setTb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tc", new AttrDetails("ExcAC2A.tc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::tcToString, null, ExcAC2A::setTc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("te", new AttrDetails("ExcAC2A.te", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::teToString, null, ExcAC2A::setTe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf", new AttrDetails("ExcAC2A.tf", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::tfToString, null, ExcAC2A::setTf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vamax", new AttrDetails("ExcAC2A.vamax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::vamaxToString, null, ExcAC2A::setVamax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vamin", new AttrDetails("ExcAC2A.vamin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::vaminToString, null, ExcAC2A::setVamin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ve1", new AttrDetails("ExcAC2A.ve1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::ve1ToString, null, ExcAC2A::setVe1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ve2", new AttrDetails("ExcAC2A.ve2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::ve2ToString, null, ExcAC2A::setVe2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vfemax", new AttrDetails("ExcAC2A.vfemax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::vfemaxToString, null, ExcAC2A::setVfemax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vlr", new AttrDetails("ExcAC2A.vlr", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::vlrToString, null, ExcAC2A::setVlr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmax", new AttrDetails("ExcAC2A.vrmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::vrmaxToString, null, ExcAC2A::setVrmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmin", new AttrDetails("ExcAC2A.vrmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcAC2A::vrminToString, null, ExcAC2A::setVrmin));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcAC2A().allAttrDetailsMap());
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
