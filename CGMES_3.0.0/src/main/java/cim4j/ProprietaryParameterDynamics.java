/*
Generated from the CGMES files via cimgen: https://github.com/sogno-platform/cimgen
*/

package cim4j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Supports definition of one or more parameters of several different datatypes for use by proprietary user-defined models.   This class does not inherit from IdentifiedObject since it is not intended that a single instance of it be referenced by more than one proprietary user-defined model instance.
 */
@SuppressWarnings("unused")
public class ProprietaryParameterDynamics extends BaseClass {

    private static final Logging LOG = Logging.getLogger(ProprietaryParameterDynamics.class);

    /**
     * Default constructor.
     */
    public ProprietaryParameterDynamics() {
        setCimType("ProprietaryParameterDynamics");
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private AsynchronousMachineUserDefined AsynchronousMachineUserDefined; // ManyToOne

    public AsynchronousMachineUserDefined getAsynchronousMachineUserDefined() {
        return AsynchronousMachineUserDefined;
    }

    public void setAsynchronousMachineUserDefined(BaseClass _object_) {
        if (!(_object_ instanceof AsynchronousMachineUserDefined)) {
            throw new IllegalArgumentException("Object is not AsynchronousMachineUserDefined");
        }
        if (AsynchronousMachineUserDefined != _object_) {
            AsynchronousMachineUserDefined = (AsynchronousMachineUserDefined) _object_;
            AsynchronousMachineUserDefined.setProprietaryParameterDynamics(this);
        }
    }

    public String AsynchronousMachineUserDefinedToString() {
        return AsynchronousMachineUserDefined != null ? AsynchronousMachineUserDefined.getRdfid() : null;
    }

    private static void setAsynchronousMachineUserDefined(BaseClass _this_, BaseClass _object_) {
        ((ProprietaryParameterDynamics) _this_).setAsynchronousMachineUserDefined(_object_);
    }

    private static String AsynchronousMachineUserDefinedToString(BaseClass _this_) {
        return ((ProprietaryParameterDynamics) _this_).AsynchronousMachineUserDefinedToString();
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private CSCUserDefined CSCUserDefined; // ManyToOne

    public CSCUserDefined getCSCUserDefined() {
        return CSCUserDefined;
    }

    public void setCSCUserDefined(BaseClass _object_) {
        if (!(_object_ instanceof CSCUserDefined)) {
            throw new IllegalArgumentException("Object is not CSCUserDefined");
        }
        if (CSCUserDefined != _object_) {
            CSCUserDefined = (CSCUserDefined) _object_;
            CSCUserDefined.setProprietaryParameterDynamics(this);
        }
    }

    public String CSCUserDefinedToString() {
        return CSCUserDefined != null ? CSCUserDefined.getRdfid() : null;
    }

    private static void setCSCUserDefined(BaseClass _this_, BaseClass _object_) {
        ((ProprietaryParameterDynamics) _this_).setCSCUserDefined(_object_);
    }

    private static String CSCUserDefinedToString(BaseClass _this_) {
        return ((ProprietaryParameterDynamics) _this_).CSCUserDefinedToString();
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private DiscontinuousExcitationControlUserDefined DiscontinuousExcitationControlUserDefined; // ManyToOne

    public DiscontinuousExcitationControlUserDefined getDiscontinuousExcitationControlUserDefined() {
        return DiscontinuousExcitationControlUserDefined;
    }

    public void setDiscontinuousExcitationControlUserDefined(BaseClass _object_) {
        if (!(_object_ instanceof DiscontinuousExcitationControlUserDefined)) {
            throw new IllegalArgumentException("Object is not DiscontinuousExcitationControlUserDefined");
        }
        if (DiscontinuousExcitationControlUserDefined != _object_) {
            DiscontinuousExcitationControlUserDefined = (DiscontinuousExcitationControlUserDefined) _object_;
            DiscontinuousExcitationControlUserDefined.setProprietaryParameterDynamics(this);
        }
    }

    public String DiscontinuousExcitationControlUserDefinedToString() {
        return DiscontinuousExcitationControlUserDefined != null ? DiscontinuousExcitationControlUserDefined.getRdfid() : null;
    }

    private static void setDiscontinuousExcitationControlUserDefined(BaseClass _this_, BaseClass _object_) {
        ((ProprietaryParameterDynamics) _this_).setDiscontinuousExcitationControlUserDefined(_object_);
    }

    private static String DiscontinuousExcitationControlUserDefinedToString(BaseClass _this_) {
        return ((ProprietaryParameterDynamics) _this_).DiscontinuousExcitationControlUserDefinedToString();
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private ExcitationSystemUserDefined ExcitationSystemUserDefined; // ManyToOne

    public ExcitationSystemUserDefined getExcitationSystemUserDefined() {
        return ExcitationSystemUserDefined;
    }

    public void setExcitationSystemUserDefined(BaseClass _object_) {
        if (!(_object_ instanceof ExcitationSystemUserDefined)) {
            throw new IllegalArgumentException("Object is not ExcitationSystemUserDefined");
        }
        if (ExcitationSystemUserDefined != _object_) {
            ExcitationSystemUserDefined = (ExcitationSystemUserDefined) _object_;
            ExcitationSystemUserDefined.setProprietaryParameterDynamics(this);
        }
    }

    public String ExcitationSystemUserDefinedToString() {
        return ExcitationSystemUserDefined != null ? ExcitationSystemUserDefined.getRdfid() : null;
    }

    private static void setExcitationSystemUserDefined(BaseClass _this_, BaseClass _object_) {
        ((ProprietaryParameterDynamics) _this_).setExcitationSystemUserDefined(_object_);
    }

    private static String ExcitationSystemUserDefinedToString(BaseClass _this_) {
        return ((ProprietaryParameterDynamics) _this_).ExcitationSystemUserDefinedToString();
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private LoadUserDefined LoadUserDefined; // ManyToOne

    public LoadUserDefined getLoadUserDefined() {
        return LoadUserDefined;
    }

    public void setLoadUserDefined(BaseClass _object_) {
        if (!(_object_ instanceof LoadUserDefined)) {
            throw new IllegalArgumentException("Object is not LoadUserDefined");
        }
        if (LoadUserDefined != _object_) {
            LoadUserDefined = (LoadUserDefined) _object_;
            LoadUserDefined.setProprietaryParameterDynamics(this);
        }
    }

    public String LoadUserDefinedToString() {
        return LoadUserDefined != null ? LoadUserDefined.getRdfid() : null;
    }

    private static void setLoadUserDefined(BaseClass _this_, BaseClass _object_) {
        ((ProprietaryParameterDynamics) _this_).setLoadUserDefined(_object_);
    }

    private static String LoadUserDefinedToString(BaseClass _this_) {
        return ((ProprietaryParameterDynamics) _this_).LoadUserDefinedToString();
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private MechanicalLoadUserDefined MechanicalLoadUserDefined; // ManyToOne

    public MechanicalLoadUserDefined getMechanicalLoadUserDefined() {
        return MechanicalLoadUserDefined;
    }

    public void setMechanicalLoadUserDefined(BaseClass _object_) {
        if (!(_object_ instanceof MechanicalLoadUserDefined)) {
            throw new IllegalArgumentException("Object is not MechanicalLoadUserDefined");
        }
        if (MechanicalLoadUserDefined != _object_) {
            MechanicalLoadUserDefined = (MechanicalLoadUserDefined) _object_;
            MechanicalLoadUserDefined.setProprietaryParameterDynamics(this);
        }
    }

    public String MechanicalLoadUserDefinedToString() {
        return MechanicalLoadUserDefined != null ? MechanicalLoadUserDefined.getRdfid() : null;
    }

    private static void setMechanicalLoadUserDefined(BaseClass _this_, BaseClass _object_) {
        ((ProprietaryParameterDynamics) _this_).setMechanicalLoadUserDefined(_object_);
    }

    private static String MechanicalLoadUserDefinedToString(BaseClass _this_) {
        return ((ProprietaryParameterDynamics) _this_).MechanicalLoadUserDefinedToString();
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private OverexcitationLimiterUserDefined OverexcitationLimiterUserDefined; // ManyToOne

    public OverexcitationLimiterUserDefined getOverexcitationLimiterUserDefined() {
        return OverexcitationLimiterUserDefined;
    }

    public void setOverexcitationLimiterUserDefined(BaseClass _object_) {
        if (!(_object_ instanceof OverexcitationLimiterUserDefined)) {
            throw new IllegalArgumentException("Object is not OverexcitationLimiterUserDefined");
        }
        if (OverexcitationLimiterUserDefined != _object_) {
            OverexcitationLimiterUserDefined = (OverexcitationLimiterUserDefined) _object_;
            OverexcitationLimiterUserDefined.setProprietaryParameterDynamics(this);
        }
    }

    public String OverexcitationLimiterUserDefinedToString() {
        return OverexcitationLimiterUserDefined != null ? OverexcitationLimiterUserDefined.getRdfid() : null;
    }

    private static void setOverexcitationLimiterUserDefined(BaseClass _this_, BaseClass _object_) {
        ((ProprietaryParameterDynamics) _this_).setOverexcitationLimiterUserDefined(_object_);
    }

    private static String OverexcitationLimiterUserDefinedToString(BaseClass _this_) {
        return ((ProprietaryParameterDynamics) _this_).OverexcitationLimiterUserDefinedToString();
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private PFVArControllerType1UserDefined PFVArControllerType1UserDefined; // ManyToOne

    public PFVArControllerType1UserDefined getPFVArControllerType1UserDefined() {
        return PFVArControllerType1UserDefined;
    }

    public void setPFVArControllerType1UserDefined(BaseClass _object_) {
        if (!(_object_ instanceof PFVArControllerType1UserDefined)) {
            throw new IllegalArgumentException("Object is not PFVArControllerType1UserDefined");
        }
        if (PFVArControllerType1UserDefined != _object_) {
            PFVArControllerType1UserDefined = (PFVArControllerType1UserDefined) _object_;
            PFVArControllerType1UserDefined.setProprietaryParameterDynamics(this);
        }
    }

    public String PFVArControllerType1UserDefinedToString() {
        return PFVArControllerType1UserDefined != null ? PFVArControllerType1UserDefined.getRdfid() : null;
    }

    private static void setPFVArControllerType1UserDefined(BaseClass _this_, BaseClass _object_) {
        ((ProprietaryParameterDynamics) _this_).setPFVArControllerType1UserDefined(_object_);
    }

    private static String PFVArControllerType1UserDefinedToString(BaseClass _this_) {
        return ((ProprietaryParameterDynamics) _this_).PFVArControllerType1UserDefinedToString();
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private PFVArControllerType2UserDefined PFVArControllerType2UserDefined; // ManyToOne

    public PFVArControllerType2UserDefined getPFVArControllerType2UserDefined() {
        return PFVArControllerType2UserDefined;
    }

    public void setPFVArControllerType2UserDefined(BaseClass _object_) {
        if (!(_object_ instanceof PFVArControllerType2UserDefined)) {
            throw new IllegalArgumentException("Object is not PFVArControllerType2UserDefined");
        }
        if (PFVArControllerType2UserDefined != _object_) {
            PFVArControllerType2UserDefined = (PFVArControllerType2UserDefined) _object_;
            PFVArControllerType2UserDefined.setProprietaryParameterDynamics(this);
        }
    }

    public String PFVArControllerType2UserDefinedToString() {
        return PFVArControllerType2UserDefined != null ? PFVArControllerType2UserDefined.getRdfid() : null;
    }

    private static void setPFVArControllerType2UserDefined(BaseClass _this_, BaseClass _object_) {
        ((ProprietaryParameterDynamics) _this_).setPFVArControllerType2UserDefined(_object_);
    }

    private static String PFVArControllerType2UserDefinedToString(BaseClass _this_) {
        return ((ProprietaryParameterDynamics) _this_).PFVArControllerType2UserDefinedToString();
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private PowerSystemStabilizerUserDefined PowerSystemStabilizerUserDefined; // ManyToOne

    public PowerSystemStabilizerUserDefined getPowerSystemStabilizerUserDefined() {
        return PowerSystemStabilizerUserDefined;
    }

    public void setPowerSystemStabilizerUserDefined(BaseClass _object_) {
        if (!(_object_ instanceof PowerSystemStabilizerUserDefined)) {
            throw new IllegalArgumentException("Object is not PowerSystemStabilizerUserDefined");
        }
        if (PowerSystemStabilizerUserDefined != _object_) {
            PowerSystemStabilizerUserDefined = (PowerSystemStabilizerUserDefined) _object_;
            PowerSystemStabilizerUserDefined.setProprietaryParameterDynamics(this);
        }
    }

    public String PowerSystemStabilizerUserDefinedToString() {
        return PowerSystemStabilizerUserDefined != null ? PowerSystemStabilizerUserDefined.getRdfid() : null;
    }

    private static void setPowerSystemStabilizerUserDefined(BaseClass _this_, BaseClass _object_) {
        ((ProprietaryParameterDynamics) _this_).setPowerSystemStabilizerUserDefined(_object_);
    }

    private static String PowerSystemStabilizerUserDefinedToString(BaseClass _this_) {
        return ((ProprietaryParameterDynamics) _this_).PowerSystemStabilizerUserDefinedToString();
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private SVCUserDefined SVCUserDefined; // ManyToOne

    public SVCUserDefined getSVCUserDefined() {
        return SVCUserDefined;
    }

    public void setSVCUserDefined(BaseClass _object_) {
        if (!(_object_ instanceof SVCUserDefined)) {
            throw new IllegalArgumentException("Object is not SVCUserDefined");
        }
        if (SVCUserDefined != _object_) {
            SVCUserDefined = (SVCUserDefined) _object_;
            SVCUserDefined.setProprietaryParameterDynamics(this);
        }
    }

    public String SVCUserDefinedToString() {
        return SVCUserDefined != null ? SVCUserDefined.getRdfid() : null;
    }

    private static void setSVCUserDefined(BaseClass _this_, BaseClass _object_) {
        ((ProprietaryParameterDynamics) _this_).setSVCUserDefined(_object_);
    }

    private static String SVCUserDefinedToString(BaseClass _this_) {
        return ((ProprietaryParameterDynamics) _this_).SVCUserDefinedToString();
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private SynchronousMachineUserDefined SynchronousMachineUserDefined; // ManyToOne

    public SynchronousMachineUserDefined getSynchronousMachineUserDefined() {
        return SynchronousMachineUserDefined;
    }

    public void setSynchronousMachineUserDefined(BaseClass _object_) {
        if (!(_object_ instanceof SynchronousMachineUserDefined)) {
            throw new IllegalArgumentException("Object is not SynchronousMachineUserDefined");
        }
        if (SynchronousMachineUserDefined != _object_) {
            SynchronousMachineUserDefined = (SynchronousMachineUserDefined) _object_;
            SynchronousMachineUserDefined.setProprietaryParameterDynamics(this);
        }
    }

    public String SynchronousMachineUserDefinedToString() {
        return SynchronousMachineUserDefined != null ? SynchronousMachineUserDefined.getRdfid() : null;
    }

    private static void setSynchronousMachineUserDefined(BaseClass _this_, BaseClass _object_) {
        ((ProprietaryParameterDynamics) _this_).setSynchronousMachineUserDefined(_object_);
    }

    private static String SynchronousMachineUserDefinedToString(BaseClass _this_) {
        return ((ProprietaryParameterDynamics) _this_).SynchronousMachineUserDefinedToString();
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private TurbineGovernorUserDefined TurbineGovernorUserDefined; // ManyToOne

    public TurbineGovernorUserDefined getTurbineGovernorUserDefined() {
        return TurbineGovernorUserDefined;
    }

    public void setTurbineGovernorUserDefined(BaseClass _object_) {
        if (!(_object_ instanceof TurbineGovernorUserDefined)) {
            throw new IllegalArgumentException("Object is not TurbineGovernorUserDefined");
        }
        if (TurbineGovernorUserDefined != _object_) {
            TurbineGovernorUserDefined = (TurbineGovernorUserDefined) _object_;
            TurbineGovernorUserDefined.setProprietaryParameterDynamics(this);
        }
    }

    public String TurbineGovernorUserDefinedToString() {
        return TurbineGovernorUserDefined != null ? TurbineGovernorUserDefined.getRdfid() : null;
    }

    private static void setTurbineGovernorUserDefined(BaseClass _this_, BaseClass _object_) {
        ((ProprietaryParameterDynamics) _this_).setTurbineGovernorUserDefined(_object_);
    }

    private static String TurbineGovernorUserDefinedToString(BaseClass _this_) {
        return ((ProprietaryParameterDynamics) _this_).TurbineGovernorUserDefinedToString();
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private TurbineLoadControllerUserDefined TurbineLoadControllerUserDefined; // ManyToOne

    public TurbineLoadControllerUserDefined getTurbineLoadControllerUserDefined() {
        return TurbineLoadControllerUserDefined;
    }

    public void setTurbineLoadControllerUserDefined(BaseClass _object_) {
        if (!(_object_ instanceof TurbineLoadControllerUserDefined)) {
            throw new IllegalArgumentException("Object is not TurbineLoadControllerUserDefined");
        }
        if (TurbineLoadControllerUserDefined != _object_) {
            TurbineLoadControllerUserDefined = (TurbineLoadControllerUserDefined) _object_;
            TurbineLoadControllerUserDefined.setProprietaryParameterDynamics(this);
        }
    }

    public String TurbineLoadControllerUserDefinedToString() {
        return TurbineLoadControllerUserDefined != null ? TurbineLoadControllerUserDefined.getRdfid() : null;
    }

    private static void setTurbineLoadControllerUserDefined(BaseClass _this_, BaseClass _object_) {
        ((ProprietaryParameterDynamics) _this_).setTurbineLoadControllerUserDefined(_object_);
    }

    private static String TurbineLoadControllerUserDefinedToString(BaseClass _this_) {
        return ((ProprietaryParameterDynamics) _this_).TurbineLoadControllerUserDefinedToString();
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private UnderexcitationLimiterUserDefined UnderexcitationLimiterUserDefined; // ManyToOne

    public UnderexcitationLimiterUserDefined getUnderexcitationLimiterUserDefined() {
        return UnderexcitationLimiterUserDefined;
    }

    public void setUnderexcitationLimiterUserDefined(BaseClass _object_) {
        if (!(_object_ instanceof UnderexcitationLimiterUserDefined)) {
            throw new IllegalArgumentException("Object is not UnderexcitationLimiterUserDefined");
        }
        if (UnderexcitationLimiterUserDefined != _object_) {
            UnderexcitationLimiterUserDefined = (UnderexcitationLimiterUserDefined) _object_;
            UnderexcitationLimiterUserDefined.setProprietaryParameterDynamics(this);
        }
    }

    public String UnderexcitationLimiterUserDefinedToString() {
        return UnderexcitationLimiterUserDefined != null ? UnderexcitationLimiterUserDefined.getRdfid() : null;
    }

    private static void setUnderexcitationLimiterUserDefined(BaseClass _this_, BaseClass _object_) {
        ((ProprietaryParameterDynamics) _this_).setUnderexcitationLimiterUserDefined(_object_);
    }

    private static String UnderexcitationLimiterUserDefinedToString(BaseClass _this_) {
        return ((ProprietaryParameterDynamics) _this_).UnderexcitationLimiterUserDefinedToString();
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private VSCUserDefined VSCUserDefined; // ManyToOne

    public VSCUserDefined getVSCUserDefined() {
        return VSCUserDefined;
    }

    public void setVSCUserDefined(BaseClass _object_) {
        if (!(_object_ instanceof VSCUserDefined)) {
            throw new IllegalArgumentException("Object is not VSCUserDefined");
        }
        if (VSCUserDefined != _object_) {
            VSCUserDefined = (VSCUserDefined) _object_;
            VSCUserDefined.setProprietaryParameterDynamics(this);
        }
    }

    public String VSCUserDefinedToString() {
        return VSCUserDefined != null ? VSCUserDefined.getRdfid() : null;
    }

    private static void setVSCUserDefined(BaseClass _this_, BaseClass _object_) {
        ((ProprietaryParameterDynamics) _this_).setVSCUserDefined(_object_);
    }

    private static String VSCUserDefinedToString(BaseClass _this_) {
        return ((ProprietaryParameterDynamics) _this_).VSCUserDefinedToString();
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private VoltageAdjusterUserDefined VoltageAdjusterUserDefined; // ManyToOne

    public VoltageAdjusterUserDefined getVoltageAdjusterUserDefined() {
        return VoltageAdjusterUserDefined;
    }

    public void setVoltageAdjusterUserDefined(BaseClass _object_) {
        if (!(_object_ instanceof VoltageAdjusterUserDefined)) {
            throw new IllegalArgumentException("Object is not VoltageAdjusterUserDefined");
        }
        if (VoltageAdjusterUserDefined != _object_) {
            VoltageAdjusterUserDefined = (VoltageAdjusterUserDefined) _object_;
            VoltageAdjusterUserDefined.setProprietaryParameterDynamics(this);
        }
    }

    public String VoltageAdjusterUserDefinedToString() {
        return VoltageAdjusterUserDefined != null ? VoltageAdjusterUserDefined.getRdfid() : null;
    }

    private static void setVoltageAdjusterUserDefined(BaseClass _this_, BaseClass _object_) {
        ((ProprietaryParameterDynamics) _this_).setVoltageAdjusterUserDefined(_object_);
    }

    private static String VoltageAdjusterUserDefinedToString(BaseClass _this_) {
        return ((ProprietaryParameterDynamics) _this_).VoltageAdjusterUserDefinedToString();
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private VoltageCompensatorUserDefined VoltageCompensatorUserDefined; // ManyToOne

    public VoltageCompensatorUserDefined getVoltageCompensatorUserDefined() {
        return VoltageCompensatorUserDefined;
    }

    public void setVoltageCompensatorUserDefined(BaseClass _object_) {
        if (!(_object_ instanceof VoltageCompensatorUserDefined)) {
            throw new IllegalArgumentException("Object is not VoltageCompensatorUserDefined");
        }
        if (VoltageCompensatorUserDefined != _object_) {
            VoltageCompensatorUserDefined = (VoltageCompensatorUserDefined) _object_;
            VoltageCompensatorUserDefined.setProprietaryParameterDynamics(this);
        }
    }

    public String VoltageCompensatorUserDefinedToString() {
        return VoltageCompensatorUserDefined != null ? VoltageCompensatorUserDefined.getRdfid() : null;
    }

    private static void setVoltageCompensatorUserDefined(BaseClass _this_, BaseClass _object_) {
        ((ProprietaryParameterDynamics) _this_).setVoltageCompensatorUserDefined(_object_);
    }

    private static String VoltageCompensatorUserDefinedToString(BaseClass _this_) {
        return ((ProprietaryParameterDynamics) _this_).VoltageCompensatorUserDefinedToString();
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private WindPlantUserDefined WindPlantUserDefined; // ManyToOne

    public WindPlantUserDefined getWindPlantUserDefined() {
        return WindPlantUserDefined;
    }

    public void setWindPlantUserDefined(BaseClass _object_) {
        if (!(_object_ instanceof WindPlantUserDefined)) {
            throw new IllegalArgumentException("Object is not WindPlantUserDefined");
        }
        if (WindPlantUserDefined != _object_) {
            WindPlantUserDefined = (WindPlantUserDefined) _object_;
            WindPlantUserDefined.setProprietaryParameterDynamics(this);
        }
    }

    public String WindPlantUserDefinedToString() {
        return WindPlantUserDefined != null ? WindPlantUserDefined.getRdfid() : null;
    }

    private static void setWindPlantUserDefined(BaseClass _this_, BaseClass _object_) {
        ((ProprietaryParameterDynamics) _this_).setWindPlantUserDefined(_object_);
    }

    private static String WindPlantUserDefinedToString(BaseClass _this_) {
        return ((ProprietaryParameterDynamics) _this_).WindPlantUserDefinedToString();
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private WindType1or2UserDefined WindType1or2UserDefined; // ManyToOne

    public WindType1or2UserDefined getWindType1or2UserDefined() {
        return WindType1or2UserDefined;
    }

    public void setWindType1or2UserDefined(BaseClass _object_) {
        if (!(_object_ instanceof WindType1or2UserDefined)) {
            throw new IllegalArgumentException("Object is not WindType1or2UserDefined");
        }
        if (WindType1or2UserDefined != _object_) {
            WindType1or2UserDefined = (WindType1or2UserDefined) _object_;
            WindType1or2UserDefined.setProprietaryParameterDynamics(this);
        }
    }

    public String WindType1or2UserDefinedToString() {
        return WindType1or2UserDefined != null ? WindType1or2UserDefined.getRdfid() : null;
    }

    private static void setWindType1or2UserDefined(BaseClass _this_, BaseClass _object_) {
        ((ProprietaryParameterDynamics) _this_).setWindType1or2UserDefined(_object_);
    }

    private static String WindType1or2UserDefinedToString(BaseClass _this_) {
        return ((ProprietaryParameterDynamics) _this_).WindType1or2UserDefinedToString();
    }

    /**
     * Proprietary user-defined model with which this parameter is associated.
     */
    private WindType3or4UserDefined WindType3or4UserDefined; // ManyToOne

    public WindType3or4UserDefined getWindType3or4UserDefined() {
        return WindType3or4UserDefined;
    }

    public void setWindType3or4UserDefined(BaseClass _object_) {
        if (!(_object_ instanceof WindType3or4UserDefined)) {
            throw new IllegalArgumentException("Object is not WindType3or4UserDefined");
        }
        if (WindType3or4UserDefined != _object_) {
            WindType3or4UserDefined = (WindType3or4UserDefined) _object_;
            WindType3or4UserDefined.setProprietaryParameterDynamics(this);
        }
    }

    public String WindType3or4UserDefinedToString() {
        return WindType3or4UserDefined != null ? WindType3or4UserDefined.getRdfid() : null;
    }

    private static void setWindType3or4UserDefined(BaseClass _this_, BaseClass _object_) {
        ((ProprietaryParameterDynamics) _this_).setWindType3or4UserDefined(_object_);
    }

    private static String WindType3or4UserDefinedToString(BaseClass _this_) {
        return ((ProprietaryParameterDynamics) _this_).WindType3or4UserDefinedToString();
    }

    /**
     * Boolean parameter value. If this attribute is populated, integerParameterValue and floatParameterValue will not be.
     */
    private Boolean booleanParameterValue; // Boolean

    public Boolean getBooleanParameterValue() {
        return booleanParameterValue;
    }

    public void setBooleanParameterValue(Boolean _value_) {
        booleanParameterValue = _value_;
    }

    public void setBooleanParameterValue(String _value_) {
        booleanParameterValue = getBooleanFromString(_value_);
    }

    public String booleanParameterValueToString() {
        return booleanParameterValue != null ? booleanParameterValue.toString() : null;
    }

    private static void setBooleanParameterValue(BaseClass _this_, String _value_) {
        ((ProprietaryParameterDynamics) _this_).setBooleanParameterValue(_value_);
    }

    private static String booleanParameterValueToString(BaseClass _this_) {
        return ((ProprietaryParameterDynamics) _this_).booleanParameterValueToString();
    }

    /**
     * Floating point parameter value.  If this attribute is populated, booleanParameterValue and integerParameterValue will not be.
     */
    private Float floatParameterValue; // Float

    public Float getFloatParameterValue() {
        return floatParameterValue;
    }

    public void setFloatParameterValue(Float _value_) {
        floatParameterValue = _value_;
    }

    public void setFloatParameterValue(String _value_) {
        floatParameterValue = getFloatFromString(_value_);
    }

    public String floatParameterValueToString() {
        return floatParameterValue != null ? floatParameterValue.toString() : null;
    }

    private static void setFloatParameterValue(BaseClass _this_, String _value_) {
        ((ProprietaryParameterDynamics) _this_).setFloatParameterValue(_value_);
    }

    private static String floatParameterValueToString(BaseClass _this_) {
        return ((ProprietaryParameterDynamics) _this_).floatParameterValueToString();
    }

    /**
     * Integer parameter value.  If this attribute is populated, booleanParameterValue and floatParameterValue will not be.
     */
    private Integer integerParameterValue; // Integer

    public Integer getIntegerParameterValue() {
        return integerParameterValue;
    }

    public void setIntegerParameterValue(Integer _value_) {
        integerParameterValue = _value_;
    }

    public void setIntegerParameterValue(String _value_) {
        integerParameterValue = getIntegerFromString(_value_);
    }

    public String integerParameterValueToString() {
        return integerParameterValue != null ? integerParameterValue.toString() : null;
    }

    private static void setIntegerParameterValue(BaseClass _this_, String _value_) {
        ((ProprietaryParameterDynamics) _this_).setIntegerParameterValue(_value_);
    }

    private static String integerParameterValueToString(BaseClass _this_) {
        return ((ProprietaryParameterDynamics) _this_).integerParameterValueToString();
    }

    /**
     * Sequence number of the parameter among the set of parameters associated with the related proprietary user-defined model.
     */
    private Integer parameterNumber; // Integer

    public Integer getParameterNumber() {
        return parameterNumber;
    }

    public void setParameterNumber(Integer _value_) {
        parameterNumber = _value_;
    }

    public void setParameterNumber(String _value_) {
        parameterNumber = getIntegerFromString(_value_);
    }

    public String parameterNumberToString() {
        return parameterNumber != null ? parameterNumber.toString() : null;
    }

    private static void setParameterNumber(BaseClass _this_, String _value_) {
        ((ProprietaryParameterDynamics) _this_).setParameterNumber(_value_);
    }

    private static String parameterNumberToString(BaseClass _this_) {
        return ((ProprietaryParameterDynamics) _this_).parameterNumberToString();
    }

    /**
     * Get a list of all attribute names of the CIM type.
     *
     * The list includes all inherited attributes. The attribute name is only the
     * last part of the full name (without the class name).
     *
     * @return All attributes of the CIM type
     */
    @Override
    public List<String> getAttributeNames() {
        return ATTR_NAMES_LIST;
    }

    @Override
    protected Map<String, AttrDetails> allAttrDetailsMap() {
        Map<String, AttrDetails> map = new LinkedHashMap<>(CLASS_ATTR_DETAILS_MAP);
        map.putAll(super.allAttrDetailsMap());
        return map;
    }

    /**
     * Get the full name of an attribute.
     *
     * The full name is "<class_name>.<attribute_name>".
     *
     * @param attrName The attribute name
     * @return         The full name
     */
    @Override
    public String getAttributeFullName(String attrName) {
        return ATTR_DETAILS_MAP.containsKey(attrName) ? ATTR_DETAILS_MAP.get(attrName).fullName : null;
    }

    /**
     * Get an attribute value as string.
     *
     * @param attrName The attribute name
     * @return         The attribute value
     */
    @Override
    public String getAttribute(String attrName) {
        if (ATTR_DETAILS_MAP.containsKey(attrName)) {
            var getterFunction = ATTR_DETAILS_MAP.get(attrName).getter;
            return getterFunction.apply(this);
        }
        LOG.error(String.format("No-one knows an attribute %s.%s", "ProprietaryParameterDynamics", attrName));
        return "";
    }

    /**
     * Set an attribute value as object (for class and list attributes).
     *
     * @param attrName    The attribute name
     * @param objectValue The attribute value as object
     */
    @Override
    public void setAttribute(String attrName, BaseClass objectValue) {
        if (ATTR_DETAILS_MAP.containsKey(attrName)) {
            var setterFunction = ATTR_DETAILS_MAP.get(attrName).objectSetter;
            setterFunction.accept(this, objectValue);
        } else {
            LOG.error(String.format("No-one knows what to do with attribute %s.%s and value %s",
                "ProprietaryParameterDynamics", attrName, objectValue));
        }
    }

    /**
     * Set an attribute value as string (for primitive (including datatype) and enum attributes).
     *
     * @param attrName    The attribute name
     * @param stringValue The attribute value as string
     */
    @Override
    public void setAttribute(String attrName, String stringValue) {
        if (ATTR_DETAILS_MAP.containsKey(attrName)) {
            var setterFunction = ATTR_DETAILS_MAP.get(attrName).stringSetter;
            setterFunction.accept(this, stringValue);
        } else {
            LOG.error(String.format("No-one knows what to do with attribute %s.%s and value %s",
                "ProprietaryParameterDynamics", attrName, stringValue));
        }
    }

    /**
     * Check if the attribute is a primitive attribute.
     *
     * This includes datatype_attributes.
     *
     * @param attrName The attribute name
     * @return         Is it a primitive attribute?
     */
    @Override
    public boolean isPrimitiveAttribute(String attrName) {
        return ATTR_DETAILS_MAP.containsKey(attrName) && ATTR_DETAILS_MAP.get(attrName).isPrimitive;
    }

    /**
     * Check if the attribute is an enum attribute.
     *
     * @param attrName The attribute name
     * @return         Is it an enum attribute?
     */
    @Override
    public boolean isEnumAttribute(String attrName) {
        return ATTR_DETAILS_MAP.containsKey(attrName) && ATTR_DETAILS_MAP.get(attrName).isEnum;
    }

    /**
     * Check if the attribute is used.
     *
     * Some attributes are declared as unused in the CGMES definition. In most cases
     * these are list attributes, i.e. lists of links to other CIM objects. But
     * there are some exceptions, e.g. the list of ToplogicalNodes in
     * TopologicalIsland.
     *
     * @param attrName The attribute name
     * @return         Is the attribute used?
     */
    @Override
    public boolean isUsedAttribute(String attrName) {
        return ATTR_DETAILS_MAP.containsKey(attrName) && ATTR_DETAILS_MAP.get(attrName).isUsed;
    }

    /**
     * Get the namespace URL of an object of this class.
     *
     * @return The namespace URL
     */
    @Override
    public String getClassNamespaceUrl() {
        return CLASS_NAMESPACE;
    }

    /**
     * Get the namespace URL of an attribute (also for inherited attributes).
     *
     * @return The namespace URL
     */
    @Override
    public String getAttributeNamespaceUrl(String attrName) {
        return ATTR_DETAILS_MAP.containsKey(attrName) ? ATTR_DETAILS_MAP.get(attrName).nameSpace : null;
    }

    /**
     * A resource can be used by multiple profiles. This is the set of profiles
     * where this element can be found.
     *
     * @return All possible profiles for an object of this class
     */
    @Override
    public Set<CGMESProfile> getPossibleProfiles() {
        return POSSIBLE_PROFILES;
    }

    /**
     * This is the profile with most of the attributes.
     * It should be used to write the data to as few as possible files.
     *
     * @return The recommended profiles for an object of this class
     */
    @Override
    public CGMESProfile getRecommendedProfile() {
        return RECOMMENDED_PROFILE;
    }

    /**
     * Get the possible profiles of an attribute (also for inherited attributes).
     *
     * @return All possible profiles for an attribute
     */
    @Override
    public Set<CGMESProfile> getPossibleAttributeProfiles(String attrName) {
        return ATTR_DETAILS_MAP.containsKey(attrName) ? ATTR_DETAILS_MAP.get(attrName).profiles : null;
    }

    /**
     * Get the possible profiles for an object of this class including the possible
     * profiles of all direct or inherited attributes.
     *
     * A resource can be used by multiple profiles. This is the set of profiles
     * where this element or an attribute of this element can be found.
     *
     * @return All possible profiles for an object of this class and its attributes
     */
    @Override
    public Set<CGMESProfile> getPossibleProfilesIncludingAttributes() {
        return POSSIBLE_PROFILES_INCLUDING_ATTRIBUTES;
    }

    /**
     * Private infos.
     */

    private static final String CLASS_NAMESPACE = "http://iec.ch/TC57/CIM100#";

    private static final List<String> ATTR_NAMES_LIST;
    private static final Map<String, AttrDetails> ATTR_DETAILS_MAP;
    private static final Map<String, AttrDetails> CLASS_ATTR_DETAILS_MAP;
    static {
        Map<String, AttrDetails> map = new LinkedHashMap<>();
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("AsynchronousMachineUserDefined", new AttrDetails("ProprietaryParameterDynamics.AsynchronousMachineUserDefined", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, ProprietaryParameterDynamics::AsynchronousMachineUserDefinedToString, ProprietaryParameterDynamics::setAsynchronousMachineUserDefined, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("CSCUserDefined", new AttrDetails("ProprietaryParameterDynamics.CSCUserDefined", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, ProprietaryParameterDynamics::CSCUserDefinedToString, ProprietaryParameterDynamics::setCSCUserDefined, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("DiscontinuousExcitationControlUserDefined", new AttrDetails("ProprietaryParameterDynamics.DiscontinuousExcitationControlUserDefined", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, ProprietaryParameterDynamics::DiscontinuousExcitationControlUserDefinedToString, ProprietaryParameterDynamics::setDiscontinuousExcitationControlUserDefined, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("ExcitationSystemUserDefined", new AttrDetails("ProprietaryParameterDynamics.ExcitationSystemUserDefined", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, ProprietaryParameterDynamics::ExcitationSystemUserDefinedToString, ProprietaryParameterDynamics::setExcitationSystemUserDefined, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("LoadUserDefined", new AttrDetails("ProprietaryParameterDynamics.LoadUserDefined", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, ProprietaryParameterDynamics::LoadUserDefinedToString, ProprietaryParameterDynamics::setLoadUserDefined, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("MechanicalLoadUserDefined", new AttrDetails("ProprietaryParameterDynamics.MechanicalLoadUserDefined", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, ProprietaryParameterDynamics::MechanicalLoadUserDefinedToString, ProprietaryParameterDynamics::setMechanicalLoadUserDefined, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("OverexcitationLimiterUserDefined", new AttrDetails("ProprietaryParameterDynamics.OverexcitationLimiterUserDefined", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, ProprietaryParameterDynamics::OverexcitationLimiterUserDefinedToString, ProprietaryParameterDynamics::setOverexcitationLimiterUserDefined, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("PFVArControllerType1UserDefined", new AttrDetails("ProprietaryParameterDynamics.PFVArControllerType1UserDefined", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, ProprietaryParameterDynamics::PFVArControllerType1UserDefinedToString, ProprietaryParameterDynamics::setPFVArControllerType1UserDefined, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("PFVArControllerType2UserDefined", new AttrDetails("ProprietaryParameterDynamics.PFVArControllerType2UserDefined", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, ProprietaryParameterDynamics::PFVArControllerType2UserDefinedToString, ProprietaryParameterDynamics::setPFVArControllerType2UserDefined, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("PowerSystemStabilizerUserDefined", new AttrDetails("ProprietaryParameterDynamics.PowerSystemStabilizerUserDefined", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, ProprietaryParameterDynamics::PowerSystemStabilizerUserDefinedToString, ProprietaryParameterDynamics::setPowerSystemStabilizerUserDefined, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("SVCUserDefined", new AttrDetails("ProprietaryParameterDynamics.SVCUserDefined", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, ProprietaryParameterDynamics::SVCUserDefinedToString, ProprietaryParameterDynamics::setSVCUserDefined, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("SynchronousMachineUserDefined", new AttrDetails("ProprietaryParameterDynamics.SynchronousMachineUserDefined", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, ProprietaryParameterDynamics::SynchronousMachineUserDefinedToString, ProprietaryParameterDynamics::setSynchronousMachineUserDefined, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("TurbineGovernorUserDefined", new AttrDetails("ProprietaryParameterDynamics.TurbineGovernorUserDefined", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, ProprietaryParameterDynamics::TurbineGovernorUserDefinedToString, ProprietaryParameterDynamics::setTurbineGovernorUserDefined, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("TurbineLoadControllerUserDefined", new AttrDetails("ProprietaryParameterDynamics.TurbineLoadControllerUserDefined", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, ProprietaryParameterDynamics::TurbineLoadControllerUserDefinedToString, ProprietaryParameterDynamics::setTurbineLoadControllerUserDefined, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("UnderexcitationLimiterUserDefined", new AttrDetails("ProprietaryParameterDynamics.UnderexcitationLimiterUserDefined", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, ProprietaryParameterDynamics::UnderexcitationLimiterUserDefinedToString, ProprietaryParameterDynamics::setUnderexcitationLimiterUserDefined, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("VSCUserDefined", new AttrDetails("ProprietaryParameterDynamics.VSCUserDefined", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, ProprietaryParameterDynamics::VSCUserDefinedToString, ProprietaryParameterDynamics::setVSCUserDefined, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("VoltageAdjusterUserDefined", new AttrDetails("ProprietaryParameterDynamics.VoltageAdjusterUserDefined", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, ProprietaryParameterDynamics::VoltageAdjusterUserDefinedToString, ProprietaryParameterDynamics::setVoltageAdjusterUserDefined, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("VoltageCompensatorUserDefined", new AttrDetails("ProprietaryParameterDynamics.VoltageCompensatorUserDefined", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, ProprietaryParameterDynamics::VoltageCompensatorUserDefinedToString, ProprietaryParameterDynamics::setVoltageCompensatorUserDefined, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindPlantUserDefined", new AttrDetails("ProprietaryParameterDynamics.WindPlantUserDefined", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, ProprietaryParameterDynamics::WindPlantUserDefinedToString, ProprietaryParameterDynamics::setWindPlantUserDefined, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindType1or2UserDefined", new AttrDetails("ProprietaryParameterDynamics.WindType1or2UserDefined", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, ProprietaryParameterDynamics::WindType1or2UserDefinedToString, ProprietaryParameterDynamics::setWindType1or2UserDefined, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("WindType3or4UserDefined", new AttrDetails("ProprietaryParameterDynamics.WindType3or4UserDefined", true, "http://iec.ch/TC57/CIM100#", profiles, false, false, ProprietaryParameterDynamics::WindType3or4UserDefinedToString, ProprietaryParameterDynamics::setWindType3or4UserDefined, null));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("booleanParameterValue", new AttrDetails("ProprietaryParameterDynamics.booleanParameterValue", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ProprietaryParameterDynamics::booleanParameterValueToString, null, ProprietaryParameterDynamics::setBooleanParameterValue));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("floatParameterValue", new AttrDetails("ProprietaryParameterDynamics.floatParameterValue", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ProprietaryParameterDynamics::floatParameterValueToString, null, ProprietaryParameterDynamics::setFloatParameterValue));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("integerParameterValue", new AttrDetails("ProprietaryParameterDynamics.integerParameterValue", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ProprietaryParameterDynamics::integerParameterValueToString, null, ProprietaryParameterDynamics::setIntegerParameterValue));
        }
        {
            Set<CGMESProfile> profiles = new LinkedHashSet<>();
            profiles.add(CGMESProfile.DY);
            map.put("parameterNumber", new AttrDetails("ProprietaryParameterDynamics.parameterNumber", true, "http://iec.ch/TC57/CIM100#", profiles, true, false, ProprietaryParameterDynamics::parameterNumberToString, null, ProprietaryParameterDynamics::setParameterNumber));
        }
        CLASS_ATTR_DETAILS_MAP = map;
        ATTR_DETAILS_MAP = Collections.unmodifiableMap(new ProprietaryParameterDynamics().allAttrDetailsMap());
        ATTR_NAMES_LIST = new ArrayList<>(ATTR_DETAILS_MAP.keySet());
    }

    private static final Set<CGMESProfile> POSSIBLE_PROFILES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>();
        profiles.add(CGMESProfile.DY);
        POSSIBLE_PROFILES = Collections.unmodifiableSet(profiles);
    }

    private static final CGMESProfile RECOMMENDED_PROFILE = CGMESProfile.DY;

    private static final Set<CGMESProfile> POSSIBLE_PROFILES_INCLUDING_ATTRIBUTES;
    static {
        Set<CGMESProfile> profiles = new LinkedHashSet<>(POSSIBLE_PROFILES);
        for (var attrDetails : ATTR_DETAILS_MAP.values()) {
            profiles.addAll(attrDetails.profiles);
        }
        POSSIBLE_PROFILES_INCLUDING_ATTRIBUTES = Collections.unmodifiableSet(profiles);
    }
}
