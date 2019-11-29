/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECComponent;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IEC Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECRole#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECRole#getPerson <em>Person</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECRole#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECRole#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsPackage#getIECRole()
 * @model abstract="true"
 * @generated
 */
public interface IECRole extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECRoleList#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(IECRoleList)
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsPackage#getIECRole_Parent()
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECRoleList#getRoles
	 * @model opposite="roles" required="true" transient="false"
	 * @generated
	 */
	IECRoleList getParent();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECRole#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(IECRoleList value);

	/**
	 * Returns the value of the '<em><b>Person</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECPerson}.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECPerson#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsPackage#getIECRole_Person()
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECPerson#getRoles
	 * @model opposite="roles"
	 * @generated
	 */
	EList<IECPerson> getPerson();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsPackage#getIECRole_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECRole#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Components</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsPackage#getIECRole_Components()
	 * @model
	 * @generated
	 */
	EList<IECComponent> getComponents();

} // IECRole
