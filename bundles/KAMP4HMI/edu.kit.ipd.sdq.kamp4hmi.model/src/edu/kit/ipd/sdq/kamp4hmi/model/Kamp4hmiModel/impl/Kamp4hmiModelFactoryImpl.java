/**
 */
package edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.impl;

import edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Kamp4hmiModelFactoryImpl extends EFactoryImpl implements Kamp4hmiModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Kamp4hmiModelFactory init() {
		try {
			Kamp4hmiModelFactory theKamp4hmiModelFactory = (Kamp4hmiModelFactory)EPackage.Registry.INSTANCE.getEFactory(Kamp4hmiModelPackage.eNS_URI);
			if (theKamp4hmiModelFactory != null) {
				return theKamp4hmiModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Kamp4hmiModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kamp4hmiModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Kamp4hmiModelPackage.ACTOR_STEP: return createActorStep();
			case Kamp4hmiModelPackage.SYSTEM_STEP: return createSystemStep();
			case Kamp4hmiModelPackage.MODE: return createMode();
			case Kamp4hmiModelPackage.REPOSITORY: return createRepository();
			case Kamp4hmiModelPackage.IF: return createIf();
			case Kamp4hmiModelPackage.FOR: return createFor();
			case Kamp4hmiModelPackage.CONDITION: return createCondition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorStep createActorStep() {
		ActorStepImpl actorStep = new ActorStepImpl();
		return actorStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemStep createSystemStep() {
		SystemStepImpl systemStep = new SystemStepImpl();
		return systemStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode createMode() {
		ModeImpl mode = new ModeImpl();
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository createRepository() {
		RepositoryImpl repository = new RepositoryImpl();
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public If createIf() {
		IfImpl if_ = new IfImpl();
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public For createFor() {
		ForImpl for_ = new ForImpl();
		return for_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kamp4hmiModelPackage getKamp4hmiModelPackage() {
		return (Kamp4hmiModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Kamp4hmiModelPackage getPackage() {
		return Kamp4hmiModelPackage.eINSTANCE;
	}

} //Kamp4hmiModelFactoryImpl
