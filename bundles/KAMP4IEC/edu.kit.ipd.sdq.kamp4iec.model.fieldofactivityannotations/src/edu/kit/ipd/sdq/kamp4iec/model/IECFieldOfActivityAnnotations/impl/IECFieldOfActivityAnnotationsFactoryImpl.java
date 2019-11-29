/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl;

import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.*;

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
public class IECFieldOfActivityAnnotationsFactoryImpl extends EFactoryImpl implements IECFieldOfActivityAnnotationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IECFieldOfActivityAnnotationsFactory init() {
		try {
			IECFieldOfActivityAnnotationsFactory theIECFieldOfActivityAnnotationsFactory = (IECFieldOfActivityAnnotationsFactory)EPackage.Registry.INSTANCE.getEFactory(IECFieldOfActivityAnnotationsPackage.eNS_URI);
			if (theIECFieldOfActivityAnnotationsFactory != null) {
				return theIECFieldOfActivityAnnotationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IECFieldOfActivityAnnotationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECFieldOfActivityAnnotationsFactoryImpl() {
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
			case IECFieldOfActivityAnnotationsPackage.IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY: return createIECFieldOfActivityAnnotationsRepository();
			case IECFieldOfActivityAnnotationsPackage.IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION: return createIECDevelopmentArtefactSpecification();
			case IECFieldOfActivityAnnotationsPackage.IEC_SOURCE_FILE: return createIECSourceFile();
			case IECFieldOfActivityAnnotationsPackage.IEC_SOURCE_FILE_AGGREGATION: return createIECSourceFileAggregation();
			case IECFieldOfActivityAnnotationsPackage.IEC_METADATA_FILE: return createIECMetadataFile();
			case IECFieldOfActivityAnnotationsPackage.IEC_METADATA_FILE_AGGREGATION: return createIECMetadataFileAggregation();
			case IECFieldOfActivityAnnotationsPackage.IEC_TEST_SPECIFICATION: return createIECTestSpecification();
			case IECFieldOfActivityAnnotationsPackage.IEC_UNIT_TEST_CASE: return createIECUnitTestCase();
			case IECFieldOfActivityAnnotationsPackage.IEC_ACCEPTANCE_TEST_CASE: return createIECAcceptanceTestCase();
			case IECFieldOfActivityAnnotationsPackage.IEC_UNIT_TEST_CASE_AGGREGATION: return createIECUnitTestCaseAggregation();
			case IECFieldOfActivityAnnotationsPackage.IEC_ACCEPTANCE_TEST_CASE_AGGREGATION: return createIECAcceptanceTestCaseAggregation();
			case IECFieldOfActivityAnnotationsPackage.IEC_STAFF_SPECIFICATION: return createIECStaffSpecification();
			case IECFieldOfActivityAnnotationsPackage.IEC_PERSON_LIST: return createIECPersonList();
			case IECFieldOfActivityAnnotationsPackage.IEC_PERSON: return createIECPerson();
			case IECFieldOfActivityAnnotationsPackage.IEC_ROLE_LIST: return createIECRoleList();
			case IECFieldOfActivityAnnotationsPackage.IEC_DEVELOPER: return createIECDeveloper();
			case IECFieldOfActivityAnnotationsPackage.IEC_TEST_DEVELOPER: return createIECTestDeveloper();
			case IECFieldOfActivityAnnotationsPackage.IEC_TESTER: return createIECTester();
			case IECFieldOfActivityAnnotationsPackage.IEC_DEPLOYER: return createIECDeployer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECFieldOfActivityAnnotationsRepository createIECFieldOfActivityAnnotationsRepository() {
		IECFieldOfActivityAnnotationsRepositoryImpl iecFieldOfActivityAnnotationsRepository = new IECFieldOfActivityAnnotationsRepositoryImpl();
		return iecFieldOfActivityAnnotationsRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECDevelopmentArtefactSpecification createIECDevelopmentArtefactSpecification() {
		IECDevelopmentArtefactSpecificationImpl iecDevelopmentArtefactSpecification = new IECDevelopmentArtefactSpecificationImpl();
		return iecDevelopmentArtefactSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECSourceFile createIECSourceFile() {
		IECSourceFileImpl iecSourceFile = new IECSourceFileImpl();
		return iecSourceFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECSourceFileAggregation createIECSourceFileAggregation() {
		IECSourceFileAggregationImpl iecSourceFileAggregation = new IECSourceFileAggregationImpl();
		return iecSourceFileAggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECMetadataFile createIECMetadataFile() {
		IECMetadataFileImpl iecMetadataFile = new IECMetadataFileImpl();
		return iecMetadataFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECMetadataFileAggregation createIECMetadataFileAggregation() {
		IECMetadataFileAggregationImpl iecMetadataFileAggregation = new IECMetadataFileAggregationImpl();
		return iecMetadataFileAggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECTestSpecification createIECTestSpecification() {
		IECTestSpecificationImpl iecTestSpecification = new IECTestSpecificationImpl();
		return iecTestSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECUnitTestCase createIECUnitTestCase() {
		IECUnitTestCaseImpl iecUnitTestCase = new IECUnitTestCaseImpl();
		return iecUnitTestCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECAcceptanceTestCase createIECAcceptanceTestCase() {
		IECAcceptanceTestCaseImpl iecAcceptanceTestCase = new IECAcceptanceTestCaseImpl();
		return iecAcceptanceTestCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECUnitTestCaseAggregation createIECUnitTestCaseAggregation() {
		IECUnitTestCaseAggregationImpl iecUnitTestCaseAggregation = new IECUnitTestCaseAggregationImpl();
		return iecUnitTestCaseAggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECAcceptanceTestCaseAggregation createIECAcceptanceTestCaseAggregation() {
		IECAcceptanceTestCaseAggregationImpl iecAcceptanceTestCaseAggregation = new IECAcceptanceTestCaseAggregationImpl();
		return iecAcceptanceTestCaseAggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECStaffSpecification createIECStaffSpecification() {
		IECStaffSpecificationImpl iecStaffSpecification = new IECStaffSpecificationImpl();
		return iecStaffSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECPersonList createIECPersonList() {
		IECPersonListImpl iecPersonList = new IECPersonListImpl();
		return iecPersonList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECPerson createIECPerson() {
		IECPersonImpl iecPerson = new IECPersonImpl();
		return iecPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECRoleList createIECRoleList() {
		IECRoleListImpl iecRoleList = new IECRoleListImpl();
		return iecRoleList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECDeveloper createIECDeveloper() {
		IECDeveloperImpl iecDeveloper = new IECDeveloperImpl();
		return iecDeveloper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECTestDeveloper createIECTestDeveloper() {
		IECTestDeveloperImpl iecTestDeveloper = new IECTestDeveloperImpl();
		return iecTestDeveloper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECTester createIECTester() {
		IECTesterImpl iecTester = new IECTesterImpl();
		return iecTester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECDeployer createIECDeployer() {
		IECDeployerImpl iecDeployer = new IECDeployerImpl();
		return iecDeployer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECFieldOfActivityAnnotationsPackage getIECFieldOfActivityAnnotationsPackage() {
		return (IECFieldOfActivityAnnotationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IECFieldOfActivityAnnotationsPackage getPackage() {
		return IECFieldOfActivityAnnotationsPackage.eINSTANCE;
	}

} //IECFieldOfActivityAnnotationsFactoryImpl
