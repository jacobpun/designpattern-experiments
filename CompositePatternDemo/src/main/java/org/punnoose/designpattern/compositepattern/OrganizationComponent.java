package org.punnoose.designpattern.compositepattern;

public interface OrganizationComponent extends Visitable{
	public void setIncentive(Double incentiveAmount);
	public void addMember(OrganizationComponent component);
	public Double getIncentive();
}