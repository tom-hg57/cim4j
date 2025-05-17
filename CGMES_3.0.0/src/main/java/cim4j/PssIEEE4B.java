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
 * IEEE 421.5-2005 type PSS4B power system stabilizer. The PSS4B model represents a structure based on multiple working frequency bands. Three separate bands, respectively dedicated to the low-, intermediate- and high-frequency modes of oscillations, are used in this delta omega (speed input) PSS. There is an error in the in IEEE 421.5-2005 PSS4B model: the <i>Pe</i> input should read -<i>Pe</i>. This implies that the input <i>Pe</i> needs to be multiplied by -1. Reference: IEEE 4B 421.5-2005, 8.4.  Parameter details: This model has 2 input signals. They have the following fixed types (expressed in terms of InputSignalKind values): the first one is of rotorAngleFrequencyDeviation type and the second one is of generatorElectricalPower type.
 */
@SuppressWarnings("unused")
public class PssIEEE4B extends PowerSystemStabilizerDynamics {

    private static final Logging LOG = Logging.getLogger(PssIEEE4B.class);

    /**
     * Default constructor.
     */
    public PssIEEE4B() {
        setCimType("PssIEEE4B");
    }

    /**
     * Notch filter 1 (high-frequency band): three dB bandwidth (&lt;i&gt;B&lt;/i&gt;&lt;i&gt;&lt;sub&gt;wi&lt;/sub&gt;&lt;/i&gt;).
     */
    private Float bwh1; // Float

    public Float getBwh1() {
        return bwh1;
    }

    public void setBwh1(Float _value_) {
        bwh1 = _value_;
    }

    public void setBwh1(String _value_) {
        bwh1 = getFloatFromString(_value_);
    }

    public String bwh1ToString() {
        return bwh1 != null ? bwh1.toString() : null;
    }

    private static void setBwh1(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setBwh1(_value_);
    }

