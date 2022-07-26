package com.chainsys.day3;
import java.util.*;
public class Patterns {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter no of Rows: ");
		int row = ip.nextInt();
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<=i; j++)  
				System.out.print("* ");   
		System.out.print("\n");
		}
	}

}
