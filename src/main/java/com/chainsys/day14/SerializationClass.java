package main.java.com.chainsys.day14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationClass {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//serialization();
		deserialization();

	}
	
	public static void serialization() throws IOException {
		StudentClass s1 = new StudentClass(3001, "Akesh", 23);
		StudentClass s2 = new StudentClass(3002, "Praveen", 24);
		System.out.println(s1);
		System.out.println(s2);
		FileOutputStream fos = new FileOutputStream("output.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.writeObject(s2);
		oos.flush();
		oos.close();
		System.out.println("Serialization Sucessfull");
	}
	
	public static void deserialization() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("output.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		StudentClass s1 = (StudentClass) ois.readObject();
		System.out.println(s1);
		StudentClass s2 = (StudentClass) ois.readObject();
		System.out.println(s2);
		ois.close();
		fis.close();
	}

}
