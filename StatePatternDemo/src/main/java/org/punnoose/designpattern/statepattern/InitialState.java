package org.punnoose.designpattern.statepattern;

public class InitialState implements WorkItemState {
	
	private WorkItem item;
	
	public InitialState(WorkItem newItem){
		this.item = newItem;
	}
	
	public String getName() {
		return "Proposed State";
	}

	public void initialize() {
		item.setState(this);
	}

	public void openForWork() {
		System.out.println(item.getName() + " moved to Open for Work state.");
		item.setState(item.getOpenForWorkState());
	}

	public void resolve() {
		throw new IllegalStateException("{} cannot be moved to resolved state.");
	}

	public void close() {
		throw new IllegalStateException("{} cannot be moved to closed state.");
		
	}

	public void delete() {
		item.setState(item.getDeletedState());
	}
}