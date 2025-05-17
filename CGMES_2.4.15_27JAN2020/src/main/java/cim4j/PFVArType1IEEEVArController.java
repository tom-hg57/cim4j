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
 * The class represents IEEE VAR Controller Type 1 which operates by moving the voltage reference directly.  Reference: IEEE Standard 421.5-2005 Section 11.3.
 */
@SuppressWarnings("unused")
public class PFVArType1IEEEVArController extends PFVArControllerType1Dynamics {

    private static final Logging LOG = Logging.getLogger(PFVArType1IEEEVArController.class);

    /**
     * Default constructor.
     */
    public PFVArType1IEEEVArController() {
        setCimType("PFVArType1IEEEVArController");
    }

    /**
     * Var controller time delay ().  Typical Value = 5.
     */
    private Double tvarc; // Seconds

    public Double getTvarc() {
        return tvarc;
    }

    public void setTvarc(Double _value_) {
        tvarc = _value_;
    }

    public void setTvarc(String _value_) {
        tvarc = getDoubleFromString(_value_);
    }

    public String tvarcToString() {
        return tvarc != null ? tvarc.toString() : null;
    }

    private static void setTvarc(BaseClass _this_, String _value_) {
        ((PFVArType1IEEEVArController) _this_).setTvarc(_value_);
    }

    private static String tvarcToString(BaseClass _this_) {
        return ((PFVArType1IEEEVArController) _this_).tvarcToString();
    }

    /**
     * Synchronous machine power factor ().
     */
    private Double vvar; // PU

    public Double getVvar() {
        return vvar;
    }

    public void setVvar(Double _value_) {
        vvar = _value_;
    }

    public void setVvar(String _value_) {
        vvar = getDoubleFromString(_value_);
    }

    public String vvarToString() {
        return vvar != null ? vvar.toString() : null;
    }

    private static void setVvar(BaseClass _this_, String _value_) {
        ((PFVArType1IEEEVArController) _this_).setVvar(_value_);
    }

    private static String vvarToString(BaseClass _this_) {
        return ((PFVArType1IEEEVArController) _this_).vvarToString();
    }

    /**
     * Var controller dead band ().  Typical Value = 0.02.
     */
    private Double vvarcbw; // Simple_Float

    public Double getVvarcbw() {
        return vvarcbw;
    }

    public void setVvarcbw(Double _value_) {
        vvarcbw = _value_;
    }

    public void setVvarcbw(String _value_) {
        vvarcbw = getDoubleFromString(_value_);
    }

    public String vvarcbwToString() {
        return vvarcbw != null ? vvarcbw.toString() : null;
    }

    private static void setVvarcbw(BaseClass _this_, String _value_) {
        ((PFVArType1IEEEVArController) _this_).setVvarcbw(_value_);
    }

    private static String vvarcbwToString(BaseClass _this_) {
        return ((PFVArType1IEEEVArController) _this_).vvarcbwToString();
    }

    /**
     * Var controller reference ().
     */
    private Double vvarref; // PU

    public Double getVvarref() {
        return vvarref;
    }

    public void setVvarref(Double _value_) {
        vvarref = _value_;
    }

    public void setVvarref(String _value_) {
        vvarref = getDoubleFromString(_value_);
    }

    public String vvarrefToString() {
        return vvarref != null ? vvarref.toString() : null;
    }

    private static void setVvarref(BaseClass _this_, String _value_) {
        ((PFVArType1IEEEVArController) _this_).setVvarref(_value_);
    }

    private static String vvarrefToString(BaseClass _this_) {
        return ((PFVArType1IEEEVArController) _this_).vvarrefToString();
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
        ((PFVArType1IEEEVArController) _this_).setVvtmax(_value_);
    }

    private static String vvtmaxToString(BaseClass _this_) {
        return ((PFVArType1IEEEVArController) _this_).vvtmaxToString();
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
        ((PFVArType1IEEEVArController) _this_).setVvtmin(_value_);
    }

    private static String vvtminToString(BaseClass _this_) {
        return ((PFVArType1IEEEVArController) _this_).vvtminToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "PFVArType1IEEEVArController", attrName));
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
                "PFVArType1IEEEVArController", attrName, objectValue));
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
                "PFVArType1IEEEVArController", attrName, stringValue));
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
            map.put("tvarc", new AttrDetails("PFVArType1IEEEVArController.tvarc", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PFVArType1IEEEVArController::tvarcToString, null, PFVArType1IEEEVArController::setTvarc));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vvar", new AttrDetails("PFVArType1IEEEVArController.vvar", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PFVArType1IEEEVArController::vvarToString, null, PFVArType1IEEEVArController::setVvar));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vvarcbw", new AttrDetails("PFVArType1IEEEVArController.vvarcbw", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PFVArType1IEEEVArController::vvarcbwToString, null, PFVArType1IEEEVArController::setVvarcbw));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vvarref", new AttrDetails("PFVArType1IEEEVArController.vvarref", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PFVArType1IEEEVArController::vvarrefToString, null, PFVArType1IEEEVArController::setVvarref));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vvtmax", new AttrDetails("PFVArType1IEEEVArController.vvtmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PFVArType1IEEEVArController::vvtmaxToString, null, PFVArType1IEEEVArController::setVvtmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("vvtmin", new AttrDetails("PFVArType1IEEEVArController.vvtmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, PFVArType1IEEEVArController::vvtminToString, null, PFVArType1IEEEVArController::setVvtmin));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new PFVArType1IEEEVArController().allAttrDetailsMap());
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
