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
 * A connection to the AC network for energy production or consumption that uses power electronics rather than rotating machines.
 */
@SuppressWarnings("unused")
public class PowerElectronicsConnection extends RegulatingCondEq {

    private static final Logging LOG = Logging.getLogger(PowerElectronicsConnection.class);

    /**
     * Default constructor.
     */
    public PowerElectronicsConnection() {
        setCimType("PowerElectronicsConnection");
    }

    /**
     * An AC network connection may have several power electronics units connecting through it.
     */
    private PowerElectronicsUnit PowerElectronicsUnit; // OneToOne

    public PowerElectronicsUnit getPowerElectronicsUnit() {
        return PowerElectronicsUnit;
    }

    public void setPowerElectronicsUnit(BaseClass _object_) {
        if (!(_object_ instanceof PowerElectronicsUnit)) {
            throw new IllegalArgumentException("Object is not PowerElectronicsUnit");
        }
        if (PowerElectronicsUnit != _object_) {
            PowerElectronicsUnit = (PowerElectronicsUnit) _object_;
            PowerElectronicsUnit.setPowerElectronicsConnection(this);
        }
    }

    public String PowerElectronicsUnitToString() {
        return PowerElectronicsUnit != null ? PowerElectronicsUnit.getRdfid() : null;
    }

    private static void setPowerElectronicsUnit(BaseClass _this_, BaseClass _object_) {
        ((PowerElectronicsConnection) _this_).setPowerElectronicsUnit(_object_);
    }

    private static String PowerElectronicsUnitToString(BaseClass _this_) {
        return ((PowerElectronicsConnection) _this_).PowerElectronicsUnitToString();
    }

    /**
     * The wind turbine type 3 or type 4 dynamics model associated with this power electronics connection.
     *
     * NOT USED
     */
    private WindTurbineType3or4Dynamics WindTurbineType3or4Dynamics; // OneToOne

    public WindTurbineType3or4Dynamics getWindTurbineType3or4Dynamics() {
        return WindTurbineType3or4Dynamics;
    }

    public void setWindTurbineType3or4Dynamics(BaseClass _object_) {
        if (!(_object_ instanceof WindTurbineType3or4Dynamics)) {
            throw new IllegalArgumentException("Object is not WindTurbineType3or4Dynamics");
        }
        if (WindTurbineType3or4Dynamics != _object_) {
            WindTurbineType3or4Dynamics = (WindTurbineType3or4Dynamics) _object_;
            WindTurbineType3or4Dynamics.setPowerElectronicsConnection(this);
        }
    }

    public String WindTurbineType3or4DynamicsToString() {
        return WindTurbineType3or4Dynamics != null ? WindTurbineType3or4Dynamics.getRdfid() : null;
    }

    private static void setWindTurbineType3or4Dynamics(BaseClass _this_, BaseClass _object_) {
        ((PowerElectronicsConnection) _this_).setWindTurbineType3or4Dynamics(_object_);
    }

    private static String WindTurbineType3or4DynamicsToString(BaseClass _this_) {
        return ((PowerElectronicsConnection) _this_).WindTurbineType3or4DynamicsToString();
    }

    /**
     * Maximum reactive power limit. This is the maximum (nameplate) limit for the unit.
     */
    private Double maxQ; // ReactivePower

    public Double getMaxQ() {
        return maxQ;
    }

    public void setMaxQ(Double _value_) {
        maxQ = _value_;
    }

    public void setMaxQ(String _value_) {
        maxQ = getDoubleFromString(_value_);
    }

    public String maxQToString() {
        return maxQ != null ? maxQ.toString() : null;
    }

    private static void setMaxQ(BaseClass _this_, String _value_) {
        ((PowerElectronicsConnection) _this_).setMaxQ(_value_);
    }

    private static String maxQToString(BaseClass _this_) {
        return ((PowerElectronicsConnection) _this_).maxQToString();
    }

    /**
     * Minimum reactive power limit for the unit. This is the minimum (nameplate) limit for the unit.
     */
    private Double minQ; // ReactivePower

    public Double getMinQ() {
        return minQ;
    }

    public void setMinQ(Double _value_) {
        minQ = _value_;
    }

    public void setMinQ(String _value_) {
        minQ = getDoubleFromString(_value_);
    }

    public String minQToString() {
        return minQ != null ? minQ.toString() : null;
    }

    private static void setMinQ(BaseClass _this_, String _value_) {
        ((PowerElectronicsConnection) _this_).setMinQ(_value_);
    }

    private static String minQToString(BaseClass _this_) {
        return ((PowerElectronicsConnection) _this_).minQToString();
    }

