/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl;

import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsPackage;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECTestSpecification;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECUnitTestCaseAggregation;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECComponent;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IEC Unit Test Case Aggregation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECUnitTestCaseAggregationImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECUnitTestCaseAggregationImpl#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IECUnitTestCaseAggregationImpl extends IECTestCaseAggregationImpl implements IECUnitTestCaseAggregation {
	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected IECComponent component;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IECUnitTestCaseAggregationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IECFieldOfActivityAnnotationsPackage.Literals.IEC_UNIT_TEST_CASE_AGGREGATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECTestSpecification getParent() {
		if (eContainerFeatureID() != IECFieldOfActivityAnnotationsPackage.IEC_UNIT_TEST_CASE_AGGREGATION__PARENT) return null;
		return (IECTestSpecification)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(IECTestSpecification newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, IECFieldOfActivityAnnotationsPackage.IEC_UNIT_TEST_CASE_AGGREGATION__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(IECTestSpecification newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != IECFieldOfActivityAnnotationsPackage.IEC_UNIT_TEST_CASE_AGGREGATION__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, IECFieldOfActivityAnnotationsPackage.IEC_TEST_SPECIFICATION__UNIT_TEST_CASE_AGGREGATIONS, IECTestSpecification.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IECFieldOfActivityAnnotationsPackage.IEC_UNIT_TEST_CASE_AGGREGATION__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECComponent getComponent() {
		if (component != null && component.eIsProxy()) {
			InternalEObject oldComponent = (InternalEObject)component;
			component = (IECComponent)eResolveProxy(oldComponent);
			if (component != oldComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IECFieldOfActivityAnnotationsPackage.IEC_UNIT_TEST_CASE_AGGREGATION__COMPONENT, oldComponent, component));
			}
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECComponent basicGetComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(IECComponent newComponent) {
		IECComponent oldComponent = component;
		component = newComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IECFieldOfActivityAnnotationsPackage.IEC_UNIT_TEST_CASE_AGGREGATION__COMPONENT, oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IECFieldOfActivityAnnotationsPackage.IEC_UNIT_TEST_CASE_AGGREGATION__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((IECTestSpecification)otherEnd, msgs);
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
			case IECFieldOfActivityAnnotationsPackage.IEC_UNIT_TEST_CASE_AGGREGATION__PARENT:
				return basicSetParent(null, msgs);
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
			case IECFieldOfActivityAnnotationsPackage.IEC_UNIT_TEST_CASE_AGGREGATION__PARENT:
				return eInternalContainer().eInverseRemove(this, IECFieldOfActivityAnnotationsPackage.IEC_TEST_SPECIFICATION__UNIT_TEST_CASE_AGGREGATIONS, IECTestSpecification.class, msgs);
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
			case IECFieldOfActivityAnnotationsPackage.IEC_UNIT_TEST_CASE_AGGREGATION__PARENT:
				return getParent();
			case IECFieldOfActivityAnnotationsPackage.IEC_UNIT_TEST_CASE_AGGREGATION__COMPONENT:
				if (resolve) return getComponent();
				return basicGetComponent();
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
			case IECFieldOfActivityAnnotationsPackage.IEC_UNIT_TEST_CASE_AGGREGATION__PARENT:
				setParent((IECTestSpecification)newValue);
				return;
			case IECFieldOfActivityAnnotationsPackage.IEC_UNIT_TEST_CASE_AGGREGATION__COMPONENT:
				setComponent((IECComponent)newValue);
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
			case IECFieldOfActivityAnnotationsPackage.IEC_UNIT_TEST_CASE_AGGREGATION__PARENT:
				setParent((IECTestSpecification)null);
				return;
			case IECFieldOfActivityAnnotationsPackage.IEC_UNIT_TEST_CASE_AGGREGATION__COMPONENT:
				setComponent((IECComponent)null);
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
			case IECFieldOfActivityAnnotationsPackage.IEC_UNIT_TEST_CASE_AGGREGATION__PARENT:
				return getParent() != null;
			case IECFieldOfActivityAnnotationsPackage.IEC_UNIT_TEST_CASE_AGGREGATION__COMPONENT:
				return component != null;
		}
		return super.eIsSet(featureID);
	}

} //IECUnitTestCaseAggregationImpl
