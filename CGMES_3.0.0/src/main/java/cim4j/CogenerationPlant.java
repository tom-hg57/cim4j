/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * A set of thermal generating units for the production of electrical energy and process steam (usually from the output of the steam turbines). The steam sendout is typically used for industrial purposes or for municipal heating and cooling.
 */
public class CogenerationPlant extends PowerSystemResource {

    private static final Logging LOG = Logging.getLogger(CogenerationPlant.class);

    private BaseClass[] CogenerationPlant_class_attributes;
    private BaseClass[] CogenerationPlant_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new CogenerationPlant().getAttributeNamesMap();
    }

    private enum CogenerationPlant_primitive_builder implements PrimitiveBuilder {
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum CogenerationPlant_class_attributes_enum {
        ThermalGeneratingUnits,
        LAST_ENUM
    }

    public CogenerationPlant() {
        CogenerationPlant_primitive_attributes = new BaseClass[CogenerationPlant_primitive_builder.values().length];
        CogenerationPlant_class_attributes = new BaseClass[CogenerationPlant_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new CogenerationPlant();
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

    private void updateAttributeInArray(CogenerationPlant_class_attributes_enum attrEnum, BaseClass value) {
        try {
            CogenerationPlant_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(CogenerationPlant_primitive_builder attrEnum, BaseClass value) {
        try {
            CogenerationPlant_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            CogenerationPlant_class_attributes_enum attrEnum = CogenerationPlant_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated CogenerationPlant, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            CogenerationPlant_primitive_builder attrEnum = CogenerationPlant_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated CogenerationPlant, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            CogenerationPlant_primitive_builder attrEnum = CogenerationPlant_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = CogenerationPlant_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            CogenerationPlant_class_attributes_enum attrEnum = CogenerationPlant_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = CogenerationPlant_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : CogenerationPlant_primitive_builder.values()) {
            if (enumValue != CogenerationPlant_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "CogenerationPlant." + enumValue.name());
            }
        }
        for (var enumValue : CogenerationPlant_class_attributes_enum.values()) {
            if (enumValue != CogenerationPlant_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "CogenerationPlant." + enumValue.name());
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
            for (CogenerationPlant_primitive_builder attrEnum : CogenerationPlant_primitive_builder.values()) {
                BaseClass bc = CogenerationPlant_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    CogenerationPlant." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (CogenerationPlant_class_attributes_enum attrEnum : CogenerationPlant_class_attributes_enum.values()) {
                BaseClass bc = CogenerationPlant_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    CogenerationPlant." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(CogenerationPlant) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "CogenerationPlant";

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
        ATTR_NAMESPACE_MAP = new CogenerationPlant().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("ThermalGeneratingUnits", "http://iec.ch/TC57/CIM100#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
