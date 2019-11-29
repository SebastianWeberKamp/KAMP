package edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.editor;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.editor.AbstractArchitectureBasedWorkplanDerivationAction;
import edu.kit.ipd.sdq.kamp4iec.core.IECArchitectureVersion;
import edu.kit.ipd.sdq.kamp4iec.core.IECArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp4iec.core.derivation.IECDifferenceCalculation;
import edu.kit.ipd.sdq.kamp4iec.core.derivation.IECEnrichedWorkplanDerivation;

public class IECArchitectureBasedWorkplanDerivationAction extends AbstractArchitectureBasedWorkplanDerivationAction<IECArchitectureVersion> {
	
	public IECArchitectureBasedWorkplanDerivationAction() {
		this.setWorkplanDerivation(new IECDifferenceCalculation());
		this.setEnrichedWorkplanDerivation(new IECEnrichedWorkplanDerivation());
		this.setArchitectureVersionPersistency(new IECArchitectureVersionPersistency());
	}

}

