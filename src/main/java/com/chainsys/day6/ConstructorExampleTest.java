package main.java.com.chainsys.day6;

public class ConstructorExampleTest {

	public static void main(String[] args) {
		ConstructorExample obj = new ConstructorExample();
		System.out.println(obj.age);
		System.out.println(obj.name);
		
		ConstructorExample obj2 = new ConstructorExample(10,"");
		System.out.println(obj2.age);
		System.out.println(obj2.name);
	}

}
