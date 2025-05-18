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
 * A control areais a grouping of generating units and/or loads and a cutset of tie lines (as terminals) which may be used for a variety of purposes including automatic generation control, powerflow solution area interchange control specification, and input to load forecasting.   Note that any number of overlapping control area specifications can be superimposed on the physical model.
 */
@SuppressWarnings("unused")
public class ControlArea extends PowerSystemResource {

    private static final Logging LOG = Logging.getLogger(ControlArea.class);

    /**
     * Constructor.
     */
    public ControlArea(String rdfid) {
        super("ControlArea", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected ControlArea(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * The generating unit specificaitons for the control area.
     *
     * NOT USED
     */
    private Set<ControlAreaGeneratingUnit> ControlAreaGeneratingUnit = new HashSet<>(); // OneToMany

    public Set<ControlAreaGeneratingUnit> getControlAreaGeneratingUnit() {
        return ControlAreaGeneratingUnit;
    }

    public void setControlAreaGeneratingUnit(BaseClass _object_) {
        if (!(_object_ instanceof ControlAreaGeneratingUnit)) {
            throw new IllegalArgumentException("Object is not ControlAreaGeneratingUnit");
        }
        if (!ControlAreaGeneratingUnit.contains(_object_)) {
            ControlAreaGeneratingUnit.add((ControlAreaGeneratingUnit) _object_);
            ((ControlAreaGeneratingUnit) _object_).setControlArea(this);
        }
    }

    public String ControlAreaGeneratingUnitToString() {
        return getStringFromSet(ControlAreaGeneratingUnit);
    }

    private static void setControlAreaGeneratingUnit(BaseClass _this_, BaseClass _object_) {
        ((ControlArea) _this_).setControlAreaGeneratingUnit(_object_);
    }

    private static String ControlAreaGeneratingUnitToString(BaseClass _this_) {
        return ((ControlArea) _this_).ControlAreaGeneratingUnitToString();
    }

    /**
     * The energy area that is forecast from this control area specification.
     */
    private EnergyArea EnergyArea; // OneToOne

    public EnergyArea getEnergyArea() {
        return EnergyArea;
    }

    public void setEnergyArea(BaseClass _object_) {
        if (!(_object_ instanceof EnergyArea)) {
            throw new IllegalArgumentException("Object is not EnergyArea");
        }
        if (EnergyArea != _object_) {
            EnergyArea = (EnergyArea) _object_;
            EnergyArea.setControlArea(this);
        }
    }

    public String EnergyAreaToString() {
        return EnergyArea != null ? EnergyArea.getRdfid() : null;
    }

    private static void setEnergyArea(BaseClass _this_, BaseClass _object_) {
        ((ControlArea) _this_).setEnergyArea(_object_);
    }

    private static String EnergyAreaToString(BaseClass _this_) {
        return ((ControlArea) _this_).EnergyAreaToString();
    }

    /**
     * The tie flows associated with the control area.
     *
     * NOT USED
     */
    private Set<TieFlow> TieFlow = new HashSet<>(); // OneToMany

    public Set<TieFlow> getTieFlow() {
        return TieFlow;
    }

    public void setTieFlow(BaseClass _object_) {
        if (!(_object_ instanceof TieFlow)) {
            throw new IllegalArgumentException("Object is not TieFlow");
        }
        if (!TieFlow.contains(_object_)) {
            TieFlow.add((TieFlow) _object_);
            ((TieFlow) _object_).setControlArea(this);
        }
    }

    public String TieFlowToString() {
        return getStringFromSet(TieFlow);
    }

    private static void setTieFlow(BaseClass _this_, BaseClass _object_) {
        ((ControlArea) _this_).setTieFlow(_object_);
    }

    private static String TieFlowToString(BaseClass _this_) {
        return ((ControlArea) _this_).TieFlowToString();
    }

    /**
     * The specified positive net interchange into the control area, i.e. positive sign means flow in to the area.
     */
    private Double netInterchange; // ActivePower

    public Double getNetInterchange() {
        return netInterchange;
    }

    public void setNetInterchange(Double _value_) {
        netInterchange = _value_;
    }

    public void setNetInterchange(String _value_) {
        netInterchange = getDoubleFromString(_value_);
    }

    public String netInterchangeToString() {
        return netInterchange != null ? netInterchange.toString() : null;
    }

    private static void setNetInterchange(BaseClass _this_, String _value_) {
        ((ControlArea) _this_).setNetInterchange(_value_);
    }

    private static String netInterchangeToString(BaseClass _this_) {
        return ((ControlArea) _this_).netInterchangeToString();
    }

    /**
     * Active power net interchange tolerance
     */
    private Double pTolerance; // ActivePower

    public Double getPTolerance() {
        return pTolerance;
    }

    public void setPTolerance(Double _value_) {
        pTolerance = _value_;
    }

    public void setPTolerance(String _value_) {
        pTolerance = getDoubleFromString(_value_);
    }

    public String pToleranceToString() {
        return pTolerance != null ? pTolerance.toString() : null;
    }

    private static void setPTolerance(BaseClass _this_, String _value_) {
        ((ControlArea) _this_).setPTolerance(_value_);
    }

    private static String pToleranceToString(BaseClass _this_) {
        return ((ControlArea) _this_).pToleranceToString();
    }

    /**
     * The primary type of control area definition used to determine if this is used for automatic generation control, for planning interchange control, or other purposes.   A control area specified with primary type of automatic generation control could still be forecast and used as an interchange area in power flow analysis.
     */
    private String type; // ControlAreaTypeKind

    public String getType() {
        return type;
    }

    public void setType(String _value_) {
        type = _value_;
    }

    public String typeToString() {
        return type;
    }

    private static void setType(BaseClass _this_, String _value_) {
        ((ControlArea) _this_).setType(_value_);
    }

    private static String typeToString(BaseClass _this_) {
        return ((ControlArea) _this_).typeToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ControlArea", attrName));
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
                "ControlArea", attrName, objectValue));
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
                "ControlArea", attrName, stringValue));
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
            profiles.add(CGMESProfile.EQ);
            map.put("ControlAreaGeneratingUnit", new AttrDetails("ControlArea.ControlAreaGeneratingUnit", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, ControlArea::ControlAreaGeneratingUnitToString, ControlArea::setControlAreaGeneratingUnit, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("EnergyArea", new AttrDetails("ControlArea.EnergyArea", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, ControlArea::EnergyAreaToString, ControlArea::setEnergyArea, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("TieFlow", new AttrDetails("ControlArea.TieFlow", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, ControlArea::TieFlowToString, ControlArea::setTieFlow, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("netInterchange", new AttrDetails("ControlArea.netInterchange", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ControlArea::netInterchangeToString, null, ControlArea::setNetInterchange));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("pTolerance", new AttrDetails("ControlArea.pTolerance", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, ControlArea::pToleranceToString, null, ControlArea::setPTolerance));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("type", new AttrDetails("ControlArea.type", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, true, ControlArea::typeToString, null, ControlArea::setType));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ControlArea(null).allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.EQ);
        profiles.add(CGMESProfile.SSH);
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
