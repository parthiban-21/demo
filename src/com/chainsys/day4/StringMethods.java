package com.chainsys.day4;
import java.util.*;
public class StringMethods {

	public static void main(String[] args) {
		String str="Chainsys",str2="";
		Scanner ip = new Scanner(System.in);
		
		//Checking Blank
		System.out.println(str.isBlank());
		
		//Find the Length of the String
		System.out.println("Length of the String: "+str.length());
		
		//Prints the Char at Given Index
		System.out.println("Char at Index 4: "+str.charAt(4));
		
		//Replaces the Given char with New Char
		System.out.println("Replaces the Given char with New Char: "+str.replace('a', 'b'));
		
		//Prints the Index of given character
		System.out.println("Index Value of 's': "+str.indexOf("s"));
		
		//Copy One String to Another
		str2 = str;
		System.out.println("Value of Str2, String Copied: "+str2);
		
		//To Upper Case
		System.out.println("Upper Case: "+str.toUpperCase());
		
		//To Lower Case
		System.out.println("Lower Case: "+str.toLowerCase());
		
		//Concatenates two String
		System.out.println("Concatenated: "+str.concat(str2));
		
		
	}

}
