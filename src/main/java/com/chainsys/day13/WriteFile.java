package main.java.com.chainsys.day13;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile {

	public static void main(String[] args) throws IOException 
	{
		Scanner ip = new Scanner(System.in);
		File f = new File("NewFile.txt");
		FileWriter fw = new FileWriter("NewFile.txt");
		if(f.exists())
		{
			System.out.println("Enter the Something:");
			String write = ip.nextLine();
			fw.write(write);
			fw.close();
			System.out.println("Writen Successfully");
		}
		else 
		{
			System.out.println("File Not Found");
		}
	}
}
