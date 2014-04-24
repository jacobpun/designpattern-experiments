package org.punnoose.designpattern.compositepattern;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class CompositePatternDemoTest {

	OrganizationComponent company = new OrganizationGroup("Company");
	Person bob = new Person("Bob");

	
	@Before
	public void setUp(){
		OrganizationComponent technology = new OrganizationGroup("Technology");
		technology.addMember(bob);
		
		OrganizationComponent mainFrameTechnology = new OrganizationGroup("MainframeTechnology");
		mainFrameTechnology.addMember(new Person("Dan"));
		mainFrameTechnology.addMember(new Person("Janet"));
		technology.addMember(mainFrameTechnology);
		company.addMember(technology);
		
		OrganizationComponent finance = new OrganizationGroup("Finance");
		finance.addMember(new Person("Mike"));
		finance.addMember(new Person("Stella"));
		company.addMember(finance);
		
		company.setIncentive(10000.00);
		
	}

	@Test
	public void shouldGiveIncentiveToAGroup() {
		assertThat(bob.getIncentive(), is(2500.00));
	}

	@Test
	public void visitorShouldCalculateAverageIncentiveAmount(){
		AverageIncentiveAmountCalculatorVisitor visitor = new AverageIncentiveAmountCalculatorVisitor();
		company.accept(visitor);
		assertThat(visitor.getAverageIncentiveAmount(), is(2000.00));		
	}
}