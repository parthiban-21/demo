package com.chainsys.assignment3;

import java.util.Scanner;

public class PlaceOfServiceTest {

	public static void main(String[] args) {
		PlaceOfService obj = new PlaceOfService();
		Scanner ip = new Scanner(System.in);
		
		//Get Gender from User
		System.out.print("Enter the Gender: ");
		String gender = ip.next();
		
		obj.empPlaceCalc(gender);
	}

}
