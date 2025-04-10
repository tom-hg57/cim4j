/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * A rotating machine whose shaft rotates asynchronously with the electrical field.  Also known as an induction machine with no external connection to the rotor windings, e.g squirrel-cage induction machine.
 */
public class AsynchronousMachine extends RotatingMachine {

	private static final Logging LOG = Logging.getLogger(AsynchronousMachine.class);

	private BaseClass[] AsynchronousMachine_class_attributes;
	private BaseClass[] AsynchronousMachine_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new AsynchronousMachine().getAttributeNamesMap();
	}

	private enum AsynchronousMachine_primitive_builder implements PrimitiveBuilder {
		asynchronousMachineType() {
			public BaseClass construct(java.lang.String value) {
				return new AsynchronousMachineKind(value);
			}
		},
		converterFedDrive() {
			public BaseClass construct(java.lang.String value) {
				return new Boolean(value);
			}
		},
		efficiency() {
			public BaseClass construct(java.lang.String value) {
				return new PerCent(value);
			}
		},
		iaIrRatio() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		nominalFrequency() {
			public BaseClass construct(java.lang.String value) {
				return new Frequency(value);
			}
		},
		nominalSpeed() {
			public BaseClass construct(java.lang.String value) {
				return new RotationSpeed(value);
			}
		},
		polePairNumber() {
			public BaseClass construct(java.lang.String value) {
				return new Integer(value);
			}
		},
		ratedMechanicalPower() {
			public BaseClass construct(java.lang.String value) {
				return new ActivePower(value);
			}
		},
		reversible() {
			public BaseClass construct(java.lang.String value) {
				return new Boolean(value);
			}
		},
		rxLockedRotorRatio() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum AsynchronousMachine_class_attributes_enum {
		AsynchronousMachineDynamics,
		asynchronousMachineType,
		converterFedDrive,
		efficiency,
		iaIrRatio,
		nominalFrequency,
		nominalSpeed,
		polePairNumber,
		ratedMechanicalPower,
		reversible,
		rxLockedRotorRatio,
		LAST_ENUM
	}

	public AsynchronousMachine() {
		AsynchronousMachine_primitive_attributes = new BaseClass[AsynchronousMachine_primitive_builder.values().length];
		AsynchronousMachine_class_attributes = new BaseClass[AsynchronousMachine_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new AsynchronousMachine();
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

	private void updateAttributeInArray(AsynchronousMachine_class_attributes_enum attrEnum, BaseClass value) {
		try {
			AsynchronousMachine_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(AsynchronousMachine_primitive_builder attrEnum, BaseClass value) {
		try {
			AsynchronousMachine_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			AsynchronousMachine_class_attributes_enum attrEnum = AsynchronousMachine_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated AsynchronousMachine, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			AsynchronousMachine_primitive_builder attrEnum = AsynchronousMachine_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated AsynchronousMachine, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			AsynchronousMachine_primitive_builder attrEnum = AsynchronousMachine_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = AsynchronousMachine_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			AsynchronousMachine_class_attributes_enum attrEnum = AsynchronousMachine_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = AsynchronousMachine_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : AsynchronousMachine_primitive_builder.values()) {
			if (enumValue != AsynchronousMachine_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "AsynchronousMachine." + enumValue.name());
			}
		}
		for (var enumValue : AsynchronousMachine_class_attributes_enum.values()) {
			if (enumValue != AsynchronousMachine_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "AsynchronousMachine." + enumValue.name());
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
			for (AsynchronousMachine_primitive_builder attrEnum : AsynchronousMachine_primitive_builder.values()) {
				BaseClass bc = AsynchronousMachine_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    AsynchronousMachine." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (AsynchronousMachine_class_attributes_enum attrEnum : AsynchronousMachine_class_attributes_enum.values()) {
				BaseClass bc = AsynchronousMachine_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    AsynchronousMachine." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(AsynchronousMachine) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "AsynchronousMachine";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
