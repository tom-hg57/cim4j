/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Two-dimensional aerodynamic model.   Reference: IEC 61400-27-1:2015, 5.6.1.3.
 */
public class WindAeroTwoDimIEC extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(WindAeroTwoDimIEC.class);

    private BaseClass[] WindAeroTwoDimIEC_class_attributes;
    private BaseClass[] WindAeroTwoDimIEC_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new WindAeroTwoDimIEC().getAttributeNamesMap();
    }

    private enum WindAeroTwoDimIEC_primitive_builder implements PrimitiveBuilder {
        dpomega() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        dptheta() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        dpv1() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        omegazero() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        pavail() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        thetav2() {
            public BaseClass construct(java.lang.String value) {
                return new AngleDegrees(value);
            }
        },
        thetazero() {
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

    private enum WindAeroTwoDimIEC_class_attributes_enum {
        WindTurbineType3IEC,
        dpomega,
        dptheta,
        dpv1,
        omegazero,
        pavail,
        thetav2,
        thetazero,
        LAST_ENUM
    }

    public WindAeroTwoDimIEC() {
        WindAeroTwoDimIEC_primitive_attributes = new BaseClass[WindAeroTwoDimIEC_primitive_builder.values().length];
        WindAeroTwoDimIEC_class_attributes = new BaseClass[WindAeroTwoDimIEC_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new WindAeroTwoDimIEC();
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

    private void updateAttributeInArray(WindAeroTwoDimIEC_class_attributes_enum attrEnum, BaseClass value) {
        try {
            WindAeroTwoDimIEC_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(WindAeroTwoDimIEC_primitive_builder attrEnum, BaseClass value) {
        try {
            WindAeroTwoDimIEC_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            WindAeroTwoDimIEC_class_attributes_enum attrEnum = WindAeroTwoDimIEC_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated WindAeroTwoDimIEC, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            WindAeroTwoDimIEC_primitive_builder attrEnum = WindAeroTwoDimIEC_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated WindAeroTwoDimIEC, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            WindAeroTwoDimIEC_primitive_builder attrEnum = WindAeroTwoDimIEC_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = WindAeroTwoDimIEC_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            WindAeroTwoDimIEC_class_attributes_enum attrEnum = WindAeroTwoDimIEC_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = WindAeroTwoDimIEC_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : WindAeroTwoDimIEC_primitive_builder.values()) {
            if (enumValue != WindAeroTwoDimIEC_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "WindAeroTwoDimIEC." + enumValue.name());
            }
        }
        for (var enumValue : WindAeroTwoDimIEC_class_attributes_enum.values()) {
            if (enumValue != WindAeroTwoDimIEC_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "WindAeroTwoDimIEC." + enumValue.name());
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
            for (WindAeroTwoDimIEC_primitive_builder attrEnum : WindAeroTwoDimIEC_primitive_builder.values()) {
                BaseClass bc = WindAeroTwoDimIEC_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    WindAeroTwoDimIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (WindAeroTwoDimIEC_class_attributes_enum attrEnum : WindAeroTwoDimIEC_class_attributes_enum.values()) {
                BaseClass bc = WindAeroTwoDimIEC_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    WindAeroTwoDimIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(WindAeroTwoDimIEC) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "WindAeroTwoDimIEC";

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
        ATTR_NAMESPACE_MAP = new WindAeroTwoDimIEC().allAttrNamespaceMap();
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
            Map.entry("dpomega", "http://iec.ch/TC57/CIM100#"),
            Map.entry("dptheta", "http://iec.ch/TC57/CIM100#"),
            Map.entry("dpv1", "http://iec.ch/TC57/CIM100#"),
            Map.entry("omegazero", "http://iec.ch/TC57/CIM100#"),
            Map.entry("pavail", "http://iec.ch/TC57/CIM100#"),
            Map.entry("thetav2", "http://iec.ch/TC57/CIM100#"),
            Map.entry("thetazero", "http://iec.ch/TC57/CIM100#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
