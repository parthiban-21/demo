package com.chainsys.day5;

import java.util.Scanner;

public class ShortName {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter Full Name: ");
		String str = ip.nextLine();
		String fName = str.substring(0, 1).toUpperCase();
		int i = str.indexOf(" ");
		String mName = str.substring(i+1, i+2).toUpperCase();
		int j = str.lastIndexOf(" ");
		String lName = str.substring(j+1, j+2).toUpperCase();
		//String[] nName = str.split(" ");
		if (i==j)
			System.out.println(fName+"."+mName+str.substring(j+2, str.length()));
		else
			System.out.println(fName+"."+mName+"."+lName+str.substring(j+2, str.length()));
	}

}
