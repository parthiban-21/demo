package main.java.com.chainsys.day7;

public class AbstractTestClass {

	public static void main(String[] args) {
		AbstractClass obj = new AbstractClass() 
		{
			public void addTask() {
				System.out.println("Add Task Updated");
			}
			@Override
			public void updateTask() {
				System.out.println("Task Updated");
			}
		};
		obj.addTask();
		obj.deleteTask();
		obj.updateTask();
	}

}
