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
 * Woodward™ gas turbine governor.  [Footnote: Woodward gas turbines are an example of suitable products available commercially. This information is given for the convenience of users of this document and does not constitute an endorsement by IEC of these products.]
 */
@SuppressWarnings("unused")
public class GovGASTWD extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovGASTWD.class);

    /**
     * Default constructor.
     */
    public GovGASTWD() {
        setCimType("GovGASTWD");
    }

    /**
     * Valve positioner (&lt;i&gt;A&lt;/i&gt;).
     */
    private Float a; // Float

    public Float getA() {
        return a;
    }

    public void setA(Float _value_) {
        a = _value_;
    }

    public void setA(String _value_) {
        a = getFloatFromString(_value_);
    }

    public String aToString() {
        return a != null ? a.toString() : null;
    }

    private static void setA(BaseClass _this_, String _value_) {
        ((GovGASTWD) _this_).setA(_value_);
    }

    private static String aToString(BaseClass _this_) {
        return ((GovGASTWD) _this_).aToString();
    }

    /**
     * Exhaust temperature parameter (&lt;i&gt;Af1&lt;/i&gt;).
     */
    private Double af1; // PU

    public Double getAf1() {
        return af1;
    }

    public void setAf1(Double _value_) {
        af1 = _value_;
    }

    public void setAf1(String _value_) {
        af1 = getDoubleFromString(_value_);
    }

    public String af1ToString() {
        return af1 != null ? af1.toString() : null;
    }

    private static void setAf1(BaseClass _this_, String _value_) {
        ((GovGASTWD) _this_).setAf1(_value_);
    }

    private static String af1ToString(BaseClass _this_) {
        return ((GovGASTWD) _this_).af1ToString();
    }

    /**
     * Coefficient equal to 0,5(1-speed) (&lt;i&gt;Af2&lt;/i&gt;).
     */
    private Double af2; // PU

    public Double getAf2() {
        return af2;
    }

    public void setAf2(Double _value_) {
        af2 = _value_;
    }

    public void setAf2(String _value_) {
        af2 = getDoubleFromString(_value_);
    }

    public String af2ToString() {
        return af2 != null ? af2.toString() : null;
    }

    private static void setAf2(BaseClass _this_, String _value_) {
        ((GovGASTWD) _this_).setAf2(_value_);
    }

    private static String af2ToString(BaseClass _this_) {
        return ((GovGASTWD) _this_).af2ToString();
    }

    /**
     * Valve positioner (&lt;i&gt;B&lt;/i&gt;).
     */
    private Float b; // Float

    public Float getB() {
        return b;
    }

    public void setB(Float _value_) {
        b = _value_;
    }

    public void setB(String _value_) {
        b = getFloatFromString(_value_);
    }

    public String bToString() {
        return b != null ? b.toString() : null;
    }

    private static void setB(BaseClass _this_, String _value_) {
        ((GovGASTWD) _this_).setB(_value_);
    }

    private static String bToString(BaseClass _this_) {
        return ((GovGASTWD) _this_).bToString();
    }

    /**
     * (&lt;i&gt;Bf1&lt;/i&gt;).  &lt;i&gt;Bf1&lt;/i&gt; = &lt;i&gt;E&lt;/i&gt;(1-&lt;i&gt;w&lt;/i&gt;) where &lt;i&gt;E&lt;/i&gt; (speed sensitivity coefficient) is 0,55 to 0,65 x &lt;i&gt;Tr&lt;/i&gt;.
     */
    private Double bf1; // PU

    public Double getBf1() {
        return bf1;
    }

    public void setBf1(Double _value_) {
        bf1 = _value_;
    }

    public void setBf1(String _value_) {
        bf1 = getDoubleFromString(_value_);
    }

    public String bf1ToString() {
        return bf1 != null ? bf1.toString() : null;
    }

    private static void setBf1(BaseClass _this_, String _value_) {
        ((GovGASTWD) _this_).setBf1(_value_);
    }

    private static String bf1ToString(BaseClass _this_) {
        return ((GovGASTWD) _this_).bf1ToString();
    }

    /**
     * Turbine torque coefficient K&lt;sub&gt;hhv&lt;/sub&gt; (depends on heating value of fuel stream in combustion chamber) (&lt;i&gt;Bf2&lt;/i&gt;).
     */
    private Double bf2; // PU

    public Double getBf2() {
        return bf2;
    }

    public void setBf2(Double _value_) {
        bf2 = _value_;
    }

    public void setBf2(String _value_) {
        bf2 = getDoubleFromString(_value_);
    }

    public String bf2ToString() {
        return bf2 != null ? bf2.toString() : null;
    }

    private static void setBf2(BaseClass _this_, String _value_) {
        ((GovGASTWD) _this_).setBf2(_value_);
    }

    private static String bf2ToString(BaseClass _this_) {
        return ((GovGASTWD) _this_).bf2ToString();
    }

    /**
     * Valve positioner (&lt;i&gt;C&lt;/i&gt;).
     */
    private Float c; // Float

    public Float getC() {
        return c;
    }

    public void setC(Float _value_) {
        c = _value_;
    }

    public void setC(String _value_) {
        c = getFloatFromString(_value_);
    }

    public String cToString() {
        return c != null ? c.toString() : null;
    }

    private static void setC(BaseClass _this_, String _value_) {
        ((GovGASTWD) _this_).setC(_value_);
    }

    private static String cToString(BaseClass _this_) {
        return ((GovGASTWD) _this_).cToString();
    }

    /**
     * Coefficient defining fuel flow where power output is 0 % (&lt;i&gt;Cf2&lt;/i&gt;).  Synchronous but no output.  Typically 0,23 x K&lt;sub&gt;hhv &lt;/sub&gt;(23 % fuel flow).
     */
    private Double cf2; // PU

    public Double getCf2() {
        return cf2;
    }

    public void setCf2(Double _value_) {
        cf2 = _value_;
    }

    public void setCf2(String _value_) {
        cf2 = getDoubleFromString(_value_);
    }

    public String cf2ToString() {
        return cf2 != null ? cf2.toString() : null;
    }

    private static void setCf2(BaseClass _this_, String _value_) {
        ((GovGASTWD) _this_).setCf2(_value_);
    }

    private static String cf2ToString(BaseClass _this_) {
        return ((GovGASTWD) _this_).cf2ToString();
    }

    /**
     * Combustion reaction time delay (&lt;i&gt;Ecr&lt;/i&gt;) (&amp;gt;= 0).
     */
    private Double ecr; // Seconds

    public Double getEcr() {
        return ecr;
    }

    public void setEcr(Double _value_) {
        ecr = _value_;
    }

    public void setEcr(String _value_) {
        ecr = getDoubleFromString(_value_);
    }

    public String ecrToString() {
        return ecr != null ? ecr.toString() : null;
    }

    private static void setEcr(BaseClass _this_, String _value_) {
        ((GovGASTWD) _this_).setEcr(_value_);
    }

    private static String ecrToString(BaseClass _this_) {
        return ((GovGASTWD) _this_).ecrToString();
    }

    /**
     * Turbine and exhaust delay (&lt;i&gt;Etd&lt;/i&gt;) (&amp;gt;= 0).
     */
    private Double etd; // Seconds

    public Double getEtd() {
        return etd;
    }

    public void setEtd(Double _value_) {
        etd = _value_;
    }

    public void setEtd(String _value_) {
        etd = getDoubleFromString(_value_);
    }

    public String etdToString() {
        return etd != null ? etd.toString() : null;
    }

    private static void setEtd(BaseClass _this_, String _value_) {
        ((GovGASTWD) _this_).setEtd(_value_);
    }

    private static String etdToString(BaseClass _this_) {
        return ((GovGASTWD) _this_).etdToString();
    }

    /**
     * Ratio of fuel adjustment (&lt;i&gt;K3&lt;/i&gt;).
     */
    private Double k3; // PU

    public Double getK3() {
        return k3;
    }

    public void setK3(Double _value_) {
        k3 = _value_;
    }

    public void setK3(String _value_) {
        k3 = getDoubleFromString(_value_);
    }

    public String k3ToString() {
        return k3 != null ? k3.toString() : null;
    }

    private static void setK3(BaseClass _this_, String _value_) {
        ((GovGASTWD) _this_).setK3(_value_);
    }

    private static String k3ToString(BaseClass _this_) {
        return ((GovGASTWD) _this_).k3ToString();
    }

    /**
     * Gain of radiation shield (&lt;i&gt;K4&lt;/i&gt;).
     */
    private Double k4; // PU

    public Double getK4() {
        return k4;
    }

    public void setK4(Double _value_) {
        k4 = _value_;
    }

    public void setK4(String _value_) {
        k4 = getDoubleFromString(_value_);
    }

    public String k4ToString() {
        return k4 != null ? k4.toString() : null;
    }

    private static void setK4(BaseClass _this_, String _value_) {
        ((GovGASTWD) _this_).setK4(_value_);
    }

    private static String k4ToString(BaseClass _this_) {
        return ((GovGASTWD) _this_).k4ToString();
    }

    /**
     * Gain of radiation shield (&lt;i&gt;K5&lt;/i&gt;).
     */
    private Double k5; // PU

    public Double getK5() {
        return k5;
    }

    public void setK5(Double _value_) {
        k5 = _value_;
    }

    public void setK5(String _value_) {
        k5 = getDoubleFromString(_value_);
    }

    public String k5ToString() {
        return k5 != null ? k5.toString() : null;
    }

    private static void setK5(BaseClass _this_, String _value_) {
        ((GovGASTWD) _this_).setK5(_value_);
    }

    private static String k5ToString(BaseClass _this_) {
        return ((GovGASTWD) _this_).k5ToString();
    }

    /**
     * Minimum fuel flow (&lt;i&gt;K6&lt;/i&gt;).
     */
    private Double k6; // PU

    public Double getK6() {
        return k6;
    }

    public void setK6(Double _value_) {
        k6 = _value_;
    }

    public void setK6(String _value_) {
        k6 = getDoubleFromString(_value_);
    }

    public String k6ToString() {
        return k6 != null ? k6.toString() : null;
    }

    private static void setK6(BaseClass _this_, String _value_) {
        ((GovGASTWD) _this_).setK6(_value_);
    }

    private static String k6ToString(BaseClass _this_) {
        return ((GovGASTWD) _this_).k6ToString();
    }

    /**
     * Drop governor gain (&lt;i&gt;Kd&lt;/i&gt;).
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
        ((GovGASTWD) _this_).setKd(_value_);
    }

    private static String kdToString(BaseClass _this_) {
        return ((GovGASTWD) _this_).kdToString();
    }

    /**
     * (&lt;i&gt;Kdroop&lt;/i&gt;) (&amp;gt;= 0).
     */
    private Double kdroop; // PU

    public Double getKdroop() {
        return kdroop;
    }

    public void setKdroop(Double _value_) {
        kdroop = _value_;
    }

    public void setKdroop(String _value_) {
        kdroop = getDoubleFromString(_value_);
    }

    public String kdroopToString() {
        return kdroop != null ? kdroop.toString() : null;
    }

    private static void setKdroop(BaseClass _this_, String _value_) {
        ((GovGASTWD) _this_).setKdroop(_value_);
    }

    private static String kdroopToString(BaseClass _this_) {
        return ((GovGASTWD) _this_).kdroopToString();
    }

    /**
     * Fuel system feedback (&lt;i&gt;Kf&lt;/i&gt;).
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
        ((GovGASTWD) _this_).setKf(_value_);
    }

    private static String kfToString(BaseClass _this_) {
        return ((GovGASTWD) _this_).kfToString();
    }

    /**
     * Isochronous Governor Gain (&lt;i&gt;Ki&lt;/i&gt;).
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
        ((GovGASTWD) _this_).setKi(_value_);
    }

    private static String kiToString(BaseClass _this_) {
        return ((GovGASTWD) _this_).kiToString();
    }

    /**
     * PID proportional gain (&lt;i&gt;Kp&lt;/i&gt;).
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
        ((GovGASTWD) _this_).setKp(_value_);
    }

    private static String kpToString(BaseClass _this_) {
        return ((GovGASTWD) _this_).kpToString();
    }

    /**
     * Base for power values (&lt;i&gt;MWbase&lt;/i&gt;) (&amp;gt; 0).  Unit = MW.
     */
    private Double mwbase; // ActivePower

    public Double getMwbase() {
        return mwbase;
    }

    public void setMwbase(Double _value_) {
        mwbase = _value_;
    }

    public void setMwbase(String _value_) {
        mwbase = getDoubleFromString(_value_);
    }

    public String mwbaseToString() {
        return mwbase != null ? mwbase.toString() : null;
    }

    private static void setMwbase(BaseClass _this_, String _value_) {
        ((GovGASTWD) _this_).setMwbase(_value_);
    }

    private static String mwbaseToString(BaseClass _this_) {
        return ((GovGASTWD) _this_).mwbaseToString();
    }

    /**
     * Fuel control time constant (&lt;i&gt;T&lt;/i&gt;) (&amp;gt;= 0).
     */
    private Double t; // Seconds

    public Double getT() {
        return t;
    }

    public void setT(Double _value_) {
        t = _value_;
    }

    public void setT(String _value_) {
        t = getDoubleFromString(_value_);
    }

    public String tToString() {
        return t != null ? t.toString() : null;
    }

    private static void setT(BaseClass _this_, String _value_) {
        ((GovGASTWD) _this_).setT(_value_);
    }

    private static String tToString(BaseClass _this_) {
        return ((GovGASTWD) _this_).tToString();
    }

    /**
     * Radiation shield time constant (&lt;i&gt;T3&lt;/i&gt;) (&amp;gt;= 0).
     */
    private Double t3; // Seconds

    public Double getT3() {
        return t3;
    }

    public void setT3(Double _value_) {
        t3 = _value_;
    }

    public void setT3(String _value_) {
        t3 = getDoubleFromString(_value_);
    }

    public String t3ToString() {
        return t3 != null ? t3.toString() : null;
    }

    private static void setT3(BaseClass _this_, String _value_) {
        ((GovGASTWD) _this_).setT3(_value_);
    }

    private static String t3ToString(BaseClass _this_) {
        return ((GovGASTWD) _this_).t3ToString();
    }

    /**
     * Thermocouple time constant (&lt;i&gt;T4&lt;/i&gt;) (&amp;gt;= 0).
     */
    private Double t4; // Seconds

    public Double getT4() {
        return t4;
    }

    public void setT4(Double _value_) {
        t4 = _value_;
    }

    public void setT4(String _value_) {
        t4 = getDoubleFromString(_value_);
    }

    public String t4ToString() {
        return t4 != null ? t4.toString() : null;
    }

    private static void setT4(BaseClass _this_, String _value_) {
        ((GovGASTWD) _this_).setT4(_value_);
    }

    private static String t4ToString(BaseClass _this_) {
        return ((GovGASTWD) _this_).t4ToString();
    }

    /**
     * Temperature control time constant (&lt;i&gt;T5&lt;/i&gt;) (&amp;gt;= 0).
     */
    private Double t5; // Seconds

    public Double getT5() {
        return t5;
    }

    public void setT5(Double _value_) {
        t5 = _value_;
    }

    public void setT5(String _value_) {
        t5 = getDoubleFromString(_value_);
    }

    public String t5ToString() {
        return t5 != null ? t5.toString() : null;
    }

    private static void setT5(BaseClass _this_, String _value_) {
        ((GovGASTWD) _this_).setT5(_value_);
    }

    private static String t5ToString(BaseClass _this_) {
        return ((GovGASTWD) _this_).t5ToString();
    }

    /**
     * Temperature control (&lt;i&gt;Tc&lt;/i&gt;).
     */
    private Double tc; // Temperature

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
        ((GovGASTWD) _this_).setTc(_value_);
    }

    private static String tcToString(BaseClass _this_) {
        return ((GovGASTWD) _this_).tcToString();
    }

    /**
     * Compressor discharge time constant (&lt;i&gt;Tcd&lt;/i&gt;) (&amp;gt;= 0).
     */
    private Double tcd; // Seconds

    public Double getTcd() {
        return tcd;
    }

    public void setTcd(Double _value_) {
        tcd = _value_;
    }

    public void setTcd(String _value_) {
        tcd = getDoubleFromString(_value_);
    }

    public String tcdToString() {
        return tcd != null ? tcd.toString() : null;
    }

    private static void setTcd(BaseClass _this_, String _value_) {
        ((GovGASTWD) _this_).setTcd(_value_);
    }

    private static String tcdToString(BaseClass _this_) {
        return ((GovGASTWD) _this_).tcdToString();
    }

    /**
     * Power transducer time constant (&lt;i&gt;Td&lt;/i&gt;) (&amp;gt;= 0).
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
        ((GovGASTWD) _this_).setTd(_value_);
    }

    private static String tdToString(BaseClass _this_) {
        return ((GovGASTWD) _this_).tdToString();
    }

    /**
     * Fuel system time constant (&lt;i&gt;Tf&lt;/i&gt;) (&amp;gt;= 0).
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
        ((GovGASTWD) _this_).setTf(_value_);
    }

    private static String tfToString(BaseClass _this_) {
        return ((GovGASTWD) _this_).tfToString();
    }

    /**
     * Maximum Turbine limit (&lt;i&gt;Tmax&lt;/i&gt;) (&amp;gt; GovGASTWD.tmin).
     */
    private Double tmax; // PU

    public Double getTmax() {
        return tmax;
    }

    public void setTmax(Double _value_) {
        tmax = _value_;
    }

    public void setTmax(String _value_) {
        tmax = getDoubleFromString(_value_);
    }

    public String tmaxToString() {
        return tmax != null ? tmax.toString() : null;
    }

    private static void setTmax(BaseClass _this_, String _value_) {
        ((GovGASTWD) _this_).setTmax(_value_);
    }

    private static String tmaxToString(BaseClass _this_) {
        return ((GovGASTWD) _this_).tmaxToString();
    }

    /**
     * Minimum turbine limit (&lt;i&gt;Tmin&lt;/i&gt;) (&amp;lt; GovGASTWD.tmax).
     */
    private Double tmin; // PU

    public Double getTmin() {
        return tmin;
    }

    public void setTmin(Double _value_) {
        tmin = _value_;
    }

    public void setTmin(String _value_) {
        tmin = getDoubleFromString(_value_);
    }

    public String tminToString() {
        return tmin != null ? tmin.toString() : null;
    }

    private static void setTmin(BaseClass _this_, String _value_) {
        ((GovGASTWD) _this_).setTmin(_value_);
    }

    private static String tminToString(BaseClass _this_) {
        return ((GovGASTWD) _this_).tminToString();
    }

    /**
     * Rated temperature (&lt;i&gt;Tr&lt;/i&gt;).
     */
    private Double tr; // Temperature

    public Double getTr() {
        return tr;
    }

    public void setTr(Double _value_) {
        tr = _value_;
    }

    public void setTr(String _value_) {
        tr = getDoubleFromString(_value_);
    }

    public String trToString() {
        return tr != null ? tr.toString() : null;
    }

    private static void setTr(BaseClass _this_, String _value_) {
        ((GovGASTWD) _this_).setTr(_value_);
    }

    private static String trToString(BaseClass _this_) {
        return ((GovGASTWD) _this_).trToString();
    }

    /**
     * Turbine rating (&lt;i&gt;Trate&lt;/i&gt;).  Unit = MW.
     */
    private Double trate; // ActivePower

    public Double getTrate() {
        return trate;
    }

    public void setTrate(Double _value_) {
        trate = _value_;
    }

    public void setTrate(String _value_) {
        trate = getDoubleFromString(_value_);
    }

    public String trateToString() {
        return trate != null ? trate.toString() : null;
    }

    private static void setTrate(BaseClass _this_, String _value_) {
        ((GovGASTWD) _this_).setTrate(_value_);
    }

    private static String trateToString(BaseClass _this_) {
        return ((GovGASTWD) _this_).trateToString();
    }

    /**
     * Temperature controller integration rate (&lt;i&gt;Tt&lt;/i&gt;) (&amp;gt;= 0).
     */
    private Double tt; // Seconds

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
        ((GovGASTWD) _this_).setTt(_value_);
    }

    private static String ttToString(BaseClass _this_) {
        return ((GovGASTWD) _this_).ttToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "GovGASTWD", attrName));
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
                "GovGASTWD", attrName, objectValue));
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
                "GovGASTWD", attrName, stringValue));
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
            map.put("a", new AttrDetails("GovGASTWD.a", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGASTWD::aToString, null, GovGASTWD::setA));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("af1", new AttrDetails("GovGASTWD.af1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGASTWD::af1ToString, null, GovGASTWD::setAf1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("af2", new AttrDetails("GovGASTWD.af2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGASTWD::af2ToString, null, GovGASTWD::setAf2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("b", new AttrDetails("GovGASTWD.b", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGASTWD::bToString, null, GovGASTWD::setB));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("bf1", new AttrDetails("GovGASTWD.bf1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGASTWD::bf1ToString, null, GovGASTWD::setBf1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("bf2", new AttrDetails("GovGASTWD.bf2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGASTWD::bf2ToString, null, GovGASTWD::setBf2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("c", new AttrDetails("GovGASTWD.c", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGASTWD::cToString, null, GovGASTWD::setC));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("cf2", new AttrDetails("GovGASTWD.cf2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGASTWD::cf2ToString, null, GovGASTWD::setCf2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ecr", new AttrDetails("GovGASTWD.ecr", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGASTWD::ecrToString, null, GovGASTWD::setEcr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("etd", new AttrDetails("GovGASTWD.etd", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGASTWD::etdToString, null, GovGASTWD::setEtd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k3", new AttrDetails("GovGASTWD.k3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGASTWD::k3ToString, null, GovGASTWD::setK3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k4", new AttrDetails("GovGASTWD.k4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGASTWD::k4ToString, null, GovGASTWD::setK4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k5", new AttrDetails("GovGASTWD.k5", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGASTWD::k5ToString, null, GovGASTWD::setK5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k6", new AttrDetails("GovGASTWD.k6", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGASTWD::k6ToString, null, GovGASTWD::setK6));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kd", new AttrDetails("GovGASTWD.kd", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGASTWD::kdToString, null, GovGASTWD::setKd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kdroop", new AttrDetails("GovGASTWD.kdroop", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGASTWD::kdroopToString, null, GovGASTWD::setKdroop));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kf", new AttrDetails("GovGASTWD.kf", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGASTWD::kfToString, null, GovGASTWD::setKf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ki", new AttrDetails("GovGASTWD.ki", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGASTWD::kiToString, null, GovGASTWD::setKi));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kp", new AttrDetails("GovGASTWD.kp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGASTWD::kpToString, null, GovGASTWD::setKp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mwbase", new AttrDetails("GovGASTWD.mwbase", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGASTWD::mwbaseToString, null, GovGASTWD::setMwbase));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t", new AttrDetails("GovGASTWD.t", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGASTWD::tToString, null, GovGASTWD::setT));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t3", new AttrDetails("GovGASTWD.t3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGASTWD::t3ToString, null, GovGASTWD::setT3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t4", new AttrDetails("GovGASTWD.t4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGASTWD::t4ToString, null, GovGASTWD::setT4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t5", new AttrDetails("GovGASTWD.t5", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGASTWD::t5ToString, null, GovGASTWD::setT5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tc", new AttrDetails("GovGASTWD.tc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGASTWD::tcToString, null, GovGASTWD::setTc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tcd", new AttrDetails("GovGASTWD.tcd", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGASTWD::tcdToString, null, GovGASTWD::setTcd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("td", new AttrDetails("GovGASTWD.td", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGASTWD::tdToString, null, GovGASTWD::setTd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf", new AttrDetails("GovGASTWD.tf", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGASTWD::tfToString, null, GovGASTWD::setTf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tmax", new AttrDetails("GovGASTWD.tmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGASTWD::tmaxToString, null, GovGASTWD::setTmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tmin", new AttrDetails("GovGASTWD.tmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGASTWD::tminToString, null, GovGASTWD::setTmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tr", new AttrDetails("GovGASTWD.tr", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGASTWD::trToString, null, GovGASTWD::setTr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("trate", new AttrDetails("GovGASTWD.trate", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGASTWD::trateToString, null, GovGASTWD::setTrate));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tt", new AttrDetails("GovGASTWD.tt", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovGASTWD::ttToString, null, GovGASTWD::setTt));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new GovGASTWD().allAttrDetailsMap());
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
