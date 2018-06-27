package com.myapp.structural.adapter;

public class EmployeeAdapterLDAP implements Employee{
	
	EmployeeLDAP instance;
	
	public EmployeeAdapterLDAP(EmployeeLDAP instance) {
		this.instance=instance;
	}
	
	@Override
	public String getID() {
		return instance.getCn();
	}

	@Override
	public String getFirstName() {
		return instance.getGivnename();
	}

	@Override
	public String getLastName() {
		return instance.getSurname();
	}

	@Override
	public String getEmail() {
		return instance.getMail();
	}
	
	@Override
	public String toString() {
		return "EmployeeAdapterLDAP [getID()=" + getID() + ", getFirstName()=" + getFirstName() + ", getLastName()="
				+ getLastName() + ", getEmail()=" + getEmail() + "]";
	}

}
