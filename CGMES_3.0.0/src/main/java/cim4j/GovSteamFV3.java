/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Simplified GovSteamIEEE1 steam turbine governor with Prmax limit and fast valving.
 */
public class GovSteamFV3 extends TurbineGovernorDynamics {

    private static final Logging LOG = Logging.getLogger(GovSteamFV3.class);

    private BaseClass[] GovSteamFV3_class_attributes;
    private BaseClass[] GovSteamFV3_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new GovSteamFV3().getAttributeNamesMap();
    }

    private enum GovSteamFV3_primitive_builder implements PrimitiveBuilder {
        gv1() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        gv2() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        gv3() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        gv4() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        gv5() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        gv6() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        k() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        k1() {
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
        mwbase() {
            public BaseClass construct(java.lang.String value) {
                return new ActivePower(value);
            }
        },
        pgv1() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        pgv2() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        pgv3() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        pgv4() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        pgv5() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        pgv6() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        pmax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        pmin() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        prmax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        t1() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
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
        t4() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        t5() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        t6() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        ta() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tb() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tc() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        uc() {
            public BaseClass construct(java.lang.String value) {
                return new Float(value);
            }
        },
        uo() {
            public BaseClass construct(java.lang.String value) {
                return new Float(value);
            }
        },
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum GovSteamFV3_class_attributes_enum {
        gv1,
        gv2,
        gv3,
        gv4,
        gv5,
        gv6,
        k,
        k1,
        k2,
        k3,
        mwbase,
        pgv1,
        pgv2,
        pgv3,
        pgv4,
        pgv5,
        pgv6,
        pmax,
        pmin,
        prmax,
        t1,
        t2,
        t3,
        t4,
        t5,
        t6,
        ta,
        tb,
        tc,
        uc,
        uo,
        LAST_ENUM
    }

    public GovSteamFV3() {
        GovSteamFV3_primitive_attributes = new BaseClass[GovSteamFV3_primitive_builder.values().length];
        GovSteamFV3_class_attributes = new BaseClass[GovSteamFV3_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new GovSteamFV3();
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

    private void updateAttributeInArray(GovSteamFV3_class_attributes_enum attrEnum, BaseClass value) {
        try {
            GovSteamFV3_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(GovSteamFV3_primitive_builder attrEnum, BaseClass value) {
        try {
            GovSteamFV3_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            GovSteamFV3_class_attributes_enum attrEnum = GovSteamFV3_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated GovSteamFV3, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            GovSteamFV3_primitive_builder attrEnum = GovSteamFV3_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated GovSteamFV3, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            GovSteamFV3_primitive_builder attrEnum = GovSteamFV3_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = GovSteamFV3_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            GovSteamFV3_class_attributes_enum attrEnum = GovSteamFV3_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = GovSteamFV3_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : GovSteamFV3_primitive_builder.values()) {
            if (enumValue != GovSteamFV3_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "GovSteamFV3." + enumValue.name());
            }
        }
        for (var enumValue : GovSteamFV3_class_attributes_enum.values()) {
            if (enumValue != GovSteamFV3_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "GovSteamFV3." + enumValue.name());
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
            for (GovSteamFV3_primitive_builder attrEnum : GovSteamFV3_primitive_builder.values()) {
                BaseClass bc = GovSteamFV3_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    GovSteamFV3." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (GovSteamFV3_class_attributes_enum attrEnum : GovSteamFV3_class_attributes_enum.values()) {
                BaseClass bc = GovSteamFV3_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    GovSteamFV3." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(GovSteamFV3) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "GovSteamFV3";

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
        ATTR_NAMESPACE_MAP = new GovSteamFV3().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("gv1", "http://iec.ch/TC57/CIM100#"),
            Map.entry("gv2", "http://iec.ch/TC57/CIM100#"),
            Map.entry("gv3", "http://iec.ch/TC57/CIM100#"),
            Map.entry("gv4", "http://iec.ch/TC57/CIM100#"),
            Map.entry("gv5", "http://iec.ch/TC57/CIM100#"),
            Map.entry("gv6", "http://iec.ch/TC57/CIM100#"),
            Map.entry("k", "http://iec.ch/TC57/CIM100#"),
            Map.entry("k1", "http://iec.ch/TC57/CIM100#"),
            Map.entry("k2", "http://iec.ch/TC57/CIM100#"),
            Map.entry("k3", "http://iec.ch/TC57/CIM100#"),
            Map.entry("mwbase", "http://iec.ch/TC57/CIM100#"),
            Map.entry("pgv1", "http://iec.ch/TC57/CIM100#"),
            Map.entry("pgv2", "http://iec.ch/TC57/CIM100#"),
            Map.entry("pgv3", "http://iec.ch/TC57/CIM100#"),
            Map.entry("pgv4", "http://iec.ch/TC57/CIM100#"),
            Map.entry("pgv5", "http://iec.ch/TC57/CIM100#"),
            Map.entry("pgv6", "http://iec.ch/TC57/CIM100#"),
            Map.entry("pmax", "http://iec.ch/TC57/CIM100#"),
            Map.entry("pmin", "http://iec.ch/TC57/CIM100#"),
            Map.entry("prmax", "http://iec.ch/TC57/CIM100#"),
            Map.entry("t1", "http://iec.ch/TC57/CIM100#"),
            Map.entry("t2", "http://iec.ch/TC57/CIM100#"),
            Map.entry("t3", "http://iec.ch/TC57/CIM100#"),
            Map.entry("t4", "http://iec.ch/TC57/CIM100#"),
            Map.entry("t5", "http://iec.ch/TC57/CIM100#"),
            Map.entry("t6", "http://iec.ch/TC57/CIM100#"),
            Map.entry("ta", "http://iec.ch/TC57/CIM100#"),
            Map.entry("tb", "http://iec.ch/TC57/CIM100#"),
            Map.entry("tc", "http://iec.ch/TC57/CIM100#"),
            Map.entry("uc", "http://iec.ch/TC57/CIM100#"),
            Map.entry("uo", "http://iec.ch/TC57/CIM100#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
