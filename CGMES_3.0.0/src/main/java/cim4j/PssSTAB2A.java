/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Power system stabilizer part of an ABB excitation system. [Footnote: ABB excitation systems are an example of suitable products available commercially. This information is given for the convenience of users of this document and does not constitute an endorsement by IEC of these products.]
 */
public class PssSTAB2A extends PowerSystemStabilizerDynamics {

    private static final Logging LOG = Logging.getLogger(PssSTAB2A.class);

    private BaseClass[] PssSTAB2A_class_attributes;
    private BaseClass[] PssSTAB2A_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new PssSTAB2A().getAttributeNamesMap();
    }

    private enum PssSTAB2A_primitive_builder implements PrimitiveBuilder {
        hlim() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        k2() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        k3() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        k4() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        k5() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        t2() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        t3() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        t5() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum PssSTAB2A_class_attributes_enum {
        hlim,
        k2,
        k3,
        k4,
        k5,
        t2,
        t3,
        t5,
        LAST_ENUM
    }

    public PssSTAB2A() {
        PssSTAB2A_primitive_attributes = new BaseClass[PssSTAB2A_primitive_builder.values().length];
        PssSTAB2A_class_attributes = new BaseClass[PssSTAB2A_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new PssSTAB2A();
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

    private void updateAttributeInArray(PssSTAB2A_class_attributes_enum attrEnum, BaseClass value) {
        try {
            PssSTAB2A_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(PssSTAB2A_primitive_builder attrEnum, BaseClass value) {
        try {
            PssSTAB2A_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            PssSTAB2A_class_attributes_enum attrEnum = PssSTAB2A_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated PssSTAB2A, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            PssSTAB2A_primitive_builder attrEnum = PssSTAB2A_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated PssSTAB2A, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            PssSTAB2A_primitive_builder attrEnum = PssSTAB2A_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = PssSTAB2A_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            PssSTAB2A_class_attributes_enum attrEnum = PssSTAB2A_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = PssSTAB2A_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : PssSTAB2A_primitive_builder.values()) {
            if (enumValue != PssSTAB2A_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "PssSTAB2A." + enumValue.name());
            }
        }
        for (var enumValue : PssSTAB2A_class_attributes_enum.values()) {
            if (enumValue != PssSTAB2A_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "PssSTAB2A." + enumValue.name());
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
            for (PssSTAB2A_primitive_builder attrEnum : PssSTAB2A_primitive_builder.values()) {
                BaseClass bc = PssSTAB2A_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    PssSTAB2A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (PssSTAB2A_class_attributes_enum attrEnum : PssSTAB2A_class_attributes_enum.values()) {
                BaseClass bc = PssSTAB2A_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    PssSTAB2A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(PssSTAB2A) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "PssSTAB2A";

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
        ATTR_NAMESPACE_MAP = new PssSTAB2A().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("hlim", "http://iec.ch/TC57/CIM100#"),
            Map.entry("k2", "http://iec.ch/TC57/CIM100#"),
            Map.entry("k3", "http://iec.ch/TC57/CIM100#"),
            Map.entry("k4", "http://iec.ch/TC57/CIM100#"),
            Map.entry("k5", "http://iec.ch/TC57/CIM100#"),
            Map.entry("t2", "http://iec.ch/TC57/CIM100#"),
            Map.entry("t3", "http://iec.ch/TC57/CIM100#"),
            Map.entry("t5", "http://iec.ch/TC57/CIM100#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
