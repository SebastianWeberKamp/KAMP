/**
 */
package edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.If#getCondition <em>Condition</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.If#getTrueSuccessor <em>True Successor</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.If#getFalseSuccessor <em>False Successor</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Kamp4hmiModelPackage#getIf()
 * @model
 * @generated
 */
public interface If extends HMIElement {
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
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Kamp4hmiModelPackage#getIf_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.If#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>True Successor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>True Successor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>True Successor</em>' reference.
	 * @see #setTrueSuccessor(Step)
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Kamp4hmiModelPackage#getIf_TrueSuccessor()
	 * @model required="true"
	 * @generated
	 */
	Step getTrueSuccessor();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.If#getTrueSuccessor <em>True Successor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>True Successor</em>' reference.
	 * @see #getTrueSuccessor()
	 * @generated
	 */
	void setTrueSuccessor(Step value);

	/**
	 * Returns the value of the '<em><b>False Successor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>False Successor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>False Successor</em>' reference.
	 * @see #setFalseSuccessor(Step)
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Kamp4hmiModelPackage#getIf_FalseSuccessor()
	 * @model required="true"
	 * @generated
	 */
	Step getFalseSuccessor();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.If#getFalseSuccessor <em>False Successor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>False Successor</em>' reference.
	 * @see #getFalseSuccessor()
	 * @generated
	 */
	void setFalseSuccessor(Step value);

} // If
