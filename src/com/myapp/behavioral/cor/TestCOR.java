package com.myapp.behavioral.cor;

public class TestCOR {

	public static void main(String[] args) {

		Director director=new Director();
		CEO ceo=new CEO();
		VP vp=new VP();
		
		director.setSuccessor(vp);
		vp.setSuccessor(ceo);
		Request request=new Request(RequestType.PURCHASE, 1000);
		director.handleRequest(request);
	}

}
