package main.java.com.chainsys.day13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileBufferConcept {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		File f = new File("NewFile.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br = new BufferedReader(fr);

		if(f.exists())
		{
			int i;
			while((i=br.read())!=-1)
				System.out.print((char)i);
			br.close();
			fr.close();
		}
	}
}
