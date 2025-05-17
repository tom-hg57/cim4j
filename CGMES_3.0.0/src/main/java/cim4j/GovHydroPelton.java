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
 * Detailed hydro unit - Pelton model.  This model can be used to represent the dynamic related to water tunnel and surge chamber. The DetailedHydroModelHydraulicSystem diagram, located under the GovHydroFrancis class, provides a schematic of the hydraulic system of detailed hydro unit models, such as Francis and Pelton.
 */
@SuppressWarnings("unused")
public class GovHydroPelton extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovHydroPelton.class);

    /**
     * Default constructor.
     */
    public GovHydroPelton() {
        setCimType("GovHydroPelton");
    }

    /**
     * Area of the surge tank (&lt;i&gt;A&lt;/i&gt;&lt;i&gt;&lt;sub&gt;V0&lt;/sub&gt;&lt;/i&gt;). Unit = m&lt;sup&gt;2&lt;/sup&gt;. Typical value = 30.
     */
    private Double av0; // Area

    public Double getAv0() {
        return av0;
    }

    public void setAv0(Double _value_) {
        av0 = _value_;
    }

    public void setAv0(String _value_) {
        av0 = getDoubleFromString(_value_);
    }

    public String av0ToString() {
        return av0 != null ? av0.toString() : null;
    }

    private static void setAv0(BaseClass _this_, String _value_) {
        ((GovHydroPelton) _this_).setAv0(_value_);
    }

    private static String av0ToString(BaseClass _this_) {
        return ((GovHydroPelton) _this_).av0ToString();
    }

    /**
     * Area of the compensation tank (&lt;i&gt;A&lt;/i&gt;&lt;i&gt;&lt;sub&gt;V1&lt;/sub&gt;&lt;/i&gt;). Unit = m&lt;sup&gt;2&lt;/sup&gt;. Typical value = 700.
     */
    private Double av1; // Area

    public Double getAv1() {
        return av1;
    }

    public void setAv1(Double _value_) {
        av1 = _value_;
    }

    public void setAv1(String _value_) {
        av1 = getDoubleFromString(_value_);
    }

    public String av1ToString() {
        return av1 != null ? av1.toString() : null;
    }

    private static void setAv1(BaseClass _this_, String _value_) {
        ((GovHydroPelton) _this_).setAv1(_value_);
    }

    private static String av1ToString(BaseClass _this_) {
        return ((GovHydroPelton) _this_).av1ToString();
    }

    /**
     * Droop (&lt;i&gt;bp&lt;/i&gt;).  Typical value = 0,05.
     */
    private Double bp; // PU

    public Double getBp() {
        return bp;
    }

    public void setBp(Double _value_) {
        bp = _value_;
    }

    public void setBp(String _value_) {
        bp = getDoubleFromString(_value_);
    }

    public String bpToString() {
        return bp != null ? bp.toString() : null;
    }

    private static void setBp(BaseClass _this_, String _value_) {
        ((GovHydroPelton) _this_).setBp(_value_);
    }

    private static String bpToString(BaseClass _this_) {
        return ((GovHydroPelton) _this_).bpToString();
    }

    /**
     * Intentional dead-band width (&lt;i&gt;DB1&lt;/i&gt;).  Unit = Hz.  Typical value = 0.
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
        ((GovHydroPelton) _this_).setDb1(_value_);
    }

    private static String db1ToString(BaseClass _this_) {
        return ((GovHydroPelton) _this_).db1ToString();
    }

    /**
     * Intentional dead-band width of valve opening error (&lt;i&gt;DB2&lt;/i&gt;). Unit = Hz.  Typical value = 0,01.
     */
    private Double db2; // Frequency

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
        ((GovHydroPelton) _this_).setDb2(_value_);
    }

    private static String db2ToString(BaseClass _this_) {
        return ((GovHydroPelton) _this_).db2ToString();
    }

    /**
     * Head of compensation chamber water level with respect to the level of penstock (&lt;i&gt;H&lt;/i&gt;&lt;i&gt;&lt;sub&gt;1&lt;/sub&gt;&lt;/i&gt;).  Unit = km.  Typical value = 0,004.
     */
    private Double h1; // Length

    public Double getH1() {
        return h1;
    }

    public void setH1(Double _value_) {
        h1 = _value_;
    }

    public void setH1(String _value_) {
        h1 = getDoubleFromString(_value_);
    }

    public String h1ToString() {
        return h1 != null ? h1.toString() : null;
    }

    private static void setH1(BaseClass _this_, String _value_) {
        ((GovHydroPelton) _this_).setH1(_value_);
    }

    private static String h1ToString(BaseClass _this_) {
        return ((GovHydroPelton) _this_).h1ToString();
    }

    /**
     * Head of surge tank water level with respect to the level of penstock (&lt;i&gt;H&lt;/i&gt;&lt;i&gt;&lt;sub&gt;2&lt;/sub&gt;&lt;/i&gt;).  Unit = km.  Typical value = 0,040.
     */
    private Double h2; // Length

    public Double getH2() {
        return h2;
    }

    public void setH2(Double _value_) {
        h2 = _value_;
    }

    public void setH2(String _value_) {
        h2 = getDoubleFromString(_value_);
    }

    public String h2ToString() {
        return h2 != null ? h2.toString() : null;
    }

    private static void setH2(BaseClass _this_, String _value_) {
        ((GovHydroPelton) _this_).setH2(_value_);
    }

    private static String h2ToString(BaseClass _this_) {
        return ((GovHydroPelton) _this_).h2ToString();
    }

    /**
     * Rated hydraulic head (&lt;i&gt;H&lt;/i&gt;&lt;i&gt;&lt;sub&gt;n&lt;/sub&gt;&lt;/i&gt;).  Unit = km.  Typical value = 0,250.
     */
    private Double hn; // Length

    public Double getHn() {
        return hn;
    }

    public void setHn(Double _value_) {
        hn = _value_;
    }

    public void setHn(String _value_) {
        hn = getDoubleFromString(_value_);
    }

    public String hnToString() {
        return hn != null ? hn.toString() : null;
    }

    private static void setHn(BaseClass _this_, String _value_) {
        ((GovHydroPelton) _this_).setHn(_value_);
    }

    private static String hnToString(BaseClass _this_) {
        return ((GovHydroPelton) _this_).hnToString();
    }

    /**
     * Penstock loss coefficient (due to friction) (&lt;i&gt;Kc&lt;/i&gt;).  Typical value = 0,025.
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
        ((GovHydroPelton) _this_).setKc(_value_);
    }

    private static String kcToString(BaseClass _this_) {
        return ((GovHydroPelton) _this_).kcToString();
    }

    /**
     * Water tunnel and surge chamber loss coefficient (due to friction) (&lt;i&gt;Kg&lt;/i&gt;).  Typical value = 0,025.
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
        ((GovHydroPelton) _this_).setKg(_value_);
    }

    private static String kgToString(BaseClass _this_) {
        return ((GovHydroPelton) _this_).kgToString();
    }

    /**
     * No-load turbine flow at nominal head (&lt;i&gt;Qc0&lt;/i&gt;).  Typical value = 0,05.
     */
    private Double qc0; // PU

    public Double getQc0() {
        return qc0;
    }

    public void setQc0(Double _value_) {
        qc0 = _value_;
    }

    public void setQc0(String _value_) {
        qc0 = getDoubleFromString(_value_);
    }

    public String qc0ToString() {
        return qc0 != null ? qc0.toString() : null;
    }

    private static void setQc0(BaseClass _this_, String _value_) {
        ((GovHydroPelton) _this_).setQc0(_value_);
    }

    private static String qc0ToString(BaseClass _this_) {
        return ((GovHydroPelton) _this_).qc0ToString();
    }

    /**
     * Rated flow (&lt;i&gt;Q&lt;/i&gt;&lt;i&gt;&lt;sub&gt;n&lt;/sub&gt;&lt;/i&gt;). Unit = m&lt;sup&gt;3&lt;/sup&gt;/s. Typical value = 250.
     */
    private Double qn; // VolumeFlowRate

    public Double getQn() {
        return qn;
    }

    public void setQn(Double _value_) {
        qn = _value_;
    }

    public void setQn(String _value_) {
        qn = getDoubleFromString(_value_);
    }

    public String qnToString() {
        return qn != null ? qn.toString() : null;
    }

    private static void setQn(BaseClass _this_, String _value_) {
        ((GovHydroPelton) _this_).setQn(_value_);
    }

    private static String qnToString(BaseClass _this_) {
        return ((GovHydroPelton) _this_).qnToString();
    }

    /**
     * Simplified Pelton model simulation (&lt;i&gt;Sflag&lt;/i&gt;). true = enable of simplified Pelton model simulation false = enable of complete Pelton model simulation (non-linear gain). Typical value = true.
     */
    private Boolean simplifiedPelton; // Boolean

    public Boolean getSimplifiedPelton() {
        return simplifiedPelton;
    }

    public void setSimplifiedPelton(Boolean _value_) {
        simplifiedPelton = _value_;
    }

    public void setSimplifiedPelton(String _value_) {
        simplifiedPelton = getBooleanFromString(_value_);
    }

    public String simplifiedPeltonToString() {
        return simplifiedPelton != null ? simplifiedPelton.toString() : null;
    }

    private static void setSimplifiedPelton(BaseClass _this_, String _value_) {
        ((GovHydroPelton) _this_).setSimplifiedPelton(_value_);
    }

    private static String simplifiedPeltonToString(BaseClass _this_) {
        return ((GovHydroPelton) _this_).simplifiedPeltonToString();
    }

    /**
     * Static compensating characteristic (&lt;i&gt;Cflag&lt;/i&gt;). It should be true if simplifiedPelton = false. true = enable of static compensating characteristic  false = inhibit of static compensating characteristic. Typical value = false.
     */
    private Boolean staticCompensating; // Boolean

    public Boolean getStaticCompensating() {
        return staticCompensating;
    }

    public void setStaticCompensating(Boolean _value_) {
        staticCompensating = _value_;
    }

    public void setStaticCompensating(String _value_) {
        staticCompensating = getBooleanFromString(_value_);
    }

    public String staticCompensatingToString() {
        return staticCompensating != null ? staticCompensating.toString() : null;
    }

    private static void setStaticCompensating(BaseClass _this_, String _value_) {
        ((GovHydroPelton) _this_).setStaticCompensating(_value_);
    }

    private static String staticCompensatingToString(BaseClass _this_) {
        return ((GovHydroPelton) _this_).staticCompensatingToString();
    }

    /**
     * Derivative gain (accelerometer time constant) (&lt;i&gt;Ta&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 3.
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
        ((GovHydroPelton) _this_).setTa(_value_);
    }

    private static String taToString(BaseClass _this_) {
        return ((GovHydroPelton) _this_).taToString();
    }

    /**
     * Gate servo time constant (&lt;i&gt;Ts&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,15.
     */
    private Double ts; // Seconds

    public Double getTs() {
        return ts;
    }

    public void setTs(Double _value_) {
        ts = _value_;
    }

    public void setTs(String _value_) {
        ts = getDoubleFromString(_value_);
    }

    public String tsToString() {
        return ts != null ? ts.toString() : null;
    }

    private static void setTs(BaseClass _this_, String _value_) {
        ((GovHydroPelton) _this_).setTs(_value_);
    }

    private static String tsToString(BaseClass _this_) {
        return ((GovHydroPelton) _this_).tsToString();
    }

    /**
     * Servomotor integrator time constant (&lt;i&gt;Tv&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,3.
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
        ((GovHydroPelton) _this_).setTv(_value_);
    }

    private static String tvToString(BaseClass _this_) {
        return ((GovHydroPelton) _this_).tvToString();
    }

    /**
     * Water inertia time constant (&lt;i&gt;Twnc&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 1.
     */
    private Double twnc; // Seconds

    public Double getTwnc() {
        return twnc;
    }

    public void setTwnc(Double _value_) {
        twnc = _value_;
    }

    public void setTwnc(String _value_) {
        twnc = getDoubleFromString(_value_);
    }

    public String twncToString() {
        return twnc != null ? twnc.toString() : null;
    }

    private static void setTwnc(BaseClass _this_, String _value_) {
        ((GovHydroPelton) _this_).setTwnc(_value_);
    }

    private static String twncToString(BaseClass _this_) {
        return ((GovHydroPelton) _this_).twncToString();
    }

    /**
     * Water tunnel and surge chamber inertia time constant (&lt;i&gt;Twng&lt;/i&gt;) (&amp;gt;= 0). Typical value = 3.
     */
    private Double twng; // Seconds

    public Double getTwng() {
        return twng;
    }

    public void setTwng(Double _value_) {
        twng = _value_;
    }

    public void setTwng(String _value_) {
        twng = getDoubleFromString(_value_);
    }

    public String twngToString() {
        return twng != null ? twng.toString() : null;
    }

    private static void setTwng(BaseClass _this_, String _value_) {
        ((GovHydroPelton) _this_).setTwng(_value_);
    }

    private static String twngToString(BaseClass _this_) {
        return ((GovHydroPelton) _this_).twngToString();
    }

    /**
     * Electronic integrator time constant (&lt;i&gt;Tx&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,5.
     */
    private Double tx; // Seconds

    public Double getTx() {
        return tx;
    }

    public void setTx(Double _value_) {
        tx = _value_;
    }

    public void setTx(String _value_) {
        tx = getDoubleFromString(_value_);
    }

    public String txToString() {
        return tx != null ? tx.toString() : null;
    }

    private static void setTx(BaseClass _this_, String _value_) {
        ((GovHydroPelton) _this_).setTx(_value_);
    }

    private static String txToString(BaseClass _this_) {
        return ((GovHydroPelton) _this_).txToString();
    }

    /**
     * Maximum gate opening velocity (&lt;i&gt;Va&lt;/i&gt;).  Unit = PU / s.  Typical value = 0,06.
     */
    private Float va; // Float

    public Float getVa() {
        return va;
    }

    public void setVa(Float _value_) {
        va = _value_;
    }

    public void setVa(String _value_) {
        va = getFloatFromString(_value_);
    }

    public String vaToString() {
        return va != null ? va.toString() : null;
    }

    private static void setVa(BaseClass _this_, String _value_) {
        ((GovHydroPelton) _this_).setVa(_value_);
    }

    private static String vaToString(BaseClass _this_) {
        return ((GovHydroPelton) _this_).vaToString();
    }

    /**
     * Maximum gate opening (&lt;i&gt;ValvMax&lt;/i&gt;) (&amp;gt; GovHydroPelton.valvmin).  Typical value = 1,1.
     */
    private Double valvmax; // PU

    public Double getValvmax() {
        return valvmax;
    }

    public void setValvmax(Double _value_) {
        valvmax = _value_;
    }

    public void setValvmax(String _value_) {
        valvmax = getDoubleFromString(_value_);
    }

    public String valvmaxToString() {
        return valvmax != null ? valvmax.toString() : null;
    }

    private static void setValvmax(BaseClass _this_, String _value_) {
        ((GovHydroPelton) _this_).setValvmax(_value_);
    }

    private static String valvmaxToString(BaseClass _this_) {
        return ((GovHydroPelton) _this_).valvmaxToString();
    }

    /**
     * Minimum gate opening (&lt;i&gt;ValvMin&lt;/i&gt;) (&amp;lt; GovHydroPelton.valvmax).  Typical value = 0.
     */
    private Double valvmin; // PU

    public Double getValvmin() {
        return valvmin;
    }

    public void setValvmin(Double _value_) {
        valvmin = _value_;
    }

    public void setValvmin(String _value_) {
        valvmin = getDoubleFromString(_value_);
    }

    public String valvminToString() {
        return valvmin != null ? valvmin.toString() : null;
    }

    private static void setValvmin(BaseClass _this_, String _value_) {
        ((GovHydroPelton) _this_).setValvmin(_value_);
    }

    private static String valvminToString(BaseClass _this_) {
        return ((GovHydroPelton) _this_).valvminToString();
    }

    /**
     * Maximum servomotor valve opening velocity (&lt;i&gt;Vav&lt;/i&gt;).  Typical value = 0,1.
     */
    private Double vav; // PU

    public Double getVav() {
        return vav;
    }

    public void setVav(Double _value_) {
        vav = _value_;
    }

    public void setVav(String _value_) {
        vav = getDoubleFromString(_value_);
    }

    public String vavToString() {
        return vav != null ? vav.toString() : null;
    }

    private static void setVav(BaseClass _this_, String _value_) {
        ((GovHydroPelton) _this_).setVav(_value_);
    }

    private static String vavToString(BaseClass _this_) {
        return ((GovHydroPelton) _this_).vavToString();
    }

    /**
     * Maximum gate closing velocity (&lt;i&gt;Vc&lt;/i&gt;).  Unit = PU / s.  Typical value = -0,06.
     */
    private Float vc; // Float

    public Float getVc() {
        return vc;
    }

    public void setVc(Float _value_) {
        vc = _value_;
    }

    public void setVc(String _value_) {
        vc = getFloatFromString(_value_);
    }

    public String vcToString() {
        return vc != null ? vc.toString() : null;
    }

    private static void setVc(BaseClass _this_, String _value_) {
        ((GovHydroPelton) _this_).setVc(_value_);
    }

    private static String vcToString(BaseClass _this_) {
        return ((GovHydroPelton) _this_).vcToString();
    }

    /**
     * Maximum servomotor valve closing velocity (&lt;i&gt;Vcv&lt;/i&gt;).  Typical value = -0,1.
     */
    private Double vcv; // PU

    public Double getVcv() {
        return vcv;
    }

    public void setVcv(Double _value_) {
        vcv = _value_;
    }

    public void setVcv(String _value_) {
        vcv = getDoubleFromString(_value_);
    }

    public String vcvToString() {
        return vcv != null ? vcv.toString() : null;
    }

    private static void setVcv(BaseClass _this_, String _value_) {
        ((GovHydroPelton) _this_).setVcv(_value_);
    }

    private static String vcvToString(BaseClass _this_) {
        return ((GovHydroPelton) _this_).vcvToString();
    }

    /**
     * Water tunnel and surge chamber simulation (&lt;i&gt;Tflag&lt;/i&gt;). true = enable of water tunnel and surge chamber simulation false = inhibit of water tunnel and surge chamber simulation. Typical value = false.
     */
    private Boolean waterTunnelSurgeChamberSimulation; // Boolean

    public Boolean getWaterTunnelSurgeChamberSimulation() {
        return waterTunnelSurgeChamberSimulation;
    }

    public void setWaterTunnelSurgeChamberSimulation(Boolean _value_) {
        waterTunnelSurgeChamberSimulation = _value_;
    }

    public void setWaterTunnelSurgeChamberSimulation(String _value_) {
        waterTunnelSurgeChamberSimulation = getBooleanFromString(_value_);
    }

    public String waterTunnelSurgeChamberSimulationToString() {
        return waterTunnelSurgeChamberSimulation != null ? waterTunnelSurgeChamberSimulation.toString() : null;
    }

    private static void setWaterTunnelSurgeChamberSimulation(BaseClass _this_, String _value_) {
        ((GovHydroPelton) _this_).setWaterTunnelSurgeChamberSimulation(_value_);
    }

    private static String waterTunnelSurgeChamberSimulationToString(BaseClass _this_) {
        return ((GovHydroPelton) _this_).waterTunnelSurgeChamberSimulationToString();
    }

    /**
     * Head of upper water level with respect to the level of penstock (&lt;i&gt;Zsfc&lt;/i&gt;).  Unit = km.  Typical value = 0,025.
     */
    private Double zsfc; // Length

    public Double getZsfc() {
        return zsfc;
    }

    public void setZsfc(Double _value_) {
        zsfc = _value_;
    }

    public void setZsfc(String _value_) {
        zsfc = getDoubleFromString(_value_);
    }

    public String zsfcToString() {
        return zsfc != null ? zsfc.toString() : null;
    }

    private static void setZsfc(BaseClass _this_, String _value_) {
        ((GovHydroPelton) _this_).setZsfc(_value_);
    }

    private static String zsfcToString(BaseClass _this_) {
        return ((GovHydroPelton) _this_).zsfcToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "GovHydroPelton", attrName));
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
                "GovHydroPelton", attrName, objectValue));
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
                "GovHydroPelton", attrName, stringValue));
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
            map.put("av0", new AttrDetails("GovHydroPelton.av0", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPelton::av0ToString, null, GovHydroPelton::setAv0));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("av1", new AttrDetails("GovHydroPelton.av1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPelton::av1ToString, null, GovHydroPelton::setAv1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("bp", new AttrDetails("GovHydroPelton.bp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPelton::bpToString, null, GovHydroPelton::setBp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("db1", new AttrDetails("GovHydroPelton.db1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPelton::db1ToString, null, GovHydroPelton::setDb1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("db2", new AttrDetails("GovHydroPelton.db2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPelton::db2ToString, null, GovHydroPelton::setDb2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("h1", new AttrDetails("GovHydroPelton.h1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPelton::h1ToString, null, GovHydroPelton::setH1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("h2", new AttrDetails("GovHydroPelton.h2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPelton::h2ToString, null, GovHydroPelton::setH2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("hn", new AttrDetails("GovHydroPelton.hn", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPelton::hnToString, null, GovHydroPelton::setHn));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kc", new AttrDetails("GovHydroPelton.kc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPelton::kcToString, null, GovHydroPelton::setKc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kg", new AttrDetails("GovHydroPelton.kg", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPelton::kgToString, null, GovHydroPelton::setKg));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("qc0", new AttrDetails("GovHydroPelton.qc0", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPelton::qc0ToString, null, GovHydroPelton::setQc0));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("qn", new AttrDetails("GovHydroPelton.qn", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPelton::qnToString, null, GovHydroPelton::setQn));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("simplifiedPelton", new AttrDetails("GovHydroPelton.simplifiedPelton", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPelton::simplifiedPeltonToString, null, GovHydroPelton::setSimplifiedPelton));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("staticCompensating", new AttrDetails("GovHydroPelton.staticCompensating", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPelton::staticCompensatingToString, null, GovHydroPelton::setStaticCompensating));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ta", new AttrDetails("GovHydroPelton.ta", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPelton::taToString, null, GovHydroPelton::setTa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ts", new AttrDetails("GovHydroPelton.ts", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPelton::tsToString, null, GovHydroPelton::setTs));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tv", new AttrDetails("GovHydroPelton.tv", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPelton::tvToString, null, GovHydroPelton::setTv));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("twnc", new AttrDetails("GovHydroPelton.twnc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPelton::twncToString, null, GovHydroPelton::setTwnc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("twng", new AttrDetails("GovHydroPelton.twng", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPelton::twngToString, null, GovHydroPelton::setTwng));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tx", new AttrDetails("GovHydroPelton.tx", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPelton::txToString, null, GovHydroPelton::setTx));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("va", new AttrDetails("GovHydroPelton.va", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPelton::vaToString, null, GovHydroPelton::setVa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("valvmax", new AttrDetails("GovHydroPelton.valvmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPelton::valvmaxToString, null, GovHydroPelton::setValvmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("valvmin", new AttrDetails("GovHydroPelton.valvmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPelton::valvminToString, null, GovHydroPelton::setValvmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vav", new AttrDetails("GovHydroPelton.vav", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPelton::vavToString, null, GovHydroPelton::setVav));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vc", new AttrDetails("GovHydroPelton.vc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPelton::vcToString, null, GovHydroPelton::setVc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vcv", new AttrDetails("GovHydroPelton.vcv", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPelton::vcvToString, null, GovHydroPelton::setVcv));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("waterTunnelSurgeChamberSimulation", new AttrDetails("GovHydroPelton.waterTunnelSurgeChamberSimulation", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPelton::waterTunnelSurgeChamberSimulationToString, null, GovHydroPelton::setWaterTunnelSurgeChamberSimulation));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("zsfc", new AttrDetails("GovHydroPelton.zsfc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydroPelton::zsfcToString, null, GovHydroPelton::setZsfc));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new GovHydroPelton().allAttrDetailsMap());
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
