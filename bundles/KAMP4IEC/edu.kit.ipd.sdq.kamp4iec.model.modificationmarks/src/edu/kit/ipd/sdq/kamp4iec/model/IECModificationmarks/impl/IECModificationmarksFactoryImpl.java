/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.impl;

import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.*;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECComponent;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IECModificationmarksFactoryImpl extends EFactoryImpl implements IECModificationmarksFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IECModificationmarksFactory init() {
		try {
			IECModificationmarksFactory theIECModificationmarksFactory = (IECModificationmarksFactory)EPackage.Registry.INSTANCE.getEFactory(IECModificationmarksPackage.eNS_URI);
			if (theIECModificationmarksFactory != null) {
				return theIECModificationmarksFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IECModificationmarksFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECModificationmarksFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case IECModificationmarksPackage.IEC_MODIFICATION_REPOSITORY: return createIECModificationRepository();
			case IECModificationmarksPackage.IEC_SEED_MODIFICATIONS: return createIECSeedModifications();
			case IECModificationmarksPackage.IEC_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCY: return createIECChangePropagationDueToDataDependency();
			case IECModificationmarksPackage.IEC_MODIFY_COMPONENT: return createIECModifyComponent();
			case IECModificationmarksPackage.IEC_MODIFY_GLOBAL_VARIABLE: return createIECModifyGlobalVariable();
			case IECModificationmarksPackage.IEC_MODIFY_FUNCTION_BLOCK: return createIECModifyFunctionBlock();
			case IECModificationmarksPackage.IEC_MODIFY_FUNCTION: return createIECModifyFunction();
			case IECModificationmarksPackage.IEC_MODIFY_INTERFACE: return createIECModifyInterface();
			case IECModificationmarksPackage.IEC_MODIFY_METHOD: return createIECModifyMethod();
			case IECModificationmarksPackage.IEC_MODIFY_ABSTRACT_METHOD: return createIECModifyAbstractMethod();
			case IECModificationmarksPackage.IEC_MODIFY_PROPERTY: return createIECModifyProperty();
			case IECModificationmarksPackage.IEC_MODIFY_ABSTRACT_PROPERTY: return createIECModifyAbstractProperty();
			case IECModificationmarksPackage.IEC_MODIFY_PROGRAM: return createIECModifyProgram();
			case IECModificationmarksPackage.IEC_MODIFY_CONFIGURATION: return createIECModifyConfiguration();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECModificationRepository createIECModificationRepository() {
		IECModificationRepositoryImpl iecModificationRepository = new IECModificationRepositoryImpl();
		return iecModificationRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECSeedModifications createIECSeedModifications() {
		IECSeedModificationsImpl iecSeedModifications = new IECSeedModificationsImpl();
		return iecSeedModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECChangePropagationDueToDataDependency createIECChangePropagationDueToDataDependency() {
		IECChangePropagationDueToDataDependencyImpl iecChangePropagationDueToDataDependency = new IECChangePropagationDueToDataDependencyImpl();
		return iecChangePropagationDueToDataDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends IECComponent> IECModifyComponent<T> createIECModifyComponent() {
		IECModifyComponentImpl<T> iecModifyComponent = new IECModifyComponentImpl<T>();
		return iecModifyComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECModifyGlobalVariable createIECModifyGlobalVariable() {
		IECModifyGlobalVariableImpl iecModifyGlobalVariable = new IECModifyGlobalVariableImpl();
		return iecModifyGlobalVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECModifyFunctionBlock createIECModifyFunctionBlock() {
		IECModifyFunctionBlockImpl iecModifyFunctionBlock = new IECModifyFunctionBlockImpl();
		return iecModifyFunctionBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECModifyFunction createIECModifyFunction() {
		IECModifyFunctionImpl iecModifyFunction = new IECModifyFunctionImpl();
		return iecModifyFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECModifyInterface createIECModifyInterface() {
		IECModifyInterfaceImpl iecModifyInterface = new IECModifyInterfaceImpl();
		return iecModifyInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECModifyMethod createIECModifyMethod() {
		IECModifyMethodImpl iecModifyMethod = new IECModifyMethodImpl();
		return iecModifyMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECModifyAbstractMethod createIECModifyAbstractMethod() {
		IECModifyAbstractMethodImpl iecModifyAbstractMethod = new IECModifyAbstractMethodImpl();
		return iecModifyAbstractMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECModifyProperty createIECModifyProperty() {
		IECModifyPropertyImpl iecModifyProperty = new IECModifyPropertyImpl();
		return iecModifyProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECModifyAbstractProperty createIECModifyAbstractProperty() {
		IECModifyAbstractPropertyImpl iecModifyAbstractProperty = new IECModifyAbstractPropertyImpl();
		return iecModifyAbstractProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECModifyProgram createIECModifyProgram() {
		IECModifyProgramImpl iecModifyProgram = new IECModifyProgramImpl();
		return iecModifyProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECModifyConfiguration createIECModifyConfiguration() {
		IECModifyConfigurationImpl iecModifyConfiguration = new IECModifyConfigurationImpl();
		return iecModifyConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECModificationmarksPackage getIECModificationmarksPackage() {
		return (IECModificationmarksPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IECModificationmarksPackage getPackage() {
		return IECModificationmarksPackage.eINSTANCE;
	}

} //IECModificationmarksFactoryImpl
