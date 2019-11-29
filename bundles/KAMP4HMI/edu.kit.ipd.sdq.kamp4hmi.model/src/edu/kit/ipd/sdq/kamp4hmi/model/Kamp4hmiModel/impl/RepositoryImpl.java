/**
 */
package edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl;

import edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.HMIElement;
import edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Kamp4hmiModelPackage;
import edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Mode;
import edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Repository;
import edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Step;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.RepositoryImpl#getStartingStep <em>Starting Step</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.RepositoryImpl#getHmiElement <em>Hmi Element</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.RepositoryImpl#getModes <em>Modes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepositoryImpl extends MinimalEObjectImpl.Container implements Repository {
	/**
	 * The cached value of the '{@link #getStartingStep() <em>Starting Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingStep()
	 * @generated
	 * @ordered
	 */
	protected Step startingStep;

	/**
	 * The cached value of the '{@link #getHmiElement() <em>Hmi Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHmiElement()
	 * @generated
	 * @ordered
	 */
	protected EList<HMIElement> hmiElement;

	/**
	 * The cached value of the '{@link #getModes() <em>Modes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModes()
	 * @generated
	 * @ordered
	 */
	protected EList<Mode> modes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Kamp4hmiModelPackage.Literals.REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step getStartingStep() {
		if (startingStep != null && startingStep.eIsProxy()) {
			InternalEObject oldStartingStep = (InternalEObject)startingStep;
			startingStep = (Step)eResolveProxy(oldStartingStep);
			if (startingStep != oldStartingStep) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Kamp4hmiModelPackage.REPOSITORY__STARTING_STEP, oldStartingStep, startingStep));
			}
		}
		return startingStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step basicGetStartingStep() {
		return startingStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartingStep(Step newStartingStep) {
		Step oldStartingStep = startingStep;
		startingStep = newStartingStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Kamp4hmiModelPackage.REPOSITORY__STARTING_STEP, oldStartingStep, startingStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HMIElement> getHmiElement() {
		if (hmiElement == null) {
			hmiElement = new EObjectContainmentEList<HMIElement>(HMIElement.class, this, Kamp4hmiModelPackage.REPOSITORY__HMI_ELEMENT);
		}
		return hmiElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mode> getModes() {
		if (modes == null) {
			modes = new EObjectContainmentEList<Mode>(Mode.class, this, Kamp4hmiModelPackage.REPOSITORY__MODES);
		}
		return modes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Kamp4hmiModelPackage.REPOSITORY__HMI_ELEMENT:
				return ((InternalEList<?>)getHmiElement()).basicRemove(otherEnd, msgs);
			case Kamp4hmiModelPackage.REPOSITORY__MODES:
				return ((InternalEList<?>)getModes()).basicRemove(otherEnd, msgs);
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
			case Kamp4hmiModelPackage.REPOSITORY__STARTING_STEP:
				if (resolve) return getStartingStep();
				return basicGetStartingStep();
			case Kamp4hmiModelPackage.REPOSITORY__HMI_ELEMENT:
				return getHmiElement();
			case Kamp4hmiModelPackage.REPOSITORY__MODES:
				return getModes();
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
			case Kamp4hmiModelPackage.REPOSITORY__STARTING_STEP:
				setStartingStep((Step)newValue);
				return;
			case Kamp4hmiModelPackage.REPOSITORY__HMI_ELEMENT:
				getHmiElement().clear();
				getHmiElement().addAll((Collection<? extends HMIElement>)newValue);
				return;
			case Kamp4hmiModelPackage.REPOSITORY__MODES:
				getModes().clear();
				getModes().addAll((Collection<? extends Mode>)newValue);
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
			case Kamp4hmiModelPackage.REPOSITORY__STARTING_STEP:
				setStartingStep((Step)null);
				return;
			case Kamp4hmiModelPackage.REPOSITORY__HMI_ELEMENT:
				getHmiElement().clear();
				return;
			case Kamp4hmiModelPackage.REPOSITORY__MODES:
				getModes().clear();
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
			case Kamp4hmiModelPackage.REPOSITORY__STARTING_STEP:
				return startingStep != null;
			case Kamp4hmiModelPackage.REPOSITORY__HMI_ELEMENT:
				return hmiElement != null && !hmiElement.isEmpty();
			case Kamp4hmiModelPackage.REPOSITORY__MODES:
				return modes != null && !modes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RepositoryImpl
