package com.myapp.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class OnAllCommand implements Command {

	private List<Light> lights =new ArrayList<>();
	
	public OnAllCommand(List<Light> lights) {
		this.lights=lights;
	}
	
	@Override
	public void execute() {
		for(Light light:lights){

			light.toggle();

		}
	}

}
