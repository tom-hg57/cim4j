/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Street details, in the context of address.
 */
public class StreetDetail extends BaseClass {

    private static final Logging LOG = Logging.getLogger(StreetDetail.class);

    private BaseClass[] StreetDetail_class_attributes;
    private BaseClass[] StreetDetail_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new StreetDetail().getAttributeNamesMap();
    }

    private enum StreetDetail_primitive_builder implements PrimitiveBuilder {
        addressGeneral() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        addressGeneral2() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        addressGeneral3() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        buildingName() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        code() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        floorIdentification() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        name() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        number() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        prefix() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        suffix() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        suiteNumber() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        type() {
            public BaseClass construct(java.lang.String value) {
                return new String(value);
            }
        },
        withinTownLimits() {
            public BaseClass construct(java.lang.String value) {
                return new Boolean(value);
            }
        },
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum StreetDetail_class_attributes_enum {
        addressGeneral,
        addressGeneral2,
        addressGeneral3,
        buildingName,
        code,
        floorIdentification,
        name,
        number,
        prefix,
        suffix,
        suiteNumber,
        type,
        withinTownLimits,
        LAST_ENUM
    }

    public StreetDetail() {
        StreetDetail_primitive_attributes = new BaseClass[StreetDetail_primitive_builder.values().length];
        StreetDetail_class_attributes = new BaseClass[StreetDetail_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new StreetDetail();
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

    private void updateAttributeInArray(StreetDetail_class_attributes_enum attrEnum, BaseClass value) {
        try {
            StreetDetail_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(StreetDetail_primitive_builder attrEnum, BaseClass value) {
        try {
            StreetDetail_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            StreetDetail_class_attributes_enum attrEnum = StreetDetail_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated StreetDetail, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            StreetDetail_primitive_builder attrEnum = StreetDetail_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated StreetDetail, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            StreetDetail_primitive_builder attrEnum = StreetDetail_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = StreetDetail_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            StreetDetail_class_attributes_enum attrEnum = StreetDetail_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = StreetDetail_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : StreetDetail_primitive_builder.values()) {
            if (enumValue != StreetDetail_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "StreetDetail." + enumValue.name());
            }
        }
        for (var enumValue : StreetDetail_class_attributes_enum.values()) {
            if (enumValue != StreetDetail_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "StreetDetail." + enumValue.name());
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
            for (StreetDetail_primitive_builder attrEnum : StreetDetail_primitive_builder.values()) {
                BaseClass bc = StreetDetail_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    StreetDetail." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (StreetDetail_class_attributes_enum attrEnum : StreetDetail_class_attributes_enum.values()) {
                BaseClass bc = StreetDetail_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    StreetDetail." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(StreetDetail) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "StreetDetail";

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
        ATTR_NAMESPACE_MAP = new StreetDetail().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("addressGeneral", "http://iec.ch/TC57/CIM100#"),
            Map.entry("addressGeneral2", "http://iec.ch/TC57/CIM100#"),
            Map.entry("addressGeneral3", "http://iec.ch/TC57/CIM100#"),
            Map.entry("buildingName", "http://iec.ch/TC57/CIM100#"),
            Map.entry("code", "http://iec.ch/TC57/CIM100#"),
            Map.entry("floorIdentification", "http://iec.ch/TC57/CIM100#"),
            Map.entry("name", "http://iec.ch/TC57/CIM100#"),
            Map.entry("number", "http://iec.ch/TC57/CIM100#"),
            Map.entry("prefix", "http://iec.ch/TC57/CIM100#"),
            Map.entry("suffix", "http://iec.ch/TC57/CIM100#"),
            Map.entry("suiteNumber", "http://iec.ch/TC57/CIM100#"),
            Map.entry("type", "http://iec.ch/TC57/CIM100#"),
            Map.entry("withinTownLimits", "http://iec.ch/TC57/CIM100#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
