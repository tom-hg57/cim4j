/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * The class represents the Type UEL1 model which has a circular limit boundary when plotted in terms of machine reactive power vs. real power output.  Reference: IEEE UEL1 421.5-2005 Section 10.1.
 */
public class UnderexcLimIEEE1 extends UnderexcitationLimiterDynamics {

	private static final Logging LOG = Logging.getLogger(UnderexcLimIEEE1.class);

	private BaseClass[] UnderexcLimIEEE1_class_attributes;
	private BaseClass[] UnderexcLimIEEE1_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new UnderexcLimIEEE1().getAttributeNamesMap();
	}

	private enum UnderexcLimIEEE1_primitive_builder implements PrimitiveBuilder {
		kuc() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kuf() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kui() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kul() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kur() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		tu1() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tu2() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tu3() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tu4() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		vucmax() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		vuimax() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		vuimin() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		vulmax() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		vulmin() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		vurmax() {
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

	private enum UnderexcLimIEEE1_class_attributes_enum {
		kuc,
		kuf,
		kui,
		kul,
		kur,
		tu1,
		tu2,
		tu3,
		tu4,
		vucmax,
		vuimax,
		vuimin,
		vulmax,
		vulmin,
		vurmax,
		LAST_ENUM
	}

	public UnderexcLimIEEE1() {
		UnderexcLimIEEE1_primitive_attributes = new BaseClass[UnderexcLimIEEE1_primitive_builder.values().length];
		UnderexcLimIEEE1_class_attributes = new BaseClass[UnderexcLimIEEE1_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new UnderexcLimIEEE1();
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

	private void updateAttributeInArray(UnderexcLimIEEE1_class_attributes_enum attrEnum, BaseClass value) {
		try {
			UnderexcLimIEEE1_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(UnderexcLimIEEE1_primitive_builder attrEnum, BaseClass value) {
		try {
			UnderexcLimIEEE1_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			UnderexcLimIEEE1_class_attributes_enum attrEnum = UnderexcLimIEEE1_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated UnderexcLimIEEE1, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			UnderexcLimIEEE1_primitive_builder attrEnum = UnderexcLimIEEE1_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated UnderexcLimIEEE1, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			UnderexcLimIEEE1_primitive_builder attrEnum = UnderexcLimIEEE1_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = UnderexcLimIEEE1_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			UnderexcLimIEEE1_class_attributes_enum attrEnum = UnderexcLimIEEE1_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = UnderexcLimIEEE1_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : UnderexcLimIEEE1_primitive_builder.values()) {
			if (enumValue != UnderexcLimIEEE1_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "UnderexcLimIEEE1." + enumValue.name());
			}
		}
		for (var enumValue : UnderexcLimIEEE1_class_attributes_enum.values()) {
			if (enumValue != UnderexcLimIEEE1_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "UnderexcLimIEEE1." + enumValue.name());
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
			for (UnderexcLimIEEE1_primitive_builder attrEnum : UnderexcLimIEEE1_primitive_builder.values()) {
				BaseClass bc = UnderexcLimIEEE1_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    UnderexcLimIEEE1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (UnderexcLimIEEE1_class_attributes_enum attrEnum : UnderexcLimIEEE1_class_attributes_enum.values()) {
				BaseClass bc = UnderexcLimIEEE1_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    UnderexcLimIEEE1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(UnderexcLimIEEE1) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "UnderexcLimIEEE1";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
