/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.DerivedType;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECAbstractMethod;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IEC Abstract Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECAbstractMethodImpl#getHasDerivedReturnType <em>Has Derived Return Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IECAbstractMethodImpl extends IdentifierImpl implements IECAbstractMethod {
	/**
	 * The cached value of the '{@link #getHasDerivedReturnType() <em>Has Derived Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasDerivedReturnType()
	 * @generated
	 * @ordered
	 */
	protected DerivedType hasDerivedReturnType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IECAbstractMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IECRepositoryPackage.Literals.IEC_ABSTRACT_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedType getHasDerivedReturnType() {
		if (hasDerivedReturnType != null && hasDerivedReturnType.eIsProxy()) {
			InternalEObject oldHasDerivedReturnType = (InternalEObject)hasDerivedReturnType;
			hasDerivedReturnType = (DerivedType)eResolveProxy(oldHasDerivedReturnType);
			if (hasDerivedReturnType != oldHasDerivedReturnType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IECRepositoryPackage.IEC_ABSTRACT_METHOD__HAS_DERIVED_RETURN_TYPE, oldHasDerivedReturnType, hasDerivedReturnType));
			}
		}
		return hasDerivedReturnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedType basicGetHasDerivedReturnType() {
		return hasDerivedReturnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasDerivedReturnType(DerivedType newHasDerivedReturnType) {
		DerivedType oldHasDerivedReturnType = hasDerivedReturnType;
		hasDerivedReturnType = newHasDerivedReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IECRepositoryPackage.IEC_ABSTRACT_METHOD__HAS_DERIVED_RETURN_TYPE, oldHasDerivedReturnType, hasDerivedReturnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IECRepositoryPackage.IEC_ABSTRACT_METHOD__HAS_DERIVED_RETURN_TYPE:
				if (resolve) return getHasDerivedReturnType();
				return basicGetHasDerivedReturnType();
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
			case IECRepositoryPackage.IEC_ABSTRACT_METHOD__HAS_DERIVED_RETURN_TYPE:
				setHasDerivedReturnType((DerivedType)newValue);
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
			case IECRepositoryPackage.IEC_ABSTRACT_METHOD__HAS_DERIVED_RETURN_TYPE:
				setHasDerivedReturnType((DerivedType)null);
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
			case IECRepositoryPackage.IEC_ABSTRACT_METHOD__HAS_DERIVED_RETURN_TYPE:
				return hasDerivedReturnType != null;
		}
		return super.eIsSet(featureID);
	}

} //IECAbstractMethodImpl
