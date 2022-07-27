package main.java.com.chainsys.day8;

public class ErrorAndException {

	public static void main(String[] args) {
		int a=10;
		try 
		{
			System.out.println(a/0);
		}
		catch(Exception e) {
			System.out.println("This is Catch");
		}
		finally {
			System.out.println("This is Finally");
		}
	}
}
