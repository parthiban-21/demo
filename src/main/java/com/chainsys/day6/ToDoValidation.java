package com.chainsys.day6;

public class ToDoValidation {
	ToDo obj = new ToDo();
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
			if (password.length()>7 && (!password.isBlank()))
				return true;
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
}
