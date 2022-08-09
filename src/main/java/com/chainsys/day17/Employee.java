package main.java.com.chainsys.day17;

public class Employee {
	public String name;
	public int age;
	public int salary;
	public String department;
	public String gender;
	
	public Employee (String name,int age,int salary, String dept, String gender) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.department = dept;
		this.gender = gender;
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", department=" + department
				+ ", gender=" + gender + "]";
	}
	
}
