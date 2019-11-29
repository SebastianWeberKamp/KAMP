package edu.kit.ipd.sdq.kamp4iec.core;

import edu.kit.ipd.sdq.kamp4iec.core.IECArchitectureVersion.ArchitectureVersionParams;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModificationRepository;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECSeedModifications;

public class IECArchitectureModelFactoryFacade {
	
	private static ArchitectureVersionParams archParams = new ArchitectureVersionParams();
	
	public static IECArchitectureVersion createEmptyModel(String name) {
		archParams.name = name;

		archParams.iecModificationRepository = IECArchitectureModelFactoryFacade.createIECModificationMarkRepository();

		return new IECArchitectureVersion(archParams);
	}
	
	public static IECModificationRepository createIECModificationMarkRepository() {
		IECModificationRepository repository = IECModificationmarksFactory.eINSTANCE.createIECModificationRepository();

		IECSeedModifications seedModifications = IECModificationmarksFactory.eINSTANCE.createIECSeedModifications();
		repository.setSeedModifications(seedModifications);
		
		return repository;
	}

}
