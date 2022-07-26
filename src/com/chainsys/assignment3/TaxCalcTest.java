package com.chainsys.assignment3;

import java.util.*;

public class TaxCalcTest {
	public static void main(String args[]) {
		TaxCalc obj = new TaxCalc();
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter the Gross Salary :");
		double Salary = ip.nextDouble();
		System.out.print("Enter the Total Saving :");
		double Saving = ip.nextDouble();
		obj.taxCalculator(Salary, Saving);
	}

}
