package com.myapp.creational.prototype;

public class TestPrototype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Registry registry=new Registry();
		Movie movie=(Movie)registry.createItem("movie");
		System.out.println(movie.getTitle());
		movie.setTitle("X:Men");
		
		System.out.println(movie.getShowTime());
		System.out.println(movie.getTitle());
		System.out.println(movie.getPrice());
		
		Movie anothermovie = (Movie)registry.createItem("movie"); 
		anothermovie.setTitle("X:Men part2");
		System.out.println(anothermovie.getShowTime());
		System.out.println(anothermovie.getTitle());
		System.out.println(anothermovie.getPrice());
	}

}
