package com.myapp.behavioral.cor;

public class Director extends Handler {
	
	@Override
	public void handleRequest(Request request) {
		if(request.getRequestType()==RequestType.CONFERENCE){
			if(request.getAmount()<1500){
				System.out.println("Director can approve CONFERENCE <1500");
			}else
				successor.handleRequest(request);
		}
		else
			successor.handleRequest(request);
		
	}
}
