package com.myapp.structural.proxy;

public interface TwitterService {

	String getTimeLine(String screenName);
	void postToTimelIne(String screenName, String message);
	
}
