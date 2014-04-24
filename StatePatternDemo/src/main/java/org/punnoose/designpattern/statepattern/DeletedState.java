package org.punnoose.designpattern.statepattern;

public class DeletedState implements WorkItemState {

	private WorkItem item;
	
	public DeletedState(WorkItem newItem){
		this.item = newItem;
	}
	
	public void initialize() {
		throw new IllegalStateException("{} cannot be moved to initialize state.");
	}

	public void openForWork() {
		throw new IllegalStateException("{} cannot be moved to openForWork state.");
	}

	public void resolve() {
		throw new IllegalStateException("{} cannot be moved to resolve state.");
	}

	public void close() {
		throw new IllegalStateException("{} cannot be moved to closed state.");
	}

	public void delete() {
		// Do nothing
	}

	public String getName() {
		return "Delted State";
	}
}