package com.myapp.creational.factory;

public class Ecommerce extends Website {

	@Override
	public void createWebsite() {
		// TODO Auto-generated method stub
		pages.add(new SearchPage());
		pages.add(new CartPage());
		pages.add(new ItemPage());
		

	}

}
