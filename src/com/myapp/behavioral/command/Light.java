package com.myapp.behavioral.command;

import java.util.ArrayList;
import java.util.List;

//receiver
public class Light {
	
	private boolean isOn=false;
	
	public boolean isOn(){
		return isOn;
	}
	
	public void toggle(){
		if(isOn){
			off();
			isOn=false;
		}else{
			on();
			isOn=true;
		}
	}
	
	public void switchOnAll(){
		
	}

	public void off() {
		
		System.out.println("Light is switched off");
	}
	public void on() {

		System.out.println("Light is switched on");		
	}

}
