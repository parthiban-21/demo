package com.chainsys.assignment3;

import java.util.*;

public class PlaceOfService {
	Scanner ip = new Scanner(System.in);
	// smallCamelCase
	public void empPlaceCalc(String gender) {
		// Checks Gender M or F
		if (gender.equals("F")) 
		{
			System.out.println("Place of Service is Urban");
		} 
		else if (gender.equals("M")) 
		{
			//if "M" Check the age 
			System.out.print("Enter the Age: ");
			int age = ip.nextInt();
			
			if (age >= 20 && age < 40)
				System.out.println("Place of Service is Rural");
			else if (age >= 40 && age <= 60) 
				System.out.println("Place of Service is Urban");
			else
				System.out.println("Invalid Age !");
		} 
		else 
		{
			System.out.println("ERROR");
		}
	}

}
