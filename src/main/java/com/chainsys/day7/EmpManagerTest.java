package com.chainsys.day7;

public class EmpManagerTest {

	public static void main(String[] args) {
		
		Manager m = new Manager("Akesh",23,98765430000l,"Nagercoil",20000);
		Employee e = new Employee("Parthi",22,7612345890l,"Madurai",12000);
		
		System.out.println("Manager Details:");
		System.out.println("Name: "+m.name+"\nAge: "+m.age+"\nPhone Numer: "+m.phoneNumber+"\nAddress: "+m.address+"\nSalary: "+m.salary);
		System.out.println("Department: "+m.displayRole("Product Development"));
		System.out.println("\nEmployee Details:");
		System.out.println("Name: "+e.name+"\nAge: "+e.age+"\nPhone Numer: "+e.phoneNumber+"\nAddress: "+e.address+"\nSalary: "+e.salary);
		System.out.println("Specialization: "+e.displayRole("Java Trainee"));
		
	}
}
