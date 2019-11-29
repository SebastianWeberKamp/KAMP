/**
 */
package edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.impl;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.AbstractModificationImpl;

import edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMIModificationmarksPackage;
import edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMIModifyStep;

import edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Step;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HMI Modify Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class HMIModifyStepImpl<T extends Step> extends AbstractModificationImpl<T, EObject> implements HMIModifyStep<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HMIModifyStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HMIModificationmarksPackage.Literals.HMI_MODIFY_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setAffectedElement(T newAffectedElement) {
		super.setAffectedElement(newAffectedElement);
	}

} //HMIModifyStepImpl
