package org.punnoose.designpattern.statepattern;

public class ClosedState implements WorkItemState{

	private WorkItem item;
	
	public ClosedState(WorkItem newItem){
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
		// Do Nothing
	}

	public void delete() {
		item.setState(item.getDeletedState());
	}

	public String getName() {
		return "Closed State";
	}

}
