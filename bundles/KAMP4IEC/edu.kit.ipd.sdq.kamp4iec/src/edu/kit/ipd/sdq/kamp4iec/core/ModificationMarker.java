package edu.kit.ipd.sdq.kamp4iec.core;

public class ModificationMarker {
	IECModificationType previous;
	IECModificationType current;
	
	public ModificationMarker(IECModificationType previous, IECModificationType current) {
		super();
		this.previous = previous;
		this.current = current;
	}
	
	public boolean equals(ModificationMarker other) {
		return other.getCurrent().toString().equals(this.getCurrent().toString()) && other.getPrevious().toString().equals(this.getPrevious().toString());
	}

	public IECModificationType getPrevious() {
		return previous;
	}

	public void setPrevious(IECModificationType previous) {
		this.previous = previous;
	}

	public IECModificationType getCurrent() {
		return current;
	}

	public void setCurrent(IECModificationType current) {
		this.current = current;
	}
	
}
