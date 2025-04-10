/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * A wire or combination of wires, with consistent electrical characteristics, building a single electrical system, used to carry alternating current between points in the power system. For symmetrical, transposed 3ph lines, it is sufficient to use  attributes of the line segment, which describe impedances and admittances for the entire length of the segment.  Additionally impedances can be computed by using length and associated per length impedances. The BaseVoltage at the two ends of ACLineSegments in a Line shall have the same BaseVoltage.nominalVoltage. However, boundary lines  may have slightly different BaseVoltage.nominalVoltages and  variation is allowed. Larger voltage difference in general requires use of an equivalent branch.
 */
public class ACLineSegment extends Conductor {

	private static final Logging LOG = Logging.getLogger(ACLineSegment.class);

	private BaseClass[] ACLineSegment_class_attributes;
	private BaseClass[] ACLineSegment_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new ACLineSegment().getAttributeNamesMap();
	}

	private enum ACLineSegment_primitive_builder implements PrimitiveBuilder {
		b0ch() {
			public BaseClass construct(java.lang.String value) {
				return new Susceptance(value);
			}
		},
		bch() {
			public BaseClass construct(java.lang.String value) {
				return new Susceptance(value);
			}
		},
		g0ch() {
			public BaseClass construct(java.lang.String value) {
				return new Conductance(value);
			}
		},
		gch() {
			public BaseClass construct(java.lang.String value) {
				return new Conductance(value);
			}
		},
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
		shortCircuitEndTemperature() {
			public BaseClass construct(java.lang.String value) {
				return new Temperature(value);
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

	private enum ACLineSegment_class_attributes_enum {
		b0ch,
		bch,
		g0ch,
		gch,
		r,
		r0,
		shortCircuitEndTemperature,
		x,
		x0,
		LAST_ENUM
	}

	public ACLineSegment() {
		ACLineSegment_primitive_attributes = new BaseClass[ACLineSegment_primitive_builder.values().length];
		ACLineSegment_class_attributes = new BaseClass[ACLineSegment_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new ACLineSegment();
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

	private void updateAttributeInArray(ACLineSegment_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ACLineSegment_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(ACLineSegment_primitive_builder attrEnum, BaseClass value) {
		try {
			ACLineSegment_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ACLineSegment_class_attributes_enum attrEnum = ACLineSegment_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated ACLineSegment, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ACLineSegment_primitive_builder attrEnum = ACLineSegment_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated ACLineSegment, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			ACLineSegment_primitive_builder attrEnum = ACLineSegment_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ACLineSegment_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			ACLineSegment_class_attributes_enum attrEnum = ACLineSegment_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ACLineSegment_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : ACLineSegment_primitive_builder.values()) {
			if (enumValue != ACLineSegment_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ACLineSegment." + enumValue.name());
			}
		}
		for (var enumValue : ACLineSegment_class_attributes_enum.values()) {
			if (enumValue != ACLineSegment_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ACLineSegment." + enumValue.name());
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
			for (ACLineSegment_primitive_builder attrEnum : ACLineSegment_primitive_builder.values()) {
				BaseClass bc = ACLineSegment_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ACLineSegment." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ACLineSegment_class_attributes_enum attrEnum : ACLineSegment_class_attributes_enum.values()) {
				BaseClass bc = ACLineSegment_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ACLineSegment." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(ACLineSegment) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "ACLineSegment";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
