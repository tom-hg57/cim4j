/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Models the characteristic response of the load demand due to changes in system conditions such as voltage and frequency. It is not related to demand response. If LoadResponseCharacteristic.exponentModel is True, the exponential voltage or frequency dependent models are specified and used as to calculate active and reactive power components of the load model. The equations to calculate active and reactive power components of the load model are internal to the power flow calculation, hence they use different quantities depending on the use case of the data exchange.  The equations for exponential voltage dependent load model injected power are:  pInjection= Pnominal* (Voltage/cim:BaseVoltage.nominalVoltage) ** cim:LoadResponseCharacteristic.pVoltageExponent qInjection= Qnominal* (Voltage/cim:BaseVoltage.nominalVoltage) ** cim:LoadResponseCharacteristic.qVoltageExponent Where:  1) * means "multiply" and ** is "raised to power of"; 2) Pnominal and Qnominal represent the active power and reactive power at nominal voltage as any load described by the voltage exponential model shall be given at nominal voltage.  This means that EnergyConsumer.p and EnergyConsumer.q  are at nominal voltage. 3) After power flow is solved:  -pInjection and qInjection correspond to SvPowerflow.p and SvPowerflow.q respectively.   - Voltage corresponds to SvVoltage.v at the TopologicalNode where the load is connected.
 */
public class LoadResponseCharacteristic extends IdentifiedObject {

    private static final Logging LOG = Logging.getLogger(LoadResponseCharacteristic.class);

    private BaseClass[] LoadResponseCharacteristic_class_attributes;
    private BaseClass[] LoadResponseCharacteristic_primitive_attributes;
    private java.lang.String rdfid;

    private static final Map<java.lang.String, java.lang.String> ATTRIBUTE_NAMES_MAP;
    static {
        ATTRIBUTE_NAMES_MAP = new LoadResponseCharacteristic().getAttributeNamesMap();
    }

    private enum LoadResponseCharacteristic_primitive_builder implements PrimitiveBuilder {
        exponentModel() {
            public BaseClass construct(java.lang.String value) {
                return new Boolean(value);
            }
        },
        pConstantCurrent() {
            public BaseClass construct(java.lang.String value) {
                return new Float(value);
            }
        },
        pConstantImpedance() {
            public BaseClass construct(java.lang.String value) {
                return new Float(value);
            }
        },
        pConstantPower() {
            public BaseClass construct(java.lang.String value) {
                return new Float(value);
            }
        },
        pFrequencyExponent() {
            public BaseClass construct(java.lang.String value) {
                return new Float(value);
            }
        },
        pVoltageExponent() {
            public BaseClass construct(java.lang.String value) {
                return new Float(value);
            }
        },
        qConstantCurrent() {
            public BaseClass construct(java.lang.String value) {
                return new Float(value);
            }
        },
        qConstantImpedance() {
            public BaseClass construct(java.lang.String value) {
                return new Float(value);
            }
        },
        qConstantPower() {
            public BaseClass construct(java.lang.String value) {
                return new Float(value);
            }
        },
        qFrequencyExponent() {
            public BaseClass construct(java.lang.String value) {
                return new Float(value);
            }
        },
        qVoltageExponent() {
            public BaseClass construct(java.lang.String value) {
                return new Float(value);
            }
        },
        LAST_ENUM() {
            public BaseClass construct(java.lang.String value) {
                return new Integer("0");
            }
        }
    }

    private enum LoadResponseCharacteristic_class_attributes_enum {
        EnergyConsumer,
        exponentModel,
        pConstantCurrent,
        pConstantImpedance,
        pConstantPower,
        pFrequencyExponent,
        pVoltageExponent,
        qConstantCurrent,
        qConstantImpedance,
        qConstantPower,
        qFrequencyExponent,
        qVoltageExponent,
        LAST_ENUM
    }

    public LoadResponseCharacteristic() {
        LoadResponseCharacteristic_primitive_attributes = new BaseClass[LoadResponseCharacteristic_primitive_builder.values().length];
        LoadResponseCharacteristic_class_attributes = new BaseClass[LoadResponseCharacteristic_class_attributes_enum.values().length];
    }

