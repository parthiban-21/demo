package main.java.com.chainsys.Assesment.Q11;

import java.util.Scanner;

public class UserDefinedException extends Exception {

		public static void main(String[] args) {
			Scanner ip = new Scanner(System.in);

			System.out.print("Enter the Number: ");
			int num = ip.nextInt();
			try 
			{
				if (num<0) {
					throw new UserDefinedException();
				}
				else
					System.out.println("Greater than 0");
			}
			catch(UserDefinedException exception){
				System.out.println("UserDefined Exception");
			}

	}

}
