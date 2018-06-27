package com.myapp.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class TestCommand {

	public static void main(String[] args) {
		
		Light kitchenLight=new Light();
		Light kitchenLight2=new Light();
		Light kitchenLight3=new Light();
		Light kitchenLight4=new Light();
		List<Light> lights=new ArrayList<>();
		lights.add(kitchenLight);
		lights.add(kitchenLight2);
		lights.add(kitchenLight3);
		lights.add(kitchenLight4);
		
		Switch lightSwitch=new Switch();
		Command command=new OnCommand(kitchenLight);
		lightSwitch.storeAndExecute(command);
		
		Command command2=new ToggleCommand(kitchenLight);
		lightSwitch.storeAndExecute(command2);
		lightSwitch.storeAndExecute(command2);
		lightSwitch.storeAndExecute(command2);
		lightSwitch.storeAndExecute(command2);
		lightSwitch.storeAndExecute(command2);
		lightSwitch.storeAndExecute(command2);
		
		
		Command command3=new OnAllCommand(lights);
		lightSwitch.storeAndExecute(command3);
		
	}

}
