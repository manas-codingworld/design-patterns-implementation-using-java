package com.myapp.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class TweetFollowers implements Observer {

	//TwitterStream is first param, state is second param
	@Override
	public void update(Observable o, Object arg1) {

		System.out.println(o.getClass().getName()+" tweeted "+arg1);
		
	}

}
