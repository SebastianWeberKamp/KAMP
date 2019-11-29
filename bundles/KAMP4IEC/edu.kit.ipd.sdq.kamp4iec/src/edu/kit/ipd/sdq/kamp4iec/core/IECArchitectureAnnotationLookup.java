package edu.kit.ipd.sdq.kamp4iec.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.kit.ipd.sdq.kamp.workplan.Activity;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECDeployer;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECDeveloper;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECMetadataFile;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECMetadataFileAggregation;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECPerson;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECRole;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECSourceFile;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECSourceFileAggregation;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECTestDeveloper;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECTester;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECUnitTestCase;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECUnitTestCaseAggregation;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.Configuration;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECComponent;

public class IECArchitectureAnnotationLookup {
	
	public static List<IECSourceFile> lookUpIECSourceFilesForComponent(IECArchitectureVersion version, 
			IECComponent component) {
		List<IECSourceFile> sourceFiles = new ArrayList<IECSourceFile>();
		
		if (version.getFieldOfActivityRepository() != null && version.getFieldOfActivityRepository().getDevelopmentArtefactSpecification() != null) {
			for (IECSourceFile sourceFile : version.getFieldOfActivityRepository().
					getDevelopmentArtefactSpecification().getSourceFiles()) {
				if (sourceFile.getComponent().getId().equals(component.getId())) {
					sourceFiles.add(sourceFile);
				}
			}
		}
		
		return sourceFiles;
	}

	public static IECSourceFileAggregation lookUpSourceFileAggregationForComponent(IECArchitectureVersion version, 
			IECComponent component) {
		if (version.getFieldOfActivityRepository() != null && version.getFieldOfActivityRepository().getDevelopmentArtefactSpecification() != null) {
			for (IECSourceFileAggregation sourceFileAggregation : version.getFieldOfActivityRepository().
					getDevelopmentArtefactSpecification().getSourceFileAggregations()) {
				if (sourceFileAggregation.getComponent().getId().equals(component.getId())) {
					return sourceFileAggregation;
				}
			}
		}
		
		return null;
	}
	
	public static List<IECMetadataFile> lookUpMetadataFilesForComponent(IECArchitectureVersion version, 
			IECComponent component) {
		List<IECMetadataFile> metadataFiles = new ArrayList<IECMetadataFile>();
		
		if (version.getFieldOfActivityRepository() != null && version.getFieldOfActivityRepository().getDevelopmentArtefactSpecification() != null) {
			for (IECMetadataFile metadataFile : version.getFieldOfActivityRepository().
					getDevelopmentArtefactSpecification().getMetadataFiles()) {
				if (metadataFile.getComponent().getId().equals(component.getId())) {
					metadataFiles.add(metadataFile);
				}
			}
		}
		
		return metadataFiles;
	}

	public static IECMetadataFileAggregation lookUpMetadataFileAggregationForComponent(IECArchitectureVersion version, 
			IECComponent component) {
		if (version.getFieldOfActivityRepository() != null && version.getFieldOfActivityRepository().getDevelopmentArtefactSpecification() != null) {
			for (IECMetadataFileAggregation metadataFileAggregation : version.getFieldOfActivityRepository().
					getDevelopmentArtefactSpecification().getMetadataFileAggregations()) {
				if (metadataFileAggregation.getComponent().getId().equals(component.getId())) {
					return metadataFileAggregation;
				}
			}
		}
		
		return null;
	}

	public static IECUnitTestCaseAggregation lookUpUnitTestAggregationForIECComponent(
			IECArchitectureVersion version, IECComponent component) {
		if (version.getFieldOfActivityRepository() != null && version.getFieldOfActivityRepository().getTestSpecification() != null) {
			for (IECUnitTestCaseAggregation testAggregation : version.getFieldOfActivityRepository().
					getTestSpecification().getUnitTestCaseAggregations()) {
				if (testAggregation.getComponent().getId().equals(component.getId())) {
					return testAggregation;
				}
			}
		}
		
		return null;
	}

	public static List<IECUnitTestCase> lookUpUnitTestCasesForIECComponent(
			IECArchitectureVersion version, IECComponent component) {
		List<IECUnitTestCase> testCases = new ArrayList<IECUnitTestCase>();
		
		if (version.getFieldOfActivityRepository() != null && version.getFieldOfActivityRepository().getTestSpecification() != null) {
			for (IECUnitTestCase testcase : version.getFieldOfActivityRepository().
					getTestSpecification().getUnitTestCases()) {
				if (testcase.getComponent().getId().equals(component.getId())) {
					testCases.add(testcase);
				}
			}
		}
		return testCases;
	}

	public static List<IECRole> lookUpResponsibleRolesForIECComponent(
			IECArchitectureVersion version, IECComponent component) {
		List<IECRole> roles = new ArrayList<IECRole>();
		if(version.getFieldOfActivityRepository() != null && version.getFieldOfActivityRepository().getStaffSpecification() != null 
				&& version.getFieldOfActivityRepository().getStaffSpecification().getRoleList() != null) {
			for(IECRole role : version.getFieldOfActivityRepository().getStaffSpecification().getRoleList().getRoles()) {
				if(role.getComponents().contains(component)) roles.add(role);
			}
		}
		return roles;
	}

	public static List<IECPerson> lookUpPersonsForRole(
			IECArchitectureVersion version, IECRole role) {
		List<IECPerson> persons = new ArrayList<IECPerson>();
		if(version.getFieldOfActivityRepository() != null && version.getFieldOfActivityRepository().getStaffSpecification() != null 
				&& version.getFieldOfActivityRepository().getStaffSpecification().getPersonList() != null) {
			for(IECPerson person : version.getFieldOfActivityRepository().getStaffSpecification().getPersonList().getPersons()) {
				if(person.getRoles().contains(role)) persons.add(person);
			}
		}
		return persons;
	}
	
	public static List<IECRole> filterRoles(List<IECRole> roles, IECRoleType type) {
		List<IECRole> rolesOfType = new ArrayList<IECRole>();
		switch (type) {
		case DEVELOPER:
			for(IECRole role : roles) {
				if(role instanceof IECDeveloper) rolesOfType.add(role);
			}
			break;
		case TESTDEVELOPER:
			for(IECRole role : roles) {
				if(role instanceof IECTestDeveloper) rolesOfType.add(role);
			}
			break;
		case DEPLOYER:
			for(IECRole role : roles) {
				if(role instanceof IECDeployer) rolesOfType.add(role);
			}
			break;
		case TESTER:
			for(IECRole role : roles) {
				if(role instanceof IECTester) rolesOfType.add(role);
			}
			break;
		default:
			break;
		}
		return rolesOfType;
	}

}
