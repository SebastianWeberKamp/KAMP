/**
 */
package edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl;

import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECDevelopmentArtefactSpecification;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsPackage;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsRepository;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECMetadataFile;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECMetadataFileAggregation;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECSourceFile;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECSourceFileAggregation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IEC Development Artefact Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECDevelopmentArtefactSpecificationImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECDevelopmentArtefactSpecificationImpl#getSourceFiles <em>Source Files</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECDevelopmentArtefactSpecificationImpl#getSourceFileAggregations <em>Source File Aggregations</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECDevelopmentArtefactSpecificationImpl#getMetadataFiles <em>Metadata Files</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.impl.IECDevelopmentArtefactSpecificationImpl#getMetadataFileAggregations <em>Metadata File Aggregations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IECDevelopmentArtefactSpecificationImpl extends MinimalEObjectImpl.Container implements IECDevelopmentArtefactSpecification {
	/**
	 * The cached value of the '{@link #getSourceFiles() <em>Source Files</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<IECSourceFile> sourceFiles;

	/**
	 * The cached value of the '{@link #getSourceFileAggregations() <em>Source File Aggregations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceFileAggregations()
	 * @generated
	 * @ordered
	 */
	protected EList<IECSourceFileAggregation> sourceFileAggregations;

	/**
	 * The cached value of the '{@link #getMetadataFiles() <em>Metadata Files</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadataFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<IECMetadataFile> metadataFiles;

	/**
	 * The cached value of the '{@link #getMetadataFileAggregations() <em>Metadata File Aggregations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadataFileAggregations()
	 * @generated
	 * @ordered
	 */
	protected EList<IECMetadataFileAggregation> metadataFileAggregations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IECDevelopmentArtefactSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IECFieldOfActivityAnnotationsPackage.Literals.IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECFieldOfActivityAnnotationsRepository getParent() {
		if (eContainerFeatureID() != IECFieldOfActivityAnnotationsPackage.IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__PARENT) return null;
		return (IECFieldOfActivityAnnotationsRepository)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(IECFieldOfActivityAnnotationsRepository newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, IECFieldOfActivityAnnotationsPackage.IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(IECFieldOfActivityAnnotationsRepository newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != IECFieldOfActivityAnnotationsPackage.IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, IECFieldOfActivityAnnotationsPackage.IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEVELOPMENT_ARTEFACT_SPECIFICATION, IECFieldOfActivityAnnotationsRepository.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IECFieldOfActivityAnnotationsPackage.IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECSourceFile> getSourceFiles() {
		if (sourceFiles == null) {
			sourceFiles = new EObjectContainmentWithInverseEList<IECSourceFile>(IECSourceFile.class, this, IECFieldOfActivityAnnotationsPackage.IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILES, IECFieldOfActivityAnnotationsPackage.IEC_SOURCE_FILE__PARENT);
		}
		return sourceFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECSourceFileAggregation> getSourceFileAggregations() {
		if (sourceFileAggregations == null) {
			sourceFileAggregations = new EObjectContainmentWithInverseEList<IECSourceFileAggregation>(IECSourceFileAggregation.class, this, IECFieldOfActivityAnnotationsPackage.IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILE_AGGREGATIONS, IECFieldOfActivityAnnotationsPackage.IEC_SOURCE_FILE_AGGREGATION__PARENT);
		}
		return sourceFileAggregations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECMetadataFile> getMetadataFiles() {
		if (metadataFiles == null) {
			metadataFiles = new EObjectContainmentWithInverseEList<IECMetadataFile>(IECMetadataFile.class, this, IECFieldOfActivityAnnotationsPackage.IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILES, IECFieldOfActivityAnnotationsPackage.IEC_METADATA_FILE__PARENT);
		}
		return metadataFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECMetadataFileAggregation> getMetadataFileAggregations() {
		if (metadataFileAggregations == null) {
			metadataFileAggregations = new EObjectContainmentWithInverseEList<IECMetadataFileAggregation>(IECMetadataFileAggregation.class, this, IECFieldOfActivityAnnotationsPackage.IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILE_AGGREGATIONS, IECFieldOfActivityAnnotationsPackage.IEC_METADATA_FILE_AGGREGATION__PARENT);
		}
		return metadataFileAggregations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IECFieldOfActivityAnnotationsPackage.IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((IECFieldOfActivityAnnotationsRepository)otherEnd, msgs);
			case IECFieldOfActivityAnnotationsPackage.IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSourceFiles()).basicAdd(otherEnd, msgs);
			case IECFieldOfActivityAnnotationsPackage.IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILE_AGGREGATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSourceFileAggregations()).basicAdd(otherEnd, msgs);
			case IECFieldOfActivityAnnotationsPackage.IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMetadataFiles()).basicAdd(otherEnd, msgs);
			case IECFieldOfActivityAnnotationsPackage.IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILE_AGGREGATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMetadataFileAggregations()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IECFieldOfActivityAnnotationsPackage.IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__PARENT:
				return basicSetParent(null, msgs);
			case IECFieldOfActivityAnnotationsPackage.IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILES:
				return ((InternalEList<?>)getSourceFiles()).basicRemove(otherEnd, msgs);
			case IECFieldOfActivityAnnotationsPackage.IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILE_AGGREGATIONS:
				return ((InternalEList<?>)getSourceFileAggregations()).basicRemove(otherEnd, msgs);
			case IECFieldOfActivityAnnotationsPackage.IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILES:
				return ((InternalEList<?>)getMetadataFiles()).basicRemove(otherEnd, msgs);
			case IECFieldOfActivityAnnotationsPackage.IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILE_AGGREGATIONS:
				return ((InternalEList<?>)getMetadataFileAggregations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case IECFieldOfActivityAnnotationsPackage.IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__PARENT:
				return eInternalContainer().eInverseRemove(this, IECFieldOfActivityAnnotationsPackage.IEC_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEVELOPMENT_ARTEFACT_SPECIFICATION, IECFieldOfActivityAnnotationsRepository.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IECFieldOfActivityAnnotationsPackage.IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__PARENT:
				return getParent();
			case IECFieldOfActivityAnnotationsPackage.IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILES:
				return getSourceFiles();
			case IECFieldOfActivityAnnotationsPackage.IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILE_AGGREGATIONS:
				return getSourceFileAggregations();
			case IECFieldOfActivityAnnotationsPackage.IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILES:
				return getMetadataFiles();
			case IECFieldOfActivityAnnotationsPackage.IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILE_AGGREGATIONS:
				return getMetadataFileAggregations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IECFieldOfActivityAnnotationsPackage.IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__PARENT:
				setParent((IECFieldOfActivityAnnotationsRepository)newValue);
				return;
			case IECFieldOfActivityAnnotationsPackage.IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILES:
				getSourceFiles().clear();
				getSourceFiles().addAll((Collection<? extends IECSourceFile>)newValue);
				return;
			case IECFieldOfActivityAnnotationsPackage.IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILE_AGGREGATIONS:
				getSourceFileAggregations().clear();
				getSourceFileAggregations().addAll((Collection<? extends IECSourceFileAggregation>)newValue);
				return;
			case IECFieldOfActivityAnnotationsPackage.IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILES:
				getMetadataFiles().clear();
				getMetadataFiles().addAll((Collection<? extends IECMetadataFile>)newValue);
				return;
			case IECFieldOfActivityAnnotationsPackage.IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILE_AGGREGATIONS:
				getMetadataFileAggregations().clear();
				getMetadataFileAggregations().addAll((Collection<? extends IECMetadataFileAggregation>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IECFieldOfActivityAnnotationsPackage.IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__PARENT:
				setParent((IECFieldOfActivityAnnotationsRepository)null);
				return;
			case IECFieldOfActivityAnnotationsPackage.IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILES:
				getSourceFiles().clear();
				return;
			case IECFieldOfActivityAnnotationsPackage.IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILE_AGGREGATIONS:
				getSourceFileAggregations().clear();
				return;
			case IECFieldOfActivityAnnotationsPackage.IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILES:
				getMetadataFiles().clear();
				return;
			case IECFieldOfActivityAnnotationsPackage.IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILE_AGGREGATIONS:
				getMetadataFileAggregations().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IECFieldOfActivityAnnotationsPackage.IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__PARENT:
				return getParent() != null;
			case IECFieldOfActivityAnnotationsPackage.IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILES:
				return sourceFiles != null && !sourceFiles.isEmpty();
			case IECFieldOfActivityAnnotationsPackage.IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__SOURCE_FILE_AGGREGATIONS:
				return sourceFileAggregations != null && !sourceFileAggregations.isEmpty();
			case IECFieldOfActivityAnnotationsPackage.IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILES:
				return metadataFiles != null && !metadataFiles.isEmpty();
			case IECFieldOfActivityAnnotationsPackage.IEC_DEVELOPMENT_ARTEFACT_SPECIFICATION__METADATA_FILE_AGGREGATIONS:
				return metadataFileAggregations != null && !metadataFileAggregations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IECDevelopmentArtefactSpecificationImpl
