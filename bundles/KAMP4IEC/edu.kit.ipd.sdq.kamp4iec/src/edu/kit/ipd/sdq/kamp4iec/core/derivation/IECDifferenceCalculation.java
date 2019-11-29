package edu.kit.ipd.sdq.kamp4iec.core.derivation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.ReferenceChange;

import edu.kit.ipd.sdq.kamp.derivation.AbstractDifferenceCalculation;
import edu.kit.ipd.sdq.kamp.workplan.Activity;
import edu.kit.ipd.sdq.kamp.workplan.BasicActivity;
import edu.kit.ipd.sdq.kamp4iec.core.IECArchitectureVersion;
import edu.kit.ipd.sdq.kamp4iec.core.IECActivityElementType;
import edu.kit.ipd.sdq.kamp4iec.core.IECActivityType;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECComponent;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Identifier;

public class IECDifferenceCalculation extends AbstractDifferenceCalculation<IECArchitectureVersion>{

	private final IECInternalModificationDerivation architectureInternalModificationDerivation = new IECInternalModificationDerivation();
	private final IECSubactivityDerivation architectureSubactivityDerivation = new IECSubactivityDerivation();
	private IECArchitectureVersion version;

	@Override
	public List<Activity> deriveWorkplan(IECArchitectureVersion baseVersion, IECArchitectureVersion targetVersion) {
		this.version = targetVersion;
		List<Activity> activityList = new ArrayList<Activity>();
		
		List<Diff> konfigurationDiff = calculateDiffModel(baseVersion.getConfiguration(), targetVersion.getConfiguration());
		List<Diff> repoDiff = calculateDiffModel(baseVersion.getIECRepository(), targetVersion.getIECRepository());		
		
		activityList.addAll(deriveAddAndRemoveActivities(konfigurationDiff));
		activityList.addAll(deriveAddAndRemoveActivities(repoDiff));
		
		List<Activity> internalModificationActivities = this.architectureInternalModificationDerivation.deriveInternalModifications(targetVersion);
		activityList.addAll(internalModificationActivities);

		return activityList;
	}

	public static String createAddElementDescription(Identifier element) {
		return "Add " + element.eClass().getName() + " " + element.getId() + ".";
	}

	public static String createRemoveElementDescription(Identifier element) {
		return "Remove " + element.eClass().getName() + " " + element.getId() + ".";
	}
	
	@Override
	public void checkForDifferencesAndAddToWorkplan(Diff diffElement, List<Activity> workplan) {
		for (IECActivityElementType elementType: IECActivityElementType.getTopLevelArchitectureActivityElementTypes()) {
			if (detectionRuleAdded(diffElement, elementType.getElementClass())) {
				Identifier architectureElement = (Identifier) (((ReferenceChange) diffElement).getValue());
				Activity newActivity = new Activity(IECActivityType.ARCHITECTUREMODELDIFF, elementType, architectureElement,
						architectureElement.getName(), null, BasicActivity.ADD,
						createAddElementDescription(architectureElement));
				workplan.add(newActivity);
				this.architectureSubactivityDerivation.deriveSubactivities(architectureElement, newActivity, version);
				return;
			} else if (detectionRuleDeleted(diffElement, elementType.getElementClass())) {
				Identifier architectureElement = (Identifier) (((ReferenceChange) diffElement).getValue());
				Activity newActivity = new Activity(IECActivityType.ARCHITECTUREMODELDIFF, elementType, architectureElement,
						architectureElement.getName(), null, BasicActivity.REMOVE,
						createRemoveElementDescription(architectureElement));
				workplan.add(newActivity);
				this.architectureSubactivityDerivation.deriveSubactivities(architectureElement, newActivity, version);
				return;
			}
		}
	}

	public static String createAddComponentDescription(Identifier element) {
		return "Add " + element.eClass().getName() + " " + element.getId() + ".";
	}

	public static String createRemoveComponentDescription(Identifier element) {
		return "Remove " + element.eClass().getName() + " " + element.getId() + ".";
	}
	
	@Override
	public List<Activity> deriveAddAndRemoveActivities(List<Diff> diff) {
		return super.deriveAddAndRemoveActivities(diff);
	}

	public IECInternalModificationDerivation getArchitectureInternalModificationDerivation() {
		return architectureInternalModificationDerivation;
	}

}
