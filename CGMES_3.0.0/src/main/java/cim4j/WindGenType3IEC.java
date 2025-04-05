/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Parent class supporting relationships to IEC wind turbines type 3 generator models of IEC type 3A and 3B.
 */
public class WindGenType3IEC extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(WindGenType3IEC.class);

    private BaseClass[] WindGenType3IEC_class_attributes;
    private BaseClass[] WindGenType3IEC_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new WindGenType3IEC().getAttributeNamesMap();
    }

    private enum WindGenType3IEC_primitive_builder implements PrimitiveBuilder {
        dipmax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        diqmax() {
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

    private enum WindGenType3IEC_class_attributes_enum {
        WindTurbineType3IEC,
        dipmax,
        diqmax,
        xs,
        LAST_ENUM
    }

    public WindGenType3IEC() {
        WindGenType3IEC_primitive_attributes = new BaseClass[WindGenType3IEC_primitive_builder.values().length];
        WindGenType3IEC_class_attributes = new BaseClass[WindGenType3IEC_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new WindGenType3IEC();
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

    private void updateAttributeInArray(WindGenType3IEC_class_attributes_enum attrEnum, BaseClass value) {
        try {
            WindGenType3IEC_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(WindGenType3IEC_primitive_builder attrEnum, BaseClass value) {
        try {
            WindGenType3IEC_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            WindGenType3IEC_class_attributes_enum attrEnum = WindGenType3IEC_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated WindGenType3IEC, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            WindGenType3IEC_primitive_builder attrEnum = WindGenType3IEC_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated WindGenType3IEC, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            WindGenType3IEC_primitive_builder attrEnum = WindGenType3IEC_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = WindGenType3IEC_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            WindGenType3IEC_class_attributes_enum attrEnum = WindGenType3IEC_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = WindGenType3IEC_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : WindGenType3IEC_primitive_builder.values()) {
            if (enumValue != WindGenType3IEC_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "WindGenType3IEC." + enumValue.name());
            }
        }
        for (var enumValue : WindGenType3IEC_class_attributes_enum.values()) {
            if (enumValue != WindGenType3IEC_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "WindGenType3IEC." + enumValue.name());
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
            for (WindGenType3IEC_primitive_builder attrEnum : WindGenType3IEC_primitive_builder.values()) {
                BaseClass bc = WindGenType3IEC_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    WindGenType3IEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (WindGenType3IEC_class_attributes_enum attrEnum : WindGenType3IEC_class_attributes_enum.values()) {
                BaseClass bc = WindGenType3IEC_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    WindGenType3IEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(WindGenType3IEC) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "WindGenType3IEC";

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
        ATTR_NAMESPACE_MAP = new WindGenType3IEC().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("WindTurbineType3IEC", "http://iec.ch/TC57/CIM100#"),
            Map.entry("dipmax", "http://iec.ch/TC57/CIM100#"),
            Map.entry("diqmax", "http://iec.ch/TC57/CIM100#"),
            Map.entry("xs", "http://iec.ch/TC57/CIM100#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
