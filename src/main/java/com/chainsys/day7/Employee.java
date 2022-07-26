package com.chainsys.day7;

public class Employee extends Member {
	String specialization;

	public Employee(String name,int age,long phoneNumber, String address, int salary) {
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.salary = salary;
	}
	public String displayRole(String spl) {
		this.specialization = spl;
		return this.specialization;
	}
}
