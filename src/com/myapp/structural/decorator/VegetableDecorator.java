package com.myapp.structural.decorator;

public class VegetableDecorator extends SandwichDecorator{

	public VegetableDecorator(Sandwich sandwich) {
		super(sandwich);
	}
	
	public String make(){
		return super.make()+" "+addVegetables();
	}
	
	public String addVegetables(){
		return "carrot"+" beans "+"capsicum";
	}
}
