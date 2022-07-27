package main.java.com.chainsys.day6;

import java.util.Scanner;

public class EncapsulationTest {

	public static void main(String[] args) {
		Scanner ip = new Scanner (System.in);
		Encapsulation obj = new Encapsulation();
		Validation v = new Validation();
		System.out.println("Enter the Name:");
		String name = ip.next();
		if (v.nameValidator(name)) {
			obj.getName(name);
		}
		else
			System.out.println("Invalied Name");
		
		System.out.println("Enter the Roll no:");
		int rollNo = ip.nextInt();
		if (v.rollNoValidator(rollNo)) {
			obj.getRollNo(rollNo);
		}
		else
			System.out.println("Invalied Number");
		
		obj.setName();
		obj.setRollNo();
	}

}
