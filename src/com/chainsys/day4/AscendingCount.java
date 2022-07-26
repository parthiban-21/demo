package com.chainsys.day4;

import java.util.Scanner;

public class AscendingCount {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter the Length of Array: ");
		int l = ip.nextInt();
		int count =0;
		int arr[] = new int[l];
		System.out.println("Enter the Numbers ");
		// Get Values from User
		for(int i=0;i<l;i++)
		{
			arr[i]=ip.nextInt();
		}
		for(int i=0;i<l-1;i++)
		{
			if(arr[i]<arr[i+1]) 
			{
				count+=1;
				System.out.print(arr[i]+" "+arr[i+1]);
			}
		}
		System.out.println("The Maximum Ascending is "+(count+1));
	}
}
