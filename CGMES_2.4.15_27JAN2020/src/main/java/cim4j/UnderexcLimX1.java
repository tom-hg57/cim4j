/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class UnderexcLimX1 extends UnderexcitationLimiterDynamics {

	private static final Logging LOG = Logging.getLogger(UnderexcLimX1.class);

	private BaseClass[] UnderexcLimX1_class_attributes;
	private BaseClass[] UnderexcLimX1_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new UnderexcLimX1().getAttributeNamesMap();
	}

	private enum UnderexcLimX1_primitive_builder implements PrimitiveBuilder {
		k() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kf2() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		km() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		melmax() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		tf2() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tm() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum UnderexcLimX1_class_attributes_enum {
		k,
		kf2,
		km,
		melmax,
		tf2,
		tm,
		LAST_ENUM
	}

	public UnderexcLimX1() {
		UnderexcLimX1_primitive_attributes = new BaseClass[UnderexcLimX1_primitive_builder.values().length];
		UnderexcLimX1_class_attributes = new BaseClass[UnderexcLimX1_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new UnderexcLimX1();
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

	private void updateAttributeInArray(UnderexcLimX1_class_attributes_enum attrEnum, BaseClass value) {
		try {
			UnderexcLimX1_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(UnderexcLimX1_primitive_builder attrEnum, BaseClass value) {
		try {
			UnderexcLimX1_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			UnderexcLimX1_class_attributes_enum attrEnum = UnderexcLimX1_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated UnderexcLimX1, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			UnderexcLimX1_primitive_builder attrEnum = UnderexcLimX1_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated UnderexcLimX1, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			UnderexcLimX1_primitive_builder attrEnum = UnderexcLimX1_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = UnderexcLimX1_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			UnderexcLimX1_class_attributes_enum attrEnum = UnderexcLimX1_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = UnderexcLimX1_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : UnderexcLimX1_primitive_builder.values()) {
			if (enumValue != UnderexcLimX1_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "UnderexcLimX1." + enumValue.name());
			}
		}
		for (var enumValue : UnderexcLimX1_class_attributes_enum.values()) {
			if (enumValue != UnderexcLimX1_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "UnderexcLimX1." + enumValue.name());
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
			for (UnderexcLimX1_primitive_builder attrEnum : UnderexcLimX1_primitive_builder.values()) {
				BaseClass bc = UnderexcLimX1_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    UnderexcLimX1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (UnderexcLimX1_class_attributes_enum attrEnum : UnderexcLimX1_class_attributes_enum.values()) {
				BaseClass bc = UnderexcLimX1_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    UnderexcLimX1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(UnderexcLimX1) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "UnderexcLimX1";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
