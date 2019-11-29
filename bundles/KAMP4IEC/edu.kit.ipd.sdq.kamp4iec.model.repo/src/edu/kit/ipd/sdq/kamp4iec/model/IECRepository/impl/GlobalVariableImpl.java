/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.DerivedType;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.GlobalVariable;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.GlobalVariableImpl#getHasDerivedType <em>Has Derived Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlobalVariableImpl extends IdentifierImpl implements GlobalVariable {
	/**
	 * The cached value of the '{@link #getHasDerivedType() <em>Has Derived Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasDerivedType()
	 * @generated
	 * @ordered
	 */
	protected DerivedType hasDerivedType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IECRepositoryPackage.Literals.GLOBAL_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedType getHasDerivedType() {
		if (hasDerivedType != null && hasDerivedType.eIsProxy()) {
			InternalEObject oldHasDerivedType = (InternalEObject)hasDerivedType;
			hasDerivedType = (DerivedType)eResolveProxy(oldHasDerivedType);
			if (hasDerivedType != oldHasDerivedType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IECRepositoryPackage.GLOBAL_VARIABLE__HAS_DERIVED_TYPE, oldHasDerivedType, hasDerivedType));
			}
		}
		return hasDerivedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedType basicGetHasDerivedType() {
		return hasDerivedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasDerivedType(DerivedType newHasDerivedType) {
		DerivedType oldHasDerivedType = hasDerivedType;
		hasDerivedType = newHasDerivedType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IECRepositoryPackage.GLOBAL_VARIABLE__HAS_DERIVED_TYPE, oldHasDerivedType, hasDerivedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IECRepositoryPackage.GLOBAL_VARIABLE__HAS_DERIVED_TYPE:
				if (resolve) return getHasDerivedType();
				return basicGetHasDerivedType();
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
			case IECRepositoryPackage.GLOBAL_VARIABLE__HAS_DERIVED_TYPE:
				setHasDerivedType((DerivedType)newValue);
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
			case IECRepositoryPackage.GLOBAL_VARIABLE__HAS_DERIVED_TYPE:
				setHasDerivedType((DerivedType)null);
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
			case IECRepositoryPackage.GLOBAL_VARIABLE__HAS_DERIVED_TYPE:
				return hasDerivedType != null;
		}
		return super.eIsSet(featureID);
	}

} //GlobalVariableImpl
