package com.chainsys.assignment3;

public class TaxCalc {
	
	public void taxCalculator(double grossSalary,double totalSaving) 
	{
		double taxableIncome = grossSalary - totalSaving;
		if (taxableIncome < 100000)
		{
			System.out.println("No Tax");
		}
		else if (taxableIncome > 100000 && taxableIncome < 200000)
		{
			//10% Tax
			grossSalary = grossSalary - (taxableIncome*0.10);
			System.out.println("New Saving :"+grossSalary);
		}
		else if (taxableIncome > 200000 && taxableIncome < 500000)
		{
			//30% Tax
			grossSalary = grossSalary - (taxableIncome*0.30);
			System.out.println("New Saving :"+grossSalary);
		}
		else 
			System.out.println("Error");
	}
}
