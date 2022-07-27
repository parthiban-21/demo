package main.java.com.chainsys.day6;

import java.util.Scanner;

public class StudentDetailsTest {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		StudentDetails obj = new StudentDetails();
		//StudentDetails[] in = new StudentDetails[10];
		

			System.out.println("Enter the Name of Studend :");
			String name = ip.next();
			System.out.println("Enter the Age of Studend :");
			int age = ip.nextInt();
			System.out.println("Enter the Address of Studend :");
			String address = ip.next();
			obj.setInfo(name, age, address);
		
	}
}
