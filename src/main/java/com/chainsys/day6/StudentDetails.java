package com.chainsys.day6;

public class StudentDetails {
	public String name,address;
	public int age;
	
	//Initialization or Default Values
	public StudentDetails()
	{
		name = "Unknown";
		age = 0;
		address = "Not Available";
	}
	public void setInfo(String name,int age,String address) {
		this.name=name;
		System.out.println(this.name);
		this.age=age;
		System.out.println(this.age);
		this.address=address;
		System.out.println(this.address);
	}
	
}
