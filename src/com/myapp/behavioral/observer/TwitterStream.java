package com.myapp.behavioral.observer;

import java.util.Observable;

public class TwitterStream extends Observable {
	
	private String state;
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void modiTweeted(){
		setChanged();
		notifyObservers(state);
	}
	
}
