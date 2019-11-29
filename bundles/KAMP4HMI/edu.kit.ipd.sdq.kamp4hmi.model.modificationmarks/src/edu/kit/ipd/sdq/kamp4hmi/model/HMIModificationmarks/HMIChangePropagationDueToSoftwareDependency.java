/**
 */
package edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HMI Change Propagation Due To Software Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMIChangePropagationDueToSoftwareDependency#getActorStepModification <em>Actor Step Modification</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMIChangePropagationDueToSoftwareDependency#getSystemStepModification <em>System Step Modification</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMIModificationmarksPackage#getHMIChangePropagationDueToSoftwareDependency()
 * @model
 * @generated
 */
public interface HMIChangePropagationDueToSoftwareDependency extends ChangePropagationStep {

	/**
	 * Returns the value of the '<em><b>Actor Step Modification</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMIModifyActorStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor Step Modification</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor Step Modification</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMIModificationmarksPackage#getHMIChangePropagationDueToSoftwareDependency_ActorStepModification()
	 * @model containment="true"
	 * @generated
	 */
	EList<HMIModifyActorStep> getActorStepModification();

	/**
	 * Returns the value of the '<em><b>System Step Modification</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMIModifySystemStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Step Modification</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Step Modification</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMIModificationmarksPackage#getHMIChangePropagationDueToSoftwareDependency_SystemStepModification()
	 * @model containment="true"
	 * @generated
	 */
	EList<HMIModifySystemStep> getSystemStepModification();
} // HMIChangePropagationDueToSoftwareDependency
