/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * A ProtectedSwitch is a switching device that can be operated by ProtectionEquipment.
 */
public class ProtectedSwitch extends Switch {

	private static final Logging LOG = Logging.getLogger(ProtectedSwitch.class);

	private BaseClass[] ProtectedSwitch_class_attributes;
	private BaseClass[] ProtectedSwitch_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new ProtectedSwitch().getAttributeNamesMap();
	}

	private enum ProtectedSwitch_primitive_builder implements PrimitiveBuilder {
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum ProtectedSwitch_class_attributes_enum {
		LAST_ENUM
	}

	public ProtectedSwitch() {
		ProtectedSwitch_primitive_attributes = new BaseClass[ProtectedSwitch_primitive_builder.values().length];
		ProtectedSwitch_class_attributes = new BaseClass[ProtectedSwitch_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new ProtectedSwitch();
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

	private void updateAttributeInArray(ProtectedSwitch_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ProtectedSwitch_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(ProtectedSwitch_primitive_builder attrEnum, BaseClass value) {
		try {
			ProtectedSwitch_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ProtectedSwitch_class_attributes_enum attrEnum = ProtectedSwitch_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated ProtectedSwitch, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ProtectedSwitch_primitive_builder attrEnum = ProtectedSwitch_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated ProtectedSwitch, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			ProtectedSwitch_primitive_builder attrEnum = ProtectedSwitch_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ProtectedSwitch_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			ProtectedSwitch_class_attributes_enum attrEnum = ProtectedSwitch_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = ProtectedSwitch_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : ProtectedSwitch_primitive_builder.values()) {
			if (enumValue != ProtectedSwitch_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ProtectedSwitch." + enumValue.name());
			}
		}
		for (var enumValue : ProtectedSwitch_class_attributes_enum.values()) {
			if (enumValue != ProtectedSwitch_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "ProtectedSwitch." + enumValue.name());
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
			for (ProtectedSwitch_primitive_builder attrEnum : ProtectedSwitch_primitive_builder.values()) {
				BaseClass bc = ProtectedSwitch_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ProtectedSwitch." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ProtectedSwitch_class_attributes_enum attrEnum : ProtectedSwitch_class_attributes_enum.values()) {
				BaseClass bc = ProtectedSwitch_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ProtectedSwitch." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(ProtectedSwitch) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "ProtectedSwitch";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
