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
 * A conducting connection point of a power transformer. It corresponds to a physical transformer winding terminal.  In earlier CIM versions, the TransformerWinding class served a similar purpose, but this class is more flexible because it associates to terminal but is not a specialization of ConductingEquipment.
 */
@SuppressWarnings("unused")
public class TransformerEnd extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(TransformerEnd.class);

    /**
     * Constructor.
     */
    public TransformerEnd(String rdfid) {
        super("TransformerEnd", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected TransformerEnd(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * Base voltage of the transformer end.  This is essential for PU calculation.
     */
    private BaseVoltage BaseVoltage; // ManyToOne

    public BaseVoltage getBaseVoltage() {
        return BaseVoltage;
    }

    public void setBaseVoltage(BaseClass _object_) {
        if (!(_object_ instanceof BaseVoltage)) {
            throw new IllegalArgumentException("Object is not BaseVoltage");
        }
        if (BaseVoltage != _object_) {
            BaseVoltage = (BaseVoltage) _object_;
            BaseVoltage.setTransformerEnds(this);
        }
    }

    public String BaseVoltageToString() {
        return BaseVoltage != null ? BaseVoltage.getRdfid() : null;
    }

    private static void setBaseVoltage(BaseClass _this_, BaseClass _object_) {
        ((TransformerEnd) _this_).setBaseVoltage(_object_);
    }

    private static String BaseVoltageToString(BaseClass _this_) {
        return ((TransformerEnd) _this_).BaseVoltageToString();
    }

    /**
     * Phase tap changer associated with this transformer end.
     *
     * NOT USED
     */
    private PhaseTapChanger PhaseTapChanger; // OneToOne

    public PhaseTapChanger getPhaseTapChanger() {
        return PhaseTapChanger;
    }

    public void setPhaseTapChanger(BaseClass _object_) {
        if (!(_object_ instanceof PhaseTapChanger)) {
            throw new IllegalArgumentException("Object is not PhaseTapChanger");
        }
        if (PhaseTapChanger != _object_) {
            PhaseTapChanger = (PhaseTapChanger) _object_;
            PhaseTapChanger.setTransformerEnd(this);
        }
    }

    public String PhaseTapChangerToString() {
        return PhaseTapChanger != null ? PhaseTapChanger.getRdfid() : null;
    }

    private static void setPhaseTapChanger(BaseClass _this_, BaseClass _object_) {
        ((TransformerEnd) _this_).setPhaseTapChanger(_object_);
    }

    private static String PhaseTapChangerToString(BaseClass _this_) {
        return ((TransformerEnd) _this_).PhaseTapChangerToString();
    }

    /**
     * Ratio tap changer associated with this transformer end.
     *
     * NOT USED
     */
    private RatioTapChanger RatioTapChanger; // OneToOne

    public RatioTapChanger getRatioTapChanger() {
        return RatioTapChanger;
    }

    public void setRatioTapChanger(BaseClass _object_) {
        if (!(_object_ instanceof RatioTapChanger)) {
            throw new IllegalArgumentException("Object is not RatioTapChanger");
        }
        if (RatioTapChanger != _object_) {
            RatioTapChanger = (RatioTapChanger) _object_;
            RatioTapChanger.setTransformerEnd(this);
        }
    }

    public String RatioTapChangerToString() {
        return RatioTapChanger != null ? RatioTapChanger.getRdfid() : null;
    }

    private static void setRatioTapChanger(BaseClass _this_, BaseClass _object_) {
        ((TransformerEnd) _this_).setRatioTapChanger(_object_);
    }

    private static String RatioTapChangerToString(BaseClass _this_) {
        return ((TransformerEnd) _this_).RatioTapChangerToString();
    }

    /**
     * Terminal of the power transformer to which this transformer end belongs.
     */
    private Terminal Terminal; // ManyToOne

    public Terminal getTerminal() {
        return Terminal;
    }

    public void setTerminal(BaseClass _object_) {
        if (!(_object_ instanceof Terminal)) {
            throw new IllegalArgumentException("Object is not Terminal");
        }
        if (Terminal != _object_) {
            Terminal = (Terminal) _object_;
            Terminal.setTransformerEnd(this);
        }
    }

    public String TerminalToString() {
        return Terminal != null ? Terminal.getRdfid() : null;
    }

    private static void setTerminal(BaseClass _this_, BaseClass _object_) {
        ((TransformerEnd) _this_).setTerminal(_object_);
    }

    private static String TerminalToString(BaseClass _this_) {
        return ((TransformerEnd) _this_).TerminalToString();
    }

    /**
     * Number for this transformer end, corresponding to the end`s order in the power transformer vector group or phase angle clock number.  Highest voltage winding should be 1.  Each end within a power transformer should have a unique subsequent end number.   Note the transformer end number need not match the terminal sequence number.
     */
    private Integer endNumber; // Integer

    public Integer getEndNumber() {
        return endNumber;
    }

    public void setEndNumber(Integer _value_) {
        endNumber = _value_;
    }

    public void setEndNumber(String _value_) {
        endNumber = getIntegerFromString(_value_);
    }

    public String endNumberToString() {
        return endNumber != null ? endNumber.toString() : null;
    }

    private static void setEndNumber(BaseClass _this_, String _value_) {
        ((TransformerEnd) _this_).setEndNumber(_value_);
    }

    private static String endNumberToString(BaseClass _this_) {
        return ((TransformerEnd) _this_).endNumberToString();
    }

    /**
     * (for Yn and Zn connections) True if the neutral is solidly grounded.
     */
    private Boolean grounded; // Boolean

    public Boolean getGrounded() {
        return grounded;
    }

    public void setGrounded(Boolean _value_) {
        grounded = _value_;
    }

    public void setGrounded(String _value_) {
        grounded = getBooleanFromString(_value_);
    }

    public String groundedToString() {
        return grounded != null ? grounded.toString() : null;
    }

    private static void setGrounded(BaseClass _this_, String _value_) {
        ((TransformerEnd) _this_).setGrounded(_value_);
    }

    private static String groundedToString(BaseClass _this_) {
        return ((TransformerEnd) _this_).groundedToString();
    }

    /**
     * (for Yn and Zn connections) Resistance part of neutral impedance where `grounded` is true.
     */
    private Double rground; // Resistance

    public Double getRground() {
        return rground;
    }

    public void setRground(Double _value_) {
        rground = _value_;
    }

    public void setRground(String _value_) {
        rground = getDoubleFromString(_value_);
    }

    public String rgroundToString() {
        return rground != null ? rground.toString() : null;
    }

    private static void setRground(BaseClass _this_, String _value_) {
        ((TransformerEnd) _this_).setRground(_value_);
    }

    private static String rgroundToString(BaseClass _this_) {
        return ((TransformerEnd) _this_).rgroundToString();
    }

    /**
     * (for Yn and Zn connections) Reactive part of neutral impedance where `grounded` is true.
     */
    private Double xground; // Reactance

    public Double getXground() {
        return xground;
    }

    public void setXground(Double _value_) {
        xground = _value_;
    }

    public void setXground(String _value_) {
        xground = getDoubleFromString(_value_);
    }

    public String xgroundToString() {
        return xground != null ? xground.toString() : null;
    }

    private static void setXground(BaseClass _this_, String _value_) {
        ((TransformerEnd) _this_).setXground(_value_);
    }

    private static String xgroundToString(BaseClass _this_) {
        return ((TransformerEnd) _this_).xgroundToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "TransformerEnd", attrName));
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
                "TransformerEnd", attrName, objectValue));
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
                "TransformerEnd", attrName, stringValue));
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
            profiles.add(CGMESProfile.EQ);
            map.put("BaseVoltage", new AttrDetails("TransformerEnd.BaseVoltage", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, TransformerEnd::BaseVoltageToString, TransformerEnd::setBaseVoltage, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("PhaseTapChanger", new AttrDetails("TransformerEnd.PhaseTapChanger", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, TransformerEnd::PhaseTapChangerToString, TransformerEnd::setPhaseTapChanger, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("RatioTapChanger", new AttrDetails("TransformerEnd.RatioTapChanger", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, TransformerEnd::RatioTapChangerToString, TransformerEnd::setRatioTapChanger, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("Terminal", new AttrDetails("TransformerEnd.Terminal", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, TransformerEnd::TerminalToString, TransformerEnd::setTerminal, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("endNumber", new AttrDetails("TransformerEnd.endNumber", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, TransformerEnd::endNumberToString, null, TransformerEnd::setEndNumber));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("grounded", new AttrDetails("TransformerEnd.grounded", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, TransformerEnd::groundedToString, null, TransformerEnd::setGrounded));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("rground", new AttrDetails("TransformerEnd.rground", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, TransformerEnd::rgroundToString, null, TransformerEnd::setRground));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SC);
            map.put("xground", new AttrDetails("TransformerEnd.xground", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, TransformerEnd::xgroundToString, null, TransformerEnd::setXground));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new TransformerEnd(null).allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.EQ);
        profiles.add(CGMESProfile.SC);
        POSSIBLE_PROFILES = Collections.unmodifiableSet(profiles);
    }

    private static final CGMESProfile RECOMMENDED_PROFILE = CGMESProfile.EQ;

    private static final Set<CGMESProfile> POSSIBLE_PROFILES_INCLUDING_ATTRIBUTES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>(POSSIBLE_PROFILES);
        for (var attrDetails : ATTR_DETAILS_MAP.values()) {
            profiles.addAll(attrDetails.profiles);
        }
        POSSIBLE_PROFILES_INCLUDING_ATTRIBUTES = Collections.unmodifiableSet(profiles);
    }
}
