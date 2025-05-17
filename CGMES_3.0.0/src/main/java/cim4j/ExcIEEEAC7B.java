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
 * IEEE 421.5-2005 type AC7B model. The model represents excitation systems which consist of an AC alternator with either stationary or rotating rectifiers to produce the DC field requirements. It is an upgrade to earlier AC excitation systems, which replace only the controls but retain the AC alternator and diode rectifier bridge. Reference: IEEE 421.5-2005, 6.7. Note, however, that in IEEE 421.5-2005, the [1 / <i>sT</i><i><sub>E</sub></i>] block is shown as [1 / (1 + <i>sT</i><i><sub>E</sub></i>)], which is incorrect.
 */
@SuppressWarnings("unused")
public class ExcIEEEAC7B extends ExcitationSystemDynamics {

    private static final Logging LOG = Logging.getLogger(ExcIEEEAC7B.class);

    /**
     * Default constructor.
     */
    public ExcIEEEAC7B() {
        setCimType("ExcIEEEAC7B");
    }

    /**
     * Rectifier loading factor proportional to commutating reactance (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;C&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0). Typical value = 0,18.
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
        ((ExcIEEEAC7B) _this_).setKc(_value_);
    }

    private static String kcToString(BaseClass _this_) {
        return ((ExcIEEEAC7B) _this_).kcToString();
    }

    /**
     * Demagnetizing factor, a function of exciter alternator reactances (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;D&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,02.
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
        ((ExcIEEEAC7B) _this_).setKd(_value_);
    }

    private static String kdToString(BaseClass _this_) {
        return ((ExcIEEEAC7B) _this_).kdToString();
    }

    /**
     * Voltage regulator derivative gain (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;DR&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
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
        ((ExcIEEEAC7B) _this_).setKdr(_value_);
    }

    private static String kdrToString(BaseClass _this_) {
        return ((ExcIEEEAC7B) _this_).kdrToString();
    }

    /**
     * Exciter constant related to self-excited field (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;E&lt;/sub&gt;&lt;/i&gt;).  Typical value = 1.
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
        ((ExcIEEEAC7B) _this_).setKe(_value_);
    }

    private static String keToString(BaseClass _this_) {
        return ((ExcIEEEAC7B) _this_).keToString();
    }

    /**
     * Excitation control system stabilizer gain (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;F1&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,212.
     */
    private Double kf1; // PU

    public Double getKf1() {
        return kf1;
    }

    public void setKf1(Double _value_) {
        kf1 = _value_;
    }

    public void setKf1(String _value_) {
        kf1 = getDoubleFromString(_value_);
    }

    public String kf1ToString() {
        return kf1 != null ? kf1.toString() : null;
    }

    private static void setKf1(BaseClass _this_, String _value_) {
        ((ExcIEEEAC7B) _this_).setKf1(_value_);
    }

    private static String kf1ToString(BaseClass _this_) {
        return ((ExcIEEEAC7B) _this_).kf1ToString();
    }

    /**
     * Excitation control system stabilizer gain (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;F2&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
     */
    private Double kf2; // PU

    public Double getKf2() {
        return kf2;
    }

    public void setKf2(Double _value_) {
        kf2 = _value_;
    }

    public void setKf2(String _value_) {
        kf2 = getDoubleFromString(_value_);
    }

    public String kf2ToString() {
        return kf2 != null ? kf2.toString() : null;
    }

    private static void setKf2(BaseClass _this_, String _value_) {
        ((ExcIEEEAC7B) _this_).setKf2(_value_);
    }

    private static String kf2ToString(BaseClass _this_) {
        return ((ExcIEEEAC7B) _this_).kf2ToString();
    }

    /**
     * Excitation control system stabilizer gain (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;F3&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
     */
    private Double kf3; // PU

    public Double getKf3() {
        return kf3;
    }

    public void setKf3(Double _value_) {
        kf3 = _value_;
    }

    public void setKf3(String _value_) {
        kf3 = getDoubleFromString(_value_);
    }

    public String kf3ToString() {
        return kf3 != null ? kf3.toString() : null;
    }

    private static void setKf3(BaseClass _this_, String _value_) {
        ((ExcIEEEAC7B) _this_).setKf3(_value_);
    }

