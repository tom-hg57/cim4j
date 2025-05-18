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
 * Hydro turbine and governor. Represents plants with straight-forward penstock configurations and hydraulic governors of the traditional 'dashpot' type.  This model can be used to represent simple, Francis/Pelton or Kaplan turbines.
 */
@SuppressWarnings("unused")
public class GovHydro4 extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovHydro4.class);

    /**
     * Constructor.
     */
    public GovHydro4(String rdfid) {
        super("GovHydro4", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected GovHydro4(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Turbine gain (&lt;i&gt;At&lt;/i&gt;).  Typical value = 1,2.
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
        ((GovHydro4) _this_).setAt(_value_);
    }

    private static String atToString(BaseClass _this_) {
        return ((GovHydro4) _this_).atToString();
    }

    /**
     * Kaplan blade servo point 0 (&lt;i&gt;Bgv0&lt;/i&gt;) (= 0 for simple, = 0 for Francis/Pelton).  Typical value for Kaplan = 0.
     */
    private Double bgv0; // PU

    public Double getBgv0() {
        return bgv0;
    }

    public void setBgv0(Double _value_) {
        bgv0 = _value_;
    }

    public void setBgv0(String _value_) {
        bgv0 = getDoubleFromString(_value_);
    }

    public String bgv0ToString() {
        return bgv0 != null ? bgv0.toString() : null;
    }

    private static void setBgv0(BaseClass _this_, String _value_) {
        ((GovHydro4) _this_).setBgv0(_value_);
    }

    private static String bgv0ToString(BaseClass _this_) {
        return ((GovHydro4) _this_).bgv0ToString();
    }

    /**
     * Kaplan blade servo point 1 (&lt;i&gt;Bgv1&lt;/i&gt;) (= 0 for simple, = 0 for Francis/Pelton).  Typical value for Kaplan = 0.
     */
    private Double bgv1; // PU

    public Double getBgv1() {
        return bgv1;
    }

    public void setBgv1(Double _value_) {
        bgv1 = _value_;
    }

    public void setBgv1(String _value_) {
        bgv1 = getDoubleFromString(_value_);
    }

    public String bgv1ToString() {
        return bgv1 != null ? bgv1.toString() : null;
    }

    private static void setBgv1(BaseClass _this_, String _value_) {
        ((GovHydro4) _this_).setBgv1(_value_);
    }

    private static String bgv1ToString(BaseClass _this_) {
        return ((GovHydro4) _this_).bgv1ToString();
    }

    /**
     * Kaplan blade servo point 2 (&lt;i&gt;Bgv2&lt;/i&gt;) (= 0 for simple, = 0 for Francis/Pelton).  Typical value for Kaplan = 0,1.
     */
    private Double bgv2; // PU

    public Double getBgv2() {
        return bgv2;
    }

    public void setBgv2(Double _value_) {
        bgv2 = _value_;
    }

    public void setBgv2(String _value_) {
        bgv2 = getDoubleFromString(_value_);
    }

    public String bgv2ToString() {
        return bgv2 != null ? bgv2.toString() : null;
    }

    private static void setBgv2(BaseClass _this_, String _value_) {
        ((GovHydro4) _this_).setBgv2(_value_);
    }

    private static String bgv2ToString(BaseClass _this_) {
        return ((GovHydro4) _this_).bgv2ToString();
    }

    /**
     * Kaplan blade servo point 3 (&lt;i&gt;Bgv3&lt;/i&gt;) (= 0 for simple, = 0 for Francis/Pelton).  Typical value for Kaplan = 0,667.
     */
    private Double bgv3; // PU

    public Double getBgv3() {
        return bgv3;
    }

    public void setBgv3(Double _value_) {
        bgv3 = _value_;
    }

    public void setBgv3(String _value_) {
        bgv3 = getDoubleFromString(_value_);
    }

    public String bgv3ToString() {
        return bgv3 != null ? bgv3.toString() : null;
    }

    private static void setBgv3(BaseClass _this_, String _value_) {
        ((GovHydro4) _this_).setBgv3(_value_);
    }

    private static String bgv3ToString(BaseClass _this_) {
        return ((GovHydro4) _this_).bgv3ToString();
    }

    /**
     * Kaplan blade servo point 4 (&lt;i&gt;Bgv4&lt;/i&gt;) (= 0 for simple, = 0 for Francis/Pelton).  Typical value for Kaplan = 0,9.
     */
    private Double bgv4; // PU

    public Double getBgv4() {
        return bgv4;
    }

    public void setBgv4(Double _value_) {
        bgv4 = _value_;
    }

    public void setBgv4(String _value_) {
        bgv4 = getDoubleFromString(_value_);
    }

    public String bgv4ToString() {
        return bgv4 != null ? bgv4.toString() : null;
    }

    private static void setBgv4(BaseClass _this_, String _value_) {
        ((GovHydro4) _this_).setBgv4(_value_);
    }

    private static String bgv4ToString(BaseClass _this_) {
        return ((GovHydro4) _this_).bgv4ToString();
    }

    /**
     * Kaplan blade servo point 5 (&lt;i&gt;Bgv5&lt;/i&gt;) (= 0 for simple, = 0 for Francis/Pelton).  Typical value for Kaplan = 1.
     */
    private Double bgv5; // PU

    public Double getBgv5() {
        return bgv5;
    }

    public void setBgv5(Double _value_) {
        bgv5 = _value_;
    }

    public void setBgv5(String _value_) {
        bgv5 = getDoubleFromString(_value_);
    }

    public String bgv5ToString() {
        return bgv5 != null ? bgv5.toString() : null;
    }

    private static void setBgv5(BaseClass _this_, String _value_) {
        ((GovHydro4) _this_).setBgv5(_value_);
    }

    private static String bgv5ToString(BaseClass _this_) {
        return ((GovHydro4) _this_).bgv5ToString();
    }

    /**
     * Maximum blade adjustment factor (&lt;i&gt;Bmax&lt;/i&gt;)  (= 0 for simple, = 0 for Francis/Pelton).  Typical value for Kaplan = 1,1276.
     */
    private Float bmax; // Float

    public Float getBmax() {
        return bmax;
    }

    public void setBmax(Float _value_) {
        bmax = _value_;
    }

    public void setBmax(String _value_) {
        bmax = getFloatFromString(_value_);
    }

    public String bmaxToString() {
        return bmax != null ? bmax.toString() : null;
    }

    private static void setBmax(BaseClass _this_, String _value_) {
        ((GovHydro4) _this_).setBmax(_value_);
    }

    private static String bmaxToString(BaseClass _this_) {
        return ((GovHydro4) _this_).bmaxToString();
    }

    /**
     * Intentional deadband width (&lt;i&gt;db1&lt;/i&gt;).  Unit = Hz.  Typical value = 0.
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
        ((GovHydro4) _this_).setDb1(_value_);
    }

    private static String db1ToString(BaseClass _this_) {
        return ((GovHydro4) _this_).db1ToString();
    }

    /**
     * Unintentional dead-band (&lt;i&gt;db2&lt;/i&gt;).  Unit = MW.  Typical value = 0.
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
        ((GovHydro4) _this_).setDb2(_value_);
    }

    private static String db2ToString(BaseClass _this_) {
        return ((GovHydro4) _this_).db2ToString();
    }

    /**
     * Turbine damping factor (&lt;i&gt;Dturb&lt;/i&gt;).  Unit = delta P (PU of &lt;i&gt;MWbase&lt;/i&gt;) / delta speed (PU).  Typical value for simple = 0,5, Francis/Pelton = 1,1, Kaplan = 1,1.
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
        ((GovHydro4) _this_).setDturb(_value_);
    }

    private static String dturbToString(BaseClass _this_) {
        return ((GovHydro4) _this_).dturbToString();
    }

    /**
     * Intentional db hysteresis (&lt;i&gt;eps&lt;/i&gt;).  Unit = Hz.  Typical value = 0.
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
        ((GovHydro4) _this_).setEps(_value_);
    }

    private static String epsToString(BaseClass _this_) {
        return ((GovHydro4) _this_).epsToString();
    }

    /**
     * Maximum gate opening, PU of &lt;i&gt;MWbase&lt;/i&gt; (&lt;i&gt;Gmax&lt;/i&gt;) (&amp;gt; GovHydro4.gmin).  Typical value = 1.
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
        ((GovHydro4) _this_).setGmax(_value_);
    }

    private static String gmaxToString(BaseClass _this_) {
        return ((GovHydro4) _this_).gmaxToString();
    }

    /**
     * Minimum gate opening, PU of &lt;i&gt;MWbase&lt;/i&gt; (&lt;i&gt;Gmin&lt;/i&gt;) (&amp;lt; GovHydro4.gmax).  Typical value = 0.
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
        ((GovHydro4) _this_).setGmin(_value_);
    }

    private static String gminToString(BaseClass _this_) {
        return ((GovHydro4) _this_).gminToString();
    }

    /**
     * Nonlinear gain point 0, PU gv (&lt;i&gt;Gv0&lt;/i&gt;) (= 0 for simple).  Typical for Francis/Pelton = 0,1, Kaplan = 0,1.
     */
    private Double gv0; // PU

    public Double getGv0() {
        return gv0;
    }

    public void setGv0(Double _value_) {
        gv0 = _value_;
    }

    public void setGv0(String _value_) {
        gv0 = getDoubleFromString(_value_);
    }

    public String gv0ToString() {
        return gv0 != null ? gv0.toString() : null;
    }

    private static void setGv0(BaseClass _this_, String _value_) {
        ((GovHydro4) _this_).setGv0(_value_);
    }

    private static String gv0ToString(BaseClass _this_) {
        return ((GovHydro4) _this_).gv0ToString();
    }

    /**
     * Nonlinear gain point 1, PU gv (&lt;i&gt;Gv1&lt;/i&gt;) (= 0 for simple, &amp;gt; GovHydro4.gv0 for Francis/Pelton and Kaplan). Typical value for Francis/Pelton = 0,4, Kaplan = 0,4.
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
        ((GovHydro4) _this_).setGv1(_value_);
    }

    private static String gv1ToString(BaseClass _this_) {
        return ((GovHydro4) _this_).gv1ToString();
    }

    /**
     * Nonlinear gain point 2, PU gv (&lt;i&gt;Gv2&lt;/i&gt;) (= 0 for simple, &amp;gt; GovHydro4.gv1 for Francis/Pelton and Kaplan). Typical value for Francis/Pelton = 0,5, Kaplan = 0,5.
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
        ((GovHydro4) _this_).setGv2(_value_);
    }

    private static String gv2ToString(BaseClass _this_) {
        return ((GovHydro4) _this_).gv2ToString();
    }

    /**
     * Nonlinear gain point 3, PU gv (&lt;i&gt;Gv3&lt;/i&gt;)  (= 0 for simple, &amp;gt; GovHydro4.gv2 for Francis/Pelton and Kaplan). Typical value for Francis/Pelton = 0,7, Kaplan = 0,7.
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
        ((GovHydro4) _this_).setGv3(_value_);
    }

    private static String gv3ToString(BaseClass _this_) {
        return ((GovHydro4) _this_).gv3ToString();
    }

    /**
     * Nonlinear gain point 4, PU gv (&lt;i&gt;Gv4&lt;/i&gt;)  (= 0 for simple, &amp;gt; GovHydro4.gv3 for Francis/Pelton and Kaplan). Typical value for  Francis/Pelton = 0,8, Kaplan = 0,8.
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
        ((GovHydro4) _this_).setGv4(_value_);
    }

    private static String gv4ToString(BaseClass _this_) {
        return ((GovHydro4) _this_).gv4ToString();
    }

    /**
     * Nonlinear gain point 5, PU gv (&lt;i&gt;Gv5&lt;/i&gt;)  (= 0 for simple, &amp;lt; 1 and &amp;gt; GovHydro4.gv4 for Francis/Pelton and Kaplan). Typical value for Francis/Pelton = 0,9, Kaplan = 0,9.
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
        ((GovHydro4) _this_).setGv5(_value_);
    }

    private static String gv5ToString(BaseClass _this_) {
        return ((GovHydro4) _this_).gv5ToString();
    }

    /**
     * Head available at dam (&lt;i&gt;hdam&lt;/i&gt;).  Typical value = 1.
     */
    private Double hdam; // PU

    public Double getHdam() {
        return hdam;
    }

    public void setHdam(Double _value_) {
        hdam = _value_;
    }

    public void setHdam(String _value_) {
        hdam = getDoubleFromString(_value_);
    }

    public String hdamToString() {
        return hdam != null ? hdam.toString() : null;
    }

    private static void setHdam(BaseClass _this_, String _value_) {
        ((GovHydro4) _this_).setHdam(_value_);
    }

    private static String hdamToString(BaseClass _this_) {
        return ((GovHydro4) _this_).hdamToString();
    }

    /**
     * The kind of model being represented (simple, Francis/Pelton or Kaplan).
     */
    private String model; // GovHydro4ModelKind

    public String getModel() {
        return model;
    }

    public void setModel(String _value_) {
        model = _value_;
    }

    public String modelToString() {
        return model;
    }

    private static void setModel(BaseClass _this_, String _value_) {
        ((GovHydro4) _this_).setModel(_value_);
    }

    private static String modelToString(BaseClass _this_) {
        return ((GovHydro4) _this_).modelToString();
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
        ((GovHydro4) _this_).setMwbase(_value_);
    }

    private static String mwbaseToString(BaseClass _this_) {
        return ((GovHydro4) _this_).mwbaseToString();
    }

    /**
     * Nonlinear gain point 0, PU power (&lt;i&gt;Pgv0&lt;/i&gt;) (= 0 for simple).  Typical value = 0.
     */
    private Double pgv0; // PU

    public Double getPgv0() {
        return pgv0;
    }

    public void setPgv0(Double _value_) {
        pgv0 = _value_;
    }

    public void setPgv0(String _value_) {
        pgv0 = getDoubleFromString(_value_);
    }

    public String pgv0ToString() {
        return pgv0 != null ? pgv0.toString() : null;
    }

    private static void setPgv0(BaseClass _this_, String _value_) {
        ((GovHydro4) _this_).setPgv0(_value_);
    }

    private static String pgv0ToString(BaseClass _this_) {
        return ((GovHydro4) _this_).pgv0ToString();
    }

    /**
     * Nonlinear gain point 1, PU power (&lt;i&gt;Pgv1&lt;/i&gt;) (= 0 for simple). Typical value for Francis/Pelton = 0,42, Kaplan = 0,35.
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
        ((GovHydro4) _this_).setPgv1(_value_);
    }

    private static String pgv1ToString(BaseClass _this_) {
        return ((GovHydro4) _this_).pgv1ToString();
    }

    /**
     * Nonlinear gain point 2, PU power (&lt;i&gt;Pgv2&lt;/i&gt;) (= 0 for simple). Typical value for Francis/Pelton = 0,56, Kaplan = 0,468.
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
        ((GovHydro4) _this_).setPgv2(_value_);
    }

    private static String pgv2ToString(BaseClass _this_) {
        return ((GovHydro4) _this_).pgv2ToString();
    }

    /**
     * Nonlinear gain point 3, PU power (&lt;i&gt;Pgv3&lt;/i&gt;) (= 0 for simple). Typical value for Francis/Pelton = 0,8, Kaplan = 0,796.
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
        ((GovHydro4) _this_).setPgv3(_value_);
    }

    private static String pgv3ToString(BaseClass _this_) {
        return ((GovHydro4) _this_).pgv3ToString();
    }

    /**
     * Nonlinear gain point 4, PU power (&lt;i&gt;Pgv4&lt;/i&gt;) (= 0 for simple). Typical value for Francis/Pelton = 0,9, Kaplan = 0,917.
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
        ((GovHydro4) _this_).setPgv4(_value_);
    }

    private static String pgv4ToString(BaseClass _this_) {
        return ((GovHydro4) _this_).pgv4ToString();
    }

    /**
     * Nonlinear gain point 5, PU power (&lt;i&gt;Pgv5&lt;/i&gt;) (= 0 for simple).  Typical value for Francis/Pelton = 0,97, Kaplan = 0,99.
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
        ((GovHydro4) _this_).setPgv5(_value_);
    }

    private static String pgv5ToString(BaseClass _this_) {
        return ((GovHydro4) _this_).pgv5ToString();
    }

    /**
     * No-load flow at nominal head (&lt;i&gt;Qnl&lt;/i&gt;). Typical value for simple = 0,08, Francis/Pelton = 0, Kaplan = 0.
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
        ((GovHydro4) _this_).setQnl(_value_);
    }

    private static String qnlToString(BaseClass _this_) {
        return ((GovHydro4) _this_).qnlToString();
    }

    /**
     * Permanent droop (&lt;i&gt;Rperm&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,05.
     */
    private Double rperm; // Seconds

    public Double getRperm() {
        return rperm;
    }

    public void setRperm(Double _value_) {
        rperm = _value_;
    }

    public void setRperm(String _value_) {
        rperm = getDoubleFromString(_value_);
    }

    public String rpermToString() {
        return rperm != null ? rperm.toString() : null;
    }

    private static void setRperm(BaseClass _this_, String _value_) {
        ((GovHydro4) _this_).setRperm(_value_);
    }

    private static String rpermToString(BaseClass _this_) {
        return ((GovHydro4) _this_).rpermToString();
    }

    /**
     * Temporary droop (&lt;i&gt;Rtemp&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,3.
     */
    private Double rtemp; // Seconds

    public Double getRtemp() {
        return rtemp;
    }

    public void setRtemp(Double _value_) {
        rtemp = _value_;
    }

    public void setRtemp(String _value_) {
        rtemp = getDoubleFromString(_value_);
    }

    public String rtempToString() {
        return rtemp != null ? rtemp.toString() : null;
    }

    private static void setRtemp(BaseClass _this_, String _value_) {
        ((GovHydro4) _this_).setRtemp(_value_);
    }

    private static String rtempToString(BaseClass _this_) {
        return ((GovHydro4) _this_).rtempToString();
    }

    /**
     * Blade servo time constant (&lt;i&gt;Tblade&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 100.
     */
    private Double tblade; // Seconds

    public Double getTblade() {
        return tblade;
    }

    public void setTblade(Double _value_) {
        tblade = _value_;
    }

    public void setTblade(String _value_) {
        tblade = getDoubleFromString(_value_);
    }

    public String tbladeToString() {
        return tblade != null ? tblade.toString() : null;
    }

    private static void setTblade(BaseClass _this_, String _value_) {
        ((GovHydro4) _this_).setTblade(_value_);
    }

    private static String tbladeToString(BaseClass _this_) {
        return ((GovHydro4) _this_).tbladeToString();
    }

    /**
     * Gate servo time constant (&lt;i&gt;Tg&lt;/i&gt;) (&amp;gt; 0).  Typical value = 0,5.
     */
    private Double tg; // Seconds

    public Double getTg() {
        return tg;
    }

    public void setTg(Double _value_) {
        tg = _value_;
    }

    public void setTg(String _value_) {
        tg = getDoubleFromString(_value_);
    }

    public String tgToString() {
        return tg != null ? tg.toString() : null;
    }

    private static void setTg(BaseClass _this_, String _value_) {
        ((GovHydro4) _this_).setTg(_value_);
    }

    private static String tgToString(BaseClass _this_) {
        return ((GovHydro4) _this_).tgToString();
    }

    /**
     * Pilot servo time constant (&lt;i&gt;Tp&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,1.
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
        ((GovHydro4) _this_).setTp(_value_);
    }

    private static String tpToString(BaseClass _this_) {
        return ((GovHydro4) _this_).tpToString();
    }

    /**
     * Dashpot time constant (&lt;i&gt;Tr&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 5.
     */
    private Double tr; // Seconds

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
        ((GovHydro4) _this_).setTr(_value_);
    }

    private static String trToString(BaseClass _this_) {
        return ((GovHydro4) _this_).trToString();
    }

    /**
     * Water inertia time constant (&lt;i&gt;Tw&lt;/i&gt;) (&amp;gt; 0).  Typical value = 1.
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
        ((GovHydro4) _this_).setTw(_value_);
    }

    private static String twToString(BaseClass _this_) {
        return ((GovHydro4) _this_).twToString();
    }

    /**
     * Max gate closing velocity (&lt;i&gt;Uc&lt;/i&gt;).  Typical value = 0,2.
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
        ((GovHydro4) _this_).setUc(_value_);
    }

    private static String ucToString(BaseClass _this_) {
        return ((GovHydro4) _this_).ucToString();
    }

    /**
     * Max gate opening velocity (&lt;i&gt;Uo&lt;/i&gt;).  Typical value = 0,2.
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
        ((GovHydro4) _this_).setUo(_value_);
    }

    private static String uoToString(BaseClass _this_) {
        return ((GovHydro4) _this_).uoToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "GovHydro4", attrName));
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
                "GovHydro4", attrName, objectValue));
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
                "GovHydro4", attrName, stringValue));
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
            map.put("at", new AttrDetails("GovHydro4.at", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::atToString, null, GovHydro4::setAt));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("bgv0", new AttrDetails("GovHydro4.bgv0", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::bgv0ToString, null, GovHydro4::setBgv0));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("bgv1", new AttrDetails("GovHydro4.bgv1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::bgv1ToString, null, GovHydro4::setBgv1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("bgv2", new AttrDetails("GovHydro4.bgv2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::bgv2ToString, null, GovHydro4::setBgv2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("bgv3", new AttrDetails("GovHydro4.bgv3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::bgv3ToString, null, GovHydro4::setBgv3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("bgv4", new AttrDetails("GovHydro4.bgv4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::bgv4ToString, null, GovHydro4::setBgv4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("bgv5", new AttrDetails("GovHydro4.bgv5", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::bgv5ToString, null, GovHydro4::setBgv5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("bmax", new AttrDetails("GovHydro4.bmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::bmaxToString, null, GovHydro4::setBmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("db1", new AttrDetails("GovHydro4.db1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::db1ToString, null, GovHydro4::setDb1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("db2", new AttrDetails("GovHydro4.db2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::db2ToString, null, GovHydro4::setDb2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dturb", new AttrDetails("GovHydro4.dturb", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::dturbToString, null, GovHydro4::setDturb));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("eps", new AttrDetails("GovHydro4.eps", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::epsToString, null, GovHydro4::setEps));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gmax", new AttrDetails("GovHydro4.gmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::gmaxToString, null, GovHydro4::setGmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gmin", new AttrDetails("GovHydro4.gmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::gminToString, null, GovHydro4::setGmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv0", new AttrDetails("GovHydro4.gv0", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::gv0ToString, null, GovHydro4::setGv0));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv1", new AttrDetails("GovHydro4.gv1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::gv1ToString, null, GovHydro4::setGv1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv2", new AttrDetails("GovHydro4.gv2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::gv2ToString, null, GovHydro4::setGv2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv3", new AttrDetails("GovHydro4.gv3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::gv3ToString, null, GovHydro4::setGv3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv4", new AttrDetails("GovHydro4.gv4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::gv4ToString, null, GovHydro4::setGv4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("gv5", new AttrDetails("GovHydro4.gv5", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::gv5ToString, null, GovHydro4::setGv5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("hdam", new AttrDetails("GovHydro4.hdam", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::hdamToString, null, GovHydro4::setHdam));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("model", new AttrDetails("GovHydro4.model", true, "http://iec.ch/TC57/CIM100#", profiles, false, true, GovHydro4::modelToString, null, GovHydro4::setModel));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("mwbase", new AttrDetails("GovHydro4.mwbase", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::mwbaseToString, null, GovHydro4::setMwbase));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv0", new AttrDetails("GovHydro4.pgv0", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::pgv0ToString, null, GovHydro4::setPgv0));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv1", new AttrDetails("GovHydro4.pgv1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::pgv1ToString, null, GovHydro4::setPgv1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv2", new AttrDetails("GovHydro4.pgv2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::pgv2ToString, null, GovHydro4::setPgv2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv3", new AttrDetails("GovHydro4.pgv3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::pgv3ToString, null, GovHydro4::setPgv3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv4", new AttrDetails("GovHydro4.pgv4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::pgv4ToString, null, GovHydro4::setPgv4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("pgv5", new AttrDetails("GovHydro4.pgv5", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::pgv5ToString, null, GovHydro4::setPgv5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("qnl", new AttrDetails("GovHydro4.qnl", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::qnlToString, null, GovHydro4::setQnl));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rperm", new AttrDetails("GovHydro4.rperm", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::rpermToString, null, GovHydro4::setRperm));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("rtemp", new AttrDetails("GovHydro4.rtemp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::rtempToString, null, GovHydro4::setRtemp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tblade", new AttrDetails("GovHydro4.tblade", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::tbladeToString, null, GovHydro4::setTblade));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tg", new AttrDetails("GovHydro4.tg", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::tgToString, null, GovHydro4::setTg));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tp", new AttrDetails("GovHydro4.tp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::tpToString, null, GovHydro4::setTp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tr", new AttrDetails("GovHydro4.tr", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::trToString, null, GovHydro4::setTr));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tw", new AttrDetails("GovHydro4.tw", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::twToString, null, GovHydro4::setTw));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("uc", new AttrDetails("GovHydro4.uc", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::ucToString, null, GovHydro4::setUc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("uo", new AttrDetails("GovHydro4.uo", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, GovHydro4::uoToString, null, GovHydro4::setUo));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new GovHydro4(null).allAttrDetailsMap());
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
