package edu.kit.ipd.sdq.kamp4aps.core.scenarios;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup;
import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps.core.changepropagation.ModuleChanges;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyComponent;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyInterface;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyModule;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MicroswitchModule;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module;

public class MicroSwitchModuleChange extends ModuleChanges {

	private Collection<MicroswitchModule> initialMarkedMicroswitches;
	private Map<Module, Set<Module>> modulesToBeMarked;
	private Map<Module, Set<Component>> componentsToBeMarked;
	private Map<Module, Set<Interface>> interfacesToBeMarked;

	public MicroSwitchModuleChange(APSArchitectureVersion v) {
		super(v);
		initialMarkedMicroswitches = APSArchitectureModelLookup.lookUpMarkedObjectsOfAType(version,
				MicroswitchModule.class);
		modulesToBeMarked = new HashMap<Module, Set<Module>>();
		componentsToBeMarked = new HashMap<Module, Set<Component>>();
		interfacesToBeMarked = new HashMap<Module, Set<Interface>>();
	}
	
	public void calculateAndMarkAffectedModulesByMicroSwitchModuleChange(ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange){
		List<ModifyModule<Module>> modifyModules = null;
		int mapHash;
		do {
			mapHash = modulesToBeMarked.hashCode();
			modulesToBeMarked = APSArchitectureModelLookup.lookUpModulesOfModules(initialMarkedMicroswitches, changePropagationDueToHardwareChange);
			modifyModules = createModifyModulesFromAffectedModules(modulesToBeMarked);
			addToModifyModulesToChangePropagation(modifyModules, changePropagationDueToHardwareChange);
		} while(mapHash != modulesToBeMarked.hashCode());
	}
	
	public void calculateAndMarkAffectedComponentsByMicroSwitchModuleChange(ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange){
		List<ModifyComponent<Component>> modifyComponents = null;
		int mapHash;
		do {
			mapHash = componentsToBeMarked.hashCode();
			componentsToBeMarked = APSArchitectureModelLookup.lookUpComponentsOfModules(initialMarkedMicroswitches, changePropagationDueToHardwareChange);
			modifyComponents = createModifyComponentFromAffectedComponents(componentsToBeMarked);
			addToModifyComponentsToChangePropagation(modifyComponents, changePropagationDueToHardwareChange);
		} while(mapHash != componentsToBeMarked.hashCode());
	}
	
	public void calculateAndMarkAffectedInterfacesByMicroSwitchModuleChange(ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange){
 		List<ModifyInterface<Interface>> modifyInterfaces = null;
		int mapHash;
		do {
			mapHash = interfacesToBeMarked.hashCode();
			interfacesToBeMarked = APSArchitectureModelLookup.lookUpInterfacesOfModules(initialMarkedMicroswitches, changePropagationDueToHardwareChange);
			modifyInterfaces = createModifyInterfaceFromAffectedInterfaces(interfacesToBeMarked);
			addToModifyInterfacesToChangePropagation(modifyInterfaces, changePropagationDueToHardwareChange);
		} while(mapHash != interfacesToBeMarked.hashCode());
	}

}
