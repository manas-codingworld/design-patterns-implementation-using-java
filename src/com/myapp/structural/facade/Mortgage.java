package com.myapp.structural.facade;

//Facade Pattern
public class Mortgage {
	
	private String name;
	
	public Mortgage(String name){
		this.name=name;
	}
	
	public String applyFor(double amount){
		String result="approved";
		
		if(!new BankVerification().check(name)){
			result="denied";
		}
		if(!new BackGroundVerification().check(name)){
			result="denied";
		}
		if(! new CreditCheck().verify(name)){
			result="denied";
		}
		return result;
	}
}
