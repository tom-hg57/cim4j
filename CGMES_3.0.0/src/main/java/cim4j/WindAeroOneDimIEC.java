/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * One-dimensional aerodynamic model.   Reference: IEC 61400-27-1:2015, 5.6.1.2.
 */
public class WindAeroOneDimIEC extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(WindAeroOneDimIEC.class);

    private BaseClass[] WindAeroOneDimIEC_class_attributes;
    private BaseClass[] WindAeroOneDimIEC_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new WindAeroOneDimIEC().getAttributeNamesMap();
    }

    private enum WindAeroOneDimIEC_primitive_builder implements PrimitiveBuilder {
        ka() {
            public BaseClass construct(java.lang.String value) {
                return new Float(value);
            }
        },
        thetaomega() {
            public BaseClass construct(java.lang.String value) {
                return new AngleDegrees(value);
            }
        },
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum WindAeroOneDimIEC_class_attributes_enum {
        WindTurbineType3IEC,
        ka,
        thetaomega,
        LAST_ENUM
    }

    public WindAeroOneDimIEC() {
        WindAeroOneDimIEC_primitive_attributes = new BaseClass[WindAeroOneDimIEC_primitive_builder.values().length];
        WindAeroOneDimIEC_class_attributes = new BaseClass[WindAeroOneDimIEC_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new WindAeroOneDimIEC();
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

    private void updateAttributeInArray(WindAeroOneDimIEC_class_attributes_enum attrEnum, BaseClass value) {
        try {
            WindAeroOneDimIEC_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(WindAeroOneDimIEC_primitive_builder attrEnum, BaseClass value) {
        try {
            WindAeroOneDimIEC_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            WindAeroOneDimIEC_class_attributes_enum attrEnum = WindAeroOneDimIEC_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated WindAeroOneDimIEC, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            WindAeroOneDimIEC_primitive_builder attrEnum = WindAeroOneDimIEC_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated WindAeroOneDimIEC, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            WindAeroOneDimIEC_primitive_builder attrEnum = WindAeroOneDimIEC_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = WindAeroOneDimIEC_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            WindAeroOneDimIEC_class_attributes_enum attrEnum = WindAeroOneDimIEC_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = WindAeroOneDimIEC_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : WindAeroOneDimIEC_primitive_builder.values()) {
            if (enumValue != WindAeroOneDimIEC_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "WindAeroOneDimIEC." + enumValue.name());
            }
        }
        for (var enumValue : WindAeroOneDimIEC_class_attributes_enum.values()) {
            if (enumValue != WindAeroOneDimIEC_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "WindAeroOneDimIEC." + enumValue.name());
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
            for (WindAeroOneDimIEC_primitive_builder attrEnum : WindAeroOneDimIEC_primitive_builder.values()) {
                BaseClass bc = WindAeroOneDimIEC_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    WindAeroOneDimIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (WindAeroOneDimIEC_class_attributes_enum attrEnum : WindAeroOneDimIEC_class_attributes_enum.values()) {
                BaseClass bc = WindAeroOneDimIEC_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    WindAeroOneDimIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(WindAeroOneDimIEC) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "WindAeroOneDimIEC";

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
        ATTR_NAMESPACE_MAP = new WindAeroOneDimIEC().allAttrNamespaceMap();
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
            Map.entry("ka", "http://iec.ch/TC57/CIM100#"),
            Map.entry("thetaomega", "http://iec.ch/TC57/CIM100#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
