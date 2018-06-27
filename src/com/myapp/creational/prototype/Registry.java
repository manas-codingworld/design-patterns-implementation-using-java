package com.myapp.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
	private Map<String,Item> items=new HashMap<>();
	
	public Registry(){
		Movie movie=new Movie();
		movie.setPrice(200);
		movie.setTitle("Fast8");
		movie.setShowTime("18:00");
		items.put("movie", movie);
		Book book=new Book();
		book.setNumOfPages(100);
		book.setPrice(50);
		book.setTitle("ABC");
		items.put("book", book);
		
	}
	
	public Item createItem(String type){
		Item item=null;
		try {
			item=(Item)items.get(type).clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return item;
		
	}

}
