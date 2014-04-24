package org.punnoose.designpattern.bridgepattern;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class BridgePatternDemoTesting {

	@Test
	public void remoteShouldStartAndStopAnyCar() {
		Car toyotaCar = new ToyotaCar();
		Remote remote = new StartAndStopRemote(toyotaCar);
		remote.startCar();
		assertThat(toyotaCar.isStarted(), is(true));
		remote.stopCar();
		assertThat(toyotaCar.isStarted(), is(false));
	}
}
