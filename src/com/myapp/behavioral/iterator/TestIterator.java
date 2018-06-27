package com.myapp.behavioral.iterator;

import java.util.Iterator;

public class TestIterator {

	public static void main(String[] args) {

		MovieRepository repository = new MovieRepository();
		
		repository.addMovie("HP1");
		repository.addMovie("HP2");
		repository.addMovie("HP3");
		repository.addMovie("HP4");
		repository.addMovie("HP5");
		repository.addMovie("HP6");
		repository.addMovie("HP7_1");
		repository.addMovie("HP7_2");
		
		Iterator<String> iterator = repository.iterator();
		System.out.println("\nIterator:");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("\nFor each:");
		for(String movie:repository) {
			System.out.println(movie);
		}

	}

} 
