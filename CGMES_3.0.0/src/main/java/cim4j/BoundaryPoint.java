/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Designates a connection point at which one or more model authority sets shall connect to. The location of the connection point as well as other properties are agreed between organisations responsible for the interconnection, hence all attributes of the class represent this agreement.  It is primarily used in a boundary model authority set which can contain one or many BoundaryPoint-s among other Equipment-s and their connections.
 */
public class BoundaryPoint extends PowerSystemResource {

    private static final Logging LOG = Logging.getLogger(BoundaryPoint.class);

    private BaseClass[] BoundaryPoint_class_attributes;
    private BaseClass[] BoundaryPoint_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new BoundaryPoint().getAttributeNamesMap();
    }

    private enum BoundaryPoint_primitive_builder implements PrimitiveBuilder {
        fromEndIsoCode() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        fromEndName() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        fromEndNameTso() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        isDirectCurrent() {
            public BaseClass construct(java.lang.String value) {
                return new Boolean(value);
            }
        },
        isExcludedFromAreaInterchange() {
            public BaseClass construct(java.lang.String value) {
                return new Boolean(value);
            }
        },
        toEndIsoCode() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        toEndName() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        toEndNameTso() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum BoundaryPoint_class_attributes_enum {
        ConnectivityNode,
        fromEndIsoCode,
        fromEndName,
        fromEndNameTso,
        isDirectCurrent,
        isExcludedFromAreaInterchange,
        toEndIsoCode,
        toEndName,
        toEndNameTso,
        LAST_ENUM
    }

    public BoundaryPoint() {
        BoundaryPoint_primitive_attributes = new BaseClass[BoundaryPoint_primitive_builder.values().length];
        BoundaryPoint_class_attributes = new BaseClass[BoundaryPoint_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new BoundaryPoint();
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

    private void updateAttributeInArray(BoundaryPoint_class_attributes_enum attrEnum, BaseClass value) {
        try {
            BoundaryPoint_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(BoundaryPoint_primitive_builder attrEnum, BaseClass value) {
        try {
            BoundaryPoint_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            BoundaryPoint_class_attributes_enum attrEnum = BoundaryPoint_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated BoundaryPoint, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            BoundaryPoint_primitive_builder attrEnum = BoundaryPoint_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated BoundaryPoint, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            BoundaryPoint_primitive_builder attrEnum = BoundaryPoint_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = BoundaryPoint_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            BoundaryPoint_class_attributes_enum attrEnum = BoundaryPoint_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = BoundaryPoint_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : BoundaryPoint_primitive_builder.values()) {
            if (enumValue != BoundaryPoint_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "BoundaryPoint." + enumValue.name());
            }
        }
        for (var enumValue : BoundaryPoint_class_attributes_enum.values()) {
            if (enumValue != BoundaryPoint_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "BoundaryPoint." + enumValue.name());
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
            for (BoundaryPoint_primitive_builder attrEnum : BoundaryPoint_primitive_builder.values()) {
                BaseClass bc = BoundaryPoint_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    BoundaryPoint." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (BoundaryPoint_class_attributes_enum attrEnum : BoundaryPoint_class_attributes_enum.values()) {
                BaseClass bc = BoundaryPoint_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    BoundaryPoint." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(BoundaryPoint) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "BoundaryPoint";

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
        return "http://iec.ch/TC57/CIM100-European#";
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
        ATTR_NAMESPACE_MAP = new BoundaryPoint().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("ConnectivityNode", "http://iec.ch/TC57/CIM100-European#"),
            Map.entry("fromEndIsoCode", "http://iec.ch/TC57/CIM100-European#"),
            Map.entry("fromEndName", "http://iec.ch/TC57/CIM100-European#"),
            Map.entry("fromEndNameTso", "http://iec.ch/TC57/CIM100-European#"),
            Map.entry("isDirectCurrent", "http://iec.ch/TC57/CIM100-European#"),
            Map.entry("isExcludedFromAreaInterchange", "http://iec.ch/TC57/CIM100-European#"),
            Map.entry("toEndIsoCode", "http://iec.ch/TC57/CIM100-European#"),
            Map.entry("toEndName", "http://iec.ch/TC57/CIM100-European#"),
            Map.entry("toEndNameTso", "http://iec.ch/TC57/CIM100-European#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
