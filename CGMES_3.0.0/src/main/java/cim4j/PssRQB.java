/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Power system stabilizer type RQB. This power system stabilizer is intended to be used together with excitation system type ExcRQB, which is primarily used in nuclear or thermal generating units.
 */
public class PssRQB extends PowerSystemStabilizerDynamics {

    private static final Logging LOG = Logging.getLogger(PssRQB.class);

    private BaseClass[] PssRQB_class_attributes;
    private BaseClass[] PssRQB_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new PssRQB().getAttributeNamesMap();
    }

    private enum PssRQB_primitive_builder implements PrimitiveBuilder {
        kdpm() {
            public BaseClass construct(java.lang.String value) {
                return new Float(value);
            }
        },
        ki2() {
            public BaseClass construct(java.lang.String value) {
                return new Float(value);
            }
        },
        ki3() {
            public BaseClass construct(java.lang.String value) {
                return new Float(value);
            }
        },
        ki4() {
            public BaseClass construct(java.lang.String value) {
                return new Float(value);
            }
        },
        sibv() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        t4f() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        t4m() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        t4mom() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tomd() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tomsl() {
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

    private enum PssRQB_class_attributes_enum {
        kdpm,
        ki2,
        ki3,
        ki4,
        sibv,
        t4f,
        t4m,
        t4mom,
        tomd,
        tomsl,
        LAST_ENUM
    }

    public PssRQB() {
        PssRQB_primitive_attributes = new BaseClass[PssRQB_primitive_builder.values().length];
        PssRQB_class_attributes = new BaseClass[PssRQB_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new PssRQB();
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

    private void updateAttributeInArray(PssRQB_class_attributes_enum attrEnum, BaseClass value) {
        try {
            PssRQB_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(PssRQB_primitive_builder attrEnum, BaseClass value) {
        try {
            PssRQB_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            PssRQB_class_attributes_enum attrEnum = PssRQB_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated PssRQB, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            PssRQB_primitive_builder attrEnum = PssRQB_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated PssRQB, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            PssRQB_primitive_builder attrEnum = PssRQB_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = PssRQB_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            PssRQB_class_attributes_enum attrEnum = PssRQB_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = PssRQB_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : PssRQB_primitive_builder.values()) {
            if (enumValue != PssRQB_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "PssRQB." + enumValue.name());
            }
        }
        for (var enumValue : PssRQB_class_attributes_enum.values()) {
            if (enumValue != PssRQB_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "PssRQB." + enumValue.name());
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
            for (PssRQB_primitive_builder attrEnum : PssRQB_primitive_builder.values()) {
                BaseClass bc = PssRQB_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    PssRQB." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (PssRQB_class_attributes_enum attrEnum : PssRQB_class_attributes_enum.values()) {
                BaseClass bc = PssRQB_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    PssRQB." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(PssRQB) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "PssRQB";

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
        ATTR_NAMESPACE_MAP = new PssRQB().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("kdpm", "http://iec.ch/TC57/CIM100#"),
            Map.entry("ki2", "http://iec.ch/TC57/CIM100#"),
            Map.entry("ki3", "http://iec.ch/TC57/CIM100#"),
            Map.entry("ki4", "http://iec.ch/TC57/CIM100#"),
            Map.entry("sibv", "http://iec.ch/TC57/CIM100#"),
            Map.entry("t4f", "http://iec.ch/TC57/CIM100#"),
            Map.entry("t4m", "http://iec.ch/TC57/CIM100#"),
            Map.entry("t4mom", "http://iec.ch/TC57/CIM100#"),
            Map.entry("tomd", "http://iec.ch/TC57/CIM100#"),
            Map.entry("tomsl", "http://iec.ch/TC57/CIM100#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
