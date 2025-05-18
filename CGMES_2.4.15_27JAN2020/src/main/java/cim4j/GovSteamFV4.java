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
 * Detailed electro-hydraulic governor for steam unit.
 */
@SuppressWarnings("unused")
public class GovSteamFV4 extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovSteamFV4.class);

    /**
     * Constructor.
     */
    public GovSteamFV4(String rdfid) {
        super("GovSteamFV4", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected GovSteamFV4(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Minimum value of pressure regulator output (Cpsmn).  Typical Value = -1.
     */
    private Double cpsmn; // PU

    public Double getCpsmn() {
        return cpsmn;
    }

    public void setCpsmn(Double _value_) {
        cpsmn = _value_;
    }

    public void setCpsmn(String _value_) {
        cpsmn = getDoubleFromString(_value_);
    }

    public String cpsmnToString() {
        return cpsmn != null ? cpsmn.toString() : null;
    }

    private static void setCpsmn(BaseClass _this_, String _value_) {
        ((GovSteamFV4) _this_).setCpsmn(_value_);
    }

    private static String cpsmnToString(BaseClass _this_) {
        return ((GovSteamFV4) _this_).cpsmnToString();
    }

    /**
     * Maximum value of pressure regulator output (Cpsmx).  Typical Value = 1.
     */
    private Double cpsmx; // PU

    public Double getCpsmx() {
        return cpsmx;
    }

    public void setCpsmx(Double _value_) {
        cpsmx = _value_;
    }

    public void setCpsmx(String _value_) {
        cpsmx = getDoubleFromString(_value_);
    }

    public String cpsmxToString() {
        return cpsmx != null ? cpsmx.toString() : null;
    }

    private static void setCpsmx(BaseClass _this_, String _value_) {
        ((GovSteamFV4) _this_).setCpsmx(_value_);
    }

    private static String cpsmxToString(BaseClass _this_) {
        return ((GovSteamFV4) _this_).cpsmxToString();
    }

    /**
     * Minimum value of regulator set-point (Crmn).  Typical Value = 0.
     */
    private Double crmn; // PU

    public Double getCrmn() {
        return crmn;
    }

    public void setCrmn(Double _value_) {
        crmn = _value_;
    }

    public void setCrmn(String _value_) {
        crmn = getDoubleFromString(_value_);
    }

    public String crmnToString() {
        return crmn != null ? crmn.toString() : null;
    }

    private static void setCrmn(BaseClass _this_, String _value_) {
        ((GovSteamFV4) _this_).setCrmn(_value_);
    }

    private static String crmnToString(BaseClass _this_) {
        return ((GovSteamFV4) _this_).crmnToString();
    }

    /**
     * Maximum value of regulator set-point (Crmx).  Typical Value = 1.2.
     */
    private Double crmx; // PU

    public Double getCrmx() {
        return crmx;
    }

    public void setCrmx(Double _value_) {
        crmx = _value_;
    }

    public void setCrmx(String _value_) {
        crmx = getDoubleFromString(_value_);
    }

    public String crmxToString() {
        return crmx != null ? crmx.toString() : null;
    }

    private static void setCrmx(BaseClass _this_, String _value_) {
        ((GovSteamFV4) _this_).setCrmx(_value_);
    }

    private static String crmxToString(BaseClass _this_) {
        return ((GovSteamFV4) _this_).crmxToString();
    }

    /**
     * Derivative gain of pressure regulator (Kdc).  Typical Value = 1.
     */
    private Double kdc; // PU

    public Double getKdc() {
        return kdc;
    }

    public void setKdc(Double _value_) {
        kdc = _value_;
    }

    public void setKdc(String _value_) {
        kdc = getDoubleFromString(_value_);
    }

    public String kdcToString() {
        return kdc != null ? kdc.toString() : null;
    }

    private static void setKdc(BaseClass _this_, String _value_) {
        ((GovSteamFV4) _this_).setKdc(_value_);
    }

    private static String kdcToString(BaseClass _this_) {
        return ((GovSteamFV4) _this_).kdcToString();
    }

    /**
     * Frequency bias (reciprocal of droop) (Kf1).  Typical Value = 20.
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
        ((GovSteamFV4) _this_).setKf1(_value_);
    }

    private static String kf1ToString(BaseClass _this_) {
        return ((GovSteamFV4) _this_).kf1ToString();
    }

    /**
     * Frequency control (reciprocal of droop) (Kf3).  Typical Value = 20.
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
        ((GovSteamFV4) _this_).setKf3(_value_);
    }

    private static String kf3ToString(BaseClass _this_) {
        return ((GovSteamFV4) _this_).kf3ToString();
    }

    /**
     * Fraction  of total turbine output generated by HP part (Khp).  Typical Value = 0.35.
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
        ((GovSteamFV4) _this_).setKhp(_value_);
    }

    private static String khpToString(BaseClass _this_) {
        return ((GovSteamFV4) _this_).khpToString();
    }

    /**
     * Integral gain of pressure regulator (Kic).  Typical Value = 0.0033.
     */
    private Double kic; // PU

    public Double getKic() {
        return kic;
    }

    public void setKic(Double _value_) {
        kic = _value_;
    }

    public void setKic(String _value_) {
        kic = getDoubleFromString(_value_);
    }

    public String kicToString() {
        return kic != null ? kic.toString() : null;
    }

    private static void setKic(BaseClass _this_, String _value_) {
        ((GovSteamFV4) _this_).setKic(_value_);
    }

    private static String kicToString(BaseClass _this_) {
        return ((GovSteamFV4) _this_).kicToString();
    }

    /**
     * Integral gain of pressure feedback regulator (Kip).  Typical Value = 0.5.
     */
    private Double kip; // PU

    public Double getKip() {
        return kip;
    }

    public void setKip(Double _value_) {
        kip = _value_;
    }

    public void setKip(String _value_) {
        kip = getDoubleFromString(_value_);
    }

    public String kipToString() {
        return kip != null ? kip.toString() : null;
    }

    private static void setKip(BaseClass _this_, String _value_) {
        ((GovSteamFV4) _this_).setKip(_value_);
    }

    private static String kipToString(BaseClass _this_) {
        return ((GovSteamFV4) _this_).kipToString();
    }

    /**
     * Integral gain of electro-hydraulic regulator (Kit).  Typical Value = 0.04.
     */
    private Double kit; // PU

    public Double getKit() {
        return kit;
    }

    public void setKit(Double _value_) {
        kit = _value_;
    }

    public void setKit(String _value_) {
        kit = getDoubleFromString(_value_);
    }

    public String kitToString() {
        return kit != null ? kit.toString() : null;
    }

    private static void setKit(BaseClass _this_, String _value_) {
        ((GovSteamFV4) _this_).setKit(_value_);
    }

    private static String kitToString(BaseClass _this_) {
        return ((GovSteamFV4) _this_).kitToString();
    }

    /**
     * First gain coefficient of  intercept valves characteristic (Kmp1).  Typical Value = 0.5.
     */
    private Double kmp1; // PU

    public Double getKmp1() {
        return kmp1;
    }

    public void setKmp1(Double _value_) {
        kmp1 = _value_;
    }

    public void setKmp1(String _value_) {
        kmp1 = getDoubleFromString(_value_);
    }

    public String kmp1ToString() {
        return kmp1 != null ? kmp1.toString() : null;
    }

    private static void setKmp1(BaseClass _this_, String _value_) {
        ((GovSteamFV4) _this_).setKmp1(_value_);
    }

    private static String kmp1ToString(BaseClass _this_) {
        return ((GovSteamFV4) _this_).kmp1ToString();
    }

    /**
     * Second gain coefficient of intercept valves characteristic (Kmp2).  Typical Value = 3.5.
     */
    private Double kmp2; // PU

    public Double getKmp2() {
        return kmp2;
    }

    public void setKmp2(Double _value_) {
        kmp2 = _value_;
    }

    public void setKmp2(String _value_) {
        kmp2 = getDoubleFromString(_value_);
    }

    public String kmp2ToString() {
        return kmp2 != null ? kmp2.toString() : null;
    }

    private static void setKmp2(BaseClass _this_, String _value_) {
        ((GovSteamFV4) _this_).setKmp2(_value_);
    }

    private static String kmp2ToString(BaseClass _this_) {
        return ((GovSteamFV4) _this_).kmp2ToString();
    }

    /**
     * Proportional gain of pressure regulator (Kpc).  Typical Value = 0.5.
     */
    private Double kpc; // PU

    public Double getKpc() {
        return kpc;
    }

    public void setKpc(Double _value_) {
        kpc = _value_;
    }

    public void setKpc(String _value_) {
        kpc = getDoubleFromString(_value_);
    }

    public String kpcToString() {
        return kpc != null ? kpc.toString() : null;
    }

    private static void setKpc(BaseClass _this_, String _value_) {
        ((GovSteamFV4) _this_).setKpc(_value_);
    }

    private static String kpcToString(BaseClass _this_) {
        return ((GovSteamFV4) _this_).kpcToString();
    }

    /**
     * Proportional gain of pressure feedback regulator (Kpp).  Typical Value = 1.
     */
    private Double kpp; // PU

    public Double getKpp() {
        return kpp;
    }

    public void setKpp(Double _value_) {
        kpp = _value_;
    }

    public void setKpp(String _value_) {
        kpp = getDoubleFromString(_value_);
    }

    public String kppToString() {
        return kpp != null ? kpp.toString() : null;
    }

    private static void setKpp(BaseClass _this_, String _value_) {
        ((GovSteamFV4) _this_).setKpp(_value_);
    }

    private static String kppToString(BaseClass _this_) {
        return ((GovSteamFV4) _this_).kppToString();
    }

    /**
     * Proportional gain of electro-hydraulic regulator (Kpt).  Typical Value = 0.3.
     */
    private Double kpt; // PU

    public Double getKpt() {
        return kpt;
    }

    public void setKpt(Double _value_) {
        kpt = _value_;
    }

    public void setKpt(String _value_) {
        kpt = getDoubleFromString(_value_);
    }

    public String kptToString() {
        return kpt != null ? kpt.toString() : null;
    }

    private static void setKpt(BaseClass _this_, String _value_) {
        ((GovSteamFV4) _this_).setKpt(_value_);
    }

    private static String kptToString(BaseClass _this_) {
        return ((GovSteamFV4) _this_).kptToString();
    }

    /**
     * Maximum variation of fuel flow (Krc).  Typical Value = 0.05.
     */
    private Double krc; // PU

    public Double getKrc() {
        return krc;
    }

    public void setKrc(Double _value_) {
        krc = _value_;
    }

    public void setKrc(String _value_) {
        krc = getDoubleFromString(_value_);
    }

    public String krcToString() {
        return krc != null ? krc.toString() : null;
    }

    private static void setKrc(BaseClass _this_, String _value_) {
        ((GovSteamFV4) _this_).setKrc(_value_);
    }

    private static String krcToString(BaseClass _this_) {
        return ((GovSteamFV4) _this_).krcToString();
    }

    /**
     * Pressure loss due to flow friction in the boiler tubes (Ksh).  Typical Value = 0.08.
     */
    private Double ksh; // PU

    public Double getKsh() {
        return ksh;
    }

    public void setKsh(Double _value_) {
        ksh = _value_;
    }

    public void setKsh(String _value_) {
        ksh = getDoubleFromString(_value_);
    }

    public String kshToString() {
        return ksh != null ? ksh.toString() : null;
    }

    private static void setKsh(BaseClass _this_, String _value_) {
        ((GovSteamFV4) _this_).setKsh(_value_);
    }

    private static String kshToString(BaseClass _this_) {
        return ((GovSteamFV4) _this_).kshToString();
    }

    /**
     * Maximum negative power error (Lpi).  Typical Value = -0.15.
     */
    private Double lpi; // PU

    public Double getLpi() {
        return lpi;
    }

    public void setLpi(Double _value_) {
        lpi = _value_;
    }

    public void setLpi(String _value_) {
        lpi = getDoubleFromString(_value_);
    }

    public String lpiToString() {
        return lpi != null ? lpi.toString() : null;
    }

    private static void setLpi(BaseClass _this_, String _value_) {
        ((GovSteamFV4) _this_).setLpi(_value_);
    }

    private static String lpiToString(BaseClass _this_) {
        return ((GovSteamFV4) _this_).lpiToString();
    }

    /**
     * Maximum positive power error (Lps).  Typical Value = 0.03.
     */
    private Double lps; // PU

    public Double getLps() {
        return lps;
    }

    public void setLps(Double _value_) {
        lps = _value_;
    }

    public void setLps(String _value_) {
        lps = getDoubleFromString(_value_);
    }

    public String lpsToString() {
        return lps != null ? lps.toString() : null;
    }

    private static void setLps(BaseClass _this_, String _value_) {
        ((GovSteamFV4) _this_).setLps(_value_);
    }

    private static String lpsToString(BaseClass _this_) {
        return ((GovSteamFV4) _this_).lpsToString();
    }

    /**
     * Lower limit for frequency correction (MN).  Typical Value = -0.05.
     */
    private Double mnef; // PU

    public Double getMnef() {
        return mnef;
    }

    public void setMnef(Double _value_) {
        mnef = _value_;
    }

    public void setMnef(String _value_) {
        mnef = getDoubleFromString(_value_);
    }

    public String mnefToString() {
        return mnef != null ? mnef.toString() : null;
    }

    private static void setMnef(BaseClass _this_, String _value_) {
        ((GovSteamFV4) _this_).setMnef(_value_);
    }

    private static String mnefToString(BaseClass _this_) {
        return ((GovSteamFV4) _this_).mnefToString();
    }

    /**
     * Upper limit for frequency correction (MX).  Typical Value = 0.05.
     */
    private Double mxef; // PU

    public Double getMxef() {
        return mxef;
    }

    public void setMxef(Double _value_) {
        mxef = _value_;
    }

    public void setMxef(String _value_) {
        mxef = getDoubleFromString(_value_);
    }

    public String mxefToString() {
        return mxef != null ? mxef.toString() : null;
    }

    private static void setMxef(BaseClass _this_, String _value_) {
        ((GovSteamFV4) _this_).setMxef(_value_);
    }

    private static String mxefToString(BaseClass _this_) {
        return ((GovSteamFV4) _this_).mxefToString();
    }

    /**
     * First value of pressure set point static characteristic (Pr1).  Typical Value = 0.2.
     */
    private Double pr1; // PU

    public Double getPr1() {
        return pr1;
    }

    public void setPr1(Double _value_) {
        pr1 = _value_;
    }

    public void setPr1(String _value_) {
        pr1 = getDoubleFromString(_value_);
    }

    public String pr1ToString() {
        return pr1 != null ? pr1.toString() : null;
    }

    private static void setPr1(BaseClass _this_, String _value_) {
        ((GovSteamFV4) _this_).setPr1(_value_);
    }

    private static String pr1ToString(BaseClass _this_) {
        return ((GovSteamFV4) _this_).pr1ToString();
    }

    /**
     * Second value of pressure set point static characteristic, corresponding to Ps0 = 1.0 PU (Pr2).  Typical Value = 0.75.
     */
    private Double pr2; // PU

    public Double getPr2() {
        return pr2;
    }

    public void setPr2(Double _value_) {
        pr2 = _value_;
    }

    public void setPr2(String _value_) {
        pr2 = getDoubleFromString(_value_);
    }

    public String pr2ToString() {
        return pr2 != null ? pr2.toString() : null;
    }

    private static void setPr2(BaseClass _this_, String _value_) {
        ((GovSteamFV4) _this_).setPr2(_value_);
    }

    private static String pr2ToString(BaseClass _this_) {
        return ((GovSteamFV4) _this_).pr2ToString();
    }

    /**
     * Minimum value of pressure set point static characteristic (Psmn).  Typical Value = 1.
     */
    private Double psmn; // PU

    public Double getPsmn() {
        return psmn;
    }

    public void setPsmn(Double _value_) {
        psmn = _value_;
    }

    public void setPsmn(String _value_) {
        psmn = getDoubleFromString(_value_);
    }

    public String psmnToString() {
        return psmn != null ? psmn.toString() : null;
    }

    private static void setPsmn(BaseClass _this_, String _value_) {
        ((GovSteamFV4) _this_).setPsmn(_value_);
    }

    private static String psmnToString(BaseClass _this_) {
        return ((GovSteamFV4) _this_).psmnToString();
    }

    /**
     * Minimum value of integral regulator (Rsmimn).  Typical Value = 0.
     */
    private Double rsmimn; // PU

    public Double getRsmimn() {
        return rsmimn;
    }

    public void setRsmimn(Double _value_) {
        rsmimn = _value_;
    }

    public void setRsmimn(String _value_) {
        rsmimn = getDoubleFromString(_value_);
    }

    public String rsmimnToString() {
        return rsmimn != null ? rsmimn.toString() : null;
    }

    private static void setRsmimn(BaseClass _this_, String _value_) {
        ((GovSteamFV4) _this_).setRsmimn(_value_);
    }

    private static String rsmimnToString(BaseClass _this_) {
        return ((GovSteamFV4) _this_).rsmimnToString();
    }

    /**
     * Maximum value of integral regulator (Rsmimx).  Typical Value = 1.1.
     */
    private Double rsmimx; // PU

    public Double getRsmimx() {
        return rsmimx;
    }

    public void setRsmimx(Double _value_) {
        rsmimx = _value_;
    }

    public void setRsmimx(String _value_) {
        rsmimx = getDoubleFromString(_value_);
    }

    public String rsmimxToString() {
        return rsmimx != null ? rsmimx.toString() : null;
    }

    private static void setRsmimx(BaseClass _this_, String _value_) {
        ((GovSteamFV4) _this_).setRsmimx(_value_);
    }

    private static String rsmimxToString(BaseClass _this_) {
        return ((GovSteamFV4) _this_).rsmimxToString();
    }

    /**
     * Minimum value of integral regulator (Rvgmn).  Typical Value = 0.
     */
    private Double rvgmn; // PU

    public Double getRvgmn() {
        return rvgmn;
    }

    public void setRvgmn(Double _value_) {
        rvgmn = _value_;
    }

    public void setRvgmn(String _value_) {
        rvgmn = getDoubleFromString(_value_);
    }

    public String rvgmnToString() {
        return rvgmn != null ? rvgmn.toString() : null;
    }

    private static void setRvgmn(BaseClass _this_, String _value_) {
        ((GovSteamFV4) _this_).setRvgmn(_value_);
    }

    private static String rvgmnToString(BaseClass _this_) {
        return ((GovSteamFV4) _this_).rvgmnToString();
    }

    /**
     * Maximum value of integral regulator (Rvgmx).  Typical Value = 1.2.
     */
    private Double rvgmx; // PU

    public Double getRvgmx() {
        return rvgmx;
    }

    public void setRvgmx(Double _value_) {
        rvgmx = _value_;
    }

    public void setRvgmx(String _value_) {
        rvgmx = getDoubleFromString(_value_);
    }

    public String rvgmxToString() {
        return rvgmx != null ? rvgmx.toString() : null;
    }

    private static void setRvgmx(BaseClass _this_, String _value_) {
        ((GovSteamFV4) _this_).setRvgmx(_value_);
    }

    private static String rvgmxToString(BaseClass _this_) {
        return ((GovSteamFV4) _this_).rvgmxToString();
    }

    /**
     * Minimum valve opening (Srmn).  Typical Value = 0.
     */
    private Double srmn; // PU

    public Double getSrmn() {
        return srmn;
    }

    public void setSrmn(Double _value_) {
        srmn = _value_;
    }

    public void setSrmn(String _value_) {
        srmn = getDoubleFromString(_value_);
    }

    public String srmnToString() {
        return srmn != null ? srmn.toString() : null;
    }

    private static void setSrmn(BaseClass _this_, String _value_) {
        ((GovSteamFV4) _this_).setSrmn(_value_);
    }

    private static String srmnToString(BaseClass _this_) {
        return ((GovSteamFV4) _this_).srmnToString();
    }

    /**
     * Maximum valve opening (Srmx).  Typical Value = 1.1.
     */
    private Double srmx; // PU

    public Double getSrmx() {
        return srmx;
    }

    public void setSrmx(Double _value_) {
        srmx = _value_;
    }

    public void setSrmx(String _value_) {
        srmx = getDoubleFromString(_value_);
    }

    public String srmxToString() {
        return srmx != null ? srmx.toString() : null;
    }

    private static void setSrmx(BaseClass _this_, String _value_) {
        ((GovSteamFV4) _this_).setSrmx(_value_);
    }

    private static String srmxToString(BaseClass _this_) {
        return ((GovSteamFV4) _this_).srmxToString();
    }

    /**
     * Intercept valves characteristic discontinuity point (Srsmp).  Typical Value = 0.43.
     */
    private Double srsmp; // PU

    public Double getSrsmp() {
        return srsmp;
    }

    public void setSrsmp(Double _value_) {
        srsmp = _value_;
    }

    public void setSrsmp(String _value_) {
        srsmp = getDoubleFromString(_value_);
    }

    public String srsmpToString() {
        return srsmp != null ? srsmp.toString() : null;
    }

    private static void setSrsmp(BaseClass _this_, String _value_) {
        ((GovSteamFV4) _this_).setSrsmp(_value_);
    }

    private static String srsmpToString(BaseClass _this_) {
        return ((GovSteamFV4) _this_).srsmpToString();
    }

    /**
     * Maximum regulator gate closing velocity (Svmn).  Typical Value = -0.0333.
     */
    private Double svmn; // Simple_Float

    public Double getSvmn() {
        return svmn;
    }

    public void setSvmn(Double _value_) {
        svmn = _value_;
    }

    public void setSvmn(String _value_) {
        svmn = getDoubleFromString(_value_);
    }

    public String svmnToString() {
        return svmn != null ? svmn.toString() : null;
    }

    private static void setSvmn(BaseClass _this_, String _value_) {
        ((GovSteamFV4) _this_).setSvmn(_value_);
    }

    private static String svmnToString(BaseClass _this_) {
        return ((GovSteamFV4) _this_).svmnToString();
    }

    /**
     * Maximum regulator gate opening velocity (Svmx).  Typical Value = 0.0333.
     */
    private Double svmx; // Simple_Float

    public Double getSvmx() {
        return svmx;
    }

    public void setSvmx(Double _value_) {
        svmx = _value_;
    }

    public void setSvmx(String _value_) {
        svmx = getDoubleFromString(_value_);
    }

    public String svmxToString() {
        return svmx != null ? svmx.toString() : null;
    }

    private static void setSvmx(BaseClass _this_, String _value_) {
        ((GovSteamFV4) _this_).setSvmx(_value_);
    }

    private static String svmxToString(BaseClass _this_) {
        return ((GovSteamFV4) _this_).svmxToString();
    }

    /**
     * Control valves rate opening time (Ta).  Typical Value = 0.8.
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
        ((GovSteamFV4) _this_).setTa(_value_);
    }

    private static String taToString(BaseClass _this_) {
        return ((GovSteamFV4) _this_).taToString();
    }

    /**
     * Intercept valves rate opening time (Tam).  Typical Value = 0.8.
     */
    private Double tam; // Seconds

    public Double getTam() {
        return tam;
    }

    public void setTam(Double _value_) {
        tam = _value_;
    }

    public void setTam(String _value_) {
        tam = getDoubleFromString(_value_);
    }

    public String tamToString() {
        return tam != null ? tam.toString() : null;
    }

    private static void setTam(BaseClass _this_, String _value_) {
        ((GovSteamFV4) _this_).setTam(_value_);
    }

    private static String tamToString(BaseClass _this_) {
        return ((GovSteamFV4) _this_).tamToString();
    }

    /**
     * Control valves rate closing time (Tc).  Typical Value = 0.5.
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
        ((GovSteamFV4) _this_).setTc(_value_);
    }

    private static String tcToString(BaseClass _this_) {
        return ((GovSteamFV4) _this_).tcToString();
    }

    /**
     * Intercept valves rate closing time (Tcm).  Typical Value = 0.5.
     */
    private Double tcm; // Seconds

    public Double getTcm() {
        return tcm;
    }

    public void setTcm(Double _value_) {
        tcm = _value_;
    }

    public void setTcm(String _value_) {
        tcm = getDoubleFromString(_value_);
    }

    public String tcmToString() {
        return tcm != null ? tcm.toString() : null;
    }

    private static void setTcm(BaseClass _this_, String _value_) {
        ((GovSteamFV4) _this_).setTcm(_value_);
    }

    private static String tcmToString(BaseClass _this_) {
        return ((GovSteamFV4) _this_).tcmToString();
    }

    /**
     * Derivative time constant of pressure regulator (Tdc).  Typical Value = 90.
     */
    private Double tdc; // Seconds

    public Double getTdc() {
        return tdc;
    }

    public void setTdc(Double _value_) {
        tdc = _value_;
    }

    public void setTdc(String _value_) {
        tdc = getDoubleFromString(_value_);
    }

    public String tdcToString() {
        return tdc != null ? tdc.toString() : null;
    }

    private static void setTdc(BaseClass _this_, String _value_) {
        ((GovSteamFV4) _this_).setTdc(_value_);
    }

    private static String tdcToString(BaseClass _this_) {
        return ((GovSteamFV4) _this_).tdcToString();
    }

    /**
     * Time constant of fuel regulation (Tf1).  Typical Value = 10.
     */
    private Double tf1; // Seconds

    public Double getTf1() {
        return tf1;
    }

    public void setTf1(Double _value_) {
        tf1 = _value_;
    }

    public void setTf1(String _value_) {
        tf1 = getDoubleFromString(_value_);
    }

    public String tf1ToString() {
        return tf1 != null ? tf1.toString() : null;
    }

    private static void setTf1(BaseClass _this_, String _value_) {
        ((GovSteamFV4) _this_).setTf1(_value_);
    }

    private static String tf1ToString(BaseClass _this_) {
        return ((GovSteamFV4) _this_).tf1ToString();
    }

    /**
     * Time constant of steam chest (Tf2).  Typical Value = 10.
     */
    private Double tf2; // Seconds

    public Double getTf2() {
        return tf2;
    }

    public void setTf2(Double _value_) {
        tf2 = _value_;
    }

    public void setTf2(String _value_) {
        tf2 = getDoubleFromString(_value_);
    }

    public String tf2ToString() {
        return tf2 != null ? tf2.toString() : null;
    }

    private static void setTf2(BaseClass _this_, String _value_) {
        ((GovSteamFV4) _this_).setTf2(_value_);
    }

    private static String tf2ToString(BaseClass _this_) {
        return ((GovSteamFV4) _this_).tf2ToString();
    }

    /**
     * High pressure (HP) time constant of the turbine (Thp).  Typical Value = 0.15.
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
        ((GovSteamFV4) _this_).setThp(_value_);
    }

    private static String thpToString(BaseClass _this_) {
        return ((GovSteamFV4) _this_).thpToString();
    }

    /**
     * Low pressure (LP) time constant of the turbine (Tmp).  Typical Value = 0.4.
     */
    private Double tmp; // Seconds

    public Double getTmp() {
        return tmp;
    }

    public void setTmp(Double _value_) {
        tmp = _value_;
    }

    public void setTmp(String _value_) {
        tmp = getDoubleFromString(_value_);
    }

    public String tmpToString() {
        return tmp != null ? tmp.toString() : null;
    }

    private static void setTmp(BaseClass _this_, String _value_) {
        ((GovSteamFV4) _this_).setTmp(_value_);
    }

    private static String tmpToString(BaseClass _this_) {
        return ((GovSteamFV4) _this_).tmpToString();
    }

    /**
     * Reheater  time constant of the turbine (Trh).  Typical Value = 10.
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
        ((GovSteamFV4) _this_).setTrh(_value_);
    }

    private static String trhToString(BaseClass _this_) {
        return ((GovSteamFV4) _this_).trhToString();
    }

    /**
     * Boiler time constant (Tv).  Typical Value = 60.
     */
    private Double tv; // Seconds

    public Double getTv() {
        return tv;
    }

    public void setTv(Double _value_) {
        tv = _value_;
    }

    public void setTv(String _value_) {
        tv = getDoubleFromString(_value_);
    }

    public String tvToString() {
        return tv != null ? tv.toString() : null;
    }

    private static void setTv(BaseClass _this_, String _value_) {
        ((GovSteamFV4) _this_).setTv(_value_);
    }

    private static String tvToString(BaseClass _this_) {
        return ((GovSteamFV4) _this_).tvToString();
    }

    /**
     * Control valves servo time constant (Ty).  Typical Value = 0.1.
     */
    private Double ty; // Seconds

    public Double getTy() {
        return ty;
    }

    public void setTy(Double _value_) {
        ty = _value_;
    }

    public void setTy(String _value_) {
        ty = getDoubleFromString(_value_);
    }

    public String tyToString() {
        return ty != null ? ty.toString() : null;
    }

    private static void setTy(BaseClass _this_, String _value_) {
        ((GovSteamFV4) _this_).setTy(_value_);
    }

    private static String tyToString(BaseClass _this_) {
        return ((GovSteamFV4) _this_).tyToString();
    }

    /**
     * Coefficient of linearized equations of turbine (Stodola formulation) (Y).  Typical Value = 0.13.
     */
    private Double y; // PU

    public Double getY() {
        return y;
    }

    public void setY(Double _value_) {
        y = _value_;
    }

    public void setY(String _value_) {
        y = getDoubleFromString(_value_);
    }

    public String yToString() {
        return y != null ? y.toString() : null;
    }

    private static void setY(BaseClass _this_, String _value_) {
        ((GovSteamFV4) _this_).setY(_value_);
    }

    private static String yToString(BaseClass _this_) {
        return ((GovSteamFV4) _this_).yToString();
    }

    /**
     * Minimum control valve position (Yhpmn).  Typical Value = 0.
     */
    private Double yhpmn; // PU

    public Double getYhpmn() {
        return yhpmn;
    }

    public void setYhpmn(Double _value_) {
        yhpmn = _value_;
    }

    public void setYhpmn(String _value_) {
        yhpmn = getDoubleFromString(_value_);
    }

    public String yhpmnToString() {
        return yhpmn != null ? yhpmn.toString() : null;
    }

    private static void setYhpmn(BaseClass _this_, String _value_) {
        ((GovSteamFV4) _this_).setYhpmn(_value_);
    }

    private static String yhpmnToString(BaseClass _this_) {
        return ((GovSteamFV4) _this_).yhpmnToString();
    }

    /**
     * Maximum control valve position (Yhpmx).  Typical Value = 1.1.
     */
    private Double yhpmx; // PU

    public Double getYhpmx() {
        return yhpmx;
    }

    public void setYhpmx(Double _value_) {
        yhpmx = _value_;
    }

    public void setYhpmx(String _value_) {
        yhpmx = getDoubleFromString(_value_);
    }

    public String yhpmxToString() {
        return yhpmx != null ? yhpmx.toString() : null;
    }

    private static void setYhpmx(BaseClass _this_, String _value_) {
        ((GovSteamFV4) _this_).setYhpmx(_value_);
    }

    private static String yhpmxToString(BaseClass _this_) {
        return ((GovSteamFV4) _this_).yhpmxToString();
    }

    /**
     * Minimum intercept valve position (Ympmn).  Typical Value = 0.
     */
    private Double ympmn; // PU

    public Double getYmpmn() {
        return ympmn;
    }

    public void setYmpmn(Double _value_) {
        ympmn = _value_;
    }

    public void setYmpmn(String _value_) {
        ympmn = getDoubleFromString(_value_);
    }

    public String ympmnToString() {
        return ympmn != null ? ympmn.toString() : null;
    }

    private static void setYmpmn(BaseClass _this_, String _value_) {
        ((GovSteamFV4) _this_).setYmpmn(_value_);
    }

    private static String ympmnToString(BaseClass _this_) {
        return ((GovSteamFV4) _this_).ympmnToString();
    }

    /**
     * Maximum intercept valve position (Ympmx).  Typical Value = 1.1.
     */
    private Double ympmx; // PU

    public Double getYmpmx() {
        return ympmx;
    }

    public void setYmpmx(Double _value_) {
        ympmx = _value_;
    }

    public void setYmpmx(String _value_) {
        ympmx = getDoubleFromString(_value_);
    }

    public String ympmxToString() {
        return ympmx != null ? ympmx.toString() : null;
    }

    private static void setYmpmx(BaseClass _this_, String _value_) {
        ((GovSteamFV4) _this_).setYmpmx(_value_);
    }

    private static String ympmxToString(BaseClass _this_) {
        return ((GovSteamFV4) _this_).ympmxToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "GovSteamFV4", attrName));
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
                "GovSteamFV4", attrName, objectValue));
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
                "GovSteamFV4", attrName, stringValue));
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
            map.put("cpsmn", new AttrDetails("GovSteamFV4.cpsmn", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::cpsmnToString, null, GovSteamFV4::setCpsmn));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("cpsmx", new AttrDetails("GovSteamFV4.cpsmx", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::cpsmxToString, null, GovSteamFV4::setCpsmx));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("crmn", new AttrDetails("GovSteamFV4.crmn", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::crmnToString, null, GovSteamFV4::setCrmn));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("crmx", new AttrDetails("GovSteamFV4.crmx", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::crmxToString, null, GovSteamFV4::setCrmx));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kdc", new AttrDetails("GovSteamFV4.kdc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::kdcToString, null, GovSteamFV4::setKdc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kf1", new AttrDetails("GovSteamFV4.kf1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::kf1ToString, null, GovSteamFV4::setKf1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kf3", new AttrDetails("GovSteamFV4.kf3", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::kf3ToString, null, GovSteamFV4::setKf3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("khp", new AttrDetails("GovSteamFV4.khp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::khpToString, null, GovSteamFV4::setKhp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kic", new AttrDetails("GovSteamFV4.kic", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::kicToString, null, GovSteamFV4::setKic));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kip", new AttrDetails("GovSteamFV4.kip", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::kipToString, null, GovSteamFV4::setKip));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kit", new AttrDetails("GovSteamFV4.kit", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::kitToString, null, GovSteamFV4::setKit));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kmp1", new AttrDetails("GovSteamFV4.kmp1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::kmp1ToString, null, GovSteamFV4::setKmp1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kmp2", new AttrDetails("GovSteamFV4.kmp2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::kmp2ToString, null, GovSteamFV4::setKmp2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpc", new AttrDetails("GovSteamFV4.kpc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::kpcToString, null, GovSteamFV4::setKpc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpp", new AttrDetails("GovSteamFV4.kpp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::kppToString, null, GovSteamFV4::setKpp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpt", new AttrDetails("GovSteamFV4.kpt", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::kptToString, null, GovSteamFV4::setKpt));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("krc", new AttrDetails("GovSteamFV4.krc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::krcToString, null, GovSteamFV4::setKrc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ksh", new AttrDetails("GovSteamFV4.ksh", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::kshToString, null, GovSteamFV4::setKsh));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("lpi", new AttrDetails("GovSteamFV4.lpi", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::lpiToString, null, GovSteamFV4::setLpi));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("lps", new AttrDetails("GovSteamFV4.lps", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::lpsToString, null, GovSteamFV4::setLps));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mnef", new AttrDetails("GovSteamFV4.mnef", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::mnefToString, null, GovSteamFV4::setMnef));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mxef", new AttrDetails("GovSteamFV4.mxef", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::mxefToString, null, GovSteamFV4::setMxef));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pr1", new AttrDetails("GovSteamFV4.pr1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::pr1ToString, null, GovSteamFV4::setPr1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pr2", new AttrDetails("GovSteamFV4.pr2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::pr2ToString, null, GovSteamFV4::setPr2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("psmn", new AttrDetails("GovSteamFV4.psmn", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::psmnToString, null, GovSteamFV4::setPsmn));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rsmimn", new AttrDetails("GovSteamFV4.rsmimn", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::rsmimnToString, null, GovSteamFV4::setRsmimn));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rsmimx", new AttrDetails("GovSteamFV4.rsmimx", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::rsmimxToString, null, GovSteamFV4::setRsmimx));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rvgmn", new AttrDetails("GovSteamFV4.rvgmn", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::rvgmnToString, null, GovSteamFV4::setRvgmn));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rvgmx", new AttrDetails("GovSteamFV4.rvgmx", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::rvgmxToString, null, GovSteamFV4::setRvgmx));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("srmn", new AttrDetails("GovSteamFV4.srmn", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::srmnToString, null, GovSteamFV4::setSrmn));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("srmx", new AttrDetails("GovSteamFV4.srmx", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::srmxToString, null, GovSteamFV4::setSrmx));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("srsmp", new AttrDetails("GovSteamFV4.srsmp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::srsmpToString, null, GovSteamFV4::setSrsmp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("svmn", new AttrDetails("GovSteamFV4.svmn", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::svmnToString, null, GovSteamFV4::setSvmn));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("svmx", new AttrDetails("GovSteamFV4.svmx", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::svmxToString, null, GovSteamFV4::setSvmx));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ta", new AttrDetails("GovSteamFV4.ta", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::taToString, null, GovSteamFV4::setTa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tam", new AttrDetails("GovSteamFV4.tam", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::tamToString, null, GovSteamFV4::setTam));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tc", new AttrDetails("GovSteamFV4.tc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::tcToString, null, GovSteamFV4::setTc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tcm", new AttrDetails("GovSteamFV4.tcm", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::tcmToString, null, GovSteamFV4::setTcm));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tdc", new AttrDetails("GovSteamFV4.tdc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::tdcToString, null, GovSteamFV4::setTdc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf1", new AttrDetails("GovSteamFV4.tf1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::tf1ToString, null, GovSteamFV4::setTf1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf2", new AttrDetails("GovSteamFV4.tf2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::tf2ToString, null, GovSteamFV4::setTf2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("thp", new AttrDetails("GovSteamFV4.thp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::thpToString, null, GovSteamFV4::setThp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tmp", new AttrDetails("GovSteamFV4.tmp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::tmpToString, null, GovSteamFV4::setTmp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("trh", new AttrDetails("GovSteamFV4.trh", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::trhToString, null, GovSteamFV4::setTrh));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tv", new AttrDetails("GovSteamFV4.tv", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::tvToString, null, GovSteamFV4::setTv));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ty", new AttrDetails("GovSteamFV4.ty", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::tyToString, null, GovSteamFV4::setTy));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("y", new AttrDetails("GovSteamFV4.y", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::yToString, null, GovSteamFV4::setY));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("yhpmn", new AttrDetails("GovSteamFV4.yhpmn", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::yhpmnToString, null, GovSteamFV4::setYhpmn));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("yhpmx", new AttrDetails("GovSteamFV4.yhpmx", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::yhpmxToString, null, GovSteamFV4::setYhpmx));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ympmn", new AttrDetails("GovSteamFV4.ympmn", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::ympmnToString, null, GovSteamFV4::setYmpmn));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ympmx", new AttrDetails("GovSteamFV4.ympmx", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovSteamFV4::ympmxToString, null, GovSteamFV4::setYmpmx));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new GovSteamFV4(null).allAttrDetailsMap());
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