    /**
     * Active power injection. Load sign convention is used, i.e. positive sign means flow out from a node. Starting value for a steady state solution.
     */
    private Double p; // ActivePower

    public Double getP() {
        return p;
    }

    public void setP(Double _value_) {
        p = _value_;
    }

    public void setP(String _value_) {
        p = getDoubleFromString(_value_);
    }

    public String pToString() {
        return p != null ? p.toString() : null;
    }

    private static void setP(BaseClass _this_, String _value_) {
        ((PowerElectronicsConnection) _this_).setP(_value_);
    }

    private static String pToString(BaseClass _this_) {
        return ((PowerElectronicsConnection) _this_).pToString();
    }

    /**
     * Reactive power injection. Load sign convention is used, i.e. positive sign means flow out from a node. Starting value for a steady state solution.
     */
    private Double q; // ReactivePower

    public Double getQ() {
        return q;
    }

    public void setQ(Double _value_) {
        q = _value_;
    }

    public void setQ(String _value_) {
        q = getDoubleFromString(_value_);
    }

    public String qToString() {
        return q != null ? q.toString() : null;
    }

    private static void setQ(BaseClass _this_, String _value_) {
        ((PowerElectronicsConnection) _this_).setQ(_value_);
    }

    private static String qToString(BaseClass _this_) {
        return ((PowerElectronicsConnection) _this_).qToString();
    }

    /**
     * Nameplate apparent power rating for the unit. The attribute shall have a positive value.
     */
    private Double ratedS; // ApparentPower

    public Double getRatedS() {
        return ratedS;
    }

    public void setRatedS(Double _value_) {
        ratedS = _value_;
    }

    public void setRatedS(String _value_) {
        ratedS = getDoubleFromString(_value_);
    }

    public String ratedSToString() {
        return ratedS != null ? ratedS.toString() : null;
    }

    private static void setRatedS(BaseClass _this_, String _value_) {
        ((PowerElectronicsConnection) _this_).setRatedS(_value_);
    }

    private static String ratedSToString(BaseClass _this_) {
        return ((PowerElectronicsConnection) _this_).ratedSToString();
    }

    /**
     * Rated voltage (nameplate data, Ur in IEC 60909-0). It is primarily used for short circuit data exchange according to IEC 60909. The attribute shall be a positive value.
     */
    private Double ratedU; // Voltage

    public Double getRatedU() {
        return ratedU;
    }

    public void setRatedU(Double _value_) {
        ratedU = _value_;
    }

    public void setRatedU(String _value_) {
        ratedU = getDoubleFromString(_value_);
    }

    public String ratedUToString() {
        return ratedU != null ? ratedU.toString() : null;
    }

    private static void setRatedU(BaseClass _this_, String _value_) {
        ((PowerElectronicsConnection) _this_).setRatedU(_value_);
    }

    private static String ratedUToString(BaseClass _this_) {
        return ((PowerElectronicsConnection) _this_).ratedUToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "PowerElectronicsConnection", attrName));
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
                "PowerElectronicsConnection", attrName, objectValue));
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
                "PowerElectronicsConnection", attrName, stringValue));
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
            map.put("PowerElectronicsUnit", new AttrDetails("PowerElectronicsConnection.PowerElectronicsUnit", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, PowerElectronicsConnection::PowerElectronicsUnitToString, PowerElectronicsConnection::setPowerElectronicsUnit, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindTurbineType3or4Dynamics", new AttrDetails("PowerElectronicsConnection.WindTurbineType3or4Dynamics", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, PowerElectronicsConnection::WindTurbineType3or4DynamicsToString, PowerElectronicsConnection::setWindTurbineType3or4Dynamics, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("maxQ", new AttrDetails("PowerElectronicsConnection.maxQ", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PowerElectronicsConnection::maxQToString, null, PowerElectronicsConnection::setMaxQ));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("minQ", new AttrDetails("PowerElectronicsConnection.minQ", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PowerElectronicsConnection::minQToString, null, PowerElectronicsConnection::setMinQ));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("p", new AttrDetails("PowerElectronicsConnection.p", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PowerElectronicsConnection::pToString, null, PowerElectronicsConnection::setP));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.SSH);
            map.put("q", new AttrDetails("PowerElectronicsConnection.q", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PowerElectronicsConnection::qToString, null, PowerElectronicsConnection::setQ));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("ratedS", new AttrDetails("PowerElectronicsConnection.ratedS", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PowerElectronicsConnection::ratedSToString, null, PowerElectronicsConnection::setRatedS));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            map.put("ratedU", new AttrDetails("PowerElectronicsConnection.ratedU", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, PowerElectronicsConnection::ratedUToString, null, PowerElectronicsConnection::setRatedU));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new PowerElectronicsConnection().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.DY);
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
