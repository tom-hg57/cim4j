/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Turbine Load Controller model developed in the WECC.  This model represents a supervisory turbine load controller that acts to maintain turbine power at a set value by continuous adjustment of the turbine governor speed-load reference. This model is intended to represent slow reset 'outer loop' controllers managing the action of the turbine governor.
 */
public class TurbLCFB1 extends TurbineLoadControllerDynamics {

	private static final Logging LOG = Logging.getLogger(TurbLCFB1.class);

	private BaseClass[] TurbLCFB1_class_attributes;
	private BaseClass[] TurbLCFB1_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new TurbLCFB1().getAttributeNamesMap();
	}

	private enum TurbLCFB1_primitive_builder implements PrimitiveBuilder {
		db() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		emax() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		fb() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		fbf() {
			public BaseClass construct(java.lang.String value) {
				return new Boolean(value);
			}
		},
		irmax() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		ki() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		kp() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		mwbase() {
			public BaseClass construct(java.lang.String value) {
				return new ActivePower(value);
			}
		},
		pbf() {
			public BaseClass construct(java.lang.String value) {
				return new Boolean(value);
			}
		},
		pmwset() {
			public BaseClass construct(java.lang.String value) {
				return new ActivePower(value);
			}
		},
		speedReferenceGovernor() {
			public BaseClass construct(java.lang.String value) {
				return new Boolean(value);
			}
		},
		tpelec() {
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

	private enum TurbLCFB1_class_attributes_enum {
		db,
		emax,
		fb,
		fbf,
		irmax,
		ki,
		kp,
		mwbase,
		pbf,
		pmwset,
		speedReferenceGovernor,
		tpelec,
		LAST_ENUM
	}

	public TurbLCFB1() {
		TurbLCFB1_primitive_attributes = new BaseClass[TurbLCFB1_primitive_builder.values().length];
		TurbLCFB1_class_attributes = new BaseClass[TurbLCFB1_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new TurbLCFB1();
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

	private void updateAttributeInArray(TurbLCFB1_class_attributes_enum attrEnum, BaseClass value) {
		try {
			TurbLCFB1_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(TurbLCFB1_primitive_builder attrEnum, BaseClass value) {
		try {
			TurbLCFB1_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			TurbLCFB1_class_attributes_enum attrEnum = TurbLCFB1_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated TurbLCFB1, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			TurbLCFB1_primitive_builder attrEnum = TurbLCFB1_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated TurbLCFB1, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			TurbLCFB1_primitive_builder attrEnum = TurbLCFB1_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = TurbLCFB1_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			TurbLCFB1_class_attributes_enum attrEnum = TurbLCFB1_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = TurbLCFB1_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : TurbLCFB1_primitive_builder.values()) {
			if (enumValue != TurbLCFB1_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "TurbLCFB1." + enumValue.name());
			}
		}
		for (var enumValue : TurbLCFB1_class_attributes_enum.values()) {
			if (enumValue != TurbLCFB1_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "TurbLCFB1." + enumValue.name());
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
			for (TurbLCFB1_primitive_builder attrEnum : TurbLCFB1_primitive_builder.values()) {
				BaseClass bc = TurbLCFB1_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    TurbLCFB1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (TurbLCFB1_class_attributes_enum attrEnum : TurbLCFB1_class_attributes_enum.values()) {
				BaseClass bc = TurbLCFB1_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    TurbLCFB1." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(TurbLCFB1) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "TurbLCFB1";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
