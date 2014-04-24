package org.punnoose.designpattern.compositepattern;

public interface Visitor {
	public void visit(Person person);
	public void visit(OrganizationGroup group);	
}
