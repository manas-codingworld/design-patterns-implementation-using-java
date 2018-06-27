package com.myapp.creational.factory;

public class TestFactory {

	public static void main(String[] args) {
		Website website=WebsiteFactory.getWebsite(WebsiteType.ECOMM);
		website.createWebsite();
		System.out.println(website.getPages());
		
	}

}
