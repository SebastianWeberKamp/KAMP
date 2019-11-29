package edu.kit.ipd.sdq.kamp4iec.core.derivation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import edu.kit.ipd.sdq.kamp.workplan.AbstractActivityElementType;
import edu.kit.ipd.sdq.kamp.workplan.AbstractActivityType;
import edu.kit.ipd.sdq.kamp.workplan.AbstractEnrichedWorkplanDerivation;
import edu.kit.ipd.sdq.kamp.workplan.Activity;
import edu.kit.ipd.sdq.kamp.workplan.BasicActivity;
import edu.kit.ipd.sdq.kamp4iec.core.IECActivityElementType;
import edu.kit.ipd.sdq.kamp4iec.core.IECActivityType;
import edu.kit.ipd.sdq.kamp4iec.core.IECArchitectureAnnotationLookup;
import edu.kit.ipd.sdq.kamp4iec.core.IECArchitectureVersion;
import edu.kit.ipd.sdq.kamp4iec.core.IECRoleType;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECMetadataFile;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECMetadataFileAggregation;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECPerson;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECRole;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECSourceFile;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECSourceFileAggregation;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECUnitTestCase;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECUnitTestCaseAggregation;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECComponent;

public class IECEnrichedWorkplanDerivation implements AbstractEnrichedWorkplanDerivation<IECArchitectureVersion> {
	
	@Override
	public List<Activity> deriveEnrichedWorkplan(IECArchitectureVersion baseArchitectureVersion, IECArchitectureVersion subVersion, 
			List<Activity> baseActivityList) {
		List<Activity> result = new ArrayList<Activity>(baseActivityList);
		
		deriveCodingActivities(baseArchitectureVersion, subVersion, result);
		deriveMetadataActivities(baseArchitectureVersion, subVersion, result);
		deriveUnitTestDevelopmentActivities(baseArchitectureVersion, subVersion, result);
		deriveUnitTestExecutionActivities(subVersion, result);
		deriveAcceptanceTestDevelopmentActivities(baseArchitectureVersion, subVersion, result);
		deriveAcceptanceTestExecutionActivities(subVersion, result);
		return result;
	}

	public static List<Activity> calculateFlattenendActivityList(List<Activity> activityList) {
		List<Activity> flatActivityList = new ArrayList<Activity>();
		
		for (Activity activity : activityList) {
			flatActivityList.add(activity);
			if (!activity.getSubActivities().isEmpty()) {
				flatActivityList.addAll(calculateFlattenendActivityList(activity.getSubActivities()));
			}
			if (!activity.getFollowupActivities().isEmpty()) {
				flatActivityList.addAll(calculateFlattenendActivityList(activity.getFollowupActivities()));
			}
		}
		
		return flatActivityList;
	}
	
	private static <T extends IECArchitectureVersion> T determineRelevantArchitectureVersion(
			Activity activity, T baseVersion, T targetVersion) {
		if (activity.getBasicActivity() == BasicActivity.REMOVE) {
			return baseVersion;
		} else {
			return targetVersion;
		}
	}

	private static void deriveCodingActivities(IECArchitectureVersion baseVersion, 
			IECArchitectureVersion targetVersion, List<Activity> baseActivityList) {
		for (Activity activity : baseActivityList) {
			int numberOfFiles = determineNumberOfSourceFiles(determineRelevantArchitectureVersion(
					activity, baseVersion, targetVersion), activity);
			if (typeEquals(activity.getElementType(), IECActivityElementType.getTopLevelArchitectureActivityElementTypes()) && numberOfFiles > 0) {
				Activity newActivity = new Activity(IECActivityType.IMPLEMENTATION_SOURCECODE, 
						IECActivityElementType.SOURCECODEFILES, activity.getElement(),
						numberOfFiles + " source file(s)", null, activity.getBasicActivity(),
						"Source code implementation: " + activity.getBasicActivity().getName() + 
						" source file(s) (" + numberOfFiles + " files) of component " + 
						activity.getElementName() + ".");
				activity.addFollowupActivity(newActivity);
				deriveStaffActivity(determineRelevantArchitectureVersion(newActivity, baseVersion, targetVersion), newActivity, IECRoleType.DEVELOPER);
			} 
			deriveCodingActivities(baseVersion, targetVersion, activity.getSubActivities());
		}
	}
	
	private static boolean typeEquals(AbstractActivityElementType type, AbstractActivityElementType... types) {
		for(AbstractActivityElementType t : types) {
			if (t == type) return true;
		}
		return false;
	}

