package main.java.com.chainsys.day8;

import java.util.Scanner;

public class ToDoAppTest {

	public static void main(String[] args) {
		Scanner ip = new Scanner (System.in);
		ToDoApp obj = new ToDoApp();
		ToDoAppValidationChild v = new ToDoAppValidationChild();

		//Get New UserName
		int i=0;
		while(i==0) 
		{
			System.out.print("Enter New UserName:");
			String userName = ip.next();
			if (v.usernameValidator(userName)) 
			{
				obj.getUserName(userName);
				++i;
			}
			else
				System.out.println("Invalid Username");
		}

		//Get New Password
		i=0;
		while(i==0)
		{
			System.out.print("Enter New Password:");
			String passWord = ip.next();
			if (v.passwordValidator(passWord)) 
			{
				obj.getPassWord(passWord);
				++i;
			}
			else
				System.out.println("Invalid Password");
		}

		v.UserName=obj.setUserName();
		v.Password=obj.setPassWord();

		//Login Details
		i=0;
		while(i==0)
		{
			System.out.print("Enter the Username:");
			String userName = ip.next();
			System.out.print("Enter the Password:");
			String passWord = ip.next();
			if(v.verifyLogin(userName, passWord)) 
			{
				System.out.println("Login Successfull");
				++i;
			}
			else
			{
				System.out.println("Invalied Login\nTry Again..");
			}
		}

		//Add Tasks
		v.addTask();
		v.displayTasks();
		System.out.println("Do you wish to change your location ? (Y or N)");
		String locationCheck = ip.next();
		v.checkLocation(locationCheck);

	}

}
