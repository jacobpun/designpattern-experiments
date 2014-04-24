package org.punnoose.designpattern.compositepattern;

import java.util.ArrayList;
import java.util.List;

public class OrganizationGroup implements OrganizationComponent {
	private List<OrganizationComponent> members = new ArrayList<OrganizationComponent>();
	private String groupName;

	public OrganizationGroup(String groupName){
		this.groupName = groupName;
	}

	public void setIncentive(Double incentiveAmount) {
		double incentiveAmountForEachMember = incentiveAmount/members.size();
		for (OrganizationComponent orgComponent : members) {
			orgComponent.setIncentive(incentiveAmountForEachMember);
		}
	}

	public void addMember(OrganizationComponent component){
		members.add(component);
	}

	public String toString(){
		String toString = "<" + groupName + ">";
		for (OrganizationComponent member : members) {
			toString += member.toString();
		}	
		toString += "</" + groupName + ">";
		return toString;
	}

	public Double getIncentive() {
		double totalIncentiveAmount =0;
		for (OrganizationComponent orgComponent : members) {
			totalIncentiveAmount +=orgComponent.getIncentive();
		}
		return totalIncentiveAmount;
	}

	public void accept(Visitor visitor) {
		for (OrganizationComponent orgComponent : members) {
			orgComponent.accept(visitor);
		}
	}
}