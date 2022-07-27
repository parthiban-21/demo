package main.java.com.chainsys.day8;

public class ToDoAppValidationChild extends ToDoAppValidation{
	String location = "Chennai";

	//Tasks at Default Location
	public void displayTasks() 
	{
		System.out.println("Your Tasks at "+location+" are :");
		int i=1;
		for (String str : tasks) {
			System.out.println((i++)+". "+str);
		}
	}
	
	public void checkLocation(String locationCheck)
	{
		if (locationCheck.equals("Y")) {
			System.out.println("Location Changed Successfully...");
			super.displayTasks();//Madurai
		}
		else
			displayTasks();
	}
}
