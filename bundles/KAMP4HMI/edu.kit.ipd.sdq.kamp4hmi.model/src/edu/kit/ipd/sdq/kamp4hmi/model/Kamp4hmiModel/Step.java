/**
 */
package edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Step#getSuccessor <em>Successor</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Kamp4hmiModelPackage#getStep()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Step extends HMIElement {
	/**
	 * Returns the value of the '<em><b>Successor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Successor</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successor</em>' reference.
	 * @see #setSuccessor(HMIElement)
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Kamp4hmiModelPackage#getStep_Successor()
	 * @model
	 * @generated
	 */
	HMIElement getSuccessor();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Step#getSuccessor <em>Successor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Successor</em>' reference.
	 * @see #getSuccessor()
	 * @generated
	 */
	void setSuccessor(HMIElement value);

} // Step
