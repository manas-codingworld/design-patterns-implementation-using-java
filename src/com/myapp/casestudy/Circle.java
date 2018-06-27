package com.myapp.casestudy;

public class Circle extends WorldObject {

	private String specification;

	public String getSpecification() {
		return specification;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
	}
	
	public Circle(String specification) {
		this.specification=specification;
	}

	@Override
	public void print() {
		System.out.println(specification);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return specification;
	}

}
