package main.java.com.chainsys.day7;

public class Manager extends Member {
	String department;
	
	public Manager(String name,int age,long phoneNumber, String address, int salary) {
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.salary = salary;
	}
	public String displayRole(String dept) {
		this.department = dept;
		return this.department;
	}
}
