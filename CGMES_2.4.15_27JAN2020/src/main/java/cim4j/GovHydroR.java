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
 * Fourth order lead-lag governor and hydro turbine.
 */
@SuppressWarnings("unused")
public class GovHydroR extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovHydroR.class);

    /**
     * Constructor.
     */
    public GovHydroR(String rdfid) {
        super("GovHydroR", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected GovHydroR(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Turbine gain (At).  Typical Value = 1.2.
     */
    private Double at; // PU

    public Double getAt() {
        return at;
    }

    public void setAt(Double _value_) {
        at = _value_;
    }

    public void setAt(String _value_) {
        at = getDoubleFromString(_value_);
    }

    public String atToString() {
        return at != null ? at.toString() : null;
    }

    private static void setAt(BaseClass _this_, String _value_) {
        ((GovHydroR) _this_).setAt(_value_);
    }

    private static String atToString(BaseClass _this_) {
        return ((GovHydroR) _this_).atToString();
    }

    /**
     * Intentional dead-band width (db1).  Unit = Hz.  Typical Value = 0.
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
        ((GovHydroR) _this_).setDb1(_value_);
    }

    private static String db1ToString(BaseClass _this_) {
        return ((GovHydroR) _this_).db1ToString();
    }

    /**
     * Unintentional dead-band (db2).  Unit = MW.  Typical Value = 0.
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
        ((GovHydroR) _this_).setDb2(_value_);
    }

    private static String db2ToString(BaseClass _this_) {
        return ((GovHydroR) _this_).db2ToString();
    }

    /**
     * Turbine damping factor (Dturb).  Typical Value = 0.2.
     */
    private Double dturb; // PU

    public Double getDturb() {
        return dturb;
    }

    public void setDturb(Double _value_) {
        dturb = _value_;
    }

    public void setDturb(String _value_) {
        dturb = getDoubleFromString(_value_);
    }

    public String dturbToString() {
        return dturb != null ? dturb.toString() : null;
    }

    private static void setDturb(BaseClass _this_, String _value_) {
        ((GovHydroR) _this_).setDturb(_value_);
    }

    private static String dturbToString(BaseClass _this_) {
        return ((GovHydroR) _this_).dturbToString();
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
        ((GovHydroR) _this_).setEps(_value_);
    }

    private static String epsToString(BaseClass _this_) {
        return ((GovHydroR) _this_).epsToString();
    }

    /**
     * Maximum governor output (Gmax).  Typical Value = 1.05.
     */
    private Double gmax; // PU

    public Double getGmax() {
        return gmax;
    }

    public void setGmax(Double _value_) {
        gmax = _value_;
    }

    public void setGmax(String _value_) {
        gmax = getDoubleFromString(_value_);
    }

    public String gmaxToString() {
        return gmax != null ? gmax.toString() : null;
    }

    private static void setGmax(BaseClass _this_, String _value_) {
        ((GovHydroR) _this_).setGmax(_value_);
    }

    private static String gmaxToString(BaseClass _this_) {
        return ((GovHydroR) _this_).gmaxToString();
    }

    /**
     * Minimum governor output (Gmin).  Typical Value = -0.05.
     */
    private Double gmin; // PU

    public Double getGmin() {
        return gmin;
    }

    public void setGmin(Double _value_) {
        gmin = _value_;
    }

    public void setGmin(String _value_) {
        gmin = getDoubleFromString(_value_);
    }

    public String gminToString() {
        return gmin != null ? gmin.toString() : null;
    }

    private static void setGmin(BaseClass _this_, String _value_) {
        ((GovHydroR) _this_).setGmin(_value_);
    }

    private static String gminToString(BaseClass _this_) {
        return ((GovHydroR) _this_).gminToString();
    }

    /**
     * Nonlinear gain point 1, PU gv (Gv1).  Typical Value = 0.
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
        ((GovHydroR) _this_).setGv1(_value_);
    }

    private static String gv1ToString(BaseClass _this_) {
        return ((GovHydroR) _this_).gv1ToString();
    }

    /**
     * Nonlinear gain point 2, PU gv (Gv2).  Typical Value = 0.
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
        ((GovHydroR) _this_).setGv2(_value_);
    }

    private static String gv2ToString(BaseClass _this_) {
        return ((GovHydroR) _this_).gv2ToString();
    }

    /**
     * Nonlinear gain point 3, PU gv (Gv3).  Typical Value = 0.
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
        ((GovHydroR) _this_).setGv3(_value_);
    }

    private static String gv3ToString(BaseClass _this_) {
        return ((GovHydroR) _this_).gv3ToString();
    }

    /**
     * Nonlinear gain point 4, PU gv (Gv4).  Typical Value = 0.
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
        ((GovHydroR) _this_).setGv4(_value_);
    }

    private static String gv4ToString(BaseClass _this_) {
        return ((GovHydroR) _this_).gv4ToString();
    }

    /**
     * Nonlinear gain point 5, PU gv (Gv5).  Typical Value = 0.
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
        ((GovHydroR) _this_).setGv5(_value_);
    }

    private static String gv5ToString(BaseClass _this_) {
        return ((GovHydroR) _this_).gv5ToString();
    }

    /**
     * Nonlinear gain point 6, PU gv (Gv6).  Typical Value = 0.
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
        ((GovHydroR) _this_).setGv6(_value_);
    }

    private static String gv6ToString(BaseClass _this_) {
        return ((GovHydroR) _this_).gv6ToString();
    }

    /**
     * Turbine nominal head (H0).  Typical Value = 1.
     */
    private Double h0; // PU

    public Double getH0() {
        return h0;
    }

    public void setH0(Double _value_) {
        h0 = _value_;
    }

    public void setH0(String _value_) {
        h0 = getDoubleFromString(_value_);
    }

    public String h0ToString() {
        return h0 != null ? h0.toString() : null;
    }

    private static void setH0(BaseClass _this_, String _value_) {
        ((GovHydroR) _this_).setH0(_value_);
    }

    private static String h0ToString(BaseClass _this_) {
        return ((GovHydroR) _this_).h0ToString();
    }

    /**
     * Input signal switch (Flag). true = Pe input is used false = feedback is received from CV. Flag is normally dependent on Tt.  If Tf is zero, Flag is set to false. If Tf is not zero, Flag is set to true.  Typical Value = true.
     */
    private Boolean inputSignal; // Boolean

    public Boolean getInputSignal() {
        return inputSignal;
    }

    public void setInputSignal(Boolean _value_) {
        inputSignal = _value_;
    }

    public void setInputSignal(String _value_) {
        inputSignal = getBooleanFromString(_value_);
    }

    public String inputSignalToString() {
        return inputSignal != null ? inputSignal.toString() : null;
    }

    private static void setInputSignal(BaseClass _this_, String _value_) {
        ((GovHydroR) _this_).setInputSignal(_value_);
    }

    private static String inputSignalToString(BaseClass _this_) {
        return ((GovHydroR) _this_).inputSignalToString();
    }

    /**
     * Gate servo gain (Kg).  Typical Value = 2.
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
        ((GovHydroR) _this_).setKg(_value_);
    }

    private static String kgToString(BaseClass _this_) {
        return ((GovHydroR) _this_).kgToString();
    }

    /**
     * Integral gain (Ki).  Typical Value = 0.5.
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
        ((GovHydroR) _this_).setKi(_value_);
    }

    private static String kiToString(BaseClass _this_) {
        return ((GovHydroR) _this_).kiToString();
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
        ((GovHydroR) _this_).setMwbase(_value_);
    }

    private static String mwbaseToString(BaseClass _this_) {
        return ((GovHydroR) _this_).mwbaseToString();
    }

    /**
     * Nonlinear gain point 1, PU power (Pgv1).  Typical Value = 0.
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
        ((GovHydroR) _this_).setPgv1(_value_);
    }

    private static String pgv1ToString(BaseClass _this_) {
        return ((GovHydroR) _this_).pgv1ToString();
    }

    /**
     * Nonlinear gain point 2, PU power (Pgv2).  Typical Value = 0.
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
        ((GovHydroR) _this_).setPgv2(_value_);
    }

    private static String pgv2ToString(BaseClass _this_) {
        return ((GovHydroR) _this_).pgv2ToString();
    }

    /**
     * Nonlinear gain point 3, PU power (Pgv3).  Typical Value = 0.
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
        ((GovHydroR) _this_).setPgv3(_value_);
    }

    private static String pgv3ToString(BaseClass _this_) {
        return ((GovHydroR) _this_).pgv3ToString();
    }

    /**
     * Nonlinear gain point 4, PU power (Pgv4).  Typical Value = 0.
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
        ((GovHydroR) _this_).setPgv4(_value_);
    }

    private static String pgv4ToString(BaseClass _this_) {
        return ((GovHydroR) _this_).pgv4ToString();
    }

    /**
     * Nonlinear gain point 5, PU power (Pgv5).  Typical Value = 0.
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
        ((GovHydroR) _this_).setPgv5(_value_);
    }

    private static String pgv5ToString(BaseClass _this_) {
        return ((GovHydroR) _this_).pgv5ToString();
    }

    /**
     * Nonlinear gain point 6, PU power (Pgv6).  Typical Value = 0.
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
        ((GovHydroR) _this_).setPgv6(_value_);
    }

    private static String pgv6ToString(BaseClass _this_) {
        return ((GovHydroR) _this_).pgv6ToString();
    }

    /**
     * Maximum gate opening, PU of MWbase (Pmax).  Typical Value = 1.
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
        ((GovHydroR) _this_).setPmax(_value_);
    }

    private static String pmaxToString(BaseClass _this_) {
        return ((GovHydroR) _this_).pmaxToString();
    }

    /**
     * Minimum gate opening, PU of MWbase (Pmin).  Typical Value = 0.
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
        ((GovHydroR) _this_).setPmin(_value_);
    }

    private static String pminToString(BaseClass _this_) {
        return ((GovHydroR) _this_).pminToString();
    }

    /**
     * No-load turbine flow at nominal head (Qnl).  Typical Value = 0.08.
     */
    private Double qnl; // PU

    public Double getQnl() {
        return qnl;
    }

    public void setQnl(Double _value_) {
        qnl = _value_;
    }

    public void setQnl(String _value_) {
        qnl = getDoubleFromString(_value_);
    }

    public String qnlToString() {
        return qnl != null ? qnl.toString() : null;
    }

    private static void setQnl(BaseClass _this_, String _value_) {
        ((GovHydroR) _this_).setQnl(_value_);
    }

    private static String qnlToString(BaseClass _this_) {
        return ((GovHydroR) _this_).qnlToString();
    }

    /**
     * Steady-state droop (R).  Typical Value = 0.05.
     */
    private Double r; // PU

    public Double getR() {
        return r;
    }

    public void setR(Double _value_) {
        r = _value_;
    }

    public void setR(String _value_) {
        r = getDoubleFromString(_value_);
    }

    public String rToString() {
        return r != null ? r.toString() : null;
    }

    private static void setR(BaseClass _this_, String _value_) {
        ((GovHydroR) _this_).setR(_value_);
    }

    private static String rToString(BaseClass _this_) {
        return ((GovHydroR) _this_).rToString();
    }

    /**
     * Lead time constant 1 (T1).  Typical Value = 1.5.
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
        ((GovHydroR) _this_).setT1(_value_);
    }

    private static String t1ToString(BaseClass _this_) {
        return ((GovHydroR) _this_).t1ToString();
    }

    /**
     * Lag time constant 1 (T2).  Typical Value = 0.1.
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
        ((GovHydroR) _this_).setT2(_value_);
    }

    private static String t2ToString(BaseClass _this_) {
        return ((GovHydroR) _this_).t2ToString();
    }

    /**
     * Lead time constant 2 (T3).  Typical Value = 1.5.
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
        ((GovHydroR) _this_).setT3(_value_);
    }

    private static String t3ToString(BaseClass _this_) {
        return ((GovHydroR) _this_).t3ToString();
    }

    /**
     * Lag time constant 2 (T4).  Typical Value = 0.1.
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
        ((GovHydroR) _this_).setT4(_value_);
    }

    private static String t4ToString(BaseClass _this_) {
        return ((GovHydroR) _this_).t4ToString();
    }

    /**
     * Lead time constant 3 (T5).  Typical Value = 0.
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
        ((GovHydroR) _this_).setT5(_value_);
    }

    private static String t5ToString(BaseClass _this_) {
        return ((GovHydroR) _this_).t5ToString();
    }

    /**
     * Lag time constant 3 (T6).  Typical Value = 0.05.
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
        ((GovHydroR) _this_).setT6(_value_);
    }

    private static String t6ToString(BaseClass _this_) {
        return ((GovHydroR) _this_).t6ToString();
    }

    /**
     * Lead time constant 4 (T7).  Typical Value = 0.
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
        ((GovHydroR) _this_).setT7(_value_);
    }

    private static String t7ToString(BaseClass _this_) {
        return ((GovHydroR) _this_).t7ToString();
    }

    /**
     * Lag time constant 4 (T8).  Typical Value = 0.05.
     */
    private Double t8; // Seconds

    public Double getT8() {
        return t8;
    }

    public void setT8(Double _value_) {
        t8 = _value_;
    }

    public void setT8(String _value_) {
        t8 = getDoubleFromString(_value_);
    }

    public String t8ToString() {
        return t8 != null ? t8.toString() : null;
    }

    private static void setT8(BaseClass _this_, String _value_) {
        ((GovHydroR) _this_).setT8(_value_);
    }

    private static String t8ToString(BaseClass _this_) {
        return ((GovHydroR) _this_).t8ToString();
    }

    /**
     * Input filter time constant (Td).  Typical Value = 0.05.
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
        ((GovHydroR) _this_).setTd(_value_);
    }

    private static String tdToString(BaseClass _this_) {
        return ((GovHydroR) _this_).tdToString();
    }

    /**
     * Gate servo time constant (Tp).  Typical Value = 0.05.
     */
    private Double tp; // Seconds

    public Double getTp() {
        return tp;
    }

    public void setTp(Double _value_) {
        tp = _value_;
    }

    public void setTp(String _value_) {
        tp = getDoubleFromString(_value_);
    }

    public String tpToString() {
        return tp != null ? tp.toString() : null;
    }

    private static void setTp(BaseClass _this_, String _value_) {
        ((GovHydroR) _this_).setTp(_value_);
    }

    private static String tpToString(BaseClass _this_) {
        return ((GovHydroR) _this_).tpToString();
    }

    /**
     * Power feedback time constant (Tt).  Typical Value = 0.
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
        ((GovHydroR) _this_).setTt(_value_);
    }

    private static String ttToString(BaseClass _this_) {
        return ((GovHydroR) _this_).ttToString();
    }

    /**
     * Water inertia time constant (Tw).  Typical Value = 1.
     */
    private Double tw; // Seconds

    public Double getTw() {
        return tw;
    }

    public void setTw(Double _value_) {
        tw = _value_;
    }

    public void setTw(String _value_) {
        tw = getDoubleFromString(_value_);
    }

    public String twToString() {
        return tw != null ? tw.toString() : null;
    }

    private static void setTw(BaseClass _this_, String _value_) {
        ((GovHydroR) _this_).setTw(_value_);
    }

    private static String twToString(BaseClass _this_) {
        return ((GovHydroR) _this_).twToString();
    }

    /**
     * Maximum gate closing velocity (Velcl).  Unit = PU/sec.  Typical Value = -0.2.
     */
    private Double velcl; // Simple_Float

    public Double getVelcl() {
        return velcl;
    }

    public void setVelcl(Double _value_) {
        velcl = _value_;
    }

    public void setVelcl(String _value_) {
        velcl = getDoubleFromString(_value_);
    }

    public String velclToString() {
        return velcl != null ? velcl.toString() : null;
    }

    private static void setVelcl(BaseClass _this_, String _value_) {
        ((GovHydroR) _this_).setVelcl(_value_);
    }

    private static String velclToString(BaseClass _this_) {
        return ((GovHydroR) _this_).velclToString();
    }

    /**
     * Maximum gate opening velocity (Velop).  Unit = PU/sec.  Typical Value = 0.2.
     */
    private Double velop; // Simple_Float

    public Double getVelop() {
        return velop;
    }

    public void setVelop(Double _value_) {
        velop = _value_;
    }

    public void setVelop(String _value_) {
        velop = getDoubleFromString(_value_);
    }

    public String velopToString() {
        return velop != null ? velop.toString() : null;
    }

    private static void setVelop(BaseClass _this_, String _value_) {
        ((GovHydroR) _this_).setVelop(_value_);
    }

    private static String velopToString(BaseClass _this_) {
        return ((GovHydroR) _this_).velopToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "GovHydroR", attrName));
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
                "GovHydroR", attrName, objectValue));
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
                "GovHydroR", attrName, stringValue));
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
            map.put("at", new AttrDetails("GovHydroR.at", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroR::atToString, null, GovHydroR::setAt));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("db1", new AttrDetails("GovHydroR.db1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroR::db1ToString, null, GovHydroR::setDb1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("db2", new AttrDetails("GovHydroR.db2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroR::db2ToString, null, GovHydroR::setDb2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dturb", new AttrDetails("GovHydroR.dturb", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroR::dturbToString, null, GovHydroR::setDturb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("eps", new AttrDetails("GovHydroR.eps", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroR::epsToString, null, GovHydroR::setEps));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gmax", new AttrDetails("GovHydroR.gmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroR::gmaxToString, null, GovHydroR::setGmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gmin", new AttrDetails("GovHydroR.gmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroR::gminToString, null, GovHydroR::setGmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv1", new AttrDetails("GovHydroR.gv1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroR::gv1ToString, null, GovHydroR::setGv1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv2", new AttrDetails("GovHydroR.gv2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroR::gv2ToString, null, GovHydroR::setGv2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv3", new AttrDetails("GovHydroR.gv3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroR::gv3ToString, null, GovHydroR::setGv3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv4", new AttrDetails("GovHydroR.gv4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroR::gv4ToString, null, GovHydroR::setGv4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv5", new AttrDetails("GovHydroR.gv5", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroR::gv5ToString, null, GovHydroR::setGv5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv6", new AttrDetails("GovHydroR.gv6", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroR::gv6ToString, null, GovHydroR::setGv6));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("h0", new AttrDetails("GovHydroR.h0", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroR::h0ToString, null, GovHydroR::setH0));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("inputSignal", new AttrDetails("GovHydroR.inputSignal", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroR::inputSignalToString, null, GovHydroR::setInputSignal));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kg", new AttrDetails("GovHydroR.kg", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroR::kgToString, null, GovHydroR::setKg));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ki", new AttrDetails("GovHydroR.ki", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroR::kiToString, null, GovHydroR::setKi));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mwbase", new AttrDetails("GovHydroR.mwbase", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroR::mwbaseToString, null, GovHydroR::setMwbase));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv1", new AttrDetails("GovHydroR.pgv1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroR::pgv1ToString, null, GovHydroR::setPgv1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv2", new AttrDetails("GovHydroR.pgv2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroR::pgv2ToString, null, GovHydroR::setPgv2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv3", new AttrDetails("GovHydroR.pgv3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroR::pgv3ToString, null, GovHydroR::setPgv3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv4", new AttrDetails("GovHydroR.pgv4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroR::pgv4ToString, null, GovHydroR::setPgv4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv5", new AttrDetails("GovHydroR.pgv5", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroR::pgv5ToString, null, GovHydroR::setPgv5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv6", new AttrDetails("GovHydroR.pgv6", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroR::pgv6ToString, null, GovHydroR::setPgv6));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmax", new AttrDetails("GovHydroR.pmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroR::pmaxToString, null, GovHydroR::setPmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmin", new AttrDetails("GovHydroR.pmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroR::pminToString, null, GovHydroR::setPmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("qnl", new AttrDetails("GovHydroR.qnl", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroR::qnlToString, null, GovHydroR::setQnl));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("r", new AttrDetails("GovHydroR.r", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroR::rToString, null, GovHydroR::setR));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t1", new AttrDetails("GovHydroR.t1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroR::t1ToString, null, GovHydroR::setT1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t2", new AttrDetails("GovHydroR.t2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroR::t2ToString, null, GovHydroR::setT2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t3", new AttrDetails("GovHydroR.t3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroR::t3ToString, null, GovHydroR::setT3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t4", new AttrDetails("GovHydroR.t4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroR::t4ToString, null, GovHydroR::setT4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t5", new AttrDetails("GovHydroR.t5", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroR::t5ToString, null, GovHydroR::setT5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t6", new AttrDetails("GovHydroR.t6", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroR::t6ToString, null, GovHydroR::setT6));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t7", new AttrDetails("GovHydroR.t7", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroR::t7ToString, null, GovHydroR::setT7));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("t8", new AttrDetails("GovHydroR.t8", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroR::t8ToString, null, GovHydroR::setT8));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("td", new AttrDetails("GovHydroR.td", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroR::tdToString, null, GovHydroR::setTd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tp", new AttrDetails("GovHydroR.tp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroR::tpToString, null, GovHydroR::setTp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tt", new AttrDetails("GovHydroR.tt", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroR::ttToString, null, GovHydroR::setTt));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tw", new AttrDetails("GovHydroR.tw", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroR::twToString, null, GovHydroR::setTw));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("velcl", new AttrDetails("GovHydroR.velcl", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroR::velclToString, null, GovHydroR::setVelcl));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("velop", new AttrDetails("GovHydroR.velop", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroR::velopToString, null, GovHydroR::setVelop));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new GovHydroR(null).allAttrDetailsMap());
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
