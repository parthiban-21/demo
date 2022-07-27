package main.java.com.chainsys.day8;

import java.util.Scanner;

public class ToDoAppValidation {
	Scanner ip = new Scanner(System.in);
	String UserName;
	String Password;
	String tasks[];
	String location="Madurai";

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
		//String pattern = "(?=.[0-9])";
		
		if ((password.length()>7) && (!password.isBlank())) {
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
		tasks = new String[n];

		for(int j=0;j<n;j++)
		{
			System.out.println("Enter the Task "+(j+1));
			tasks[j]=ip.next();
		}
	}
	
	//Tasks at Default Location
	public void displayTasks() 
	{
		System.out.println("Your Tasks at "+location+" are :");
		int i=1;
		for (String str : tasks) {
			System.out.println((i++)+". "+str);
		}
	}
}
