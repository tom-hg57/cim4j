/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Pitch control power model. Reference: IEC 61400-27-1:2015, 5.6.5.1.
 */
public class WindPitchContPowerIEC extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(WindPitchContPowerIEC.class);

    private BaseClass[] WindPitchContPowerIEC_class_attributes;
    private BaseClass[] WindPitchContPowerIEC_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new WindPitchContPowerIEC().getAttributeNamesMap();
    }

    private enum WindPitchContPowerIEC_primitive_builder implements PrimitiveBuilder {
        dpmax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        dpmin() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        pmin() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        pset() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        t1() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tr() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        uuvrt() {
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

    private enum WindPitchContPowerIEC_class_attributes_enum {
        WindDynamicsLookupTable,
        WindGenTurbineType1bIEC,
        WindGenTurbineType2IEC,
        dpmax,
        dpmin,
        pmin,
        pset,
        t1,
        tr,
        uuvrt,
        LAST_ENUM
    }

    public WindPitchContPowerIEC() {
        WindPitchContPowerIEC_primitive_attributes = new BaseClass[WindPitchContPowerIEC_primitive_builder.values().length];
        WindPitchContPowerIEC_class_attributes = new BaseClass[WindPitchContPowerIEC_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new WindPitchContPowerIEC();
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

    private void updateAttributeInArray(WindPitchContPowerIEC_class_attributes_enum attrEnum, BaseClass value) {
        try {
            WindPitchContPowerIEC_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(WindPitchContPowerIEC_primitive_builder attrEnum, BaseClass value) {
        try {
            WindPitchContPowerIEC_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            WindPitchContPowerIEC_class_attributes_enum attrEnum = WindPitchContPowerIEC_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated WindPitchContPowerIEC, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            WindPitchContPowerIEC_primitive_builder attrEnum = WindPitchContPowerIEC_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated WindPitchContPowerIEC, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            WindPitchContPowerIEC_primitive_builder attrEnum = WindPitchContPowerIEC_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = WindPitchContPowerIEC_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            WindPitchContPowerIEC_class_attributes_enum attrEnum = WindPitchContPowerIEC_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = WindPitchContPowerIEC_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : WindPitchContPowerIEC_primitive_builder.values()) {
            if (enumValue != WindPitchContPowerIEC_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "WindPitchContPowerIEC." + enumValue.name());
            }
        }
        for (var enumValue : WindPitchContPowerIEC_class_attributes_enum.values()) {
            if (enumValue != WindPitchContPowerIEC_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "WindPitchContPowerIEC." + enumValue.name());
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
            for (WindPitchContPowerIEC_primitive_builder attrEnum : WindPitchContPowerIEC_primitive_builder.values()) {
                BaseClass bc = WindPitchContPowerIEC_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    WindPitchContPowerIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (WindPitchContPowerIEC_class_attributes_enum attrEnum : WindPitchContPowerIEC_class_attributes_enum.values()) {
                BaseClass bc = WindPitchContPowerIEC_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    WindPitchContPowerIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(WindPitchContPowerIEC) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "WindPitchContPowerIEC";

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
        ATTR_NAMESPACE_MAP = new WindPitchContPowerIEC().allAttrNamespaceMap();
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
            Map.entry("WindGenTurbineType1bIEC", "http://iec.ch/TC57/CIM100#"),
            Map.entry("WindGenTurbineType2IEC", "http://iec.ch/TC57/CIM100#"),
            Map.entry("dpmax", "http://iec.ch/TC57/CIM100#"),
            Map.entry("dpmin", "http://iec.ch/TC57/CIM100#"),
            Map.entry("pmin", "http://iec.ch/TC57/CIM100#"),
            Map.entry("pset", "http://iec.ch/TC57/CIM100#"),
            Map.entry("t1", "http://iec.ch/TC57/CIM100#"),
            Map.entry("tr", "http://iec.ch/TC57/CIM100#"),
            Map.entry("uuvrt", "http://iec.ch/TC57/CIM100#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
