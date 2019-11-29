/**
 */
package edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.For#getCondition <em>Condition</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.For#getLoopSuccessor <em>Loop Successor</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.For#getLoopEndSuccessor <em>Loop End Successor</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Kamp4hmiModelPackage#getFor()
 * @model
 * @generated
 */
public interface For extends HMIElement {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Condition)
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Kamp4hmiModelPackage#getFor_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.For#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Loop Successor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop Successor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Successor</em>' reference.
	 * @see #setLoopSuccessor(Step)
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Kamp4hmiModelPackage#getFor_LoopSuccessor()
	 * @model required="true"
	 * @generated
	 */
	Step getLoopSuccessor();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.For#getLoopSuccessor <em>Loop Successor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Successor</em>' reference.
	 * @see #getLoopSuccessor()
	 * @generated
	 */
	void setLoopSuccessor(Step value);

	/**
	 * Returns the value of the '<em><b>Loop End Successor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop End Successor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop End Successor</em>' reference.
	 * @see #setLoopEndSuccessor(Step)
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Kamp4hmiModelPackage#getFor_LoopEndSuccessor()
	 * @model required="true"
	 * @generated
	 */
	Step getLoopEndSuccessor();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.For#getLoopEndSuccessor <em>Loop End Successor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop End Successor</em>' reference.
	 * @see #getLoopEndSuccessor()
	 * @generated
	 */
	void setLoopEndSuccessor(Step value);

} // For
