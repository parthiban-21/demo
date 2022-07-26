package com.chainsys.day5;
import java.util.Scanner;
public class MaxOccurence {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter a String :");
		String str=ip.nextLine();

		if(highestOccured(str) != ' ') {

			System.out.println("Higherst Occured Character : "+Character.toString(highestOccured(str)));
		}
		else
			System.out.println("No Character Occured More Than Once");
	}

	static char highestOccured(String str) 
	{

		int [] count = new int [200];

		for ( int i=0 ;i<str.length() ; i++)
		{
			count[str.charAt(i)]++;
		}

		int m = -1 ;
		char max = ' ' ;
		for(int i =0 ;i<str.length() ; i++)
		{
			if(m < count[str.charAt(i)] && count[str.charAt(i)] > 1) 
			{
				m = count[str.charAt(i)];
				max = str.charAt(i);
			}
		}

		return max;

	}
}
