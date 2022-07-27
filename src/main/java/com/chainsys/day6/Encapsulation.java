package main.java.com.chainsys.day6;

public class Encapsulation {
	private String name;
	private int rollNo;
	
	// Get Name
	public String getName(String name) {
		this.name = name;
		return this.name;
	}
	// Set Name
	public void setName() {
		System.out.println(this.name);
	}
	// Get RollNo
	public int getRollNo(int rollNo) {
		this.rollNo = rollNo;
		return this.rollNo;
	}
	// Set RollNo
	public void setRollNo() {
		System.out.println(this.rollNo);
	}
	
}
