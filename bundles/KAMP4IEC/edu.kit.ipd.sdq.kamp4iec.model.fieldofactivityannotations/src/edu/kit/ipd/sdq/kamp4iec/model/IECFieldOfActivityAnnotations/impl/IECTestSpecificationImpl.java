/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl;

import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECAcceptanceTestCase;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECAcceptanceTestCaseAggregation;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsPackage;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsRepository;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECTestSpecification;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECUnitTestCase;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECUnitTestCaseAggregation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IEC Test Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECTestSpecificationImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECTestSpecificationImpl#getUnitTestCases <em>Unit Test Cases</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECTestSpecificationImpl#getAcceptanceTestCases <em>Acceptance Test Cases</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECTestSpecificationImpl#getUnitTestCaseAggregations <em>Unit Test Case Aggregations</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECTestSpecificationImpl#getAcceptanceTestCaseAggregations <em>Acceptance Test Case Aggregations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IECTestSpecificationImpl extends MinimalEObjectImpl.Container implements IECTestSpecification {
	/**
	 * The cached value of the '{@link #getUnitTestCases() <em>Unit Test Cases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitTestCases()
	 * @generated
	 * @ordered
	 */
	protected EList<IECUnitTestCase> unitTestCases;

	/**
	 * The cached value of the '{@link #getAcceptanceTestCases() <em>Acceptance Test Cases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptanceTestCases()
	 * @generated
	 * @ordered
	 */
	protected EList<IECAcceptanceTestCase> acceptanceTestCases;

	/**
	 * The cached value of the '{@link #getUnitTestCaseAggregations() <em>Unit Test Case Aggregations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitTestCaseAggregations()
	 * @generated
	 * @ordered
	 */
	protected EList<IECUnitTestCaseAggregation> unitTestCaseAggregations;

	/**
	 * The cached value of the '{@link #getAcceptanceTestCaseAggregations() <em>Acceptance Test Case Aggregations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptanceTestCaseAggregations()
	 * @generated
	 * @ordered
	 */
	protected EList<IECAcceptanceTestCaseAggregation> acceptanceTestCaseAggregations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IECTestSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IECFieldOfActivityAnnotationsPackage.Literals.IEC_TEST_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECFieldOfActivityAnnotationsRepository getParent() {
		if (eContainerFeatureID() != IECFieldOfActivityAnnotationsPackage.IEC_TEST_SPECIFICATION__PARENT) return null;
		return (IECFieldOfActivityAnnotationsRepository)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(IECFieldOfActivityAnnotationsRepository newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, IECFieldOfActivityAnnotationsPackage.IEC_TEST_SPECIFICATION__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(IECFieldOfActivityAnnotationsRepository newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != IECFieldOfActivityAnnotationsPackage.IEC_TEST_SPECIFICATION__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, IECFieldOfActivityAnnotationsPackage.IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_SPECIFICATION, IECFieldOfActivityAnnotationsRepository.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IECFieldOfActivityAnnotationsPackage.IEC_TEST_SPECIFICATION__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECUnitTestCase> getUnitTestCases() {
		if (unitTestCases == null) {
			unitTestCases = new EObjectContainmentWithInverseEList<IECUnitTestCase>(IECUnitTestCase.class, this, IECFieldOfActivityAnnotationsPackage.IEC_TEST_SPECIFICATION__UNIT_TEST_CASES, IECFieldOfActivityAnnotationsPackage.IEC_UNIT_TEST_CASE__PARENT);
		}
		return unitTestCases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECAcceptanceTestCase> getAcceptanceTestCases() {
		if (acceptanceTestCases == null) {
			acceptanceTestCases = new EObjectContainmentWithInverseEList<IECAcceptanceTestCase>(IECAcceptanceTestCase.class, this, IECFieldOfActivityAnnotationsPackage.IEC_TEST_SPECIFICATION__ACCEPTANCE_TEST_CASES, IECFieldOfActivityAnnotationsPackage.IEC_ACCEPTANCE_TEST_CASE__PARENT);
		}
		return acceptanceTestCases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECUnitTestCaseAggregation> getUnitTestCaseAggregations() {
		if (unitTestCaseAggregations == null) {
			unitTestCaseAggregations = new EObjectContainmentWithInverseEList<IECUnitTestCaseAggregation>(IECUnitTestCaseAggregation.class, this, IECFieldOfActivityAnnotationsPackage.IEC_TEST_SPECIFICATION__UNIT_TEST_CASE_AGGREGATIONS, IECFieldOfActivityAnnotationsPackage.IEC_UNIT_TEST_CASE_AGGREGATION__PARENT);
		}
		return unitTestCaseAggregations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECAcceptanceTestCaseAggregation> getAcceptanceTestCaseAggregations() {
		if (acceptanceTestCaseAggregations == null) {
			acceptanceTestCaseAggregations = new EObjectContainmentWithInverseEList<IECAcceptanceTestCaseAggregation>(IECAcceptanceTestCaseAggregation.class, this, IECFieldOfActivityAnnotationsPackage.IEC_TEST_SPECIFICATION__ACCEPTANCE_TEST_CASE_AGGREGATIONS, IECFieldOfActivityAnnotationsPackage.IEC_ACCEPTANCE_TEST_CASE_AGGREGATION__PARENT);
		}
		return acceptanceTestCaseAggregations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IECFieldOfActivityAnnotationsPackage.IEC_TEST_SPECIFICATION__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((IECFieldOfActivityAnnotationsRepository)otherEnd, msgs);
			case IECFieldOfActivityAnnotationsPackage.IEC_TEST_SPECIFICATION__UNIT_TEST_CASES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUnitTestCases()).basicAdd(otherEnd, msgs);
			case IECFieldOfActivityAnnotationsPackage.IEC_TEST_SPECIFICATION__ACCEPTANCE_TEST_CASES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAcceptanceTestCases()).basicAdd(otherEnd, msgs);
			case IECFieldOfActivityAnnotationsPackage.IEC_TEST_SPECIFICATION__UNIT_TEST_CASE_AGGREGATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUnitTestCaseAggregations()).basicAdd(otherEnd, msgs);
			case IECFieldOfActivityAnnotationsPackage.IEC_TEST_SPECIFICATION__ACCEPTANCE_TEST_CASE_AGGREGATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAcceptanceTestCaseAggregations()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IECFieldOfActivityAnnotationsPackage.IEC_TEST_SPECIFICATION__PARENT:
				return basicSetParent(null, msgs);
			case IECFieldOfActivityAnnotationsPackage.IEC_TEST_SPECIFICATION__UNIT_TEST_CASES:
				return ((InternalEList<?>)getUnitTestCases()).basicRemove(otherEnd, msgs);
			case IECFieldOfActivityAnnotationsPackage.IEC_TEST_SPECIFICATION__ACCEPTANCE_TEST_CASES:
				return ((InternalEList<?>)getAcceptanceTestCases()).basicRemove(otherEnd, msgs);
			case IECFieldOfActivityAnnotationsPackage.IEC_TEST_SPECIFICATION__UNIT_TEST_CASE_AGGREGATIONS:
				return ((InternalEList<?>)getUnitTestCaseAggregations()).basicRemove(otherEnd, msgs);
			case IECFieldOfActivityAnnotationsPackage.IEC_TEST_SPECIFICATION__ACCEPTANCE_TEST_CASE_AGGREGATIONS:
				return ((InternalEList<?>)getAcceptanceTestCaseAggregations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case IECFieldOfActivityAnnotationsPackage.IEC_TEST_SPECIFICATION__PARENT:
				return eInternalContainer().eInverseRemove(this, IECFieldOfActivityAnnotationsPackage.IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_SPECIFICATION, IECFieldOfActivityAnnotationsRepository.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IECFieldOfActivityAnnotationsPackage.IEC_TEST_SPECIFICATION__PARENT:
				return getParent();
			case IECFieldOfActivityAnnotationsPackage.IEC_TEST_SPECIFICATION__UNIT_TEST_CASES:
				return getUnitTestCases();
			case IECFieldOfActivityAnnotationsPackage.IEC_TEST_SPECIFICATION__ACCEPTANCE_TEST_CASES:
				return getAcceptanceTestCases();
			case IECFieldOfActivityAnnotationsPackage.IEC_TEST_SPECIFICATION__UNIT_TEST_CASE_AGGREGATIONS:
				return getUnitTestCaseAggregations();
			case IECFieldOfActivityAnnotationsPackage.IEC_TEST_SPECIFICATION__ACCEPTANCE_TEST_CASE_AGGREGATIONS:
				return getAcceptanceTestCaseAggregations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IECFieldOfActivityAnnotationsPackage.IEC_TEST_SPECIFICATION__PARENT:
				setParent((IECFieldOfActivityAnnotationsRepository)newValue);
				return;
			case IECFieldOfActivityAnnotationsPackage.IEC_TEST_SPECIFICATION__UNIT_TEST_CASES:
				getUnitTestCases().clear();
				getUnitTestCases().addAll((Collection<? extends IECUnitTestCase>)newValue);
				return;
			case IECFieldOfActivityAnnotationsPackage.IEC_TEST_SPECIFICATION__ACCEPTANCE_TEST_CASES:
				getAcceptanceTestCases().clear();
				getAcceptanceTestCases().addAll((Collection<? extends IECAcceptanceTestCase>)newValue);
				return;
			case IECFieldOfActivityAnnotationsPackage.IEC_TEST_SPECIFICATION__UNIT_TEST_CASE_AGGREGATIONS:
				getUnitTestCaseAggregations().clear();
				getUnitTestCaseAggregations().addAll((Collection<? extends IECUnitTestCaseAggregation>)newValue);
				return;
			case IECFieldOfActivityAnnotationsPackage.IEC_TEST_SPECIFICATION__ACCEPTANCE_TEST_CASE_AGGREGATIONS:
				getAcceptanceTestCaseAggregations().clear();
				getAcceptanceTestCaseAggregations().addAll((Collection<? extends IECAcceptanceTestCaseAggregation>)newValue);
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
			case IECFieldOfActivityAnnotationsPackage.IEC_TEST_SPECIFICATION__PARENT:
				setParent((IECFieldOfActivityAnnotationsRepository)null);
				return;
			case IECFieldOfActivityAnnotationsPackage.IEC_TEST_SPECIFICATION__UNIT_TEST_CASES:
				getUnitTestCases().clear();
				return;
			case IECFieldOfActivityAnnotationsPackage.IEC_TEST_SPECIFICATION__ACCEPTANCE_TEST_CASES:
				getAcceptanceTestCases().clear();
				return;
			case IECFieldOfActivityAnnotationsPackage.IEC_TEST_SPECIFICATION__UNIT_TEST_CASE_AGGREGATIONS:
				getUnitTestCaseAggregations().clear();
				return;
			case IECFieldOfActivityAnnotationsPackage.IEC_TEST_SPECIFICATION__ACCEPTANCE_TEST_CASE_AGGREGATIONS:
				getAcceptanceTestCaseAggregations().clear();
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
			case IECFieldOfActivityAnnotationsPackage.IEC_TEST_SPECIFICATION__PARENT:
				return getParent() != null;
			case IECFieldOfActivityAnnotationsPackage.IEC_TEST_SPECIFICATION__UNIT_TEST_CASES:
				return unitTestCases != null && !unitTestCases.isEmpty();
			case IECFieldOfActivityAnnotationsPackage.IEC_TEST_SPECIFICATION__ACCEPTANCE_TEST_CASES:
				return acceptanceTestCases != null && !acceptanceTestCases.isEmpty();
			case IECFieldOfActivityAnnotationsPackage.IEC_TEST_SPECIFICATION__UNIT_TEST_CASE_AGGREGATIONS:
				return unitTestCaseAggregations != null && !unitTestCaseAggregations.isEmpty();
			case IECFieldOfActivityAnnotationsPackage.IEC_TEST_SPECIFICATION__ACCEPTANCE_TEST_CASE_AGGREGATIONS:
				return acceptanceTestCaseAggregations != null && !acceptanceTestCaseAggregations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IECTestSpecificationImpl
