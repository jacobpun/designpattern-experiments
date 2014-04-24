package org.punnoose.designpattern.compositepattern;

public class AverageIncentiveAmountCalculatorVisitor implements Visitor {
	double totalIncentiveAmount = 0;
	int totalEmployeeCount = 0;
	
	public void visit(Person person) {
		totalEmployeeCount ++;
		totalIncentiveAmount += person.getIncentive();
	}

	public void visit(OrganizationGroup group) {
		//do nothing
	}
	
	public double getAverageIncentiveAmount(){
		return totalIncentiveAmount/totalEmployeeCount;
	}
}