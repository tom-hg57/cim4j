/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * A sensor used mainly in overhead distribution networks as the source of both current and voltage measurements.
 */
public class PostLineSensor extends Sensor {

    private static final Logging LOG = Logging.getLogger(PostLineSensor.class);

    private BaseClass[] PostLineSensor_class_attributes;
    private BaseClass[] PostLineSensor_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new PostLineSensor().getAttributeNamesMap();
    }

    private enum PostLineSensor_primitive_builder implements PrimitiveBuilder {
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum PostLineSensor_class_attributes_enum {
        LAST_ENUM
    }

    public PostLineSensor() {
        PostLineSensor_primitive_attributes = new BaseClass[PostLineSensor_primitive_builder.values().length];
        PostLineSensor_class_attributes = new BaseClass[PostLineSensor_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new PostLineSensor();
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

    private void updateAttributeInArray(PostLineSensor_class_attributes_enum attrEnum, BaseClass value) {
        try {
            PostLineSensor_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(PostLineSensor_primitive_builder attrEnum, BaseClass value) {
        try {
            PostLineSensor_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            PostLineSensor_class_attributes_enum attrEnum = PostLineSensor_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated PostLineSensor, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            PostLineSensor_primitive_builder attrEnum = PostLineSensor_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated PostLineSensor, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            PostLineSensor_primitive_builder attrEnum = PostLineSensor_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = PostLineSensor_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            PostLineSensor_class_attributes_enum attrEnum = PostLineSensor_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = PostLineSensor_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : PostLineSensor_primitive_builder.values()) {
            if (enumValue != PostLineSensor_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "PostLineSensor." + enumValue.name());
            }
        }
        for (var enumValue : PostLineSensor_class_attributes_enum.values()) {
            if (enumValue != PostLineSensor_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "PostLineSensor." + enumValue.name());
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
            for (PostLineSensor_primitive_builder attrEnum : PostLineSensor_primitive_builder.values()) {
                BaseClass bc = PostLineSensor_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    PostLineSensor." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (PostLineSensor_class_attributes_enum attrEnum : PostLineSensor_class_attributes_enum.values()) {
                BaseClass bc = PostLineSensor_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    PostLineSensor." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(PostLineSensor) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "PostLineSensor";

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
        ATTR_NAMESPACE_MAP = new PostLineSensor().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("LAST_ATTRIBUTE", ""));
}
