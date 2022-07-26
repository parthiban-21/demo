package com.chainsys.day6;

public class MarkCalc {
	
	public double AverageCalc (int m1, int m2, int m3, int m4)
	{
		int total = m1+m2+m3+m4;
		return total/4;
	}

	public double AverageCalc (String extras, double total)
	{
		return total+(total*0.2);
	}
}
