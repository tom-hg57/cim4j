/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * CSC function block whose behaviour is described by reference to a standard model <font color="#0f0f0f">or by definition of a user-defined model.</font>
 */
public class CSCDynamics extends HVDCDynamics {

    private static final Logging LOG = Logging.getLogger(CSCDynamics.class);

    private BaseClass[] CSCDynamics_class_attributes;
    private BaseClass[] CSCDynamics_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new CSCDynamics().getAttributeNamesMap();
    }

    private enum CSCDynamics_primitive_builder implements PrimitiveBuilder {
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum CSCDynamics_class_attributes_enum {
        CSConverter,
        LAST_ENUM
    }

    public CSCDynamics() {
        CSCDynamics_primitive_attributes = new BaseClass[CSCDynamics_primitive_builder.values().length];
        CSCDynamics_class_attributes = new BaseClass[CSCDynamics_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new CSCDynamics();
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

    private void updateAttributeInArray(CSCDynamics_class_attributes_enum attrEnum, BaseClass value) {
        try {
            CSCDynamics_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(CSCDynamics_primitive_builder attrEnum, BaseClass value) {
        try {
            CSCDynamics_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            CSCDynamics_class_attributes_enum attrEnum = CSCDynamics_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated CSCDynamics, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            CSCDynamics_primitive_builder attrEnum = CSCDynamics_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated CSCDynamics, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            CSCDynamics_primitive_builder attrEnum = CSCDynamics_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = CSCDynamics_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            CSCDynamics_class_attributes_enum attrEnum = CSCDynamics_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = CSCDynamics_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : CSCDynamics_primitive_builder.values()) {
            if (enumValue != CSCDynamics_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "CSCDynamics." + enumValue.name());
            }
        }
        for (var enumValue : CSCDynamics_class_attributes_enum.values()) {
            if (enumValue != CSCDynamics_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "CSCDynamics." + enumValue.name());
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
            for (CSCDynamics_primitive_builder attrEnum : CSCDynamics_primitive_builder.values()) {
                BaseClass bc = CSCDynamics_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    CSCDynamics." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (CSCDynamics_class_attributes_enum attrEnum : CSCDynamics_class_attributes_enum.values()) {
                BaseClass bc = CSCDynamics_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    CSCDynamics." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(CSCDynamics) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "CSCDynamics";

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
        ATTR_NAMESPACE_MAP = new CSCDynamics().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("CSConverter", "http://iec.ch/TC57/CIM100#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
