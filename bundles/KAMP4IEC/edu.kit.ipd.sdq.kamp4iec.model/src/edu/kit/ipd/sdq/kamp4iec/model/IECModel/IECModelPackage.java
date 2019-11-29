/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECModel;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage;

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
 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelFactory
 * @model kind="package"
 * @generated
 */
public interface IECModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "IECModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/IECModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "IECModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IECModelPackage eINSTANCE = edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.IECModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.ProgramImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.IECModelPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__ID = IECRepositoryPackage.IEC_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__NAME = IECRepositoryPackage.IEC_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Instantiates Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__INSTANTIATES_INTERFACE = IECRepositoryPackage.IEC_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instantiates Function Block</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__INSTANTIATES_FUNCTION_BLOCK = IECRepositoryPackage.IEC_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Declares Global Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__DECLARES_GLOBAL_VARIABLE = IECRepositoryPackage.IEC_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reads Global Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__READS_GLOBAL_VARIABLE = IECRepositoryPackage.IEC_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Writes Global Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__WRITES_GLOBAL_VARIABLE = IECRepositoryPackage.IEC_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Reads Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__READS_PROPERTY = IECRepositoryPackage.IEC_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Writes Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__WRITES_PROPERTY = IECRepositoryPackage.IEC_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Calls Method</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__CALLS_METHOD = IECRepositoryPackage.IEC_COMPONENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Calls Function</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__CALLS_FUNCTION = IECRepositoryPackage.IEC_COMPONENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = IECRepositoryPackage.IEC_COMPONENT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = IECRepositoryPackage.IEC_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.ConfigurationImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.IECModelPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ID = IECRepositoryPackage.IEC_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__NAME = IECRepositoryPackage.IEC_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Instantiates Program</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__INSTANTIATES_PROGRAM = IECRepositoryPackage.IEC_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Declares Global Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__DECLARES_GLOBAL_VARIABLE = IECRepositoryPackage.IEC_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = IECRepositoryPackage.IEC_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = IECRepositoryPackage.IEC_COMPONENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program#getInstantiatesInterface <em>Instantiates Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instantiates Interface</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program#getInstantiatesInterface()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_InstantiatesInterface();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program#getInstantiatesFunctionBlock <em>Instantiates Function Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instantiates Function Block</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program#getInstantiatesFunctionBlock()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_InstantiatesFunctionBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program#getDeclaresGlobalVariable <em>Declares Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declares Global Variable</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program#getDeclaresGlobalVariable()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_DeclaresGlobalVariable();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program#getReadsGlobalVariable <em>Reads Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reads Global Variable</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program#getReadsGlobalVariable()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_ReadsGlobalVariable();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program#getWritesGlobalVariable <em>Writes Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Writes Global Variable</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program#getWritesGlobalVariable()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_WritesGlobalVariable();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program#getReadsProperty <em>Reads Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reads Property</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program#getReadsProperty()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_ReadsProperty();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program#getWritesProperty <em>Writes Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Writes Property</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program#getWritesProperty()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_WritesProperty();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program#getCallsMethod <em>Calls Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Calls Method</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program#getCallsMethod()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_CallsMethod();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program#getCallsFunction <em>Calls Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Calls Function</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program#getCallsFunction()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_CallsFunction();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.Configuration#getInstantiatesProgram <em>Instantiates Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instantiates Program</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.Configuration#getInstantiatesProgram()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_InstantiatesProgram();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.Configuration#getDeclaresGlobalVariable <em>Declares Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Declares Global Variable</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.Configuration#getDeclaresGlobalVariable()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_DeclaresGlobalVariable();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IECModelFactory getIECModelFactory();

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
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.ProgramImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.IECModelPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Instantiates Interface</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__INSTANTIATES_INTERFACE = eINSTANCE.getProgram_InstantiatesInterface();

		/**
		 * The meta object literal for the '<em><b>Instantiates Function Block</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__INSTANTIATES_FUNCTION_BLOCK = eINSTANCE.getProgram_InstantiatesFunctionBlock();

		/**
		 * The meta object literal for the '<em><b>Declares Global Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__DECLARES_GLOBAL_VARIABLE = eINSTANCE.getProgram_DeclaresGlobalVariable();

		/**
		 * The meta object literal for the '<em><b>Reads Global Variable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__READS_GLOBAL_VARIABLE = eINSTANCE.getProgram_ReadsGlobalVariable();

		/**
		 * The meta object literal for the '<em><b>Writes Global Variable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__WRITES_GLOBAL_VARIABLE = eINSTANCE.getProgram_WritesGlobalVariable();

		/**
		 * The meta object literal for the '<em><b>Reads Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__READS_PROPERTY = eINSTANCE.getProgram_ReadsProperty();

		/**
		 * The meta object literal for the '<em><b>Writes Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__WRITES_PROPERTY = eINSTANCE.getProgram_WritesProperty();

		/**
		 * The meta object literal for the '<em><b>Calls Method</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__CALLS_METHOD = eINSTANCE.getProgram_CallsMethod();

		/**
		 * The meta object literal for the '<em><b>Calls Function</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__CALLS_FUNCTION = eINSTANCE.getProgram_CallsFunction();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.ConfigurationImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECModel.impl.IECModelPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Instantiates Program</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__INSTANTIATES_PROGRAM = eINSTANCE.getConfiguration_InstantiatesProgram();

		/**
		 * The meta object literal for the '<em><b>Declares Global Variable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__DECLARES_GLOBAL_VARIABLE = eINSTANCE.getConfiguration_DeclaresGlobalVariable();

	}

} //IECModelPackage
