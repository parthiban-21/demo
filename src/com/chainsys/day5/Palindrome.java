package com.chainsys.day5;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = ip.nextLine();
		String strArr[] = str.split(" ");
		int arrLen = strArr.length;
		for(int i=0;i<arrLen;i++)
		{
			int subLen = strArr[i].length();
			for(int j=0;j<subLen;j++)
			{
				if (strArr[i].charAt(j) != strArr[i].charAt(subLen-1-j))
				{
					System.out.print(strArr[i]+" ");
					break;
				}
				else
				{
					//System.out.print(strArr[i].replaceAll(strArr[i],"*"));
					//break;
					for(int k=0;k<subLen;k++)
						System.out.print("*");
					System.out.println(" ");
					break;
				}
			}
		}
	}
}
