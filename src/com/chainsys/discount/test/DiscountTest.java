package com.chainsys.discount.test;

import com.chainsys.discount.*;
import java.util.Scanner;

public class DiscountTest {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		Discount obj = new Discount();
		System.out.print("Enter the Quantity of Purchase :");
		obj.quantity = inp.nextInt();
		int total = obj.quantity*100;
		if (obj.quantity>10)
		{
			double discount = total*0.1;
			double newTotal = total - discount;
			System.out.println("Total Cost is "+newTotal);
		}
		else
		{
			System.out.println("Total Cost is "+total);
		}
	}

}
