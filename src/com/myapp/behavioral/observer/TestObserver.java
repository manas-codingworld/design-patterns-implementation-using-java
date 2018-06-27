package com.myapp.behavioral.observer;

public class TestObserver {

	public static void main(String[] args) {
		//subject
		TwitterStream stream=new TwitterStream();
		
		//observer
		TweetFollowers client1=new TweetFollowers();
		TweetFollowers client2=new TweetFollowers();
		TweetFollowers client3=new TweetFollowers();
		
		//subscribing
		stream.addObserver(client1);
		stream.addObserver(client2);
		stream.addObserver(client3);
		
		stream.setState("New Tweeted");
		stream.modiTweeted();
		
		stream.deleteObserver(client3);
		stream.setState("Another Tweeted");
		stream.modiTweeted();
	}

}
