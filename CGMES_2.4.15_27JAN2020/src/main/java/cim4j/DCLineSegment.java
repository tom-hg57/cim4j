/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * A wire or combination of wires not insulated from one another, with consistent electrical characteristics, used to carry direct current between points in the DC region of the power system.
 */
public class DCLineSegment extends DCConductingEquipment {

	private static final Logging LOG = Logging.getLogger(DCLineSegment.class);

	private BaseClass[] DCLineSegment_class_attributes;
	private BaseClass[] DCLineSegment_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new DCLineSegment().getAttributeNamesMap();
	}

	private enum DCLineSegment_primitive_builder implements PrimitiveBuilder {
		capacitance() {
			public BaseClass construct(java.lang.String value) {
				return new Capacitance(value);
			}
		},
		inductance() {
			public BaseClass construct(java.lang.String value) {
				return new Inductance(value);
			}
		},
		length() {
			public BaseClass construct(java.lang.String value) {
				return new Length(value);
			}
		},
		resistance() {
			public BaseClass construct(java.lang.String value) {
				return new Resistance(value);
			}
		},
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum DCLineSegment_class_attributes_enum {
		PerLengthParameter,
		capacitance,
		inductance,
		length,
		resistance,
		LAST_ENUM
	}

	public DCLineSegment() {
		DCLineSegment_primitive_attributes = new BaseClass[DCLineSegment_primitive_builder.values().length];
		DCLineSegment_class_attributes = new BaseClass[DCLineSegment_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new DCLineSegment();
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

	private void updateAttributeInArray(DCLineSegment_class_attributes_enum attrEnum, BaseClass value) {
		try {
			DCLineSegment_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(DCLineSegment_primitive_builder attrEnum, BaseClass value) {
		try {
			DCLineSegment_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			DCLineSegment_class_attributes_enum attrEnum = DCLineSegment_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated DCLineSegment, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			DCLineSegment_primitive_builder attrEnum = DCLineSegment_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated DCLineSegment, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			DCLineSegment_primitive_builder attrEnum = DCLineSegment_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = DCLineSegment_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			DCLineSegment_class_attributes_enum attrEnum = DCLineSegment_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = DCLineSegment_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : DCLineSegment_primitive_builder.values()) {
			if (enumValue != DCLineSegment_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "DCLineSegment." + enumValue.name());
			}
		}
		for (var enumValue : DCLineSegment_class_attributes_enum.values()) {
			if (enumValue != DCLineSegment_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "DCLineSegment." + enumValue.name());
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
			for (DCLineSegment_primitive_builder attrEnum : DCLineSegment_primitive_builder.values()) {
				BaseClass bc = DCLineSegment_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DCLineSegment." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (DCLineSegment_class_attributes_enum attrEnum : DCLineSegment_class_attributes_enum.values()) {
				BaseClass bc = DCLineSegment_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DCLineSegment." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(DCLineSegment) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "DCLineSegment";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
