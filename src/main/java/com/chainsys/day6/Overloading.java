package com.chainsys.day6;

public class Overloading {
	
	//1st Case
	public void Example(int age,char gender)
	{
		System.out.println("Age "+age);
		System.out.println("Gender "+gender);
	}
	
	//2nd Case
	public void Example(char gender,int age)
	{
		System.out.println("Age "+age);
		System.out.println("Gender "+gender);
	}
}
