package com.myapp.structural.facade;

public class TestFacade {

	public static void main(String[] args) {
		
		Mortgage loan=new Mortgage("Defaulter");
		System.out.println(loan.applyFor(3000));
	}

}
