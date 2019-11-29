/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.*;

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
public class IECRepositoryFactoryImpl extends EFactoryImpl implements IECRepositoryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IECRepositoryFactory init() {
		try {
			IECRepositoryFactory theIECRepositoryFactory = (IECRepositoryFactory)EPackage.Registry.INSTANCE.getEFactory(IECRepositoryPackage.eNS_URI);
			if (theIECRepositoryFactory != null) {
				return theIECRepositoryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IECRepositoryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECRepositoryFactoryImpl() {
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
			case IECRepositoryPackage.REPOSITORY: return createRepository();
			case IECRepositoryPackage.FUNCTION_BLOCK: return createFunctionBlock();
			case IECRepositoryPackage.GLOBAL_VARIABLE: return createGlobalVariable();
			case IECRepositoryPackage.FUNCTION: return createFunction();
			case IECRepositoryPackage.IEC_INTERFACE: return createIECInterface();
			case IECRepositoryPackage.IEC_METHOD: return createIECMethod();
			case IECRepositoryPackage.IEC_PROPERTY: return createIECProperty();
			case IECRepositoryPackage.IEC_ABSTRACT_PROPERTY: return createIECAbstractProperty();
			case IECRepositoryPackage.IEC_ABSTRACT_METHOD: return createIECAbstractMethod();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository createRepository() {
		RepositoryImpl repository = new RepositoryImpl();
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBlock createFunctionBlock() {
		FunctionBlockImpl functionBlock = new FunctionBlockImpl();
		return functionBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVariable createGlobalVariable() {
		GlobalVariableImpl globalVariable = new GlobalVariableImpl();
		return globalVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECMethod createIECMethod() {
		IECMethodImpl iecMethod = new IECMethodImpl();
		return iecMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECInterface createIECInterface() {
		IECInterfaceImpl iecInterface = new IECInterfaceImpl();
		return iecInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECProperty createIECProperty() {
		IECPropertyImpl iecProperty = new IECPropertyImpl();
		return iecProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECAbstractProperty createIECAbstractProperty() {
		IECAbstractPropertyImpl iecAbstractProperty = new IECAbstractPropertyImpl();
		return iecAbstractProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECAbstractMethod createIECAbstractMethod() {
		IECAbstractMethodImpl iecAbstractMethod = new IECAbstractMethodImpl();
		return iecAbstractMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECRepositoryPackage getIECRepositoryPackage() {
		return (IECRepositoryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IECRepositoryPackage getPackage() {
		return IECRepositoryPackage.eINSTANCE;
	}

} //IECRepositoryFactoryImpl
