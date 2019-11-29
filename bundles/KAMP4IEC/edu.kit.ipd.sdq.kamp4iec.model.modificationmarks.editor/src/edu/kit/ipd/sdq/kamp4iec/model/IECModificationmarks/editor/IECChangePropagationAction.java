package edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.editor;

import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.editor.AbstractChangePropagationAction;
import edu.kit.ipd.sdq.kamp.propagation.AbstractChangePropagationAnalysis;
import edu.kit.ipd.sdq.kamp4iec.core.IECArchitectureVersion;
import edu.kit.ipd.sdq.kamp4iec.core.IECArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp4iec.core.IECChangePropagationAnalysis;

public class IECChangePropagationAction extends AbstractChangePropagationAction<IECArchitectureVersion> {

	@Override
	protected AbstractChangePropagationAnalysis<IECArchitectureVersion> createChangePropagationAnalysis() {
		return new IECChangePropagationAnalysis();
	}

	@Override
	protected AbstractArchitectureVersionPersistency<IECArchitectureVersion> createArchitectureVersionPersistency() {
		return new IECArchitectureVersionPersistency();
	}

}
