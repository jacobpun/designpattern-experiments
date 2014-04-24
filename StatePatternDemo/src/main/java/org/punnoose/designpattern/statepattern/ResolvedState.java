package org.punnoose.designpattern.statepattern;

public class ResolvedState implements WorkItemState{

	private WorkItem item;
	
	public ResolvedState(WorkItem newItem){
		this.item = newItem;
	}
	
	public void initialize() {
		throw new IllegalStateException("{} cannot be moved to initialize state.");
	}

	public void openForWork() {
		throw new IllegalStateException("{} cannot be moved to openForWork state.");
	}

	public void resolve() {
		// Do nothing

	}

	public void close() {
		item.setState(item.getResolvedState());
	}

	public void delete() {
		throw new IllegalStateException("{} cannot be moved to delete state.");
	}

	public String getName() {
		// TODO Auto-generated method stub
		return "Resolved State";
	}
}