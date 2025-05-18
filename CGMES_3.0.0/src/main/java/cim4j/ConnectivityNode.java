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
 * Connectivity nodes are points where terminals of AC conducting equipment are connected together with zero impedance.
 */
@SuppressWarnings("unused")
public class ConnectivityNode extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(ConnectivityNode.class);

    /**
     * Constructor.
     */
    public ConnectivityNode(String rdfid) {
        super("ConnectivityNode", rdfid);
    }

    /**
     * Constructor for subclasses.
     */
    protected ConnectivityNode(String cimType, String rdfid) {
        super(cimType, rdfid);
    }

    /**
     * The boundary point associated with the connectivity node.
     *
     * NOT USED
     */
    private BoundaryPoint BoundaryPoint; // OneToOne

    public BoundaryPoint getBoundaryPoint() {
        return BoundaryPoint;
    }

    public void setBoundaryPoint(BaseClass _object_) {
        if (!(_object_ instanceof BoundaryPoint)) {
            throw new IllegalArgumentException("Object is not BoundaryPoint");
        }
        if (BoundaryPoint != _object_) {
            BoundaryPoint = (BoundaryPoint) _object_;
            BoundaryPoint.setConnectivityNode(this);
        }
    }

    public String BoundaryPointToString() {
        return BoundaryPoint != null ? BoundaryPoint.getRdfid() : null;
    }

    private static void setBoundaryPoint(BaseClass _this_, BaseClass _object_) {
        ((ConnectivityNode) _this_).setBoundaryPoint(_object_);
    }

    private static String BoundaryPointToString(BaseClass _this_) {
        return ((ConnectivityNode) _this_).BoundaryPointToString();
    }

    /**
     * Container of this connectivity node.
     */
    private ConnectivityNodeContainer ConnectivityNodeContainer; // ManyToOne

    public ConnectivityNodeContainer getConnectivityNodeContainer() {
        return ConnectivityNodeContainer;
    }

    public void setConnectivityNodeContainer(BaseClass _object_) {
        if (!(_object_ instanceof ConnectivityNodeContainer)) {
            throw new IllegalArgumentException("Object is not ConnectivityNodeContainer");
        }
        if (ConnectivityNodeContainer != _object_) {
            ConnectivityNodeContainer = (ConnectivityNodeContainer) _object_;
            ConnectivityNodeContainer.setConnectivityNodes(this);
        }
    }

    public String ConnectivityNodeContainerToString() {
        return ConnectivityNodeContainer != null ? ConnectivityNodeContainer.getRdfid() : null;
    }

    private static void setConnectivityNodeContainer(BaseClass _this_, BaseClass _object_) {
        ((ConnectivityNode) _this_).setConnectivityNodeContainer(_object_);
    }

    private static String ConnectivityNodeContainerToString(BaseClass _this_) {
        return ((ConnectivityNode) _this_).ConnectivityNodeContainerToString();
    }

    /**
     * Terminals interconnected with zero impedance at a this connectivity node.
     *
     * NOT USED
     */
    private Set<Terminal> Terminals = new HashSet<>(); // OneToMany

    public Set<Terminal> getTerminals() {
        return Terminals;
    }

    public void setTerminals(BaseClass _object_) {
        if (!(_object_ instanceof Terminal)) {
            throw new IllegalArgumentException("Object is not Terminal");
        }
        if (!Terminals.contains(_object_)) {
            Terminals.add((Terminal) _object_);
            ((Terminal) _object_).setConnectivityNode(this);
        }
    }

    public String TerminalsToString() {
        return getStringFromSet(Terminals);
    }

    private static void setTerminals(BaseClass _this_, BaseClass _object_) {
        ((ConnectivityNode) _this_).setTerminals(_object_);
    }

    private static String TerminalsToString(BaseClass _this_) {
        return ((ConnectivityNode) _this_).TerminalsToString();
    }

    /**
     * The topological node to which this connectivity node is assigned.  May depend on the current state of switches in the network.
     */
    private TopologicalNode TopologicalNode; // ManyToOne

    public TopologicalNode getTopologicalNode() {
        return TopologicalNode;
    }

    public void setTopologicalNode(BaseClass _object_) {
        if (!(_object_ instanceof TopologicalNode)) {
            throw new IllegalArgumentException("Object is not TopologicalNode");
        }
        if (TopologicalNode != _object_) {
            TopologicalNode = (TopologicalNode) _object_;
            TopologicalNode.setConnectivityNodes(this);
        }
    }

    public String TopologicalNodeToString() {
        return TopologicalNode != null ? TopologicalNode.getRdfid() : null;
    }

    private static void setTopologicalNode(BaseClass _this_, BaseClass _object_) {
        ((ConnectivityNode) _this_).setTopologicalNode(_object_);
    }

    private static String TopologicalNodeToString(BaseClass _this_) {
        return ((ConnectivityNode) _this_).TopologicalNodeToString();
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
        LOG.error(String.format("No-one knows an attribute %s.%s", "ConnectivityNode", attrName));
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
                "ConnectivityNode", attrName, objectValue));
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
                "ConnectivityNode", attrName, stringValue));
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
            profiles.add(CGMESProfile.EQBD);
            map.put("BoundaryPoint", new AttrDetails("ConnectivityNode.BoundaryPoint", false, "http://iec.ch/TC57/CIM100-European#", profiles, false, false, ConnectivityNode::BoundaryPointToString, ConnectivityNode::setBoundaryPoint, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            profiles.add(CGMESProfile.EQBD);
            map.put("ConnectivityNodeContainer", new AttrDetails("ConnectivityNode.ConnectivityNodeContainer", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, ConnectivityNode::ConnectivityNodeContainerToString, ConnectivityNode::setConnectivityNodeContainer, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.EQ);
            profiles.add(CGMESProfile.EQBD);
            map.put("Terminals", new AttrDetails("ConnectivityNode.Terminals", false, "http://iec.ch/TC57/CIM100#", profiles, false, false, ConnectivityNode::TerminalsToString, ConnectivityNode::setTerminals, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.TP);
            map.put("TopologicalNode", new AttrDetails("ConnectivityNode.TopologicalNode", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, ConnectivityNode::TopologicalNodeToString, ConnectivityNode::setTopologicalNode, null));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ConnectivityNode(null).allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.EQ);
        profiles.add(CGMESProfile.EQBD);
        profiles.add(CGMESProfile.TP);
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
