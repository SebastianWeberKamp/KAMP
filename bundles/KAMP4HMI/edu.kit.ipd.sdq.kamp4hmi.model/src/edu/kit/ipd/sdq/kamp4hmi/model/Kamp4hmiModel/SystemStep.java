/**
 */
package edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.SystemStep#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Kamp4hmiModelPackage#getSystemStep()
 * @model
 * @generated
 */
public interface SystemStep extends Step {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Mode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Kamp4hmiModelPackage#getSystemStep_Mode()
	 * @model
	 * @generated
	 */
	EList<Mode> getMode();

} // SystemStep
