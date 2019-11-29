/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations;

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
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsRepository#getDevelopmentArtefactSpecification <em>Development Artefact Specification</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsRepository#getTestSpecification <em>Test Specification</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsRepository#getStaffSpecification <em>Staff Specification</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsPackage#getIECFieldOfActivityAnnotationsRepository()
 * @model
 * @generated
 */
public interface IECFieldOfActivityAnnotationsRepository extends EObject {
	/**
	 * Returns the value of the '<em><b>Development Artefact Specification</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECDevelopmentArtefactSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Development Artefact Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Development Artefact Specification</em>' containment reference.
	 * @see #setDevelopmentArtefactSpecification(IECDevelopmentArtefactSpecification)
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsPackage#getIECFieldOfActivityAnnotationsRepository_DevelopmentArtefactSpecification()
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECDevelopmentArtefactSpecification#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	IECDevelopmentArtefactSpecification getDevelopmentArtefactSpecification();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsRepository#getDevelopmentArtefactSpecification <em>Development Artefact Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Development Artefact Specification</em>' containment reference.
	 * @see #getDevelopmentArtefactSpecification()
	 * @generated
	 */
	void setDevelopmentArtefactSpecification(IECDevelopmentArtefactSpecification value);

	/**
	 * Returns the value of the '<em><b>Test Specification</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECTestSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Specification</em>' containment reference.
	 * @see #setTestSpecification(IECTestSpecification)
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsPackage#getIECFieldOfActivityAnnotationsRepository_TestSpecification()
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECTestSpecification#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	IECTestSpecification getTestSpecification();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsRepository#getTestSpecification <em>Test Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Specification</em>' containment reference.
	 * @see #getTestSpecification()
	 * @generated
	 */
	void setTestSpecification(IECTestSpecification value);

	/**
	 * Returns the value of the '<em><b>Staff Specification</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECStaffSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Staff Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staff Specification</em>' containment reference.
	 * @see #setStaffSpecification(IECStaffSpecification)
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsPackage#getIECFieldOfActivityAnnotationsRepository_StaffSpecification()
	 * @see edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECStaffSpecification#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	IECStaffSpecification getStaffSpecification();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsRepository#getStaffSpecification <em>Staff Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Staff Specification</em>' containment reference.
	 * @see #getStaffSpecification()
	 * @generated
	 */
	void setStaffSpecification(IECStaffSpecification value);

} // IECFieldOfActivityAnnotationsRepository
