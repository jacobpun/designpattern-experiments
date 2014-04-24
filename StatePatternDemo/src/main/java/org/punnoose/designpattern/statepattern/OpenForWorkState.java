package org.punnoose.designpattern.statepattern;

public class OpenForWorkState implements WorkItemState {

	private WorkItem item;
	
	public OpenForWorkState(WorkItem newItem){
		this.item = newItem;
	}
	
	public void initialize() {
		throw new IllegalStateException("{} cannot be moved to initialize state.");
	}

	public void openForWork() {
		// do nothing
	}

	public void resolve() {
		item.setState(item.getResolvedState());
	}

	public void close() {
		throw new IllegalStateException("{} cannot be moved to closed state.");

	}

	public void delete() {
		throw new IllegalStateException("{} cannot be moved to delete state.");
	}

	public String getName() {
		return "Open for Work State";
	}

}