/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * This is used for grouping diagram object points from different diagram objects that are considered to be glued together in a diagram even if they are not at the exact same coordinates.
 */
public class DiagramObjectGluePoint extends BaseClass {

	private static final Logging LOG = Logging.getLogger(DiagramObjectGluePoint.class);

	private BaseClass[] DiagramObjectGluePoint_class_attributes;
	private BaseClass[] DiagramObjectGluePoint_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new DiagramObjectGluePoint().getAttributeNamesMap();
	}

	private enum DiagramObjectGluePoint_primitive_builder implements PrimitiveBuilder {
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum DiagramObjectGluePoint_class_attributes_enum {
		DiagramObjectPoints,
		LAST_ENUM
	}

	public DiagramObjectGluePoint() {
		DiagramObjectGluePoint_primitive_attributes = new BaseClass[DiagramObjectGluePoint_primitive_builder.values().length];
		DiagramObjectGluePoint_class_attributes = new BaseClass[DiagramObjectGluePoint_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new DiagramObjectGluePoint();
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

	private void updateAttributeInArray(DiagramObjectGluePoint_class_attributes_enum attrEnum, BaseClass value) {
		try {
			DiagramObjectGluePoint_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(DiagramObjectGluePoint_primitive_builder attrEnum, BaseClass value) {
		try {
			DiagramObjectGluePoint_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			DiagramObjectGluePoint_class_attributes_enum attrEnum = DiagramObjectGluePoint_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated DiagramObjectGluePoint, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			DiagramObjectGluePoint_primitive_builder attrEnum = DiagramObjectGluePoint_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated DiagramObjectGluePoint, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			DiagramObjectGluePoint_primitive_builder attrEnum = DiagramObjectGluePoint_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = DiagramObjectGluePoint_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			DiagramObjectGluePoint_class_attributes_enum attrEnum = DiagramObjectGluePoint_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = DiagramObjectGluePoint_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : DiagramObjectGluePoint_primitive_builder.values()) {
			if (enumValue != DiagramObjectGluePoint_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "DiagramObjectGluePoint." + enumValue.name());
			}
		}
		for (var enumValue : DiagramObjectGluePoint_class_attributes_enum.values()) {
			if (enumValue != DiagramObjectGluePoint_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "DiagramObjectGluePoint." + enumValue.name());
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
			for (DiagramObjectGluePoint_primitive_builder attrEnum : DiagramObjectGluePoint_primitive_builder.values()) {
				BaseClass bc = DiagramObjectGluePoint_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DiagramObjectGluePoint." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (DiagramObjectGluePoint_class_attributes_enum attrEnum : DiagramObjectGluePoint_class_attributes_enum.values()) {
				BaseClass bc = DiagramObjectGluePoint_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DiagramObjectGluePoint." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(DiagramObjectGluePoint) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "DiagramObjectGluePoint";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
