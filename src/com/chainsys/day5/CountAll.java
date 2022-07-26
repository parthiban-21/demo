package com.chainsys.day5;

import java.util.Scanner;

public class CountAll {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = ip.nextLine();
		int v=0,c=0,d=0,s=0,space=0;
		str = str.toLowerCase();
		for (int i=0;i<str.length();i++) 
		{
			char ch = str.charAt(i);
			if(ch == 'a'||ch == 'e' || ch == 'i'||ch == 'o' ||ch == 'u')
				++v;
			else if(ch>'a' && ch<='z')
				++c;
			else if(ch>='0' && ch<='9')
				++d;
			else if(ch==' ')
				++space;
			else
				++s;
		}
		System.out.println("Total Charcters: "+str.length());
		System.out.println("Vovels: "+v);
		System.out.println("Consonents: "+c);
		System.out.println("Digits: "+d);
		System.out.println("Spaces: "+space);
		System.out.println("Special: "+s);
	}

}
