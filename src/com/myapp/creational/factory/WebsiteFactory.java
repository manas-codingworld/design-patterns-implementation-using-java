package com.myapp.creational.factory;

public class WebsiteFactory {
	public static Website getWebsite(WebsiteType type){
		switch(type){
		case BLOG:
			return new Blog();
		case ECOMM:
			return new Ecommerce();
		default:
			return null;
		}
	}

}
