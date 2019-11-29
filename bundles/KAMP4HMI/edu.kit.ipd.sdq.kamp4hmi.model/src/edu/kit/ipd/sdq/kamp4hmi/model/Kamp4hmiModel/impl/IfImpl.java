/**
 */
package edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl;

import edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Condition;
import edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.If;
import edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Kamp4hmiModelPackage;
import edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Step;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.IfImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.IfImpl#getTrueSuccessor <em>True Successor</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl.IfImpl#getFalseSuccessor <em>False Successor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfImpl extends HMIElementImpl implements If {
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
	 * The cached value of the '{@link #getTrueSuccessor() <em>True Successor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrueSuccessor()
	 * @generated
	 * @ordered
	 */
	protected Step trueSuccessor;

	/**
	 * The cached value of the '{@link #getFalseSuccessor() <em>False Successor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFalseSuccessor()
	 * @generated
	 * @ordered
	 */
	protected Step falseSuccessor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Kamp4hmiModelPackage.Literals.IF;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Kamp4hmiModelPackage.IF__CONDITION, oldCondition, newCondition);
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
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Kamp4hmiModelPackage.IF__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Kamp4hmiModelPackage.IF__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Kamp4hmiModelPackage.IF__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step getTrueSuccessor() {
		if (trueSuccessor != null && trueSuccessor.eIsProxy()) {
			InternalEObject oldTrueSuccessor = (InternalEObject)trueSuccessor;
			trueSuccessor = (Step)eResolveProxy(oldTrueSuccessor);
			if (trueSuccessor != oldTrueSuccessor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Kamp4hmiModelPackage.IF__TRUE_SUCCESSOR, oldTrueSuccessor, trueSuccessor));
			}
		}
		return trueSuccessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step basicGetTrueSuccessor() {
		return trueSuccessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrueSuccessor(Step newTrueSuccessor) {
		Step oldTrueSuccessor = trueSuccessor;
		trueSuccessor = newTrueSuccessor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Kamp4hmiModelPackage.IF__TRUE_SUCCESSOR, oldTrueSuccessor, trueSuccessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step getFalseSuccessor() {
		if (falseSuccessor != null && falseSuccessor.eIsProxy()) {
			InternalEObject oldFalseSuccessor = (InternalEObject)falseSuccessor;
			falseSuccessor = (Step)eResolveProxy(oldFalseSuccessor);
			if (falseSuccessor != oldFalseSuccessor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Kamp4hmiModelPackage.IF__FALSE_SUCCESSOR, oldFalseSuccessor, falseSuccessor));
			}
		}
		return falseSuccessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step basicGetFalseSuccessor() {
		return falseSuccessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFalseSuccessor(Step newFalseSuccessor) {
		Step oldFalseSuccessor = falseSuccessor;
		falseSuccessor = newFalseSuccessor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Kamp4hmiModelPackage.IF__FALSE_SUCCESSOR, oldFalseSuccessor, falseSuccessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Kamp4hmiModelPackage.IF__CONDITION:
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
			case Kamp4hmiModelPackage.IF__CONDITION:
				return getCondition();
			case Kamp4hmiModelPackage.IF__TRUE_SUCCESSOR:
				if (resolve) return getTrueSuccessor();
				return basicGetTrueSuccessor();
			case Kamp4hmiModelPackage.IF__FALSE_SUCCESSOR:
				if (resolve) return getFalseSuccessor();
				return basicGetFalseSuccessor();
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
			case Kamp4hmiModelPackage.IF__CONDITION:
				setCondition((Condition)newValue);
				return;
			case Kamp4hmiModelPackage.IF__TRUE_SUCCESSOR:
				setTrueSuccessor((Step)newValue);
				return;
			case Kamp4hmiModelPackage.IF__FALSE_SUCCESSOR:
				setFalseSuccessor((Step)newValue);
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
			case Kamp4hmiModelPackage.IF__CONDITION:
				setCondition((Condition)null);
				return;
			case Kamp4hmiModelPackage.IF__TRUE_SUCCESSOR:
				setTrueSuccessor((Step)null);
				return;
			case Kamp4hmiModelPackage.IF__FALSE_SUCCESSOR:
				setFalseSuccessor((Step)null);
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
			case Kamp4hmiModelPackage.IF__CONDITION:
				return condition != null;
			case Kamp4hmiModelPackage.IF__TRUE_SUCCESSOR:
				return trueSuccessor != null;
			case Kamp4hmiModelPackage.IF__FALSE_SUCCESSOR:
				return falseSuccessor != null;
		}
		return super.eIsSet(featureID);
	}

} //IfImpl
