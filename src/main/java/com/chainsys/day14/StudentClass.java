package main.java.com.chainsys.day14;

import java.io.Serializable;

public class StudentClass implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int rollNo;
	public String name;
	public int age;
	
	public StudentClass(int rollno,String name,int age) {
		this.rollNo = rollno;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "StudentClass [rollNo=" + rollNo + ", name=" + name + ", age=" + age + "]";
	}
}
