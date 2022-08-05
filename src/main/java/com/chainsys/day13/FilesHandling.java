package main.java.com.chainsys.day13;

import java.io.File;

public class FilesHandling {

	public static void main(String[] args) {
		File f = new File("NewFile1.txt");

		try
		{
			if (f.exists())
				System.out.println("File Already Exists");
			else {
				System.out.println("File Created :"+f.createNewFile());
				System.out.println("Path: "+f.getAbsolutePath());
				System.out.println("Name: "+f.getName());
				System.out.println("Can Read: "+f.canRead());
				System.out.println("Can Write: "+f.canWrite());
				System.out.println("Size: "+f.length());
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
