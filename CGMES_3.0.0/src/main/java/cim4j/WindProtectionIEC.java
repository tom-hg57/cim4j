/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * The grid protection model includes protection against over- and under-voltage, and against over- and under-frequency. Reference: IEC 61400-27-1:2015, 5.6.6.
 */
public class WindProtectionIEC extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(WindProtectionIEC.class);

    private BaseClass[] WindProtectionIEC_class_attributes;
    private BaseClass[] WindProtectionIEC_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new WindProtectionIEC().getAttributeNamesMap();
    }

    private enum WindProtectionIEC_primitive_builder implements PrimitiveBuilder {
        dfimax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        fover() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        funder() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        mzc() {
            public BaseClass construct(java.lang.String value) {
                return new Boolean(value);
            }
        },
        tfma() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        uover() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        uunder() {
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

    private enum WindProtectionIEC_class_attributes_enum {
        WindDynamicsLookupTable,
        WindTurbineType1or2IEC,
        WindTurbineType3or4IEC,
        dfimax,
        fover,
        funder,
        mzc,
        tfma,
        uover,
        uunder,
        LAST_ENUM
    }

    public WindProtectionIEC() {
        WindProtectionIEC_primitive_attributes = new BaseClass[WindProtectionIEC_primitive_builder.values().length];
        WindProtectionIEC_class_attributes = new BaseClass[WindProtectionIEC_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new WindProtectionIEC();
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

    private void updateAttributeInArray(WindProtectionIEC_class_attributes_enum attrEnum, BaseClass value) {
        try {
            WindProtectionIEC_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(WindProtectionIEC_primitive_builder attrEnum, BaseClass value) {
        try {
            WindProtectionIEC_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            WindProtectionIEC_class_attributes_enum attrEnum = WindProtectionIEC_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated WindProtectionIEC, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            WindProtectionIEC_primitive_builder attrEnum = WindProtectionIEC_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated WindProtectionIEC, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            WindProtectionIEC_primitive_builder attrEnum = WindProtectionIEC_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = WindProtectionIEC_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            WindProtectionIEC_class_attributes_enum attrEnum = WindProtectionIEC_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = WindProtectionIEC_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : WindProtectionIEC_primitive_builder.values()) {
            if (enumValue != WindProtectionIEC_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "WindProtectionIEC." + enumValue.name());
            }
        }
        for (var enumValue : WindProtectionIEC_class_attributes_enum.values()) {
            if (enumValue != WindProtectionIEC_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "WindProtectionIEC." + enumValue.name());
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
            for (WindProtectionIEC_primitive_builder attrEnum : WindProtectionIEC_primitive_builder.values()) {
                BaseClass bc = WindProtectionIEC_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    WindProtectionIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (WindProtectionIEC_class_attributes_enum attrEnum : WindProtectionIEC_class_attributes_enum.values()) {
                BaseClass bc = WindProtectionIEC_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    WindProtectionIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(WindProtectionIEC) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "WindProtectionIEC";

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
        ATTR_NAMESPACE_MAP = new WindProtectionIEC().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("WindDynamicsLookupTable", "http://iec.ch/TC57/CIM100#"),
            Map.entry("WindTurbineType1or2IEC", "http://iec.ch/TC57/CIM100#"),
            Map.entry("WindTurbineType3or4IEC", "http://iec.ch/TC57/CIM100#"),
            Map.entry("dfimax", "http://iec.ch/TC57/CIM100#"),
            Map.entry("fover", "http://iec.ch/TC57/CIM100#"),
            Map.entry("funder", "http://iec.ch/TC57/CIM100#"),
            Map.entry("mzc", "http://iec.ch/TC57/CIM100#"),
            Map.entry("tfma", "http://iec.ch/TC57/CIM100#"),
            Map.entry("uover", "http://iec.ch/TC57/CIM100#"),
            Map.entry("uunder", "http://iec.ch/TC57/CIM100#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
