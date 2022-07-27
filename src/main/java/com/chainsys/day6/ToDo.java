package main.java.com.chainsys.day6;

public class ToDo {
	private String userName;
	private String passWord;
	
	//Get Username
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
