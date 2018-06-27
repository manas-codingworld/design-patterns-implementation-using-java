package com.myapp.behavioral.cor;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestLogging {
	
	public static void main(String args[]){
		Logger logger=Logger.getLogger(TestLogging.class.getName());
		logger.setLevel(Level.FINER);
		ConsoleHandler consoleHandler=new ConsoleHandler();
		consoleHandler.setLevel(Level.FINER);
		logger.addHandler(consoleHandler);
		logger.finer("Hi");
		logger.finest("Bye");
	}

}
