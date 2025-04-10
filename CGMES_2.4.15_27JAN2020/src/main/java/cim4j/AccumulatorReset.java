/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * This command reset the counter value to zero.
 */
public class AccumulatorReset extends Control {

	private static final Logging LOG = Logging.getLogger(AccumulatorReset.class);

	private BaseClass[] AccumulatorReset_class_attributes;
	private BaseClass[] AccumulatorReset_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new AccumulatorReset().getAttributeNamesMap();
	}

	private enum AccumulatorReset_primitive_builder implements PrimitiveBuilder {
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum AccumulatorReset_class_attributes_enum {
		AccumulatorValue,
		LAST_ENUM
	}

	public AccumulatorReset() {
		AccumulatorReset_primitive_attributes = new BaseClass[AccumulatorReset_primitive_builder.values().length];
		AccumulatorReset_class_attributes = new BaseClass[AccumulatorReset_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new AccumulatorReset();
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

	private void updateAttributeInArray(AccumulatorReset_class_attributes_enum attrEnum, BaseClass value) {
		try {
			AccumulatorReset_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(AccumulatorReset_primitive_builder attrEnum, BaseClass value) {
		try {
			AccumulatorReset_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			AccumulatorReset_class_attributes_enum attrEnum = AccumulatorReset_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated AccumulatorReset, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			AccumulatorReset_primitive_builder attrEnum = AccumulatorReset_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated AccumulatorReset, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			AccumulatorReset_primitive_builder attrEnum = AccumulatorReset_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = AccumulatorReset_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			AccumulatorReset_class_attributes_enum attrEnum = AccumulatorReset_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = AccumulatorReset_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : AccumulatorReset_primitive_builder.values()) {
			if (enumValue != AccumulatorReset_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "AccumulatorReset." + enumValue.name());
			}
		}
		for (var enumValue : AccumulatorReset_class_attributes_enum.values()) {
			if (enumValue != AccumulatorReset_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "AccumulatorReset." + enumValue.name());
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
			for (AccumulatorReset_primitive_builder attrEnum : AccumulatorReset_primitive_builder.values()) {
				BaseClass bc = AccumulatorReset_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    AccumulatorReset." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (AccumulatorReset_class_attributes_enum attrEnum : AccumulatorReset_class_attributes_enum.values()) {
				BaseClass bc = AccumulatorReset_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    AccumulatorReset." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(AccumulatorReset) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "AccumulatorReset";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
