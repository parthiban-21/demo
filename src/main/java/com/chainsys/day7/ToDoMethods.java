package com.chainsys.day7;

public interface ToDoMethods {
	
	public Boolean usernameValidator(String username);
	public Boolean passwordValidator(String password); 
	public Boolean verifyLogin(String username, String password);
	public void addTask();
}
