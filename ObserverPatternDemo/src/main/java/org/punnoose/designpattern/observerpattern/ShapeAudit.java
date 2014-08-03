package org.punnoose.designpattern.observerpattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class ShapeAudit implements Observer {

	private ArrayList<String> auditMessages = new ArrayList<>();

	@Override
	public void update(Observable o, Object arg) {
		if (arg == null)
			return;
		auditMessages.add(arg.toString());
	}

	public List<String> getauditMessages() {
		return Collections.unmodifiableList(auditMessages);
	}

}