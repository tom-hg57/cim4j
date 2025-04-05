/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * An electrochemical energy storage device.
 */
public class BatteryUnit extends PowerElectronicsUnit {

    private static final Logging LOG = Logging.getLogger(BatteryUnit.class);

    private BaseClass[] BatteryUnit_class_attributes;
    private BaseClass[] BatteryUnit_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new BatteryUnit().getAttributeNamesMap();
    }

    private enum BatteryUnit_primitive_builder implements PrimitiveBuilder {
        batteryState() {
            public BaseClass construct(java.lang.String value) {
                return new BatteryStateKind(value);
            }
        },
        ratedE() {
            public BaseClass construct(java.lang.String value) {
                return new RealEnergy(value);
            }
        },
        storedE() {
            public BaseClass construct(java.lang.String value) {
                return new RealEnergy(value);
            }
        },
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum BatteryUnit_class_attributes_enum {
        batteryState,
        ratedE,
        storedE,
        LAST_ENUM
    }

    public BatteryUnit() {
        BatteryUnit_primitive_attributes = new BaseClass[BatteryUnit_primitive_builder.values().length];
        BatteryUnit_class_attributes = new BaseClass[BatteryUnit_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new BatteryUnit();
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

    private void updateAttributeInArray(BatteryUnit_class_attributes_enum attrEnum, BaseClass value) {
        try {
            BatteryUnit_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(BatteryUnit_primitive_builder attrEnum, BaseClass value) {
        try {
            BatteryUnit_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            BatteryUnit_class_attributes_enum attrEnum = BatteryUnit_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated BatteryUnit, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            BatteryUnit_primitive_builder attrEnum = BatteryUnit_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated BatteryUnit, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            BatteryUnit_primitive_builder attrEnum = BatteryUnit_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = BatteryUnit_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            BatteryUnit_class_attributes_enum attrEnum = BatteryUnit_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = BatteryUnit_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : BatteryUnit_primitive_builder.values()) {
            if (enumValue != BatteryUnit_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "BatteryUnit." + enumValue.name());
            }
        }
        for (var enumValue : BatteryUnit_class_attributes_enum.values()) {
            if (enumValue != BatteryUnit_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "BatteryUnit." + enumValue.name());
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
            for (BatteryUnit_primitive_builder attrEnum : BatteryUnit_primitive_builder.values()) {
                BaseClass bc = BatteryUnit_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    BatteryUnit." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (BatteryUnit_class_attributes_enum attrEnum : BatteryUnit_class_attributes_enum.values()) {
                BaseClass bc = BatteryUnit_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    BatteryUnit." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(BatteryUnit) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "BatteryUnit";

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
        ATTR_NAMESPACE_MAP = new BatteryUnit().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("batteryState", "http://iec.ch/TC57/CIM100#"),
            Map.entry("ratedE", "http://iec.ch/TC57/CIM100#"),
            Map.entry("storedE", "http://iec.ch/TC57/CIM100#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
