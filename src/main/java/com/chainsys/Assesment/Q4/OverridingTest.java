package main.java.com.chainsys.Assesment.Q4;

public class OverridingTest {

	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();

		p.displayParent();// Calls Parent Method
		c.displayChild(); // Calls Child Class Method
		c.displayParent();// Calls Parent Class Method with Child Class Object, Overrinding Happens
	}

}
