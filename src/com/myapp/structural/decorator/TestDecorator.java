package com.myapp.structural.decorator;

public class TestDecorator {

public static void main(String[] args) {
		
		PlainSandwich sandwich = new PlainSandwich();
		VegetableDecorator vegDecorator = new VegetableDecorator(sandwich);
		System.out.println(vegDecorator.make());
		
		Sandwich sandwich2 = new MeatDecorator(new VegetableDecorator(new PlainSandwich()));
		System.out.println(sandwich2.make());
		
		Sandwich sandwich3 = new SandwichDecorator(new PlainSandwich());
		System.out.println(sandwich3.make());
		
	}

}
