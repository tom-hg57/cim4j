/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Simplified plant voltage and reactive power control model for use with type 3 and type 4 wind turbine models. Reference: IEC 61400-27-1:2015, Annex D.
 */
public class WindPlantReactiveControlIEC extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(WindPlantReactiveControlIEC.class);

    private BaseClass[] WindPlantReactiveControlIEC_class_attributes;
    private BaseClass[] WindPlantReactiveControlIEC_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new WindPlantReactiveControlIEC().getAttributeNamesMap();
    }

    private enum WindPlantReactiveControlIEC_primitive_builder implements PrimitiveBuilder {
        dxrefmax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        dxrefmin() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kiwpx() {
            public BaseClass construct(java.lang.String value) {
                return new Float(value);
            }
        },
        kiwpxmax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kiwpxmin() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kpwpx() {
            public BaseClass construct(java.lang.String value) {
                return new Float(value);
            }
        },
        kwpqref() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kwpqu() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        tuqfilt() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        twppfiltq() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        twpqfiltq() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        twpufiltq() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        txft() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        txfv() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        uwpqdip() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        windPlantQcontrolModesType() {
            public BaseClass construct(java.lang.String value) {
                return new WindPlantQcontrolModeKind(value);
            }
        },
        xrefmax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        xrefmin() {
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

    private enum WindPlantReactiveControlIEC_class_attributes_enum {
        WindDynamicsLookupTable,
        WindPlantIEC,
        dxrefmax,
        dxrefmin,
        kiwpx,
        kiwpxmax,
        kiwpxmin,
        kpwpx,
        kwpqref,
        kwpqu,
        tuqfilt,
        twppfiltq,
        twpqfiltq,
        twpufiltq,
        txft,
        txfv,
        uwpqdip,
        windPlantQcontrolModesType,
        xrefmax,
        xrefmin,
        LAST_ENUM
    }

    public WindPlantReactiveControlIEC() {
        WindPlantReactiveControlIEC_primitive_attributes = new BaseClass[WindPlantReactiveControlIEC_primitive_builder.values().length];
        WindPlantReactiveControlIEC_class_attributes = new BaseClass[WindPlantReactiveControlIEC_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new WindPlantReactiveControlIEC();
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

    private void updateAttributeInArray(WindPlantReactiveControlIEC_class_attributes_enum attrEnum, BaseClass value) {
        try {
            WindPlantReactiveControlIEC_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(WindPlantReactiveControlIEC_primitive_builder attrEnum, BaseClass value) {
        try {
            WindPlantReactiveControlIEC_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            WindPlantReactiveControlIEC_class_attributes_enum attrEnum = WindPlantReactiveControlIEC_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated WindPlantReactiveControlIEC, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            WindPlantReactiveControlIEC_primitive_builder attrEnum = WindPlantReactiveControlIEC_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated WindPlantReactiveControlIEC, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            WindPlantReactiveControlIEC_primitive_builder attrEnum = WindPlantReactiveControlIEC_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = WindPlantReactiveControlIEC_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            WindPlantReactiveControlIEC_class_attributes_enum attrEnum = WindPlantReactiveControlIEC_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = WindPlantReactiveControlIEC_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : WindPlantReactiveControlIEC_primitive_builder.values()) {
            if (enumValue != WindPlantReactiveControlIEC_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "WindPlantReactiveControlIEC." + enumValue.name());
            }
        }
        for (var enumValue : WindPlantReactiveControlIEC_class_attributes_enum.values()) {
            if (enumValue != WindPlantReactiveControlIEC_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "WindPlantReactiveControlIEC." + enumValue.name());
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
            for (WindPlantReactiveControlIEC_primitive_builder attrEnum : WindPlantReactiveControlIEC_primitive_builder.values()) {
                BaseClass bc = WindPlantReactiveControlIEC_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    WindPlantReactiveControlIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (WindPlantReactiveControlIEC_class_attributes_enum attrEnum : WindPlantReactiveControlIEC_class_attributes_enum.values()) {
                BaseClass bc = WindPlantReactiveControlIEC_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    WindPlantReactiveControlIEC." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(WindPlantReactiveControlIEC) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "WindPlantReactiveControlIEC";

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
        ATTR_NAMESPACE_MAP = new WindPlantReactiveControlIEC().allAttrNamespaceMap();
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
            Map.entry("WindPlantIEC", "http://iec.ch/TC57/CIM100#"),
            Map.entry("dxrefmax", "http://iec.ch/TC57/CIM100#"),
            Map.entry("dxrefmin", "http://iec.ch/TC57/CIM100#"),
            Map.entry("kiwpx", "http://iec.ch/TC57/CIM100#"),
            Map.entry("kiwpxmax", "http://iec.ch/TC57/CIM100#"),
            Map.entry("kiwpxmin", "http://iec.ch/TC57/CIM100#"),
            Map.entry("kpwpx", "http://iec.ch/TC57/CIM100#"),
            Map.entry("kwpqref", "http://iec.ch/TC57/CIM100#"),
            Map.entry("kwpqu", "http://iec.ch/TC57/CIM100#"),
            Map.entry("tuqfilt", "http://iec.ch/TC57/CIM100#"),
            Map.entry("twppfiltq", "http://iec.ch/TC57/CIM100#"),
            Map.entry("twpqfiltq", "http://iec.ch/TC57/CIM100#"),
            Map.entry("twpufiltq", "http://iec.ch/TC57/CIM100#"),
            Map.entry("txft", "http://iec.ch/TC57/CIM100#"),
            Map.entry("txfv", "http://iec.ch/TC57/CIM100#"),
            Map.entry("uwpqdip", "http://iec.ch/TC57/CIM100#"),
            Map.entry("windPlantQcontrolModesType", "http://iec.ch/TC57/CIM100#"),
            Map.entry("xrefmax", "http://iec.ch/TC57/CIM100#"),
            Map.entry("xrefmin", "http://iec.ch/TC57/CIM100#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
