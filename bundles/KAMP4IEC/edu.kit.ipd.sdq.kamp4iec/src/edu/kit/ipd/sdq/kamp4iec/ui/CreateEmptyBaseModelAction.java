package edu.kit.ipd.sdq.kamp4iec.ui;

import edu.kit.ipd.sdq.kamp.ui.AbstractCreateEmptyBaseModelAction;
import edu.kit.ipd.sdq.kamp4iec.core.IECArchitectureModelFactoryFacade;
import edu.kit.ipd.sdq.kamp4iec.core.IECArchitectureVersion;
import edu.kit.ipd.sdq.kamp4iec.core.IECArchitectureVersionPersistency;

public class CreateEmptyBaseModelAction  extends AbstractCreateEmptyBaseModelAction<IECArchitectureVersion> {
	
	public CreateEmptyBaseModelAction() {
		this.setArchitectureVersionPersistency(new IECArchitectureVersionPersistency());
	}
	
	@Override
	protected IECArchitectureVersion createArchitectureVersion() {
		return IECArchitectureModelFactoryFacade.createEmptyModel("architecturemodel");
	}

}

