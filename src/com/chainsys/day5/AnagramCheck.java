package com.chainsys.day5;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter Two Strings: ");
		String str = ip.next();
		String str1 = ip.next();
		char[] chArr = str.toCharArray();
		char[] chArr1 = str1.toCharArray();
		Arrays.sort(chArr);
		Arrays.sort(chArr1);
		int l1=chArr.length,l2 = chArr1.length;
		
		int ch=0;
		if (l1!=l2) 
		{
			System.out.println("Not A Anagram");
		}
		else
		{
			for(int i=0;i<l1;i++)
			{
				if (chArr[i]!=chArr1[i])
					System.out.println("Not a Anagram");
				else
					ch+=1;
			}
		}
		if(ch!=0)
			System.out.println("Anagram");
	}

}
