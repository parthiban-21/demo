package com.chainsys.day4;

import java.util.*;

public class AscendingOrder {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter the Length of Array: ");
		int l = ip.nextInt();
		int arr[] = new int[l];
		System.out.println("Enter the Numbers ");
		// Get Values from User
		for(int i=0;i<l;i++)
		{
			arr[i]=ip.nextInt();
		}
		Arrays.sort(arr);
		// Get Maximum Number
		System.out.print("The Max Value is : ");
		int max = ip.nextInt();
		// Display Ascending Values Accordingly
		for(int i=0;i<max;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
