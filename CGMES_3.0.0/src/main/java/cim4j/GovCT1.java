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
 * General model for any prime mover with a PID governor, used primarily for combustion turbine and combined cycle units. This model can be used to represent a variety of prime movers controlled by PID governors.  It is suitable, for example, for the representation of:  <ul> 	<li>gas turbine and single shaft combined cycle turbines</li> </ul> <ul> 	<li>diesel engines with modern electronic or digital governors  </li> </ul> <ul> 	<li>steam turbines where steam is supplied from a large boiler drum or a large header whose pressure is substantially constant over the period under study</li> 	<li>simple hydro turbines in dam configurations where the water column length is short and water inertia effects are minimal.</li> </ul> Additional information on this model is available in the 2012 IEEE report, <i><u>Dynamic Models for Turbine-Governors in Power System Studies</u></i>, 3.1.2.3 pages 3-4 (GGOV1).
 */
@SuppressWarnings("unused")
public class GovCT1 extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovCT1.class);

    /**
     * Default constructor.
     */
    public GovCT1() {
        setCimType("GovCT1");
    }

    /**
     * Acceleration limiter setpoint (&lt;i&gt;Aset&lt;/i&gt;).  Unit = PU / s.  Typical value = 0,01.
     */
    private Float aset; // Float

    public Float getAset() {
        return aset;
    }

    public void setAset(Float _value_) {
        aset = _value_;
    }

    public void setAset(String _value_) {
        aset = getFloatFromString(_value_);
    }

    public String asetToString() {
        return aset != null ? aset.toString() : null;
    }

    private static void setAset(BaseClass _this_, String _value_) {
        ((GovCT1) _this_).setAset(_value_);
    }

    private static String asetToString(BaseClass _this_) {
        return ((GovCT1) _this_).asetToString();
    }

    /**
     * Speed governor deadband in PU speed (&lt;i&gt;db&lt;/i&gt;).  In the majority of applications, it is recommended that this value be set to zero.  Typical value = 0.
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
        ((GovCT1) _this_).setDb(_value_);
    }

    private static String dbToString(BaseClass _this_) {
        return ((GovCT1) _this_).dbToString();
    }

    /**
     * Speed sensitivity coefficient (&lt;i&gt;Dm&lt;/i&gt;).  &lt;i&gt;Dm&lt;/i&gt; can represent either the variation of the engine power with the shaft speed or the variation of maximum power capability with shaft speed.  If it is positive it describes the falling slope of the engine speed verses power characteristic as speed increases. A slightly falling characteristic is typical for reciprocating engines and some aero-derivative turbines.  If it is negative the engine power is assumed to be unaffected by the shaft speed, but the maximum permissible fuel flow is taken to fall with falling shaft speed. This is characteristic of single-shaft industrial turbines due to exhaust temperature limits.  Typical value = 0.
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
        ((GovCT1) _this_).setDm(_value_);
    }

    private static String dmToString(BaseClass _this_) {
        return ((GovCT1) _this_).dmToString();
    }

    /**
     * Acceleration limiter gain (&lt;i&gt;Ka&lt;/i&gt;).  Typical value = 10.
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
        ((GovCT1) _this_).setKa(_value_);
    }

    private static String kaToString(BaseClass _this_) {
        return ((GovCT1) _this_).kaToString();
    }

    /**
     * Governor derivative gain (&lt;i&gt;Kdgov&lt;/i&gt;).  Typical value = 0.
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
        ((GovCT1) _this_).setKdgov(_value_);
    }

    private static String kdgovToString(BaseClass _this_) {
        return ((GovCT1) _this_).kdgovToString();
    }

    /**
     * Governor integral gain (&lt;i&gt;Kigov&lt;/i&gt;).  Typical value = 2.
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
        ((GovCT1) _this_).setKigov(_value_);
    }

    private static String kigovToString(BaseClass _this_) {
        return ((GovCT1) _this_).kigovToString();
    }

    /**
     * Load limiter integral gain for PI controller (&lt;i&gt;Kiload&lt;/i&gt;).  Typical value = 0,67.
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
        ((GovCT1) _this_).setKiload(_value_);
    }

    private static String kiloadToString(BaseClass _this_) {
        return ((GovCT1) _this_).kiloadToString();
    }

    /**
     * Power controller (reset) gain (&lt;i&gt;Kimw&lt;/i&gt;).  The default value of 0,01 corresponds to a reset time of 100 s.  A value of 0,001 corresponds to a relatively slow-acting load controller.  Typical value = 0,01.
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
        ((GovCT1) _this_).setKimw(_value_);
    }

    private static String kimwToString(BaseClass _this_) {
        return ((GovCT1) _this_).kimwToString();
    }

    /**
     * Governor proportional gain (&lt;i&gt;Kpgov&lt;/i&gt;).  Typical value = 10.
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
        ((GovCT1) _this_).setKpgov(_value_);
    }

    private static String kpgovToString(BaseClass _this_) {
        return ((GovCT1) _this_).kpgovToString();
    }

    /**
     * Load limiter proportional gain for PI controller (&lt;i&gt;Kpload&lt;/i&gt;).  Typical value = 2.
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
        ((GovCT1) _this_).setKpload(_value_);
    }

    private static String kploadToString(BaseClass _this_) {
        return ((GovCT1) _this_).kploadToString();
    }

    /**
     * Turbine gain (&lt;i&gt;Kturb&lt;/i&gt;) (&amp;gt; 0).  Typical value = 1,5.
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
        ((GovCT1) _this_).setKturb(_value_);
    }

    private static String kturbToString(BaseClass _this_) {
        return ((GovCT1) _this_).kturbToString();
    }

    /**
     * Load limiter reference value (&lt;i&gt;Ldref&lt;/i&gt;).  Typical value = 1.
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
        ((GovCT1) _this_).setLdref(_value_);
    }

    private static String ldrefToString(BaseClass _this_) {
        return ((GovCT1) _this_).ldrefToString();
    }

    /**
     * Maximum value for speed error signal (&lt;i&gt;maxerr&lt;/i&gt;) (&amp;gt; GovCT1.minerr).  Typical value = 0,05.
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
        ((GovCT1) _this_).setMaxerr(_value_);
    }

    private static String maxerrToString(BaseClass _this_) {
        return ((GovCT1) _this_).maxerrToString();
    }

    /**
     * Minimum value for speed error signal (&lt;i&gt;minerr&lt;/i&gt;) (&amp;lt; GovCT1.maxerr).  Typical value = -0,05.
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
        ((GovCT1) _this_).setMinerr(_value_);
    }

    private static String minerrToString(BaseClass _this_) {
        return ((GovCT1) _this_).minerrToString();
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
        ((GovCT1) _this_).setMwbase(_value_);
    }

    private static String mwbaseToString(BaseClass _this_) {
        return ((GovCT1) _this_).mwbaseToString();
    }

    /**
     * Permanent droop (&lt;i&gt;R&lt;/i&gt;).  Typical value = 0,04.
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
        ((GovCT1) _this_).setR(_value_);
    }

    private static String rToString(BaseClass _this_) {
        return ((GovCT1) _this_).rToString();
    }

    /**
     * Minimum valve closing rate (&lt;i&gt;Rclose&lt;/i&gt;).  Unit = PU / s.  Typical value = -0,1.
     */
    private Float rclose; // Float

    public Float getRclose() {
        return rclose;
    }

    public void setRclose(Float _value_) {
        rclose = _value_;
    }

    public void setRclose(String _value_) {
        rclose = getFloatFromString(_value_);
    }

    public String rcloseToString() {
        return rclose != null ? rclose.toString() : null;
    }

    private static void setRclose(BaseClass _this_, String _value_) {
        ((GovCT1) _this_).setRclose(_value_);
    }

    private static String rcloseToString(BaseClass _this_) {
        return ((GovCT1) _this_).rcloseToString();
    }

    /**
     * Maximum rate of load limit decrease (&lt;i&gt;Rdown&lt;/i&gt;).  Typical value = -99.
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
        ((GovCT1) _this_).setRdown(_value_);
    }

    private static String rdownToString(BaseClass _this_) {
        return ((GovCT1) _this_).rdownToString();
    }

    /**
     * Maximum valve opening rate (&lt;i&gt;Ropen&lt;/i&gt;).  Unit = PU / s.  Typical value = 0.10.
     */
    private Float ropen; // Float

    public Float getRopen() {
        return ropen;
    }

    public void setRopen(Float _value_) {
        ropen = _value_;
    }

    public void setRopen(String _value_) {
        ropen = getFloatFromString(_value_);
    }

    public String ropenToString() {
        return ropen != null ? ropen.toString() : null;
    }

    private static void setRopen(BaseClass _this_, String _value_) {
        ((GovCT1) _this_).setRopen(_value_);
    }

    private static String ropenToString(BaseClass _this_) {
        return ((GovCT1) _this_).ropenToString();
    }

    /**
     * Feedback signal for droop (&lt;i&gt;Rselect&lt;/i&gt;).  Typical value = electricalPower.
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
        ((GovCT1) _this_).setRselect(_value_);
    }

    private static String rselectToString(BaseClass _this_) {
        return ((GovCT1) _this_).rselectToString();
    }

    /**
     * Maximum rate of load limit increase (&lt;i&gt;Rup&lt;/i&gt;).  Typical value = 99.
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
        ((GovCT1) _this_).setRup(_value_);
    }

    private static String rupToString(BaseClass _this_) {
        return ((GovCT1) _this_).rupToString();
    }

    /**
     * Acceleration limiter time constant (&lt;i&gt;Ta&lt;/i&gt;) (&amp;gt; 0).  Typical value = 0,1.
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
        ((GovCT1) _this_).setTa(_value_);
    }

    private static String taToString(BaseClass _this_) {
        return ((GovCT1) _this_).taToString();
    }

    /**
     * Actuator time constant (&lt;i&gt;Tact&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,5.
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
        ((GovCT1) _this_).setTact(_value_);
    }

    private static String tactToString(BaseClass _this_) {
        return ((GovCT1) _this_).tactToString();
    }

    /**
     * Turbine lag time constant (&lt;i&gt;Tb&lt;/i&gt;) (&amp;gt; 0).  Typical value = 0,5.
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
        ((GovCT1) _this_).setTb(_value_);
    }

    private static String tbToString(BaseClass _this_) {
        return ((GovCT1) _this_).tbToString();
    }

    /**
     * Turbine lead time constant (&lt;i&gt;Tc&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
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
        ((GovCT1) _this_).setTc(_value_);
    }

    private static String tcToString(BaseClass _this_) {
        return ((GovCT1) _this_).tcToString();
    }

    /**
     * Governor derivative controller time constant (&lt;i&gt;Tdgov&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 1.
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
        ((GovCT1) _this_).setTdgov(_value_);
    }

    private static String tdgovToString(BaseClass _this_) {
        return ((GovCT1) _this_).tdgovToString();
    }

    /**
     * Transport time delay for diesel engine used in representing diesel engines where there is a small but measurable transport delay between a change in fuel flow setting and the development of torque (&lt;i&gt;Teng&lt;/i&gt;) (&amp;gt;= 0).  &lt;i&gt;Teng&lt;/i&gt; should be zero in all but special cases where this transport delay is of particular concern.  Typical value = 0.
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
        ((GovCT1) _this_).setTeng(_value_);
    }

    private static String tengToString(BaseClass _this_) {
        return ((GovCT1) _this_).tengToString();
    }

    /**
     * Load-limiter time constant (&lt;i&gt;Tfload&lt;/i&gt;) (&amp;gt; 0).  Typical value = 3.
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
        ((GovCT1) _this_).setTfload(_value_);
    }

    private static String tfloadToString(BaseClass _this_) {
        return ((GovCT1) _this_).tfloadToString();
    }

    /**
     * Electrical power transducer time constant (&lt;i&gt;Tpelec&lt;/i&gt;) (&amp;gt; 0).  Typical value = 1.
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
        ((GovCT1) _this_).setTpelec(_value_);
    }

    private static String tpelecToString(BaseClass _this_) {
        return ((GovCT1) _this_).tpelecToString();
    }

    /**
     * Temperature detection lead time constant (&lt;i&gt;Tsa&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 4.
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
        ((GovCT1) _this_).setTsa(_value_);
    }

    private static String tsaToString(BaseClass _this_) {
        return ((GovCT1) _this_).tsaToString();
    }

    /**
     * Temperature detection lag time constant (&lt;i&gt;Tsb&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 5.
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
        ((GovCT1) _this_).setTsb(_value_);
    }

    private static String tsbToString(BaseClass _this_) {
        return ((GovCT1) _this_).tsbToString();
    }

    /**
     * Maximum valve position limit (&lt;i&gt;Vmax&lt;/i&gt;) (&amp;gt; GovCT1.vmin).  Typical value = 1.
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
        ((GovCT1) _this_).setVmax(_value_);
    }

    private static String vmaxToString(BaseClass _this_) {
        return ((GovCT1) _this_).vmaxToString();
    }

    /**
     * Minimum valve position limit (&lt;i&gt;Vmin&lt;/i&gt;) (&amp;lt; GovCT1.vmax).  Typical value = 0,15.
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
        ((GovCT1) _this_).setVmin(_value_);
    }

    private static String vminToString(BaseClass _this_) {
        return ((GovCT1) _this_).vminToString();
    }

    /**
     * No load fuel flow (&lt;i&gt;Wfnl&lt;/i&gt;).  Typical value = 0,2.
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
        ((GovCT1) _this_).setWfnl(_value_);
    }

    private static String wfnlToString(BaseClass _this_) {
        return ((GovCT1) _this_).wfnlToString();
    }

    /**
     * Switch for fuel source characteristic to recognize that fuel flow, for a given fuel valve stroke, can be proportional to engine speed (&lt;i&gt;Wfspd&lt;/i&gt;). true = fuel flow proportional to speed (for some gas turbines and diesel engines with positive displacement fuel injectors) false = fuel control system keeps fuel flow independent of engine speed. Typical value = true.
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
        ((GovCT1) _this_).setWfspd(_value_);
    }

    private static String wfspdToString(BaseClass _this_) {
        return ((GovCT1) _this_).wfspdToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "GovCT1", attrName));
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
                "GovCT1", attrName, objectValue));
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
                "GovCT1", attrName, stringValue));
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
            map.put("aset", new AttrDetails("GovCT1.aset", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::asetToString, null, GovCT1::setAset));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("db", new AttrDetails("GovCT1.db", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::dbToString, null, GovCT1::setDb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dm", new AttrDetails("GovCT1.dm", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::dmToString, null, GovCT1::setDm));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ka", new AttrDetails("GovCT1.ka", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::kaToString, null, GovCT1::setKa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kdgov", new AttrDetails("GovCT1.kdgov", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::kdgovToString, null, GovCT1::setKdgov));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kigov", new AttrDetails("GovCT1.kigov", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::kigovToString, null, GovCT1::setKigov));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kiload", new AttrDetails("GovCT1.kiload", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::kiloadToString, null, GovCT1::setKiload));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kimw", new AttrDetails("GovCT1.kimw", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::kimwToString, null, GovCT1::setKimw));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpgov", new AttrDetails("GovCT1.kpgov", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::kpgovToString, null, GovCT1::setKpgov));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpload", new AttrDetails("GovCT1.kpload", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::kploadToString, null, GovCT1::setKpload));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kturb", new AttrDetails("GovCT1.kturb", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::kturbToString, null, GovCT1::setKturb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ldref", new AttrDetails("GovCT1.ldref", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::ldrefToString, null, GovCT1::setLdref));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("maxerr", new AttrDetails("GovCT1.maxerr", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::maxerrToString, null, GovCT1::setMaxerr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("minerr", new AttrDetails("GovCT1.minerr", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::minerrToString, null, GovCT1::setMinerr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mwbase", new AttrDetails("GovCT1.mwbase", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::mwbaseToString, null, GovCT1::setMwbase));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("r", new AttrDetails("GovCT1.r", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::rToString, null, GovCT1::setR));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rclose", new AttrDetails("GovCT1.rclose", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::rcloseToString, null, GovCT1::setRclose));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rdown", new AttrDetails("GovCT1.rdown", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::rdownToString, null, GovCT1::setRdown));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ropen", new AttrDetails("GovCT1.ropen", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::ropenToString, null, GovCT1::setRopen));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rselect", new AttrDetails("GovCT1.rselect", true, "http://iec.ch/TC57/CIM100#", profiles, false, true, GovCT1::rselectToString, null, GovCT1::setRselect));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rup", new AttrDetails("GovCT1.rup", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::rupToString, null, GovCT1::setRup));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ta", new AttrDetails("GovCT1.ta", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::taToString, null, GovCT1::setTa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tact", new AttrDetails("GovCT1.tact", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::tactToString, null, GovCT1::setTact));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tb", new AttrDetails("GovCT1.tb", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::tbToString, null, GovCT1::setTb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tc", new AttrDetails("GovCT1.tc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::tcToString, null, GovCT1::setTc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tdgov", new AttrDetails("GovCT1.tdgov", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::tdgovToString, null, GovCT1::setTdgov));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("teng", new AttrDetails("GovCT1.teng", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::tengToString, null, GovCT1::setTeng));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tfload", new AttrDetails("GovCT1.tfload", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::tfloadToString, null, GovCT1::setTfload));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tpelec", new AttrDetails("GovCT1.tpelec", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::tpelecToString, null, GovCT1::setTpelec));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tsa", new AttrDetails("GovCT1.tsa", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::tsaToString, null, GovCT1::setTsa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tsb", new AttrDetails("GovCT1.tsb", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::tsbToString, null, GovCT1::setTsb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vmax", new AttrDetails("GovCT1.vmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::vmaxToString, null, GovCT1::setVmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vmin", new AttrDetails("GovCT1.vmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::vminToString, null, GovCT1::setVmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("wfnl", new AttrDetails("GovCT1.wfnl", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::wfnlToString, null, GovCT1::setWfnl));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("wfspd", new AttrDetails("GovCT1.wfspd", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovCT1::wfspdToString, null, GovCT1::setWfspd));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new GovCT1().allAttrDetailsMap());
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
