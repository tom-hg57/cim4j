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
 * Detailed hydro unit - Francis model.  This model can be used to represent three types of governors. A schematic of the hydraulic system of detailed hydro unit models, like Francis and Pelton, is provided in the DetailedHydroModelHydraulicSystem diagram.
 */
@SuppressWarnings("unused")
public class GovHydroFrancis extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovHydroFrancis.class);

    /**
     * Default constructor.
     */
    public GovHydroFrancis() {
        setCimType("GovHydroFrancis");
    }

    /**
     * Opening section S at the maximum efficiency (Am).  Typical Value = 0.7.
     */
    private Double am; // PU

    public Double getAm() {
        return am;
    }

    public void setAm(Double _value_) {
        am = _value_;
    }

    public void setAm(String _value_) {
        am = getDoubleFromString(_value_);
    }

    public String amToString() {
        return am != null ? am.toString() : null;
    }

    private static void setAm(BaseClass _this_, String _value_) {
        ((GovHydroFrancis) _this_).setAm(_value_);
    }

    private static String amToString(BaseClass _this_) {
        return ((GovHydroFrancis) _this_).amToString();
    }

    /**
     * Area of the surge tank (A). Unit = m. Typical Value = 30.
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
        ((GovHydroFrancis) _this_).setAv0(_value_);
    }

    private static String av0ToString(BaseClass _this_) {
        return ((GovHydroFrancis) _this_).av0ToString();
    }

    /**
     * Area of the compensation tank (A). Unit = m. Typical Value = 700.
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
        ((GovHydroFrancis) _this_).setAv1(_value_);
    }

    private static String av1ToString(BaseClass _this_) {
        return ((GovHydroFrancis) _this_).av1ToString();
    }

    /**
     * Droop (Bp).  Typical Value = 0.05.
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
        ((GovHydroFrancis) _this_).setBp(_value_);
    }

    private static String bpToString(BaseClass _this_) {
        return ((GovHydroFrancis) _this_).bpToString();
    }

    /**
     * Intentional dead-band width (DB1).  Unit = Hz.  Typical Value = 0.
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
        ((GovHydroFrancis) _this_).setDb1(_value_);
    }

    private static String db1ToString(BaseClass _this_) {
        return ((GovHydroFrancis) _this_).db1ToString();
    }

    /**
     * Maximum efficiency (EtaMax).  Typical Value = 1.05.
     */
    private Double etamax; // PU

    public Double getEtamax() {
        return etamax;
    }

    public void setEtamax(Double _value_) {
        etamax = _value_;
    }

    public void setEtamax(String _value_) {
        etamax = getDoubleFromString(_value_);
    }

    public String etamaxToString() {
        return etamax != null ? etamax.toString() : null;
    }

    private static void setEtamax(BaseClass _this_, String _value_) {
        ((GovHydroFrancis) _this_).setEtamax(_value_);
    }

    private static String etamaxToString(BaseClass _this_) {
        return ((GovHydroFrancis) _this_).etamaxToString();
    }

    /**
     * Governor control flag (Cflag).  Typical Value = mechanicHydrolicTachoAccelerator.
     */
    private String governorControl; // FrancisGovernorControlKind

    public String getGovernorControl() {
        return governorControl;
    }

    public void setGovernorControl(String _value_) {
        governorControl = _value_;
    }

    public String governorControlToString() {
        return governorControl;
    }

    private static void setGovernorControl(BaseClass _this_, String _value_) {
        ((GovHydroFrancis) _this_).setGovernorControl(_value_);
    }

    private static String governorControlToString(BaseClass _this_) {
        return ((GovHydroFrancis) _this_).governorControlToString();
    }

    /**
     * Head of compensation chamber water level with respect to the level of penstock (H).  Unit = m. Typical Value = 4.
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
        ((GovHydroFrancis) _this_).setH1(_value_);
    }

    private static String h1ToString(BaseClass _this_) {
        return ((GovHydroFrancis) _this_).h1ToString();
    }

    /**
     * Head of surge tank water level with respect to the level of penstock (H).  Unit = m. Typical Value = 40.
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
        ((GovHydroFrancis) _this_).setH2(_value_);
    }

    private static String h2ToString(BaseClass _this_) {
        return ((GovHydroFrancis) _this_).h2ToString();
    }

    /**
     * Rated hydraulic head (H).  Unit = m. Typical Value = 250.
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
        ((GovHydroFrancis) _this_).setHn(_value_);
    }

    private static String hnToString(BaseClass _this_) {
        return ((GovHydroFrancis) _this_).hnToString();
    }

    /**
     * Penstock loss coefficient (due to friction) (Kc).  Typical Value = 0.025.
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
        ((GovHydroFrancis) _this_).setKc(_value_);
    }

    private static String kcToString(BaseClass _this_) {
        return ((GovHydroFrancis) _this_).kcToString();
    }

    /**
     * Water tunnel and surge chamber loss coefficient (due to friction) (Kg).  Typical Value = 0.025.
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
        ((GovHydroFrancis) _this_).setKg(_value_);
    }

    private static String kgToString(BaseClass _this_) {
        return ((GovHydroFrancis) _this_).kgToString();
    }

    /**
     * Washout gain (Kt).  Typical Value = 0.25.
     */
    private Double kt; // PU

    public Double getKt() {
        return kt;
    }

    public void setKt(Double _value_) {
        kt = _value_;
    }

    public void setKt(String _value_) {
        kt = getDoubleFromString(_value_);
    }

    public String ktToString() {
        return kt != null ? kt.toString() : null;
    }

    private static void setKt(BaseClass _this_, String _value_) {
        ((GovHydroFrancis) _this_).setKt(_value_);
    }

    private static String ktToString(BaseClass _this_) {
        return ((GovHydroFrancis) _this_).ktToString();
    }

    /**
     * No-load turbine flow at nominal head (Qc0).  Typical Value = 0.21.
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
        ((GovHydroFrancis) _this_).setQc0(_value_);
    }

    private static String qc0ToString(BaseClass _this_) {
        return ((GovHydroFrancis) _this_).qc0ToString();
    }

    /**
     * Rated flow (Q). Unit = m/s. Typical Value = 40.
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
        ((GovHydroFrancis) _this_).setQn(_value_);
    }

    private static String qnToString(BaseClass _this_) {
        return ((GovHydroFrancis) _this_).qnToString();
    }

    /**
     * Derivative gain (Ta).  Typical Value = 3.
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
        ((GovHydroFrancis) _this_).setTa(_value_);
    }

    private static String taToString(BaseClass _this_) {
        return ((GovHydroFrancis) _this_).taToString();
    }

    /**
     * Washout time constant (Td).  Typical Value = 3.
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
        ((GovHydroFrancis) _this_).setTd(_value_);
    }

    private static String tdToString(BaseClass _this_) {
        return ((GovHydroFrancis) _this_).tdToString();
    }

    /**
     * Gate servo time constant (Ts).  Typical Value = 0.5.
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
        ((GovHydroFrancis) _this_).setTs(_value_);
    }

    private static String tsToString(BaseClass _this_) {
        return ((GovHydroFrancis) _this_).tsToString();
    }

    /**
     * Water inertia time constant (Twnc).  Typical Value = 1.
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
        ((GovHydroFrancis) _this_).setTwnc(_value_);
    }

    private static String twncToString(BaseClass _this_) {
        return ((GovHydroFrancis) _this_).twncToString();
    }

    /**
     * Water tunnel and surge chamber inertia time constant (Twng). Typical Value = 3.
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
        ((GovHydroFrancis) _this_).setTwng(_value_);
    }

    private static String twngToString(BaseClass _this_) {
        return ((GovHydroFrancis) _this_).twngToString();
    }

    /**
     * Derivative feedback gain (Tx).  Typical Value = 1.
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
        ((GovHydroFrancis) _this_).setTx(_value_);
    }

    private static String txToString(BaseClass _this_) {
        return ((GovHydroFrancis) _this_).txToString();
    }

    /**
     * Maximum gate opening velocity (Va).  Unit = PU/sec.  Typical Value = 0.011.
     */
    private Double va; // Simple_Float

    public Double getVa() {
        return va;
    }

    public void setVa(Double _value_) {
        va = _value_;
    }

    public void setVa(String _value_) {
        va = getDoubleFromString(_value_);
    }

    public String vaToString() {
        return va != null ? va.toString() : null;
    }

    private static void setVa(BaseClass _this_, String _value_) {
        ((GovHydroFrancis) _this_).setVa(_value_);
    }

    private static String vaToString(BaseClass _this_) {
        return ((GovHydroFrancis) _this_).vaToString();
    }

    /**
     * Maximum gate opening (ValvMax).  Typical Value = 1.
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
        ((GovHydroFrancis) _this_).setValvmax(_value_);
    }

    private static String valvmaxToString(BaseClass _this_) {
        return ((GovHydroFrancis) _this_).valvmaxToString();
    }

    /**
     * Minimum gate opening (ValvMin).  Typical Value = 0.
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
        ((GovHydroFrancis) _this_).setValvmin(_value_);
    }

    private static String valvminToString(BaseClass _this_) {
        return ((GovHydroFrancis) _this_).valvminToString();
    }

    /**
     * Maximum gate closing velocity (Vc).  Unit = PU/sec.  Typical Value = -0.011.
     */
    private Double vc; // Simple_Float

    public Double getVc() {
        return vc;
    }

    public void setVc(Double _value_) {
        vc = _value_;
    }

    public void setVc(String _value_) {
        vc = getDoubleFromString(_value_);
    }

    public String vcToString() {
        return vc != null ? vc.toString() : null;
    }

    private static void setVc(BaseClass _this_, String _value_) {
        ((GovHydroFrancis) _this_).setVc(_value_);
    }

    private static String vcToString(BaseClass _this_) {
        return ((GovHydroFrancis) _this_).vcToString();
    }

    /**
     * Water tunnel and surge chamber simulation (Tflag). true = enable of water tunnel and surge chamber simulation false = inhibit of water tunnel and surge chamber simulation. Typical Value = false.
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
        ((GovHydroFrancis) _this_).setWaterTunnelSurgeChamberSimulation(_value_);
    }

    private static String waterTunnelSurgeChamberSimulationToString(BaseClass _this_) {
        return ((GovHydroFrancis) _this_).waterTunnelSurgeChamberSimulationToString();
    }

    /**
     * Head of upper water level with respect to the level of penstock (Zsfc).  Unit = m.  Typical Value = 25.
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
        ((GovHydroFrancis) _this_).setZsfc(_value_);
    }

    private static String zsfcToString(BaseClass _this_) {
        return ((GovHydroFrancis) _this_).zsfcToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "GovHydroFrancis", attrName));
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
                "GovHydroFrancis", attrName, objectValue));
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
                "GovHydroFrancis", attrName, stringValue));
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
            map.put("am", new AttrDetails("GovHydroFrancis.am", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroFrancis::amToString, null, GovHydroFrancis::setAm));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("av0", new AttrDetails("GovHydroFrancis.av0", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroFrancis::av0ToString, null, GovHydroFrancis::setAv0));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("av1", new AttrDetails("GovHydroFrancis.av1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroFrancis::av1ToString, null, GovHydroFrancis::setAv1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("bp", new AttrDetails("GovHydroFrancis.bp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroFrancis::bpToString, null, GovHydroFrancis::setBp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("db1", new AttrDetails("GovHydroFrancis.db1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroFrancis::db1ToString, null, GovHydroFrancis::setDb1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("etamax", new AttrDetails("GovHydroFrancis.etamax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroFrancis::etamaxToString, null, GovHydroFrancis::setEtamax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("governorControl", new AttrDetails("GovHydroFrancis.governorControl", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true, GovHydroFrancis::governorControlToString, null, GovHydroFrancis::setGovernorControl));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("h1", new AttrDetails("GovHydroFrancis.h1", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroFrancis::h1ToString, null, GovHydroFrancis::setH1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("h2", new AttrDetails("GovHydroFrancis.h2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroFrancis::h2ToString, null, GovHydroFrancis::setH2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("hn", new AttrDetails("GovHydroFrancis.hn", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroFrancis::hnToString, null, GovHydroFrancis::setHn));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kc", new AttrDetails("GovHydroFrancis.kc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroFrancis::kcToString, null, GovHydroFrancis::setKc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kg", new AttrDetails("GovHydroFrancis.kg", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroFrancis::kgToString, null, GovHydroFrancis::setKg));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kt", new AttrDetails("GovHydroFrancis.kt", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroFrancis::ktToString, null, GovHydroFrancis::setKt));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("qc0", new AttrDetails("GovHydroFrancis.qc0", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroFrancis::qc0ToString, null, GovHydroFrancis::setQc0));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("qn", new AttrDetails("GovHydroFrancis.qn", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroFrancis::qnToString, null, GovHydroFrancis::setQn));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ta", new AttrDetails("GovHydroFrancis.ta", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroFrancis::taToString, null, GovHydroFrancis::setTa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("td", new AttrDetails("GovHydroFrancis.td", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroFrancis::tdToString, null, GovHydroFrancis::setTd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ts", new AttrDetails("GovHydroFrancis.ts", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroFrancis::tsToString, null, GovHydroFrancis::setTs));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("twnc", new AttrDetails("GovHydroFrancis.twnc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroFrancis::twncToString, null, GovHydroFrancis::setTwnc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("twng", new AttrDetails("GovHydroFrancis.twng", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroFrancis::twngToString, null, GovHydroFrancis::setTwng));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tx", new AttrDetails("GovHydroFrancis.tx", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroFrancis::txToString, null, GovHydroFrancis::setTx));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("va", new AttrDetails("GovHydroFrancis.va", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroFrancis::vaToString, null, GovHydroFrancis::setVa));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("valvmax", new AttrDetails("GovHydroFrancis.valvmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroFrancis::valvmaxToString, null, GovHydroFrancis::setValvmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("valvmin", new AttrDetails("GovHydroFrancis.valvmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroFrancis::valvminToString, null, GovHydroFrancis::setValvmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vc", new AttrDetails("GovHydroFrancis.vc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroFrancis::vcToString, null, GovHydroFrancis::setVc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("waterTunnelSurgeChamberSimulation", new AttrDetails("GovHydroFrancis.waterTunnelSurgeChamberSimulation", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroFrancis::waterTunnelSurgeChamberSimulationToString, null, GovHydroFrancis::setWaterTunnelSurgeChamberSimulation));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("zsfc", new AttrDetails("GovHydroFrancis.zsfc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, GovHydroFrancis::zsfcToString, null, GovHydroFrancis::setZsfc));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new GovHydroFrancis().allAttrDetailsMap());
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
