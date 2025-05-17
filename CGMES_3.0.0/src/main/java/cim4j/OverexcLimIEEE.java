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
 * The over excitation limiter model is intended to represent the significant features of OELs necessary for some large-scale system studies. It is the result of a pragmatic approach to obtain a model that can be widely applied with attainable data from generator owners. An attempt to include all variations in the functionality of OELs and duplicate how they interact with the rest of the excitation systems would likely result in a level of application insufficient for the studies for which they are intended. Reference: IEEE OEL 421.5-2005, 9.
 */
@SuppressWarnings("unused")
public class OverexcLimIEEE extends OverexcitationLimiterDynamics {

    private static final Logging LOG = Logging.getLogger(OverexcLimIEEE.class);

    /**
     * Default constructor.
     */
    public OverexcLimIEEE() {
        setCimType("OverexcLimIEEE");
    }

    /**
     * OEL pickup/drop-out hysteresis (&lt;i&gt;HYST&lt;/i&gt;).  Typical value = 0,03.
     */
    private Double hyst; // PU

    public Double getHyst() {
        return hyst;
    }

    public void setHyst(Double _value_) {
        hyst = _value_;
    }

    public void setHyst(String _value_) {
        hyst = getDoubleFromString(_value_);
    }

    public String hystToString() {
        return hyst != null ? hyst.toString() : null;
    }

    private static void setHyst(BaseClass _this_, String _value_) {
        ((OverexcLimIEEE) _this_).setHyst(_value_);
    }

    private static String hystToString(BaseClass _this_) {
        return ((OverexcLimIEEE) _this_).hystToString();
    }

    /**
     * OEL timed field current limit (&lt;i&gt;I&lt;/i&gt;&lt;i&gt;&lt;sub&gt;FDLIM&lt;/sub&gt;&lt;/i&gt;).  Typical value = 1,05.
     */
    private Double ifdlim; // PU

    public Double getIfdlim() {
        return ifdlim;
    }

    public void setIfdlim(Double _value_) {
        ifdlim = _value_;
    }

    public void setIfdlim(String _value_) {
        ifdlim = getDoubleFromString(_value_);
    }

    public String ifdlimToString() {
        return ifdlim != null ? ifdlim.toString() : null;
    }

    private static void setIfdlim(BaseClass _this_, String _value_) {
        ((OverexcLimIEEE) _this_).setIfdlim(_value_);
    }

    private static String ifdlimToString(BaseClass _this_) {
        return ((OverexcLimIEEE) _this_).ifdlimToString();
    }

    /**
     * OEL instantaneous field current limit (&lt;i&gt;I&lt;/i&gt;&lt;i&gt;&lt;sub&gt;FDMAX&lt;/sub&gt;&lt;/i&gt;).  Typical value = 1,5.
     */
    private Double ifdmax; // PU

    public Double getIfdmax() {
        return ifdmax;
    }

    public void setIfdmax(Double _value_) {
        ifdmax = _value_;
    }

    public void setIfdmax(String _value_) {
        ifdmax = getDoubleFromString(_value_);
    }

    public String ifdmaxToString() {
        return ifdmax != null ? ifdmax.toString() : null;
    }

    private static void setIfdmax(BaseClass _this_, String _value_) {
        ((OverexcLimIEEE) _this_).setIfdmax(_value_);
    }

    private static String ifdmaxToString(BaseClass _this_) {
        return ((OverexcLimIEEE) _this_).ifdmaxToString();
    }

    /**
     * OEL timed field current limiter pickup level (&lt;i&gt;I&lt;/i&gt;&lt;i&gt;&lt;sub&gt;TFPU&lt;/sub&gt;&lt;/i&gt;).  Typical value = 1,05.
     */
    private Double itfpu; // PU

    public Double getItfpu() {
        return itfpu;
    }

    public void setItfpu(Double _value_) {
        itfpu = _value_;
    }

    public void setItfpu(String _value_) {
        itfpu = getDoubleFromString(_value_);
    }

    public String itfpuToString() {
        return itfpu != null ? itfpu.toString() : null;
    }

    private static void setItfpu(BaseClass _this_, String _value_) {
        ((OverexcLimIEEE) _this_).setItfpu(_value_);
    }

    private static String itfpuToString(BaseClass _this_) {
        return ((OverexcLimIEEE) _this_).itfpuToString();
    }

    /**
     * OEL cooldown gain (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;CD&lt;/sub&gt;&lt;/i&gt;).  Typical value = 1.
     */
    private Double kcd; // PU

    public Double getKcd() {
        return kcd;
    }

    public void setKcd(Double _value_) {
        kcd = _value_;
    }

    public void setKcd(String _value_) {
        kcd = getDoubleFromString(_value_);
    }

    public String kcdToString() {
        return kcd != null ? kcd.toString() : null;
    }

    private static void setKcd(BaseClass _this_, String _value_) {
        ((OverexcLimIEEE) _this_).setKcd(_value_);
    }

    private static String kcdToString(BaseClass _this_) {
        return ((OverexcLimIEEE) _this_).kcdToString();
    }

    /**
     * OEL ramped limit rate (&lt;i&gt;K&lt;/i&gt;&lt;i&gt;&lt;sub&gt;RAMP&lt;/sub&gt;&lt;/i&gt;).  Unit = PU / s.  Typical value = 10.
     */
    private Float kramp; // Float

    public Float getKramp() {
        return kramp;
    }

    public void setKramp(Float _value_) {
        kramp = _value_;
    }

    public void setKramp(String _value_) {
        kramp = getFloatFromString(_value_);
    }

    public String krampToString() {
        return kramp != null ? kramp.toString() : null;
    }

    private static void setKramp(BaseClass _this_, String _value_) {
        ((OverexcLimIEEE) _this_).setKramp(_value_);
    }

    private static String krampToString(BaseClass _this_) {
        return ((OverexcLimIEEE) _this_).krampToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "OverexcLimIEEE", attrName));
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
                "OverexcLimIEEE", attrName, objectValue));
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
                "OverexcLimIEEE", attrName, stringValue));
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
            map.put("hyst", new AttrDetails("OverexcLimIEEE.hyst", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, OverexcLimIEEE::hystToString, null, OverexcLimIEEE::setHyst));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ifdlim", new AttrDetails("OverexcLimIEEE.ifdlim", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, OverexcLimIEEE::ifdlimToString, null, OverexcLimIEEE::setIfdlim));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ifdmax", new AttrDetails("OverexcLimIEEE.ifdmax", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, OverexcLimIEEE::ifdmaxToString, null, OverexcLimIEEE::setIfdmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("itfpu", new AttrDetails("OverexcLimIEEE.itfpu", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, OverexcLimIEEE::itfpuToString, null, OverexcLimIEEE::setItfpu));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kcd", new AttrDetails("OverexcLimIEEE.kcd", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, OverexcLimIEEE::kcdToString, null, OverexcLimIEEE::setKcd));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kramp", new AttrDetails("OverexcLimIEEE.kramp", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, OverexcLimIEEE::krampToString, null, OverexcLimIEEE::setKramp));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new OverexcLimIEEE().allAttrDetailsMap());
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
