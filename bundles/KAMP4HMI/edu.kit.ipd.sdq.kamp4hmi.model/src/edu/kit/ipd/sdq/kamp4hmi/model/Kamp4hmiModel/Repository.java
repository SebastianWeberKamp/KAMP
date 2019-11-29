/**
 */
package edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Repository#getStartingStep <em>Starting Step</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Repository#getHmiElement <em>Hmi Element</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Repository#getModes <em>Modes</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Kamp4hmiModelPackage#getRepository()
 * @model
 * @generated
 */
public interface Repository extends EObject {
	/**
	 * Returns the value of the '<em><b>Starting Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Starting Step</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Starting Step</em>' reference.
	 * @see #setStartingStep(Step)
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Kamp4hmiModelPackage#getRepository_StartingStep()
	 * @model required="true"
	 * @generated
	 */
	Step getStartingStep();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Repository#getStartingStep <em>Starting Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starting Step</em>' reference.
	 * @see #getStartingStep()
	 * @generated
	 */
	void setStartingStep(Step value);

	/**
	 * Returns the value of the '<em><b>Hmi Element</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.HMIElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hmi Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hmi Element</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Kamp4hmiModelPackage#getRepository_HmiElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<HMIElement> getHmiElement();

	/**
	 * Returns the value of the '<em><b>Modes</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Mode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modes</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Kamp4hmiModelPackage#getRepository_Modes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mode> getModes();

} // Repository
