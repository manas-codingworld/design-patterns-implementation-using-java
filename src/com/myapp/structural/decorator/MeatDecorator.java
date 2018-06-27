package com.myapp.structural.decorator;

public class MeatDecorator extends SandwichDecorator {

	public MeatDecorator(Sandwich sandwich) {
		super(sandwich);
	}
	
	public String make(){
		return super.make()+" "+addMeat();
	}
	
	public String addMeat(){
		return "Chicken";
	}

}
