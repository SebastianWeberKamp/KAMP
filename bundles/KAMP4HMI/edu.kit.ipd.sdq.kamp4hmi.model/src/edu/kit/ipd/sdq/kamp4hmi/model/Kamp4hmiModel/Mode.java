/**
 */
package edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IsMethod;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Mode#getAffectedFunctionBlocks <em>Affected Function Blocks</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Mode#getAffectedMethods <em>Affected Methods</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Mode#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Kamp4hmiModelPackage#getMode()
 * @model
 * @generated
 */
public interface Mode extends EObject {
	/**
	 * Returns the value of the '<em><b>Affected Function Blocks</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Affected Function Blocks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affected Function Blocks</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Kamp4hmiModelPackage#getMode_AffectedFunctionBlocks()
	 * @model
	 * @generated
	 */
	EList<FunctionBlock> getAffectedFunctionBlocks();

	/**
	 * Returns the value of the '<em><b>Affected Methods</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IsMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Affected Methods</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affected Methods</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Kamp4hmiModelPackage#getMode_AffectedMethods()
	 * @model
	 * @generated
	 */
	EList<IsMethod> getAffectedMethods();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Kamp4hmiModelPackage#getMode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Mode#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Mode
