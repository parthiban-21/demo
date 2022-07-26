package com.chainsys.assignment3;

import java.util.*;

public class ShopCalc {

	//Get Customer Detail
	public void customerDetails() 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Customer Name: ");
		String Name = in.next();
		System.out.print("Enter Customer Contact Number: ");
		long mobileNo = in.nextLong();
	}

	//Discount Calculation
	public double discount(int price) 
	{
		double discount = price*0.1;
		double newTotal = price - discount;
		System.out.println("Hurry You Got a Discount!\nTotal Price is "+price);
		System.out.println("Pay Only "+newTotal);
		return newTotal;
	}
	
	//Get Order from User
	public int getOrder()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter No of Quantities: ");
		int quantity = in.nextInt();
		int total = quantity*100;
		return total;
	}
	
}
