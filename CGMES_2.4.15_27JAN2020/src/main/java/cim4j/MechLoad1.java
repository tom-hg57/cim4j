/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Mechanical load model type 1.
 */
public class MechLoad1 extends MechanicalLoadDynamics {

    private static final Logging LOG = Logging.getLogger(MechLoad1.class);

    private BaseClass[] MechLoad1_class_attributes;
    private BaseClass[] MechLoad1_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new MechLoad1().getAttributeNamesMap();
    }

    private enum MechLoad1_primitive_builder implements PrimitiveBuilder {
        a() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        b() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        d() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        e() {
            public BaseClass construct(java.lang.String value) {
                return new Simple_Float(value);
            }
        },
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum MechLoad1_class_attributes_enum {
        a,
        b,
        d,
        e,
        LAST_ENUM
    }

    public MechLoad1() {
        MechLoad1_primitive_attributes = new BaseClass[MechLoad1_primitive_builder.values().length];
        MechLoad1_class_attributes = new BaseClass[MechLoad1_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new MechLoad1();
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

    private void updateAttributeInArray(MechLoad1_class_attributes_enum attrEnum, BaseClass value) {
        try {
            MechLoad1_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(MechLoad1_primitive_builder attrEnum, BaseClass value) {
        try {
            MechLoad1_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            MechLoad1_class_attributes_enum attrEnum = MechLoad1_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated MechLoad1, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            MechLoad1_primitive_builder attrEnum = MechLoad1_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated MechLoad1, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            MechLoad1_primitive_builder attrEnum = MechLoad1_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = MechLoad1_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            MechLoad1_class_attributes_enum attrEnum = MechLoad1_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = MechLoad1_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : MechLoad1_primitive_builder.values()) {
            if (enumValue != MechLoad1_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "MechLoad1." + enumValue.name());
            }
        }
        for (var enumValue : MechLoad1_class_attributes_enum.values()) {
            if (enumValue != MechLoad1_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "MechLoad1." + enumValue.name());
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
            for (MechLoad1_primitive_builder attrEnum : MechLoad1_primitive_builder.values()) {
                BaseClass bc = MechLoad1_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    MechLoad1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (MechLoad1_class_attributes_enum attrEnum : MechLoad1_class_attributes_enum.values()) {
                BaseClass bc = MechLoad1_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    MechLoad1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(MechLoad1) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "MechLoad1";

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
        return "http://iec.ch/TC57/2013/CIM-schema-cim16#";
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
        ATTR_NAMESPACE_MAP = new MechLoad1().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("a", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("b", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("d", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("e", "http://iec.ch/TC57/2013/CIM-schema-cim16#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
