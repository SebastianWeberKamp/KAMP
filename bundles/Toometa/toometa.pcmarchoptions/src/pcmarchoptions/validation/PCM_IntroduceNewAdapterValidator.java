/**
 *
 * $Id$
 */
package pcmarchoptions.validation;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

/**
 * A sample validator interface for {@link pcmarchoptions.PCM_IntroduceNewAdapter}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PCM_IntroduceNewAdapterValidator {
	boolean validate();

	boolean validateAdapterContext(AssemblyContext value);
	boolean validateContextBeingAdapted(AssemblyContext value);
}