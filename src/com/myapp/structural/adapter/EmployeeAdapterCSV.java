package com.myapp.structural.adapter;

public class EmployeeAdapterCSV implements Employee{

	private EmployeeCSV instance;
	
	public EmployeeAdapterCSV(EmployeeCSV instance) {
		this.instance=instance;
	}
	
	@Override
	public String getID() {
		// TODO Auto-generated method stub
		return instance.getId()+"";
	}

	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return instance.getFirstName();
	}

	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return instance.getLastName();
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return instance.getEmailAddress();
	}
	
	@Override
	public String toString() {
		return "EmployeeAdapterCSV [getID()=" + getID() + ", getFirstName()=" + getFirstName() + ", getLastName()="
				+ getLastName() + ", getEmail()=" + getEmail() + "]";
	}

}
