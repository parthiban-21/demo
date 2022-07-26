package com.chainsys.day4;
import java.util.*;
public class ArrayMaximum {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter the Length of Array: ");
		int l = ip.nextInt();
		int higher = 0;
		int arr[] = new int[l];
		System.out.println("Enter the Numbers ");
		// Get Values from User
		for(int i=0;i<l;i++)
		{
			arr[i]=ip.nextInt();
		}
		// Checking the Highest Multiple
		for(int i=0;i<l-1;i++)
		{
			if (arr[i]*arr[i+1]>higher)
				higher = arr[i]*arr[i+1];
		}
		//Print Highest Value
		System.out.println("Higher Multiple is "+higher);
	}

}
