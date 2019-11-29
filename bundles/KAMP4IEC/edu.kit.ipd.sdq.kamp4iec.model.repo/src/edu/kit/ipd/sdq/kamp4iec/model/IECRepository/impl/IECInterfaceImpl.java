/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECAbstractMethod;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECAbstractProperty;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECInterface;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IEC Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECInterfaceImpl#getHasMethod <em>Has Method</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECInterfaceImpl#getHasProperty <em>Has Property</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.impl.IECInterfaceImpl#getExtendsInterface <em>Extends Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IECInterfaceImpl extends IdentifierImpl implements IECInterface {
	/**
	 * The cached value of the '{@link #getHasMethod() <em>Has Method</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<IECAbstractMethod> hasMethod;

	/**
	 * The cached value of the '{@link #getHasProperty() <em>Has Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<IECAbstractProperty> hasProperty;

	/**
	 * The cached value of the '{@link #getExtendsInterface() <em>Extends Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendsInterface()
	 * @generated
	 * @ordered
	 */
	protected IECInterface extendsInterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IECInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IECRepositoryPackage.Literals.IEC_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECAbstractMethod> getHasMethod() {
		if (hasMethod == null) {
			hasMethod = new EObjectContainmentEList<IECAbstractMethod>(IECAbstractMethod.class, this, IECRepositoryPackage.IEC_INTERFACE__HAS_METHOD);
		}
		return hasMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECAbstractProperty> getHasProperty() {
		if (hasProperty == null) {
			hasProperty = new EObjectContainmentEList<IECAbstractProperty>(IECAbstractProperty.class, this, IECRepositoryPackage.IEC_INTERFACE__HAS_PROPERTY);
		}
		return hasProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECInterface getExtendsInterface() {
		if (extendsInterface != null && extendsInterface.eIsProxy()) {
			InternalEObject oldExtendsInterface = (InternalEObject)extendsInterface;
			extendsInterface = (IECInterface)eResolveProxy(oldExtendsInterface);
			if (extendsInterface != oldExtendsInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IECRepositoryPackage.IEC_INTERFACE__EXTENDS_INTERFACE, oldExtendsInterface, extendsInterface));
			}
		}
		return extendsInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECInterface basicGetExtendsInterface() {
		return extendsInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendsInterface(IECInterface newExtendsInterface) {
		IECInterface oldExtendsInterface = extendsInterface;
		extendsInterface = newExtendsInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IECRepositoryPackage.IEC_INTERFACE__EXTENDS_INTERFACE, oldExtendsInterface, extendsInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IECRepositoryPackage.IEC_INTERFACE__HAS_METHOD:
				return ((InternalEList<?>)getHasMethod()).basicRemove(otherEnd, msgs);
			case IECRepositoryPackage.IEC_INTERFACE__HAS_PROPERTY:
				return ((InternalEList<?>)getHasProperty()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IECRepositoryPackage.IEC_INTERFACE__HAS_METHOD:
				return getHasMethod();
			case IECRepositoryPackage.IEC_INTERFACE__HAS_PROPERTY:
				return getHasProperty();
			case IECRepositoryPackage.IEC_INTERFACE__EXTENDS_INTERFACE:
				if (resolve) return getExtendsInterface();
				return basicGetExtendsInterface();
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
			case IECRepositoryPackage.IEC_INTERFACE__HAS_METHOD:
				getHasMethod().clear();
				getHasMethod().addAll((Collection<? extends IECAbstractMethod>)newValue);
				return;
			case IECRepositoryPackage.IEC_INTERFACE__HAS_PROPERTY:
				getHasProperty().clear();
				getHasProperty().addAll((Collection<? extends IECAbstractProperty>)newValue);
				return;
			case IECRepositoryPackage.IEC_INTERFACE__EXTENDS_INTERFACE:
				setExtendsInterface((IECInterface)newValue);
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
			case IECRepositoryPackage.IEC_INTERFACE__HAS_METHOD:
				getHasMethod().clear();
				return;
			case IECRepositoryPackage.IEC_INTERFACE__HAS_PROPERTY:
				getHasProperty().clear();
				return;
			case IECRepositoryPackage.IEC_INTERFACE__EXTENDS_INTERFACE:
				setExtendsInterface((IECInterface)null);
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
			case IECRepositoryPackage.IEC_INTERFACE__HAS_METHOD:
				return hasMethod != null && !hasMethod.isEmpty();
			case IECRepositoryPackage.IEC_INTERFACE__HAS_PROPERTY:
				return hasProperty != null && !hasProperty.isEmpty();
			case IECRepositoryPackage.IEC_INTERFACE__EXTENDS_INTERFACE:
				return extendsInterface != null;
		}
		return super.eIsSet(featureID);
	}

} //IECInterfaceImpl
