/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl;

import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsPackage;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECTestCaseAggregation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IEC Test Case Aggregation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECTestCaseAggregationImpl#getNumberOfTestcases <em>Number Of Testcases</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECTestCaseAggregationImpl#getNameOfTestSuite <em>Name Of Test Suite</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class IECTestCaseAggregationImpl extends MinimalEObjectImpl.Container implements IECTestCaseAggregation {
	/**
	 * The default value of the '{@link #getNumberOfTestcases() <em>Number Of Testcases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfTestcases()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_TESTCASES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfTestcases() <em>Number Of Testcases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfTestcases()
	 * @generated
	 * @ordered
	 */
	protected int numberOfTestcases = NUMBER_OF_TESTCASES_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameOfTestSuite() <em>Name Of Test Suite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameOfTestSuite()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_OF_TEST_SUITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameOfTestSuite() <em>Name Of Test Suite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameOfTestSuite()
	 * @generated
	 * @ordered
	 */
	protected String nameOfTestSuite = NAME_OF_TEST_SUITE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IECTestCaseAggregationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IECFieldOfActivityAnnotationsPackage.Literals.IEC_TEST_CASE_AGGREGATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfTestcases() {
		return numberOfTestcases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfTestcases(int newNumberOfTestcases) {
		int oldNumberOfTestcases = numberOfTestcases;
		numberOfTestcases = newNumberOfTestcases;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IECFieldOfActivityAnnotationsPackage.IEC_TEST_CASE_AGGREGATION__NUMBER_OF_TESTCASES, oldNumberOfTestcases, numberOfTestcases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameOfTestSuite() {
		return nameOfTestSuite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameOfTestSuite(String newNameOfTestSuite) {
		String oldNameOfTestSuite = nameOfTestSuite;
		nameOfTestSuite = newNameOfTestSuite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IECFieldOfActivityAnnotationsPackage.IEC_TEST_CASE_AGGREGATION__NAME_OF_TEST_SUITE, oldNameOfTestSuite, nameOfTestSuite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IECFieldOfActivityAnnotationsPackage.IEC_TEST_CASE_AGGREGATION__NUMBER_OF_TESTCASES:
				return getNumberOfTestcases();
			case IECFieldOfActivityAnnotationsPackage.IEC_TEST_CASE_AGGREGATION__NAME_OF_TEST_SUITE:
				return getNameOfTestSuite();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IECFieldOfActivityAnnotationsPackage.IEC_TEST_CASE_AGGREGATION__NUMBER_OF_TESTCASES:
				setNumberOfTestcases((Integer)newValue);
				return;
			case IECFieldOfActivityAnnotationsPackage.IEC_TEST_CASE_AGGREGATION__NAME_OF_TEST_SUITE:
				setNameOfTestSuite((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IECFieldOfActivityAnnotationsPackage.IEC_TEST_CASE_AGGREGATION__NUMBER_OF_TESTCASES:
				setNumberOfTestcases(NUMBER_OF_TESTCASES_EDEFAULT);
				return;
			case IECFieldOfActivityAnnotationsPackage.IEC_TEST_CASE_AGGREGATION__NAME_OF_TEST_SUITE:
				setNameOfTestSuite(NAME_OF_TEST_SUITE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IECFieldOfActivityAnnotationsPackage.IEC_TEST_CASE_AGGREGATION__NUMBER_OF_TESTCASES:
				return numberOfTestcases != NUMBER_OF_TESTCASES_EDEFAULT;
			case IECFieldOfActivityAnnotationsPackage.IEC_TEST_CASE_AGGREGATION__NAME_OF_TEST_SUITE:
				return NAME_OF_TEST_SUITE_EDEFAULT == null ? nameOfTestSuite != null : !NAME_OF_TEST_SUITE_EDEFAULT.equals(nameOfTestSuite);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (numberOfTestcases: ");
		result.append(numberOfTestcases);
		result.append(", nameOfTestSuite: ");
		result.append(nameOfTestSuite);
		result.append(')');
		return result.toString();
	}

} //IECTestCaseAggregationImpl
