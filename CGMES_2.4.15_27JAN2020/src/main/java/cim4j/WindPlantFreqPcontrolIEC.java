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
 * Frequency and active power controller model.  Reference: IEC Standard 61400-27-1 Annex E.
 */
@SuppressWarnings("unused")
public class WindPlantFreqPcontrolIEC extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(WindPlantFreqPcontrolIEC.class);

    /**
     * Constructor.
     */
    public WindPlantFreqPcontrolIEC(String rdfid) {
        super("WindPlantFreqPcontrolIEC", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected WindPlantFreqPcontrolIEC(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * The frequency and active power wind plant control model with which this wind dynamics lookup table is associated.
     *
     * NOT USED
     */
    private Set<WindDynamicsLookupTable> WindDynamicsLookupTable = new HashSet<>(); // OneToMany

    public Set<WindDynamicsLookupTable> getWindDynamicsLookupTable() {
        return WindDynamicsLookupTable;
    }

    public void setWindDynamicsLookupTable(BaseClass _object_) {
        if (!(_object_ instanceof WindDynamicsLookupTable)) {
            throw new IllegalArgumentException("Object is not WindDynamicsLookupTable");
        }
        if (!WindDynamicsLookupTable.contains(_object_)) {
            WindDynamicsLookupTable.add((WindDynamicsLookupTable) _object_);
            ((WindDynamicsLookupTable) _object_).setWindPlantFreqPcontrolIEC(this);
        }
    }

    public String WindDynamicsLookupTableToString() {
        return getStringFromSet(WindDynamicsLookupTable);
    }

    private static void setWindDynamicsLookupTable(BaseClass _this_, BaseClass _object_) {
        ((WindPlantFreqPcontrolIEC) _this_).setWindDynamicsLookupTable(_object_);
    }

    private static String WindDynamicsLookupTableToString(BaseClass _this_) {
        return ((WindPlantFreqPcontrolIEC) _this_).WindDynamicsLookupTableToString();
    }

    /**
     * Wind plant model with which this wind plant frequency and active power control is associated.
     *
     * NOT USED
     */
    private WindPlantIEC WindPlantIEC; // OneToOne

    public WindPlantIEC getWindPlantIEC() {
        return WindPlantIEC;
    }

    public void setWindPlantIEC(BaseClass _object_) {
        if (!(_object_ instanceof WindPlantIEC)) {
            throw new IllegalArgumentException("Object is not WindPlantIEC");
        }
        if (WindPlantIEC != _object_) {
            WindPlantIEC = (WindPlantIEC) _object_;
            WindPlantIEC.setWindPlantFreqPcontrolIEC(this);
        }
    }

    public String WindPlantIECToString() {
        return WindPlantIEC != null ? WindPlantIEC.getRdfid() : null;
    }

    private static void setWindPlantIEC(BaseClass _this_, BaseClass _object_) {
        ((WindPlantFreqPcontrolIEC) _this_).setWindPlantIEC(_object_);
    }

    private static String WindPlantIECToString(BaseClass _this_) {
        return ((WindPlantFreqPcontrolIEC) _this_).WindPlantIECToString();
    }

    /**
     * Maximum ramp rate of  request from the plant controller to the wind turbines (). It is project dependent parameter.
     */
    private Double dprefmax; // PU

    public Double getDprefmax() {
        return dprefmax;
    }

    public void setDprefmax(Double _value_) {
        dprefmax = _value_;
    }

    public void setDprefmax(String _value_) {
        dprefmax = getDoubleFromString(_value_);
    }

    public String dprefmaxToString() {
        return dprefmax != null ? dprefmax.toString() : null;
    }

    private static void setDprefmax(BaseClass _this_, String _value_) {
        ((WindPlantFreqPcontrolIEC) _this_).setDprefmax(_value_);
    }

    private static String dprefmaxToString(BaseClass _this_) {
        return ((WindPlantFreqPcontrolIEC) _this_).dprefmaxToString();
    }

    /**
     * Minimum (negative) ramp rate of  request from the plant controller to the wind turbines (). It is project dependent parameter.
     */
    private Double dprefmin; // PU

    public Double getDprefmin() {
        return dprefmin;
    }

    public void setDprefmin(Double _value_) {
        dprefmin = _value_;
    }

    public void setDprefmin(String _value_) {
        dprefmin = getDoubleFromString(_value_);
    }

    public String dprefminToString() {
        return dprefmin != null ? dprefmin.toString() : null;
    }

    private static void setDprefmin(BaseClass _this_, String _value_) {
        ((WindPlantFreqPcontrolIEC) _this_).setDprefmin(_value_);
    }

    private static String dprefminToString(BaseClass _this_) {
        return ((WindPlantFreqPcontrolIEC) _this_).dprefminToString();
    }

    /**
     * Plant P controller integral gain (). It is type dependent parameter.
     */
    private Double kiwpp; // Simple_Float

    public Double getKiwpp() {
        return kiwpp;
    }

    public void setKiwpp(Double _value_) {
        kiwpp = _value_;
    }

    public void setKiwpp(String _value_) {
        kiwpp = getDoubleFromString(_value_);
    }

    public String kiwppToString() {
        return kiwpp != null ? kiwpp.toString() : null;
    }

    private static void setKiwpp(BaseClass _this_, String _value_) {
        ((WindPlantFreqPcontrolIEC) _this_).setKiwpp(_value_);
    }

    private static String kiwppToString(BaseClass _this_) {
        return ((WindPlantFreqPcontrolIEC) _this_).kiwppToString();
    }

    /**
     * Plant P controller proportional gain (). It is type dependent parameter.
     */
    private Double kpwpp; // Simple_Float

    public Double getKpwpp() {
        return kpwpp;
    }

    public void setKpwpp(Double _value_) {
        kpwpp = _value_;
    }

    public void setKpwpp(String _value_) {
        kpwpp = getDoubleFromString(_value_);
    }

    public String kpwppToString() {
        return kpwpp != null ? kpwpp.toString() : null;
    }

    private static void setKpwpp(BaseClass _this_, String _value_) {
        ((WindPlantFreqPcontrolIEC) _this_).setKpwpp(_value_);
    }

    private static String kpwppToString(BaseClass _this_) {
        return ((WindPlantFreqPcontrolIEC) _this_).kpwppToString();
    }

    /**
     * Maximum  request from the plant controller to the wind turbines (). It is type dependent parameter.
     */
    private Double prefmax; // PU

    public Double getPrefmax() {
        return prefmax;
    }

    public void setPrefmax(Double _value_) {
        prefmax = _value_;
    }

    public void setPrefmax(String _value_) {
        prefmax = getDoubleFromString(_value_);
    }

    public String prefmaxToString() {
        return prefmax != null ? prefmax.toString() : null;
    }

    private static void setPrefmax(BaseClass _this_, String _value_) {
        ((WindPlantFreqPcontrolIEC) _this_).setPrefmax(_value_);
    }

    private static String prefmaxToString(BaseClass _this_) {
        return ((WindPlantFreqPcontrolIEC) _this_).prefmaxToString();
    }

    /**
     * Minimum  request from the plant controller to the wind turbines (). It is type dependent parameter.
     */
    private Double prefmin; // PU

    public Double getPrefmin() {
        return prefmin;
    }

    public void setPrefmin(Double _value_) {
        prefmin = _value_;
    }

    public void setPrefmin(String _value_) {
        prefmin = getDoubleFromString(_value_);
    }

    public String prefminToString() {
        return prefmin != null ? prefmin.toString() : null;
    }

    private static void setPrefmin(BaseClass _this_, String _value_) {
        ((WindPlantFreqPcontrolIEC) _this_).setPrefmin(_value_);
    }

    private static String prefminToString(BaseClass _this_) {
        return ((WindPlantFreqPcontrolIEC) _this_).prefminToString();
    }

    /**
     * Lead time constant in reference value transfer function (). It is type dependent parameter.
     */
    private Double tpft; // Seconds

    public Double getTpft() {
        return tpft;
    }

    public void setTpft(Double _value_) {
        tpft = _value_;
    }

    public void setTpft(String _value_) {
        tpft = getDoubleFromString(_value_);
    }

    public String tpftToString() {
        return tpft != null ? tpft.toString() : null;
    }

    private static void setTpft(BaseClass _this_, String _value_) {
        ((WindPlantFreqPcontrolIEC) _this_).setTpft(_value_);
    }

    private static String tpftToString(BaseClass _this_) {
        return ((WindPlantFreqPcontrolIEC) _this_).tpftToString();
    }

    /**
     * Lag time constant in reference value transfer function (). It is type dependent parameter.
     */
    private Double tpfv; // Seconds

    public Double getTpfv() {
        return tpfv;
    }

    public void setTpfv(Double _value_) {
        tpfv = _value_;
    }

    public void setTpfv(String _value_) {
        tpfv = getDoubleFromString(_value_);
    }

    public String tpfvToString() {
        return tpfv != null ? tpfv.toString() : null;
    }

    private static void setTpfv(BaseClass _this_, String _value_) {
        ((WindPlantFreqPcontrolIEC) _this_).setTpfv(_value_);
    }

    private static String tpfvToString(BaseClass _this_) {
        return ((WindPlantFreqPcontrolIEC) _this_).tpfvToString();
    }

    /**
     * Filter time constant for frequency measurement (). It is type dependent parameter.
     */
    private Double twpffilt; // Seconds

    public Double getTwpffilt() {
        return twpffilt;
    }

    public void setTwpffilt(Double _value_) {
        twpffilt = _value_;
    }

    public void setTwpffilt(String _value_) {
        twpffilt = getDoubleFromString(_value_);
    }

    public String twpffiltToString() {
        return twpffilt != null ? twpffilt.toString() : null;
    }

    private static void setTwpffilt(BaseClass _this_, String _value_) {
        ((WindPlantFreqPcontrolIEC) _this_).setTwpffilt(_value_);
    }

    private static String twpffiltToString(BaseClass _this_) {
        return ((WindPlantFreqPcontrolIEC) _this_).twpffiltToString();
    }

    /**
     * Filter time constant for active power measurement (). It is type dependent parameter.
     */
    private Double twppfilt; // Seconds

    public Double getTwppfilt() {
        return twppfilt;
    }

    public void setTwppfilt(Double _value_) {
        twppfilt = _value_;
    }

    public void setTwppfilt(String _value_) {
        twppfilt = getDoubleFromString(_value_);
    }

    public String twppfiltToString() {
        return twppfilt != null ? twppfilt.toString() : null;
    }

    private static void setTwppfilt(BaseClass _this_, String _value_) {
        ((WindPlantFreqPcontrolIEC) _this_).setTwppfilt(_value_);
    }

    private static String twppfiltToString(BaseClass _this_) {
        return ((WindPlantFreqPcontrolIEC) _this_).twppfiltToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "WindPlantFreqPcontrolIEC", attrName));
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
                "WindPlantFreqPcontrolIEC", attrName, objectValue));
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
                "WindPlantFreqPcontrolIEC", attrName, stringValue));
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
            map.put("WindDynamicsLookupTable", new AttrDetails("WindPlantFreqPcontrolIEC.WindDynamicsLookupTable", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, WindPlantFreqPcontrolIEC::WindDynamicsLookupTableToString, WindPlantFreqPcontrolIEC::setWindDynamicsLookupTable, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindPlantIEC", new AttrDetails("WindPlantFreqPcontrolIEC.WindPlantIEC", false, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, false, false, WindPlantFreqPcontrolIEC::WindPlantIECToString, WindPlantFreqPcontrolIEC::setWindPlantIEC, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dprefmax", new AttrDetails("WindPlantFreqPcontrolIEC.dprefmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindPlantFreqPcontrolIEC::dprefmaxToString, null, WindPlantFreqPcontrolIEC::setDprefmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("dprefmin", new AttrDetails("WindPlantFreqPcontrolIEC.dprefmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindPlantFreqPcontrolIEC::dprefminToString, null, WindPlantFreqPcontrolIEC::setDprefmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kiwpp", new AttrDetails("WindPlantFreqPcontrolIEC.kiwpp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindPlantFreqPcontrolIEC::kiwppToString, null, WindPlantFreqPcontrolIEC::setKiwpp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("kpwpp", new AttrDetails("WindPlantFreqPcontrolIEC.kpwpp", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindPlantFreqPcontrolIEC::kpwppToString, null, WindPlantFreqPcontrolIEC::setKpwpp));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("prefmax", new AttrDetails("WindPlantFreqPcontrolIEC.prefmax", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindPlantFreqPcontrolIEC::prefmaxToString, null, WindPlantFreqPcontrolIEC::setPrefmax));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("prefmin", new AttrDetails("WindPlantFreqPcontrolIEC.prefmin", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindPlantFreqPcontrolIEC::prefminToString, null, WindPlantFreqPcontrolIEC::setPrefmin));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tpft", new AttrDetails("WindPlantFreqPcontrolIEC.tpft", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindPlantFreqPcontrolIEC::tpftToString, null, WindPlantFreqPcontrolIEC::setTpft));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("tpfv", new AttrDetails("WindPlantFreqPcontrolIEC.tpfv", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindPlantFreqPcontrolIEC::tpfvToString, null, WindPlantFreqPcontrolIEC::setTpfv));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("twpffilt", new AttrDetails("WindPlantFreqPcontrolIEC.twpffilt", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindPlantFreqPcontrolIEC::twpffiltToString, null, WindPlantFreqPcontrolIEC::setTwpffilt));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("twppfilt", new AttrDetails("WindPlantFreqPcontrolIEC.twppfilt", true, "http://iec.ch/TC57/2013/CIM-schema-cim16#", profiles, true, false, WindPlantFreqPcontrolIEC::twppfiltToString, null, WindPlantFreqPcontrolIEC::setTwppfilt));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new WindPlantFreqPcontrolIEC(null).allAttrDetailsMap());
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
