package com.myapp.casestudy;

import java.util.ArrayList;
import java.util.List;

public class ComposedWorlObject extends WorldObject {

	private List<WorldObject> worldObjects=new ArrayList<>();
	
	public List<WorldObject> getWorldObjects() {
		return worldObjects;
	}

	public void setWorldObjects(List<WorldObject> worldObjects) {
		this.worldObjects = worldObjects;
	}

	private String specification;

	public String getSpecification() {
		return specification;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public ComposedWorlObject(String specification) {
		this.specification=specification;
	}
	
	@Override
	public void print() {
		System.out.println(specification);
	//	worldObjects.forEach(object->print());
		for(WorldObject obj:worldObjects){
			obj.print();
		}
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return specification;
	}

}
