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
 * Simplified GovSteamIEEE1 steam turbine governor with Prmax limit and fast valving.
 */
@SuppressWarnings("unused")
public class GovSteamFV3 extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovSteamFV3.class);

    /**
     * Constructor.
     */
    public GovSteamFV3(String rdfid) {
        super("GovSteamFV3", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected GovSteamFV3(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Nonlinear gain valve position point 1 (&lt;i&gt;GV1&lt;/i&gt;).  Typical value = 0.
     */
    private Double gv1; // PU

    public Double getGv1() {
        return gv1;
    }

    public void setGv1(Double _value_) {
        gv1 = _value_;
    }

    public void setGv1(String _value_) {
        gv1 = getDoubleFromString(_value_);
    }

    public String gv1ToString() {
        return gv1 != null ? gv1.toString() : null;
    }

    private static void setGv1(BaseClass _this_, String _value_) {
        ((GovSteamFV3) _this_).setGv1(_value_);
    }

    private static String gv1ToString(BaseClass _this_) {
        return ((GovSteamFV3) _this_).gv1ToString();
    }

    /**
     * Nonlinear gain valve position point 2 (&lt;i&gt;GV2&lt;/i&gt;).  Typical value = 0,4.
     */
    private Double gv2; // PU

    public Double getGv2() {
        return gv2;
    }

    public void setGv2(Double _value_) {
        gv2 = _value_;
    }

    public void setGv2(String _value_) {
        gv2 = getDoubleFromString(_value_);
    }

    public String gv2ToString() {
        return gv2 != null ? gv2.toString() : null;
    }

    private static void setGv2(BaseClass _this_, String _value_) {
        ((GovSteamFV3) _this_).setGv2(_value_);
    }

    private static String gv2ToString(BaseClass _this_) {
        return ((GovSteamFV3) _this_).gv2ToString();
    }

    /**
     * Nonlinear gain valve position point 3 (&lt;i&gt;GV3&lt;/i&gt;).  Typical value = 0,5.
     */
    private Double gv3; // PU

    public Double getGv3() {
        return gv3;
    }

    public void setGv3(Double _value_) {
        gv3 = _value_;
    }

    public void setGv3(String _value_) {
        gv3 = getDoubleFromString(_value_);
    }

    public String gv3ToString() {
        return gv3 != null ? gv3.toString() : null;
    }

    private static void setGv3(BaseClass _this_, String _value_) {
        ((GovSteamFV3) _this_).setGv3(_value_);
    }

    private static String gv3ToString(BaseClass _this_) {
        return ((GovSteamFV3) _this_).gv3ToString();
    }

    /**
     * Nonlinear gain valve position point 4 (&lt;i&gt;GV4&lt;/i&gt;).  Typical value = 0,6.
     */
    private Double gv4; // PU

    public Double getGv4() {
        return gv4;
    }

    public void setGv4(Double _value_) {
        gv4 = _value_;
    }

    public void setGv4(String _value_) {
        gv4 = getDoubleFromString(_value_);
    }

    public String gv4ToString() {
        return gv4 != null ? gv4.toString() : null;
    }

    private static void setGv4(BaseClass _this_, String _value_) {
        ((GovSteamFV3) _this_).setGv4(_value_);
    }

    private static String gv4ToString(BaseClass _this_) {
        return ((GovSteamFV3) _this_).gv4ToString();
    }

    /**
     * Nonlinear gain valve position point 5 (&lt;i&gt;GV5&lt;/i&gt;).  Typical value = 1.
     */
    private Double gv5; // PU

    public Double getGv5() {
        return gv5;
    }

    public void setGv5(Double _value_) {
        gv5 = _value_;
    }

    public void setGv5(String _value_) {
        gv5 = getDoubleFromString(_value_);
    }

    public String gv5ToString() {
        return gv5 != null ? gv5.toString() : null;
    }

    private static void setGv5(BaseClass _this_, String _value_) {
        ((GovSteamFV3) _this_).setGv5(_value_);
    }

    private static String gv5ToString(BaseClass _this_) {
        return ((GovSteamFV3) _this_).gv5ToString();
    }

    /**
     * Nonlinear gain valve position point 6 (&lt;i&gt;GV6&lt;/i&gt;).  Typical value = 0.
     */
    private Double gv6; // PU

    public Double getGv6() {
        return gv6;
    }

    public void setGv6(Double _value_) {
        gv6 = _value_;
    }

    public void setGv6(String _value_) {
        gv6 = getDoubleFromString(_value_);
    }

    public String gv6ToString() {
        return gv6 != null ? gv6.toString() : null;
    }

    private static void setGv6(BaseClass _this_, String _value_) {
        ((GovSteamFV3) _this_).setGv6(_value_);
    }

    private static String gv6ToString(BaseClass _this_) {
        return ((GovSteamFV3) _this_).gv6ToString();
    }

    /**
     * Governor gain, (reciprocal of droop) (&lt;i&gt;K&lt;/i&gt;).  Typical value = 20.
     */
    private Double k; // PU

    public Double getK() {
        return k;
    }

    public void setK(Double _value_) {
        k = _value_;
    }

    public void setK(String _value_) {
        k = getDoubleFromString(_value_);
    }

    public String kToString() {
        return k != null ? k.toString() : null;
    }

    private static void setK(BaseClass _this_, String _value_) {
        ((GovSteamFV3) _this_).setK(_value_);
    }

    private static String kToString(BaseClass _this_) {
        return ((GovSteamFV3) _this_).kToString();
    }

    /**
     * Fraction of turbine power developed after first boiler pass (&lt;i&gt;K1&lt;/i&gt;).  Typical value = 0,2.
     */
    private Double k1; // PU

    public Double getK1() {
        return k1;
    }

    public void setK1(Double _value_) {
        k1 = _value_;
    }

    public void setK1(String _value_) {
        k1 = getDoubleFromString(_value_);
    }

    public String k1ToString() {
        return k1 != null ? k1.toString() : null;
    }

    private static void setK1(BaseClass _this_, String _value_) {
        ((GovSteamFV3) _this_).setK1(_value_);
    }

    private static String k1ToString(BaseClass _this_) {
        return ((GovSteamFV3) _this_).k1ToString();
    }

    /**
     * Fraction of turbine power developed after second boiler pass (&lt;i&gt;K2&lt;/i&gt;).  Typical value = 0,2.
     */
    private Double k2; // PU

    public Double getK2() {
        return k2;
    }

    public void setK2(Double _value_) {
        k2 = _value_;
    }

    public void setK2(String _value_) {
        k2 = getDoubleFromString(_value_);
    }

    public String k2ToString() {
        return k2 != null ? k2.toString() : null;
    }

    private static void setK2(BaseClass _this_, String _value_) {
        ((GovSteamFV3) _this_).setK2(_value_);
    }

    private static String k2ToString(BaseClass _this_) {
        return ((GovSteamFV3) _this_).k2ToString();
    }

    /**
     * Fraction of hp turbine power developed after crossover or third boiler pass (&lt;i&gt;K3&lt;/i&gt;). Typical value = 0,6.
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
        ((GovSteamFV3) _this_).setK3(_value_);
    }

    private static String k3ToString(BaseClass _this_) {
        return ((GovSteamFV3) _this_).k3ToString();
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
        ((GovSteamFV3) _this_).setMwbase(_value_);
    }

    private static String mwbaseToString(BaseClass _this_) {
        return ((GovSteamFV3) _this_).mwbaseToString();
    }

    /**
     * Nonlinear gain power value point 1 (&lt;i&gt;Pgv1&lt;/i&gt;).  Typical value = 0.
     */
    private Double pgv1; // PU

    public Double getPgv1() {
        return pgv1;
    }

    public void setPgv1(Double _value_) {
        pgv1 = _value_;
    }

    public void setPgv1(String _value_) {
        pgv1 = getDoubleFromString(_value_);
    }

    public String pgv1ToString() {
        return pgv1 != null ? pgv1.toString() : null;
    }

    private static void setPgv1(BaseClass _this_, String _value_) {
        ((GovSteamFV3) _this_).setPgv1(_value_);
    }

    private static String pgv1ToString(BaseClass _this_) {
        return ((GovSteamFV3) _this_).pgv1ToString();
    }

    /**
     * Nonlinear gain power value point 2 (&lt;i&gt;Pgv2&lt;/i&gt;).  Typical value = 0,75.
     */
    private Double pgv2; // PU

    public Double getPgv2() {
        return pgv2;
    }

    public void setPgv2(Double _value_) {
        pgv2 = _value_;
    }

    public void setPgv2(String _value_) {
        pgv2 = getDoubleFromString(_value_);
    }

    public String pgv2ToString() {
        return pgv2 != null ? pgv2.toString() : null;
    }

    private static void setPgv2(BaseClass _this_, String _value_) {
        ((GovSteamFV3) _this_).setPgv2(_value_);
    }

    private static String pgv2ToString(BaseClass _this_) {
        return ((GovSteamFV3) _this_).pgv2ToString();
    }

    /**
     * Nonlinear gain power value point 3 (&lt;i&gt;Pgv3&lt;/i&gt;).  Typical value = 0,91.
     */
    private Double pgv3; // PU

    public Double getPgv3() {
        return pgv3;
    }

    public void setPgv3(Double _value_) {
        pgv3 = _value_;
    }

    public void setPgv3(String _value_) {
        pgv3 = getDoubleFromString(_value_);
    }

    public String pgv3ToString() {
        return pgv3 != null ? pgv3.toString() : null;
    }

    private static void setPgv3(BaseClass _this_, String _value_) {
        ((GovSteamFV3) _this_).setPgv3(_value_);
    }

    private static String pgv3ToString(BaseClass _this_) {
        return ((GovSteamFV3) _this_).pgv3ToString();
    }

    /**
     * Nonlinear gain power value point 4 (&lt;i&gt;Pgv4&lt;/i&gt;).  Typical value = 0,98.
     */
    private Double pgv4; // PU

    public Double getPgv4() {
        return pgv4;
    }

    public void setPgv4(Double _value_) {
        pgv4 = _value_;
    }

    public void setPgv4(String _value_) {
        pgv4 = getDoubleFromString(_value_);
    }

    public String pgv4ToString() {
        return pgv4 != null ? pgv4.toString() : null;
    }

    private static void setPgv4(BaseClass _this_, String _value_) {
        ((GovSteamFV3) _this_).setPgv4(_value_);
    }

    private static String pgv4ToString(BaseClass _this_) {
        return ((GovSteamFV3) _this_).pgv4ToString();
    }

    /**
     * Nonlinear gain power value point 5 (&lt;i&gt;Pgv5&lt;/i&gt;).  Typical value = 1.
     */
    private Double pgv5; // PU

    public Double getPgv5() {
        return pgv5;
    }

    public void setPgv5(Double _value_) {
        pgv5 = _value_;
    }

    public void setPgv5(String _value_) {
        pgv5 = getDoubleFromString(_value_);
    }

    public String pgv5ToString() {
        return pgv5 != null ? pgv5.toString() : null;
    }

    private static void setPgv5(BaseClass _this_, String _value_) {
        ((GovSteamFV3) _this_).setPgv5(_value_);
    }

    private static String pgv5ToString(BaseClass _this_) {
        return ((GovSteamFV3) _this_).pgv5ToString();
    }

    /**
     * Nonlinear gain power value point 6 (&lt;i&gt;Pgv6&lt;/i&gt;).  Typical value = 0.
     */
    private Double pgv6; // PU

    public Double getPgv6() {
        return pgv6;
    }

    public void setPgv6(Double _value_) {
        pgv6 = _value_;
    }

    public void setPgv6(String _value_) {
        pgv6 = getDoubleFromString(_value_);
    }

    public String pgv6ToString() {
        return pgv6 != null ? pgv6.toString() : null;
    }

    private static void setPgv6(BaseClass _this_, String _value_) {
        ((GovSteamFV3) _this_).setPgv6(_value_);
    }

    private static String pgv6ToString(BaseClass _this_) {
        return ((GovSteamFV3) _this_).pgv6ToString();
    }

    /**
     * Maximum valve opening, PU of &lt;i&gt;MWbase&lt;/i&gt; (&lt;i&gt;Pmax&lt;/i&gt;) (&amp;gt; GovSteamFV3.pmin).  Typical value = 1.
     */
    private Double pmax; // PU

    public Double getPmax() {
        return pmax;
    }

    public void setPmax(Double _value_) {
        pmax = _value_;
    }

    public void setPmax(String _value_) {
        pmax = getDoubleFromString(_value_);
    }

    public String pmaxToString() {
        return pmax != null ? pmax.toString() : null;
    }

    private static void setPmax(BaseClass _this_, String _value_) {
        ((GovSteamFV3) _this_).setPmax(_value_);
    }

    private static String pmaxToString(BaseClass _this_) {
        return ((GovSteamFV3) _this_).pmaxToString();
    }

    /**
     * Minimum valve opening, PU of &lt;i&gt;MWbase&lt;/i&gt; (&lt;i&gt;Pmin&lt;/i&gt;) (&amp;lt; GovSteamFV3.pmax).  Typical value = 0.
     */
    private Double pmin; // PU

    public Double getPmin() {
        return pmin;
    }

    public void setPmin(Double _value_) {
        pmin = _value_;
    }

    public void setPmin(String _value_) {
        pmin = getDoubleFromString(_value_);
    }

    public String pminToString() {
        return pmin != null ? pmin.toString() : null;
    }

    private static void setPmin(BaseClass _this_, String _value_) {
        ((GovSteamFV3) _this_).setPmin(_value_);
    }

    private static String pminToString(BaseClass _this_) {
        return ((GovSteamFV3) _this_).pminToString();
    }

    /**
     * Max. pressure in reheater (&lt;i&gt;Prmax&lt;/i&gt;).  Typical value = 1.
     */
    private Double prmax; // PU

    public Double getPrmax() {
        return prmax;
    }

    public void setPrmax(Double _value_) {
        prmax = _value_;
    }

    public void setPrmax(String _value_) {
        prmax = getDoubleFromString(_value_);
    }

    public String prmaxToString() {
        return prmax != null ? prmax.toString() : null;
    }

    private static void setPrmax(BaseClass _this_, String _value_) {
        ((GovSteamFV3) _this_).setPrmax(_value_);
    }

    private static String prmaxToString(BaseClass _this_) {
        return ((GovSteamFV3) _this_).prmaxToString();
    }

    /**
     * Governor lead time constant (&lt;i&gt;T1&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
     */
    private Double t1; // Seconds

    public Double getT1() {
        return t1;
    }

    public void setT1(Double _value_) {
        t1 = _value_;
    }

    public void setT1(String _value_) {
        t1 = getDoubleFromString(_value_);
    }

    public String t1ToString() {
        return t1 != null ? t1.toString() : null;
    }

    private static void setT1(BaseClass _this_, String _value_) {
        ((GovSteamFV3) _this_).setT1(_value_);
    }

    private static String t1ToString(BaseClass _this_) {
        return ((GovSteamFV3) _this_).t1ToString();
    }

    /**
     * Governor lag time constant (&lt;i&gt;T2&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
     */
    private Double t2; // Seconds

    public Double getT2() {
        return t2;
    }

    public void setT2(Double _value_) {
        t2 = _value_;
    }

    public void setT2(String _value_) {
        t2 = getDoubleFromString(_value_);
    }

    public String t2ToString() {
        return t2 != null ? t2.toString() : null;
    }

    private static void setT2(BaseClass _this_, String _value_) {
        ((GovSteamFV3) _this_).setT2(_value_);
    }

    private static String t2ToString(BaseClass _this_) {
        return ((GovSteamFV3) _this_).t2ToString();
    }

    /**
     * Valve positioner time constant (&lt;i&gt;T3&lt;/i&gt;) (&amp;gt; 0).  Typical value = 0.
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
        ((GovSteamFV3) _this_).setT3(_value_);
    }

    private static String t3ToString(BaseClass _this_) {
        return ((GovSteamFV3) _this_).t3ToString();
    }

    /**
     * Inlet piping/steam bowl time constant (&lt;i&gt;T4&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,2.
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
        ((GovSteamFV3) _this_).setT4(_value_);
    }

    private static String t4ToString(BaseClass _this_) {
        return ((GovSteamFV3) _this_).t4ToString();
    }

    /**
     * Time constant of second boiler pass (i.e. reheater) (&lt;i&gt;T5&lt;/i&gt;) (&amp;gt; 0 if fast valving is used, otherwise &amp;gt;= 0).  Typical value = 0,5.
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
        ((GovSteamFV3) _this_).setT5(_value_);
    }

    private static String t5ToString(BaseClass _this_) {
        return ((GovSteamFV3) _this_).t5ToString();
    }

    /**
     * Time constant of crossover or third boiler pass (&lt;i&gt;T6&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 10.
     */
    private Double t6; // Seconds

    public Double getT6() {
        return t6;
    }

    public void setT6(Double _value_) {
        t6 = _value_;
    }

    public void setT6(String _value_) {
        t6 = getDoubleFromString(_value_);
    }

    public String t6ToString() {
        return t6 != null ? t6.toString() : null;
    }

    private static void setT6(BaseClass _this_, String _value_) {
        ((GovSteamFV3) _this_).setT6(_value_);
    }

    private static String t6ToString(BaseClass _this_) {
        return ((GovSteamFV3) _this_).t6ToString();
    }

    /**
     * Time to close intercept valve (IV) (&lt;i&gt;Ta&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,97.
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
        ((GovSteamFV3) _this_).setTa(_value_);
    }

    private static String taToString(BaseClass _this_) {
        return ((GovSteamFV3) _this_).taToString();
    }

    /**
     * Time until IV starts to reopen (&lt;i&gt;Tb&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,98.
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
        ((GovSteamFV3) _this_).setTb(_value_);
    }

    private static String tbToString(BaseClass _this_) {
        return ((GovSteamFV3) _this_).tbToString();
    }

    /**
     * Time until IV is fully open (&lt;i&gt;Tc&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,99.
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
        ((GovSteamFV3) _this_).setTc(_value_);
    }

    private static String tcToString(BaseClass _this_) {
        return ((GovSteamFV3) _this_).tcToString();
    }

    /**
     * Maximum valve closing velocity (&lt;i&gt;Uc&lt;/i&gt;).  Unit = PU / s.  Typical value = -1.
     */
    private Float uc; // Float

    public Float getUc() {
        return uc;
    }

    public void setUc(Float _value_) {
        uc = _value_;
    }

    public void setUc(String _value_) {
        uc = getFloatFromString(_value_);
    }

    public String ucToString() {
        return uc != null ? uc.toString() : null;
    }

    private static void setUc(BaseClass _this_, String _value_) {
        ((GovSteamFV3) _this_).setUc(_value_);
    }

    private static String ucToString(BaseClass _this_) {
        return ((GovSteamFV3) _this_).ucToString();
    }

    /**
     * Maximum valve opening velocity (&lt;i&gt;Uo&lt;/i&gt;).  Unit = PU / s.  Typical value = 0,1.
     */
    private Float uo; // Float

    public Float getUo() {
        return uo;
    }

    public void setUo(Float _value_) {
        uo = _value_;
    }

    public void setUo(String _value_) {
        uo = getFloatFromString(_value_);
    }

    public String uoToString() {
        return uo != null ? uo.toString() : null;
    }

    private static void setUo(BaseClass _this_, String _value_) {
        ((GovSteamFV3) _this_).setUo(_value_);
    }

    private static String uoToString(BaseClass _this_) {
        return ((GovSteamFV3) _this_).uoToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "GovSteamFV3", attrName));
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
                "GovSteamFV3", attrName, objectValue));
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
                "GovSteamFV3", attrName, stringValue));
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
            map.put("gv1", new AttrDetails("GovSteamFV3.gv1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::gv1ToString, null, GovSteamFV3::setGv1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv2", new AttrDetails("GovSteamFV3.gv2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::gv2ToString, null, GovSteamFV3::setGv2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv3", new AttrDetails("GovSteamFV3.gv3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::gv3ToString, null, GovSteamFV3::setGv3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv4", new AttrDetails("GovSteamFV3.gv4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::gv4ToString, null, GovSteamFV3::setGv4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv5", new AttrDetails("GovSteamFV3.gv5", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::gv5ToString, null, GovSteamFV3::setGv5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv6", new AttrDetails("GovSteamFV3.gv6", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::gv6ToString, null, GovSteamFV3::setGv6));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k", new AttrDetails("GovSteamFV3.k", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::kToString, null, GovSteamFV3::setK));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k1", new AttrDetails("GovSteamFV3.k1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::k1ToString, null, GovSteamFV3::setK1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k2", new AttrDetails("GovSteamFV3.k2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::k2ToString, null, GovSteamFV3::setK2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k3", new AttrDetails("GovSteamFV3.k3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::k3ToString, null, GovSteamFV3::setK3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mwbase", new AttrDetails("GovSteamFV3.mwbase", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::mwbaseToString, null, GovSteamFV3::setMwbase));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv1", new AttrDetails("GovSteamFV3.pgv1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::pgv1ToString, null, GovSteamFV3::setPgv1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv2", new AttrDetails("GovSteamFV3.pgv2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::pgv2ToString, null, GovSteamFV3::setPgv2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv3", new AttrDetails("GovSteamFV3.pgv3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::pgv3ToString, null, GovSteamFV3::setPgv3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv4", new AttrDetails("GovSteamFV3.pgv4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::pgv4ToString, null, GovSteamFV3::setPgv4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv5", new AttrDetails("GovSteamFV3.pgv5", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::pgv5ToString, null, GovSteamFV3::setPgv5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv6", new AttrDetails("GovSteamFV3.pgv6", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::pgv6ToString, null, GovSteamFV3::setPgv6));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmax", new AttrDetails("GovSteamFV3.pmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::pmaxToString, null, GovSteamFV3::setPmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmin", new AttrDetails("GovSteamFV3.pmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::pminToString, null, GovSteamFV3::setPmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("prmax", new AttrDetails("GovSteamFV3.prmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::prmaxToString, null, GovSteamFV3::setPrmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t1", new AttrDetails("GovSteamFV3.t1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::t1ToString, null, GovSteamFV3::setT1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t2", new AttrDetails("GovSteamFV3.t2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::t2ToString, null, GovSteamFV3::setT2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t3", new AttrDetails("GovSteamFV3.t3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::t3ToString, null, GovSteamFV3::setT3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t4", new AttrDetails("GovSteamFV3.t4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::t4ToString, null, GovSteamFV3::setT4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t5", new AttrDetails("GovSteamFV3.t5", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::t5ToString, null, GovSteamFV3::setT5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t6", new AttrDetails("GovSteamFV3.t6", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::t6ToString, null, GovSteamFV3::setT6));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ta", new AttrDetails("GovSteamFV3.ta", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::taToString, null, GovSteamFV3::setTa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tb", new AttrDetails("GovSteamFV3.tb", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::tbToString, null, GovSteamFV3::setTb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tc", new AttrDetails("GovSteamFV3.tc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::tcToString, null, GovSteamFV3::setTc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("uc", new AttrDetails("GovSteamFV3.uc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::ucToString, null, GovSteamFV3::setUc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("uo", new AttrDetails("GovSteamFV3.uo", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovSteamFV3::uoToString, null, GovSteamFV3::setUo));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new GovSteamFV3(null).allAttrDetailsMap());
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
