package main.java.com.chainsys.day6;

public class Validation {
	// Validator for Name
	public Boolean nameValidator(String name) {
		if (name.length()>4 && (!name.isBlank())) {
			return true;
		}

		else {
			return false;
		}	
	}

	// Validator for Name
	public Boolean rollNoValidator(int rollNo) {
		if (rollNo != 0 && rollNo>0) {
			return true;
		}

		else {
			return false;
		}	
	}
}
