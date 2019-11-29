/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECRepository;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryFactory
 * @model kind="package"
 * @generated
 */
public interface IECRepositoryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "IECRepository";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/IECRepository";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "IECReporitory";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IECRepositoryPackage eINSTANCE = edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.RepositoryImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Contains Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__CONTAINS_INTERFACE = 0;

	/**
	 * The feature id for the '<em><b>Contains Function Block</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__CONTAINS_FUNCTION_BLOCK = 1;

	/**
	 * The feature id for the '<em><b>Contains Function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__CONTAINS_FUNCTION = 2;

	/**
	 * The feature id for the '<em><b>Contains Global Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__CONTAINS_GLOBAL_VARIABLE = 3;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IdentifierImpl <em>Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IdentifierImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getIdentifier()
	 * @generated
	 */
	int IDENTIFIER = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__NAME = 1;

	/**
	 * The number of structural features of the '<em>Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECComponent <em>IEC Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECComponent
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getIECComponent()
	 * @generated
	 */
	int IEC_COMPONENT = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_COMPONENT__ID = IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_COMPONENT__NAME = IDENTIFIER__NAME;

	/**
	 * The number of structural features of the '<em>IEC Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_COMPONENT_FEATURE_COUNT = IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IEC Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_COMPONENT_OPERATION_COUNT = IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.FunctionBlockImpl <em>Function Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.FunctionBlockImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getFunctionBlock()
	 * @generated
	 */
	int FUNCTION_BLOCK = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__ID = IEC_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__NAME = IEC_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Has Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__HAS_METHOD = IEC_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__HAS_PROPERTY = IEC_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__IMPLEMENTS = IEC_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Instantiates Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__INSTANTIATES_INTERFACE = IEC_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Instantiates Function Block</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__INSTANTIATES_FUNCTION_BLOCK = IEC_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Reads Global Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__READS_GLOBAL_VARIABLE = IEC_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Writes Global Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__WRITES_GLOBAL_VARIABLE = IEC_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Reads Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__READS_PROPERTY = IEC_COMPONENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Writes Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__WRITES_PROPERTY = IEC_COMPONENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Calls Method</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__CALLS_METHOD = IEC_COMPONENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Calls Function</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__CALLS_FUNCTION = IEC_COMPONENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Extends Function Block</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__EXTENDS_FUNCTION_BLOCK = IEC_COMPONENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Function Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_FEATURE_COUNT = IEC_COMPONENT_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Function Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_OPERATION_COUNT = IEC_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.GlobalVariableImpl <em>Global Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.GlobalVariableImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getGlobalVariable()
	 * @generated
	 */
	int GLOBAL_VARIABLE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__ID = IEC_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__NAME = IEC_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Has Derived Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__HAS_DERIVED_TYPE = IEC_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Global Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE_FEATURE_COUNT = IEC_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Global Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE_OPERATION_COUNT = IEC_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.FunctionImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__ID = IEC_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = IEC_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Calls Function</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__CALLS_FUNCTION = IEC_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Derived Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__HAS_DERIVED_RETURN_TYPE = IEC_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Calls Function Block Constructor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__CALLS_FUNCTION_BLOCK_CONSTRUCTOR = IEC_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = IEC_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = IEC_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECMethodImpl <em>IEC Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECMethodImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getIECMethod()
	 * @generated
	 */
	int IEC_METHOD = 5;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECInterfaceImpl <em>IEC Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECInterfaceImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getIECInterface()
	 * @generated
	 */
	int IEC_INTERFACE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_INTERFACE__ID = IEC_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_INTERFACE__NAME = IEC_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Has Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_INTERFACE__HAS_METHOD = IEC_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_INTERFACE__HAS_PROPERTY = IEC_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Extends Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_INTERFACE__EXTENDS_INTERFACE = IEC_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>IEC Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_INTERFACE_FEATURE_COUNT = IEC_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>IEC Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_INTERFACE_OPERATION_COUNT = IEC_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD__ID = IEC_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD__NAME = IEC_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD__IMPLEMENTS = IEC_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Derived Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD__HAS_DERIVED_RETURN_TYPE = IEC_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Instantiates Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD__INSTANTIATES_INTERFACE = IEC_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Instantiates Function Block</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD__INSTANTIATES_FUNCTION_BLOCK = IEC_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Reads Global Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD__READS_GLOBAL_VARIABLE = IEC_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Writes Global Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD__WRITES_GLOBAL_VARIABLE = IEC_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Reads Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD__READS_PROPERTY = IEC_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Writes Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD__WRITES_PROPERTY = IEC_COMPONENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Calls Method</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD__CALLS_METHOD = IEC_COMPONENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Calls Function</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD__CALLS_FUNCTION = IEC_COMPONENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>IEC Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD_FEATURE_COUNT = IEC_COMPONENT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>IEC Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METHOD_OPERATION_COUNT = IEC_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECPropertyImpl <em>IEC Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECPropertyImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getIECProperty()
	 * @generated
	 */
	int IEC_PROPERTY = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PROPERTY__ID = IEC_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PROPERTY__NAME = IEC_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PROPERTY__IMPLEMENTS = IEC_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Derived Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PROPERTY__HAS_DERIVED_TYPE = IEC_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IEC Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PROPERTY_FEATURE_COUNT = IEC_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>IEC Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PROPERTY_OPERATION_COUNT = IEC_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECAbstractPropertyImpl <em>IEC Abstract Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECAbstractPropertyImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getIECAbstractProperty()
	 * @generated
	 */
	int IEC_ABSTRACT_PROPERTY = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_ABSTRACT_PROPERTY__ID = IEC_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_ABSTRACT_PROPERTY__NAME = IEC_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Has Derived Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_ABSTRACT_PROPERTY__HAS_DERIVED_TYPE = IEC_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IEC Abstract Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_ABSTRACT_PROPERTY_FEATURE_COUNT = IEC_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>IEC Abstract Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_ABSTRACT_PROPERTY_OPERATION_COUNT = IEC_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECAbstractMethodImpl <em>IEC Abstract Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECAbstractMethodImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getIECAbstractMethod()
	 * @generated
	 */
	int IEC_ABSTRACT_METHOD = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_ABSTRACT_METHOD__ID = IEC_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_ABSTRACT_METHOD__NAME = IEC_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Has Derived Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_ABSTRACT_METHOD__HAS_DERIVED_RETURN_TYPE = IEC_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IEC Abstract Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_ABSTRACT_METHOD_FEATURE_COUNT = IEC_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>IEC Abstract Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_ABSTRACT_METHOD_OPERATION_COUNT = IEC_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.DerivedTypeImpl <em>Derived Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.DerivedTypeImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getDerivedType()
	 * @generated
	 */
	int DERIVED_TYPE = 11;

	/**
	 * The number of structural features of the '<em>Derived Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Derived Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IsMethod <em>Is Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IsMethod
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getIsMethod()
	 * @generated
	 */
	int IS_METHOD = 12;

	/**
	 * The number of structural features of the '<em>Is Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_METHOD_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Is Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_METHOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IsProperty <em>Is Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IsProperty
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getIsProperty()
	 * @generated
	 */
	int IS_PROPERTY = 13;

	/**
	 * The number of structural features of the '<em>Is Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_PROPERTY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Is Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_PROPERTY_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository#getContainsInterface <em>Contains Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Interface</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository#getContainsInterface()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_ContainsInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository#getContainsFunctionBlock <em>Contains Function Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Function Block</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository#getContainsFunctionBlock()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_ContainsFunctionBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository#getContainsFunction <em>Contains Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Function</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository#getContainsFunction()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_ContainsFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository#getContainsGlobalVariable <em>Contains Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Global Variable</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository#getContainsGlobalVariable()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_ContainsGlobalVariable();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock <em>Function Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Block</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock
	 * @generated
	 */
	EClass getFunctionBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getHasMethod <em>Has Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Method</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getHasMethod()
	 * @see #getFunctionBlock()
	 * @generated
	 */
	EReference getFunctionBlock_HasMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getHasProperty <em>Has Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Property</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getHasProperty()
	 * @see #getFunctionBlock()
	 * @generated
	 */
	EReference getFunctionBlock_HasProperty();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Implements</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getImplements()
	 * @see #getFunctionBlock()
	 * @generated
	 */
	EReference getFunctionBlock_Implements();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getInstantiatesInterface <em>Instantiates Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instantiates Interface</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getInstantiatesInterface()
	 * @see #getFunctionBlock()
	 * @generated
	 */
	EReference getFunctionBlock_InstantiatesInterface();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getInstantiatesFunctionBlock <em>Instantiates Function Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instantiates Function Block</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getInstantiatesFunctionBlock()
	 * @see #getFunctionBlock()
	 * @generated
	 */
	EReference getFunctionBlock_InstantiatesFunctionBlock();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getReadsGlobalVariable <em>Reads Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reads Global Variable</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getReadsGlobalVariable()
	 * @see #getFunctionBlock()
	 * @generated
	 */
	EReference getFunctionBlock_ReadsGlobalVariable();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getWritesGlobalVariable <em>Writes Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Writes Global Variable</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getWritesGlobalVariable()
	 * @see #getFunctionBlock()
	 * @generated
	 */
	EReference getFunctionBlock_WritesGlobalVariable();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getReadsProperty <em>Reads Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reads Property</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getReadsProperty()
	 * @see #getFunctionBlock()
	 * @generated
	 */
	EReference getFunctionBlock_ReadsProperty();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getWritesProperty <em>Writes Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Writes Property</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getWritesProperty()
	 * @see #getFunctionBlock()
	 * @generated
	 */
	EReference getFunctionBlock_WritesProperty();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getCallsMethod <em>Calls Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Calls Method</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getCallsMethod()
	 * @see #getFunctionBlock()
	 * @generated
	 */
	EReference getFunctionBlock_CallsMethod();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getCallsFunction <em>Calls Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Calls Function</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getCallsFunction()
	 * @see #getFunctionBlock()
	 * @generated
	 */
	EReference getFunctionBlock_CallsFunction();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getExtendsFunctionBlock <em>Extends Function Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extends Function Block</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock#getExtendsFunctionBlock()
	 * @see #getFunctionBlock()
	 * @generated
	 */
	EReference getFunctionBlock_ExtendsFunctionBlock();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.GlobalVariable <em>Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Variable</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.GlobalVariable
	 * @generated
	 */
	EClass getGlobalVariable();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.GlobalVariable#getHasDerivedType <em>Has Derived Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Derived Type</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.GlobalVariable#getHasDerivedType()
	 * @see #getGlobalVariable()
	 * @generated
	 */
	EReference getGlobalVariable_HasDerivedType();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Function#getCallsFunction <em>Calls Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Calls Function</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Function#getCallsFunction()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_CallsFunction();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Function#getHasDerivedReturnType <em>Has Derived Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Derived Return Type</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Function#getHasDerivedReturnType()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_HasDerivedReturnType();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Function#getCallsFunctionBlockConstructor <em>Calls Function Block Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Calls Function Block Constructor</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Function#getCallsFunctionBlockConstructor()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_CallsFunctionBlockConstructor();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethod <em>IEC Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Method</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethod
	 * @generated
	 */
	EClass getIECMethod();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethod#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implements</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethod#getImplements()
	 * @see #getIECMethod()
	 * @generated
	 */
	EReference getIECMethod_Implements();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethod#getHasDerivedReturnType <em>Has Derived Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Derived Return Type</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethod#getHasDerivedReturnType()
	 * @see #getIECMethod()
	 * @generated
	 */
	EReference getIECMethod_HasDerivedReturnType();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethod#getInstantiatesInterface <em>Instantiates Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instantiates Interface</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethod#getInstantiatesInterface()
	 * @see #getIECMethod()
	 * @generated
	 */
	EReference getIECMethod_InstantiatesInterface();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethod#getInstantiatesFunctionBlock <em>Instantiates Function Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instantiates Function Block</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethod#getInstantiatesFunctionBlock()
	 * @see #getIECMethod()
	 * @generated
	 */
	EReference getIECMethod_InstantiatesFunctionBlock();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethod#getReadsGlobalVariable <em>Reads Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reads Global Variable</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethod#getReadsGlobalVariable()
	 * @see #getIECMethod()
	 * @generated
	 */
	EReference getIECMethod_ReadsGlobalVariable();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethod#getWritesGlobalVariable <em>Writes Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Writes Global Variable</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethod#getWritesGlobalVariable()
	 * @see #getIECMethod()
	 * @generated
	 */
	EReference getIECMethod_WritesGlobalVariable();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethod#getReadsProperty <em>Reads Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reads Property</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethod#getReadsProperty()
	 * @see #getIECMethod()
	 * @generated
	 */
	EReference getIECMethod_ReadsProperty();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethod#getWritesProperty <em>Writes Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Writes Property</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethod#getWritesProperty()
	 * @see #getIECMethod()
	 * @generated
	 */
	EReference getIECMethod_WritesProperty();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethod#getCallsMethod <em>Calls Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Calls Method</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethod#getCallsMethod()
	 * @see #getIECMethod()
	 * @generated
	 */
	EReference getIECMethod_CallsMethod();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethod#getCallsFunction <em>Calls Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Calls Function</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethod#getCallsFunction()
	 * @see #getIECMethod()
	 * @generated
	 */
	EReference getIECMethod_CallsFunction();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECInterface <em>IEC Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Interface</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECInterface
	 * @generated
	 */
	EClass getIECInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECInterface#getHasMethod <em>Has Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Method</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECInterface#getHasMethod()
	 * @see #getIECInterface()
	 * @generated
	 */
	EReference getIECInterface_HasMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECInterface#getHasProperty <em>Has Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Property</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECInterface#getHasProperty()
	 * @see #getIECInterface()
	 * @generated
	 */
	EReference getIECInterface_HasProperty();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECInterface#getExtendsInterface <em>Extends Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extends Interface</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECInterface#getExtendsInterface()
	 * @see #getIECInterface()
	 * @generated
	 */
	EReference getIECInterface_ExtendsInterface();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECProperty <em>IEC Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Property</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECProperty
	 * @generated
	 */
	EClass getIECProperty();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECProperty#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implements</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECProperty#getImplements()
	 * @see #getIECProperty()
	 * @generated
	 */
	EReference getIECProperty_Implements();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECProperty#getHasDerivedType <em>Has Derived Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Derived Type</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECProperty#getHasDerivedType()
	 * @see #getIECProperty()
	 * @generated
	 */
	EReference getIECProperty_HasDerivedType();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECAbstractProperty <em>IEC Abstract Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Abstract Property</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECAbstractProperty
	 * @generated
	 */
	EClass getIECAbstractProperty();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECAbstractProperty#getHasDerivedType <em>Has Derived Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Derived Type</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECAbstractProperty#getHasDerivedType()
	 * @see #getIECAbstractProperty()
	 * @generated
	 */
	EReference getIECAbstractProperty_HasDerivedType();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECAbstractMethod <em>IEC Abstract Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Abstract Method</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECAbstractMethod
	 * @generated
	 */
	EClass getIECAbstractMethod();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECAbstractMethod#getHasDerivedReturnType <em>Has Derived Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Derived Return Type</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECAbstractMethod#getHasDerivedReturnType()
	 * @see #getIECAbstractMethod()
	 * @generated
	 */
	EReference getIECAbstractMethod_HasDerivedReturnType();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECComponent <em>IEC Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Component</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECComponent
	 * @generated
	 */
	EClass getIECComponent();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifier</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Identifier
	 * @generated
	 */
	EClass getIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Identifier#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Identifier#getId()
	 * @see #getIdentifier()
	 * @generated
	 */
	EAttribute getIdentifier_Id();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Identifier#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Identifier#getName()
	 * @see #getIdentifier()
	 * @generated
	 */
	EAttribute getIdentifier_Name();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.DerivedType <em>Derived Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived Type</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.DerivedType
	 * @generated
	 */
	EClass getDerivedType();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IsMethod <em>Is Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Method</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IsMethod
	 * @generated
	 */
	EClass getIsMethod();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IsProperty <em>Is Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Property</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IsProperty
	 * @generated
	 */
	EClass getIsProperty();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IECRepositoryFactory getIECRepositoryFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.RepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.RepositoryImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getRepository()
		 * @generated
		 */
		EClass REPOSITORY = eINSTANCE.getRepository();

		/**
		 * The meta object literal for the '<em><b>Contains Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__CONTAINS_INTERFACE = eINSTANCE.getRepository_ContainsInterface();

		/**
		 * The meta object literal for the '<em><b>Contains Function Block</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__CONTAINS_FUNCTION_BLOCK = eINSTANCE.getRepository_ContainsFunctionBlock();

		/**
		 * The meta object literal for the '<em><b>Contains Function</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__CONTAINS_FUNCTION = eINSTANCE.getRepository_ContainsFunction();

		/**
		 * The meta object literal for the '<em><b>Contains Global Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__CONTAINS_GLOBAL_VARIABLE = eINSTANCE.getRepository_ContainsGlobalVariable();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.FunctionBlockImpl <em>Function Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.FunctionBlockImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getFunctionBlock()
		 * @generated
		 */
		EClass FUNCTION_BLOCK = eINSTANCE.getFunctionBlock();

		/**
		 * The meta object literal for the '<em><b>Has Method</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK__HAS_METHOD = eINSTANCE.getFunctionBlock_HasMethod();

		/**
		 * The meta object literal for the '<em><b>Has Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK__HAS_PROPERTY = eINSTANCE.getFunctionBlock_HasProperty();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK__IMPLEMENTS = eINSTANCE.getFunctionBlock_Implements();

		/**
		 * The meta object literal for the '<em><b>Instantiates Interface</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK__INSTANTIATES_INTERFACE = eINSTANCE.getFunctionBlock_InstantiatesInterface();

		/**
		 * The meta object literal for the '<em><b>Instantiates Function Block</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK__INSTANTIATES_FUNCTION_BLOCK = eINSTANCE.getFunctionBlock_InstantiatesFunctionBlock();

		/**
		 * The meta object literal for the '<em><b>Reads Global Variable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK__READS_GLOBAL_VARIABLE = eINSTANCE.getFunctionBlock_ReadsGlobalVariable();

		/**
		 * The meta object literal for the '<em><b>Writes Global Variable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK__WRITES_GLOBAL_VARIABLE = eINSTANCE.getFunctionBlock_WritesGlobalVariable();

		/**
		 * The meta object literal for the '<em><b>Reads Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK__READS_PROPERTY = eINSTANCE.getFunctionBlock_ReadsProperty();

		/**
		 * The meta object literal for the '<em><b>Writes Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK__WRITES_PROPERTY = eINSTANCE.getFunctionBlock_WritesProperty();

		/**
		 * The meta object literal for the '<em><b>Calls Method</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK__CALLS_METHOD = eINSTANCE.getFunctionBlock_CallsMethod();

		/**
		 * The meta object literal for the '<em><b>Calls Function</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK__CALLS_FUNCTION = eINSTANCE.getFunctionBlock_CallsFunction();

		/**
		 * The meta object literal for the '<em><b>Extends Function Block</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK__EXTENDS_FUNCTION_BLOCK = eINSTANCE.getFunctionBlock_ExtendsFunctionBlock();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.GlobalVariableImpl <em>Global Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.GlobalVariableImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getGlobalVariable()
		 * @generated
		 */
		EClass GLOBAL_VARIABLE = eINSTANCE.getGlobalVariable();

		/**
		 * The meta object literal for the '<em><b>Has Derived Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_VARIABLE__HAS_DERIVED_TYPE = eINSTANCE.getGlobalVariable_HasDerivedType();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.FunctionImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Calls Function</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__CALLS_FUNCTION = eINSTANCE.getFunction_CallsFunction();

		/**
		 * The meta object literal for the '<em><b>Has Derived Return Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__HAS_DERIVED_RETURN_TYPE = eINSTANCE.getFunction_HasDerivedReturnType();

		/**
		 * The meta object literal for the '<em><b>Calls Function Block Constructor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__CALLS_FUNCTION_BLOCK_CONSTRUCTOR = eINSTANCE.getFunction_CallsFunctionBlockConstructor();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECMethodImpl <em>IEC Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECMethodImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getIECMethod()
		 * @generated
		 */
		EClass IEC_METHOD = eINSTANCE.getIECMethod();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_METHOD__IMPLEMENTS = eINSTANCE.getIECMethod_Implements();

		/**
		 * The meta object literal for the '<em><b>Has Derived Return Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_METHOD__HAS_DERIVED_RETURN_TYPE = eINSTANCE.getIECMethod_HasDerivedReturnType();

		/**
		 * The meta object literal for the '<em><b>Instantiates Interface</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_METHOD__INSTANTIATES_INTERFACE = eINSTANCE.getIECMethod_InstantiatesInterface();

		/**
		 * The meta object literal for the '<em><b>Instantiates Function Block</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_METHOD__INSTANTIATES_FUNCTION_BLOCK = eINSTANCE.getIECMethod_InstantiatesFunctionBlock();

		/**
		 * The meta object literal for the '<em><b>Reads Global Variable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_METHOD__READS_GLOBAL_VARIABLE = eINSTANCE.getIECMethod_ReadsGlobalVariable();

		/**
		 * The meta object literal for the '<em><b>Writes Global Variable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_METHOD__WRITES_GLOBAL_VARIABLE = eINSTANCE.getIECMethod_WritesGlobalVariable();

		/**
		 * The meta object literal for the '<em><b>Reads Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_METHOD__READS_PROPERTY = eINSTANCE.getIECMethod_ReadsProperty();

		/**
		 * The meta object literal for the '<em><b>Writes Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_METHOD__WRITES_PROPERTY = eINSTANCE.getIECMethod_WritesProperty();

		/**
		 * The meta object literal for the '<em><b>Calls Method</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_METHOD__CALLS_METHOD = eINSTANCE.getIECMethod_CallsMethod();

		/**
		 * The meta object literal for the '<em><b>Calls Function</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_METHOD__CALLS_FUNCTION = eINSTANCE.getIECMethod_CallsFunction();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECInterfaceImpl <em>IEC Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECInterfaceImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getIECInterface()
		 * @generated
		 */
		EClass IEC_INTERFACE = eINSTANCE.getIECInterface();

		/**
		 * The meta object literal for the '<em><b>Has Method</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_INTERFACE__HAS_METHOD = eINSTANCE.getIECInterface_HasMethod();

		/**
		 * The meta object literal for the '<em><b>Has Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_INTERFACE__HAS_PROPERTY = eINSTANCE.getIECInterface_HasProperty();

		/**
		 * The meta object literal for the '<em><b>Extends Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_INTERFACE__EXTENDS_INTERFACE = eINSTANCE.getIECInterface_ExtendsInterface();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECPropertyImpl <em>IEC Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECPropertyImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getIECProperty()
		 * @generated
		 */
		EClass IEC_PROPERTY = eINSTANCE.getIECProperty();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_PROPERTY__IMPLEMENTS = eINSTANCE.getIECProperty_Implements();

		/**
		 * The meta object literal for the '<em><b>Has Derived Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_PROPERTY__HAS_DERIVED_TYPE = eINSTANCE.getIECProperty_HasDerivedType();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECAbstractPropertyImpl <em>IEC Abstract Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECAbstractPropertyImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getIECAbstractProperty()
		 * @generated
		 */
		EClass IEC_ABSTRACT_PROPERTY = eINSTANCE.getIECAbstractProperty();

		/**
		 * The meta object literal for the '<em><b>Has Derived Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_ABSTRACT_PROPERTY__HAS_DERIVED_TYPE = eINSTANCE.getIECAbstractProperty_HasDerivedType();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECAbstractMethodImpl <em>IEC Abstract Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECAbstractMethodImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getIECAbstractMethod()
		 * @generated
		 */
		EClass IEC_ABSTRACT_METHOD = eINSTANCE.getIECAbstractMethod();

		/**
		 * The meta object literal for the '<em><b>Has Derived Return Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_ABSTRACT_METHOD__HAS_DERIVED_RETURN_TYPE = eINSTANCE.getIECAbstractMethod_HasDerivedReturnType();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECComponent <em>IEC Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECComponent
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getIECComponent()
		 * @generated
		 */
		EClass IEC_COMPONENT = eINSTANCE.getIECComponent();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IdentifierImpl <em>Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IdentifierImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getIdentifier()
		 * @generated
		 */
		EClass IDENTIFIER = eINSTANCE.getIdentifier();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIER__ID = eINSTANCE.getIdentifier_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIER__NAME = eINSTANCE.getIdentifier_Name();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.DerivedTypeImpl <em>Derived Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.DerivedTypeImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getDerivedType()
		 * @generated
		 */
		EClass DERIVED_TYPE = eINSTANCE.getDerivedType();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IsMethod <em>Is Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IsMethod
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getIsMethod()
		 * @generated
		 */
		EClass IS_METHOD = eINSTANCE.getIsMethod();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IsProperty <em>Is Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IsProperty
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECRepositoryPackageImpl#getIsProperty()
		 * @generated
		 */
		EClass IS_PROPERTY = eINSTANCE.getIsProperty();

	}

} //IECRepositoryPackage
