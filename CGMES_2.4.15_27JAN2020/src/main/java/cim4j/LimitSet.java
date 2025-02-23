/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Specifies a set of Limits that are associated with a Measurement. A Measurement may have several LimitSets corresponding to seasonal or other changing conditions. The condition is captured in the name and description attributes. The same LimitSet may be used for several Measurements. In particular percentage limits are used this way.
 */
public class LimitSet extends IdentifiedObject {

	private static final Logging LOG = Logging.getLogger(LimitSet.class);

	private BaseClass[] LimitSet_class_attributes;
	private BaseClass[] LimitSet_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new LimitSet().getAttributeNamesMap();
	}

	private enum LimitSet_primitive_builder implements PrimitiveBuilder {
		isPercentageLimits() {
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

	private enum LimitSet_class_attributes_enum {
		isPercentageLimits,
		LAST_ENUM
	}

	public LimitSet() {
		LimitSet_primitive_attributes = new BaseClass[LimitSet_primitive_builder.values().length];
		LimitSet_class_attributes = new BaseClass[LimitSet_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new LimitSet();
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

	private void updateAttributeInArray(LimitSet_class_attributes_enum attrEnum, BaseClass value) {
		try {
			LimitSet_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(LimitSet_primitive_builder attrEnum, BaseClass value) {
		try {
			LimitSet_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			LimitSet_class_attributes_enum attrEnum = LimitSet_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated LimitSet, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			LimitSet_primitive_builder attrEnum = LimitSet_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated LimitSet, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			LimitSet_primitive_builder attrEnum = LimitSet_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = LimitSet_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			LimitSet_class_attributes_enum attrEnum = LimitSet_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = LimitSet_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : LimitSet_primitive_builder.values()) {
			if (enumValue != LimitSet_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "LimitSet." + enumValue.name());
			}
		}
		for (var enumValue : LimitSet_class_attributes_enum.values()) {
			if (enumValue != LimitSet_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "LimitSet." + enumValue.name());
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
			for (LimitSet_primitive_builder attrEnum : LimitSet_primitive_builder.values()) {
				BaseClass bc = LimitSet_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    LimitSet." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (LimitSet_class_attributes_enum attrEnum : LimitSet_class_attributes_enum.values()) {
				BaseClass bc = LimitSet_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    LimitSet." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(LimitSet) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "LimitSet";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
