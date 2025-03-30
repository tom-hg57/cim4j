/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * The class represents IEEE Voltage Adjuster which is used to represent the voltage adjuster in either a power factor or var control system.  Reference: IEEE Standard 421.5-2005 Section 11.1.
 */
public class VAdjIEEE extends VoltageAdjusterDynamics {

	private static final Logging LOG = Logging.getLogger(VAdjIEEE.class);

	private BaseClass[] VAdjIEEE_class_attributes;
	private BaseClass[] VAdjIEEE_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new VAdjIEEE().getAttributeNamesMap();
	}

	private enum VAdjIEEE_primitive_builder implements PrimitiveBuilder {
		adjslew() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		taoff() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		taon() {
			public BaseClass construct(java.lang.String value) {
				return new Seconds(value);
			}
		},
		vadjf() {
			public BaseClass construct(java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		vadjmax() {
			public BaseClass construct(java.lang.String value) {
				return new PU(value);
			}
		},
		vadjmin() {
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

	private enum VAdjIEEE_class_attributes_enum {
		adjslew,
		taoff,
		taon,
		vadjf,
		vadjmax,
		vadjmin,
		LAST_ENUM
	}

	public VAdjIEEE() {
		VAdjIEEE_primitive_attributes = new BaseClass[VAdjIEEE_primitive_builder.values().length];
		VAdjIEEE_class_attributes = new BaseClass[VAdjIEEE_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new VAdjIEEE();
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

	private void updateAttributeInArray(VAdjIEEE_class_attributes_enum attrEnum, BaseClass value) {
		try {
			VAdjIEEE_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(VAdjIEEE_primitive_builder attrEnum, BaseClass value) {
		try {
			VAdjIEEE_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			VAdjIEEE_class_attributes_enum attrEnum = VAdjIEEE_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated VAdjIEEE, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			VAdjIEEE_primitive_builder attrEnum = VAdjIEEE_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated VAdjIEEE, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			VAdjIEEE_primitive_builder attrEnum = VAdjIEEE_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = VAdjIEEE_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			VAdjIEEE_class_attributes_enum attrEnum = VAdjIEEE_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = VAdjIEEE_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : VAdjIEEE_primitive_builder.values()) {
			if (enumValue != VAdjIEEE_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "VAdjIEEE." + enumValue.name());
			}
		}
		for (var enumValue : VAdjIEEE_class_attributes_enum.values()) {
			if (enumValue != VAdjIEEE_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "VAdjIEEE." + enumValue.name());
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
			for (VAdjIEEE_primitive_builder attrEnum : VAdjIEEE_primitive_builder.values()) {
				BaseClass bc = VAdjIEEE_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    VAdjIEEE." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (VAdjIEEE_class_attributes_enum attrEnum : VAdjIEEE_class_attributes_enum.values()) {
				BaseClass bc = VAdjIEEE_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    VAdjIEEE." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(VAdjIEEE) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "VAdjIEEE";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