    private static String kf3ToString(BaseClass _this_) {
        return ((ExcIEEEAC7B) _this_).kf3ToString();
    }

    /**
     * Voltage regulator integral gain (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;IA&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 59,69.
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
        ((ExcIEEEAC7B) _this_).setKia(_value_);
    }

    private static String kiaToString(BaseClass _this_) {
        return ((ExcIEEEAC7B) _this_).kiaToString();
    }

    /**
     * Voltage regulator integral gain (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;IR&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 4,24.
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
        ((ExcIEEEAC7B) _this_).setKir(_value_);
    }

    private static String kirToString(BaseClass _this_) {
        return ((ExcIEEEAC7B) _this_).kirToString();
    }

    /**
     * Exciter field voltage lower limit parameter (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;L&lt;/sub&gt;&lt;/i&gt;).  Typical value = 10.
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
        ((ExcIEEEAC7B) _this_).setKl(_value_);
    }

    private static String klToString(BaseClass _this_) {
        return ((ExcIEEEAC7B) _this_).klToString();
    }

    /**
     * Potential circuit gain coefficient (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;P&lt;/sub&gt;&lt;/i&gt;) (&amp;gt; 0).  Typical value = 4,96.
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
        ((ExcIEEEAC7B) _this_).setKp(_value_);
    }

    private static String kpToString(BaseClass _this_) {
        return ((ExcIEEEAC7B) _this_).kpToString();
    }

    /**
     * Voltage regulator proportional gain (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;PA&lt;/sub&gt;&lt;/i&gt;) (&amp;gt; 0 if ExcIEEEAC7B.kia = 0).  Typical value = 65,36.
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
        ((ExcIEEEAC7B) _this_).setKpa(_value_);
    }

    private static String kpaToString(BaseClass _this_) {
        return ((ExcIEEEAC7B) _this_).kpaToString();
    }

    /**
     * Voltage regulator proportional gain (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;PR&lt;/sub&gt;&lt;/i&gt;) (&amp;gt; 0 if ExcIEEEAC7B.kir = 0).  Typical value = 4,24.
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
        ((ExcIEEEAC7B) _this_).setKpr(_value_);
    }

    private static String kprToString(BaseClass _this_) {
        return ((ExcIEEEAC7B) _this_).kprToString();
    }

    /**
     * Exciter saturation function value at the corresponding exciter voltage, &lt;i&gt;V&lt;/i&gt;&lt;i&gt;&lt;sub&gt;E1&lt;/sub&gt;&lt;/i&gt;, back of commutating reactance (&lt;i&gt;S&lt;/i&gt;&lt;i&gt;&lt;sub&gt;E&lt;/sub&gt;&lt;/i&gt;&lt;i&gt;[V&lt;/i&gt;&lt;i&gt;&lt;sub&gt;E1&lt;/sub&gt;&lt;/i&gt;&lt;i&gt;]&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,44.
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
        ((ExcIEEEAC7B) _this_).setSeve1(_value_);
    }

    private static String seve1ToString(BaseClass _this_) {
        return ((ExcIEEEAC7B) _this_).seve1ToString();
    }

    /**
     * Exciter saturation function value at the corresponding exciter voltage, &lt;i&gt;V&lt;/i&gt;&lt;i&gt;&lt;sub&gt;E2&lt;/sub&gt;&lt;/i&gt;, back of commutating reactance (&lt;i&gt;S&lt;/i&gt;&lt;i&gt;&lt;sub&gt;E&lt;/sub&gt;&lt;/i&gt;&lt;i&gt;[V&lt;/i&gt;&lt;i&gt;&lt;sub&gt;E2&lt;/sub&gt;&lt;/i&gt;&lt;i&gt;]&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,075.
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
        ((ExcIEEEAC7B) _this_).setSeve2(_value_);
    }

    private static String seve2ToString(BaseClass _this_) {
        return ((ExcIEEEAC7B) _this_).seve2ToString();
    }

    /**
     * Lag time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;DR&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
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
        ((ExcIEEEAC7B) _this_).setTdr(_value_);
    }

    private static String tdrToString(BaseClass _this_) {
        return ((ExcIEEEAC7B) _this_).tdrToString();
    }

    /**
     * Exciter time constant, integration rate associated with exciter control (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;E&lt;/sub&gt;&lt;/i&gt;) (&amp;gt; 0).  Typical value = 1,1.
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
        ((ExcIEEEAC7B) _this_).setTe(_value_);
    }

    private static String teToString(BaseClass _this_) {
        return ((ExcIEEEAC7B) _this_).teToString();
    }

    /**
     * Excitation control system stabilizer time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;F&lt;/sub&gt;&lt;/i&gt;) (&amp;gt; 0).  Typical value = 1.
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
        ((ExcIEEEAC7B) _this_).setTf(_value_);
    }

    private static String tfToString(BaseClass _this_) {
        return ((ExcIEEEAC7B) _this_).tfToString();
    }

    /**
     * Maximum voltage regulator output (&lt;i&gt;V&lt;/i&gt;&lt;i&gt;&lt;sub&gt;AMAX&lt;/sub&gt;&lt;/i&gt;) (&amp;gt; 0).  Typical value = 1.
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
        ((ExcIEEEAC7B) _this_).setVamax(_value_);
    }

    private static String vamaxToString(BaseClass _this_) {
        return ((ExcIEEEAC7B) _this_).vamaxToString();
    }

    /**
     * Minimum voltage regulator output (&lt;i&gt;V&lt;/i&gt;&lt;i&gt;&lt;sub&gt;AMIN&lt;/sub&gt;&lt;/i&gt;) (&amp;lt; 0).  Typical value = -0,95.
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
        ((ExcIEEEAC7B) _this_).setVamin(_value_);
    }

    private static String vaminToString(BaseClass _this_) {
        return ((ExcIEEEAC7B) _this_).vaminToString();
    }

    /**
     * Exciter alternator output voltages back of commutating reactance at which saturation is defined (&lt;i&gt;V&lt;/i&gt;&lt;i&gt;&lt;sub&gt;E1&lt;/sub&gt;&lt;/i&gt;) (&amp;gt; 0).  Typical value = 6,3.
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
        ((ExcIEEEAC7B) _this_).setVe1(_value_);
    }

    private static String ve1ToString(BaseClass _this_) {
        return ((ExcIEEEAC7B) _this_).ve1ToString();
    }

    /**
     * Exciter alternator output voltages back of commutating reactance at which saturation is defined (&lt;i&gt;V&lt;/i&gt;&lt;i&gt;&lt;sub&gt;E2&lt;/sub&gt;&lt;/i&gt;) (&amp;gt; 0).  Typical value = 3,02.
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
        ((ExcIEEEAC7B) _this_).setVe2(_value_);
    }

    private static String ve2ToString(BaseClass _this_) {
        return ((ExcIEEEAC7B) _this_).ve2ToString();
    }

    /**
     * Minimum exciter voltage output (&lt;i&gt;V&lt;/i&gt;&lt;i&gt;&lt;sub&gt;EMIN&lt;/sub&gt;&lt;/i&gt;) (&amp;lt;= 0).  Typical value = 0.
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
        ((ExcIEEEAC7B) _this_).setVemin(_value_);
    }

    private static String veminToString(BaseClass _this_) {
        return ((ExcIEEEAC7B) _this_).veminToString();
    }

    /**
     * Exciter field current limit reference (&lt;i&gt;V&lt;/i&gt;&lt;i&gt;&lt;sub&gt;FEMAX&lt;/sub&gt;&lt;/i&gt;).  Typical value = 6,9.
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
        ((ExcIEEEAC7B) _this_).setVfemax(_value_);
    }

    private static String vfemaxToString(BaseClass _this_) {
        return ((ExcIEEEAC7B) _this_).vfemaxToString();
    }

    /**
     * Maximum voltage regulator output (&lt;i&gt;V&lt;/i&gt;&lt;i&gt;&lt;sub&gt;RMAX&lt;/sub&gt;&lt;/i&gt;) (&amp;gt; 0).  Typical value = 5,79.
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
        ((ExcIEEEAC7B) _this_).setVrmax(_value_);
    }

    private static String vrmaxToString(BaseClass _this_) {
        return ((ExcIEEEAC7B) _this_).vrmaxToString();
    }

    /**
     * Minimum voltage regulator output (&lt;i&gt;V&lt;/i&gt;&lt;i&gt;&lt;sub&gt;RMIN&lt;/sub&gt;&lt;/i&gt;) (&amp;lt; 0).  Typical value = -5,79.
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
        ((ExcIEEEAC7B) _this_).setVrmin(_value_);
    }

    private static String vrminToString(BaseClass _this_) {
        return ((ExcIEEEAC7B) _this_).vrminToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ExcIEEEAC7B", attrName));
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
                "ExcIEEEAC7B", attrName, objectValue));
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
                "ExcIEEEAC7B", attrName, stringValue));
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
            map.put("kc", new AttrDetails("ExcIEEEAC7B.kc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC7B::kcToString, null, ExcIEEEAC7B::setKc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kd", new AttrDetails("ExcIEEEAC7B.kd", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC7B::kdToString, null, ExcIEEEAC7B::setKd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kdr", new AttrDetails("ExcIEEEAC7B.kdr", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC7B::kdrToString, null, ExcIEEEAC7B::setKdr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ke", new AttrDetails("ExcIEEEAC7B.ke", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC7B::keToString, null, ExcIEEEAC7B::setKe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kf1", new AttrDetails("ExcIEEEAC7B.kf1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC7B::kf1ToString, null, ExcIEEEAC7B::setKf1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kf2", new AttrDetails("ExcIEEEAC7B.kf2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC7B::kf2ToString, null, ExcIEEEAC7B::setKf2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kf3", new AttrDetails("ExcIEEEAC7B.kf3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC7B::kf3ToString, null, ExcIEEEAC7B::setKf3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kia", new AttrDetails("ExcIEEEAC7B.kia", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC7B::kiaToString, null, ExcIEEEAC7B::setKia));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kir", new AttrDetails("ExcIEEEAC7B.kir", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC7B::kirToString, null, ExcIEEEAC7B::setKir));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kl", new AttrDetails("ExcIEEEAC7B.kl", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC7B::klToString, null, ExcIEEEAC7B::setKl));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kp", new AttrDetails("ExcIEEEAC7B.kp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC7B::kpToString, null, ExcIEEEAC7B::setKp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpa", new AttrDetails("ExcIEEEAC7B.kpa", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC7B::kpaToString, null, ExcIEEEAC7B::setKpa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpr", new AttrDetails("ExcIEEEAC7B.kpr", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC7B::kprToString, null, ExcIEEEAC7B::setKpr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("seve1", new AttrDetails("ExcIEEEAC7B.seve1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC7B::seve1ToString, null, ExcIEEEAC7B::setSeve1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("seve2", new AttrDetails("ExcIEEEAC7B.seve2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC7B::seve2ToString, null, ExcIEEEAC7B::setSeve2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tdr", new AttrDetails("ExcIEEEAC7B.tdr", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC7B::tdrToString, null, ExcIEEEAC7B::setTdr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("te", new AttrDetails("ExcIEEEAC7B.te", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC7B::teToString, null, ExcIEEEAC7B::setTe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf", new AttrDetails("ExcIEEEAC7B.tf", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC7B::tfToString, null, ExcIEEEAC7B::setTf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vamax", new AttrDetails("ExcIEEEAC7B.vamax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC7B::vamaxToString, null, ExcIEEEAC7B::setVamax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vamin", new AttrDetails("ExcIEEEAC7B.vamin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC7B::vaminToString, null, ExcIEEEAC7B::setVamin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ve1", new AttrDetails("ExcIEEEAC7B.ve1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC7B::ve1ToString, null, ExcIEEEAC7B::setVe1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ve2", new AttrDetails("ExcIEEEAC7B.ve2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC7B::ve2ToString, null, ExcIEEEAC7B::setVe2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vemin", new AttrDetails("ExcIEEEAC7B.vemin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC7B::veminToString, null, ExcIEEEAC7B::setVemin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vfemax", new AttrDetails("ExcIEEEAC7B.vfemax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC7B::vfemaxToString, null, ExcIEEEAC7B::setVfemax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmax", new AttrDetails("ExcIEEEAC7B.vrmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC7B::vrmaxToString, null, ExcIEEEAC7B::setVrmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vrmin", new AttrDetails("ExcIEEEAC7B.vrmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ExcIEEEAC7B::vrminToString, null, ExcIEEEAC7B::setVrmin));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ExcIEEEAC7B().allAttrDetailsMap());
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