	private static int determineNumberOfSourceFiles(IECArchitectureVersion version, 
			Activity activity) {
		int numberOfIECSourceFiles = 0;
		if (activity.getElement() instanceof IECComponent) {
			IECComponent component = (IECComponent)activity.getElement();
			List<IECSourceFile> sourceFiles = IECArchitectureAnnotationLookup.
					lookUpIECSourceFilesForComponent(version, component);
			numberOfIECSourceFiles += sourceFiles.size();
			IECSourceFileAggregation sourceFileAggregation = IECArchitectureAnnotationLookup.
					lookUpSourceFileAggregationForComponent(version, component);
			if (sourceFileAggregation != null)
				numberOfIECSourceFiles += sourceFileAggregation.getNumberOfFiles(); 
		}
		return numberOfIECSourceFiles;
	}

	private static void deriveMetadataActivities(IECArchitectureVersion baseVersion, 
			IECArchitectureVersion targetVersion, List<Activity> baseActivityList) {
		for (Activity activity : baseActivityList) {
			int numberOfFiles = determineNumberOfMetadataFiles(determineRelevantArchitectureVersion(
					activity, baseVersion, targetVersion), activity);
			if (typeEquals(activity.getElementType(), IECActivityElementType.getTopLevelArchitectureActivityElementTypes()) && numberOfFiles > 0) {
				Activity newActivity = new Activity(IECActivityType.IMPLEMENTATION_METADATA, 
						IECActivityElementType.METADATAFILES, activity.getElement(),
						numberOfFiles + " meta data file(s)", null, activity.getBasicActivity(), 
						"Meta data implementation: " + activity.getBasicActivity().getName() + 
						" meta data file(s) (" + numberOfFiles + " files) of component " + 
						activity.getElementName() + ".");
				activity.addFollowupActivity(newActivity);
				deriveStaffActivity(determineRelevantArchitectureVersion(newActivity, baseVersion, targetVersion), newActivity, IECRoleType.DEVELOPER);
			} 
			deriveMetadataActivities(baseVersion, targetVersion, activity.getSubActivities());
		}
	}

	private static int determineNumberOfMetadataFiles(IECArchitectureVersion version, 
			Activity activity) {
		int numberOfIECMetadataFiles = 0;
		if (activity.getElement() instanceof IECComponent) {
			IECComponent component = (IECComponent)activity.getElement();
			List<IECMetadataFile> metadataFiles = IECArchitectureAnnotationLookup.
					lookUpMetadataFilesForComponent(version, component);
			numberOfIECMetadataFiles += metadataFiles.size();
			IECMetadataFileAggregation metadataFileAggregation = IECArchitectureAnnotationLookup.
					lookUpMetadataFileAggregationForComponent(version, component);
			if (metadataFileAggregation!=null)
				numberOfIECMetadataFiles += metadataFileAggregation.getNumberOfFiles(); 
		}
		return numberOfIECMetadataFiles;
	}

	private static void deriveUnitTestDevelopmentActivities(IECArchitectureVersion baseVersion, 
			IECArchitectureVersion targetVersion, List<Activity> baseActivityList) {	
		for (Activity activity : baseActivityList) {
			if (typeEquals(activity.getElementType(), IECActivityElementType.getUnitTestedlArchitectureActivityElementTypes()) && 
					activity.getBasicActivity() == BasicActivity.ADD) {
				Activity newActivity = new Activity(IECActivityType.TESTDEVELOPMENT, 
						IECActivityElementType.TESTCASE, activity.getElement(),
						"", null, BasicActivity.ADD, 
						"Test development: Develop unit tests for component.");
				activity.addFollowupActivity(newActivity);
				deriveStaffActivity(determineRelevantArchitectureVersion(newActivity, baseVersion, targetVersion), newActivity, IECRoleType.TESTDEVELOPER);
			} else if (typeEquals(activity.getElementType(), IECActivityElementType.getUnitTestedlArchitectureActivityElementTypes()) && 
					activity.getBasicActivity() == BasicActivity.REMOVE) {
				int numberOfUnitTests = numberOfAvailableUnitTests(baseVersion, activity);
				if (numberOfUnitTests > 0) {
					Activity newActivity = new Activity(IECActivityType.TESTDEVELOPMENT, 
							IECActivityElementType.TESTCASE, activity.getElement(),
							numberOfUnitTests + " test(s)", null, BasicActivity.REMOVE, 
							"Test development: Remove unit tests for component.");
					activity.addFollowupActivity(newActivity);
					deriveStaffActivity(determineRelevantArchitectureVersion(newActivity, baseVersion, targetVersion), newActivity, IECRoleType.TESTDEVELOPER);
				}
			} else if (typeEquals(activity.getElementType(), IECActivityElementType.getUnitTestedlArchitectureActivityElementTypes()) && 
					activity.getBasicActivity() == BasicActivity.MODIFY) {
				int numberOfUnitTests = numberOfAvailableUnitTests(targetVersion, activity);
				if (numberOfUnitTests > 0) {
					Activity newActivity = new Activity(IECActivityType.TESTUPDATE, 
							IECActivityElementType.TESTCASE, activity.getElement(),
							numberOfUnitTests + " test(s)", null, BasicActivity.CHECKANDUPDATE, 
							"Test development: Check and update unit tests for component.");
					activity.addFollowupActivity(newActivity);
					deriveStaffActivity(determineRelevantArchitectureVersion(newActivity, baseVersion, targetVersion), newActivity, IECRoleType.TESTDEVELOPER);
				}
			}
			deriveUnitTestDevelopmentActivities(baseVersion, targetVersion, activity.getSubActivities());
		}
	}

