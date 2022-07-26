package com.chainsys.day3;

import java.util.Scanner;

public class FuzzBuzz {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Start Numer: ");
		int startNum = in.nextInt();
		System.out.print("Enter the End Number: ");
		int endNum = in.nextInt();
		// Checking all number in range
		for (int i=startNum;i<=endNum;i++)
		{
			if(i%3==0 && i%5==0)// Both Multiples of 3 & 5
				System.out.println("FuzzBuzz");
			else if(i%5==0) // Multiples of 5
				System.out.println("Buzz");
			else if(i%3==0) // Multiples of 3	
				System.out.println("Fuzz");
			else
				System.out.println(i);
		}

	}

}
