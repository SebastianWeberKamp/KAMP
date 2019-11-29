/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IEC Person List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECPersonList#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECPersonList#getPersons <em>Persons</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsPackage#getIECPersonList()
 * @model
 * @generated
 */
public interface IECPersonList extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECStaffSpecification#getPersonList <em>Person List</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(IECStaffSpecification)
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsPackage#getIECPersonList_Parent()
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECStaffSpecification#getPersonList
	 * @model opposite="personList" required="true" transient="false"
	 * @generated
	 */
	IECStaffSpecification getParent();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECPersonList#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(IECStaffSpecification value);

	/**
	 * Returns the value of the '<em><b>Persons</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECPerson}.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECPerson#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persons</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persons</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsPackage#getIECPersonList_Persons()
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECPerson#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<IECPerson> getPersons();

} // IECPersonList
