package com.myapp.structural.facade;

public class BankVerification {
	
	public boolean check(String name){
		if(name.equals("Defaulter")) return false;
		return true;
	}
}
