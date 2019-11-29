/**
 */
package edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.tests;

import edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Kamp4hmiModelFactory;
import edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.SystemStep;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>System Step</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemStepTest extends HMIElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SystemStepTest.class);
	}

	/**
	 * Constructs a new System Step test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemStepTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this System Step test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SystemStep getFixture() {
		return (SystemStep)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Kamp4hmiModelFactory.eINSTANCE.createSystemStep());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //SystemStepTest
