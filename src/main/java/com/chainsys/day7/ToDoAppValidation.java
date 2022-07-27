package main.java.com.chainsys.day7;

import java.util.Scanner;

public class ToDoAppValidation implements ToDoMethods {

	Scanner ip = new Scanner(System.in);
	String UserName;
	String Password;

	// Validation for UserName
	public Boolean usernameValidator(String username) 
	{
		if (username.length()>5 && (!username.isBlank()))
			return true;
		else
			return false;
	}

	// Validation for Password
	public Boolean passwordValidator(String password) 
	{
		String pattern = "(?=.[0-9])(?=.[a-z])(?=.[A-Z])(?=.[@#$%^&+=])";
		if ((password.length()>7) &&(!password.isBlank())) {
			return true;	
		}

		else
			return false;
	}

	// Verify Login
	public Boolean verifyLogin(String username, String password)
	{
		if (username.equals(UserName) && password.equals(Password)) {

			return true;
		}
		else
		{
			return false;
		}
	}

	//Add Task
	public void addTask() 
	{
		System.out.println("Enter No of Taskes");
		int n = ip.nextInt();
		String tasks[] = new String[n];

		for(int j=0;j<n;j++)
		{
			System.out.println("Enter the Task "+(j+1));
			tasks[j]=ip.next();
		}
		System.out.println("Your ToDo are:");
		for (String string : tasks) {
			System.out.println(string);
		}
	}

}

