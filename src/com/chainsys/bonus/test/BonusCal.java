package com.chainsys.bonus.test;
import com.chainsys.bonus.BonusCalculation;
import java.util.Scanner;

public class BonusCal {
	
	public static void main(String[] args) {

		BonusCalculation Obj = new BonusCalculation();
		Scanner inp = new Scanner(System.in);
	
		System.out.print("Enter Your Name: ");
		Obj.name = inp.next();
		System.out.print("Enter Your Salary: ");
		Obj.salary = inp.nextInt();
		System.out.print("Enter Your Experience: ");
		Obj.exp = inp.nextInt();
		if (Obj.exp > 5)
		{
			System.out.println("You are Eligible for Bonus");
			double bonus = Obj.salary*0.05;
			double newSalary = Obj.salary + bonus;
			System.out.print("You are Bonus is "+ bonus);
		}
	}
}
