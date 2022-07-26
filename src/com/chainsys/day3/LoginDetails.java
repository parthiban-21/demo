package com.chainsys.day3;

import java.util.*;

public class LoginDetails {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int i=0;
		while(i==0) 
		{
			//Get User Name
			System.out.print("Enter User Name: ");
			String username = ip.next();
			//Get Password
			System.out.print("Enter Password: ");
			String password = ip.next();
			//Check the Login 
			if (username.equals("parthiban@gmail.com") && password.equals("parthi")) 
			{
				System.out.println("Login Successful");
				++i;
			}
			else
				System.out.println("Login Failed, Try Again");
		}
	}

}
