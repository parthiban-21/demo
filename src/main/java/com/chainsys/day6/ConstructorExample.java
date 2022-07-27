package main.java.com.chainsys.day6;

public class ConstructorExample {
	public int age;
	public String name;
	
	//Constructor without Parameter
	public ConstructorExample() {
		age = 10;
		name = "Parthi";
	}
	
	//Constructor with Parameters
	public ConstructorExample(int age, String name)
	{
		this.age = 20;
		this.name = "Chainsys";
	}
}
