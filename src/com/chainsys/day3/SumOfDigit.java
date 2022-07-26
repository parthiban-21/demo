package com.chainsys.day3;
import java.util.*;
public class SumOfDigit {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int input = ip.nextInt();
		int product = 1, temp;
		while(input != 0)
		{
			temp = input%10;
			product *=temp;
			input = input/10;
		}
		System.out.println(product);
	}

}
