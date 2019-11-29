/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations;

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
 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsFactory
 * @model kind="package"
 * @generated
 */
public interface IECFieldOfActivityAnnotationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "IECFieldOfActivityAnnotations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/IECFieldOfActivityAnnotations";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "IECFieldOfActivityAnnotations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IECFieldOfActivityAnnotationsPackage eINSTANCE = edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsRepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsRepositoryImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsPackageImpl#getIECFieldOfActivityAnnotationsRepository()
	 * @generated
	 */
	int IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Development Artefact Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEVELOPMENT_ARTEFACT_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Test Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_SPECIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Staff Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__STAFF_SPECIFICATION = 2;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECDevelopmentArtefactSpecificationImpl <em>IEC Development Artefact Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECDevelopmentArtefactSpecificationImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsPackageImpl#getIECDevelopmentArtefactSpecification()
	 * @generated
	 */
	int IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Source Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILES = 1;

	/**
	 * The feature id for the '<em><b>Source File Aggregations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILE_AGGREGATIONS = 2;

	/**
	 * The feature id for the '<em><b>Metadata Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILES = 3;

	/**
	 * The feature id for the '<em><b>Metadata File Aggregations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILE_AGGREGATIONS = 4;

	/**
	 * The number of structural features of the '<em>IEC Development Artefact Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>IEC Development Artefact Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFileImpl <em>IEC File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFileImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsPackageImpl#getIECFile()
	 * @generated
	 */
	int IEC_FILE = 20;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_FILE__FILENAME = 0;

	/**
	 * The number of structural features of the '<em>IEC File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_FILE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>IEC File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_FILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECSourceFileImpl <em>IEC Source File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECSourceFileImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsPackageImpl#getIECSourceFile()
	 * @generated
	 */
	int IEC_SOURCE_FILE = 2;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_SOURCE_FILE__FILENAME = IEC_FILE__FILENAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_SOURCE_FILE__PARENT = IEC_FILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_SOURCE_FILE__COMPONENT = IEC_FILE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IEC Source File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_SOURCE_FILE_FEATURE_COUNT = IEC_FILE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>IEC Source File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_SOURCE_FILE_OPERATION_COUNT = IEC_FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFileAggregationImpl <em>IEC File Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFileAggregationImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsPackageImpl#getIECFileAggregation()
	 * @generated
	 */
	int IEC_FILE_AGGREGATION = 21;

	/**
	 * The feature id for the '<em><b>Number Of Files</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_FILE_AGGREGATION__NUMBER_OF_FILES = 0;

	/**
	 * The number of structural features of the '<em>IEC File Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_FILE_AGGREGATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>IEC File Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_FILE_AGGREGATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECSourceFileAggregationImpl <em>IEC Source File Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECSourceFileAggregationImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsPackageImpl#getIECSourceFileAggregation()
	 * @generated
	 */
	int IEC_SOURCE_FILE_AGGREGATION = 3;

	/**
	 * The feature id for the '<em><b>Number Of Files</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_SOURCE_FILE_AGGREGATION__NUMBER_OF_FILES = IEC_FILE_AGGREGATION__NUMBER_OF_FILES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_SOURCE_FILE_AGGREGATION__PARENT = IEC_FILE_AGGREGATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_SOURCE_FILE_AGGREGATION__COMPONENT = IEC_FILE_AGGREGATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IEC Source File Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_SOURCE_FILE_AGGREGATION_FEATURE_COUNT = IEC_FILE_AGGREGATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>IEC Source File Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_SOURCE_FILE_AGGREGATION_OPERATION_COUNT = IEC_FILE_AGGREGATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECMetadataFileImpl <em>IEC Metadata File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECMetadataFileImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsPackageImpl#getIECMetadataFile()
	 * @generated
	 */
	int IEC_METADATA_FILE = 4;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METADATA_FILE__FILENAME = IEC_FILE__FILENAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METADATA_FILE__PARENT = IEC_FILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METADATA_FILE__COMPONENT = IEC_FILE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IEC Metadata File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METADATA_FILE_FEATURE_COUNT = IEC_FILE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>IEC Metadata File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METADATA_FILE_OPERATION_COUNT = IEC_FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECMetadataFileAggregationImpl <em>IEC Metadata File Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECMetadataFileAggregationImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsPackageImpl#getIECMetadataFileAggregation()
	 * @generated
	 */
	int IEC_METADATA_FILE_AGGREGATION = 5;

	/**
	 * The feature id for the '<em><b>Number Of Files</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METADATA_FILE_AGGREGATION__NUMBER_OF_FILES = IEC_FILE_AGGREGATION__NUMBER_OF_FILES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METADATA_FILE_AGGREGATION__PARENT = IEC_FILE_AGGREGATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METADATA_FILE_AGGREGATION__COMPONENT = IEC_FILE_AGGREGATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IEC Metadata File Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METADATA_FILE_AGGREGATION_FEATURE_COUNT = IEC_FILE_AGGREGATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>IEC Metadata File Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_METADATA_FILE_AGGREGATION_OPERATION_COUNT = IEC_FILE_AGGREGATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECTestSpecificationImpl <em>IEC Test Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECTestSpecificationImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsPackageImpl#getIECTestSpecification()
	 * @generated
	 */
	int IEC_TEST_SPECIFICATION = 6;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_TEST_SPECIFICATION__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Unit Test Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_TEST_SPECIFICATION__UNIT_TEST_CASES = 1;

	/**
	 * The feature id for the '<em><b>Acceptance Test Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_TEST_SPECIFICATION__ACCEPTANCE_TEST_CASES = 2;

	/**
	 * The feature id for the '<em><b>Unit Test Case Aggregations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_TEST_SPECIFICATION__UNIT_TEST_CASE_AGGREGATIONS = 3;

	/**
	 * The feature id for the '<em><b>Acceptance Test Case Aggregations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_TEST_SPECIFICATION__ACCEPTANCE_TEST_CASE_AGGREGATIONS = 4;

	/**
	 * The number of structural features of the '<em>IEC Test Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_TEST_SPECIFICATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>IEC Test Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_TEST_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECTestCaseImpl <em>IEC Test Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECTestCaseImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsPackageImpl#getIECTestCase()
	 * @generated
	 */
	int IEC_TEST_CASE = 22;

	/**
	 * The feature id for the '<em><b>Name Of Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_TEST_CASE__NAME_OF_TEST = 0;

	/**
	 * The number of structural features of the '<em>IEC Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_TEST_CASE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>IEC Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_TEST_CASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECUnitTestCaseImpl <em>IEC Unit Test Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECUnitTestCaseImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsPackageImpl#getIECUnitTestCase()
	 * @generated
	 */
	int IEC_UNIT_TEST_CASE = 7;

	/**
	 * The feature id for the '<em><b>Name Of Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_UNIT_TEST_CASE__NAME_OF_TEST = IEC_TEST_CASE__NAME_OF_TEST;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_UNIT_TEST_CASE__PARENT = IEC_TEST_CASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_UNIT_TEST_CASE__COMPONENT = IEC_TEST_CASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IEC Unit Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_UNIT_TEST_CASE_FEATURE_COUNT = IEC_TEST_CASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>IEC Unit Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_UNIT_TEST_CASE_OPERATION_COUNT = IEC_TEST_CASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECAcceptanceTestCaseImpl <em>IEC Acceptance Test Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECAcceptanceTestCaseImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsPackageImpl#getIECAcceptanceTestCase()
	 * @generated
	 */
	int IEC_ACCEPTANCE_TEST_CASE = 8;

	/**
	 * The feature id for the '<em><b>Name Of Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_ACCEPTANCE_TEST_CASE__NAME_OF_TEST = IEC_TEST_CASE__NAME_OF_TEST;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_ACCEPTANCE_TEST_CASE__PARENT = IEC_TEST_CASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_ACCEPTANCE_TEST_CASE__COMPONENT = IEC_TEST_CASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IEC Acceptance Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_ACCEPTANCE_TEST_CASE_FEATURE_COUNT = IEC_TEST_CASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>IEC Acceptance Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_ACCEPTANCE_TEST_CASE_OPERATION_COUNT = IEC_TEST_CASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECTestCaseAggregationImpl <em>IEC Test Case Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECTestCaseAggregationImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsPackageImpl#getIECTestCaseAggregation()
	 * @generated
	 */
	int IEC_TEST_CASE_AGGREGATION = 23;

	/**
	 * The feature id for the '<em><b>Number Of Testcases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_TEST_CASE_AGGREGATION__NUMBER_OF_TESTCASES = 0;

	/**
	 * The feature id for the '<em><b>Name Of Test Suite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_TEST_CASE_AGGREGATION__NAME_OF_TEST_SUITE = 1;

	/**
	 * The number of structural features of the '<em>IEC Test Case Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_TEST_CASE_AGGREGATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>IEC Test Case Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_TEST_CASE_AGGREGATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECUnitTestCaseAggregationImpl <em>IEC Unit Test Case Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECUnitTestCaseAggregationImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsPackageImpl#getIECUnitTestCaseAggregation()
	 * @generated
	 */
	int IEC_UNIT_TEST_CASE_AGGREGATION = 9;

	/**
	 * The feature id for the '<em><b>Number Of Testcases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_UNIT_TEST_CASE_AGGREGATION__NUMBER_OF_TESTCASES = IEC_TEST_CASE_AGGREGATION__NUMBER_OF_TESTCASES;

	/**
	 * The feature id for the '<em><b>Name Of Test Suite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_UNIT_TEST_CASE_AGGREGATION__NAME_OF_TEST_SUITE = IEC_TEST_CASE_AGGREGATION__NAME_OF_TEST_SUITE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_UNIT_TEST_CASE_AGGREGATION__PARENT = IEC_TEST_CASE_AGGREGATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_UNIT_TEST_CASE_AGGREGATION__COMPONENT = IEC_TEST_CASE_AGGREGATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IEC Unit Test Case Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_UNIT_TEST_CASE_AGGREGATION_FEATURE_COUNT = IEC_TEST_CASE_AGGREGATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>IEC Unit Test Case Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_UNIT_TEST_CASE_AGGREGATION_OPERATION_COUNT = IEC_TEST_CASE_AGGREGATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECAcceptanceTestCaseAggregationImpl <em>IEC Acceptance Test Case Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECAcceptanceTestCaseAggregationImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsPackageImpl#getIECAcceptanceTestCaseAggregation()
	 * @generated
	 */
	int IEC_ACCEPTANCE_TEST_CASE_AGGREGATION = 10;

	/**
	 * The feature id for the '<em><b>Number Of Testcases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_ACCEPTANCE_TEST_CASE_AGGREGATION__NUMBER_OF_TESTCASES = IEC_TEST_CASE_AGGREGATION__NUMBER_OF_TESTCASES;

	/**
	 * The feature id for the '<em><b>Name Of Test Suite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_ACCEPTANCE_TEST_CASE_AGGREGATION__NAME_OF_TEST_SUITE = IEC_TEST_CASE_AGGREGATION__NAME_OF_TEST_SUITE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_ACCEPTANCE_TEST_CASE_AGGREGATION__PARENT = IEC_TEST_CASE_AGGREGATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_ACCEPTANCE_TEST_CASE_AGGREGATION__COMPONENT = IEC_TEST_CASE_AGGREGATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IEC Acceptance Test Case Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_ACCEPTANCE_TEST_CASE_AGGREGATION_FEATURE_COUNT = IEC_TEST_CASE_AGGREGATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>IEC Acceptance Test Case Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_ACCEPTANCE_TEST_CASE_AGGREGATION_OPERATION_COUNT = IEC_TEST_CASE_AGGREGATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECStaffSpecificationImpl <em>IEC Staff Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECStaffSpecificationImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsPackageImpl#getIECStaffSpecification()
	 * @generated
	 */
	int IEC_STAFF_SPECIFICATION = 11;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_STAFF_SPECIFICATION__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Person List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_STAFF_SPECIFICATION__PERSON_LIST = 1;

	/**
	 * The feature id for the '<em><b>Role List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_STAFF_SPECIFICATION__ROLE_LIST = 2;

	/**
	 * The number of structural features of the '<em>IEC Staff Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_STAFF_SPECIFICATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>IEC Staff Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_STAFF_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECPersonListImpl <em>IEC Person List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECPersonListImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsPackageImpl#getIECPersonList()
	 * @generated
	 */
	int IEC_PERSON_LIST = 12;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PERSON_LIST__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Persons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PERSON_LIST__PERSONS = 1;

	/**
	 * The number of structural features of the '<em>IEC Person List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PERSON_LIST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>IEC Person List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PERSON_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECPersonImpl <em>IEC Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECPersonImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsPackageImpl#getIECPerson()
	 * @generated
	 */
	int IEC_PERSON = 13;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PERSON__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PERSON__ROLES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PERSON__NAME = 2;

	/**
	 * The number of structural features of the '<em>IEC Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PERSON_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>IEC Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECRoleImpl <em>IEC Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECRoleImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsPackageImpl#getIECRole()
	 * @generated
	 */
	int IEC_ROLE = 14;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_ROLE__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_ROLE__PERSON = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_ROLE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_ROLE__COMPONENTS = 3;

	/**
	 * The number of structural features of the '<em>IEC Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_ROLE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>IEC Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECRoleListImpl <em>IEC Role List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECRoleListImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsPackageImpl#getIECRoleList()
	 * @generated
	 */
	int IEC_ROLE_LIST = 15;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_ROLE_LIST__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_ROLE_LIST__ROLES = 1;

	/**
	 * The number of structural features of the '<em>IEC Role List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_ROLE_LIST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>IEC Role List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_ROLE_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECDeveloperImpl <em>IEC Developer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECDeveloperImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsPackageImpl#getIECDeveloper()
	 * @generated
	 */
	int IEC_DEVELOPER = 16;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_DEVELOPER__PARENT = IEC_ROLE__PARENT;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_DEVELOPER__PERSON = IEC_ROLE__PERSON;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_DEVELOPER__DESCRIPTION = IEC_ROLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_DEVELOPER__COMPONENTS = IEC_ROLE__COMPONENTS;

	/**
	 * The number of structural features of the '<em>IEC Developer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_DEVELOPER_FEATURE_COUNT = IEC_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IEC Developer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_DEVELOPER_OPERATION_COUNT = IEC_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECTestDeveloperImpl <em>IEC Test Developer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECTestDeveloperImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsPackageImpl#getIECTestDeveloper()
	 * @generated
	 */
	int IEC_TEST_DEVELOPER = 17;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_TEST_DEVELOPER__PARENT = IEC_ROLE__PARENT;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_TEST_DEVELOPER__PERSON = IEC_ROLE__PERSON;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_TEST_DEVELOPER__DESCRIPTION = IEC_ROLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_TEST_DEVELOPER__COMPONENTS = IEC_ROLE__COMPONENTS;

	/**
	 * The number of structural features of the '<em>IEC Test Developer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_TEST_DEVELOPER_FEATURE_COUNT = IEC_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IEC Test Developer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_TEST_DEVELOPER_OPERATION_COUNT = IEC_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECTesterImpl <em>IEC Tester</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECTesterImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsPackageImpl#getIECTester()
	 * @generated
	 */
	int IEC_TESTER = 18;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_TESTER__PARENT = IEC_ROLE__PARENT;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_TESTER__PERSON = IEC_ROLE__PERSON;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_TESTER__DESCRIPTION = IEC_ROLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_TESTER__COMPONENTS = IEC_ROLE__COMPONENTS;

	/**
	 * The number of structural features of the '<em>IEC Tester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_TESTER_FEATURE_COUNT = IEC_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IEC Tester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_TESTER_OPERATION_COUNT = IEC_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECDeployerImpl <em>IEC Deployer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECDeployerImpl
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsPackageImpl#getIECDeployer()
	 * @generated
	 */
	int IEC_DEPLOYER = 19;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_DEPLOYER__PARENT = IEC_ROLE__PARENT;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_DEPLOYER__PERSON = IEC_ROLE__PERSON;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_DEPLOYER__DESCRIPTION = IEC_ROLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_DEPLOYER__COMPONENTS = IEC_ROLE__COMPONENTS;

	/**
	 * The number of structural features of the '<em>IEC Deployer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_DEPLOYER_FEATURE_COUNT = IEC_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IEC Deployer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC_DEPLOYER_OPERATION_COUNT = IEC_ROLE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsRepository
	 * @generated
	 */
	EClass getIECFieldOfActivityAnnotationsRepository();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsRepository#getDevelopmentArtefactSpecification <em>Development Artefact Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Development Artefact Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsRepository#getDevelopmentArtefactSpecification()
	 * @see #getIECFieldOfActivityAnnotationsRepository()
	 * @generated
	 */
	EReference getIECFieldOfActivityAnnotationsRepository_DevelopmentArtefactSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsRepository#getTestSpecification <em>Test Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Test Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsRepository#getTestSpecification()
	 * @see #getIECFieldOfActivityAnnotationsRepository()
	 * @generated
	 */
	EReference getIECFieldOfActivityAnnotationsRepository_TestSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsRepository#getStaffSpecification <em>Staff Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Staff Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsRepository#getStaffSpecification()
	 * @see #getIECFieldOfActivityAnnotationsRepository()
	 * @generated
	 */
	EReference getIECFieldOfActivityAnnotationsRepository_StaffSpecification();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECDevelopmentArtefactSpecification <em>IEC Development Artefact Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Development Artefact Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECDevelopmentArtefactSpecification
	 * @generated
	 */
	EClass getIECDevelopmentArtefactSpecification();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECDevelopmentArtefactSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECDevelopmentArtefactSpecification#getParent()
	 * @see #getIECDevelopmentArtefactSpecification()
	 * @generated
	 */
	EReference getIECDevelopmentArtefactSpecification_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECDevelopmentArtefactSpecification#getSourceFiles <em>Source Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Files</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECDevelopmentArtefactSpecification#getSourceFiles()
	 * @see #getIECDevelopmentArtefactSpecification()
	 * @generated
	 */
	EReference getIECDevelopmentArtefactSpecification_SourceFiles();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECDevelopmentArtefactSpecification#getSourceFileAggregations <em>Source File Aggregations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source File Aggregations</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECDevelopmentArtefactSpecification#getSourceFileAggregations()
	 * @see #getIECDevelopmentArtefactSpecification()
	 * @generated
	 */
	EReference getIECDevelopmentArtefactSpecification_SourceFileAggregations();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECDevelopmentArtefactSpecification#getMetadataFiles <em>Metadata Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metadata Files</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECDevelopmentArtefactSpecification#getMetadataFiles()
	 * @see #getIECDevelopmentArtefactSpecification()
	 * @generated
	 */
	EReference getIECDevelopmentArtefactSpecification_MetadataFiles();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECDevelopmentArtefactSpecification#getMetadataFileAggregations <em>Metadata File Aggregations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metadata File Aggregations</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECDevelopmentArtefactSpecification#getMetadataFileAggregations()
	 * @see #getIECDevelopmentArtefactSpecification()
	 * @generated
	 */
	EReference getIECDevelopmentArtefactSpecification_MetadataFileAggregations();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECSourceFile <em>IEC Source File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Source File</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECSourceFile
	 * @generated
	 */
	EClass getIECSourceFile();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECSourceFile#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECSourceFile#getParent()
	 * @see #getIECSourceFile()
	 * @generated
	 */
	EReference getIECSourceFile_Parent();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECSourceFile#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECSourceFile#getComponent()
	 * @see #getIECSourceFile()
	 * @generated
	 */
	EReference getIECSourceFile_Component();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECSourceFileAggregation <em>IEC Source File Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Source File Aggregation</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECSourceFileAggregation
	 * @generated
	 */
	EClass getIECSourceFileAggregation();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECSourceFileAggregation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECSourceFileAggregation#getParent()
	 * @see #getIECSourceFileAggregation()
	 * @generated
	 */
	EReference getIECSourceFileAggregation_Parent();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECSourceFileAggregation#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECSourceFileAggregation#getComponent()
	 * @see #getIECSourceFileAggregation()
	 * @generated
	 */
	EReference getIECSourceFileAggregation_Component();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECMetadataFile <em>IEC Metadata File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Metadata File</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECMetadataFile
	 * @generated
	 */
	EClass getIECMetadataFile();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECMetadataFile#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECMetadataFile#getParent()
	 * @see #getIECMetadataFile()
	 * @generated
	 */
	EReference getIECMetadataFile_Parent();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECMetadataFile#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECMetadataFile#getComponent()
	 * @see #getIECMetadataFile()
	 * @generated
	 */
	EReference getIECMetadataFile_Component();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECMetadataFileAggregation <em>IEC Metadata File Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Metadata File Aggregation</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECMetadataFileAggregation
	 * @generated
	 */
	EClass getIECMetadataFileAggregation();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECMetadataFileAggregation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECMetadataFileAggregation#getParent()
	 * @see #getIECMetadataFileAggregation()
	 * @generated
	 */
	EReference getIECMetadataFileAggregation_Parent();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECMetadataFileAggregation#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECMetadataFileAggregation#getComponent()
	 * @see #getIECMetadataFileAggregation()
	 * @generated
	 */
	EReference getIECMetadataFileAggregation_Component();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECTestSpecification <em>IEC Test Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Test Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECTestSpecification
	 * @generated
	 */
	EClass getIECTestSpecification();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECTestSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECTestSpecification#getParent()
	 * @see #getIECTestSpecification()
	 * @generated
	 */
	EReference getIECTestSpecification_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECTestSpecification#getUnitTestCases <em>Unit Test Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unit Test Cases</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECTestSpecification#getUnitTestCases()
	 * @see #getIECTestSpecification()
	 * @generated
	 */
	EReference getIECTestSpecification_UnitTestCases();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECTestSpecification#getAcceptanceTestCases <em>Acceptance Test Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acceptance Test Cases</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECTestSpecification#getAcceptanceTestCases()
	 * @see #getIECTestSpecification()
	 * @generated
	 */
	EReference getIECTestSpecification_AcceptanceTestCases();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECTestSpecification#getUnitTestCaseAggregations <em>Unit Test Case Aggregations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unit Test Case Aggregations</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECTestSpecification#getUnitTestCaseAggregations()
	 * @see #getIECTestSpecification()
	 * @generated
	 */
	EReference getIECTestSpecification_UnitTestCaseAggregations();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECTestSpecification#getAcceptanceTestCaseAggregations <em>Acceptance Test Case Aggregations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acceptance Test Case Aggregations</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECTestSpecification#getAcceptanceTestCaseAggregations()
	 * @see #getIECTestSpecification()
	 * @generated
	 */
	EReference getIECTestSpecification_AcceptanceTestCaseAggregations();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECUnitTestCase <em>IEC Unit Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Unit Test Case</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECUnitTestCase
	 * @generated
	 */
	EClass getIECUnitTestCase();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECUnitTestCase#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECUnitTestCase#getParent()
	 * @see #getIECUnitTestCase()
	 * @generated
	 */
	EReference getIECUnitTestCase_Parent();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECUnitTestCase#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECUnitTestCase#getComponent()
	 * @see #getIECUnitTestCase()
	 * @generated
	 */
	EReference getIECUnitTestCase_Component();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECAcceptanceTestCase <em>IEC Acceptance Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Acceptance Test Case</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECAcceptanceTestCase
	 * @generated
	 */
	EClass getIECAcceptanceTestCase();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECAcceptanceTestCase#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECAcceptanceTestCase#getParent()
	 * @see #getIECAcceptanceTestCase()
	 * @generated
	 */
	EReference getIECAcceptanceTestCase_Parent();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECAcceptanceTestCase#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECAcceptanceTestCase#getComponent()
	 * @see #getIECAcceptanceTestCase()
	 * @generated
	 */
	EReference getIECAcceptanceTestCase_Component();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECUnitTestCaseAggregation <em>IEC Unit Test Case Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Unit Test Case Aggregation</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECUnitTestCaseAggregation
	 * @generated
	 */
	EClass getIECUnitTestCaseAggregation();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECUnitTestCaseAggregation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECUnitTestCaseAggregation#getParent()
	 * @see #getIECUnitTestCaseAggregation()
	 * @generated
	 */
	EReference getIECUnitTestCaseAggregation_Parent();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECUnitTestCaseAggregation#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECUnitTestCaseAggregation#getComponent()
	 * @see #getIECUnitTestCaseAggregation()
	 * @generated
	 */
	EReference getIECUnitTestCaseAggregation_Component();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECAcceptanceTestCaseAggregation <em>IEC Acceptance Test Case Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Acceptance Test Case Aggregation</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECAcceptanceTestCaseAggregation
	 * @generated
	 */
	EClass getIECAcceptanceTestCaseAggregation();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECAcceptanceTestCaseAggregation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECAcceptanceTestCaseAggregation#getParent()
	 * @see #getIECAcceptanceTestCaseAggregation()
	 * @generated
	 */
	EReference getIECAcceptanceTestCaseAggregation_Parent();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECAcceptanceTestCaseAggregation#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECAcceptanceTestCaseAggregation#getComponent()
	 * @see #getIECAcceptanceTestCaseAggregation()
	 * @generated
	 */
	EReference getIECAcceptanceTestCaseAggregation_Component();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECStaffSpecification <em>IEC Staff Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Staff Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECStaffSpecification
	 * @generated
	 */
	EClass getIECStaffSpecification();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECStaffSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECStaffSpecification#getParent()
	 * @see #getIECStaffSpecification()
	 * @generated
	 */
	EReference getIECStaffSpecification_Parent();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECStaffSpecification#getPersonList <em>Person List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Person List</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECStaffSpecification#getPersonList()
	 * @see #getIECStaffSpecification()
	 * @generated
	 */
	EReference getIECStaffSpecification_PersonList();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECStaffSpecification#getRoleList <em>Role List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role List</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECStaffSpecification#getRoleList()
	 * @see #getIECStaffSpecification()
	 * @generated
	 */
	EReference getIECStaffSpecification_RoleList();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECPersonList <em>IEC Person List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Person List</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECPersonList
	 * @generated
	 */
	EClass getIECPersonList();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECPersonList#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECPersonList#getParent()
	 * @see #getIECPersonList()
	 * @generated
	 */
	EReference getIECPersonList_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECPersonList#getPersons <em>Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persons</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECPersonList#getPersons()
	 * @see #getIECPersonList()
	 * @generated
	 */
	EReference getIECPersonList_Persons();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECPerson <em>IEC Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Person</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECPerson
	 * @generated
	 */
	EClass getIECPerson();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECPerson#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECPerson#getParent()
	 * @see #getIECPerson()
	 * @generated
	 */
	EReference getIECPerson_Parent();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECPerson#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roles</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECPerson#getRoles()
	 * @see #getIECPerson()
	 * @generated
	 */
	EReference getIECPerson_Roles();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECPerson#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECPerson#getName()
	 * @see #getIECPerson()
	 * @generated
	 */
	EAttribute getIECPerson_Name();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECRole <em>IEC Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Role</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECRole
	 * @generated
	 */
	EClass getIECRole();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECRole#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECRole#getParent()
	 * @see #getIECRole()
	 * @generated
	 */
	EReference getIECRole_Parent();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECRole#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Person</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECRole#getPerson()
	 * @see #getIECRole()
	 * @generated
	 */
	EReference getIECRole_Person();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECRole#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECRole#getDescription()
	 * @see #getIECRole()
	 * @generated
	 */
	EAttribute getIECRole_Description();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECRole#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Components</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECRole#getComponents()
	 * @see #getIECRole()
	 * @generated
	 */
	EReference getIECRole_Components();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECRoleList <em>IEC Role List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Role List</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECRoleList
	 * @generated
	 */
	EClass getIECRoleList();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECRoleList#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECRoleList#getParent()
	 * @see #getIECRoleList()
	 * @generated
	 */
	EReference getIECRoleList_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECRoleList#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECRoleList#getRoles()
	 * @see #getIECRoleList()
	 * @generated
	 */
	EReference getIECRoleList_Roles();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECDeveloper <em>IEC Developer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Developer</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECDeveloper
	 * @generated
	 */
	EClass getIECDeveloper();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECTestDeveloper <em>IEC Test Developer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Test Developer</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECTestDeveloper
	 * @generated
	 */
	EClass getIECTestDeveloper();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECTester <em>IEC Tester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Tester</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECTester
	 * @generated
	 */
	EClass getIECTester();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECDeployer <em>IEC Deployer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Deployer</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECDeployer
	 * @generated
	 */
	EClass getIECDeployer();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFile <em>IEC File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC File</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFile
	 * @generated
	 */
	EClass getIECFile();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFile#getFilename <em>Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filename</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFile#getFilename()
	 * @see #getIECFile()
	 * @generated
	 */
	EAttribute getIECFile_Filename();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFileAggregation <em>IEC File Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC File Aggregation</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFileAggregation
	 * @generated
	 */
	EClass getIECFileAggregation();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFileAggregation#getNumberOfFiles <em>Number Of Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Files</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFileAggregation#getNumberOfFiles()
	 * @see #getIECFileAggregation()
	 * @generated
	 */
	EAttribute getIECFileAggregation_NumberOfFiles();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECTestCase <em>IEC Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Test Case</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECTestCase
	 * @generated
	 */
	EClass getIECTestCase();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECTestCase#getNameOfTest <em>Name Of Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Of Test</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECTestCase#getNameOfTest()
	 * @see #getIECTestCase()
	 * @generated
	 */
	EAttribute getIECTestCase_NameOfTest();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECTestCaseAggregation <em>IEC Test Case Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEC Test Case Aggregation</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECTestCaseAggregation
	 * @generated
	 */
	EClass getIECTestCaseAggregation();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECTestCaseAggregation#getNumberOfTestcases <em>Number Of Testcases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Testcases</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECTestCaseAggregation#getNumberOfTestcases()
	 * @see #getIECTestCaseAggregation()
	 * @generated
	 */
	EAttribute getIECTestCaseAggregation_NumberOfTestcases();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECTestCaseAggregation#getNameOfTestSuite <em>Name Of Test Suite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Of Test Suite</em>'.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECTestCaseAggregation#getNameOfTestSuite()
	 * @see #getIECTestCaseAggregation()
	 * @generated
	 */
	EAttribute getIECTestCaseAggregation_NameOfTestSuite();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IECFieldOfActivityAnnotationsFactory getIECFieldOfActivityAnnotationsFactory();

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
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsRepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsRepositoryImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsPackageImpl#getIECFieldOfActivityAnnotationsRepository()
		 * @generated
		 */
		EClass IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY = eINSTANCE.getIECFieldOfActivityAnnotationsRepository();

		/**
		 * The meta object literal for the '<em><b>Development Artefact Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEVELOPMENT_ARTEFACT_SPECIFICATION = eINSTANCE.getIECFieldOfActivityAnnotationsRepository_DevelopmentArtefactSpecification();

		/**
		 * The meta object literal for the '<em><b>Test Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_SPECIFICATION = eINSTANCE.getIECFieldOfActivityAnnotationsRepository_TestSpecification();

		/**
		 * The meta object literal for the '<em><b>Staff Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__STAFF_SPECIFICATION = eINSTANCE.getIECFieldOfActivityAnnotationsRepository_StaffSpecification();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECDevelopmentArtefactSpecificationImpl <em>IEC Development Artefact Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECDevelopmentArtefactSpecificationImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsPackageImpl#getIECDevelopmentArtefactSpecification()
		 * @generated
		 */
		EClass IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION = eINSTANCE.getIECDevelopmentArtefactSpecification();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__PARENT = eINSTANCE.getIECDevelopmentArtefactSpecification_Parent();

		/**
		 * The meta object literal for the '<em><b>Source Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILES = eINSTANCE.getIECDevelopmentArtefactSpecification_SourceFiles();

		/**
		 * The meta object literal for the '<em><b>Source File Aggregations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILE_AGGREGATIONS = eINSTANCE.getIECDevelopmentArtefactSpecification_SourceFileAggregations();

		/**
		 * The meta object literal for the '<em><b>Metadata Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILES = eINSTANCE.getIECDevelopmentArtefactSpecification_MetadataFiles();

		/**
		 * The meta object literal for the '<em><b>Metadata File Aggregations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILE_AGGREGATIONS = eINSTANCE.getIECDevelopmentArtefactSpecification_MetadataFileAggregations();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECSourceFileImpl <em>IEC Source File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECSourceFileImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsPackageImpl#getIECSourceFile()
		 * @generated
		 */
		EClass IEC_SOURCE_FILE = eINSTANCE.getIECSourceFile();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_SOURCE_FILE__PARENT = eINSTANCE.getIECSourceFile_Parent();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_SOURCE_FILE__COMPONENT = eINSTANCE.getIECSourceFile_Component();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECSourceFileAggregationImpl <em>IEC Source File Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECSourceFileAggregationImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsPackageImpl#getIECSourceFileAggregation()
		 * @generated
		 */
		EClass IEC_SOURCE_FILE_AGGREGATION = eINSTANCE.getIECSourceFileAggregation();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_SOURCE_FILE_AGGREGATION__PARENT = eINSTANCE.getIECSourceFileAggregation_Parent();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_SOURCE_FILE_AGGREGATION__COMPONENT = eINSTANCE.getIECSourceFileAggregation_Component();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECMetadataFileImpl <em>IEC Metadata File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECMetadataFileImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsPackageImpl#getIECMetadataFile()
		 * @generated
		 */
		EClass IEC_METADATA_FILE = eINSTANCE.getIECMetadataFile();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_METADATA_FILE__PARENT = eINSTANCE.getIECMetadataFile_Parent();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_METADATA_FILE__COMPONENT = eINSTANCE.getIECMetadataFile_Component();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECMetadataFileAggregationImpl <em>IEC Metadata File Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECMetadataFileAggregationImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsPackageImpl#getIECMetadataFileAggregation()
		 * @generated
		 */
		EClass IEC_METADATA_FILE_AGGREGATION = eINSTANCE.getIECMetadataFileAggregation();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_METADATA_FILE_AGGREGATION__PARENT = eINSTANCE.getIECMetadataFileAggregation_Parent();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_METADATA_FILE_AGGREGATION__COMPONENT = eINSTANCE.getIECMetadataFileAggregation_Component();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECTestSpecificationImpl <em>IEC Test Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECTestSpecificationImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsPackageImpl#getIECTestSpecification()
		 * @generated
		 */
		EClass IEC_TEST_SPECIFICATION = eINSTANCE.getIECTestSpecification();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_TEST_SPECIFICATION__PARENT = eINSTANCE.getIECTestSpecification_Parent();

		/**
		 * The meta object literal for the '<em><b>Unit Test Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_TEST_SPECIFICATION__UNIT_TEST_CASES = eINSTANCE.getIECTestSpecification_UnitTestCases();

		/**
		 * The meta object literal for the '<em><b>Acceptance Test Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_TEST_SPECIFICATION__ACCEPTANCE_TEST_CASES = eINSTANCE.getIECTestSpecification_AcceptanceTestCases();

		/**
		 * The meta object literal for the '<em><b>Unit Test Case Aggregations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_TEST_SPECIFICATION__UNIT_TEST_CASE_AGGREGATIONS = eINSTANCE.getIECTestSpecification_UnitTestCaseAggregations();

		/**
		 * The meta object literal for the '<em><b>Acceptance Test Case Aggregations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_TEST_SPECIFICATION__ACCEPTANCE_TEST_CASE_AGGREGATIONS = eINSTANCE.getIECTestSpecification_AcceptanceTestCaseAggregations();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECUnitTestCaseImpl <em>IEC Unit Test Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECUnitTestCaseImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsPackageImpl#getIECUnitTestCase()
		 * @generated
		 */
		EClass IEC_UNIT_TEST_CASE = eINSTANCE.getIECUnitTestCase();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_UNIT_TEST_CASE__PARENT = eINSTANCE.getIECUnitTestCase_Parent();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_UNIT_TEST_CASE__COMPONENT = eINSTANCE.getIECUnitTestCase_Component();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECAcceptanceTestCaseImpl <em>IEC Acceptance Test Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECAcceptanceTestCaseImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsPackageImpl#getIECAcceptanceTestCase()
		 * @generated
		 */
		EClass IEC_ACCEPTANCE_TEST_CASE = eINSTANCE.getIECAcceptanceTestCase();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_ACCEPTANCE_TEST_CASE__PARENT = eINSTANCE.getIECAcceptanceTestCase_Parent();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_ACCEPTANCE_TEST_CASE__COMPONENT = eINSTANCE.getIECAcceptanceTestCase_Component();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECUnitTestCaseAggregationImpl <em>IEC Unit Test Case Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECUnitTestCaseAggregationImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsPackageImpl#getIECUnitTestCaseAggregation()
		 * @generated
		 */
		EClass IEC_UNIT_TEST_CASE_AGGREGATION = eINSTANCE.getIECUnitTestCaseAggregation();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_UNIT_TEST_CASE_AGGREGATION__PARENT = eINSTANCE.getIECUnitTestCaseAggregation_Parent();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_UNIT_TEST_CASE_AGGREGATION__COMPONENT = eINSTANCE.getIECUnitTestCaseAggregation_Component();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECAcceptanceTestCaseAggregationImpl <em>IEC Acceptance Test Case Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECAcceptanceTestCaseAggregationImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsPackageImpl#getIECAcceptanceTestCaseAggregation()
		 * @generated
		 */
		EClass IEC_ACCEPTANCE_TEST_CASE_AGGREGATION = eINSTANCE.getIECAcceptanceTestCaseAggregation();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_ACCEPTANCE_TEST_CASE_AGGREGATION__PARENT = eINSTANCE.getIECAcceptanceTestCaseAggregation_Parent();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_ACCEPTANCE_TEST_CASE_AGGREGATION__COMPONENT = eINSTANCE.getIECAcceptanceTestCaseAggregation_Component();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECStaffSpecificationImpl <em>IEC Staff Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECStaffSpecificationImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsPackageImpl#getIECStaffSpecification()
		 * @generated
		 */
		EClass IEC_STAFF_SPECIFICATION = eINSTANCE.getIECStaffSpecification();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_STAFF_SPECIFICATION__PARENT = eINSTANCE.getIECStaffSpecification_Parent();

		/**
		 * The meta object literal for the '<em><b>Person List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_STAFF_SPECIFICATION__PERSON_LIST = eINSTANCE.getIECStaffSpecification_PersonList();

		/**
		 * The meta object literal for the '<em><b>Role List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_STAFF_SPECIFICATION__ROLE_LIST = eINSTANCE.getIECStaffSpecification_RoleList();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECPersonListImpl <em>IEC Person List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECPersonListImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsPackageImpl#getIECPersonList()
		 * @generated
		 */
		EClass IEC_PERSON_LIST = eINSTANCE.getIECPersonList();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_PERSON_LIST__PARENT = eINSTANCE.getIECPersonList_Parent();

		/**
		 * The meta object literal for the '<em><b>Persons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_PERSON_LIST__PERSONS = eINSTANCE.getIECPersonList_Persons();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECPersonImpl <em>IEC Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECPersonImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsPackageImpl#getIECPerson()
		 * @generated
		 */
		EClass IEC_PERSON = eINSTANCE.getIECPerson();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_PERSON__PARENT = eINSTANCE.getIECPerson_Parent();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_PERSON__ROLES = eINSTANCE.getIECPerson_Roles();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IEC_PERSON__NAME = eINSTANCE.getIECPerson_Name();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECRoleImpl <em>IEC Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECRoleImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsPackageImpl#getIECRole()
		 * @generated
		 */
		EClass IEC_ROLE = eINSTANCE.getIECRole();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_ROLE__PARENT = eINSTANCE.getIECRole_Parent();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_ROLE__PERSON = eINSTANCE.getIECRole_Person();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IEC_ROLE__DESCRIPTION = eINSTANCE.getIECRole_Description();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_ROLE__COMPONENTS = eINSTANCE.getIECRole_Components();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECRoleListImpl <em>IEC Role List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECRoleListImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsPackageImpl#getIECRoleList()
		 * @generated
		 */
		EClass IEC_ROLE_LIST = eINSTANCE.getIECRoleList();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_ROLE_LIST__PARENT = eINSTANCE.getIECRoleList_Parent();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC_ROLE_LIST__ROLES = eINSTANCE.getIECRoleList_Roles();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECDeveloperImpl <em>IEC Developer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECDeveloperImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsPackageImpl#getIECDeveloper()
		 * @generated
		 */
		EClass IEC_DEVELOPER = eINSTANCE.getIECDeveloper();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECTestDeveloperImpl <em>IEC Test Developer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECTestDeveloperImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsPackageImpl#getIECTestDeveloper()
		 * @generated
		 */
		EClass IEC_TEST_DEVELOPER = eINSTANCE.getIECTestDeveloper();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECTesterImpl <em>IEC Tester</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECTesterImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsPackageImpl#getIECTester()
		 * @generated
		 */
		EClass IEC_TESTER = eINSTANCE.getIECTester();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECDeployerImpl <em>IEC Deployer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECDeployerImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsPackageImpl#getIECDeployer()
		 * @generated
		 */
		EClass IEC_DEPLOYER = eINSTANCE.getIECDeployer();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFileImpl <em>IEC File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFileImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsPackageImpl#getIECFile()
		 * @generated
		 */
		EClass IEC_FILE = eINSTANCE.getIECFile();

		/**
		 * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IEC_FILE__FILENAME = eINSTANCE.getIECFile_Filename();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFileAggregationImpl <em>IEC File Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFileAggregationImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsPackageImpl#getIECFileAggregation()
		 * @generated
		 */
		EClass IEC_FILE_AGGREGATION = eINSTANCE.getIECFileAggregation();

		/**
		 * The meta object literal for the '<em><b>Number Of Files</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IEC_FILE_AGGREGATION__NUMBER_OF_FILES = eINSTANCE.getIECFileAggregation_NumberOfFiles();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECTestCaseImpl <em>IEC Test Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECTestCaseImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsPackageImpl#getIECTestCase()
		 * @generated
		 */
		EClass IEC_TEST_CASE = eINSTANCE.getIECTestCase();

		/**
		 * The meta object literal for the '<em><b>Name Of Test</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IEC_TEST_CASE__NAME_OF_TEST = eINSTANCE.getIECTestCase_NameOfTest();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECTestCaseAggregationImpl <em>IEC Test Case Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECTestCaseAggregationImpl
		 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsPackageImpl#getIECTestCaseAggregation()
		 * @generated
		 */
		EClass IEC_TEST_CASE_AGGREGATION = eINSTANCE.getIECTestCaseAggregation();

		/**
		 * The meta object literal for the '<em><b>Number Of Testcases</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IEC_TEST_CASE_AGGREGATION__NUMBER_OF_TESTCASES = eINSTANCE.getIECTestCaseAggregation_NumberOfTestcases();

		/**
		 * The meta object literal for the '<em><b>Name Of Test Suite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IEC_TEST_CASE_AGGREGATION__NAME_OF_TEST_SUITE = eINSTANCE.getIECTestCaseAggregation_NameOfTestSuite();

	}

} //IECFieldOfActivityAnnotationsPackage
