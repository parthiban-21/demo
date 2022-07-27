package main.java.com.chainsys.day7;

public class ToDoApp {
	private String userName;
	private String passWord;
	
	//Get UserName
	public String getUserName(String name) {
		this.userName = name;
		return this.userName;
	}
	// Set Name
	public String setUserName() {
		return this.userName;
	}
	
	//Get Password
	public String getPassWord(String passWord) {
		this.passWord = passWord;
		return this.passWord;
	}
	// Set Password
	public String setPassWord() {
		return this.passWord;
	}
}
