package org.punnoose.designpattern.statepattern;

public interface WorkItemState{
	public void initialize();
	public void openForWork();
	public void resolve();
	public void close();
	public void delete();
	public String getName();
}
