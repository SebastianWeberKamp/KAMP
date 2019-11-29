/**
 */
package edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl;

import edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Condition;
import edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.For;
import edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Kamp4hmiModelPackage;
import edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Step;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.ForImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.ForImpl#getLoopSuccessor <em>Loop Successor</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.ForImpl#getLoopEndSuccessor <em>Loop End Successor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForImpl extends HMIElementImpl implements For {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition condition;

	/**
	 * The cached value of the '{@link #getLoopSuccessor() <em>Loop Successor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopSuccessor()
	 * @generated
	 * @ordered
	 */
	protected Step loopSuccessor;

	/**
	 * The cached value of the '{@link #getLoopEndSuccessor() <em>Loop End Successor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopEndSuccessor()
	 * @generated
	 * @ordered
	 */
	protected Step loopEndSuccessor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Kamp4hmiModelPackage.Literals.FOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Condition newCondition, NotificationChain msgs) {
		Condition oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Kamp4hmiModelPackage.FOR__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Condition newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Kamp4hmiModelPackage.FOR__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Kamp4hmiModelPackage.FOR__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Kamp4hmiModelPackage.FOR__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step getLoopSuccessor() {
		if (loopSuccessor != null && loopSuccessor.eIsProxy()) {
			InternalEObject oldLoopSuccessor = (InternalEObject)loopSuccessor;
			loopSuccessor = (Step)eResolveProxy(oldLoopSuccessor);
			if (loopSuccessor != oldLoopSuccessor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Kamp4hmiModelPackage.FOR__LOOP_SUCCESSOR, oldLoopSuccessor, loopSuccessor));
			}
		}
		return loopSuccessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step basicGetLoopSuccessor() {
		return loopSuccessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopSuccessor(Step newLoopSuccessor) {
		Step oldLoopSuccessor = loopSuccessor;
		loopSuccessor = newLoopSuccessor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Kamp4hmiModelPackage.FOR__LOOP_SUCCESSOR, oldLoopSuccessor, loopSuccessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step getLoopEndSuccessor() {
		if (loopEndSuccessor != null && loopEndSuccessor.eIsProxy()) {
			InternalEObject oldLoopEndSuccessor = (InternalEObject)loopEndSuccessor;
			loopEndSuccessor = (Step)eResolveProxy(oldLoopEndSuccessor);
			if (loopEndSuccessor != oldLoopEndSuccessor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Kamp4hmiModelPackage.FOR__LOOP_END_SUCCESSOR, oldLoopEndSuccessor, loopEndSuccessor));
			}
		}
		return loopEndSuccessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step basicGetLoopEndSuccessor() {
		return loopEndSuccessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopEndSuccessor(Step newLoopEndSuccessor) {
		Step oldLoopEndSuccessor = loopEndSuccessor;
		loopEndSuccessor = newLoopEndSuccessor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Kamp4hmiModelPackage.FOR__LOOP_END_SUCCESSOR, oldLoopEndSuccessor, loopEndSuccessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Kamp4hmiModelPackage.FOR__CONDITION:
				return basicSetCondition(null, msgs);
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
			case Kamp4hmiModelPackage.FOR__CONDITION:
				return getCondition();
			case Kamp4hmiModelPackage.FOR__LOOP_SUCCESSOR:
				if (resolve) return getLoopSuccessor();
				return basicGetLoopSuccessor();
			case Kamp4hmiModelPackage.FOR__LOOP_END_SUCCESSOR:
				if (resolve) return getLoopEndSuccessor();
				return basicGetLoopEndSuccessor();
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
			case Kamp4hmiModelPackage.FOR__CONDITION:
				setCondition((Condition)newValue);
				return;
			case Kamp4hmiModelPackage.FOR__LOOP_SUCCESSOR:
				setLoopSuccessor((Step)newValue);
				return;
			case Kamp4hmiModelPackage.FOR__LOOP_END_SUCCESSOR:
				setLoopEndSuccessor((Step)newValue);
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
			case Kamp4hmiModelPackage.FOR__CONDITION:
				setCondition((Condition)null);
				return;
			case Kamp4hmiModelPackage.FOR__LOOP_SUCCESSOR:
				setLoopSuccessor((Step)null);
				return;
			case Kamp4hmiModelPackage.FOR__LOOP_END_SUCCESSOR:
				setLoopEndSuccessor((Step)null);
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
			case Kamp4hmiModelPackage.FOR__CONDITION:
				return condition != null;
			case Kamp4hmiModelPackage.FOR__LOOP_SUCCESSOR:
				return loopSuccessor != null;
			case Kamp4hmiModelPackage.FOR__LOOP_END_SUCCESSOR:
				return loopEndSuccessor != null;
		}
		return super.eIsSet(featureID);
	}

} //ForImpl
