package com.chainsys.sample.test;

import com.chainsys.sample.*;

public class Test {

	public static void main(String[] args) {
		
		Movie mov = new Movie();
		
		mov.name = "Vikram";
		mov.year = 2022;
		mov.rating = 8;
		mov.director = "Lokesh";
		
		System.out.println("Movie Name: "+mov.name);
		System.out.println("Release Year: "+mov.year);
		System.out.println("Movie Rating: "+mov.rating);
		System.out.println("Director: "+mov.director);

	}

}
