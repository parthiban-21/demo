package com.chainsys.assignment3;
import java.util.*;

public class Range {
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Start Numer: ");
		int startNum = in.nextInt();
		System.out.print("Enter the End Number: ");
		int endNum = in.nextInt();
		for (int i=startNum;i<=endNum;i++)
		{
			System.out.println(i);
		}
	}
}
