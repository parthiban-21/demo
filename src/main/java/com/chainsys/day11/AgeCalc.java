package main.java.com.chainsys.day11;

import java.time.LocalDate;
import java.util.Scanner;

public class AgeCalc {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Date of Birth in yyyy-MM-dd:");
		String dob = s.next();
		LocalDate birthday = LocalDate.parse(dob);
		LocalDate today = LocalDate.now();
		
		System.out.println(birthday);
		
		int age = today.compareTo(birthday);
		System.out.println("Your are "+age+" Years Old");
	}

}
