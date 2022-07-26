package com.chainsys.day5;

import java.util.Scanner;

public class ReplaceOccurence {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = ip.nextLine();
		str = str.toLowerCase();
		System.out.println("Enter a String to Repace: ");
		String find = ip.nextLine();
		find = find.toLowerCase();
		System.out.println("Enter a String to Repace With: ");
		String replace = ip.nextLine();
		
		System.out.println(str.replaceAll(find, replace));
	}

}
