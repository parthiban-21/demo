package com.chainsys.day5;

import java.util.Scanner;

public class FirstLastOccurance {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter Something...");
		String str = ip.next();
		
		System.out.print("Enter letter to find :");
		String c = ip.next();
		
		if(str.contains(c)) {
			System.out.println("First Occurance: "+str.indexOf(c));
			System.out.println("Last Occurance: "+str.lastIndexOf(c));
		}
	}

}
