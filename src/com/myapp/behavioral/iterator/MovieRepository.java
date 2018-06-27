package com.myapp.behavioral.iterator;

import java.util.Iterator;

public class MovieRepository implements Iterable<String>{
	
	private int index;
	private String[] movies;
	
	public MovieRepository(){
		movies=new String[10];
		index=0;
	}
	
	public void addMovie(String movie){
		if(index==movies.length){
			String[] largerMovies=new String[movies.length+5];
			System.arraycopy(movies, 0, largerMovies, 0, movies.length);
			movies=largerMovies;
			largerMovies=null;
			
		}
		movies[index]=movie;
		index++;
	}
	
	public Iterator<String> iterator(){
		Iterator<String> it=new Iterator<String>(){
			private int currentIndex=0;
			
			@Override
			public boolean hasNext(){
				return currentIndex<movies.length&& movies[currentIndex]!=null;
			}
			
			@Override
			public String next(){
				return movies[currentIndex++];
			}
		};
		return it;
	}

	
}
