package com.myapp.casestudy;

import java.util.LinkedList;
import java.util.Queue;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ComposedWorlObject root=new ComposedWorlObject("root");
		ComposedWorlObject house=new ComposedWorlObject("house");
		
		Circle circle=new Circle("circle");
		Square square=new Square("square");
		
		Circle circle2=new Circle("circle2");
		
		Square square2=new Square("square2");
		root.getWorldObjects().add(circle2);
		root.getWorldObjects().add(square2);
		root.getWorldObjects().add(house);
		house.getWorldObjects().add(circle);
		house.getWorldObjects().add(square);
		
		root.print();
		
		RenderingSystem system=new RenderingSystem();
		WorldObjectRenderer quick=new QuickRenderer();
		WorldObjectRenderer detailed=new DetailRenderer();
		
		system.setRenderer(detailed);
		system.render(root);
		
		Queue<UserAction> actionQueue=new LinkedList<>();
		ScreenOne screenOne=new ScreenOne(actionQueue);
		ScreenTwo screenTwo=new ScreenTwo(actionQueue);
		screenOne.simulateUserAction();
		screenTwo.simulateUserAction();
		
		UserAction lastUserAction=null;
		for(UserAction userAction :actionQueue){
			userAction.performAction();
			lastUserAction=userAction;
		}
		
		lastUserAction.undo();
		
	}

}
