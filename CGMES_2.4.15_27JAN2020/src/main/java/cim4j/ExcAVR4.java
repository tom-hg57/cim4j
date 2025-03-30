/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Italian excitation system. It represents static exciter and electric voltage regulator.
 */
public class ExcAVR4 extends ExcitationSystemDynamics {

	private static final Logging LOG = Logging.getLogger(ExcAVR4.class);

	private BaseClass[] ExcAVR4_class_attributes;
	private BaseClass[] ExcAVR4_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new ExcAVR4().getAttributeNamesMap();
	}

	private enum ExcAVR4_primitive_builder implements PrimitiveBuilder {
		imul() {
			public BaseClass construct(java.lang.String value) {
				return new Boolean(value);
			}
		},
		ka() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		ke() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		kif() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		t1() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		t1if() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		t2() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		t3() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		t4() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tif() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		vfmn() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		vfmx() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		vrmn() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		vrmx() {
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

	private enum ExcAVR4_class_attributes_enum {
		imul,
		ka,
		ke,
		kif,
		t1,
		t1if,
		t2,
		t3,
		t4,
		tif,
		vfmn,
		vfmx,
		vrmn,
		vrmx,
		LAST_ENUM
	}

	public ExcAVR4() {
		ExcAVR4_primitive_attributes = new BaseClass[ExcAVR4_primitive_builder.values().length];
		ExcAVR4_class_attributes = new BaseClass[ExcAVR4_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new ExcAVR4();
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

	private void updateAttributeInArray(ExcAVR4_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExcAVR4_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(ExcAVR4_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcAVR4_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExcAVR4_class_attributes_enum attrEnum = ExcAVR4_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated ExcAVR4, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcAVR4_primitive_builder attrEnum = ExcAVR4_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated ExcAVR4, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			ExcAVR4_primitive_builder attrEnum = ExcAVR4_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ExcAVR4_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			ExcAVR4_class_attributes_enum attrEnum = ExcAVR4_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ExcAVR4_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : ExcAVR4_primitive_builder.values()) {
			if (enumValue != ExcAVR4_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ExcAVR4." + enumValue.name());
			}
		}
		for (var enumValue : ExcAVR4_class_attributes_enum.values()) {
			if (enumValue != ExcAVR4_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ExcAVR4." + enumValue.name());
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
			for (ExcAVR4_primitive_builder attrEnum : ExcAVR4_primitive_builder.values()) {
				BaseClass bc = ExcAVR4_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcAVR4." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExcAVR4_class_attributes_enum attrEnum : ExcAVR4_class_attributes_enum.values()) {
				BaseClass bc = ExcAVR4_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcAVR4." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(ExcAVR4) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "ExcAVR4";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
