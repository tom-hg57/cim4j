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
 * Simplified model  of boiler and steam turbine with PID governor.
 */
@SuppressWarnings("unused")
public class GovSteamEU extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovSteamEU.class);

    /**
     * Default constructor.
     */
    public GovSteamEU() {
        setCimType("GovSteamEU");
    }

    /**
     * Control valves rate closing limit (Chc).  Unit = PU/sec.  Typical Value = -3.3.
     */
    private Double chc; // Simple_Float

    public Double getChc() {
        return chc;
    }

    public void setChc(Double _value_) {
        chc = _value_;
    }

    public void setChc(String _value_) {
        chc = getDoubleFromString(_value_);
    }

    public String chcToString() {
        return chc != null ? chc.toString() : null;
    }

    private static void setChc(BaseClass _this_, String _value_) {
        ((GovSteamEU) _this_).setChc(_value_);
    }

    private static String chcToString(BaseClass _this_) {
        return ((GovSteamEU) _this_).chcToString();
    }

    /**
     * Control valves rate opening limit (Cho).  Unit = PU/sec.  Typical Value = 0.17.
     */
    private Double cho; // Simple_Float

    public Double getCho() {
        return cho;
    }

    public void setCho(Double _value_) {
        cho = _value_;
    }

    public void setCho(String _value_) {
        cho = getDoubleFromString(_value_);
    }

    public String choToString() {
        return cho != null ? cho.toString() : null;
    }

    private static void setCho(BaseClass _this_, String _value_) {
        ((GovSteamEU) _this_).setCho(_value_);
    }

    private static String choToString(BaseClass _this_) {
        return ((GovSteamEU) _this_).choToString();
    }

    /**
     * Intercept valves rate closing limit (Cic).  Typical Value = -2.2.
     */
    private Double cic; // PU

    public Double getCic() {
        return cic;
    }

    public void setCic(Double _value_) {
        cic = _value_;
    }

    public void setCic(String _value_) {
        cic = getDoubleFromString(_value_);
    }

    public String cicToString() {
        return cic != null ? cic.toString() : null;
    }

    private static void setCic(BaseClass _this_, String _value_) {
        ((GovSteamEU) _this_).setCic(_value_);
    }

    private static String cicToString(BaseClass _this_) {
        return ((GovSteamEU) _this_).cicToString();
    }

    /**
     * Intercept valves rate opening limit (Cio).  Typical Value = 0.123.
     */
    private Double cio; // PU

    public Double getCio() {
        return cio;
    }

    public void setCio(Double _value_) {
        cio = _value_;
    }

    public void setCio(String _value_) {
        cio = getDoubleFromString(_value_);
    }

    public String cioToString() {
        return cio != null ? cio.toString() : null;
    }

    private static void setCio(BaseClass _this_, String _value_) {
        ((GovSteamEU) _this_).setCio(_value_);
    }

    private static String cioToString(BaseClass _this_) {
        return ((GovSteamEU) _this_).cioToString();
    }

    /**
     * Dead band of the frequency corrector (db1).  Typical Value = 0.
     */
    private Double db1; // PU

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
        ((GovSteamEU) _this_).setDb1(_value_);
    }

    private static String db1ToString(BaseClass _this_) {
        return ((GovSteamEU) _this_).db1ToString();
    }

    /**
     * Dead band of the speed governor (db2).  Typical Value = 0.0004.
     */
    private Double db2; // PU

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
        ((GovSteamEU) _this_).setDb2(_value_);
    }

    private static String db2ToString(BaseClass _this_) {
        return ((GovSteamEU) _this_).db2ToString();
    }

    /**
     * Maximum control valve position (Hhpmax).  Typical Value = 1.
     */
    private Double hhpmax; // PU

    public Double getHhpmax() {
        return hhpmax;
    }

    public void setHhpmax(Double _value_) {
        hhpmax = _value_;
    }

    public void setHhpmax(String _value_) {
        hhpmax = getDoubleFromString(_value_);
    }

    public String hhpmaxToString() {
        return hhpmax != null ? hhpmax.toString() : null;
    }

    private static void setHhpmax(BaseClass _this_, String _value_) {
        ((GovSteamEU) _this_).setHhpmax(_value_);
    }

    private static String hhpmaxToString(BaseClass _this_) {
        return ((GovSteamEU) _this_).hhpmaxToString();
    }

    /**
     * Gain of the power controller (Ke).  Typical Value = 0.65.
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
        ((GovSteamEU) _this_).setKe(_value_);
    }

    private static String keToString(BaseClass _this_) {
        return ((GovSteamEU) _this_).keToString();
    }

    /**
     * Gain of the frequency corrector (Kfcor).  Typical Value = 20.
     */
    private Double kfcor; // PU

    public Double getKfcor() {
        return kfcor;
    }

    public void setKfcor(Double _value_) {
        kfcor = _value_;
    }

    public void setKfcor(String _value_) {
        kfcor = getDoubleFromString(_value_);
    }

    public String kfcorToString() {
        return kfcor != null ? kfcor.toString() : null;
    }

    private static void setKfcor(BaseClass _this_, String _value_) {
        ((GovSteamEU) _this_).setKfcor(_value_);
    }

    private static String kfcorToString(BaseClass _this_) {
        return ((GovSteamEU) _this_).kfcorToString();
    }

    /**
     * Fraction of total turbine output generated by HP part (Khp).  Typical Value = 0.277.
     */
    private Double khp; // PU

    public Double getKhp() {
        return khp;
    }

    public void setKhp(Double _value_) {
        khp = _value_;
    }

    public void setKhp(String _value_) {
        khp = getDoubleFromString(_value_);
    }

    public String khpToString() {
        return khp != null ? khp.toString() : null;
    }

    private static void setKhp(BaseClass _this_, String _value_) {
        ((GovSteamEU) _this_).setKhp(_value_);
    }

    private static String khpToString(BaseClass _this_) {
        return ((GovSteamEU) _this_).khpToString();
    }

    /**
     * Fraction of total turbine output generated by HP part (Klp).  Typical Value = 0.723.
     */
    private Double klp; // PU

    public Double getKlp() {
        return klp;
    }

    public void setKlp(Double _value_) {
        klp = _value_;
    }

    public void setKlp(String _value_) {
        klp = getDoubleFromString(_value_);
    }

    public String klpToString() {
        return klp != null ? klp.toString() : null;
    }

    private static void setKlp(BaseClass _this_, String _value_) {
        ((GovSteamEU) _this_).setKlp(_value_);
    }

    private static String klpToString(BaseClass _this_) {
        return ((GovSteamEU) _this_).klpToString();
    }

    /**
     * Gain of the speed governor (Kwcor).  Typical Value = 20.
     */
    private Double kwcor; // PU

    public Double getKwcor() {
        return kwcor;
    }

    public void setKwcor(Double _value_) {
        kwcor = _value_;
    }

    public void setKwcor(String _value_) {
        kwcor = getDoubleFromString(_value_);
    }

    public String kwcorToString() {
        return kwcor != null ? kwcor.toString() : null;
    }

    private static void setKwcor(BaseClass _this_, String _value_) {
        ((GovSteamEU) _this_).setKwcor(_value_);
    }

    private static String kwcorToString(BaseClass _this_) {
        return ((GovSteamEU) _this_).kwcorToString();
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
        ((GovSteamEU) _this_).setMwbase(_value_);
    }

    private static String mwbaseToString(BaseClass _this_) {
        return ((GovSteamEU) _this_).mwbaseToString();
    }

    /**
     * Maximal active power of the turbine (Pmax).  Typical Value = 1.
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
        ((GovSteamEU) _this_).setPmax(_value_);
    }

    private static String pmaxToString(BaseClass _this_) {
        return ((GovSteamEU) _this_).pmaxToString();
    }

    /**
     * Maximum low pressure limit (Prhmax).  Typical Value = 1.4.
     */
    private Double prhmax; // PU

    public Double getPrhmax() {
        return prhmax;
    }

    public void setPrhmax(Double _value_) {
        prhmax = _value_;
    }

    public void setPrhmax(String _value_) {
        prhmax = getDoubleFromString(_value_);
    }

    public String prhmaxToString() {
        return prhmax != null ? prhmax.toString() : null;
    }

    private static void setPrhmax(BaseClass _this_, String _value_) {
        ((GovSteamEU) _this_).setPrhmax(_value_);
    }

    private static String prhmaxToString(BaseClass _this_) {
        return ((GovSteamEU) _this_).prhmaxToString();
    }

    /**
     * Intercept valves transfer limit (Simx).  Typical Value = 0.425.
     */
    private Double simx; // PU

    public Double getSimx() {
        return simx;
    }

    public void setSimx(Double _value_) {
        simx = _value_;
    }

    public void setSimx(String _value_) {
        simx = getDoubleFromString(_value_);
    }

    public String simxToString() {
        return simx != null ? simx.toString() : null;
    }

    private static void setSimx(BaseClass _this_, String _value_) {
        ((GovSteamEU) _this_).setSimx(_value_);
    }

    private static String simxToString(BaseClass _this_) {
        return ((GovSteamEU) _this_).simxToString();
    }

    /**
     * Boiler time constant (Tb).  Typical Value = 100.
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
        ((GovSteamEU) _this_).setTb(_value_);
    }

    private static String tbToString(BaseClass _this_) {
        return ((GovSteamEU) _this_).tbToString();
    }

    /**
     * Derivative time constant of the power controller (Tdp).  Typical Value = 0.
     */
    private Double tdp; // Seconds

    public Double getTdp() {
        return tdp;
    }

    public void setTdp(Double _value_) {
        tdp = _value_;
    }

    public void setTdp(String _value_) {
        tdp = getDoubleFromString(_value_);
    }

    public String tdpToString() {
        return tdp != null ? tdp.toString() : null;
    }

    private static void setTdp(BaseClass _this_, String _value_) {
        ((GovSteamEU) _this_).setTdp(_value_);
    }

    private static String tdpToString(BaseClass _this_) {
        return ((GovSteamEU) _this_).tdpToString();
    }

    /**
     * Electro hydraulic transducer (Ten).  Typical Value = 0.1.
     */
    private Double ten; // Seconds

    public Double getTen() {
        return ten;
    }

    public void setTen(Double _value_) {
        ten = _value_;
    }

    public void setTen(String _value_) {
        ten = getDoubleFromString(_value_);
    }

    public String tenToString() {
        return ten != null ? ten.toString() : null;
    }

    private static void setTen(BaseClass _this_, String _value_) {
        ((GovSteamEU) _this_).setTen(_value_);
    }

    private static String tenToString(BaseClass _this_) {
        return ((GovSteamEU) _this_).tenToString();
    }

    /**
     * Frequency transducer time constant (Tf).  Typical Value = 0.
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
        ((GovSteamEU) _this_).setTf(_value_);
    }

    private static String tfToString(BaseClass _this_) {
        return ((GovSteamEU) _this_).tfToString();
    }

    /**
     * Time constant of the power controller (Tfp).  Typical Value = 0.
     */
    private Double tfp; // Seconds

    public Double getTfp() {
        return tfp;
    }

    public void setTfp(Double _value_) {
        tfp = _value_;
    }

    public void setTfp(String _value_) {
        tfp = getDoubleFromString(_value_);
    }

    public String tfpToString() {
        return tfp != null ? tfp.toString() : null;
    }

    private static void setTfp(BaseClass _this_, String _value_) {
        ((GovSteamEU) _this_).setTfp(_value_);
    }

    private static String tfpToString(BaseClass _this_) {
        return ((GovSteamEU) _this_).tfpToString();
    }

    /**
     * High pressure (HP) time constant of the turbine (Thp).  Typical Value = 0.31.
     */
    private Double thp; // Seconds

    public Double getThp() {
        return thp;
    }

    public void setThp(Double _value_) {
        thp = _value_;
    }

    public void setThp(String _value_) {
        thp = getDoubleFromString(_value_);
    }

    public String thpToString() {
        return thp != null ? thp.toString() : null;
    }

    private static void setThp(BaseClass _this_, String _value_) {
        ((GovSteamEU) _this_).setThp(_value_);
    }

    private static String thpToString(BaseClass _this_) {
        return ((GovSteamEU) _this_).thpToString();
    }

    /**
     * Integral time constant of the power controller (Tip).  Typical Value = 2.
     */
    private Double tip; // Seconds

    public Double getTip() {
        return tip;
    }

    public void setTip(Double _value_) {
        tip = _value_;
    }

    public void setTip(String _value_) {
        tip = getDoubleFromString(_value_);
    }

    public String tipToString() {
        return tip != null ? tip.toString() : null;
    }

    private static void setTip(BaseClass _this_, String _value_) {
        ((GovSteamEU) _this_).setTip(_value_);
    }

    private static String tipToString(BaseClass _this_) {
        return ((GovSteamEU) _this_).tipToString();
    }

    /**
     * Low pressure(LP) time constant of the turbine (Tlp).  Typical Value = 0.45.
     */
    private Double tlp; // Seconds

    public Double getTlp() {
        return tlp;
    }

    public void setTlp(Double _value_) {
        tlp = _value_;
    }

    public void setTlp(String _value_) {
        tlp = getDoubleFromString(_value_);
    }

    public String tlpToString() {
        return tlp != null ? tlp.toString() : null;
    }

    private static void setTlp(BaseClass _this_, String _value_) {
        ((GovSteamEU) _this_).setTlp(_value_);
    }

    private static String tlpToString(BaseClass _this_) {
        return ((GovSteamEU) _this_).tlpToString();
    }

    /**
     * Power transducer time constant (Tp).  Typical Value = 0.07.
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
        ((GovSteamEU) _this_).setTp(_value_);
    }

    private static String tpToString(BaseClass _this_) {
        return ((GovSteamEU) _this_).tpToString();
    }

    /**
     * Reheater  time constant of the turbine (Trh).  Typical Value = 8.
     */
    private Double trh; // Seconds

    public Double getTrh() {
        return trh;
    }

    public void setTrh(Double _value_) {
        trh = _value_;
    }

    public void setTrh(String _value_) {
        trh = getDoubleFromString(_value_);
    }

    public String trhToString() {
        return trh != null ? trh.toString() : null;
    }

    private static void setTrh(BaseClass _this_, String _value_) {
        ((GovSteamEU) _this_).setTrh(_value_);
    }

    private static String trhToString(BaseClass _this_) {
        return ((GovSteamEU) _this_).trhToString();
    }

    /**
     * Control valves servo time constant (Tvhp).  Typical Value = 0.1.
     */
    private Double tvhp; // Seconds

    public Double getTvhp() {
        return tvhp;
    }

    public void setTvhp(Double _value_) {
        tvhp = _value_;
    }

    public void setTvhp(String _value_) {
        tvhp = getDoubleFromString(_value_);
    }

    public String tvhpToString() {
        return tvhp != null ? tvhp.toString() : null;
    }

    private static void setTvhp(BaseClass _this_, String _value_) {
        ((GovSteamEU) _this_).setTvhp(_value_);
    }

    private static String tvhpToString(BaseClass _this_) {
        return ((GovSteamEU) _this_).tvhpToString();
    }

    /**
     * Intercept valves servo time constant (Tvip).  Typical Value = 0.15.
     */
    private Double tvip; // Seconds

    public Double getTvip() {
        return tvip;
    }

    public void setTvip(Double _value_) {
        tvip = _value_;
    }

    public void setTvip(String _value_) {
        tvip = getDoubleFromString(_value_);
    }

    public String tvipToString() {
        return tvip != null ? tvip.toString() : null;
    }

    private static void setTvip(BaseClass _this_, String _value_) {
        ((GovSteamEU) _this_).setTvip(_value_);
    }

    private static String tvipToString(BaseClass _this_) {
        return ((GovSteamEU) _this_).tvipToString();
    }

    /**
     * Speed transducer time constant (Tw).  Typical Value = 0.02.
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
        ((GovSteamEU) _this_).setTw(_value_);
    }

    private static String twToString(BaseClass _this_) {
        return ((GovSteamEU) _this_).twToString();
    }

    /**
     * Upper limit for frequency correction (Wfmax).  Typical Value = 0.05.
     */
    private Double wfmax; // PU

    public Double getWfmax() {
        return wfmax;
    }

    public void setWfmax(Double _value_) {
        wfmax = _value_;
    }

    public void setWfmax(String _value_) {
        wfmax = getDoubleFromString(_value_);
    }

    public String wfmaxToString() {
        return wfmax != null ? wfmax.toString() : null;
    }

    private static void setWfmax(BaseClass _this_, String _value_) {
        ((GovSteamEU) _this_).setWfmax(_value_);
    }

    private static String wfmaxToString(BaseClass _this_) {
        return ((GovSteamEU) _this_).wfmaxToString();
    }

    /**
     * Lower limit for frequency correction (Wfmin).  Typical Value = -0.05.
     */
    private Double wfmin; // PU

    public Double getWfmin() {
        return wfmin;
    }

    public void setWfmin(Double _value_) {
        wfmin = _value_;
    }

    public void setWfmin(String _value_) {
        wfmin = getDoubleFromString(_value_);
    }

    public String wfminToString() {
        return wfmin != null ? wfmin.toString() : null;
    }

    private static void setWfmin(BaseClass _this_, String _value_) {
        ((GovSteamEU) _this_).setWfmin(_value_);
    }

    private static String wfminToString(BaseClass _this_) {
        return ((GovSteamEU) _this_).wfminToString();
    }

    /**
     * Emergency speed control lower limit (wmax1).  Typical Value = 1.025.
     */
    private Double wmax1; // PU

    public Double getWmax1() {
        return wmax1;
    }

    public void setWmax1(Double _value_) {
        wmax1 = _value_;
    }

    public void setWmax1(String _value_) {
        wmax1 = getDoubleFromString(_value_);
    }

    public String wmax1ToString() {
        return wmax1 != null ? wmax1.toString() : null;
    }

    private static void setWmax1(BaseClass _this_, String _value_) {
        ((GovSteamEU) _this_).setWmax1(_value_);
    }

    private static String wmax1ToString(BaseClass _this_) {
        return ((GovSteamEU) _this_).wmax1ToString();
    }

    /**
     * Emergency speed control upper limit (wmax2).  Typical Value = 1.05.
     */
    private Double wmax2; // PU

    public Double getWmax2() {
        return wmax2;
    }

    public void setWmax2(Double _value_) {
        wmax2 = _value_;
    }

    public void setWmax2(String _value_) {
        wmax2 = getDoubleFromString(_value_);
    }

    public String wmax2ToString() {
        return wmax2 != null ? wmax2.toString() : null;
    }

    private static void setWmax2(BaseClass _this_, String _value_) {
        ((GovSteamEU) _this_).setWmax2(_value_);
    }

    private static String wmax2ToString(BaseClass _this_) {
        return ((GovSteamEU) _this_).wmax2ToString();
    }

    /**
     * Upper limit for the speed governor (Wwmax).  Typical Value = 0.1.
     */
    private Double wwmax; // PU

    public Double getWwmax() {
        return wwmax;
    }

    public void setWwmax(Double _value_) {
        wwmax = _value_;
    }

    public void setWwmax(String _value_) {
        wwmax = getDoubleFromString(_value_);
    }

    public String wwmaxToString() {
        return wwmax != null ? wwmax.toString() : null;
    }

    private static void setWwmax(BaseClass _this_, String _value_) {
        ((GovSteamEU) _this_).setWwmax(_value_);
    }

    private static String wwmaxToString(BaseClass _this_) {
        return ((GovSteamEU) _this_).wwmaxToString();
    }

    /**
     * Lower limit for the speed governor frequency correction (Wwmin).  Typical Value = -1.
     */
    private Double wwmin; // PU

    public Double getWwmin() {
        return wwmin;
    }

    public void setWwmin(Double _value_) {
        wwmin = _value_;
    }

    public void setWwmin(String _value_) {
        wwmin = getDoubleFromString(_value_);
    }

    public String wwminToString() {
        return wwmin != null ? wwmin.toString() : null;
    }

    private static void setWwmin(BaseClass _this_, String _value_) {
        ((GovSteamEU) _this_).setWwmin(_value_);
    }

    private static String wwminToString(BaseClass _this_) {
        return ((GovSteamEU) _this_).wwminToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "GovSteamEU", attrName));
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
                "GovSteamEU", attrName, objectValue));
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
                "GovSteamEU", attrName, stringValue));
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
            map.put("chc", new AttrDetails("GovSteamEU.chc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::chcToString, null, GovSteamEU::setChc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("cho", new AttrDetails("GovSteamEU.cho", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::choToString, null, GovSteamEU::setCho));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("cic", new AttrDetails("GovSteamEU.cic", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::cicToString, null, GovSteamEU::setCic));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("cio", new AttrDetails("GovSteamEU.cio", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::cioToString, null, GovSteamEU::setCio));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("db1", new AttrDetails("GovSteamEU.db1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::db1ToString, null, GovSteamEU::setDb1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("db2", new AttrDetails("GovSteamEU.db2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::db2ToString, null, GovSteamEU::setDb2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("hhpmax", new AttrDetails("GovSteamEU.hhpmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::hhpmaxToString, null, GovSteamEU::setHhpmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ke", new AttrDetails("GovSteamEU.ke", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::keToString, null, GovSteamEU::setKe));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kfcor", new AttrDetails("GovSteamEU.kfcor", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::kfcorToString, null, GovSteamEU::setKfcor));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("khp", new AttrDetails("GovSteamEU.khp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::khpToString, null, GovSteamEU::setKhp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("klp", new AttrDetails("GovSteamEU.klp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::klpToString, null, GovSteamEU::setKlp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kwcor", new AttrDetails("GovSteamEU.kwcor", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::kwcorToString, null, GovSteamEU::setKwcor));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mwbase", new AttrDetails("GovSteamEU.mwbase", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::mwbaseToString, null, GovSteamEU::setMwbase));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pmax", new AttrDetails("GovSteamEU.pmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::pmaxToString, null, GovSteamEU::setPmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("prhmax", new AttrDetails("GovSteamEU.prhmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::prhmaxToString, null, GovSteamEU::setPrhmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("simx", new AttrDetails("GovSteamEU.simx", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::simxToString, null, GovSteamEU::setSimx));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tb", new AttrDetails("GovSteamEU.tb", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::tbToString, null, GovSteamEU::setTb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tdp", new AttrDetails("GovSteamEU.tdp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::tdpToString, null, GovSteamEU::setTdp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ten", new AttrDetails("GovSteamEU.ten", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::tenToString, null, GovSteamEU::setTen));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf", new AttrDetails("GovSteamEU.tf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::tfToString, null, GovSteamEU::setTf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tfp", new AttrDetails("GovSteamEU.tfp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::tfpToString, null, GovSteamEU::setTfp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("thp", new AttrDetails("GovSteamEU.thp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::thpToString, null, GovSteamEU::setThp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tip", new AttrDetails("GovSteamEU.tip", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::tipToString, null, GovSteamEU::setTip));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tlp", new AttrDetails("GovSteamEU.tlp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::tlpToString, null, GovSteamEU::setTlp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tp", new AttrDetails("GovSteamEU.tp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::tpToString, null, GovSteamEU::setTp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("trh", new AttrDetails("GovSteamEU.trh", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::trhToString, null, GovSteamEU::setTrh));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tvhp", new AttrDetails("GovSteamEU.tvhp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::tvhpToString, null, GovSteamEU::setTvhp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tvip", new AttrDetails("GovSteamEU.tvip", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::tvipToString, null, GovSteamEU::setTvip));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tw", new AttrDetails("GovSteamEU.tw", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::twToString, null, GovSteamEU::setTw));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("wfmax", new AttrDetails("GovSteamEU.wfmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::wfmaxToString, null, GovSteamEU::setWfmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("wfmin", new AttrDetails("GovSteamEU.wfmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::wfminToString, null, GovSteamEU::setWfmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("wmax1", new AttrDetails("GovSteamEU.wmax1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::wmax1ToString, null, GovSteamEU::setWmax1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("wmax2", new AttrDetails("GovSteamEU.wmax2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::wmax2ToString, null, GovSteamEU::setWmax2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("wwmax", new AttrDetails("GovSteamEU.wwmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::wwmaxToString, null, GovSteamEU::setWwmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("wwmin", new AttrDetails("GovSteamEU.wwmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamEU::wwminToString, null, GovSteamEU::setWwmin));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new GovSteamEU().allAttrDetailsMap());
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
