/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Parameter details: <ol> 	<li>If <i>X'' </i>=<i> X'</i>, a single cage (one equivalent rotor winding per axis) is modelled.</li> 	<li>The "<i>p</i>" in the attribute names is a substitution for a "prime" in the usual parameter notation, e.g. <i>tpo</i> refers to <i>T'o</i>.</li> </ol> The parameters used for models expressed in time constant reactance form include: - RotatingMachine.ratedS (<i>MVAbase</i>); - RotatingMachineDynamics.damping (<i>D</i>); - RotatingMachineDynamics.inertia (<i>H</i>); - RotatingMachineDynamics.saturationFactor (<i>S1</i>); - RotatingMachineDynamics.saturationFactor120 (<i>S12</i>); - RotatingMachineDynamics.statorLeakageReactance (<i>Xl</i>); - RotatingMachineDynamics.statorResistance (<i>Rs</i>); - .xs (<i>Xs</i>); - .xp (<i>X'</i>); - .xpp (<i>X''</i>); - .tpo (<i>T'o</i>); - .tppo (<i>T''o</i>).
 */
public class AsynchronousMachineTimeConstantReactance extends AsynchronousMachineDynamics {

    private static final Logging LOG = Logging.getLogger(AsynchronousMachineTimeConstantReactance.class);

    private BaseClass[] AsynchronousMachineTimeConstantReactance_class_attributes;
    private BaseClass[] AsynchronousMachineTimeConstantReactance_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new AsynchronousMachineTimeConstantReactance().getAttributeNamesMap();
    }

    private enum AsynchronousMachineTimeConstantReactance_primitive_builder implements PrimitiveBuilder {
        tpo() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tppo() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        xp() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        xpp() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        xs() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum AsynchronousMachineTimeConstantReactance_class_attributes_enum {
        tpo,
        tppo,
        xp,
        xpp,
        xs,
        LAST_ENUM
    }

    public AsynchronousMachineTimeConstantReactance() {
        AsynchronousMachineTimeConstantReactance_primitive_attributes = new BaseClass[AsynchronousMachineTimeConstantReactance_primitive_builder.values().length];
        AsynchronousMachineTimeConstantReactance_class_attributes = new BaseClass[AsynchronousMachineTimeConstantReactance_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new AsynchronousMachineTimeConstantReactance();
    }

    @Override
    public void setValue(java.lang.String s) {
        LOG.error(debugString() + " is not sure what to do with " + s);
    }

    @Override
    public void setRdfid(java.lang.String id) {
        rdfid = id;
    }

    @Override
    public java.lang.String getRdfid() {
        return rdfid;
    }

    private void updateAttributeInArray(AsynchronousMachineTimeConstantReactance_class_attributes_enum attrEnum, BaseClass value) {
        try {
            AsynchronousMachineTimeConstantReactance_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(AsynchronousMachineTimeConstantReactance_primitive_builder attrEnum, BaseClass value) {
        try {
            AsynchronousMachineTimeConstantReactance_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            AsynchronousMachineTimeConstantReactance_class_attributes_enum attrEnum = AsynchronousMachineTimeConstantReactance_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated AsynchronousMachineTimeConstantReactance, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            AsynchronousMachineTimeConstantReactance_primitive_builder attrEnum = AsynchronousMachineTimeConstantReactance_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated AsynchronousMachineTimeConstantReactance, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            AsynchronousMachineTimeConstantReactance_primitive_builder attrEnum = AsynchronousMachineTimeConstantReactance_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = AsynchronousMachineTimeConstantReactance_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            AsynchronousMachineTimeConstantReactance_class_attributes_enum attrEnum = AsynchronousMachineTimeConstantReactance_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = AsynchronousMachineTimeConstantReactance_class_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        if (!defined) {
            return super.getAttribute(attrName);
        }
        return null;
    }

    @Override
    protected Map<java.lang.String, java.lang.String> getAttributeNamesMap() {
        Map<java.lang.String, java.lang.String> namesMap = new LinkedHashMap<>();
        for (var enumValue : AsynchronousMachineTimeConstantReactance_primitive_builder.values()) {
            if (enumValue != AsynchronousMachineTimeConstantReactance_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "AsynchronousMachineTimeConstantReactance." + enumValue.name());
            }
        }
        for (var enumValue : AsynchronousMachineTimeConstantReactance_class_attributes_enum.values()) {
            if (enumValue != AsynchronousMachineTimeConstantReactance_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "AsynchronousMachineTimeConstantReactance." + enumValue.name());
            }
        }
        namesMap.putAll(super.getAttributeNamesMap());
        return namesMap;
    }

    @Override
    public Set<java.lang.String> getAttributeNames() {
        return ATTRIBUTE_NAMES_MAP.keySet();
    }

    @Override
    public java.lang.String getAttributeFullName(java.lang.String attrName) {
        return ATTRIBUTE_NAMES_MAP.get(attrName);
    }

    @Override
    public java.lang.String toString(boolean topClass) {
        java.lang.String result = "";
        if (topClass) {
            for (AsynchronousMachineTimeConstantReactance_primitive_builder attrEnum : AsynchronousMachineTimeConstantReactance_primitive_builder.values()) {
                BaseClass bc = AsynchronousMachineTimeConstantReactance_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    AsynchronousMachineTimeConstantReactance." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (AsynchronousMachineTimeConstantReactance_class_attributes_enum attrEnum : AsynchronousMachineTimeConstantReactance_class_attributes_enum.values()) {
                BaseClass bc = AsynchronousMachineTimeConstantReactance_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    AsynchronousMachineTimeConstantReactance." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(AsynchronousMachineTimeConstantReactance) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "AsynchronousMachineTimeConstantReactance";

    @Override
    public java.lang.String debugString() {
        return debugName;
    }

    /**
     * Get the namespace URL of an object of this class.
     *
     * @return The namespace URL
     */
    @Override
    public java.lang.String getClassNamespaceUrl() {
        return "http://iec.ch/TC57/CIM100#";
    }

    /**
     * Get the namespace URL of an attribute (also for inherited attributes).
     *
     * @return The namespace URL
     */
    @Override
    public java.lang.String getAttributeNamespaceUrl(java.lang.String attrName) {
        return ATTR_NAMESPACE_MAP.get(attrName);
    }

    private static final Map<java.lang.String, java.lang.String> ATTR_NAMESPACE_MAP;
    static {
        ATTR_NAMESPACE_MAP = new AsynchronousMachineTimeConstantReactance().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("tpo", "http://iec.ch/TC57/CIM100#"),
            Map.entry("tppo", "http://iec.ch/TC57/CIM100#"),
            Map.entry("xp", "http://iec.ch/TC57/CIM100#"),
            Map.entry("xpp", "http://iec.ch/TC57/CIM100#"),
            Map.entry("xs", "http://iec.ch/TC57/CIM100#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
