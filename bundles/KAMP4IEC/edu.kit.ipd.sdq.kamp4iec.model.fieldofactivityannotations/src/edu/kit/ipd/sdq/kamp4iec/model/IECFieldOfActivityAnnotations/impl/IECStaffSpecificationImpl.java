/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl;

import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsPackage;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsRepository;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECPersonList;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECRoleList;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECStaffSpecification;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IEC Staff Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECStaffSpecificationImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECStaffSpecificationImpl#getPersonList <em>Person List</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECStaffSpecificationImpl#getRoleList <em>Role List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IECStaffSpecificationImpl extends MinimalEObjectImpl.Container implements IECStaffSpecification {
	/**
	 * The cached value of the '{@link #getPersonList() <em>Person List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonList()
	 * @generated
	 * @ordered
	 */
	protected IECPersonList personList;

	/**
	 * The cached value of the '{@link #getRoleList() <em>Role List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleList()
	 * @generated
	 * @ordered
	 */
	protected IECRoleList roleList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IECStaffSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IECFieldOfActivityAnnotationsPackage.Literals.IEC_STAFF_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECFieldOfActivityAnnotationsRepository getParent() {
		if (eContainerFeatureID() != IECFieldOfActivityAnnotationsPackage.IEC_STAFF_SPECIFICATION__PARENT) return null;
		return (IECFieldOfActivityAnnotationsRepository)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(IECFieldOfActivityAnnotationsRepository newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, IECFieldOfActivityAnnotationsPackage.IEC_STAFF_SPECIFICATION__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(IECFieldOfActivityAnnotationsRepository newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != IECFieldOfActivityAnnotationsPackage.IEC_STAFF_SPECIFICATION__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, IECFieldOfActivityAnnotationsPackage.IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__STAFF_SPECIFICATION, IECFieldOfActivityAnnotationsRepository.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IECFieldOfActivityAnnotationsPackage.IEC_STAFF_SPECIFICATION__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECPersonList getPersonList() {
		return personList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPersonList(IECPersonList newPersonList, NotificationChain msgs) {
		IECPersonList oldPersonList = personList;
		personList = newPersonList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IECFieldOfActivityAnnotationsPackage.IEC_STAFF_SPECIFICATION__PERSON_LIST, oldPersonList, newPersonList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonList(IECPersonList newPersonList) {
		if (newPersonList != personList) {
			NotificationChain msgs = null;
			if (personList != null)
				msgs = ((InternalEObject)personList).eInverseRemove(this, IECFieldOfActivityAnnotationsPackage.IEC_PERSON_LIST__PARENT, IECPersonList.class, msgs);
			if (newPersonList != null)
				msgs = ((InternalEObject)newPersonList).eInverseAdd(this, IECFieldOfActivityAnnotationsPackage.IEC_PERSON_LIST__PARENT, IECPersonList.class, msgs);
			msgs = basicSetPersonList(newPersonList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IECFieldOfActivityAnnotationsPackage.IEC_STAFF_SPECIFICATION__PERSON_LIST, newPersonList, newPersonList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECRoleList getRoleList() {
		return roleList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoleList(IECRoleList newRoleList, NotificationChain msgs) {
		IECRoleList oldRoleList = roleList;
		roleList = newRoleList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IECFieldOfActivityAnnotationsPackage.IEC_STAFF_SPECIFICATION__ROLE_LIST, oldRoleList, newRoleList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleList(IECRoleList newRoleList) {
		if (newRoleList != roleList) {
			NotificationChain msgs = null;
			if (roleList != null)
				msgs = ((InternalEObject)roleList).eInverseRemove(this, IECFieldOfActivityAnnotationsPackage.IEC_ROLE_LIST__PARENT, IECRoleList.class, msgs);
			if (newRoleList != null)
				msgs = ((InternalEObject)newRoleList).eInverseAdd(this, IECFieldOfActivityAnnotationsPackage.IEC_ROLE_LIST__PARENT, IECRoleList.class, msgs);
			msgs = basicSetRoleList(newRoleList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IECFieldOfActivityAnnotationsPackage.IEC_STAFF_SPECIFICATION__ROLE_LIST, newRoleList, newRoleList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IECFieldOfActivityAnnotationsPackage.IEC_STAFF_SPECIFICATION__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((IECFieldOfActivityAnnotationsRepository)otherEnd, msgs);
			case IECFieldOfActivityAnnotationsPackage.IEC_STAFF_SPECIFICATION__PERSON_LIST:
				if (personList != null)
					msgs = ((InternalEObject)personList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IECFieldOfActivityAnnotationsPackage.IEC_STAFF_SPECIFICATION__PERSON_LIST, null, msgs);
				return basicSetPersonList((IECPersonList)otherEnd, msgs);
			case IECFieldOfActivityAnnotationsPackage.IEC_STAFF_SPECIFICATION__ROLE_LIST:
				if (roleList != null)
					msgs = ((InternalEObject)roleList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IECFieldOfActivityAnnotationsPackage.IEC_STAFF_SPECIFICATION__ROLE_LIST, null, msgs);
				return basicSetRoleList((IECRoleList)otherEnd, msgs);
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
			case IECFieldOfActivityAnnotationsPackage.IEC_STAFF_SPECIFICATION__PARENT:
				return basicSetParent(null, msgs);
			case IECFieldOfActivityAnnotationsPackage.IEC_STAFF_SPECIFICATION__PERSON_LIST:
				return basicSetPersonList(null, msgs);
			case IECFieldOfActivityAnnotationsPackage.IEC_STAFF_SPECIFICATION__ROLE_LIST:
				return basicSetRoleList(null, msgs);
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
			case IECFieldOfActivityAnnotationsPackage.IEC_STAFF_SPECIFICATION__PARENT:
				return eInternalContainer().eInverseRemove(this, IECFieldOfActivityAnnotationsPackage.IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__STAFF_SPECIFICATION, IECFieldOfActivityAnnotationsRepository.class, msgs);
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
			case IECFieldOfActivityAnnotationsPackage.IEC_STAFF_SPECIFICATION__PARENT:
				return getParent();
			case IECFieldOfActivityAnnotationsPackage.IEC_STAFF_SPECIFICATION__PERSON_LIST:
				return getPersonList();
			case IECFieldOfActivityAnnotationsPackage.IEC_STAFF_SPECIFICATION__ROLE_LIST:
				return getRoleList();
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
			case IECFieldOfActivityAnnotationsPackage.IEC_STAFF_SPECIFICATION__PARENT:
				setParent((IECFieldOfActivityAnnotationsRepository)newValue);
				return;
			case IECFieldOfActivityAnnotationsPackage.IEC_STAFF_SPECIFICATION__PERSON_LIST:
				setPersonList((IECPersonList)newValue);
				return;
			case IECFieldOfActivityAnnotationsPackage.IEC_STAFF_SPECIFICATION__ROLE_LIST:
				setRoleList((IECRoleList)newValue);
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
			case IECFieldOfActivityAnnotationsPackage.IEC_STAFF_SPECIFICATION__PARENT:
				setParent((IECFieldOfActivityAnnotationsRepository)null);
				return;
			case IECFieldOfActivityAnnotationsPackage.IEC_STAFF_SPECIFICATION__PERSON_LIST:
				setPersonList((IECPersonList)null);
				return;
			case IECFieldOfActivityAnnotationsPackage.IEC_STAFF_SPECIFICATION__ROLE_LIST:
				setRoleList((IECRoleList)null);
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
			case IECFieldOfActivityAnnotationsPackage.IEC_STAFF_SPECIFICATION__PARENT:
				return getParent() != null;
			case IECFieldOfActivityAnnotationsPackage.IEC_STAFF_SPECIFICATION__PERSON_LIST:
				return personList != null;
			case IECFieldOfActivityAnnotationsPackage.IEC_STAFF_SPECIFICATION__ROLE_LIST:
				return roleList != null;
		}
		return super.eIsSet(featureID);
	}

} //IECStaffSpecificationImpl
