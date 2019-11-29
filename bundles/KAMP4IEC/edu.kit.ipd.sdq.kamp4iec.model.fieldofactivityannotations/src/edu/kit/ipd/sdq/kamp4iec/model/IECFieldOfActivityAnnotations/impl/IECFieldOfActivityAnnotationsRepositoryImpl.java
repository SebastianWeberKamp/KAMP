/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl;

import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECDevelopmentArtefactSpecification;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsPackage;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsRepository;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECStaffSpecification;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECTestSpecification;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsRepositoryImpl#getDevelopmentArtefactSpecification <em>Development Artefact Specification</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsRepositoryImpl#getTestSpecification <em>Test Specification</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECFieldOfActivityAnnotationsRepositoryImpl#getStaffSpecification <em>Staff Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IECFieldOfActivityAnnotationsRepositoryImpl extends MinimalEObjectImpl.Container implements IECFieldOfActivityAnnotationsRepository {
	/**
	 * The cached value of the '{@link #getDevelopmentArtefactSpecification() <em>Development Artefact Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevelopmentArtefactSpecification()
	 * @generated
	 * @ordered
	 */
	protected IECDevelopmentArtefactSpecification developmentArtefactSpecification;

	/**
	 * The cached value of the '{@link #getTestSpecification() <em>Test Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestSpecification()
	 * @generated
	 * @ordered
	 */
	protected IECTestSpecification testSpecification;

	/**
	 * The cached value of the '{@link #getStaffSpecification() <em>Staff Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaffSpecification()
	 * @generated
	 * @ordered
	 */
	protected IECStaffSpecification staffSpecification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IECFieldOfActivityAnnotationsRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IECFieldOfActivityAnnotationsPackage.Literals.IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECDevelopmentArtefactSpecification getDevelopmentArtefactSpecification() {
		return developmentArtefactSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDevelopmentArtefactSpecification(IECDevelopmentArtefactSpecification newDevelopmentArtefactSpecification, NotificationChain msgs) {
		IECDevelopmentArtefactSpecification oldDevelopmentArtefactSpecification = developmentArtefactSpecification;
		developmentArtefactSpecification = newDevelopmentArtefactSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IECFieldOfActivityAnnotationsPackage.IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEVELOPMENT_ARTEFACT_SPECIFICATION, oldDevelopmentArtefactSpecification, newDevelopmentArtefactSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevelopmentArtefactSpecification(IECDevelopmentArtefactSpecification newDevelopmentArtefactSpecification) {
		if (newDevelopmentArtefactSpecification != developmentArtefactSpecification) {
			NotificationChain msgs = null;
			if (developmentArtefactSpecification != null)
				msgs = ((InternalEObject)developmentArtefactSpecification).eInverseRemove(this, IECFieldOfActivityAnnotationsPackage.IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__PARENT, IECDevelopmentArtefactSpecification.class, msgs);
			if (newDevelopmentArtefactSpecification != null)
				msgs = ((InternalEObject)newDevelopmentArtefactSpecification).eInverseAdd(this, IECFieldOfActivityAnnotationsPackage.IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__PARENT, IECDevelopmentArtefactSpecification.class, msgs);
			msgs = basicSetDevelopmentArtefactSpecification(newDevelopmentArtefactSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IECFieldOfActivityAnnotationsPackage.IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEVELOPMENT_ARTEFACT_SPECIFICATION, newDevelopmentArtefactSpecification, newDevelopmentArtefactSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECTestSpecification getTestSpecification() {
		return testSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTestSpecification(IECTestSpecification newTestSpecification, NotificationChain msgs) {
		IECTestSpecification oldTestSpecification = testSpecification;
		testSpecification = newTestSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IECFieldOfActivityAnnotationsPackage.IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_SPECIFICATION, oldTestSpecification, newTestSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestSpecification(IECTestSpecification newTestSpecification) {
		if (newTestSpecification != testSpecification) {
			NotificationChain msgs = null;
			if (testSpecification != null)
				msgs = ((InternalEObject)testSpecification).eInverseRemove(this, IECFieldOfActivityAnnotationsPackage.IEC_TEST_SPECIFICATION__PARENT, IECTestSpecification.class, msgs);
			if (newTestSpecification != null)
				msgs = ((InternalEObject)newTestSpecification).eInverseAdd(this, IECFieldOfActivityAnnotationsPackage.IEC_TEST_SPECIFICATION__PARENT, IECTestSpecification.class, msgs);
			msgs = basicSetTestSpecification(newTestSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IECFieldOfActivityAnnotationsPackage.IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_SPECIFICATION, newTestSpecification, newTestSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECStaffSpecification getStaffSpecification() {
		return staffSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStaffSpecification(IECStaffSpecification newStaffSpecification, NotificationChain msgs) {
		IECStaffSpecification oldStaffSpecification = staffSpecification;
		staffSpecification = newStaffSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IECFieldOfActivityAnnotationsPackage.IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__STAFF_SPECIFICATION, oldStaffSpecification, newStaffSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaffSpecification(IECStaffSpecification newStaffSpecification) {
		if (newStaffSpecification != staffSpecification) {
			NotificationChain msgs = null;
			if (staffSpecification != null)
				msgs = ((InternalEObject)staffSpecification).eInverseRemove(this, IECFieldOfActivityAnnotationsPackage.IEC_STAFF_SPECIFICATION__PARENT, IECStaffSpecification.class, msgs);
			if (newStaffSpecification != null)
				msgs = ((InternalEObject)newStaffSpecification).eInverseAdd(this, IECFieldOfActivityAnnotationsPackage.IEC_STAFF_SPECIFICATION__PARENT, IECStaffSpecification.class, msgs);
			msgs = basicSetStaffSpecification(newStaffSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IECFieldOfActivityAnnotationsPackage.IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__STAFF_SPECIFICATION, newStaffSpecification, newStaffSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IECFieldOfActivityAnnotationsPackage.IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEVELOPMENT_ARTEFACT_SPECIFICATION:
				if (developmentArtefactSpecification != null)
					msgs = ((InternalEObject)developmentArtefactSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IECFieldOfActivityAnnotationsPackage.IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEVELOPMENT_ARTEFACT_SPECIFICATION, null, msgs);
				return basicSetDevelopmentArtefactSpecification((IECDevelopmentArtefactSpecification)otherEnd, msgs);
			case IECFieldOfActivityAnnotationsPackage.IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_SPECIFICATION:
				if (testSpecification != null)
					msgs = ((InternalEObject)testSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IECFieldOfActivityAnnotationsPackage.IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_SPECIFICATION, null, msgs);
				return basicSetTestSpecification((IECTestSpecification)otherEnd, msgs);
			case IECFieldOfActivityAnnotationsPackage.IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__STAFF_SPECIFICATION:
				if (staffSpecification != null)
					msgs = ((InternalEObject)staffSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IECFieldOfActivityAnnotationsPackage.IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__STAFF_SPECIFICATION, null, msgs);
				return basicSetStaffSpecification((IECStaffSpecification)otherEnd, msgs);
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
			case IECFieldOfActivityAnnotationsPackage.IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEVELOPMENT_ARTEFACT_SPECIFICATION:
				return basicSetDevelopmentArtefactSpecification(null, msgs);
			case IECFieldOfActivityAnnotationsPackage.IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_SPECIFICATION:
				return basicSetTestSpecification(null, msgs);
			case IECFieldOfActivityAnnotationsPackage.IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__STAFF_SPECIFICATION:
				return basicSetStaffSpecification(null, msgs);
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
			case IECFieldOfActivityAnnotationsPackage.IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEVELOPMENT_ARTEFACT_SPECIFICATION:
				return getDevelopmentArtefactSpecification();
			case IECFieldOfActivityAnnotationsPackage.IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_SPECIFICATION:
				return getTestSpecification();
			case IECFieldOfActivityAnnotationsPackage.IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__STAFF_SPECIFICATION:
				return getStaffSpecification();
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
			case IECFieldOfActivityAnnotationsPackage.IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEVELOPMENT_ARTEFACT_SPECIFICATION:
				setDevelopmentArtefactSpecification((IECDevelopmentArtefactSpecification)newValue);
				return;
			case IECFieldOfActivityAnnotationsPackage.IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_SPECIFICATION:
				setTestSpecification((IECTestSpecification)newValue);
				return;
			case IECFieldOfActivityAnnotationsPackage.IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__STAFF_SPECIFICATION:
				setStaffSpecification((IECStaffSpecification)newValue);
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
			case IECFieldOfActivityAnnotationsPackage.IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEVELOPMENT_ARTEFACT_SPECIFICATION:
				setDevelopmentArtefactSpecification((IECDevelopmentArtefactSpecification)null);
				return;
			case IECFieldOfActivityAnnotationsPackage.IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_SPECIFICATION:
				setTestSpecification((IECTestSpecification)null);
				return;
			case IECFieldOfActivityAnnotationsPackage.IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__STAFF_SPECIFICATION:
				setStaffSpecification((IECStaffSpecification)null);
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
			case IECFieldOfActivityAnnotationsPackage.IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEVELOPMENT_ARTEFACT_SPECIFICATION:
				return developmentArtefactSpecification != null;
			case IECFieldOfActivityAnnotationsPackage.IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_SPECIFICATION:
				return testSpecification != null;
			case IECFieldOfActivityAnnotationsPackage.IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__STAFF_SPECIFICATION:
				return staffSpecification != null;
		}
		return super.eIsSet(featureID);
	}

} //IECFieldOfActivityAnnotationsRepositoryImpl
