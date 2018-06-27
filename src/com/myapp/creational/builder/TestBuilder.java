package com.myapp.creational.builder;

public class TestBuilder {

	public static void main(String[] args) {
		
		LunchOrder.Builder builder=new LunchOrder.Builder();
		LunchOrder order=builder.dosa("Ravaaae").idli("rava").upma("vermicelli").build();
		System.out.println(order.getDosa()+" "+order.getIdli()+" "+order.getUpma());
	}
}
