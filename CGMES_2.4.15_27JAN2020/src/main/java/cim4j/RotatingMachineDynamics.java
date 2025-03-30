/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Abstract parent class for all synchronous and asynchronous machine standard models.
 */
public class RotatingMachineDynamics extends DynamicsFunctionBlock {

	private static final Logging LOG = Logging.getLogger(RotatingMachineDynamics.class);

	private BaseClass[] RotatingMachineDynamics_class_attributes;
	private BaseClass[] RotatingMachineDynamics_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new RotatingMachineDynamics().getAttributeNamesMap();
	}

	private enum RotatingMachineDynamics_primitive_builder implements PrimitiveBuilder {
		damping() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		inertia() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		saturationFactor() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		saturationFactor120() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		statorLeakageReactance() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		statorResistance() {
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

	private enum RotatingMachineDynamics_class_attributes_enum {
		damping,
		inertia,
		saturationFactor,
		saturationFactor120,
		statorLeakageReactance,
		statorResistance,
		LAST_ENUM
	}

	public RotatingMachineDynamics() {
		RotatingMachineDynamics_primitive_attributes = new BaseClass[RotatingMachineDynamics_primitive_builder.values().length];
		RotatingMachineDynamics_class_attributes = new BaseClass[RotatingMachineDynamics_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new RotatingMachineDynamics();
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

	private void updateAttributeInArray(RotatingMachineDynamics_class_attributes_enum attrEnum, BaseClass value) {
		try {
			RotatingMachineDynamics_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(RotatingMachineDynamics_primitive_builder attrEnum, BaseClass value) {
		try {
			RotatingMachineDynamics_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			RotatingMachineDynamics_class_attributes_enum attrEnum = RotatingMachineDynamics_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated RotatingMachineDynamics, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			RotatingMachineDynamics_primitive_builder attrEnum = RotatingMachineDynamics_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated RotatingMachineDynamics, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			RotatingMachineDynamics_primitive_builder attrEnum = RotatingMachineDynamics_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = RotatingMachineDynamics_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			RotatingMachineDynamics_class_attributes_enum attrEnum = RotatingMachineDynamics_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = RotatingMachineDynamics_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : RotatingMachineDynamics_primitive_builder.values()) {
			if (enumValue != RotatingMachineDynamics_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "RotatingMachineDynamics." + enumValue.name());
			}
		}
		for (var enumValue : RotatingMachineDynamics_class_attributes_enum.values()) {
			if (enumValue != RotatingMachineDynamics_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "RotatingMachineDynamics." + enumValue.name());
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
			for (RotatingMachineDynamics_primitive_builder attrEnum : RotatingMachineDynamics_primitive_builder.values()) {
				BaseClass bc = RotatingMachineDynamics_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    RotatingMachineDynamics." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (RotatingMachineDynamics_class_attributes_enum attrEnum : RotatingMachineDynamics_class_attributes_enum.values()) {
				BaseClass bc = RotatingMachineDynamics_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    RotatingMachineDynamics." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(RotatingMachineDynamics) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "RotatingMachineDynamics";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
