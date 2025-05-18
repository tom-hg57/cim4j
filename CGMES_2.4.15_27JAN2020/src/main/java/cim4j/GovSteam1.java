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
 * Steam turbine governor model, based on the GovSteamIEEE1 model  (with optional deadband and nonlinear valve gain added).
 */
@SuppressWarnings("unused")
public class GovSteam1 extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovSteam1.class);

    /**
     * Constructor.
     */
    public GovSteam1(String rdfid) {
        super("GovSteam1", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected GovSteam1(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Intentional deadband width (db1).  Unit = Hz.  Typical Value = 0.
     */
    private Double db1; // Frequency

    public Double getDb1() {
        return db1;
    }

    public void setDb1(Double _value_) {
        db1 = _value_;
    }

    public void setDb1(String _value_) {
        db1 = getDoubleFromString(_value_);
    }

    public String db1ToString() {
        return db1 != null ? db1.toString() : null;
    }

    private static void setDb1(BaseClass _this_, String _value_) {
        ((GovSteam1) _this_).setDb1(_value_);
    }

    private static String db1ToString(BaseClass _this_) {
        return ((GovSteam1) _this_).db1ToString();
    }

    /**
     * Unintentional deadband (db2).  Unit = MW.  Typical Value = 0.
     */
    private Double db2; // ActivePower

    public Double getDb2() {
        return db2;
    }

    public void setDb2(Double _value_) {
        db2 = _value_;
    }

    public void setDb2(String _value_) {
        db2 = getDoubleFromString(_value_);
    }

    public String db2ToString() {
        return db2 != null ? db2.toString() : null;
    }

    private static void setDb2(BaseClass _this_, String _value_) {
        ((GovSteam1) _this_).setDb2(_value_);
    }

    private static String db2ToString(BaseClass _this_) {
        return ((GovSteam1) _this_).db2ToString();
    }

    /**
     * Intentional db hysteresis (eps).  Unit = Hz.  Typical Value = 0.
     */
    private Double eps; // Frequency

    public Double getEps() {
        return eps;
    }

    public void setEps(Double _value_) {
        eps = _value_;
    }

    public void setEps(String _value_) {
        eps = getDoubleFromString(_value_);
    }

    public String epsToString() {
        return eps != null ? eps.toString() : null;
    }

    private static void setEps(BaseClass _this_, String _value_) {
        ((GovSteam1) _this_).setEps(_value_);
    }

    private static String epsToString(BaseClass _this_) {
        return ((GovSteam1) _this_).epsToString();
    }

    /**
     * Nonlinear gain valve position point 1 (GV1).  Typical Value = 0.
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
        ((GovSteam1) _this_).setGv1(_value_);
    }

    private static String gv1ToString(BaseClass _this_) {
        return ((GovSteam1) _this_).gv1ToString();
    }

    /**
     * Nonlinear gain valve position point 2 (GV2).  Typical Value = 0.4.
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
        ((GovSteam1) _this_).setGv2(_value_);
    }

    private static String gv2ToString(BaseClass _this_) {
        return ((GovSteam1) _this_).gv2ToString();
    }

    /**
     * Nonlinear gain valve position point 3 (GV3).  Typical Value = 0.5.
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
        ((GovSteam1) _this_).setGv3(_value_);
    }

    private static String gv3ToString(BaseClass _this_) {
        return ((GovSteam1) _this_).gv3ToString();
    }

    /**
     * Nonlinear gain valve position point 4 (GV4).  Typical Value = 0.6.
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
        ((GovSteam1) _this_).setGv4(_value_);
    }

    private static String gv4ToString(BaseClass _this_) {
        return ((GovSteam1) _this_).gv4ToString();
    }

    /**
     * Nonlinear gain valve position point 5 (GV5).  Typical Value = 1.
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
        ((GovSteam1) _this_).setGv5(_value_);
    }

    private static String gv5ToString(BaseClass _this_) {
        return ((GovSteam1) _this_).gv5ToString();
    }

    /**
     * Nonlinear gain valve position point 6 (GV6).  Typical Value = 0.
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
        ((GovSteam1) _this_).setGv6(_value_);
    }

    private static String gv6ToString(BaseClass _this_) {
        return ((GovSteam1) _this_).gv6ToString();
    }

    /**
     * Governor gain (reciprocal of droop) (K) (&gt;0).  Typical Value = 25.
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
        ((GovSteam1) _this_).setK(_value_);
    }

    private static String kToString(BaseClass _this_) {
        return ((GovSteam1) _this_).kToString();
    }

    /**
     * Fraction of HP shaft power after first boiler pass (K1).  Typical Value = 0.2.
     */
    private Double k1; // Simple_Float

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
        ((GovSteam1) _this_).setK1(_value_);
    }

    private static String k1ToString(BaseClass _this_) {
        return ((GovSteam1) _this_).k1ToString();
    }

    /**
     * Fraction of LP shaft power after first boiler pass (K2).  Typical Value = 0.
     */
    private Double k2; // Simple_Float

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
        ((GovSteam1) _this_).setK2(_value_);
    }

    private static String k2ToString(BaseClass _this_) {
        return ((GovSteam1) _this_).k2ToString();
    }

    /**
     * Fraction of HP shaft power after second boiler pass (K3).  Typical Value = 0.3.
     */
    private Double k3; // Simple_Float

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
        ((GovSteam1) _this_).setK3(_value_);
    }

    private static String k3ToString(BaseClass _this_) {
        return ((GovSteam1) _this_).k3ToString();
    }

    /**
     * Fraction of LP shaft power after second boiler pass (K4).  Typical Value = 0.
     */
    private Double k4; // Simple_Float

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
        ((GovSteam1) _this_).setK4(_value_);
    }

    private static String k4ToString(BaseClass _this_) {
        return ((GovSteam1) _this_).k4ToString();
    }

    /**
     * Fraction of HP shaft power after third boiler pass (K5).  Typical Value = 0.5.
     */
    private Double k5; // Simple_Float

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
        ((GovSteam1) _this_).setK5(_value_);
    }

    private static String k5ToString(BaseClass _this_) {
        return ((GovSteam1) _this_).k5ToString();
    }

    /**
     * Fraction of LP shaft power after third boiler pass (K6).  Typical Value = 0.
     */
    private Double k6; // Simple_Float

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
        ((GovSteam1) _this_).setK6(_value_);
    }

    private static String k6ToString(BaseClass _this_) {
        return ((GovSteam1) _this_).k6ToString();
    }

    /**
     * Fraction of HP shaft power after fourth boiler pass (K7).  Typical Value = 0.
     */
    private Double k7; // Simple_Float

    public Double getK7() {
        return k7;
    }

    public void setK7(Double _value_) {
        k7 = _value_;
    }

    public void setK7(String _value_) {
        k7 = getDoubleFromString(_value_);
    }

    public String k7ToString() {
        return k7 != null ? k7.toString() : null;
    }

    private static void setK7(BaseClass _this_, String _value_) {
        ((GovSteam1) _this_).setK7(_value_);
    }

    private static String k7ToString(BaseClass _this_) {
        return ((GovSteam1) _this_).k7ToString();
    }

    /**
     * Fraction of LP shaft power after fourth boiler pass (K8).  Typical Value = 0.
     */
    private Double k8; // Simple_Float

    public Double getK8() {
        return k8;
    }

    public void setK8(Double _value_) {
        k8 = _value_;
    }

    public void setK8(String _value_) {
        k8 = getDoubleFromString(_value_);
    }

    public String k8ToString() {
        return k8 != null ? k8.toString() : null;
    }

    private static void setK8(BaseClass _this_, String _value_) {
        ((GovSteam1) _this_).setK8(_value_);
    }

    private static String k8ToString(BaseClass _this_) {
        return ((GovSteam1) _this_).k8ToString();
    }

    /**
     * Base for power values (MWbase) (&gt;0).  Unit = MW.
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
        ((GovSteam1) _this_).setMwbase(_value_);
    }

    private static String mwbaseToString(BaseClass _this_) {
        return ((GovSteam1) _this_).mwbaseToString();
    }

    /**
     * Nonlinear gain power value point 1 (Pgv1).  Typical Value = 0.
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
        ((GovSteam1) _this_).setPgv1(_value_);
    }

    private static String pgv1ToString(BaseClass _this_) {
        return ((GovSteam1) _this_).pgv1ToString();
    }

    /**
     * Nonlinear gain power value point 2 (Pgv2).  Typical Value = 0.75.
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
        ((GovSteam1) _this_).setPgv2(_value_);
    }

    private static String pgv2ToString(BaseClass _this_) {
        return ((GovSteam1) _this_).pgv2ToString();
    }

    /**
     * Nonlinear gain power value point 3 (Pgv3).  Typical Value = 0.91.
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
        ((GovSteam1) _this_).setPgv3(_value_);
    }

    private static String pgv3ToString(BaseClass _this_) {
        return ((GovSteam1) _this_).pgv3ToString();
    }

    /**
     * Nonlinear gain power value point 4 (Pgv4).  Typical Value = 0.98.
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
        ((GovSteam1) _this_).setPgv4(_value_);
    }

    private static String pgv4ToString(BaseClass _this_) {
        return ((GovSteam1) _this_).pgv4ToString();
    }

    /**
     * Nonlinear gain power value point 5 (Pgv5).  Typical Value = 1.
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
        ((GovSteam1) _this_).setPgv5(_value_);
    }

    private static String pgv5ToString(BaseClass _this_) {
        return ((GovSteam1) _this_).pgv5ToString();
    }

    /**
     * Nonlinear gain power value point 6 (Pgv6).  Typical Value = 0.
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
        ((GovSteam1) _this_).setPgv6(_value_);
    }

    private static String pgv6ToString(BaseClass _this_) {
        return ((GovSteam1) _this_).pgv6ToString();
    }

    /**
     * Maximum valve opening (Pmax) (&gt; Pmin).  Typical Value = 1.
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
        ((GovSteam1) _this_).setPmax(_value_);
    }

    private static String pmaxToString(BaseClass _this_) {
        return ((GovSteam1) _this_).pmaxToString();
    }

    /**
     * Minimum valve opening (Pmin) (&gt;=0).  Typical Value = 0.
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
        ((GovSteam1) _this_).setPmin(_value_);
    }

    private static String pminToString(BaseClass _this_) {
        return ((GovSteam1) _this_).pminToString();
    }

    /**
     * Intentional deadband indicator. true = intentional deadband is applied false = intentional deadband is not applied. Typical Value = true.
     */
    private Boolean sdb1; // Boolean

    public Boolean getSdb1() {
        return sdb1;
    }

    public void setSdb1(Boolean _value_) {
        sdb1 = _value_;
    }

    public void setSdb1(String _value_) {
        sdb1 = getBooleanFromString(_value_);
    }

    public String sdb1ToString() {
        return sdb1 != null ? sdb1.toString() : null;
    }

    private static void setSdb1(BaseClass _this_, String _value_) {
        ((GovSteam1) _this_).setSdb1(_value_);
    }

    private static String sdb1ToString(BaseClass _this_) {
        return ((GovSteam1) _this_).sdb1ToString();
    }

    /**
     * Unintentional deadband location. true = intentional deadband is applied before point `A` false = intentional deadband is applied after point `A`. Typical Value = true.
     */
    private Boolean sdb2; // Boolean

    public Boolean getSdb2() {
        return sdb2;
    }

    public void setSdb2(Boolean _value_) {
        sdb2 = _value_;
    }

    public void setSdb2(String _value_) {
        sdb2 = getBooleanFromString(_value_);
    }

    public String sdb2ToString() {
        return sdb2 != null ? sdb2.toString() : null;
    }

    private static void setSdb2(BaseClass _this_, String _value_) {
        ((GovSteam1) _this_).setSdb2(_value_);
    }

    private static String sdb2ToString(BaseClass _this_) {
        return ((GovSteam1) _this_).sdb2ToString();
    }

    /**
     * Governor lag time constant (T1).  Typical Value = 0.
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
        ((GovSteam1) _this_).setT1(_value_);
    }

    private static String t1ToString(BaseClass _this_) {
        return ((GovSteam1) _this_).t1ToString();
    }

    /**
     * Governor lead time constant (T2).  Typical Value = 0.
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
        ((GovSteam1) _this_).setT2(_value_);
    }

    private static String t2ToString(BaseClass _this_) {
        return ((GovSteam1) _this_).t2ToString();
    }

    /**
     * Valve positioner time constant (T3(&gt;0).  Typical Value = 0.1.
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
        ((GovSteam1) _this_).setT3(_value_);
    }

    private static String t3ToString(BaseClass _this_) {
        return ((GovSteam1) _this_).t3ToString();
    }

    /**
     * Inlet piping/steam bowl time constant (T4).  Typical Value = 0.3.
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
        ((GovSteam1) _this_).setT4(_value_);
    }

    private static String t4ToString(BaseClass _this_) {
        return ((GovSteam1) _this_).t4ToString();
    }

    /**
     * Time constant of second boiler pass (T5).  Typical Value = 5.
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
        ((GovSteam1) _this_).setT5(_value_);
    }

    private static String t5ToString(BaseClass _this_) {
        return ((GovSteam1) _this_).t5ToString();
    }

    /**
     * Time constant of third boiler pass (T6).  Typical Value = 0.5.
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
        ((GovSteam1) _this_).setT6(_value_);
    }

    private static String t6ToString(BaseClass _this_) {
        return ((GovSteam1) _this_).t6ToString();
    }

    /**
     * Time constant of fourth boiler pass (T7).  Typical Value = 0.
     */
    private Double t7; // Seconds

    public Double getT7() {
        return t7;
    }

    public void setT7(Double _value_) {
        t7 = _value_;
    }

    public void setT7(String _value_) {
        t7 = getDoubleFromString(_value_);
    }

    public String t7ToString() {
        return t7 != null ? t7.toString() : null;
    }

    private static void setT7(BaseClass _this_, String _value_) {
        ((GovSteam1) _this_).setT7(_value_);
    }

    private static String t7ToString(BaseClass _this_) {
        return ((GovSteam1) _this_).t7ToString();
    }

    /**
     * Maximum valve closing velocity (Uc) (&lt;0).  Unit = PU/sec.  Typical Value = -10.
     */
    private Double uc; // Simple_Float

    public Double getUc() {
        return uc;
    }

    public void setUc(Double _value_) {
        uc = _value_;
    }

    public void setUc(String _value_) {
        uc = getDoubleFromString(_value_);
    }

    public String ucToString() {
        return uc != null ? uc.toString() : null;
    }

    private static void setUc(BaseClass _this_, String _value_) {
        ((GovSteam1) _this_).setUc(_value_);
    }

    private static String ucToString(BaseClass _this_) {
        return ((GovSteam1) _this_).ucToString();
    }

    /**
     * Maximum valve opening velocity (Uo) (&gt;0).  Unit = PU/sec.  Typical Value = 1.
     */
    private Double uo; // Simple_Float

    public Double getUo() {
        return uo;
    }

    public void setUo(Double _value_) {
        uo = _value_;
    }

    public void setUo(String _value_) {
        uo = getDoubleFromString(_value_);
    }

    public String uoToString() {
        return uo != null ? uo.toString() : null;
    }

    private static void setUo(BaseClass _this_, String _value_) {
        ((GovSteam1) _this_).setUo(_value_);
    }

    private static String uoToString(BaseClass _this_) {
        return ((GovSteam1) _this_).uoToString();
    }

    /**
     * Nonlinear valve characteristic. true = nonlinear valve characteristic is used false = nonlinear valve characteristic is not used. Typical Value = true.
     */
    private Boolean valve; // Boolean

    public Boolean getValve() {
        return valve;
    }

    public void setValve(Boolean _value_) {
        valve = _value_;
    }

    public void setValve(String _value_) {
        valve = getBooleanFromString(_value_);
    }

    public String valveToString() {
        return valve != null ? valve.toString() : null;
    }

    private static void setValve(BaseClass _this_, String _value_) {
        ((GovSteam1) _this_).setValve(_value_);
    }

    private static String valveToString(BaseClass _this_) {
        return ((GovSteam1) _this_).valveToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "GovSteam1", attrName));
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
                "GovSteam1", attrName, objectValue));
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
                "GovSteam1", attrName, stringValue));
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
            map.put("db1", new AttrDetails("GovSteam1.db1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::db1ToString, null, GovSteam1::setDb1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("db2", new AttrDetails("GovSteam1.db2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::db2ToString, null, GovSteam1::setDb2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("eps", new AttrDetails("GovSteam1.eps", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::epsToString, null, GovSteam1::setEps));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv1", new AttrDetails("GovSteam1.gv1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::gv1ToString, null, GovSteam1::setGv1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv2", new AttrDetails("GovSteam1.gv2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::gv2ToString, null, GovSteam1::setGv2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv3", new AttrDetails("GovSteam1.gv3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::gv3ToString, null, GovSteam1::setGv3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv4", new AttrDetails("GovSteam1.gv4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::gv4ToString, null, GovSteam1::setGv4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv5", new AttrDetails("GovSteam1.gv5", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::gv5ToString, null, GovSteam1::setGv5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv6", new AttrDetails("GovSteam1.gv6", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::gv6ToString, null, GovSteam1::setGv6));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k", new AttrDetails("GovSteam1.k", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::kToString, null, GovSteam1::setK));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k1", new AttrDetails("GovSteam1.k1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::k1ToString, null, GovSteam1::setK1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k2", new AttrDetails("GovSteam1.k2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::k2ToString, null, GovSteam1::setK2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k3", new AttrDetails("GovSteam1.k3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::k3ToString, null, GovSteam1::setK3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k4", new AttrDetails("GovSteam1.k4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::k4ToString, null, GovSteam1::setK4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k5", new AttrDetails("GovSteam1.k5", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::k5ToString, null, GovSteam1::setK5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k6", new AttrDetails("GovSteam1.k6", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::k6ToString, null, GovSteam1::setK6));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k7", new AttrDetails("GovSteam1.k7", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::k7ToString, null, GovSteam1::setK7));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("k8", new AttrDetails("GovSteam1.k8", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::k8ToString, null, GovSteam1::setK8));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mwbase", new AttrDetails("GovSteam1.mwbase", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::mwbaseToString, null, GovSteam1::setMwbase));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv1", new AttrDetails("GovSteam1.pgv1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::pgv1ToString, null, GovSteam1::setPgv1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv2", new AttrDetails("GovSteam1.pgv2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::pgv2ToString, null, GovSteam1::setPgv2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv3", new AttrDetails("GovSteam1.pgv3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::pgv3ToString, null, GovSteam1::setPgv3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv4", new AttrDetails("GovSteam1.pgv4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::pgv4ToString, null, GovSteam1::setPgv4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv5", new AttrDetails("GovSteam1.pgv5", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::pgv5ToString, null, GovSteam1::setPgv5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv6", new AttrDetails("GovSteam1.pgv6", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::pgv6ToString, null, GovSteam1::setPgv6));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmax", new AttrDetails("GovSteam1.pmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::pmaxToString, null, GovSteam1::setPmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmin", new AttrDetails("GovSteam1.pmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::pminToString, null, GovSteam1::setPmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("sdb1", new AttrDetails("GovSteam1.sdb1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::sdb1ToString, null, GovSteam1::setSdb1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("sdb2", new AttrDetails("GovSteam1.sdb2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::sdb2ToString, null, GovSteam1::setSdb2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t1", new AttrDetails("GovSteam1.t1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::t1ToString, null, GovSteam1::setT1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t2", new AttrDetails("GovSteam1.t2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::t2ToString, null, GovSteam1::setT2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t3", new AttrDetails("GovSteam1.t3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::t3ToString, null, GovSteam1::setT3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t4", new AttrDetails("GovSteam1.t4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::t4ToString, null, GovSteam1::setT4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t5", new AttrDetails("GovSteam1.t5", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::t5ToString, null, GovSteam1::setT5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t6", new AttrDetails("GovSteam1.t6", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::t6ToString, null, GovSteam1::setT6));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t7", new AttrDetails("GovSteam1.t7", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::t7ToString, null, GovSteam1::setT7));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("uc", new AttrDetails("GovSteam1.uc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::ucToString, null, GovSteam1::setUc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("uo", new AttrDetails("GovSteam1.uo", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::uoToString, null, GovSteam1::setUo));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("valve", new AttrDetails("GovSteam1.valve", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteam1::valveToString, null, GovSteam1::setValve));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new GovSteam1(null).allAttrDetailsMap());
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
