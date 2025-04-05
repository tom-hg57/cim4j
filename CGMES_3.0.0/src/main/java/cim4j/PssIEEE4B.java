/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * IEEE 421.5-2005 type PSS4B power system stabilizer. The PSS4B model represents a structure based on multiple working frequency bands. Three separate bands, respectively dedicated to the low-, intermediate- and high-frequency modes of oscillations, are used in this delta omega (speed input) PSS. There is an error in the in IEEE 421.5-2005 PSS4B model: the <i>Pe</i> input should read -<i>Pe</i>. This implies that the input <i>Pe</i> needs to be multiplied by -1. Reference: IEEE 4B 421.5-2005, 8.4.  Parameter details: This model has 2 input signals. They have the following fixed types (expressed in terms of InputSignalKind values): the first one is of rotorAngleFrequencyDeviation type and the second one is of generatorElectricalPower type.
 */
public class PssIEEE4B extends PowerSystemStabilizerDynamics {

    private static final Logging LOG = Logging.getLogger(PssIEEE4B.class);

    private BaseClass[] PssIEEE4B_class_attributes;
    private BaseClass[] PssIEEE4B_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new PssIEEE4B().getAttributeNamesMap();
    }

    private enum PssIEEE4B_primitive_builder implements PrimitiveBuilder {
        bwh1() {
            public BaseClass construct(java.lang.String value) {
                return new Float(value);
            }
        },
        bwh2() {
            public BaseClass construct(java.lang.String value) {
                return new Float(value);
            }
        },
        bwl1() {
            public BaseClass construct(java.lang.String value) {
                return new Float(value);
            }
        },
        bwl2() {
            public BaseClass construct(java.lang.String value) {
                return new Float(value);
            }
        },
        kh() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kh1() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kh11() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kh17() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kh2() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        ki() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        ki1() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        ki11() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        ki17() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        ki2() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kl() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kl1() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kl11() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kl17() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        kl2() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        omeganh1() {
            public BaseClass construct(java.lang.String value) {
                return new Float(value);
            }
        },
        omeganh2() {
            public BaseClass construct(java.lang.String value) {
                return new Float(value);
            }
        },
        omeganl1() {
            public BaseClass construct(java.lang.String value) {
                return new Float(value);
            }
        },
        omeganl2() {
            public BaseClass construct(java.lang.String value) {
                return new Float(value);
            }
        },
        th1() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        th10() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        th11() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        th12() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        th2() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        th3() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        th4() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        th5() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        th6() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        th7() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        th8() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        th9() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        ti1() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        ti10() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        ti11() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        ti12() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        ti2() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        ti3() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        ti4() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        ti5() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        ti6() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        ti7() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        ti8() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        ti9() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tl1() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tl10() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tl11() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tl12() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tl2() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tl3() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tl4() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tl5() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tl6() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tl7() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tl8() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        tl9() {
            public BaseClass construct(java.lang.String value) {
                return new Seconds(value);
            }
        },
        vhmax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vhmin() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vimax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vimin() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vlmax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vlmin() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vstmax() {
            public BaseClass construct(java.lang.String value) {
                return new PU(value);
            }
        },
        vstmin() {
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

    private enum PssIEEE4B_class_attributes_enum {
        bwh1,
        bwh2,
        bwl1,
        bwl2,
        kh,
        kh1,
        kh11,
        kh17,
        kh2,
        ki,
        ki1,
        ki11,
        ki17,
        ki2,
        kl,
        kl1,
        kl11,
        kl17,
        kl2,
        omeganh1,
        omeganh2,
        omeganl1,
        omeganl2,
        th1,
        th10,
        th11,
        th12,
        th2,
        th3,
        th4,
        th5,
        th6,
        th7,
        th8,
        th9,
        ti1,
        ti10,
        ti11,
        ti12,
        ti2,
        ti3,
        ti4,
        ti5,
        ti6,
        ti7,
        ti8,
        ti9,
        tl1,
        tl10,
        tl11,
        tl12,
        tl2,
        tl3,
        tl4,
        tl5,
        tl6,
        tl7,
        tl8,
        tl9,
        vhmax,
        vhmin,
        vimax,
        vimin,
        vlmax,
        vlmin,
        vstmax,
        vstmin,
        LAST_ENUM
    }

    public PssIEEE4B() {
        PssIEEE4B_primitive_attributes = new BaseClass[PssIEEE4B_primitive_builder.values().length];
        PssIEEE4B_class_attributes = new BaseClass[PssIEEE4B_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new PssIEEE4B();
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

    private void updateAttributeInArray(PssIEEE4B_class_attributes_enum attrEnum, BaseClass value) {
        try {
            PssIEEE4B_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(PssIEEE4B_primitive_builder attrEnum, BaseClass value) {
        try {
            PssIEEE4B_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            PssIEEE4B_class_attributes_enum attrEnum = PssIEEE4B_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated PssIEEE4B, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            PssIEEE4B_primitive_builder attrEnum = PssIEEE4B_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated PssIEEE4B, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            PssIEEE4B_primitive_builder attrEnum = PssIEEE4B_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = PssIEEE4B_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            PssIEEE4B_class_attributes_enum attrEnum = PssIEEE4B_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = PssIEEE4B_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : PssIEEE4B_primitive_builder.values()) {
            if (enumValue != PssIEEE4B_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "PssIEEE4B." + enumValue.name());
            }
        }
        for (var enumValue : PssIEEE4B_class_attributes_enum.values()) {
            if (enumValue != PssIEEE4B_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "PssIEEE4B." + enumValue.name());
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
            for (PssIEEE4B_primitive_builder attrEnum : PssIEEE4B_primitive_builder.values()) {
                BaseClass bc = PssIEEE4B_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    PssIEEE4B." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (PssIEEE4B_class_attributes_enum attrEnum : PssIEEE4B_class_attributes_enum.values()) {
                BaseClass bc = PssIEEE4B_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    PssIEEE4B." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(PssIEEE4B) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "PssIEEE4B";

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
        ATTR_NAMESPACE_MAP = new PssIEEE4B().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("bwh1", "http://iec.ch/TC57/CIM100#"),
            Map.entry("bwh2", "http://iec.ch/TC57/CIM100#"),
            Map.entry("bwl1", "http://iec.ch/TC57/CIM100#"),
            Map.entry("bwl2", "http://iec.ch/TC57/CIM100#"),
            Map.entry("kh", "http://iec.ch/TC57/CIM100#"),
            Map.entry("kh1", "http://iec.ch/TC57/CIM100#"),
            Map.entry("kh11", "http://iec.ch/TC57/CIM100#"),
            Map.entry("kh17", "http://iec.ch/TC57/CIM100#"),
            Map.entry("kh2", "http://iec.ch/TC57/CIM100#"),
            Map.entry("ki", "http://iec.ch/TC57/CIM100#"),
            Map.entry("ki1", "http://iec.ch/TC57/CIM100#"),
            Map.entry("ki11", "http://iec.ch/TC57/CIM100#"),
            Map.entry("ki17", "http://iec.ch/TC57/CIM100#"),
            Map.entry("ki2", "http://iec.ch/TC57/CIM100#"),
            Map.entry("kl", "http://iec.ch/TC57/CIM100#"),
            Map.entry("kl1", "http://iec.ch/TC57/CIM100#"),
            Map.entry("kl11", "http://iec.ch/TC57/CIM100#"),
            Map.entry("kl17", "http://iec.ch/TC57/CIM100#"),
            Map.entry("kl2", "http://iec.ch/TC57/CIM100#"),
            Map.entry("omeganh1", "http://iec.ch/TC57/CIM100#"),
            Map.entry("omeganh2", "http://iec.ch/TC57/CIM100#"),
            Map.entry("omeganl1", "http://iec.ch/TC57/CIM100#"),
            Map.entry("omeganl2", "http://iec.ch/TC57/CIM100#"),
            Map.entry("th1", "http://iec.ch/TC57/CIM100#"),
            Map.entry("th10", "http://iec.ch/TC57/CIM100#"),
            Map.entry("th11", "http://iec.ch/TC57/CIM100#"),
            Map.entry("th12", "http://iec.ch/TC57/CIM100#"),
            Map.entry("th2", "http://iec.ch/TC57/CIM100#"),
            Map.entry("th3", "http://iec.ch/TC57/CIM100#"),
            Map.entry("th4", "http://iec.ch/TC57/CIM100#"),
            Map.entry("th5", "http://iec.ch/TC57/CIM100#"),
            Map.entry("th6", "http://iec.ch/TC57/CIM100#"),
            Map.entry("th7", "http://iec.ch/TC57/CIM100#"),
            Map.entry("th8", "http://iec.ch/TC57/CIM100#"),
            Map.entry("th9", "http://iec.ch/TC57/CIM100#"),
            Map.entry("ti1", "http://iec.ch/TC57/CIM100#"),
            Map.entry("ti10", "http://iec.ch/TC57/CIM100#"),
            Map.entry("ti11", "http://iec.ch/TC57/CIM100#"),
            Map.entry("ti12", "http://iec.ch/TC57/CIM100#"),
            Map.entry("ti2", "http://iec.ch/TC57/CIM100#"),
            Map.entry("ti3", "http://iec.ch/TC57/CIM100#"),
            Map.entry("ti4", "http://iec.ch/TC57/CIM100#"),
            Map.entry("ti5", "http://iec.ch/TC57/CIM100#"),
            Map.entry("ti6", "http://iec.ch/TC57/CIM100#"),
            Map.entry("ti7", "http://iec.ch/TC57/CIM100#"),
            Map.entry("ti8", "http://iec.ch/TC57/CIM100#"),
            Map.entry("ti9", "http://iec.ch/TC57/CIM100#"),
            Map.entry("tl1", "http://iec.ch/TC57/CIM100#"),
            Map.entry("tl10", "http://iec.ch/TC57/CIM100#"),
            Map.entry("tl11", "http://iec.ch/TC57/CIM100#"),
            Map.entry("tl12", "http://iec.ch/TC57/CIM100#"),
            Map.entry("tl2", "http://iec.ch/TC57/CIM100#"),
            Map.entry("tl3", "http://iec.ch/TC57/CIM100#"),
            Map.entry("tl4", "http://iec.ch/TC57/CIM100#"),
            Map.entry("tl5", "http://iec.ch/TC57/CIM100#"),
            Map.entry("tl6", "http://iec.ch/TC57/CIM100#"),
            Map.entry("tl7", "http://iec.ch/TC57/CIM100#"),
            Map.entry("tl8", "http://iec.ch/TC57/CIM100#"),
            Map.entry("tl9", "http://iec.ch/TC57/CIM100#"),
            Map.entry("vhmax", "http://iec.ch/TC57/CIM100#"),
            Map.entry("vhmin", "http://iec.ch/TC57/CIM100#"),
            Map.entry("vimax", "http://iec.ch/TC57/CIM100#"),
            Map.entry("vimin", "http://iec.ch/TC57/CIM100#"),
            Map.entry("vlmax", "http://iec.ch/TC57/CIM100#"),
            Map.entry("vlmin", "http://iec.ch/TC57/CIM100#"),
            Map.entry("vstmax", "http://iec.ch/TC57/CIM100#"),
            Map.entry("vstmin", "http://iec.ch/TC57/CIM100#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
