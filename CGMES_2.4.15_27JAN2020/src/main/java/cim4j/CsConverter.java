/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * DC side of the current source converter (CSC).
 */
public class CsConverter extends ACDCConverter {

	private static final Logging LOG = Logging.getLogger(CsConverter.class);

	private BaseClass[] CsConverter_class_attributes;
	private BaseClass[] CsConverter_primitive_attributes;
	private java.lang.String rdfid;

	private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
	static {
		ATTRIBUTE_NAMES_MAP = new CsConverter().getAttributeNamesMap();
	}

	private enum CsConverter_primitive_builder implements PrimitiveBuilder {
		alpha() {
			public BaseClass construct(java.lang.String value) {
				return new AngleDegrees(value);
			}
		},
		gamma() {
			public BaseClass construct(java.lang.String value) {
				return new AngleDegrees(value);
			}
		},
		maxAlpha() {
			public BaseClass construct(java.lang.String value) {
				return new AngleDegrees(value);
			}
		},
		maxGamma() {
			public BaseClass construct(java.lang.String value) {
				return new AngleDegrees(value);
			}
		},
		maxIdc() {
			public BaseClass construct(java.lang.String value) {
				return new CurrentFlow(value);
			}
		},
		minAlpha() {
			public BaseClass construct(java.lang.String value) {
				return new AngleDegrees(value);
			}
		},
		minGamma() {
			public BaseClass construct(java.lang.String value) {
				return new AngleDegrees(value);
			}
		},
		minIdc() {
			public BaseClass construct(java.lang.String value) {
				return new CurrentFlow(value);
			}
		},
		operatingMode() {
			public BaseClass construct(java.lang.String value) {
				return new CsOperatingModeKind(value);
			}
		},
		pPccControl() {
			public BaseClass construct(java.lang.String value) {
				return new CsPpccControlKind(value);
			}
		},
		ratedIdc() {
			public BaseClass construct(java.lang.String value) {
				return new CurrentFlow(value);
			}
		},
		targetAlpha() {
			public BaseClass construct(java.lang.String value) {
				return new AngleDegrees(value);
			}
		},
		targetGamma() {
			public BaseClass construct(java.lang.String value) {
				return new AngleDegrees(value);
			}
		},
		targetIdc() {
			public BaseClass construct(java.lang.String value) {
				return new CurrentFlow(value);
			}
		},
		LAST_ENUM() {
			public BaseClass construct(java.lang.String value) {
				return new Integer("0");
			}
		}
	}

	private enum CsConverter_class_attributes_enum {
		alpha,
		gamma,
		maxAlpha,
		maxGamma,
		maxIdc,
		minAlpha,
		minGamma,
		minIdc,
		operatingMode,
		pPccControl,
		ratedIdc,
		targetAlpha,
		targetGamma,
		targetIdc,
		LAST_ENUM
	}

	public CsConverter() {
		CsConverter_primitive_attributes = new BaseClass[CsConverter_primitive_builder.values().length];
		CsConverter_class_attributes = new BaseClass[CsConverter_class_attributes_enum.values().length];
	}

	@Override
	public BaseClass construct() {
		return new CsConverter();
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

	private void updateAttributeInArray(CsConverter_class_attributes_enum attrEnum, BaseClass value) {
		try {
			CsConverter_class_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	private void updateAttributeInArray(CsConverter_primitive_builder attrEnum, BaseClass value) {
		try {
			CsConverter_primitive_attributes[attrEnum.ordinal()] = value;
		} catch (ArrayIndexOutOfBoundsException aoobe) {
			LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			CsConverter_class_attributes_enum attrEnum = CsConverter_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			LOG.debug("Updated CsConverter, setting " + attrName);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			CsConverter_primitive_builder attrEnum = CsConverter_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			LOG.debug("Updated CsConverter, setting " + attrName + " to: " + value);
		} catch (IllegalArgumentException iae) {
			super.setAttribute(attrName, value);
		}
	}

	@Override
	public BaseClass getAttribute(java.lang.String attrName) {
		boolean defined = false;
		try {
			CsConverter_primitive_builder attrEnum = CsConverter_primitive_builder.valueOf(attrName);
			defined = true;
			BaseClass attrValue = CsConverter_primitive_attributes[attrEnum.ordinal()];
			if (attrValue != null) {
				return attrValue;
			}
		} catch (IllegalArgumentException ignored) {
		}

		try {
			CsConverter_class_attributes_enum attrEnum = CsConverter_class_attributes_enum.valueOf(attrName);
			defined = true;
			BaseClass attrValue = CsConverter_class_attributes[attrEnum.ordinal()];
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
		for (var enumValue : CsConverter_primitive_builder.values()) {
			if (enumValue != CsConverter_primitive_builder.LAST_ENUM) {
				namesMap.put(enumValue.name(), "CsConverter." + enumValue.name());
			}
		}
		for (var enumValue : CsConverter_class_attributes_enum.values()) {
			if (enumValue != CsConverter_class_attributes_enum.LAST_ENUM) {
				namesMap.put(enumValue.name(), "CsConverter." + enumValue.name());
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
			for (CsConverter_primitive_builder attrEnum : CsConverter_primitive_builder.values()) {
				BaseClass bc = CsConverter_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    CsConverter." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (CsConverter_class_attributes_enum attrEnum : CsConverter_class_attributes_enum.values()) {
				BaseClass bc = CsConverter_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    CsConverter." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		} else {
			result += "(CsConverter) RDFID: " + rdfid;
		}
		return result;
	}

	private final java.lang.String debugName = "CsConverter";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
