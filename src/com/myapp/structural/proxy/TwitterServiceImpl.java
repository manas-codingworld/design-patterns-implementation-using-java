package com.myapp.structural.proxy;

import java.util.List;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterServiceImpl implements TwitterService {
	
	private static final String TWITTER_CONSUMER_KEY="03mDnsWNUtl2cCZJHaIvp8bFo";
	
	private static final String TWITTER_SECRET_KEY="7RlUKBVlawE60DAin8nthHy3BpwEXx0ORRKiE6bjhYzRiI3Bne";
	
	private static final String TWITTER_ACCESS_TOKEN="852450983015796736-hq1O2o947aMa0YHbkcvcoTakPAQjQ0F";
	
	private static final String TWITTER_SECRET_TOKEN="SgSVvLo8pshPjcUpEcUCIc97r8vmgtxOqAbpbLlAlokeL";
	
	@Override
	public String getTimeLine(String screenName) {
		ConfigurationBuilder cb=new ConfigurationBuilder();
		cb.setDebugEnabled(true).setOAuthConsumerKey(TWITTER_CONSUMER_KEY)
		.setOAuthConsumerSecret(TWITTER_SECRET_KEY).setOAuthAccessToken(TWITTER_ACCESS_TOKEN)
		.setOAuthAccessTokenSecret(TWITTER_SECRET_TOKEN);
		//factory pattern
		TwitterFactory tf=new TwitterFactory(cb.build());
		Twitter twitter=tf.getInstance();
		//builder pattern
		StringBuilder builder=new StringBuilder();
		Query query=new Query(screenName);
		QueryResult result=null;
		
		try{
			do{
				//facade pattern
				result=twitter.search(query);
				List<Status>tweets=result.getTweets();
				for(Status status:tweets){
					builder.append("@"+status.getUser().getScreenName()+" -- ");
					status.getText();
				}
			}while((query=result.nextQuery())!=null );
		}
		catch(TwitterException e){
			e.printStackTrace();
		}
		
		return builder.toString();
	}

	@Override
	public void postToTimelIne(String screenName, String message) {
		// TODO Auto-generated method stub
		
	}

}
