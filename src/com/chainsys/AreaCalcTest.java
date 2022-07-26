package com.chainsys.day6;

import java.util.Scanner;

public class AreaCalcTest {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		AreaCalc obj = new AreaCalc();
		// Get Input From User
		System.out.println("Enter the Two Sides : ");
		int l = ip.nextInt();
		int b = ip.nextInt();
		// Checks Square or Rectangle
		if (l==b)
			System.out.println("Area of the Square is "+obj.area(l));
		else
			System.out.println("Area of the Rectangle is "+obj.area(l,b));
	}

}
