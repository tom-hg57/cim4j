/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * A Series Compensator is a series capacitor or reactor or an AC transmission line without charging susceptance.  It is a two terminal device.
 */
public class SeriesCompensator extends ConductingEquipment {

	private static final Logging LOG = Logging.getLogger(SeriesCompensator.class);

	private BaseClass[] SeriesCompensator_class_attributes;
	private BaseClass[] SeriesCompensator_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new SeriesCompensator().getAttributeNamesMap();
	}

	private enum SeriesCompensator_primitive_builder implements PrimitiveBuilder {
		r() {
			public BaseClass construct(java.lang.String value) {
				return new Resistance(value);
			}
		},
		r0() {
			public BaseClass construct(java.lang.String value) {
				return new Resistance(value);
			}
		},
		varistorPresent() {
			public BaseClass construct(java.lang.String value) {
				return new Boolean(value);
			}
		},
		varistorRatedCurrent() {
			public BaseClass construct(java.lang.String value) {
				return new CurrentFlow(value);
			}
		},
		varistorVoltageThreshold() {
			public BaseClass construct(java.lang.String value) {
				return new Voltage(value);
			}
		},
		x() {
			public BaseClass construct(java.lang.String value) {
				return new Reactance(value);
			}
		},
		x0() {
			public BaseClass construct(java.lang.String value) {
				return new Reactance(value);
			}
		},
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum SeriesCompensator_class_attributes_enum {
		r,
		r0,
		varistorPresent,
		varistorRatedCurrent,
		varistorVoltageThreshold,
		x,
		x0,
		LAST_ENUM
	}

	public SeriesCompensator() {
		SeriesCompensator_primitive_attributes = new BaseClass[SeriesCompensator_primitive_builder.values().length];
		SeriesCompensator_class_attributes = new BaseClass[SeriesCompensator_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new SeriesCompensator();
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

	private void updateAttributeInArray(SeriesCompensator_class_attributes_enum attrEnum, BaseClass value) {
		try {
			SeriesCompensator_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(SeriesCompensator_primitive_builder attrEnum, BaseClass value) {
		try {
			SeriesCompensator_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			SeriesCompensator_class_attributes_enum attrEnum = SeriesCompensator_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated SeriesCompensator, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			SeriesCompensator_primitive_builder attrEnum = SeriesCompensator_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated SeriesCompensator, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			SeriesCompensator_primitive_builder attrEnum = SeriesCompensator_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = SeriesCompensator_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			SeriesCompensator_class_attributes_enum attrEnum = SeriesCompensator_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = SeriesCompensator_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : SeriesCompensator_primitive_builder.values()) {
			if (enumValue != SeriesCompensator_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "SeriesCompensator." + enumValue.name());
			}
		}
		for (var enumValue : SeriesCompensator_class_attributes_enum.values()) {
			if (enumValue != SeriesCompensator_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "SeriesCompensator." + enumValue.name());
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
			for (SeriesCompensator_primitive_builder attrEnum : SeriesCompensator_primitive_builder.values()) {
				BaseClass bc = SeriesCompensator_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    SeriesCompensator." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (SeriesCompensator_class_attributes_enum attrEnum : SeriesCompensator_class_attributes_enum.values()) {
				BaseClass bc = SeriesCompensator_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    SeriesCompensator." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(SeriesCompensator) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "SeriesCompensator";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
