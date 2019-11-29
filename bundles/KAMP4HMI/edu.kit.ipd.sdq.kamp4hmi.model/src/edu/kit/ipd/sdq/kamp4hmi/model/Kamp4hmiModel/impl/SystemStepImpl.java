/**
 */
package edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl;

import edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.HMIElement;
import edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Kamp4hmiModelPackage;
import edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Mode;
import edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.SystemStep;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.SystemStepImpl#getSuccessor <em>Successor</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.SystemStepImpl#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemStepImpl extends HMIElementImpl implements SystemStep {
	/**
	 * The cached value of the '{@link #getSuccessor() <em>Successor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessor()
	 * @generated
	 * @ordered
	 */
	protected HMIElement successor;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected EList<Mode> mode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Kamp4hmiModelPackage.Literals.SYSTEM_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMIElement getSuccessor() {
		if (successor != null && successor.eIsProxy()) {
			InternalEObject oldSuccessor = (InternalEObject)successor;
			successor = (HMIElement)eResolveProxy(oldSuccessor);
			if (successor != oldSuccessor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Kamp4hmiModelPackage.SYSTEM_STEP__SUCCESSOR, oldSuccessor, successor));
			}
		}
		return successor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMIElement basicGetSuccessor() {
		return successor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuccessor(HMIElement newSuccessor) {
		HMIElement oldSuccessor = successor;
		successor = newSuccessor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Kamp4hmiModelPackage.SYSTEM_STEP__SUCCESSOR, oldSuccessor, successor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mode> getMode() {
		if (mode == null) {
			mode = new EObjectResolvingEList<Mode>(Mode.class, this, Kamp4hmiModelPackage.SYSTEM_STEP__MODE);
		}
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Kamp4hmiModelPackage.SYSTEM_STEP__SUCCESSOR:
				if (resolve) return getSuccessor();
				return basicGetSuccessor();
			case Kamp4hmiModelPackage.SYSTEM_STEP__MODE:
				return getMode();
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
			case Kamp4hmiModelPackage.SYSTEM_STEP__SUCCESSOR:
				setSuccessor((HMIElement)newValue);
				return;
			case Kamp4hmiModelPackage.SYSTEM_STEP__MODE:
				getMode().clear();
				getMode().addAll((Collection<? extends Mode>)newValue);
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
			case Kamp4hmiModelPackage.SYSTEM_STEP__SUCCESSOR:
				setSuccessor((HMIElement)null);
				return;
			case Kamp4hmiModelPackage.SYSTEM_STEP__MODE:
				getMode().clear();
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
			case Kamp4hmiModelPackage.SYSTEM_STEP__SUCCESSOR:
				return successor != null;
			case Kamp4hmiModelPackage.SYSTEM_STEP__MODE:
				return mode != null && !mode.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemStepImpl
