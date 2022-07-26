package com.chainsys.assignment3;

import java.util.Scanner;
import com.chainsys.assignment2.*;

public class AttendanceCalc {

	public static void main(String[] args) {
		Attendance obj = new Attendance();
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter Total Number of Classes Held :");
		obj.classHeld = inp.nextFloat();

		System.out.print("Enter Total Number of Classes Attended :");
		obj.classAttended = inp.nextFloat();
		
		System.out.print("Medical Cause, Y or N :");
		obj.Medic = inp.next();

		double attendPercent = (obj.classAttended * 100) / obj.classHeld;
		if ((attendPercent < 75 && obj.Medic.equals("Y")) || attendPercent > 75) {
			System.out.println("Eligile to Attend Exam");
		} else if (attendPercent < 75 && obj.Medic.equals("N")) {
			System.out.println("Not Eligile to Attend Exam");
		}
	}

}
