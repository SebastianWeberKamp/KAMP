/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.util;

import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsPackage
 * @generated
 */
public class IECFieldOfActivityAnnotationsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IECFieldOfActivityAnnotationsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECFieldOfActivityAnnotationsSwitch() {
		if (modelPackage == null) {
			modelPackage = IECFieldOfActivityAnnotationsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case IECFieldOfActivityAnnotationsPackage.IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY: {
				IECFieldOfActivityAnnotationsRepository iecFieldOfActivityAnnotationsRepository = (IECFieldOfActivityAnnotationsRepository)theEObject;
				T result = caseIECFieldOfActivityAnnotationsRepository(iecFieldOfActivityAnnotationsRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IECFieldOfActivityAnnotationsPackage.IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION: {
				IECDevelopmentArtefactSpecification iecDevelopmentArtefactSpecification = (IECDevelopmentArtefactSpecification)theEObject;
				T result = caseIECDevelopmentArtefactSpecification(iecDevelopmentArtefactSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IECFieldOfActivityAnnotationsPackage.IEC_SOURCE_FILE: {
				IECSourceFile iecSourceFile = (IECSourceFile)theEObject;
				T result = caseIECSourceFile(iecSourceFile);
				if (result == null) result = caseIECFile(iecSourceFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IECFieldOfActivityAnnotationsPackage.IEC_SOURCE_FILE_AGGREGATION: {
				IECSourceFileAggregation iecSourceFileAggregation = (IECSourceFileAggregation)theEObject;
				T result = caseIECSourceFileAggregation(iecSourceFileAggregation);
				if (result == null) result = caseIECFileAggregation(iecSourceFileAggregation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IECFieldOfActivityAnnotationsPackage.IEC_METADATA_FILE: {
				IECMetadataFile iecMetadataFile = (IECMetadataFile)theEObject;
				T result = caseIECMetadataFile(iecMetadataFile);
				if (result == null) result = caseIECFile(iecMetadataFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IECFieldOfActivityAnnotationsPackage.IEC_METADATA_FILE_AGGREGATION: {
				IECMetadataFileAggregation iecMetadataFileAggregation = (IECMetadataFileAggregation)theEObject;
				T result = caseIECMetadataFileAggregation(iecMetadataFileAggregation);
				if (result == null) result = caseIECFileAggregation(iecMetadataFileAggregation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IECFieldOfActivityAnnotationsPackage.IEC_TEST_SPECIFICATION: {
				IECTestSpecification iecTestSpecification = (IECTestSpecification)theEObject;
				T result = caseIECTestSpecification(iecTestSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IECFieldOfActivityAnnotationsPackage.IEC_UNIT_TEST_CASE: {
				IECUnitTestCase iecUnitTestCase = (IECUnitTestCase)theEObject;
				T result = caseIECUnitTestCase(iecUnitTestCase);
				if (result == null) result = caseIECTestCase(iecUnitTestCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IECFieldOfActivityAnnotationsPackage.IEC_ACCEPTANCE_TEST_CASE: {
				IECAcceptanceTestCase iecAcceptanceTestCase = (IECAcceptanceTestCase)theEObject;
				T result = caseIECAcceptanceTestCase(iecAcceptanceTestCase);
				if (result == null) result = caseIECTestCase(iecAcceptanceTestCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IECFieldOfActivityAnnotationsPackage.IEC_UNIT_TEST_CASE_AGGREGATION: {
				IECUnitTestCaseAggregation iecUnitTestCaseAggregation = (IECUnitTestCaseAggregation)theEObject;
				T result = caseIECUnitTestCaseAggregation(iecUnitTestCaseAggregation);
				if (result == null) result = caseIECTestCaseAggregation(iecUnitTestCaseAggregation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IECFieldOfActivityAnnotationsPackage.IEC_ACCEPTANCE_TEST_CASE_AGGREGATION: {
				IECAcceptanceTestCaseAggregation iecAcceptanceTestCaseAggregation = (IECAcceptanceTestCaseAggregation)theEObject;
				T result = caseIECAcceptanceTestCaseAggregation(iecAcceptanceTestCaseAggregation);
				if (result == null) result = caseIECTestCaseAggregation(iecAcceptanceTestCaseAggregation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IECFieldOfActivityAnnotationsPackage.IEC_STAFF_SPECIFICATION: {
				IECStaffSpecification iecStaffSpecification = (IECStaffSpecification)theEObject;
				T result = caseIECStaffSpecification(iecStaffSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IECFieldOfActivityAnnotationsPackage.IEC_PERSON_LIST: {
				IECPersonList iecPersonList = (IECPersonList)theEObject;
				T result = caseIECPersonList(iecPersonList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IECFieldOfActivityAnnotationsPackage.IEC_PERSON: {
				IECPerson iecPerson = (IECPerson)theEObject;
				T result = caseIECPerson(iecPerson);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IECFieldOfActivityAnnotationsPackage.IEC_ROLE: {
				IECRole iecRole = (IECRole)theEObject;
				T result = caseIECRole(iecRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IECFieldOfActivityAnnotationsPackage.IEC_ROLE_LIST: {
				IECRoleList iecRoleList = (IECRoleList)theEObject;
				T result = caseIECRoleList(iecRoleList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IECFieldOfActivityAnnotationsPackage.IEC_DEVELOPER: {
				IECDeveloper iecDeveloper = (IECDeveloper)theEObject;
				T result = caseIECDeveloper(iecDeveloper);
				if (result == null) result = caseIECRole(iecDeveloper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IECFieldOfActivityAnnotationsPackage.IEC_TEST_DEVELOPER: {
				IECTestDeveloper iecTestDeveloper = (IECTestDeveloper)theEObject;
				T result = caseIECTestDeveloper(iecTestDeveloper);
				if (result == null) result = caseIECRole(iecTestDeveloper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IECFieldOfActivityAnnotationsPackage.IEC_TESTER: {
				IECTester iecTester = (IECTester)theEObject;
				T result = caseIECTester(iecTester);
				if (result == null) result = caseIECRole(iecTester);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IECFieldOfActivityAnnotationsPackage.IEC_DEPLOYER: {
				IECDeployer iecDeployer = (IECDeployer)theEObject;
				T result = caseIECDeployer(iecDeployer);
				if (result == null) result = caseIECRole(iecDeployer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IECFieldOfActivityAnnotationsPackage.IEC_FILE: {
				IECFile iecFile = (IECFile)theEObject;
				T result = caseIECFile(iecFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IECFieldOfActivityAnnotationsPackage.IEC_FILE_AGGREGATION: {
				IECFileAggregation iecFileAggregation = (IECFileAggregation)theEObject;
				T result = caseIECFileAggregation(iecFileAggregation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IECFieldOfActivityAnnotationsPackage.IEC_TEST_CASE: {
				IECTestCase iecTestCase = (IECTestCase)theEObject;
				T result = caseIECTestCase(iecTestCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IECFieldOfActivityAnnotationsPackage.IEC_TEST_CASE_AGGREGATION: {
				IECTestCaseAggregation iecTestCaseAggregation = (IECTestCaseAggregation)theEObject;
				T result = caseIECTestCaseAggregation(iecTestCaseAggregation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIECFieldOfActivityAnnotationsRepository(IECFieldOfActivityAnnotationsRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Development Artefact Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Development Artefact Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIECDevelopmentArtefactSpecification(IECDevelopmentArtefactSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Source File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Source File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIECSourceFile(IECSourceFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Source File Aggregation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Source File Aggregation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIECSourceFileAggregation(IECSourceFileAggregation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Metadata File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Metadata File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIECMetadataFile(IECMetadataFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Metadata File Aggregation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Metadata File Aggregation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIECMetadataFileAggregation(IECMetadataFileAggregation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Test Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Test Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIECTestSpecification(IECTestSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Unit Test Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Unit Test Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIECUnitTestCase(IECUnitTestCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Acceptance Test Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Acceptance Test Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIECAcceptanceTestCase(IECAcceptanceTestCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Unit Test Case Aggregation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Unit Test Case Aggregation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIECUnitTestCaseAggregation(IECUnitTestCaseAggregation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Acceptance Test Case Aggregation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Acceptance Test Case Aggregation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIECAcceptanceTestCaseAggregation(IECAcceptanceTestCaseAggregation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Staff Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Staff Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIECStaffSpecification(IECStaffSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Person List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Person List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIECPersonList(IECPersonList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIECPerson(IECPerson object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIECRole(IECRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Role List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Role List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIECRoleList(IECRoleList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Developer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Developer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIECDeveloper(IECDeveloper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Test Developer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Test Developer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIECTestDeveloper(IECTestDeveloper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Tester</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Tester</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIECTester(IECTester object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Deployer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Deployer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIECDeployer(IECDeployer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIECFile(IECFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC File Aggregation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC File Aggregation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIECFileAggregation(IECFileAggregation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Test Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Test Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIECTestCase(IECTestCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEC Test Case Aggregation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEC Test Case Aggregation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIECTestCaseAggregation(IECTestCaseAggregation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //IECFieldOfActivityAnnotationsSwitch
