package com.chainsys.training.test;

import com.chainsys.training.Student;

public class StudentTest {

	public static void main(String[] args) {

		Student student = new Student();//Instance Variable
		student.rollNo = 10;
		student.name = "Parthiban";
		student.gender = 'm';
		student.mobileNumber = 345678999986l;
		System.out.println(student.name);

		Student student1 = new Student();
		System.out.println(student1);

	}

}
