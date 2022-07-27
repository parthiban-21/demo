package main.java.com.chainsys.day7;

public class ParentChildTest {

	public static void main(String[] args) {
		ParentClass p = new ParentClass();
		ChildClass c = new ChildClass();
		
		//p.displayParent(); //Method of Parent Class by Object of Parent Class
		c.displayChild(); //Method of Child Class by Object of Child Class
		//c.displayParent(); //Method of Parent Class by Object of Child Class
		//p.displayChild(); //Method of Child Class by Object of Parent Class not 
		p.getter();
		c.getter();
	}

}
