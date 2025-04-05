/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * A connection of energy generation or consumption on the power system model.
 */
public class EnergyConnection extends ConductingEquipment {

    private static final Logging LOG = Logging.getLogger(EnergyConnection.class);

    private BaseClass[] EnergyConnection_class_attributes;
    private BaseClass[] EnergyConnection_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new EnergyConnection().getAttributeNamesMap();
    }

    private enum EnergyConnection_primitive_builder implements PrimitiveBuilder {
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum EnergyConnection_class_attributes_enum {
        LAST_ENUM
    }

    public EnergyConnection() {
        EnergyConnection_primitive_attributes = new BaseClass[EnergyConnection_primitive_builder.values().length];
        EnergyConnection_class_attributes = new BaseClass[EnergyConnection_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new EnergyConnection();
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

    private void updateAttributeInArray(EnergyConnection_class_attributes_enum attrEnum, BaseClass value) {
        try {
            EnergyConnection_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(EnergyConnection_primitive_builder attrEnum, BaseClass value) {
        try {
            EnergyConnection_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            EnergyConnection_class_attributes_enum attrEnum = EnergyConnection_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated EnergyConnection, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            EnergyConnection_primitive_builder attrEnum = EnergyConnection_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated EnergyConnection, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            EnergyConnection_primitive_builder attrEnum = EnergyConnection_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = EnergyConnection_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            EnergyConnection_class_attributes_enum attrEnum = EnergyConnection_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = EnergyConnection_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : EnergyConnection_primitive_builder.values()) {
            if (enumValue != EnergyConnection_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "EnergyConnection." + enumValue.name());
            }
        }
        for (var enumValue : EnergyConnection_class_attributes_enum.values()) {
            if (enumValue != EnergyConnection_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "EnergyConnection." + enumValue.name());
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
            for (EnergyConnection_primitive_builder attrEnum : EnergyConnection_primitive_builder.values()) {
                BaseClass bc = EnergyConnection_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    EnergyConnection." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (EnergyConnection_class_attributes_enum attrEnum : EnergyConnection_class_attributes_enum.values()) {
                BaseClass bc = EnergyConnection_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    EnergyConnection." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(EnergyConnection) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "EnergyConnection";

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
        ATTR_NAMESPACE_MAP = new EnergyConnection().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("LAST_ATTRIBUTE", ""));
}