    @Override
    public BaseClass construct() {
        return new LoadResponseCharacteristic();
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

    private void updateAttributeInArray(LoadResponseCharacteristic_class_attributes_enum attrEnum, BaseClass value) {
        try {
            LoadResponseCharacteristic_class_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    private void updateAttributeInArray(LoadResponseCharacteristic_primitive_builder attrEnum, BaseClass value) {
        try {
            LoadResponseCharacteristic_primitive_attributes[attrEnum.ordinal()] = value;
        } catch (ArrayIndexOutOfBoundsException aoobe) {
            LOG.error("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
        }
    }

    @Override
    public void setAttribute(java.lang.String attrName, BaseClass value) {
        try {
            LoadResponseCharacteristic_class_attributes_enum attrEnum = LoadResponseCharacteristic_class_attributes_enum.valueOf(attrName);
            updateAttributeInArray(attrEnum, value);
            LOG.debug("Updated LoadResponseCharacteristic, setting " + attrName);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    /* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
    public void setAttribute(java.lang.String attrName, java.lang.String value) {
        try {
            LoadResponseCharacteristic_primitive_builder attrEnum = LoadResponseCharacteristic_primitive_builder.valueOf(attrName);
            updateAttributeInArray(attrEnum, attrEnum.construct(value));
            LOG.debug("Updated LoadResponseCharacteristic, setting " + attrName + " to: " + value);
        } catch (IllegalArgumentException iae) {
            super.setAttribute(attrName, value);
        }
    }

    @Override
    public BaseClass getAttribute(java.lang.String attrName) {
        boolean defined = false;
        try {
            LoadResponseCharacteristic_primitive_builder attrEnum = LoadResponseCharacteristic_primitive_builder.valueOf(attrName);
            defined = true;
            BaseClass attrValue = LoadResponseCharacteristic_primitive_attributes[attrEnum.ordinal()];
            if (attrValue != null) {
                return attrValue;
            }
        } catch (IllegalArgumentException ignored) {
        }

        try {
            LoadResponseCharacteristic_class_attributes_enum attrEnum = LoadResponseCharacteristic_class_attributes_enum.valueOf(attrName);
            defined = true;
            BaseClass attrValue = LoadResponseCharacteristic_class_attributes[attrEnum.ordinal()];
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
        for (var enumValue : LoadResponseCharacteristic_primitive_builder.values()) {
            if (enumValue != LoadResponseCharacteristic_primitive_builder.LAST_ENUM) {
                namesMap.put(enumValue.name(), "LoadResponseCharacteristic." + enumValue.name());
            }
        }
        for (var enumValue : LoadResponseCharacteristic_class_attributes_enum.values()) {
            if (enumValue != LoadResponseCharacteristic_class_attributes_enum.LAST_ENUM) {
                namesMap.put(enumValue.name(), "LoadResponseCharacteristic." + enumValue.name());
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
            for (LoadResponseCharacteristic_primitive_builder attrEnum : LoadResponseCharacteristic_primitive_builder.values()) {
                BaseClass bc = LoadResponseCharacteristic_primitive_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    LoadResponseCharacteristic." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            for (LoadResponseCharacteristic_class_attributes_enum attrEnum : LoadResponseCharacteristic_class_attributes_enum.values()) {
                BaseClass bc = LoadResponseCharacteristic_class_attributes[attrEnum.ordinal()];
                if (bc != null) {
                    result += "    LoadResponseCharacteristic." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
                }
            }
            result += super.toString(true);
        } else {
            result += "(LoadResponseCharacteristic) RDFID: " + rdfid;
        }
        return result;
    }

    private final java.lang.String debugName = "LoadResponseCharacteristic";

    @Override
    public java.lang.String debugString() {
        return debugName;
    }

    /**
     * Get the namespace URL of an object of this class.
     *
     * @return The namespace URL
     */
    @Override
    public java.lang.String getClassNamespaceUrl() {
        return "http://iec.ch/TC57/CIM100#";
    }

    /**
     * Get the namespace URL of an attribute (also for inherited attributes).
     *
     * @return The namespace URL
     */
    @Override
    public java.lang.String getAttributeNamespaceUrl(java.lang.String attrName) {
        return ATTR_NAMESPACE_MAP.get(attrName);
    }

    private static final Map<java.lang.String, java.lang.String> ATTR_NAMESPACE_MAP;
    static {
        ATTR_NAMESPACE_MAP = new LoadResponseCharacteristic().allAttrNamespaceMap();
    }

    @Override
    protected Map<java.lang.String, java.lang.String> allAttrNamespaceMap() {
        Map<java.lang.String, java.lang.String> map = new LinkedHashMap<>(classAttrNamespaceMap);
        map.putAll(super.allAttrNamespaceMap());
        map.remove("LAST_ATTRIBUTE");
        return map;
    }

    private Map<java.lang.String, java.lang.String> classAttrNamespaceMap = Map.ofEntries(
            Map.entry("EnergyConsumer", "http://iec.ch/TC57/CIM100#"),
            Map.entry("exponentModel", "http://iec.ch/TC57/CIM100#"),
            Map.entry("pConstantCurrent", "http://iec.ch/TC57/CIM100#"),
            Map.entry("pConstantImpedance", "http://iec.ch/TC57/CIM100#"),
            Map.entry("pConstantPower", "http://iec.ch/TC57/CIM100#"),
            Map.entry("pFrequencyExponent", "http://iec.ch/TC57/CIM100#"),
            Map.entry("pVoltageExponent", "http://iec.ch/TC57/CIM100#"),
            Map.entry("qConstantCurrent", "http://iec.ch/TC57/CIM100#"),
            Map.entry("qConstantImpedance", "http://iec.ch/TC57/CIM100#"),
            Map.entry("qConstantPower", "http://iec.ch/TC57/CIM100#"),
            Map.entry("qFrequencyExponent", "http://iec.ch/TC57/CIM100#"),
            Map.entry("qVoltageExponent", "http://iec.ch/TC57/CIM100#"),
            Map.entry("LAST_ATTRIBUTE", ""));
}
