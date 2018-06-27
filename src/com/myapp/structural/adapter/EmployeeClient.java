package com.myapp.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
	
	public static List<Employee> getDataFromResources(){
		List<Employee> employees=new ArrayList<>();
		EmployeeLDAP ldap=new EmployeeLDAP("common name", "surname", "abc", "abc@xyz.com");
		EmployeeCSV csv=new EmployeeCSV("1234,surfirstanmename,lastname,def@xyz.com");
		employees.add(new EmployeeAdapterLDAP(ldap));
		employees.add(new EmployeeAdapterCSV(csv));
		return employees;
	}
	
	public static void main(String args[]){
		System.out.println(getDataFromResources());
	}
}
