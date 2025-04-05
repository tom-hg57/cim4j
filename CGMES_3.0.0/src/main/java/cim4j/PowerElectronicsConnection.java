/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * A connection to the AC network for energy production or consumption that uses power electronics rather than rotating machines.
 */
public class PowerElectronicsConnection extends RegulatingCondEq {

    private static final Logging LOG = Logging.getLogger(PowerElectronicsConnection.class);

    private BaseClass[] PowerElectronicsConnection_class_attributes;
    private BaseClass[] PowerElectronicsConnection_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new PowerElectronicsConnection().getAttributeNamesMap();
    }

    private enum PowerElectronicsConnection_primitive_builder implements PrimitiveBuilder {
        maxQ() {
            public BaseClass construct(java.lang.String value) {
                return new ReactivePower(value);
            }
        },
        minQ() {
            public BaseClass construct(java.lang.String value) {
                return new ReactivePower(value);
            }
        },
        p() {
            public BaseClass construct(java.lang.String value) {
                return new ActivePower(value);
            }
        },
        q() {
            public BaseClass construct(java.lang.String value) {
                return new ReactivePower(value);
            }
        },
        ratedS() {
            public BaseClass construct(java.lang.String value) {
                return new ApparentPower(value);
            }
        },
        ratedU() {
            public BaseClass construct(java.lang.String value) {
                return new Voltage(value);
            }
        },
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum PowerElectronicsConnection_class_attributes_enum {
        PowerElectronicsUnit,
        WindTurbineType3or4Dynamics,
        maxQ,
        minQ,
        p,
        q,
        ratedS,
        ratedU,
        LAST_ENUM
    }

    public PowerElectronicsConnection() {
        PowerElectronicsConnection_primitive_attributes = new BaseClass[PowerElectronicsConnection_primitive_builder.values().length];
        PowerElectronicsConnection_class_attributes = new BaseClass[PowerElectronicsConnection_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new PowerElectronicsConnection();
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

    private void updateAttributeInArray(PowerElectronicsConnection_class_attributes_enum attrEnum, BaseClass value) {
        try {
            PowerElectronicsConnection_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(PowerElectronicsConnection_primitive_builder attrEnum, BaseClass value) {
        try {
            PowerElectronicsConnection_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            PowerElectronicsConnection_class_attributes_enum attrEnum = PowerElectronicsConnection_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated PowerElectronicsConnection, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            PowerElectronicsConnection_primitive_builder attrEnum = PowerElectronicsConnection_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated PowerElectronicsConnection, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            PowerElectronicsConnection_primitive_builder attrEnum = PowerElectronicsConnection_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = PowerElectronicsConnection_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            PowerElectronicsConnection_class_attributes_enum attrEnum = PowerElectronicsConnection_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = PowerElectronicsConnection_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : PowerElectronicsConnection_primitive_builder.values()) {
            if (enumValue != PowerElectronicsConnection_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "PowerElectronicsConnection." + enumValue.name());
            }
        }
        for (var enumValue : PowerElectronicsConnection_class_attributes_enum.values()) {
            if (enumValue != PowerElectronicsConnection_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "PowerElectronicsConnection." + enumValue.name());
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
            for (PowerElectronicsConnection_primitive_builder attrEnum : PowerElectronicsConnection_primitive_builder.values()) {
                BaseClass bc = PowerElectronicsConnection_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    PowerElectronicsConnection." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (PowerElectronicsConnection_class_attributes_enum attrEnum : PowerElectronicsConnection_class_attributes_enum.values()) {
                BaseClass bc = PowerElectronicsConnection_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    PowerElectronicsConnection." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(PowerElectronicsConnection) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "PowerElectronicsConnection";

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
        ATTR_NAMESPACE_MAP = new PowerElectronicsConnection().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("PowerElectronicsUnit", "http://iec.ch/TC57/CIM100#"),
            Map.entry("WindTurbineType3or4Dynamics", "http://iec.ch/TC57/CIM100#"),
            Map.entry("maxQ", "http://iec.ch/TC57/CIM100#"),
            Map.entry("minQ", "http://iec.ch/TC57/CIM100#"),
            Map.entry("p", "http://iec.ch/TC57/CIM100#"),
            Map.entry("q", "http://iec.ch/TC57/CIM100#"),
            Map.entry("ratedS", "http://iec.ch/TC57/CIM100#"),
            Map.entry("ratedU", "http://iec.ch/TC57/CIM100#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
