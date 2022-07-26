package com.chainsys.assignment2;

import java.util.Scanner;

public class AttendanceTest {

	public static void main(String[] args) {
		Attendance obj = new Attendance();
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter Total Number of Classes Held :");
		obj.classHeld = inp.nextInt();
		System.out.print("Enter Total Number of Classes Attended :");
		obj.classAttended = inp.nextInt();
		
		double attendPercent = (obj.classAttended*100)/obj.classHeld;
		if (attendPercent > 75)
		{
			System.out.println("Eligile to Attend Exam");
		}
		else {
			System.out.println("Not Eligile to Attend Exam");
		}
	}

}
