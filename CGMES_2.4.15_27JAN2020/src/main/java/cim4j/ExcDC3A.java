/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * This is modified IEEE DC3A direct current commutator exciters with speed input, and death band.  DC old type 4.
 */
public class ExcDC3A extends ExcitationSystemDynamics {

	private static final Logging LOG = Logging.getLogger(ExcDC3A.class);

	private BaseClass[] ExcDC3A_class_attributes;
	private BaseClass[] ExcDC3A_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new ExcDC3A().getAttributeNamesMap();
	}

	private enum ExcDC3A_primitive_builder implements PrimitiveBuilder {
		edfmax() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		efd1() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		efd2() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		efdlim() {
			public BaseClass construct(java.lang.String value) {
				return new Boolean(value);
			}
		},
		efdmin() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		exclim() {
			public BaseClass construct(java.lang.String value) {
				return new Boolean(value);
			}
		},
		ke() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kr() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		ks() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kv() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		seefd1() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		seefd2() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		te() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		trh() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
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

	private enum ExcDC3A_class_attributes_enum {
		edfmax,
		efd1,
		efd2,
		efdlim,
		efdmin,
		exclim,
		ke,
		kr,
		ks,
		kv,
		seefd1,
		seefd2,
		te,
		trh,
		vrmax,
		vrmin,
		LAST_ENUM
	}

	public ExcDC3A() {
		ExcDC3A_primitive_attributes = new BaseClass[ExcDC3A_primitive_builder.values().length];
		ExcDC3A_class_attributes = new BaseClass[ExcDC3A_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new ExcDC3A();
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

	private void updateAttributeInArray(ExcDC3A_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExcDC3A_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(ExcDC3A_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcDC3A_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExcDC3A_class_attributes_enum attrEnum = ExcDC3A_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated ExcDC3A, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcDC3A_primitive_builder attrEnum = ExcDC3A_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated ExcDC3A, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			ExcDC3A_primitive_builder attrEnum = ExcDC3A_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ExcDC3A_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			ExcDC3A_class_attributes_enum attrEnum = ExcDC3A_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ExcDC3A_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : ExcDC3A_primitive_builder.values()) {
			if (enumValue != ExcDC3A_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ExcDC3A." + enumValue.name());
			}
		}
		for (var enumValue : ExcDC3A_class_attributes_enum.values()) {
			if (enumValue != ExcDC3A_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ExcDC3A." + enumValue.name());
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
			for (ExcDC3A_primitive_builder attrEnum : ExcDC3A_primitive_builder.values()) {
				BaseClass bc = ExcDC3A_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcDC3A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExcDC3A_class_attributes_enum attrEnum : ExcDC3A_class_attributes_enum.values()) {
				BaseClass bc = ExcDC3A_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcDC3A." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(ExcDC3A) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "ExcDC3A";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
