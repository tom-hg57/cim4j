/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * PTI Microprocessor-Based Stabilizer type 1.
 */
public class PssPTIST1 extends PowerSystemStabilizerDynamics {

	private static final Logging LOG = Logging.getLogger(PssPTIST1.class);

	private BaseClass[] PssPTIST1_class_attributes;
	private BaseClass[] PssPTIST1_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new PssPTIST1().getAttributeNamesMap();
	}

	private enum PssPTIST1_primitive_builder implements PrimitiveBuilder {
		dtc() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		dtf() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		dtp() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		k() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		m() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		t1() {
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
		tf() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		tp() {
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

	private enum PssPTIST1_class_attributes_enum {
		dtc,
		dtf,
		dtp,
		k,
		m,
		t1,
		t2,
		t3,
		t4,
		tf,
		tp,
		LAST_ENUM
	}

	public PssPTIST1() {
		PssPTIST1_primitive_attributes = new BaseClass[PssPTIST1_primitive_builder.values().length];
		PssPTIST1_class_attributes = new BaseClass[PssPTIST1_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new PssPTIST1();
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

	private void updateAttributeInArray(PssPTIST1_class_attributes_enum attrEnum, BaseClass value) {
		try {
			PssPTIST1_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(PssPTIST1_primitive_builder attrEnum, BaseClass value) {
		try {
			PssPTIST1_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			PssPTIST1_class_attributes_enum attrEnum = PssPTIST1_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated PssPTIST1, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			PssPTIST1_primitive_builder attrEnum = PssPTIST1_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated PssPTIST1, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			PssPTIST1_primitive_builder attrEnum = PssPTIST1_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = PssPTIST1_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			PssPTIST1_class_attributes_enum attrEnum = PssPTIST1_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = PssPTIST1_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : PssPTIST1_primitive_builder.values()) {
			if (enumValue != PssPTIST1_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "PssPTIST1." + enumValue.name());
			}
		}
		for (var enumValue : PssPTIST1_class_attributes_enum.values()) {
			if (enumValue != PssPTIST1_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "PssPTIST1." + enumValue.name());
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
			for (PssPTIST1_primitive_builder attrEnum : PssPTIST1_primitive_builder.values()) {
				BaseClass bc = PssPTIST1_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PssPTIST1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (PssPTIST1_class_attributes_enum attrEnum : PssPTIST1_class_attributes_enum.values()) {
				BaseClass bc = PssPTIST1_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PssPTIST1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(PssPTIST1) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "PssPTIST1";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
