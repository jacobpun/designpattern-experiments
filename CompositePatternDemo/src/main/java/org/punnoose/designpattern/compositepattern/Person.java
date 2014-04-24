package org.punnoose.designpattern.compositepattern;

public class Person implements OrganizationComponent {
	private String name;
	private Double incentiveAmount;
	
	public Person(String name){
		this.name = name;
	}
	
	public void setIncentive(Double incentiveAmount) {
		this.incentiveAmount = incentiveAmount;
	}
	
	public void addMember(OrganizationComponent component) {
		throw new UnsupportedOperationException();
	}
	
	public String toString(){
		return "<" + name + "><incentive>" + incentiveAmount + "</incentive></" + name + ">";
	}

	public Double getIncentive() {
		return incentiveAmount;
	}

	public void accept(Visitor visitor) {
		visitor.visit(this);		
	}
}