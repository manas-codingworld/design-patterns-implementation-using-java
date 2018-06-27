package com.myapp.structural.proxy;

public class TestProxyPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start of main");
		TwitterService twitter=new TwitterServiceImpl();
		TwitterService proxy=(TwitterService)TwitterServiceInvocationHandler.newInstance(twitter);
		System.out.println("before printing");
		System.out.println(proxy.getTimeLine("srk"));
		
	}

}
