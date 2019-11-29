package edu.kit.ipd.sdq.kamp4iec.ui;

import edu.kit.ipd.sdq.kamp.ui.AbstractDeriveWorkplanAction;
import edu.kit.ipd.sdq.kamp4iec.core.IECArchitectureVersion;
import edu.kit.ipd.sdq.kamp4iec.core.IECArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp4iec.core.derivation.IECDifferenceCalculation;
import edu.kit.ipd.sdq.kamp4iec.core.derivation.IECEnrichedWorkplanDerivation;

public class DeriveWorkplanAction extends AbstractDeriveWorkplanAction<IECArchitectureVersion> {

	public DeriveWorkplanAction() {
		this.setWorkplanDerivation(new IECDifferenceCalculation());
		this.setEnrichedWorkplanDerivation(new IECEnrichedWorkplanDerivation());
		this.setArchitectureVersionPersistency(new IECArchitectureVersionPersistency());
	}

}
