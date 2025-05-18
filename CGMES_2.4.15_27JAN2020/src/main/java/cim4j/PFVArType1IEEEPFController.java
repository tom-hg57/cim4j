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
 * The class represents IEEE PF Controller Type 1 which operates by moving the voltage reference directly.  Reference: IEEE Standard 421.5-2005 Section 11.2.
 */
@SuppressWarnings("unused")
public class PFVArType1IEEEPFController extends PFVArControllerType1Dynamics {

    private static final Logging LOG = Logging.getLogger(PFVArType1IEEEPFController.class);

    /**
     * Constructor.
     */
    public PFVArType1IEEEPFController(String rdfid) {
        super("PFVArType1IEEEPFController", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected PFVArType1IEEEPFController(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Overexcitation Flag () true = overexcited false = underexcited.
     */
    private Boolean ovex; // Boolean

    public Boolean getOvex() {
        return ovex;
    }

    public void setOvex(Boolean _value_) {
        ovex = _value_;
    }

    public void setOvex(String _value_) {
        ovex = getBooleanFromString(_value_);
    }

    public String ovexToString() {
        return ovex != null ? ovex.toString() : null;
    }

    private static void setOvex(BaseClass _this_, String _value_) {
        ((PFVArType1IEEEPFController) _this_).setOvex(_value_);
    }

    private static String ovexToString(BaseClass _this_) {
        return ((PFVArType1IEEEPFController) _this_).ovexToString();
    }

    /**
     * PF controller time delay ().  Typical Value = 5.
     */
    private Double tpfc; // Seconds

    public Double getTpfc() {
        return tpfc;
    }

    public void setTpfc(Double _value_) {
        tpfc = _value_;
    }

    public void setTpfc(String _value_) {
        tpfc = getDoubleFromString(_value_);
    }

    public String tpfcToString() {
        return tpfc != null ? tpfc.toString() : null;
    }

    private static void setTpfc(BaseClass _this_, String _value_) {
        ((PFVArType1IEEEPFController) _this_).setTpfc(_value_);
    }

    private static String tpfcToString(BaseClass _this_) {
        return ((PFVArType1IEEEPFController) _this_).tpfcToString();
    }

    /**
     * Minimum machine terminal current needed to enable pf/var controller ().
     */
    private Double vitmin; // PU

    public Double getVitmin() {
        return vitmin;
    }

    public void setVitmin(Double _value_) {
        vitmin = _value_;
    }

    public void setVitmin(String _value_) {
        vitmin = getDoubleFromString(_value_);
    }

    public String vitminToString() {
        return vitmin != null ? vitmin.toString() : null;
    }

    private static void setVitmin(BaseClass _this_, String _value_) {
        ((PFVArType1IEEEPFController) _this_).setVitmin(_value_);
    }

    private static String vitminToString(BaseClass _this_) {
        return ((PFVArType1IEEEPFController) _this_).vitminToString();
    }

    /**
     * Synchronous machine power factor ().
     */
    private Double vpf; // PU

    public Double getVpf() {
        return vpf;
    }

    public void setVpf(Double _value_) {
        vpf = _value_;
    }

    public void setVpf(String _value_) {
        vpf = getDoubleFromString(_value_);
    }

    public String vpfToString() {
        return vpf != null ? vpf.toString() : null;
    }

    private static void setVpf(BaseClass _this_, String _value_) {
        ((PFVArType1IEEEPFController) _this_).setVpf(_value_);
    }

    private static String vpfToString(BaseClass _this_) {
        return ((PFVArType1IEEEPFController) _this_).vpfToString();
    }

    /**
     * PF controller dead band ().  Typical Value = 0.05.
     */
    private Double vpfcbw; // Simple_Float

    public Double getVpfcbw() {
        return vpfcbw;
    }

    public void setVpfcbw(Double _value_) {
        vpfcbw = _value_;
    }

    public void setVpfcbw(String _value_) {
        vpfcbw = getDoubleFromString(_value_);
    }

    public String vpfcbwToString() {
        return vpfcbw != null ? vpfcbw.toString() : null;
    }

    private static void setVpfcbw(BaseClass _this_, String _value_) {
        ((PFVArType1IEEEPFController) _this_).setVpfcbw(_value_);
    }

    private static String vpfcbwToString(BaseClass _this_) {
        return ((PFVArType1IEEEPFController) _this_).vpfcbwToString();
    }

    /**
     * PF controller reference ().
     */
    private Double vpfref; // PU

    public Double getVpfref() {
        return vpfref;
    }

    public void setVpfref(Double _value_) {
        vpfref = _value_;
    }

    public void setVpfref(String _value_) {
        vpfref = getDoubleFromString(_value_);
    }

    public String vpfrefToString() {
        return vpfref != null ? vpfref.toString() : null;
    }

    private static void setVpfref(BaseClass _this_, String _value_) {
        ((PFVArType1IEEEPFController) _this_).setVpfref(_value_);
    }

    private static String vpfrefToString(BaseClass _this_) {
        return ((PFVArType1IEEEPFController) _this_).vpfrefToString();
    }

    /**
     * Maximum machine terminal voltage needed for pf/var controller to be enabled ().
     */
    private Double vvtmax; // PU

    public Double getVvtmax() {
        return vvtmax;
    }

    public void setVvtmax(Double _value_) {
        vvtmax = _value_;
    }

    public void setVvtmax(String _value_) {
        vvtmax = getDoubleFromString(_value_);
    }

    public String vvtmaxToString() {
        return vvtmax != null ? vvtmax.toString() : null;
    }

    private static void setVvtmax(BaseClass _this_, String _value_) {
        ((PFVArType1IEEEPFController) _this_).setVvtmax(_value_);
    }

    private static String vvtmaxToString(BaseClass _this_) {
        return ((PFVArType1IEEEPFController) _this_).vvtmaxToString();
    }

    /**
     * Minimum machine terminal voltage needed to enable pf/var controller ().
     */
    private Double vvtmin; // PU

    public Double getVvtmin() {
        return vvtmin;
    }

    public void setVvtmin(Double _value_) {
        vvtmin = _value_;
    }

    public void setVvtmin(String _value_) {
        vvtmin = getDoubleFromString(_value_);
    }

    public String vvtminToString() {
        return vvtmin != null ? vvtmin.toString() : null;
    }

    private static void setVvtmin(BaseClass _this_, String _value_) {
        ((PFVArType1IEEEPFController) _this_).setVvtmin(_value_);
    }

    private static String vvtminToString(BaseClass _this_) {
        return ((PFVArType1IEEEPFController) _this_).vvtminToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "PFVArType1IEEEPFController", attrName));
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
                "PFVArType1IEEEPFController", attrName, objectValue));
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
                "PFVArType1IEEEPFController", attrName, stringValue));
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
            map.put("ovex", new AttrDetails("PFVArType1IEEEPFController.ovex", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PFVArType1IEEEPFController::ovexToString, null, PFVArType1IEEEPFController::setOvex));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tpfc", new AttrDetails("PFVArType1IEEEPFController.tpfc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PFVArType1IEEEPFController::tpfcToString, null, PFVArType1IEEEPFController::setTpfc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vitmin", new AttrDetails("PFVArType1IEEEPFController.vitmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PFVArType1IEEEPFController::vitminToString, null, PFVArType1IEEEPFController::setVitmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vpf", new AttrDetails("PFVArType1IEEEPFController.vpf", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PFVArType1IEEEPFController::vpfToString, null, PFVArType1IEEEPFController::setVpf));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vpfcbw", new AttrDetails("PFVArType1IEEEPFController.vpfcbw", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PFVArType1IEEEPFController::vpfcbwToString, null, PFVArType1IEEEPFController::setVpfcbw));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vpfref", new AttrDetails("PFVArType1IEEEPFController.vpfref", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PFVArType1IEEEPFController::vpfrefToString, null, PFVArType1IEEEPFController::setVpfref));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vvtmax", new AttrDetails("PFVArType1IEEEPFController.vvtmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PFVArType1IEEEPFController::vvtmaxToString, null, PFVArType1IEEEPFController::setVvtmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vvtmin", new AttrDetails("PFVArType1IEEEPFController.vvtmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PFVArType1IEEEPFController::vvtminToString, null, PFVArType1IEEEPFController::setVvtmin));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new PFVArType1IEEEPFController(null).allAttrDetailsMap());
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
