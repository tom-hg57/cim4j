/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Synchronous machine detailed modelling types are defined by the combination of the attributes SynchronousMachineTimeConstantReactance.modelType and SynchronousMachineTimeConstantReactance.rotorType.   Parameter details: <ol> 	<li>The "p" in the time-related attribute names is a substitution for a "prime" in the usual parameter notation, e.g. tpdo refers to <i>T'do</i>.</li> 	<li>The parameters used for models expressed in time constant reactance form include:</li> </ol> - RotatingMachine.ratedS (<i>MVAbase</i>); - RotatingMachineDynamics.damping (<i>D</i>); - RotatingMachineDynamics.inertia (<i>H</i>); - RotatingMachineDynamics.saturationFactor (<i>S1</i>); - RotatingMachineDynamics.saturationFactor120 (<i>S12</i>); - RotatingMachineDynamics.statorLeakageReactance (<i>Xl</i>); - RotatingMachineDynamics.statorResistance (<i>Rs</i>); - SynchronousMachineTimeConstantReactance.ks (<i>Ks</i>); - SynchronousMachineDetailed.saturationFactorQAxis (<i>S1q</i>); - SynchronousMachineDetailed.saturationFactor120QAxis (<i>S12q</i>); - SynchronousMachineDetailed.efdBaseRatio; - SynchronousMachineDetailed.ifdBaseType; - .xDirectSync (<i>Xd</i>); - .xDirectTrans (<i>X'd</i>); - .xDirectSubtrans (<i>X''d</i>); - .xQuadSync (<i>Xq</i>); - .xQuadTrans (<i>X'q</i>); - .xQuadSubtrans (<i>X''q</i>); - .tpdo (<i>T'do</i>); - .tppdo (<i>T''do</i>); - .tpqo (<i>T'qo</i>); - .tppqo (<i>T''qo</i>); - .tc.
 */
public class SynchronousMachineTimeConstantReactance extends SynchronousMachineDetailed {

    private static final Logging LOG = Logging.getLogger(SynchronousMachineTimeConstantReactance.class);

    private BaseClass[] SynchronousMachineTimeConstantReactance_class_attributes;
    private BaseClass[] SynchronousMachineTimeConstantReactance_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new SynchronousMachineTimeConstantReactance().getAttributeNamesMap();
    }

    private enum SynchronousMachineTimeConstantReactance_primitive_builder implements PrimitiveBuilder {
        ks() {
            public BaseClass construct(java.lang.String value) {
                return new Float(value);
            }
        },
        modelType() {
            public BaseClass construct(java.lang.String value) {
                return new SynchronousMachineModelKind(value);
            }
        },
        rotorType() {
            public BaseClass construct(java.lang.String value) {
                return new RotorKind(value);
            }
        },
        tc() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tpdo() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tppdo() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tppqo() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tpqo() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        xDirectSubtrans() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        xDirectSync() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        xDirectTrans() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        xQuadSubtrans() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        xQuadSync() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        xQuadTrans() {
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

    private enum SynchronousMachineTimeConstantReactance_class_attributes_enum {
        ks,
        modelType,
        rotorType,
        tc,
        tpdo,
        tppdo,
        tppqo,
        tpqo,
        xDirectSubtrans,
        xDirectSync,
        xDirectTrans,
        xQuadSubtrans,
        xQuadSync,
        xQuadTrans,
        LAST_ENUM
    }

    public SynchronousMachineTimeConstantReactance() {
        SynchronousMachineTimeConstantReactance_primitive_attributes = new BaseClass[SynchronousMachineTimeConstantReactance_primitive_builder.values().length];
        SynchronousMachineTimeConstantReactance_class_attributes = new BaseClass[SynchronousMachineTimeConstantReactance_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new SynchronousMachineTimeConstantReactance();
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

    private void updateAttributeInArray(SynchronousMachineTimeConstantReactance_class_attributes_enum attrEnum, BaseClass value) {
        try {
            SynchronousMachineTimeConstantReactance_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(SynchronousMachineTimeConstantReactance_primitive_builder attrEnum, BaseClass value) {
        try {
            SynchronousMachineTimeConstantReactance_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            SynchronousMachineTimeConstantReactance_class_attributes_enum attrEnum = SynchronousMachineTimeConstantReactance_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated SynchronousMachineTimeConstantReactance, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            SynchronousMachineTimeConstantReactance_primitive_builder attrEnum = SynchronousMachineTimeConstantReactance_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated SynchronousMachineTimeConstantReactance, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            SynchronousMachineTimeConstantReactance_primitive_builder attrEnum = SynchronousMachineTimeConstantReactance_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = SynchronousMachineTimeConstantReactance_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            SynchronousMachineTimeConstantReactance_class_attributes_enum attrEnum = SynchronousMachineTimeConstantReactance_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = SynchronousMachineTimeConstantReactance_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : SynchronousMachineTimeConstantReactance_primitive_builder.values()) {
            if (enumValue != SynchronousMachineTimeConstantReactance_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "SynchronousMachineTimeConstantReactance." + enumValue.name());
            }
        }
        for (var enumValue : SynchronousMachineTimeConstantReactance_class_attributes_enum.values()) {
            if (enumValue != SynchronousMachineTimeConstantReactance_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "SynchronousMachineTimeConstantReactance." + enumValue.name());
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
            for (SynchronousMachineTimeConstantReactance_primitive_builder attrEnum : SynchronousMachineTimeConstantReactance_primitive_builder.values()) {
                BaseClass bc = SynchronousMachineTimeConstantReactance_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    SynchronousMachineTimeConstantReactance." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (SynchronousMachineTimeConstantReactance_class_attributes_enum attrEnum : SynchronousMachineTimeConstantReactance_class_attributes_enum.values()) {
                BaseClass bc = SynchronousMachineTimeConstantReactance_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    SynchronousMachineTimeConstantReactance." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(SynchronousMachineTimeConstantReactance) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "SynchronousMachineTimeConstantReactance";

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
        ATTR_NAMESPACE_MAP = new SynchronousMachineTimeConstantReactance().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("ks", "http://iec.ch/TC57/CIM100#"),
            Map.entry("modelType", "http://iec.ch/TC57/CIM100#"),
            Map.entry("rotorType", "http://iec.ch/TC57/CIM100#"),
            Map.entry("tc", "http://iec.ch/TC57/CIM100#"),
            Map.entry("tpdo", "http://iec.ch/TC57/CIM100#"),
            Map.entry("tppdo", "http://iec.ch/TC57/CIM100#"),
            Map.entry("tppqo", "http://iec.ch/TC57/CIM100#"),
            Map.entry("tpqo", "http://iec.ch/TC57/CIM100#"),
            Map.entry("xDirectSubtrans", "http://iec.ch/TC57/CIM100#"),
            Map.entry("xDirectSync", "http://iec.ch/TC57/CIM100#"),
            Map.entry("xDirectTrans", "http://iec.ch/TC57/CIM100#"),
            Map.entry("xQuadSubtrans", "http://iec.ch/TC57/CIM100#"),
            Map.entry("xQuadSync", "http://iec.ch/TC57/CIM100#"),
            Map.entry("xQuadTrans", "http://iec.ch/TC57/CIM100#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
