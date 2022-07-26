package com.chainsys.day3;

import java.util.Scanner;

public class OddEven {
	
	// Odd Function
	public void odd() 
	{
		Scanner ip = new Scanner(System.in);
		System.out.print("To Find Odd Number\nEnter the End Number: ");
		int endNum = ip.nextInt();
		for (int i=0;i<=endNum;i++)
		{
			if (i%2!=0)
				continue;
			System.out.println(i);
		}

	}
	
	//Even Function
	public void even() 
	{
		Scanner ip = new Scanner(System.in);
		System.out.print("To Find Even Number\nEnter the End Number: ");
		int endNum = ip.nextInt();
		for (int i=0;i<=endNum;i++)
		{
			if (i%2==0)
				continue;
			System.out.println(i);
		}

	}
	
	//Cube Function
	public void cube() 
	{
		Scanner ip = new Scanner(System.in);
		System.out.print("To Find Cubes of Numbers\nEnter the End Number: ");
		int endNum = ip.nextInt();
		for (int i=0;i<=endNum;i++)
		{
			System.out.println(i*i*i);
		}
	}

}
