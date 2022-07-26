package com.chainsys.assignment3;

import java.util.Scanner;

public class ShopCalcTest {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		ShopCalc obj = new ShopCalc();
		obj.customerDetails();
		int total = obj.getOrder();
		if (total>1000)
		{
			obj.discount(total);
		}
		else {
			System.out.println("Total Cost is "+total);
		}
	}
}
