package com.myapp.structural.adapter;

public class EmployeeLDAP {
	
	private String cn,surname,givnename,mail;

	public EmployeeLDAP(String cn, String surname, String givnename, String mail) {
		this.cn = cn;
		this.surname = surname;
		this.givnename = givnename;
		this.mail = mail;
	}

	public String getCn() {
		return cn;
	}

	public void setCn(String cn) {
		this.cn = cn;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getGivnename() {
		return givnename;
	}

	public void setGivnename(String givnename) {
		this.givnename = givnename;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
	
}
