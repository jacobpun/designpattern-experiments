package org.punnoose.designpattern.statepattern;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class WorkItemTest {

	private WorkItem item;
	
	@Before
	public void setUp(){
		item = new WorkItem("Sample Work Item", "Sample Work Item");
	}
	
	@Test
	public void shouldDeleteWorkItemInProposedState() {
		item.delete();
		assertThat(item.getState().getName(), is("Delted State"));
	}

	@Test(expected=IllegalStateException.class)
	public void shouldNotCloseWorkItemInProposedState() {
		item.close();
	}

}