	private static void deriveAcceptanceTestDevelopmentActivities(IECArchitectureVersion baseVersion, 
			IECArchitectureVersion targetVersion, List<Activity> baseActivityList) {	
		for (Activity activity : baseActivityList) {
			if (typeEquals(activity.getElementType(), IECActivityElementType.getAcceptanceTestedlArchitectureActivityElementTypes()) && 
					activity.getBasicActivity() == BasicActivity.ADD) {
				Activity newActivity = new Activity(IECActivityType.TESTDEVELOPMENT, 
						IECActivityElementType.TESTCASE, activity.getElement(),
						"", null, BasicActivity.ADD, 
						"Test development: Develop acceptance tests for component.");
				activity.addFollowupActivity(newActivity);
				deriveStaffActivity(determineRelevantArchitectureVersion(newActivity, baseVersion, targetVersion), newActivity, IECRoleType.TESTDEVELOPER);
			} else if (typeEquals(activity.getElementType(), IECActivityElementType.getAcceptanceTestedlArchitectureActivityElementTypes()) && 
					activity.getBasicActivity() == BasicActivity.REMOVE) {
				int numberOfUnitTests = numberOfAvailableUnitTests(baseVersion, activity);
				if (numberOfUnitTests > 0) {
					Activity newActivity = new Activity(IECActivityType.TESTDEVELOPMENT, 
							IECActivityElementType.TESTCASE, activity.getElement(),
							numberOfUnitTests + " test(s)", null, BasicActivity.REMOVE, 
							"Test development: Remove acceptance tests for component.");
					activity.addFollowupActivity(newActivity);
					deriveStaffActivity(determineRelevantArchitectureVersion(newActivity, baseVersion, targetVersion), newActivity, IECRoleType.TESTDEVELOPER);
				}
			} else if (typeEquals(activity.getElementType(), IECActivityElementType.getAcceptanceTestedlArchitectureActivityElementTypes()) && 
					activity.getBasicActivity() == BasicActivity.MODIFY) {
				int numberOfUnitTests = numberOfAvailableUnitTests(targetVersion, activity);
				if (numberOfUnitTests > 0) {
					Activity newActivity = new Activity(IECActivityType.TESTUPDATE, 
							IECActivityElementType.TESTCASE, activity.getElement(),
							numberOfUnitTests + " test(s)", null, BasicActivity.CHECKANDUPDATE, 
							"Test development: Check and update acceptance tests for component.");
					activity.addFollowupActivity(newActivity);
					deriveStaffActivity(determineRelevantArchitectureVersion(newActivity, baseVersion, targetVersion), newActivity, IECRoleType.TESTDEVELOPER);
				}
			}
			deriveUnitTestDevelopmentActivities(baseVersion, targetVersion, activity.getSubActivities());
		}
	}

	private static int numberOfAvailableUnitTests(IECArchitectureVersion version,
			Activity activity) {
		int numberOfTests = 0;
		if (activity.getElement() instanceof IECComponent) {
			IECUnitTestCaseAggregation testAggregation = IECArchitectureAnnotationLookup.
					lookUpUnitTestAggregationForIECComponent(version, (IECComponent)activity.getElement());
			List<IECUnitTestCase> testCases = IECArchitectureAnnotationLookup.
					lookUpUnitTestCasesForIECComponent(version, (IECComponent)activity.getElement());
			if (testAggregation!=null)
				numberOfTests += testAggregation.getNumberOfTestcases();
			numberOfTests += testCases.size();
		}
		return numberOfTests;
	}
	
