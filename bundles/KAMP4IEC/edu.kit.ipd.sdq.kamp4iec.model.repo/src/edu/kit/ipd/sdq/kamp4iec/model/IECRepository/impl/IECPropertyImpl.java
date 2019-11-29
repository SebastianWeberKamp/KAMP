/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.DerivedType;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECAbstractProperty;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECProperty;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IEC Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECPropertyImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECPropertyImpl#getHasDerivedType <em>Has Derived Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IECPropertyImpl extends IdentifierImpl implements IECProperty {
	/**
	 * The cached value of the '{@link #getImplements() <em>Implements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplements()
	 * @generated
	 * @ordered
	 */
	protected IECAbstractProperty implements_;

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
	protected IECPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IECRepositoryPackage.Literals.IEC_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECAbstractProperty getImplements() {
		if (implements_ != null && implements_.eIsProxy()) {
			InternalEObject oldImplements = (InternalEObject)implements_;
			implements_ = (IECAbstractProperty)eResolveProxy(oldImplements);
			if (implements_ != oldImplements) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IECRepositoryPackage.IEC_PROPERTY__IMPLEMENTS, oldImplements, implements_));
			}
		}
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECAbstractProperty basicGetImplements() {
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplements(IECAbstractProperty newImplements) {
		IECAbstractProperty oldImplements = implements_;
		implements_ = newImplements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IECRepositoryPackage.IEC_PROPERTY__IMPLEMENTS, oldImplements, implements_));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IECRepositoryPackage.IEC_PROPERTY__HAS_DERIVED_TYPE, oldHasDerivedType, hasDerivedType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IECRepositoryPackage.IEC_PROPERTY__HAS_DERIVED_TYPE, oldHasDerivedType, hasDerivedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IECRepositoryPackage.IEC_PROPERTY__IMPLEMENTS:
				if (resolve) return getImplements();
				return basicGetImplements();
			case IECRepositoryPackage.IEC_PROPERTY__HAS_DERIVED_TYPE:
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
			case IECRepositoryPackage.IEC_PROPERTY__IMPLEMENTS:
				setImplements((IECAbstractProperty)newValue);
				return;
			case IECRepositoryPackage.IEC_PROPERTY__HAS_DERIVED_TYPE:
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
			case IECRepositoryPackage.IEC_PROPERTY__IMPLEMENTS:
				setImplements((IECAbstractProperty)null);
				return;
			case IECRepositoryPackage.IEC_PROPERTY__HAS_DERIVED_TYPE:
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
			case IECRepositoryPackage.IEC_PROPERTY__IMPLEMENTS:
				return implements_ != null;
			case IECRepositoryPackage.IEC_PROPERTY__HAS_DERIVED_TYPE:
				return hasDerivedType != null;
		}
		return super.eIsSet(featureID);
	}

} //IECPropertyImpl
