package main.java.com.chainsys.day13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("NewFile.txt");
		Scanner r = new Scanner(f);
		if(f.exists())
		{
			while(r.hasNextLine()) {
				String read = r.next();
				System.out.println(read);
			}
		}
		else
		{
			System.out.println("File Not Found");
		}
	}
}