	private static void deriveUnitTestExecutionActivities(IECArchitectureVersion target,
			List<Activity> baseActivityList) {
		
		for (Activity activity : baseActivityList) {
			if (typeEquals(activity.getElementType(), IECActivityElementType.getUnitTestedlArchitectureActivityElementTypes()) && 
					activity.getBasicActivity()==BasicActivity.ADD) {
				Activity newActivity = new Activity(IECActivityType.TESTEXECUTION, 
						IECActivityElementType.TESTCASE, activity.getElement(),
						"New test cases", null, BasicActivity.EXECUTE, 
						"Test execution (unit tests): Execute test cases.");
				activity.addFollowupActivity(newActivity);
				deriveStaffActivity(target, newActivity, IECRoleType.TESTER);
			} else if (typeEquals(activity.getElementType(), IECActivityElementType.getUnitTestedlArchitectureActivityElementTypes()) && 
					activity.getBasicActivity()==BasicActivity.MODIFY) {
				int numberOfUnitTests = numberOfAvailableUnitTests(target, activity);
				Activity newActivity = new Activity(IECActivityType.TESTEXECUTION, 
						IECActivityElementType.TESTCASE, activity.getElement(),
						numberOfUnitTests + " test(s)", null, BasicActivity.EXECUTE,
						"Test execution (unit tests): Execute test cases.");
				if (numberOfUnitTests>0) {
					activity.addFollowupActivity(newActivity);
					deriveStaffActivity(target, newActivity, IECRoleType.TESTER);
				}
			}
			deriveUnitTestExecutionActivities(target, activity.getSubActivities());
		}
	}
	
	private static void deriveAcceptanceTestExecutionActivities(IECArchitectureVersion target,
			List<Activity> baseActivityList) {
		
		for (Activity activity : baseActivityList) {
			if (typeEquals(activity.getElementType(), IECActivityElementType.getAcceptanceTestedlArchitectureActivityElementTypes()) && 
					activity.getBasicActivity()==BasicActivity.ADD) {
				Activity newActivity = new Activity(IECActivityType.TESTEXECUTION, 
						IECActivityElementType.TESTCASE, activity.getElement(),
						"New test cases", null, BasicActivity.EXECUTE, 
						"Test execution (acceptance tests): Execute test cases.");
				activity.addFollowupActivity(newActivity);
				deriveStaffActivity(target, newActivity, IECRoleType.TESTER);
			} else if (typeEquals(activity.getElementType(), IECActivityElementType.getAcceptanceTestedlArchitectureActivityElementTypes()) && 
					activity.getBasicActivity()==BasicActivity.MODIFY) {
				int numberOfUnitTests = numberOfAvailableUnitTests(target, activity);
				Activity newActivity = new Activity(IECActivityType.TESTEXECUTION, 
						IECActivityElementType.TESTCASE, activity.getElement(),
						numberOfUnitTests + " test(s)", null, BasicActivity.EXECUTE,
						"Test execution (acceptance tests): Execute test cases.");
				if (numberOfUnitTests>0) {
					activity.addFollowupActivity(newActivity);
					deriveStaffActivity(target, newActivity, IECRoleType.TESTER);
				}
			}
			deriveUnitTestExecutionActivities(target, activity.getSubActivities());
		}
	}
	
	private static void deriveStaffActivity(IECArchitectureVersion version, Activity activity, IECRoleType type) {
		if(activity.getElement() instanceof IECComponent) {
			IECComponent component = (IECComponent) activity.getElement();
			List<IECRole> reponsibleRoles = IECArchitectureAnnotationLookup.lookUpResponsibleRolesForIECComponent(version, component);
			reponsibleRoles = IECArchitectureAnnotationLookup.filterRoles(reponsibleRoles, type);
			List<IECPerson> reponsiblePersons = new ArrayList<>();
			for(IECRole responsibleRole : reponsibleRoles) {
				reponsiblePersons.addAll(IECArchitectureAnnotationLookup.lookUpPersonsForRole(version, responsibleRole));
			}
			for(IECPerson responsiblePerson : reponsiblePersons) {
				activity.addFollowupActivity(new Activity(IECActivityType.STAFFRESPONSIBILITY, 
						IECActivityElementType.PERSON, activity.getElement(), 
						activity.getElementName(), null, activity.getBasicActivity(), responsiblePerson.getName() + " is responsible for this task."));
			}
		}
	}
}