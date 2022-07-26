package com.chainsys.day3;

import java.util.Scanner;

public class EvenDigit {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int input = ip.nextInt();
		int product = 1, temp;
		while(input != 0)
		{
			temp = input%10; //
			input = input/10; // Remainder
			if (temp%2==0)
				System.out.println(temp);
		}
	}

}
