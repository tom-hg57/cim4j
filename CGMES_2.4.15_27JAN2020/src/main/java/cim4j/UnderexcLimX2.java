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

@SuppressWarnings("unused")
public class UnderexcLimX2 extends UnderexcitationLimiterDynamics {

    private static final Logging LOG = Logging.getLogger(UnderexcLimX2.class);

    /**
     * Default constructor.
     */
    public UnderexcLimX2() {
        setCimType("UnderexcLimX2");
    }

    /**
     * Differential gain (Kf2).
     */
    private Double kf2; // PU

    public Double getKf2() {
        return kf2;
    }

    public void setKf2(Double _value_) {
        kf2 = _value_;
    }

    public void setKf2(String _value_) {
        kf2 = getDoubleFromString(_value_);
    }

    public String kf2ToString() {
        return kf2 != null ? kf2.toString() : null;
    }

    private static void setKf2(BaseClass _this_, String _value_) {
        ((UnderexcLimX2) _this_).setKf2(_value_);
    }

    private static String kf2ToString(BaseClass _this_) {
        return ((UnderexcLimX2) _this_).kf2ToString();
    }

    /**
     * Minimum excitation limit gain (Km).
     */
    private Double km; // PU

    public Double getKm() {
        return km;
    }

    public void setKm(Double _value_) {
        km = _value_;
    }

    public void setKm(String _value_) {
        km = getDoubleFromString(_value_);
    }

    public String kmToString() {
        return km != null ? km.toString() : null;
    }

    private static void setKm(BaseClass _this_, String _value_) {
        ((UnderexcLimX2) _this_).setKm(_value_);
    }

    private static String kmToString(BaseClass _this_) {
        return ((UnderexcLimX2) _this_).kmToString();
    }

    /**
     * Minimum excitation limit value (MELMAX).
     */
    private Double melmax; // PU

    public Double getMelmax() {
        return melmax;
    }

    public void setMelmax(Double _value_) {
        melmax = _value_;
    }

    public void setMelmax(String _value_) {
        melmax = getDoubleFromString(_value_);
    }

    public String melmaxToString() {
        return melmax != null ? melmax.toString() : null;
    }

    private static void setMelmax(BaseClass _this_, String _value_) {
        ((UnderexcLimX2) _this_).setMelmax(_value_);
    }

    private static String melmaxToString(BaseClass _this_) {
        return ((UnderexcLimX2) _this_).melmaxToString();
    }

    /**
     * Excitation center setting (Qo).
     */
    private Double qo; // PU

    public Double getQo() {
        return qo;
    }

    public void setQo(Double _value_) {
        qo = _value_;
    }

    public void setQo(String _value_) {
        qo = getDoubleFromString(_value_);
    }

    public String qoToString() {
        return qo != null ? qo.toString() : null;
    }

    private static void setQo(BaseClass _this_, String _value_) {
        ((UnderexcLimX2) _this_).setQo(_value_);
    }

    private static String qoToString(BaseClass _this_) {
        return ((UnderexcLimX2) _this_).qoToString();
    }

    /**
     * Excitation radius (R).
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
        ((UnderexcLimX2) _this_).setR(_value_);
    }

    private static String rToString(BaseClass _this_) {
        return ((UnderexcLimX2) _this_).rToString();
    }

    /**
     * Differential time constant (Tf2) (&gt;0).
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
        ((UnderexcLimX2) _this_).setTf2(_value_);
    }

    private static String tf2ToString(BaseClass _this_) {
        return ((UnderexcLimX2) _this_).tf2ToString();
    }

    /**
     * Minimum excitation limit time constant (Tm).
     */
    private Double tm; // Seconds

    public Double getTm() {
        return tm;
    }

    public void setTm(Double _value_) {
        tm = _value_;
    }

    public void setTm(String _value_) {
        tm = getDoubleFromString(_value_);
    }

    public String tmToString() {
        return tm != null ? tm.toString() : null;
    }

    private static void setTm(BaseClass _this_, String _value_) {
        ((UnderexcLimX2) _this_).setTm(_value_);
    }

    private static String tmToString(BaseClass _this_) {
        return ((UnderexcLimX2) _this_).tmToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "UnderexcLimX2", attrName));
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
                "UnderexcLimX2", attrName, objectValue));
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
                "UnderexcLimX2", attrName, stringValue));
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
            map.put("kf2", new AttrDetails("UnderexcLimX2.kf2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLimX2::kf2ToString, null, UnderexcLimX2::setKf2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("km", new AttrDetails("UnderexcLimX2.km", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLimX2::kmToString, null, UnderexcLimX2::setKm));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("melmax", new AttrDetails("UnderexcLimX2.melmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLimX2::melmaxToString, null, UnderexcLimX2::setMelmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("qo", new AttrDetails("UnderexcLimX2.qo", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLimX2::qoToString, null, UnderexcLimX2::setQo));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("r", new AttrDetails("UnderexcLimX2.r", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLimX2::rToString, null, UnderexcLimX2::setR));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tf2", new AttrDetails("UnderexcLimX2.tf2", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLimX2::tf2ToString, null, UnderexcLimX2::setTf2));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tm", new AttrDetails("UnderexcLimX2.tm", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, UnderexcLimX2::tmToString, null, UnderexcLimX2::setTm));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new UnderexcLimX2().allAttrDetailsMap());
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
