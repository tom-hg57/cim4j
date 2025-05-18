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
 * General governor model with frequency-dependent fuel flow limit.  This model is a modification of the GovCT1model in order to represent the frequency-dependent fuel flow limit of a specific gas turbine manufacturer.
 */
@SuppressWarnings("unused")
public class GovCT2 extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovCT2.class);

    /**
     * Constructor.
     */
    public GovCT2(String rdfid) {
        super("GovCT2", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected GovCT2(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Acceleration limiter setpoint (Aset).  Unit = PU/sec.  Typical Value = 10.
     */
    private Double aset; // Simple_Float

    public Double getAset() {
        return aset;
    }

    public void setAset(Double _value_) {
        aset = _value_;
    }

    public void setAset(String _value_) {
        aset = getDoubleFromString(_value_);
    }

    public String asetToString() {
        return aset != null ? aset.toString() : null;
    }

    private static void setAset(BaseClass _this_, String _value_) {
        ((GovCT2) _this_).setAset(_value_);
    }

    private static String asetToString(BaseClass _this_) {
        return ((GovCT2) _this_).asetToString();
    }

    /**
     * Speed governor dead band in per unit speed (db).  In the majority of applications, it is recommended that this value be set to zero.  Typical Value = 0.
     */
    private Double db; // PU

    public Double getDb() {
        return db;
    }

    public void setDb(Double _value_) {
        db = _value_;
    }

    public void setDb(String _value_) {
        db = getDoubleFromString(_value_);
    }

    public String dbToString() {
        return db != null ? db.toString() : null;
    }

    private static void setDb(BaseClass _this_, String _value_) {
        ((GovCT2) _this_).setDb(_value_);
    }

    private static String dbToString(BaseClass _this_) {
        return ((GovCT2) _this_).dbToString();
    }

    /**
     * Speed sensitivity coefficient (Dm).  Dm can represent either the variation of the engine power with the shaft speed or the variation of maximum power capability with shaft speed.  If it is positive it describes the falling slope of the engine speed verses power characteristic as speed increases. A slightly falling characteristic is typical for reciprocating engines and some aero-derivative turbines.  If it is negative the engine power is assumed to be unaffected by the shaft speed, but the maximum permissible fuel flow is taken to fall with falling shaft speed. This is characteristic of single-shaft industrial turbines due to exhaust temperature limits.  Typical Value = 0.
     */
    private Double dm; // PU

    public Double getDm() {
        return dm;
    }

    public void setDm(Double _value_) {
        dm = _value_;
    }

    public void setDm(String _value_) {
        dm = getDoubleFromString(_value_);
    }

    public String dmToString() {
        return dm != null ? dm.toString() : null;
    }

    private static void setDm(BaseClass _this_, String _value_) {
        ((GovCT2) _this_).setDm(_value_);
    }

    private static String dmToString(BaseClass _this_) {
        return ((GovCT2) _this_).dmToString();
    }

    /**
     * Frequency threshold 1 (Flim1).  Unit = Hz.  Typical Value = 59.
     */
    private Double flim1; // Frequency

    public Double getFlim1() {
        return flim1;
    }

    public void setFlim1(Double _value_) {
        flim1 = _value_;
    }

    public void setFlim1(String _value_) {
        flim1 = getDoubleFromString(_value_);
    }

    public String flim1ToString() {
        return flim1 != null ? flim1.toString() : null;
    }

    private static void setFlim1(BaseClass _this_, String _value_) {
        ((GovCT2) _this_).setFlim1(_value_);
    }

    private static String flim1ToString(BaseClass _this_) {
        return ((GovCT2) _this_).flim1ToString();
    }

    /**
     * Frequency threshold 10 (Flim10).  Unit = Hz.  Typical Value = 0.
     */
    private Double flim10; // Frequency

    public Double getFlim10() {
        return flim10;
    }

    public void setFlim10(Double _value_) {
        flim10 = _value_;
    }

    public void setFlim10(String _value_) {
        flim10 = getDoubleFromString(_value_);
    }

    public String flim10ToString() {
        return flim10 != null ? flim10.toString() : null;
    }

    private static void setFlim10(BaseClass _this_, String _value_) {
        ((GovCT2) _this_).setFlim10(_value_);
    }

    private static String flim10ToString(BaseClass _this_) {
        return ((GovCT2) _this_).flim10ToString();
    }

    /**
     * Frequency threshold 2 (Flim2).  Unit = Hz.  Typical Value = 0.
     */
    private Double flim2; // Frequency

    public Double getFlim2() {
        return flim2;
    }

    public void setFlim2(Double _value_) {
        flim2 = _value_;
    }

    public void setFlim2(String _value_) {
        flim2 = getDoubleFromString(_value_);
    }

    public String flim2ToString() {
        return flim2 != null ? flim2.toString() : null;
    }

    private static void setFlim2(BaseClass _this_, String _value_) {
        ((GovCT2) _this_).setFlim2(_value_);
    }

    private static String flim2ToString(BaseClass _this_) {
        return ((GovCT2) _this_).flim2ToString();
    }

    /**
     * Frequency threshold 3 (Flim3).  Unit = Hz.  Typical Value = 0.
     */
    private Double flim3; // Frequency

    public Double getFlim3() {
        return flim3;
    }

    public void setFlim3(Double _value_) {
        flim3 = _value_;
    }

    public void setFlim3(String _value_) {
        flim3 = getDoubleFromString(_value_);
    }

    public String flim3ToString() {
        return flim3 != null ? flim3.toString() : null;
    }

    private static void setFlim3(BaseClass _this_, String _value_) {
        ((GovCT2) _this_).setFlim3(_value_);
    }

    private static String flim3ToString(BaseClass _this_) {
        return ((GovCT2) _this_).flim3ToString();
    }

    /**
     * Frequency threshold 4 (Flim4).  Unit = Hz.  Typical Value = 0.
     */
    private Double flim4; // Frequency

    public Double getFlim4() {
        return flim4;
    }

    public void setFlim4(Double _value_) {
        flim4 = _value_;
    }

    public void setFlim4(String _value_) {
        flim4 = getDoubleFromString(_value_);
    }

    public String flim4ToString() {
        return flim4 != null ? flim4.toString() : null;
    }

    private static void setFlim4(BaseClass _this_, String _value_) {
        ((GovCT2) _this_).setFlim4(_value_);
    }

    private static String flim4ToString(BaseClass _this_) {
        return ((GovCT2) _this_).flim4ToString();
    }

    /**
     * Frequency threshold 5 (Flim5).  Unit = Hz.  Typical Value = 0.
     */
    private Double flim5; // Frequency

    public Double getFlim5() {
        return flim5;
    }

    public void setFlim5(Double _value_) {
        flim5 = _value_;
    }

    public void setFlim5(String _value_) {
        flim5 = getDoubleFromString(_value_);
    }

    public String flim5ToString() {
        return flim5 != null ? flim5.toString() : null;
    }

    private static void setFlim5(BaseClass _this_, String _value_) {
        ((GovCT2) _this_).setFlim5(_value_);
    }

    private static String flim5ToString(BaseClass _this_) {
        return ((GovCT2) _this_).flim5ToString();
    }

    /**
     * Frequency threshold 6 (Flim6).  Unit = Hz.  Typical Value = 0.
     */
    private Double flim6; // Frequency

    public Double getFlim6() {
        return flim6;
    }

    public void setFlim6(Double _value_) {
        flim6 = _value_;
    }

    public void setFlim6(String _value_) {
        flim6 = getDoubleFromString(_value_);
    }

    public String flim6ToString() {
        return flim6 != null ? flim6.toString() : null;
    }

    private static void setFlim6(BaseClass _this_, String _value_) {
        ((GovCT2) _this_).setFlim6(_value_);
    }

    private static String flim6ToString(BaseClass _this_) {
        return ((GovCT2) _this_).flim6ToString();
    }

    /**
     * Frequency threshold 7 (Flim7).  Unit = Hz.  Typical Value = 0.
     */
    private Double flim7; // Frequency

    public Double getFlim7() {
        return flim7;
    }

    public void setFlim7(Double _value_) {
        flim7 = _value_;
    }

    public void setFlim7(String _value_) {
        flim7 = getDoubleFromString(_value_);
    }

    public String flim7ToString() {
        return flim7 != null ? flim7.toString() : null;
    }

    private static void setFlim7(BaseClass _this_, String _value_) {
        ((GovCT2) _this_).setFlim7(_value_);
    }

    private static String flim7ToString(BaseClass _this_) {
        return ((GovCT2) _this_).flim7ToString();
    }

    /**
     * Frequency threshold 8 (Flim8).  Unit = Hz.  Typical Value = 0.
     */
    private Double flim8; // Frequency

    public Double getFlim8() {
        return flim8;
    }

    public void setFlim8(Double _value_) {
        flim8 = _value_;
    }

    public void setFlim8(String _value_) {
        flim8 = getDoubleFromString(_value_);
    }

    public String flim8ToString() {
        return flim8 != null ? flim8.toString() : null;
    }

    private static void setFlim8(BaseClass _this_, String _value_) {
        ((GovCT2) _this_).setFlim8(_value_);
    }

    private static String flim8ToString(BaseClass _this_) {
        return ((GovCT2) _this_).flim8ToString();
    }

    /**
     * Frequency threshold 9 (Flim9).  Unit = Hz.  Typical Value = 0.
     */
    private Double flim9; // Frequency

    public Double getFlim9() {
        return flim9;
    }

    public void setFlim9(Double _value_) {
        flim9 = _value_;
    }

    public void setFlim9(String _value_) {
        flim9 = getDoubleFromString(_value_);
    }

    public String flim9ToString() {
        return flim9 != null ? flim9.toString() : null;
    }

    private static void setFlim9(BaseClass _this_, String _value_) {
        ((GovCT2) _this_).setFlim9(_value_);
    }

    private static String flim9ToString(BaseClass _this_) {
        return ((GovCT2) _this_).flim9ToString();
    }

    /**
     * Acceleration limiter Gain (Ka).  Typical Value = 10.
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
        ((GovCT2) _this_).setKa(_value_);
    }

    private static String kaToString(BaseClass _this_) {
        return ((GovCT2) _this_).kaToString();
    }

    /**
     * Governor derivative gain (Kdgov).  Typical Value = 0.
     */
    private Double kdgov; // PU

    public Double getKdgov() {
        return kdgov;
    }

    public void setKdgov(Double _value_) {
        kdgov = _value_;
    }

    public void setKdgov(String _value_) {
        kdgov = getDoubleFromString(_value_);
    }

    public String kdgovToString() {
        return kdgov != null ? kdgov.toString() : null;
    }

    private static void setKdgov(BaseClass _this_, String _value_) {
        ((GovCT2) _this_).setKdgov(_value_);
    }

    private static String kdgovToString(BaseClass _this_) {
        return ((GovCT2) _this_).kdgovToString();
    }

    /**
     * Governor integral gain (Kigov).  Typical Value = 0.45.
     */
    private Double kigov; // PU

    public Double getKigov() {
        return kigov;
    }

    public void setKigov(Double _value_) {
        kigov = _value_;
    }

    public void setKigov(String _value_) {
        kigov = getDoubleFromString(_value_);
    }

    public String kigovToString() {
        return kigov != null ? kigov.toString() : null;
    }

    private static void setKigov(BaseClass _this_, String _value_) {
        ((GovCT2) _this_).setKigov(_value_);
    }

    private static String kigovToString(BaseClass _this_) {
        return ((GovCT2) _this_).kigovToString();
    }

    /**
     * Load limiter integral gain for PI controller (Kiload).  Typical Value = 1.
     */
    private Double kiload; // PU

    public Double getKiload() {
        return kiload;
    }

    public void setKiload(Double _value_) {
        kiload = _value_;
    }

    public void setKiload(String _value_) {
        kiload = getDoubleFromString(_value_);
    }

    public String kiloadToString() {
        return kiload != null ? kiload.toString() : null;
    }

    private static void setKiload(BaseClass _this_, String _value_) {
        ((GovCT2) _this_).setKiload(_value_);
    }

    private static String kiloadToString(BaseClass _this_) {
        return ((GovCT2) _this_).kiloadToString();
    }

    /**
     * Power controller (reset) gain (Kimw).  The default value of 0.01 corresponds to a reset time of 100 seconds.  A value of 0.001 corresponds to a relatively slow acting load controller.  Typical Value = 0.
     */
    private Double kimw; // PU

    public Double getKimw() {
        return kimw;
    }

    public void setKimw(Double _value_) {
        kimw = _value_;
    }

    public void setKimw(String _value_) {
        kimw = getDoubleFromString(_value_);
    }

    public String kimwToString() {
        return kimw != null ? kimw.toString() : null;
    }

    private static void setKimw(BaseClass _this_, String _value_) {
        ((GovCT2) _this_).setKimw(_value_);
    }

    private static String kimwToString(BaseClass _this_) {
        return ((GovCT2) _this_).kimwToString();
    }

    /**
     * Governor proportional gain (Kpgov).  Typical Value = 4.
     */
    private Double kpgov; // PU

    public Double getKpgov() {
        return kpgov;
    }

    public void setKpgov(Double _value_) {
        kpgov = _value_;
    }

    public void setKpgov(String _value_) {
        kpgov = getDoubleFromString(_value_);
    }

    public String kpgovToString() {
        return kpgov != null ? kpgov.toString() : null;
    }

    private static void setKpgov(BaseClass _this_, String _value_) {
        ((GovCT2) _this_).setKpgov(_value_);
    }

    private static String kpgovToString(BaseClass _this_) {
        return ((GovCT2) _this_).kpgovToString();
    }

    /**
     * Load limiter proportional gain for PI controller (Kpload).  Typical Value = 1.
     */
    private Double kpload; // PU

    public Double getKpload() {
        return kpload;
    }

    public void setKpload(Double _value_) {
        kpload = _value_;
    }

    public void setKpload(String _value_) {
        kpload = getDoubleFromString(_value_);
    }

    public String kploadToString() {
        return kpload != null ? kpload.toString() : null;
    }

    private static void setKpload(BaseClass _this_, String _value_) {
        ((GovCT2) _this_).setKpload(_value_);
    }

    private static String kploadToString(BaseClass _this_) {
        return ((GovCT2) _this_).kploadToString();
    }

    /**
     * Turbine gain (Kturb).  Typical Value = 1.9168.
     */
    private Double kturb; // PU

    public Double getKturb() {
        return kturb;
    }

    public void setKturb(Double _value_) {
        kturb = _value_;
    }

    public void setKturb(String _value_) {
        kturb = getDoubleFromString(_value_);
    }

    public String kturbToString() {
        return kturb != null ? kturb.toString() : null;
    }

    private static void setKturb(BaseClass _this_, String _value_) {
        ((GovCT2) _this_).setKturb(_value_);
    }

    private static String kturbToString(BaseClass _this_) {
        return ((GovCT2) _this_).kturbToString();
    }

    /**
     * Load limiter reference value (Ldref).  Typical Value = 1.
     */
    private Double ldref; // PU

    public Double getLdref() {
        return ldref;
    }

    public void setLdref(Double _value_) {
        ldref = _value_;
    }

    public void setLdref(String _value_) {
        ldref = getDoubleFromString(_value_);
    }

    public String ldrefToString() {
        return ldref != null ? ldref.toString() : null;
    }

    private static void setLdref(BaseClass _this_, String _value_) {
        ((GovCT2) _this_).setLdref(_value_);
    }

    private static String ldrefToString(BaseClass _this_) {
        return ((GovCT2) _this_).ldrefToString();
    }

    /**
     * Maximum value for speed error signal (Maxerr).  Typical Value = 1.
     */
    private Double maxerr; // PU

    public Double getMaxerr() {
        return maxerr;
    }

    public void setMaxerr(Double _value_) {
        maxerr = _value_;
    }

    public void setMaxerr(String _value_) {
        maxerr = getDoubleFromString(_value_);
    }

    public String maxerrToString() {
        return maxerr != null ? maxerr.toString() : null;
    }

    private static void setMaxerr(BaseClass _this_, String _value_) {
        ((GovCT2) _this_).setMaxerr(_value_);
    }

    private static String maxerrToString(BaseClass _this_) {
        return ((GovCT2) _this_).maxerrToString();
    }

    /**
     * Minimum value for speed error signal (Minerr).  Typical Value = -1.
     */
    private Double minerr; // PU

    public Double getMinerr() {
        return minerr;
    }

    public void setMinerr(Double _value_) {
        minerr = _value_;
    }

    public void setMinerr(String _value_) {
        minerr = getDoubleFromString(_value_);
    }

    public String minerrToString() {
        return minerr != null ? minerr.toString() : null;
    }

    private static void setMinerr(BaseClass _this_, String _value_) {
        ((GovCT2) _this_).setMinerr(_value_);
    }

    private static String minerrToString(BaseClass _this_) {
        return ((GovCT2) _this_).minerrToString();
    }

    /**
     * Base for power values (MWbase) (&gt; 0).  Unit = MW.
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
        ((GovCT2) _this_).setMwbase(_value_);
    }

    private static String mwbaseToString(BaseClass _this_) {
        return ((GovCT2) _this_).mwbaseToString();
    }

    /**
     * Power limit 1 (Plim1).  Typical Value = 0.8325.
     */
    private Double plim1; // PU

    public Double getPlim1() {
        return plim1;
    }

    public void setPlim1(Double _value_) {
        plim1 = _value_;
    }

    public void setPlim1(String _value_) {
        plim1 = getDoubleFromString(_value_);
    }

    public String plim1ToString() {
        return plim1 != null ? plim1.toString() : null;
    }

    private static void setPlim1(BaseClass _this_, String _value_) {
        ((GovCT2) _this_).setPlim1(_value_);
    }

    private static String plim1ToString(BaseClass _this_) {
        return ((GovCT2) _this_).plim1ToString();
    }

    /**
     * Power limit 10 (Plim10).  Typical Value = 0.
     */
    private Double plim10; // PU

    public Double getPlim10() {
        return plim10;
    }

    public void setPlim10(Double _value_) {
        plim10 = _value_;
    }

    public void setPlim10(String _value_) {
        plim10 = getDoubleFromString(_value_);
    }

    public String plim10ToString() {
        return plim10 != null ? plim10.toString() : null;
    }

    private static void setPlim10(BaseClass _this_, String _value_) {
        ((GovCT2) _this_).setPlim10(_value_);
    }

    private static String plim10ToString(BaseClass _this_) {
        return ((GovCT2) _this_).plim10ToString();
    }

    /**
     * Power limit 2 (Plim2).  Typical Value = 0.
     */
    private Double plim2; // PU

    public Double getPlim2() {
        return plim2;
    }

    public void setPlim2(Double _value_) {
        plim2 = _value_;
    }

    public void setPlim2(String _value_) {
        plim2 = getDoubleFromString(_value_);
    }

    public String plim2ToString() {
        return plim2 != null ? plim2.toString() : null;
    }

    private static void setPlim2(BaseClass _this_, String _value_) {
        ((GovCT2) _this_).setPlim2(_value_);
    }

    private static String plim2ToString(BaseClass _this_) {
        return ((GovCT2) _this_).plim2ToString();
    }

    /**
     * Power limit 3 (Plim3).  Typical Value = 0.
     */
    private Double plim3; // PU

    public Double getPlim3() {
        return plim3;
    }

    public void setPlim3(Double _value_) {
        plim3 = _value_;
    }

    public void setPlim3(String _value_) {
        plim3 = getDoubleFromString(_value_);
    }

    public String plim3ToString() {
        return plim3 != null ? plim3.toString() : null;
    }

    private static void setPlim3(BaseClass _this_, String _value_) {
        ((GovCT2) _this_).setPlim3(_value_);
    }

    private static String plim3ToString(BaseClass _this_) {
        return ((GovCT2) _this_).plim3ToString();
    }

    /**
     * Power limit 4 (Plim4).  Typical Value = 0.
     */
    private Double plim4; // PU

    public Double getPlim4() {
        return plim4;
    }

    public void setPlim4(Double _value_) {
        plim4 = _value_;
    }

    public void setPlim4(String _value_) {
        plim4 = getDoubleFromString(_value_);
    }

    public String plim4ToString() {
        return plim4 != null ? plim4.toString() : null;
    }

    private static void setPlim4(BaseClass _this_, String _value_) {
        ((GovCT2) _this_).setPlim4(_value_);
    }

    private static String plim4ToString(BaseClass _this_) {
        return ((GovCT2) _this_).plim4ToString();
    }

    /**
     * Power limit 5 (Plim5).  Typical Value = 0.
     */
    private Double plim5; // PU

    public Double getPlim5() {
        return plim5;
    }

    public void setPlim5(Double _value_) {
        plim5 = _value_;
    }

    public void setPlim5(String _value_) {
        plim5 = getDoubleFromString(_value_);
    }

    public String plim5ToString() {
        return plim5 != null ? plim5.toString() : null;
    }

    private static void setPlim5(BaseClass _this_, String _value_) {
        ((GovCT2) _this_).setPlim5(_value_);
    }

    private static String plim5ToString(BaseClass _this_) {
        return ((GovCT2) _this_).plim5ToString();
    }

    /**
     * Power limit 6 (Plim6).  Typical Value = 0.
     */
    private Double plim6; // PU

    public Double getPlim6() {
        return plim6;
    }

    public void setPlim6(Double _value_) {
        plim6 = _value_;
    }

    public void setPlim6(String _value_) {
        plim6 = getDoubleFromString(_value_);
    }

    public String plim6ToString() {
        return plim6 != null ? plim6.toString() : null;
    }

    private static void setPlim6(BaseClass _this_, String _value_) {
        ((GovCT2) _this_).setPlim6(_value_);
    }

    private static String plim6ToString(BaseClass _this_) {
        return ((GovCT2) _this_).plim6ToString();
    }

    /**
     * Power limit 7 (Plim7).  Typical Value = 0.
     */
    private Double plim7; // PU

    public Double getPlim7() {
        return plim7;
    }

    public void setPlim7(Double _value_) {
        plim7 = _value_;
    }

    public void setPlim7(String _value_) {
        plim7 = getDoubleFromString(_value_);
    }

    public String plim7ToString() {
        return plim7 != null ? plim7.toString() : null;
    }

    private static void setPlim7(BaseClass _this_, String _value_) {
        ((GovCT2) _this_).setPlim7(_value_);
    }

    private static String plim7ToString(BaseClass _this_) {
        return ((GovCT2) _this_).plim7ToString();
    }

    /**
     * Power limit 8 (Plim8).  Typical Value = 0.
     */
    private Double plim8; // PU

    public Double getPlim8() {
        return plim8;
    }

    public void setPlim8(Double _value_) {
        plim8 = _value_;
    }

    public void setPlim8(String _value_) {
        plim8 = getDoubleFromString(_value_);
    }

    public String plim8ToString() {
        return plim8 != null ? plim8.toString() : null;
    }

    private static void setPlim8(BaseClass _this_, String _value_) {
        ((GovCT2) _this_).setPlim8(_value_);
    }

    private static String plim8ToString(BaseClass _this_) {
        return ((GovCT2) _this_).plim8ToString();
    }

    /**
     * Power Limit 9 (Plim9).  Typical Value = 0.
     */
    private Double plim9; // PU

    public Double getPlim9() {
        return plim9;
    }

    public void setPlim9(Double _value_) {
        plim9 = _value_;
    }

    public void setPlim9(String _value_) {
        plim9 = getDoubleFromString(_value_);
    }

    public String plim9ToString() {
        return plim9 != null ? plim9.toString() : null;
    }

    private static void setPlim9(BaseClass _this_, String _value_) {
        ((GovCT2) _this_).setPlim9(_value_);
    }

    private static String plim9ToString(BaseClass _this_) {
        return ((GovCT2) _this_).plim9ToString();
    }

    /**
     * Ramp rate for frequency-dependent power limit (Prate).  Typical Value = 0.017.
     */
    private Double prate; // PU

    public Double getPrate() {
        return prate;
    }

    public void setPrate(Double _value_) {
        prate = _value_;
    }

    public void setPrate(String _value_) {
        prate = getDoubleFromString(_value_);
    }

    public String prateToString() {
        return prate != null ? prate.toString() : null;
    }

    private static void setPrate(BaseClass _this_, String _value_) {
        ((GovCT2) _this_).setPrate(_value_);
    }

    private static String prateToString(BaseClass _this_) {
        return ((GovCT2) _this_).prateToString();
    }

    /**
     * Permanent droop (R).  Typical Value = 0.05.
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
        ((GovCT2) _this_).setR(_value_);
    }

    private static String rToString(BaseClass _this_) {
        return ((GovCT2) _this_).rToString();
    }

    /**
     * Minimum valve closing rate (Rclose).  Unit = PU/sec.  Typical Value = -99.
     */
    private Double rclose; // Simple_Float

    public Double getRclose() {
        return rclose;
    }

    public void setRclose(Double _value_) {
        rclose = _value_;
    }

    public void setRclose(String _value_) {
        rclose = getDoubleFromString(_value_);
    }

    public String rcloseToString() {
        return rclose != null ? rclose.toString() : null;
    }

    private static void setRclose(BaseClass _this_, String _value_) {
        ((GovCT2) _this_).setRclose(_value_);
    }

    private static String rcloseToString(BaseClass _this_) {
        return ((GovCT2) _this_).rcloseToString();
    }

    /**
     * Maximum rate of load limit decrease (Rdown).  Typical Value = -99.
     */
    private Double rdown; // PU

    public Double getRdown() {
        return rdown;
    }

    public void setRdown(Double _value_) {
        rdown = _value_;
    }

    public void setRdown(String _value_) {
        rdown = getDoubleFromString(_value_);
    }

    public String rdownToString() {
        return rdown != null ? rdown.toString() : null;
    }

    private static void setRdown(BaseClass _this_, String _value_) {
        ((GovCT2) _this_).setRdown(_value_);
    }

    private static String rdownToString(BaseClass _this_) {
        return ((GovCT2) _this_).rdownToString();
    }

    /**
     * Maximum valve opening rate (Ropen).  Unit = PU/sec.  Typical Value = 99.
     */
    private Double ropen; // Simple_Float

    public Double getRopen() {
        return ropen;
    }

    public void setRopen(Double _value_) {
        ropen = _value_;
    }

    public void setRopen(String _value_) {
        ropen = getDoubleFromString(_value_);
    }

    public String ropenToString() {
        return ropen != null ? ropen.toString() : null;
    }

    private static void setRopen(BaseClass _this_, String _value_) {
        ((GovCT2) _this_).setRopen(_value_);
    }

    private static String ropenToString(BaseClass _this_) {
        return ((GovCT2) _this_).ropenToString();
    }

    /**
     * Feedback signal for droop (Rselect).  Typical Value = electricalPower.
     */
    private String rselect; // DroopSignalFeedbackKind

    public String getRselect() {
        return rselect;
    }

    public void setRselect(String _value_) {
        rselect = _value_;
    }

    public String rselectToString() {
        return rselect;
    }

    private static void setRselect(BaseClass _this_, String _value_) {
        ((GovCT2) _this_).setRselect(_value_);
    }

    private static String rselectToString(BaseClass _this_) {
        return ((GovCT2) _this_).rselectToString();
    }

    /**
     * Maximum rate of load limit increase (Rup).  Typical Value = 99.
     */
    private Double rup; // PU

    public Double getRup() {
        return rup;
    }

    public void setRup(Double _value_) {
        rup = _value_;
    }

    public void setRup(String _value_) {
        rup = getDoubleFromString(_value_);
    }

    public String rupToString() {
        return rup != null ? rup.toString() : null;
    }

    private static void setRup(BaseClass _this_, String _value_) {
        ((GovCT2) _this_).setRup(_value_);
    }

    private static String rupToString(BaseClass _this_) {
        return ((GovCT2) _this_).rupToString();
    }

    /**
     * Acceleration limiter time constant (Ta).  Typical Value = 1.
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
        ((GovCT2) _this_).setTa(_value_);
    }

    private static String taToString(BaseClass _this_) {
        return ((GovCT2) _this_).taToString();
    }

    /**
     * Actuator time constant (Tact).  Typical Value = 0.4.
     */
    private Double tact; // Seconds

    public Double getTact() {
        return tact;
    }

    public void setTact(Double _value_) {
        tact = _value_;
    }

    public void setTact(String _value_) {
        tact = getDoubleFromString(_value_);
    }

    public String tactToString() {
        return tact != null ? tact.toString() : null;
    }

    private static void setTact(BaseClass _this_, String _value_) {
        ((GovCT2) _this_).setTact(_value_);
    }

    private static String tactToString(BaseClass _this_) {
        return ((GovCT2) _this_).tactToString();
    }

    /**
     * Turbine lag time constant (Tb).  Typical Value = 0.1.
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
        ((GovCT2) _this_).setTb(_value_);
    }

    private static String tbToString(BaseClass _this_) {
        return ((GovCT2) _this_).tbToString();
    }

    /**
     * Turbine lead time constant (Tc).  Typical Value = 0.
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
        ((GovCT2) _this_).setTc(_value_);
    }

    private static String tcToString(BaseClass _this_) {
        return ((GovCT2) _this_).tcToString();
    }

    /**
     * Governor derivative controller time constant (Tdgov).  Typical Value = 1.
     */
    private Double tdgov; // Seconds

    public Double getTdgov() {
        return tdgov;
    }

    public void setTdgov(Double _value_) {
        tdgov = _value_;
    }

    public void setTdgov(String _value_) {
        tdgov = getDoubleFromString(_value_);
    }

    public String tdgovToString() {
        return tdgov != null ? tdgov.toString() : null;
    }

    private static void setTdgov(BaseClass _this_, String _value_) {
        ((GovCT2) _this_).setTdgov(_value_);
    }

    private static String tdgovToString(BaseClass _this_) {
        return ((GovCT2) _this_).tdgovToString();
    }

    /**
     * Transport time delay for diesel engine used in representing diesel engines where there is a small but measurable transport delay between a change in fuel flow setting and the development of torque (Teng).  Teng should be zero in all but special cases where this transport delay is of particular concern.  Typical Value = 0.
     */
    private Double teng; // Seconds

    public Double getTeng() {
        return teng;
    }

    public void setTeng(Double _value_) {
        teng = _value_;
    }

    public void setTeng(String _value_) {
        teng = getDoubleFromString(_value_);
    }

    public String tengToString() {
        return teng != null ? teng.toString() : null;
    }

    private static void setTeng(BaseClass _this_, String _value_) {
        ((GovCT2) _this_).setTeng(_value_);
    }

    private static String tengToString(BaseClass _this_) {
        return ((GovCT2) _this_).tengToString();
    }

    /**
     * Load Limiter time constant (Tfload).  Typical Value = 3.
     */
    private Double tfload; // Seconds

    public Double getTfload() {
        return tfload;
    }

    public void setTfload(Double _value_) {
        tfload = _value_;
    }

    public void setTfload(String _value_) {
        tfload = getDoubleFromString(_value_);
    }

    public String tfloadToString() {
        return tfload != null ? tfload.toString() : null;
    }

    private static void setTfload(BaseClass _this_, String _value_) {
        ((GovCT2) _this_).setTfload(_value_);
    }

    private static String tfloadToString(BaseClass _this_) {
        return ((GovCT2) _this_).tfloadToString();
    }

    /**
     * Electrical power transducer time constant (Tpelec).  Typical Value = 2.5.
     */
    private Double tpelec; // Seconds

    public Double getTpelec() {
        return tpelec;
    }

    public void setTpelec(Double _value_) {
        tpelec = _value_;
    }

    public void setTpelec(String _value_) {
        tpelec = getDoubleFromString(_value_);
    }

    public String tpelecToString() {
        return tpelec != null ? tpelec.toString() : null;
    }

    private static void setTpelec(BaseClass _this_, String _value_) {
        ((GovCT2) _this_).setTpelec(_value_);
    }

    private static String tpelecToString(BaseClass _this_) {
        return ((GovCT2) _this_).tpelecToString();
    }

    /**
     * Temperature detection lead time constant (Tsa).  Typical Value = 0.
     */
    private Double tsa; // Seconds

    public Double getTsa() {
        return tsa;
    }

    public void setTsa(Double _value_) {
        tsa = _value_;
    }

    public void setTsa(String _value_) {
        tsa = getDoubleFromString(_value_);
    }

    public String tsaToString() {
        return tsa != null ? tsa.toString() : null;
    }

    private static void setTsa(BaseClass _this_, String _value_) {
        ((GovCT2) _this_).setTsa(_value_);
    }

    private static String tsaToString(BaseClass _this_) {
        return ((GovCT2) _this_).tsaToString();
    }

    /**
     * Temperature detection lag time constant (Tsb).  Typical Value = 50.
     */
    private Double tsb; // Seconds

    public Double getTsb() {
        return tsb;
    }

    public void setTsb(Double _value_) {
        tsb = _value_;
    }

    public void setTsb(String _value_) {
        tsb = getDoubleFromString(_value_);
    }

    public String tsbToString() {
        return tsb != null ? tsb.toString() : null;
    }

    private static void setTsb(BaseClass _this_, String _value_) {
        ((GovCT2) _this_).setTsb(_value_);
    }

    private static String tsbToString(BaseClass _this_) {
        return ((GovCT2) _this_).tsbToString();
    }

    /**
     * Maximum valve position limit (Vmax).  Typical Value = 1.
     */
    private Double vmax; // PU

    public Double getVmax() {
        return vmax;
    }

    public void setVmax(Double _value_) {
        vmax = _value_;
    }

    public void setVmax(String _value_) {
        vmax = getDoubleFromString(_value_);
    }

    public String vmaxToString() {
        return vmax != null ? vmax.toString() : null;
    }

    private static void setVmax(BaseClass _this_, String _value_) {
        ((GovCT2) _this_).setVmax(_value_);
    }

    private static String vmaxToString(BaseClass _this_) {
        return ((GovCT2) _this_).vmaxToString();
    }

    /**
     * Minimum valve position limit (Vmin).  Typical Value = 0.175.
     */
    private Double vmin; // PU

    public Double getVmin() {
        return vmin;
    }

    public void setVmin(Double _value_) {
        vmin = _value_;
    }

    public void setVmin(String _value_) {
        vmin = getDoubleFromString(_value_);
    }

    public String vminToString() {
        return vmin != null ? vmin.toString() : null;
    }

    private static void setVmin(BaseClass _this_, String _value_) {
        ((GovCT2) _this_).setVmin(_value_);
    }

    private static String vminToString(BaseClass _this_) {
        return ((GovCT2) _this_).vminToString();
    }

    /**
     * No load fuel flow (Wfnl).  Typical Value = 0.187.
     */
    private Double wfnl; // PU

    public Double getWfnl() {
        return wfnl;
    }

    public void setWfnl(Double _value_) {
        wfnl = _value_;
    }

    public void setWfnl(String _value_) {
        wfnl = getDoubleFromString(_value_);
    }

    public String wfnlToString() {
        return wfnl != null ? wfnl.toString() : null;
    }

    private static void setWfnl(BaseClass _this_, String _value_) {
        ((GovCT2) _this_).setWfnl(_value_);
    }

    private static String wfnlToString(BaseClass _this_) {
        return ((GovCT2) _this_).wfnlToString();
    }

    /**
     * Switch for fuel source characteristic to recognize that fuel flow, for a given fuel valve stroke, can be proportional to engine speed (Wfspd). true = fuel flow proportional to speed (for some gas turbines and diesel engines with positive displacement fuel injectors) false = fuel control system keeps fuel flow independent of engine speed. Typical Value = false.
     */
    private Boolean wfspd; // Boolean

    public Boolean getWfspd() {
        return wfspd;
    }

    public void setWfspd(Boolean _value_) {
        wfspd = _value_;
    }

    public void setWfspd(String _value_) {
        wfspd = getBooleanFromString(_value_);
    }

    public String wfspdToString() {
        return wfspd != null ? wfspd.toString() : null;
    }

    private static void setWfspd(BaseClass _this_, String _value_) {
        ((GovCT2) _this_).setWfspd(_value_);
    }

    private static String wfspdToString(BaseClass _this_) {
        return ((GovCT2) _this_).wfspdToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "GovCT2", attrName));
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
                "GovCT2", attrName, objectValue));
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
                "GovCT2", attrName, stringValue));
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
            map.put("aset", new AttrDetails("GovCT2.aset", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::asetToString, null, GovCT2::setAset));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("db", new AttrDetails("GovCT2.db", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::dbToString, null, GovCT2::setDb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dm", new AttrDetails("GovCT2.dm", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::dmToString, null, GovCT2::setDm));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("flim1", new AttrDetails("GovCT2.flim1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::flim1ToString, null, GovCT2::setFlim1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("flim10", new AttrDetails("GovCT2.flim10", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::flim10ToString, null, GovCT2::setFlim10));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("flim2", new AttrDetails("GovCT2.flim2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::flim2ToString, null, GovCT2::setFlim2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("flim3", new AttrDetails("GovCT2.flim3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::flim3ToString, null, GovCT2::setFlim3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("flim4", new AttrDetails("GovCT2.flim4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::flim4ToString, null, GovCT2::setFlim4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("flim5", new AttrDetails("GovCT2.flim5", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::flim5ToString, null, GovCT2::setFlim5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("flim6", new AttrDetails("GovCT2.flim6", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::flim6ToString, null, GovCT2::setFlim6));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("flim7", new AttrDetails("GovCT2.flim7", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::flim7ToString, null, GovCT2::setFlim7));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("flim8", new AttrDetails("GovCT2.flim8", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::flim8ToString, null, GovCT2::setFlim8));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("flim9", new AttrDetails("GovCT2.flim9", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::flim9ToString, null, GovCT2::setFlim9));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ka", new AttrDetails("GovCT2.ka", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::kaToString, null, GovCT2::setKa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kdgov", new AttrDetails("GovCT2.kdgov", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::kdgovToString, null, GovCT2::setKdgov));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kigov", new AttrDetails("GovCT2.kigov", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::kigovToString, null, GovCT2::setKigov));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kiload", new AttrDetails("GovCT2.kiload", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::kiloadToString, null, GovCT2::setKiload));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kimw", new AttrDetails("GovCT2.kimw", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::kimwToString, null, GovCT2::setKimw));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpgov", new AttrDetails("GovCT2.kpgov", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::kpgovToString, null, GovCT2::setKpgov));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpload", new AttrDetails("GovCT2.kpload", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::kploadToString, null, GovCT2::setKpload));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kturb", new AttrDetails("GovCT2.kturb", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::kturbToString, null, GovCT2::setKturb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ldref", new AttrDetails("GovCT2.ldref", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::ldrefToString, null, GovCT2::setLdref));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("maxerr", new AttrDetails("GovCT2.maxerr", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::maxerrToString, null, GovCT2::setMaxerr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("minerr", new AttrDetails("GovCT2.minerr", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::minerrToString, null, GovCT2::setMinerr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mwbase", new AttrDetails("GovCT2.mwbase", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::mwbaseToString, null, GovCT2::setMwbase));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("plim1", new AttrDetails("GovCT2.plim1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::plim1ToString, null, GovCT2::setPlim1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("plim10", new AttrDetails("GovCT2.plim10", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::plim10ToString, null, GovCT2::setPlim10));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("plim2", new AttrDetails("GovCT2.plim2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::plim2ToString, null, GovCT2::setPlim2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("plim3", new AttrDetails("GovCT2.plim3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::plim3ToString, null, GovCT2::setPlim3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("plim4", new AttrDetails("GovCT2.plim4", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::plim4ToString, null, GovCT2::setPlim4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("plim5", new AttrDetails("GovCT2.plim5", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::plim5ToString, null, GovCT2::setPlim5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("plim6", new AttrDetails("GovCT2.plim6", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::plim6ToString, null, GovCT2::setPlim6));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("plim7", new AttrDetails("GovCT2.plim7", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::plim7ToString, null, GovCT2::setPlim7));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("plim8", new AttrDetails("GovCT2.plim8", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::plim8ToString, null, GovCT2::setPlim8));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("plim9", new AttrDetails("GovCT2.plim9", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::plim9ToString, null, GovCT2::setPlim9));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("prate", new AttrDetails("GovCT2.prate", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::prateToString, null, GovCT2::setPrate));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("r", new AttrDetails("GovCT2.r", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::rToString, null, GovCT2::setR));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rclose", new AttrDetails("GovCT2.rclose", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::rcloseToString, null, GovCT2::setRclose));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rdown", new AttrDetails("GovCT2.rdown", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::rdownToString, null, GovCT2::setRdown));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ropen", new AttrDetails("GovCT2.ropen", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::ropenToString, null, GovCT2::setRopen));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rselect", new AttrDetails("GovCT2.rselect", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true, GovCT2::rselectToString, null, GovCT2::setRselect));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rup", new AttrDetails("GovCT2.rup", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::rupToString, null, GovCT2::setRup));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ta", new AttrDetails("GovCT2.ta", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::taToString, null, GovCT2::setTa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tact", new AttrDetails("GovCT2.tact", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::tactToString, null, GovCT2::setTact));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tb", new AttrDetails("GovCT2.tb", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::tbToString, null, GovCT2::setTb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tc", new AttrDetails("GovCT2.tc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::tcToString, null, GovCT2::setTc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tdgov", new AttrDetails("GovCT2.tdgov", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::tdgovToString, null, GovCT2::setTdgov));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("teng", new AttrDetails("GovCT2.teng", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::tengToString, null, GovCT2::setTeng));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tfload", new AttrDetails("GovCT2.tfload", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::tfloadToString, null, GovCT2::setTfload));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tpelec", new AttrDetails("GovCT2.tpelec", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::tpelecToString, null, GovCT2::setTpelec));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tsa", new AttrDetails("GovCT2.tsa", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::tsaToString, null, GovCT2::setTsa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tsb", new AttrDetails("GovCT2.tsb", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::tsbToString, null, GovCT2::setTsb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vmax", new AttrDetails("GovCT2.vmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::vmaxToString, null, GovCT2::setVmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vmin", new AttrDetails("GovCT2.vmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::vminToString, null, GovCT2::setVmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("wfnl", new AttrDetails("GovCT2.wfnl", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::wfnlToString, null, GovCT2::setWfnl));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("wfspd", new AttrDetails("GovCT2.wfspd", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovCT2::wfspdToString, null, GovCT2::setWfspd));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new GovCT2(null).allAttrDetailsMap());
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
