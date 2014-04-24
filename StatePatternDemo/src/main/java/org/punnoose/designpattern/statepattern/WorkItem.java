package org.punnoose.designpattern.statepattern;

public class WorkItem{
	
	private WorkItemState closedState;
	private WorkItemState deletedState;
	private WorkItemState initialState;
	private WorkItemState openForWorkState;
	private WorkItemState resolvedState;

	
	private WorkItemState state;
	private String name;
	private String description;
	
	public WorkItem(String name, String description){
		this.name = name;
		this.description = description;

		closedState = new ClosedState(this);
		deletedState = new DeletedState(this);
		initialState = new InitialState(this);
		openForWorkState = new OpenForWorkState(this);
		resolvedState = new ResolvedState(this);
		
		this.state = initialState;
	}
	
	public WorkItemState getClosedState() {
		return closedState;
	}

	public WorkItemState getDeletedState() {
		return deletedState;
	}

	public WorkItemState getInitialState() {
		return initialState;
	}

	public WorkItemState getOpenForWorkState() {
		return openForWorkState;
	}

	public WorkItemState getResolvedState() {
		return resolvedState;
	}

	public void delete() {
		state.delete();
	}

	public void initialize() {
		state.initialize();
	}

	public void openForWork() {
		state.openForWork();
	}

	public void resolve() {
		state.resolve();
	}

	public void close() {
		state.close();
	}

	public WorkItemState getState() {
		return state;
	}
	
	public void setState(WorkItemState state) {
		this.state = state;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}