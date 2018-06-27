package com.myapp.behavioral.command;

public class Switch {

	public void storeAndExecute(Command command) {
		
		command.execute();
	}
	
} 