package com.myapp.casestudy;

import java.util.Queue;

public class ScreenTwo {

	private Queue<UserAction> actionQueue;

	public ScreenTwo(Queue<UserAction> actionQueue) {
		super();
		this.actionQueue = actionQueue;
	}
	
	public void simulateUserAction(){
		PrintUserAction action =new PrintUserAction("Screen one Action");
		actionQueue.add(action);
	}

}
