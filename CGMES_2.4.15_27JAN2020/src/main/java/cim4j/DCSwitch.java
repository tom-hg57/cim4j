/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * A switch within the DC system.
 */
public class DCSwitch extends DCConductingEquipment {

	private static final Logging LOG = Logging.getLogger(DCSwitch.class);

	private BaseClass[] DCSwitch_class_attributes;
	private BaseClass[] DCSwitch_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new DCSwitch().getAttributeNamesMap();
	}

	private enum DCSwitch_primitive_builder implements PrimitiveBuilder {
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum DCSwitch_class_attributes_enum {
		LAST_ENUM
	}

	public DCSwitch() {
		DCSwitch_primitive_attributes = new BaseClass[DCSwitch_primitive_builder.values().length];
		DCSwitch_class_attributes = new BaseClass[DCSwitch_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new DCSwitch();
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

	private void updateAttributeInArray(DCSwitch_class_attributes_enum attrEnum, BaseClass value) {
		try {
			DCSwitch_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(DCSwitch_primitive_builder attrEnum, BaseClass value) {
		try {
			DCSwitch_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			DCSwitch_class_attributes_enum attrEnum = DCSwitch_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated DCSwitch, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			DCSwitch_primitive_builder attrEnum = DCSwitch_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated DCSwitch, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			DCSwitch_primitive_builder attrEnum = DCSwitch_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = DCSwitch_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			DCSwitch_class_attributes_enum attrEnum = DCSwitch_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = DCSwitch_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : DCSwitch_primitive_builder.values()) {
			if (enumValue != DCSwitch_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "DCSwitch." + enumValue.name());
			}
		}
		for (var enumValue : DCSwitch_class_attributes_enum.values()) {
			if (enumValue != DCSwitch_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "DCSwitch." + enumValue.name());
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
			for (DCSwitch_primitive_builder attrEnum : DCSwitch_primitive_builder.values()) {
				BaseClass bc = DCSwitch_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DCSwitch." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (DCSwitch_class_attributes_enum attrEnum : DCSwitch_class_attributes_enum.values()) {
				BaseClass bc = DCSwitch_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DCSwitch." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(DCSwitch) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "DCSwitch";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
