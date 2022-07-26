package com.chainsys.day3;
import java.util.*;
public class DiamondPattern {

	public static void main(String[] args) 
	{
		int row, i, j, space = 1;  
		System.out.print("Enter the number of rows you want to print: ");  
		Scanner ip = new Scanner(System.in);  
		row = ip.nextInt();  
		row /=2;
		space = row - 1; 
		//Prints first Half
		for (j = 1; j<= row; j++)  
		{  
			//Prints Space 
			for (i = 1; i<= space; i++)  
			{  
				System.out.print(" ");  
			}  
			space--; 
			//Prints "*"
			for (i = 1; i <= 2 * j - 1; i++)  
			{  
				System.out.print("*");  
			}  
			System.out.println("");  
		}  
		space = 1; 
		//Prints Second Half
		for (j = 1; j<= row - 1; j++)  
		{  
			//Prints Space
			for (i = 1; i<= space; i++)  
			{  
				System.out.print(" ");  
			}  
			space++;  
			//Prints "*"
			for (i = 1; i<= 2 * (row - j) - 1; i++)  
			{  
				System.out.print("*");  
			}  
			System.out.println("");  
		} 
	}

}