    private static String bwh1ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).bwh1ToString();
    }

    /**
     * Notch filter 2 (high-frequency band): three dB bandwidth (&lt;i&gt;B&lt;/i&gt;&lt;i&gt;&lt;sub&gt;wi&lt;/sub&gt;&lt;/i&gt;).
     */
    private Float bwh2; // Float

    public Float getBwh2() {
        return bwh2;
    }

    public void setBwh2(Float _value_) {
        bwh2 = _value_;
    }

    public void setBwh2(String _value_) {
        bwh2 = getFloatFromString(_value_);
    }

    public String bwh2ToString() {
        return bwh2 != null ? bwh2.toString() : null;
    }

    private static void setBwh2(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setBwh2(_value_);
    }

    private static String bwh2ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).bwh2ToString();
    }

    /**
     * Notch filter 1 (low-frequency band): three dB bandwidth (&lt;i&gt;B&lt;/i&gt;&lt;i&gt;&lt;sub&gt;wi&lt;/sub&gt;&lt;/i&gt;).
     */
    private Float bwl1; // Float

    public Float getBwl1() {
        return bwl1;
    }

    public void setBwl1(Float _value_) {
        bwl1 = _value_;
    }

    public void setBwl1(String _value_) {
        bwl1 = getFloatFromString(_value_);
    }

    public String bwl1ToString() {
        return bwl1 != null ? bwl1.toString() : null;
    }

    private static void setBwl1(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setBwl1(_value_);
    }

    private static String bwl1ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).bwl1ToString();
    }

    /**
     * Notch filter 2 (low-frequency band): three dB bandwidth (&lt;i&gt;B&lt;/i&gt;&lt;i&gt;&lt;sub&gt;wi&lt;/sub&gt;&lt;/i&gt;).
     */
    private Float bwl2; // Float

    public Float getBwl2() {
        return bwl2;
    }

    public void setBwl2(Float _value_) {
        bwl2 = _value_;
    }

    public void setBwl2(String _value_) {
        bwl2 = getFloatFromString(_value_);
    }

    public String bwl2ToString() {
        return bwl2 != null ? bwl2.toString() : null;
    }

    private static void setBwl2(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setBwl2(_value_);
    }

    private static String bwl2ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).bwl2ToString();
    }

    /**
     * High band gain (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;H&lt;/sub&gt;&lt;/i&gt;).  Typical value = 120.
     */
    private Double kh; // PU

    public Double getKh() {
        return kh;
    }

    public void setKh(Double _value_) {
        kh = _value_;
    }

    public void setKh(String _value_) {
        kh = getDoubleFromString(_value_);
    }

    public String khToString() {
        return kh != null ? kh.toString() : null;
    }

    private static void setKh(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setKh(_value_);
    }

    private static String khToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).khToString();
    }

    /**
     * High band differential filter gain (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;H1&lt;/sub&gt;&lt;/i&gt;).  Typical value = 66.
     */
    private Double kh1; // PU

    public Double getKh1() {
        return kh1;
    }

    public void setKh1(Double _value_) {
        kh1 = _value_;
    }

    public void setKh1(String _value_) {
        kh1 = getDoubleFromString(_value_);
    }

    public String kh1ToString() {
        return kh1 != null ? kh1.toString() : null;
    }

    private static void setKh1(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setKh1(_value_);
    }

    private static String kh1ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).kh1ToString();
    }

    /**
     * High band first lead-lag blocks coefficient (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;H11&lt;/sub&gt;&lt;/i&gt;).  Typical value = 1.
     */
    private Double kh11; // PU

    public Double getKh11() {
        return kh11;
    }

    public void setKh11(Double _value_) {
        kh11 = _value_;
    }

    public void setKh11(String _value_) {
        kh11 = getDoubleFromString(_value_);
    }

    public String kh11ToString() {
        return kh11 != null ? kh11.toString() : null;
    }

    private static void setKh11(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setKh11(_value_);
    }

    private static String kh11ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).kh11ToString();
    }

    /**
     * High band first lead-lag blocks coefficient (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;H17&lt;/sub&gt;&lt;/i&gt;).  Typical value = 1.
     */
    private Double kh17; // PU

    public Double getKh17() {
        return kh17;
    }

    public void setKh17(Double _value_) {
        kh17 = _value_;
    }

    public void setKh17(String _value_) {
        kh17 = getDoubleFromString(_value_);
    }

    public String kh17ToString() {
        return kh17 != null ? kh17.toString() : null;
    }

    private static void setKh17(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setKh17(_value_);
    }

    private static String kh17ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).kh17ToString();
    }

    /**
     * High band differential filter gain (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;H2&lt;/sub&gt;&lt;/i&gt;).  Typical value = 66.
     */
    private Double kh2; // PU

    public Double getKh2() {
        return kh2;
    }

    public void setKh2(Double _value_) {
        kh2 = _value_;
    }

    public void setKh2(String _value_) {
        kh2 = getDoubleFromString(_value_);
    }

    public String kh2ToString() {
        return kh2 != null ? kh2.toString() : null;
    }

    private static void setKh2(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setKh2(_value_);
    }

    private static String kh2ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).kh2ToString();
    }

    /**
     * Intermediate band gain (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;I&lt;/sub&gt;&lt;/i&gt;).  Typical value = 30.
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
        ((PssIEEE4B) _this_).setKi(_value_);
    }

    private static String kiToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).kiToString();
    }

    /**
     * Intermediate band differential filter gain (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;I1&lt;/sub&gt;&lt;/i&gt;).  Typical value = 66.
     */
    private Double ki1; // PU

    public Double getKi1() {
        return ki1;
    }

    public void setKi1(Double _value_) {
        ki1 = _value_;
    }

    public void setKi1(String _value_) {
        ki1 = getDoubleFromString(_value_);
    }

    public String ki1ToString() {
        return ki1 != null ? ki1.toString() : null;
    }

    private static void setKi1(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setKi1(_value_);
    }

    private static String ki1ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).ki1ToString();
    }

    /**
     * Intermediate band first lead-lag blocks coefficient (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;I11&lt;/sub&gt;&lt;/i&gt;).  Typical value = 1.
     */
    private Double ki11; // PU

    public Double getKi11() {
        return ki11;
    }

    public void setKi11(Double _value_) {
        ki11 = _value_;
    }

    public void setKi11(String _value_) {
        ki11 = getDoubleFromString(_value_);
    }

    public String ki11ToString() {
        return ki11 != null ? ki11.toString() : null;
    }

    private static void setKi11(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setKi11(_value_);
    }

    private static String ki11ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).ki11ToString();
    }

    /**
     * Intermediate band first lead-lag blocks coefficient (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;I17&lt;/sub&gt;&lt;/i&gt;).  Typical value = 1.
     */
    private Double ki17; // PU

    public Double getKi17() {
        return ki17;
    }

    public void setKi17(Double _value_) {
        ki17 = _value_;
    }

    public void setKi17(String _value_) {
        ki17 = getDoubleFromString(_value_);
    }

    public String ki17ToString() {
        return ki17 != null ? ki17.toString() : null;
    }

    private static void setKi17(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setKi17(_value_);
    }

    private static String ki17ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).ki17ToString();
    }

    /**
     * Intermediate band differential filter gain (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;I2&lt;/sub&gt;&lt;/i&gt;).  Typical value = 66.
     */
    private Double ki2; // PU

    public Double getKi2() {
        return ki2;
    }

    public void setKi2(Double _value_) {
        ki2 = _value_;
    }

    public void setKi2(String _value_) {
        ki2 = getDoubleFromString(_value_);
    }

    public String ki2ToString() {
        return ki2 != null ? ki2.toString() : null;
    }

    private static void setKi2(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setKi2(_value_);
    }

    private static String ki2ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).ki2ToString();
    }

    /**
     * Low band gain (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;L&lt;/sub&gt;&lt;/i&gt;).  Typical value = 7.5.
     */
    private Double kl; // PU

    public Double getKl() {
        return kl;
    }

    public void setKl(Double _value_) {
        kl = _value_;
    }

    public void setKl(String _value_) {
        kl = getDoubleFromString(_value_);
    }

    public String klToString() {
        return kl != null ? kl.toString() : null;
    }

    private static void setKl(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setKl(_value_);
    }

    private static String klToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).klToString();
    }

    /**
     * Low band differential filter gain (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;L1&lt;/sub&gt;&lt;/i&gt;).  Typical value = 66.
     */
    private Double kl1; // PU

    public Double getKl1() {
        return kl1;
    }

    public void setKl1(Double _value_) {
        kl1 = _value_;
    }

    public void setKl1(String _value_) {
        kl1 = getDoubleFromString(_value_);
    }

    public String kl1ToString() {
        return kl1 != null ? kl1.toString() : null;
    }

    private static void setKl1(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setKl1(_value_);
    }

    private static String kl1ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).kl1ToString();
    }

    /**
     * Low band first lead-lag blocks coefficient (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;L11&lt;/sub&gt;&lt;/i&gt;).  Typical value = 1.
     */
    private Double kl11; // PU

    public Double getKl11() {
        return kl11;
    }

    public void setKl11(Double _value_) {
        kl11 = _value_;
    }

    public void setKl11(String _value_) {
        kl11 = getDoubleFromString(_value_);
    }

    public String kl11ToString() {
        return kl11 != null ? kl11.toString() : null;
    }

    private static void setKl11(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setKl11(_value_);
    }

    private static String kl11ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).kl11ToString();
    }

    /**
     * Low band first lead-lag blocks coefficient (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;L17&lt;/sub&gt;&lt;/i&gt;).  Typical value = 1.
     */
    private Double kl17; // PU

    public Double getKl17() {
        return kl17;
    }

    public void setKl17(Double _value_) {
        kl17 = _value_;
    }

    public void setKl17(String _value_) {
        kl17 = getDoubleFromString(_value_);
    }

    public String kl17ToString() {
        return kl17 != null ? kl17.toString() : null;
    }

    private static void setKl17(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setKl17(_value_);
    }

    private static String kl17ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).kl17ToString();
    }

    /**
     * Low band differential filter gain (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;L2&lt;/sub&gt;&lt;/i&gt;).  Typical value = 66.
     */
    private Double kl2; // PU

    public Double getKl2() {
        return kl2;
    }

    public void setKl2(Double _value_) {
        kl2 = _value_;
    }

    public void setKl2(String _value_) {
        kl2 = getDoubleFromString(_value_);
    }

    public String kl2ToString() {
        return kl2 != null ? kl2.toString() : null;
    }

    private static void setKl2(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setKl2(_value_);
    }

    private static String kl2ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).kl2ToString();
    }

    /**
     * Notch filter 1 (high-frequency band): filter frequency (&lt;i&gt;omega&lt;/i&gt;&lt;i&gt;&lt;sub&gt;ni&lt;/sub&gt;&lt;/i&gt;).
     */
    private Float omeganh1; // Float

    public Float getOmeganh1() {
        return omeganh1;
    }

    public void setOmeganh1(Float _value_) {
        omeganh1 = _value_;
    }

    public void setOmeganh1(String _value_) {
        omeganh1 = getFloatFromString(_value_);
    }

    public String omeganh1ToString() {
        return omeganh1 != null ? omeganh1.toString() : null;
    }

    private static void setOmeganh1(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setOmeganh1(_value_);
    }

    private static String omeganh1ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).omeganh1ToString();
    }

    /**
     * Notch filter 2 (high-frequency band): filter frequency (&lt;i&gt;omega&lt;/i&gt;&lt;i&gt;&lt;sub&gt;ni&lt;/sub&gt;&lt;/i&gt;).
     */
    private Float omeganh2; // Float

    public Float getOmeganh2() {
        return omeganh2;
    }

    public void setOmeganh2(Float _value_) {
        omeganh2 = _value_;
    }

    public void setOmeganh2(String _value_) {
        omeganh2 = getFloatFromString(_value_);
    }

    public String omeganh2ToString() {
        return omeganh2 != null ? omeganh2.toString() : null;
    }

    private static void setOmeganh2(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setOmeganh2(_value_);
    }

    private static String omeganh2ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).omeganh2ToString();
    }

    /**
     * Notch filter 1 (low-frequency band): filter frequency (&lt;i&gt;omega&lt;/i&gt;&lt;i&gt;&lt;sub&gt;ni&lt;/sub&gt;&lt;/i&gt;).
     */
    private Float omeganl1; // Float

    public Float getOmeganl1() {
        return omeganl1;
    }

    public void setOmeganl1(Float _value_) {
        omeganl1 = _value_;
    }

    public void setOmeganl1(String _value_) {
        omeganl1 = getFloatFromString(_value_);
    }

    public String omeganl1ToString() {
        return omeganl1 != null ? omeganl1.toString() : null;
    }

    private static void setOmeganl1(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setOmeganl1(_value_);
    }

    private static String omeganl1ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).omeganl1ToString();
    }

    /**
     * Notch filter 2 (low-frequency band): filter frequency (&lt;i&gt;omega&lt;/i&gt;&lt;i&gt;&lt;sub&gt;ni&lt;/sub&gt;&lt;/i&gt;).
     */
    private Float omeganl2; // Float

    public Float getOmeganl2() {
        return omeganl2;
    }

    public void setOmeganl2(Float _value_) {
        omeganl2 = _value_;
    }

    public void setOmeganl2(String _value_) {
        omeganl2 = getFloatFromString(_value_);
    }

    public String omeganl2ToString() {
        return omeganl2 != null ? omeganl2.toString() : null;
    }

    private static void setOmeganl2(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setOmeganl2(_value_);
    }

    private static String omeganl2ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).omeganl2ToString();
    }

    /**
     * High band time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;H1&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,01513.
     */
    private Double th1; // Seconds

    public Double getTh1() {
        return th1;
    }

    public void setTh1(Double _value_) {
        th1 = _value_;
    }

    public void setTh1(String _value_) {
        th1 = getDoubleFromString(_value_);
    }

    public String th1ToString() {
        return th1 != null ? th1.toString() : null;
    }

    private static void setTh1(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setTh1(_value_);
    }

    private static String th1ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).th1ToString();
    }

    /**
     * High band time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;H10&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
     */
    private Double th10; // Seconds

    public Double getTh10() {
        return th10;
    }

    public void setTh10(Double _value_) {
        th10 = _value_;
    }

    public void setTh10(String _value_) {
        th10 = getDoubleFromString(_value_);
    }

    public String th10ToString() {
        return th10 != null ? th10.toString() : null;
    }

    private static void setTh10(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setTh10(_value_);
    }

    private static String th10ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).th10ToString();
    }

    /**
     * High band time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;H11&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
     */
    private Double th11; // Seconds

    public Double getTh11() {
        return th11;
    }

    public void setTh11(Double _value_) {
        th11 = _value_;
    }

    public void setTh11(String _value_) {
        th11 = getDoubleFromString(_value_);
    }

    public String th11ToString() {
        return th11 != null ? th11.toString() : null;
    }

    private static void setTh11(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setTh11(_value_);
    }

    private static String th11ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).th11ToString();
    }

    /**
     * High band time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;H12&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
     */
    private Double th12; // Seconds

    public Double getTh12() {
        return th12;
    }

    public void setTh12(Double _value_) {
        th12 = _value_;
    }

    public void setTh12(String _value_) {
        th12 = getDoubleFromString(_value_);
    }

    public String th12ToString() {
        return th12 != null ? th12.toString() : null;
    }

    private static void setTh12(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setTh12(_value_);
    }

    private static String th12ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).th12ToString();
    }

    /**
     * High band time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;H2&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,01816.
     */
    private Double th2; // Seconds

    public Double getTh2() {
        return th2;
    }

    public void setTh2(Double _value_) {
        th2 = _value_;
    }

    public void setTh2(String _value_) {
        th2 = getDoubleFromString(_value_);
    }

    public String th2ToString() {
        return th2 != null ? th2.toString() : null;
    }

    private static void setTh2(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setTh2(_value_);
    }

    private static String th2ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).th2ToString();
    }

    /**
     * High band time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;H3&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
     */
    private Double th3; // Seconds

    public Double getTh3() {
        return th3;
    }

    public void setTh3(Double _value_) {
        th3 = _value_;
    }

    public void setTh3(String _value_) {
        th3 = getDoubleFromString(_value_);
    }

    public String th3ToString() {
        return th3 != null ? th3.toString() : null;
    }

    private static void setTh3(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setTh3(_value_);
    }

    private static String th3ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).th3ToString();
    }

    /**
     * High band time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;H4&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
     */
    private Double th4; // Seconds

    public Double getTh4() {
        return th4;
    }

    public void setTh4(Double _value_) {
        th4 = _value_;
    }

    public void setTh4(String _value_) {
        th4 = getDoubleFromString(_value_);
    }

    public String th4ToString() {
        return th4 != null ? th4.toString() : null;
    }

    private static void setTh4(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setTh4(_value_);
    }

    private static String th4ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).th4ToString();
    }

    /**
     * High band time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;H5&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
     */
    private Double th5; // Seconds

    public Double getTh5() {
        return th5;
    }

    public void setTh5(Double _value_) {
        th5 = _value_;
    }

    public void setTh5(String _value_) {
        th5 = getDoubleFromString(_value_);
    }

    public String th5ToString() {
        return th5 != null ? th5.toString() : null;
    }

    private static void setTh5(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setTh5(_value_);
    }

    private static String th5ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).th5ToString();
    }

    /**
     * High band time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;H6&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
     */
    private Double th6; // Seconds

    public Double getTh6() {
        return th6;
    }

    public void setTh6(Double _value_) {
        th6 = _value_;
    }

    public void setTh6(String _value_) {
        th6 = getDoubleFromString(_value_);
    }

    public String th6ToString() {
        return th6 != null ? th6.toString() : null;
    }

    private static void setTh6(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setTh6(_value_);
    }

    private static String th6ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).th6ToString();
    }

    /**
     * High band time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;H7&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,01816.
     */
    private Double th7; // Seconds

    public Double getTh7() {
        return th7;
    }

    public void setTh7(Double _value_) {
        th7 = _value_;
    }

    public void setTh7(String _value_) {
        th7 = getDoubleFromString(_value_);
    }

    public String th7ToString() {
        return th7 != null ? th7.toString() : null;
    }

    private static void setTh7(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setTh7(_value_);
    }

    private static String th7ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).th7ToString();
    }

    /**
     * High band time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;H8&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,02179.
     */
    private Double th8; // Seconds

    public Double getTh8() {
        return th8;
    }

    public void setTh8(Double _value_) {
        th8 = _value_;
    }

    public void setTh8(String _value_) {
        th8 = getDoubleFromString(_value_);
    }

    public String th8ToString() {
        return th8 != null ? th8.toString() : null;
    }

    private static void setTh8(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setTh8(_value_);
    }

    private static String th8ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).th8ToString();
    }

    /**
     * High band time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;H9&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
     */
    private Double th9; // Seconds

    public Double getTh9() {
        return th9;
    }

    public void setTh9(Double _value_) {
        th9 = _value_;
    }

    public void setTh9(String _value_) {
        th9 = getDoubleFromString(_value_);
    }

    public String th9ToString() {
        return th9 != null ? th9.toString() : null;
    }

    private static void setTh9(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setTh9(_value_);
    }

    private static String th9ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).th9ToString();
    }

    /**
     * Intermediate band time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;I1&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,173.
     */
    private Double ti1; // Seconds

    public Double getTi1() {
        return ti1;
    }

    public void setTi1(Double _value_) {
        ti1 = _value_;
    }

    public void setTi1(String _value_) {
        ti1 = getDoubleFromString(_value_);
    }

    public String ti1ToString() {
        return ti1 != null ? ti1.toString() : null;
    }

    private static void setTi1(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setTi1(_value_);
    }

    private static String ti1ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).ti1ToString();
    }

    /**
     * Intermediate band time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;I10&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
     */
    private Double ti10; // Seconds

    public Double getTi10() {
        return ti10;
    }

    public void setTi10(Double _value_) {
        ti10 = _value_;
    }

    public void setTi10(String _value_) {
        ti10 = getDoubleFromString(_value_);
    }

    public String ti10ToString() {
        return ti10 != null ? ti10.toString() : null;
    }

    private static void setTi10(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setTi10(_value_);
    }

    private static String ti10ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).ti10ToString();
    }

    /**
     * Intermediate band time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;I11&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
     */
    private Double ti11; // Seconds

    public Double getTi11() {
        return ti11;
    }

    public void setTi11(Double _value_) {
        ti11 = _value_;
    }

    public void setTi11(String _value_) {
        ti11 = getDoubleFromString(_value_);
    }

    public String ti11ToString() {
        return ti11 != null ? ti11.toString() : null;
    }

    private static void setTi11(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setTi11(_value_);
    }

    private static String ti11ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).ti11ToString();
    }

    /**
     * Intermediate band time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;I12&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
     */
    private Double ti12; // Seconds

    public Double getTi12() {
        return ti12;
    }

    public void setTi12(Double _value_) {
        ti12 = _value_;
    }

    public void setTi12(String _value_) {
        ti12 = getDoubleFromString(_value_);
    }

    public String ti12ToString() {
        return ti12 != null ? ti12.toString() : null;
    }

    private static void setTi12(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setTi12(_value_);
    }

    private static String ti12ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).ti12ToString();
    }

    /**
     * Intermediate band time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;I2&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,2075.
     */
    private Double ti2; // Seconds

    public Double getTi2() {
        return ti2;
    }

    public void setTi2(Double _value_) {
        ti2 = _value_;
    }

    public void setTi2(String _value_) {
        ti2 = getDoubleFromString(_value_);
    }

    public String ti2ToString() {
        return ti2 != null ? ti2.toString() : null;
    }

    private static void setTi2(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setTi2(_value_);
    }

    private static String ti2ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).ti2ToString();
    }

    /**
     * Intermediate band time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;I3&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
     */
    private Double ti3; // Seconds

    public Double getTi3() {
        return ti3;
    }

    public void setTi3(Double _value_) {
        ti3 = _value_;
    }

    public void setTi3(String _value_) {
        ti3 = getDoubleFromString(_value_);
    }

    public String ti3ToString() {
        return ti3 != null ? ti3.toString() : null;
    }

    private static void setTi3(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setTi3(_value_);
    }

    private static String ti3ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).ti3ToString();
    }

    /**
     * Intermediate band time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;I4&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
     */
    private Double ti4; // Seconds

    public Double getTi4() {
        return ti4;
    }

    public void setTi4(Double _value_) {
        ti4 = _value_;
    }

    public void setTi4(String _value_) {
        ti4 = getDoubleFromString(_value_);
    }

    public String ti4ToString() {
        return ti4 != null ? ti4.toString() : null;
    }

    private static void setTi4(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setTi4(_value_);
    }

    private static String ti4ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).ti4ToString();
    }

    /**
     * Intermediate band time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;I5&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
     */
    private Double ti5; // Seconds

    public Double getTi5() {
        return ti5;
    }

    public void setTi5(Double _value_) {
        ti5 = _value_;
    }

    public void setTi5(String _value_) {
        ti5 = getDoubleFromString(_value_);
    }

    public String ti5ToString() {
        return ti5 != null ? ti5.toString() : null;
    }

    private static void setTi5(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setTi5(_value_);
    }

    private static String ti5ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).ti5ToString();
    }

    /**
     * Intermediate band time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;I6&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
     */
    private Double ti6; // Seconds

    public Double getTi6() {
        return ti6;
    }

    public void setTi6(Double _value_) {
        ti6 = _value_;
    }

    public void setTi6(String _value_) {
        ti6 = getDoubleFromString(_value_);
    }

    public String ti6ToString() {
        return ti6 != null ? ti6.toString() : null;
    }

    private static void setTi6(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setTi6(_value_);
    }

    private static String ti6ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).ti6ToString();
    }

    /**
     * Intermediate band time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;I7&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,2075.
     */
    private Double ti7; // Seconds

    public Double getTi7() {
        return ti7;
    }

    public void setTi7(Double _value_) {
        ti7 = _value_;
    }

    public void setTi7(String _value_) {
        ti7 = getDoubleFromString(_value_);
    }

    public String ti7ToString() {
        return ti7 != null ? ti7.toString() : null;
    }

    private static void setTi7(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setTi7(_value_);
    }

    private static String ti7ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).ti7ToString();
    }

    /**
     * Intermediate band time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;I8&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0,2491.
     */
    private Double ti8; // Seconds

    public Double getTi8() {
        return ti8;
    }

    public void setTi8(Double _value_) {
        ti8 = _value_;
    }

    public void setTi8(String _value_) {
        ti8 = getDoubleFromString(_value_);
    }

    public String ti8ToString() {
        return ti8 != null ? ti8.toString() : null;
    }

    private static void setTi8(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setTi8(_value_);
    }

    private static String ti8ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).ti8ToString();
    }

    /**
     * Intermediate band time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;I9&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
     */
    private Double ti9; // Seconds

    public Double getTi9() {
        return ti9;
    }

    public void setTi9(Double _value_) {
        ti9 = _value_;
    }

    public void setTi9(String _value_) {
        ti9 = getDoubleFromString(_value_);
    }

    public String ti9ToString() {
        return ti9 != null ? ti9.toString() : null;
    }

    private static void setTi9(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setTi9(_value_);
    }

    private static String ti9ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).ti9ToString();
    }

    /**
     * Low band time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;L1&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 1,73.
     */
    private Double tl1; // Seconds

    public Double getTl1() {
        return tl1;
    }

    public void setTl1(Double _value_) {
        tl1 = _value_;
    }

    public void setTl1(String _value_) {
        tl1 = getDoubleFromString(_value_);
    }

    public String tl1ToString() {
        return tl1 != null ? tl1.toString() : null;
    }

    private static void setTl1(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setTl1(_value_);
    }

    private static String tl1ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).tl1ToString();
    }

    /**
     * Low band time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;L10&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
     */
    private Double tl10; // Seconds

    public Double getTl10() {
        return tl10;
    }

    public void setTl10(Double _value_) {
        tl10 = _value_;
    }

    public void setTl10(String _value_) {
        tl10 = getDoubleFromString(_value_);
    }

    public String tl10ToString() {
        return tl10 != null ? tl10.toString() : null;
    }

    private static void setTl10(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setTl10(_value_);
    }

    private static String tl10ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).tl10ToString();
    }

    /**
     * Low band time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;L11&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
     */
    private Double tl11; // Seconds

    public Double getTl11() {
        return tl11;
    }

    public void setTl11(Double _value_) {
        tl11 = _value_;
    }

    public void setTl11(String _value_) {
        tl11 = getDoubleFromString(_value_);
    }

    public String tl11ToString() {
        return tl11 != null ? tl11.toString() : null;
    }

    private static void setTl11(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setTl11(_value_);
    }

    private static String tl11ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).tl11ToString();
    }

    /**
     * Low band time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;L12&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
     */
    private Double tl12; // Seconds

    public Double getTl12() {
        return tl12;
    }

    public void setTl12(Double _value_) {
        tl12 = _value_;
    }

    public void setTl12(String _value_) {
        tl12 = getDoubleFromString(_value_);
    }

    public String tl12ToString() {
        return tl12 != null ? tl12.toString() : null;
    }

    private static void setTl12(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setTl12(_value_);
    }

    private static String tl12ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).tl12ToString();
    }

    /**
     * Low band time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;L2&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 2,075.
     */
    private Double tl2; // Seconds

    public Double getTl2() {
        return tl2;
    }

    public void setTl2(Double _value_) {
        tl2 = _value_;
    }

    public void setTl2(String _value_) {
        tl2 = getDoubleFromString(_value_);
    }

    public String tl2ToString() {
        return tl2 != null ? tl2.toString() : null;
    }

    private static void setTl2(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setTl2(_value_);
    }

    private static String tl2ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).tl2ToString();
    }

    /**
     * Low band time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;L3&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
     */
    private Double tl3; // Seconds

    public Double getTl3() {
        return tl3;
    }

    public void setTl3(Double _value_) {
        tl3 = _value_;
    }

    public void setTl3(String _value_) {
        tl3 = getDoubleFromString(_value_);
    }

    public String tl3ToString() {
        return tl3 != null ? tl3.toString() : null;
    }

    private static void setTl3(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setTl3(_value_);
    }

    private static String tl3ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).tl3ToString();
    }

    /**
     * Low band time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;L4&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
     */
    private Double tl4; // Seconds

    public Double getTl4() {
        return tl4;
    }

    public void setTl4(Double _value_) {
        tl4 = _value_;
    }

    public void setTl4(String _value_) {
        tl4 = getDoubleFromString(_value_);
    }

    public String tl4ToString() {
        return tl4 != null ? tl4.toString() : null;
    }

    private static void setTl4(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setTl4(_value_);
    }

    private static String tl4ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).tl4ToString();
    }

    /**
     * Low band time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;L5&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
     */
    private Double tl5; // Seconds

    public Double getTl5() {
        return tl5;
    }

    public void setTl5(Double _value_) {
        tl5 = _value_;
    }

    public void setTl5(String _value_) {
        tl5 = getDoubleFromString(_value_);
    }

    public String tl5ToString() {
        return tl5 != null ? tl5.toString() : null;
    }

    private static void setTl5(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setTl5(_value_);
    }

    private static String tl5ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).tl5ToString();
    }

    /**
     * Low band time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;L6&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
     */
    private Double tl6; // Seconds

    public Double getTl6() {
        return tl6;
    }

    public void setTl6(Double _value_) {
        tl6 = _value_;
    }

    public void setTl6(String _value_) {
        tl6 = getDoubleFromString(_value_);
    }

    public String tl6ToString() {
        return tl6 != null ? tl6.toString() : null;
    }

    private static void setTl6(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setTl6(_value_);
    }

    private static String tl6ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).tl6ToString();
    }

    /**
     * Low band time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;L7&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 2,075.
     */
    private Double tl7; // Seconds

    public Double getTl7() {
        return tl7;
    }

    public void setTl7(Double _value_) {
        tl7 = _value_;
    }

    public void setTl7(String _value_) {
        tl7 = getDoubleFromString(_value_);
    }

    public String tl7ToString() {
        return tl7 != null ? tl7.toString() : null;
    }

    private static void setTl7(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setTl7(_value_);
    }

    private static String tl7ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).tl7ToString();
    }

    /**
     * Low band time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;L8&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 2,491.
     */
    private Double tl8; // Seconds

    public Double getTl8() {
        return tl8;
    }

    public void setTl8(Double _value_) {
        tl8 = _value_;
    }

    public void setTl8(String _value_) {
        tl8 = getDoubleFromString(_value_);
    }

    public String tl8ToString() {
        return tl8 != null ? tl8.toString() : null;
    }

    private static void setTl8(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setTl8(_value_);
    }

    private static String tl8ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).tl8ToString();
    }

    /**
     * Low band time constant (&lt;i&gt;T&lt;/i&gt;&lt;i&gt;&lt;sub&gt;L9&lt;/sub&gt;&lt;/i&gt;) (&amp;gt;= 0).  Typical value = 0.
     */
    private Double tl9; // Seconds

    public Double getTl9() {
        return tl9;
    }

    public void setTl9(Double _value_) {
        tl9 = _value_;
    }

    public void setTl9(String _value_) {
        tl9 = getDoubleFromString(_value_);
    }

    public String tl9ToString() {
        return tl9 != null ? tl9.toString() : null;
    }

    private static void setTl9(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setTl9(_value_);
    }

    private static String tl9ToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).tl9ToString();
    }

    /**
     * High band output maximum limit (&lt;i&gt;V&lt;/i&gt;&lt;i&gt;&lt;sub&gt;Hmax&lt;/sub&gt;&lt;/i&gt;) (&amp;gt; PssIEEE4B.vhmin).  Typical value = 0,6.
     */
    private Double vhmax; // PU

    public Double getVhmax() {
        return vhmax;
    }

    public void setVhmax(Double _value_) {
        vhmax = _value_;
    }

    public void setVhmax(String _value_) {
        vhmax = getDoubleFromString(_value_);
    }

    public String vhmaxToString() {
        return vhmax != null ? vhmax.toString() : null;
    }

    private static void setVhmax(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setVhmax(_value_);
    }

    private static String vhmaxToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).vhmaxToString();
    }

    /**
     * High band output minimum limit (&lt;i&gt;V&lt;/i&gt;&lt;i&gt;&lt;sub&gt;Hmin&lt;/sub&gt;&lt;/i&gt;) (&amp;lt; PssIEEE4V.vhmax).  Typical value = -0,6.
     */
    private Double vhmin; // PU

    public Double getVhmin() {
        return vhmin;
    }

    public void setVhmin(Double _value_) {
        vhmin = _value_;
    }

    public void setVhmin(String _value_) {
        vhmin = getDoubleFromString(_value_);
    }

    public String vhminToString() {
        return vhmin != null ? vhmin.toString() : null;
    }

    private static void setVhmin(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setVhmin(_value_);
    }

    private static String vhminToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).vhminToString();
    }

    /**
     * Intermediate band output maximum limit (&lt;i&gt;V&lt;/i&gt;&lt;i&gt;&lt;sub&gt;Imax&lt;/sub&gt;&lt;/i&gt;) (&amp;gt; PssIEEE4B.vimin).  Typical value = 0,6.
     */
    private Double vimax; // PU

    public Double getVimax() {
        return vimax;
    }

    public void setVimax(Double _value_) {
        vimax = _value_;
    }

    public void setVimax(String _value_) {
        vimax = getDoubleFromString(_value_);
    }

    public String vimaxToString() {
        return vimax != null ? vimax.toString() : null;
    }

    private static void setVimax(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setVimax(_value_);
    }

    private static String vimaxToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).vimaxToString();
    }

    /**
     * Intermediate band output minimum limit (&lt;i&gt;V&lt;/i&gt;&lt;i&gt;&lt;sub&gt;Imin&lt;/sub&gt;&lt;/i&gt;) (&amp;lt; PssIEEE4B.vimax).  Typical value = -0,6.
     */
    private Double vimin; // PU

    public Double getVimin() {
        return vimin;
    }

    public void setVimin(Double _value_) {
        vimin = _value_;
    }

    public void setVimin(String _value_) {
        vimin = getDoubleFromString(_value_);
    }

    public String viminToString() {
        return vimin != null ? vimin.toString() : null;
    }

    private static void setVimin(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setVimin(_value_);
    }

    private static String viminToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).viminToString();
    }

    /**
     * Low band output maximum limit (&lt;i&gt;V&lt;/i&gt;&lt;i&gt;&lt;sub&gt;Lmax&lt;/sub&gt;&lt;/i&gt;) (&amp;gt; PssIEEE4B.vlmin).  Typical value = 0,075.
     */
    private Double vlmax; // PU

    public Double getVlmax() {
        return vlmax;
    }

    public void setVlmax(Double _value_) {
        vlmax = _value_;
    }

    public void setVlmax(String _value_) {
        vlmax = getDoubleFromString(_value_);
    }

    public String vlmaxToString() {
        return vlmax != null ? vlmax.toString() : null;
    }

    private static void setVlmax(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setVlmax(_value_);
    }

    private static String vlmaxToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).vlmaxToString();
    }

    /**
     * Low band output minimum limit (&lt;i&gt;V&lt;/i&gt;&lt;i&gt;&lt;sub&gt;Lmin&lt;/sub&gt;&lt;/i&gt;) (&amp;lt; PssIEEE4B.vlmax).  Typical value = -0,075.
     */
    private Double vlmin; // PU

    public Double getVlmin() {
        return vlmin;
    }

    public void setVlmin(Double _value_) {
        vlmin = _value_;
    }

    public void setVlmin(String _value_) {
        vlmin = getDoubleFromString(_value_);
    }

    public String vlminToString() {
        return vlmin != null ? vlmin.toString() : null;
    }

    private static void setVlmin(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setVlmin(_value_);
    }

    private static String vlminToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).vlminToString();
    }

    /**
     * PSS output maximum limit (&lt;i&gt;V&lt;/i&gt;&lt;i&gt;&lt;sub&gt;STmax&lt;/sub&gt;&lt;/i&gt;) (&amp;gt; PssIEEE4B.vstmin).  Typical value = 0,15.
     */
    private Double vstmax; // PU

    public Double getVstmax() {
        return vstmax;
    }

    public void setVstmax(Double _value_) {
        vstmax = _value_;
    }

    public void setVstmax(String _value_) {
        vstmax = getDoubleFromString(_value_);
    }

    public String vstmaxToString() {
        return vstmax != null ? vstmax.toString() : null;
    }

    private static void setVstmax(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setVstmax(_value_);
    }

    private static String vstmaxToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).vstmaxToString();
    }

    /**
     * PSS output minimum limit (&lt;i&gt;V&lt;/i&gt;&lt;i&gt;&lt;sub&gt;STmin&lt;/sub&gt;&lt;/i&gt;) (&amp;lt; PssIEEE4B.vstmax).  Typical value = -0,15.
     */
    private Double vstmin; // PU

    public Double getVstmin() {
        return vstmin;
    }

    public void setVstmin(Double _value_) {
        vstmin = _value_;
    }

    public void setVstmin(String _value_) {
        vstmin = getDoubleFromString(_value_);
    }

    public String vstminToString() {
        return vstmin != null ? vstmin.toString() : null;
    }

    private static void setVstmin(BaseClass _this_, String _value_) {
        ((PssIEEE4B) _this_).setVstmin(_value_);
    }

    private static String vstminToString(BaseClass _this_) {
        return ((PssIEEE4B) _this_).vstminToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "PssIEEE4B", attrName));
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
                "PssIEEE4B", attrName, objectValue));
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
                "PssIEEE4B", attrName, stringValue));
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
            map.put("bwh1", new AttrDetails("PssIEEE4B.bwh1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::bwh1ToString, null, PssIEEE4B::setBwh1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("bwh2", new AttrDetails("PssIEEE4B.bwh2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::bwh2ToString, null, PssIEEE4B::setBwh2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("bwl1", new AttrDetails("PssIEEE4B.bwl1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::bwl1ToString, null, PssIEEE4B::setBwl1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("bwl2", new AttrDetails("PssIEEE4B.bwl2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::bwl2ToString, null, PssIEEE4B::setBwl2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kh", new AttrDetails("PssIEEE4B.kh", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::khToString, null, PssIEEE4B::setKh));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kh1", new AttrDetails("PssIEEE4B.kh1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::kh1ToString, null, PssIEEE4B::setKh1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kh11", new AttrDetails("PssIEEE4B.kh11", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::kh11ToString, null, PssIEEE4B::setKh11));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kh17", new AttrDetails("PssIEEE4B.kh17", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::kh17ToString, null, PssIEEE4B::setKh17));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kh2", new AttrDetails("PssIEEE4B.kh2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::kh2ToString, null, PssIEEE4B::setKh2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ki", new AttrDetails("PssIEEE4B.ki", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::kiToString, null, PssIEEE4B::setKi));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ki1", new AttrDetails("PssIEEE4B.ki1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::ki1ToString, null, PssIEEE4B::setKi1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ki11", new AttrDetails("PssIEEE4B.ki11", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::ki11ToString, null, PssIEEE4B::setKi11));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ki17", new AttrDetails("PssIEEE4B.ki17", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::ki17ToString, null, PssIEEE4B::setKi17));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ki2", new AttrDetails("PssIEEE4B.ki2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::ki2ToString, null, PssIEEE4B::setKi2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kl", new AttrDetails("PssIEEE4B.kl", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::klToString, null, PssIEEE4B::setKl));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kl1", new AttrDetails("PssIEEE4B.kl1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::kl1ToString, null, PssIEEE4B::setKl1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kl11", new AttrDetails("PssIEEE4B.kl11", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::kl11ToString, null, PssIEEE4B::setKl11));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kl17", new AttrDetails("PssIEEE4B.kl17", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::kl17ToString, null, PssIEEE4B::setKl17));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kl2", new AttrDetails("PssIEEE4B.kl2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::kl2ToString, null, PssIEEE4B::setKl2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("omeganh1", new AttrDetails("PssIEEE4B.omeganh1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::omeganh1ToString, null, PssIEEE4B::setOmeganh1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("omeganh2", new AttrDetails("PssIEEE4B.omeganh2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::omeganh2ToString, null, PssIEEE4B::setOmeganh2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("omeganl1", new AttrDetails("PssIEEE4B.omeganl1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::omeganl1ToString, null, PssIEEE4B::setOmeganl1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("omeganl2", new AttrDetails("PssIEEE4B.omeganl2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::omeganl2ToString, null, PssIEEE4B::setOmeganl2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("th1", new AttrDetails("PssIEEE4B.th1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::th1ToString, null, PssIEEE4B::setTh1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("th10", new AttrDetails("PssIEEE4B.th10", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::th10ToString, null, PssIEEE4B::setTh10));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("th11", new AttrDetails("PssIEEE4B.th11", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::th11ToString, null, PssIEEE4B::setTh11));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("th12", new AttrDetails("PssIEEE4B.th12", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::th12ToString, null, PssIEEE4B::setTh12));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("th2", new AttrDetails("PssIEEE4B.th2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::th2ToString, null, PssIEEE4B::setTh2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("th3", new AttrDetails("PssIEEE4B.th3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::th3ToString, null, PssIEEE4B::setTh3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("th4", new AttrDetails("PssIEEE4B.th4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::th4ToString, null, PssIEEE4B::setTh4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("th5", new AttrDetails("PssIEEE4B.th5", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::th5ToString, null, PssIEEE4B::setTh5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("th6", new AttrDetails("PssIEEE4B.th6", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::th6ToString, null, PssIEEE4B::setTh6));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("th7", new AttrDetails("PssIEEE4B.th7", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::th7ToString, null, PssIEEE4B::setTh7));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("th8", new AttrDetails("PssIEEE4B.th8", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::th8ToString, null, PssIEEE4B::setTh8));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("th9", new AttrDetails("PssIEEE4B.th9", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::th9ToString, null, PssIEEE4B::setTh9));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti1", new AttrDetails("PssIEEE4B.ti1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::ti1ToString, null, PssIEEE4B::setTi1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti10", new AttrDetails("PssIEEE4B.ti10", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::ti10ToString, null, PssIEEE4B::setTi10));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti11", new AttrDetails("PssIEEE4B.ti11", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::ti11ToString, null, PssIEEE4B::setTi11));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti12", new AttrDetails("PssIEEE4B.ti12", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::ti12ToString, null, PssIEEE4B::setTi12));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti2", new AttrDetails("PssIEEE4B.ti2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::ti2ToString, null, PssIEEE4B::setTi2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti3", new AttrDetails("PssIEEE4B.ti3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::ti3ToString, null, PssIEEE4B::setTi3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti4", new AttrDetails("PssIEEE4B.ti4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::ti4ToString, null, PssIEEE4B::setTi4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti5", new AttrDetails("PssIEEE4B.ti5", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::ti5ToString, null, PssIEEE4B::setTi5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti6", new AttrDetails("PssIEEE4B.ti6", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::ti6ToString, null, PssIEEE4B::setTi6));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti7", new AttrDetails("PssIEEE4B.ti7", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::ti7ToString, null, PssIEEE4B::setTi7));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti8", new AttrDetails("PssIEEE4B.ti8", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::ti8ToString, null, PssIEEE4B::setTi8));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ti9", new AttrDetails("PssIEEE4B.ti9", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::ti9ToString, null, PssIEEE4B::setTi9));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl1", new AttrDetails("PssIEEE4B.tl1", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::tl1ToString, null, PssIEEE4B::setTl1));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl10", new AttrDetails("PssIEEE4B.tl10", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::tl10ToString, null, PssIEEE4B::setTl10));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl11", new AttrDetails("PssIEEE4B.tl11", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::tl11ToString, null, PssIEEE4B::setTl11));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl12", new AttrDetails("PssIEEE4B.tl12", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::tl12ToString, null, PssIEEE4B::setTl12));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl2", new AttrDetails("PssIEEE4B.tl2", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::tl2ToString, null, PssIEEE4B::setTl2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl3", new AttrDetails("PssIEEE4B.tl3", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::tl3ToString, null, PssIEEE4B::setTl3));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl4", new AttrDetails("PssIEEE4B.tl4", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::tl4ToString, null, PssIEEE4B::setTl4));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl5", new AttrDetails("PssIEEE4B.tl5", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::tl5ToString, null, PssIEEE4B::setTl5));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl6", new AttrDetails("PssIEEE4B.tl6", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::tl6ToString, null, PssIEEE4B::setTl6));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl7", new AttrDetails("PssIEEE4B.tl7", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::tl7ToString, null, PssIEEE4B::setTl7));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl8", new AttrDetails("PssIEEE4B.tl8", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::tl8ToString, null, PssIEEE4B::setTl8));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tl9", new AttrDetails("PssIEEE4B.tl9", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::tl9ToString, null, PssIEEE4B::setTl9));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vhmax", new AttrDetails("PssIEEE4B.vhmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::vhmaxToString, null, PssIEEE4B::setVhmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vhmin", new AttrDetails("PssIEEE4B.vhmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::vhminToString, null, PssIEEE4B::setVhmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vimax", new AttrDetails("PssIEEE4B.vimax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::vimaxToString, null, PssIEEE4B::setVimax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vimin", new AttrDetails("PssIEEE4B.vimin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::viminToString, null, PssIEEE4B::setVimin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vlmax", new AttrDetails("PssIEEE4B.vlmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::vlmaxToString, null, PssIEEE4B::setVlmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vlmin", new AttrDetails("PssIEEE4B.vlmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::vlminToString, null, PssIEEE4B::setVlmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vstmax", new AttrDetails("PssIEEE4B.vstmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::vstmaxToString, null, PssIEEE4B::setVstmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vstmin", new AttrDetails("PssIEEE4B.vstmin", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PssIEEE4B::vstminToString, null, PssIEEE4B::setVstmin));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new PssIEEE4B().allAttrDetailsMap());
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
