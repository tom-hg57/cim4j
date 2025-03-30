/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

/**
 * The type of control area.
 */
public class ControlAreaTypeKind extends BaseClass {

	private static final Logging LOG = Logging.getLogger(ControlAreaTypeKind.class);

	private enum ControlAreaTypeKind_ENUM {
		/**
		 * Used for automatic generation control.
		 */
		AGC,
		/**
		 * Used for load forecast.
		 */
		Forecast,
		/**
		 * Used for interchange specification or control.
		 */
		Interchange,
		MAX_ControlAreaTypeKind_ENUM
	}

	private ControlAreaTypeKind_ENUM value;

	private boolean initialized = false;

	public ControlAreaTypeKind() {
	}

	public ControlAreaTypeKind(java.lang.String s) {
		setValue(s);
	}

	@Override
	public BaseClass construct() {
		return new ControlAreaTypeKind();
	}

	@Override
	public boolean isPrimitive() {
		return true;
	}

	@Override
	public boolean isInitialized() {
		return initialized;
	}

	@Override
	public void setValue(java.lang.String s) {
		try {
			value = ControlAreaTypeKind_ENUM.valueOf(s.trim());
			initialized = true;
		} catch (IllegalArgumentException iae) {
			LOG.error("IllegalArgumentException: " + iae.getMessage());
		}
	}

	@Override
	public Object getValue() {
		return value.toString();
	}

	@Override
	public void setAttribute(java.lang.String attrName, BaseClass value) {
		throw new IllegalArgumentException("ENUM cannot set attribute: " + attrName);
	}

	@Override
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		throw new IllegalArgumentException("ENUM cannot set attribute: " + attrName);
	}

	@Override
	public java.lang.String toString(boolean topClass) {
		return "Enum (" + value.toString() + ")";
	}

	private final java.lang.String debugName = "ControlAreaTypeKind";

	@Override
	public java.lang.String debugString() {
		return debugName;
	}
}
