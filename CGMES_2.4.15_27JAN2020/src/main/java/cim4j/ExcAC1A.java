/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Modified IEEE AC1A alternator-supplied rectifier excitation system with different rate feedback source.
 */
public class ExcAC1A extends ExcitationSystemDynamics {

	private static final Logging LOG = Logging.getLogger(ExcAC1A.class);

	private BaseClass[] ExcAC1A_class_attributes;
	private BaseClass[] ExcAC1A_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new ExcAC1A().getAttributeNamesMap();
	}

	private enum ExcAC1A_primitive_builder implements PrimitiveBuilder {
		hvlvgates() {
			public BaseClass construct(java.lang.String value) {
				return new Boolean(value);
			}
		},
		ka() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kc() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kd() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		ke() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kf() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kf1() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kf2() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		ks() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		seve1() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		seve2() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
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
		te() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tf() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		vamax() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		vamin() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		ve1() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		ve2() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		vrmax() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		vrmin() {
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

	private enum ExcAC1A_class_attributes_enum {
		hvlvgates,
		ka,
		kc,
		kd,
		ke,
		kf,
		kf1,
		kf2,
		ks,
		seve1,
		seve2,
		ta,
		tb,
		tc,
		te,
		tf,
		vamax,
		vamin,
		ve1,
		ve2,
		vrmax,
		vrmin,
		LAST_ENUM
	}

	public ExcAC1A() {
		ExcAC1A_primitive_attributes = new BaseClass[ExcAC1A_primitive_builder.values().length];
		ExcAC1A_class_attributes = new BaseClass[ExcAC1A_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new ExcAC1A();
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

	private void updateAttributeInArray(ExcAC1A_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExcAC1A_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(ExcAC1A_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcAC1A_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExcAC1A_class_attributes_enum attrEnum = ExcAC1A_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated ExcAC1A, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcAC1A_primitive_builder attrEnum = ExcAC1A_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated ExcAC1A, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			ExcAC1A_primitive_builder attrEnum = ExcAC1A_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ExcAC1A_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			ExcAC1A_class_attributes_enum attrEnum = ExcAC1A_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ExcAC1A_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : ExcAC1A_primitive_builder.values()) {
			if (enumValue != ExcAC1A_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ExcAC1A." + enumValue.name());
			}
		}
		for (var enumValue : ExcAC1A_class_attributes_enum.values()) {
			if (enumValue != ExcAC1A_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ExcAC1A." + enumValue.name());
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
			for (ExcAC1A_primitive_builder attrEnum : ExcAC1A_primitive_builder.values()) {
				BaseClass bc = ExcAC1A_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcAC1A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExcAC1A_class_attributes_enum attrEnum : ExcAC1A_class_attributes_enum.values()) {
				BaseClass bc = ExcAC1A_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcAC1A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(ExcAC1A) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "ExcAC1A";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
