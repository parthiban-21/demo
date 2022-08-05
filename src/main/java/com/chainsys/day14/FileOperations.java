package main.java.com.chainsys.day14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class FileOperations {

	public static void main(String[] args) throws IOException {
		File f = new File("OldFile.txt");
		//createNewFile(f);
		f = renameFile(f);
		appendData(f,"Hello World");
		f = modifyData(f);
		readData(f);
		copyFile(f);
		moveFile(f);
	}

	//Creates New File and Display Details of File
	public static void createNewFile(File f) {
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

	//Rename File
	public static File renameFile(File f) {
		File fnew = new File ("NewName.txt");
		f.renameTo(fnew);
		return fnew; 
	}

	//Append Data on File
	public static void appendData(File f,String msg) throws IOException {
		FileWriter fw = new FileWriter(f.getName());
		if(f.exists())
		{
			fw.write(msg);
			fw.close();
			System.out.println("Writen Successfully");
		}
		else 
		{
			System.out.println("File Not Found");
		}
	}

	//Modify Data On File
	public static File modifyData(File f) throws IOException {
		FileReader r = new FileReader(f);
		BufferedReader bf = new BufferedReader(r);
		ArrayList<String> temp = new ArrayList<String>();
		if(f.exists())
		{
			String line = null;
			while((line= bf.readLine()) != null) {
				if(line.contains("World")) 
					line = line.replace("World", "Chain-Sys");
				temp.add(line);
			}
			r.close();
			bf.close();
			
			FileWriter fw1 = new FileWriter(f);
            BufferedWriter out = new BufferedWriter(fw1);
            for(String s : temp)
                 out.write(s);
            out.flush();
            out.close();
           
            System.out.println("Successfully modified");
		}
		else
		{
			System.out.println("File Not Found");
		}
		return f;
	}

	//Read Data On File
	public static void readData(File f) throws FileNotFoundException {
		Scanner r = new Scanner(f);
		if(f.exists())
		{
			while(r.hasNextLine()) {
				String read = r.nextLine();
				System.out.println(read);
			}
		}
		else
		{
			System.out.println("File Not Found");
		}
	}

	//Delete File
	public static void deleteFile(File f) {
		f.delete();
		System.out.println(f.getName()+" Deleted");
	}

	//Copy File
	public static void copyFile(File f) throws IOException {
		Scanner r = new Scanner(f);
		FileWriter fw = new FileWriter("CopiedFile.txt");
		if(f.exists())
		{
			while(r.hasNextLine()) {
				String read = r.nextLine();
				fw.write(read);
			}
			fw.close();
			System.out.println("Copied Successfully");
		}
		else
		{
			System.out.println("File Not Found");
		}
	}

	//Move File
	public static void moveFile(File f) throws IOException {
		Path move = Files.move(Paths.get("CopiedFile.txt"), Paths.get("MovedFile.txt"));
		if(move != null)
			System.out.println("Moved Successfully");
		else
			System.out.println("Move Failed");
	}

}
