package com.chainsys.day3;
import java.util.*;
public class NumPattern {

	public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int rows = ip.nextInt();
        for (int i = 0; i <= rows - 1; i++) 
        {
        	// Print Spaces
            for (int j = 0; j < i; j++) 
            {
                System.out.print(" ");
            }
            // Print 0 & 1
            for (int k = 0; k <= rows - (i - 1); k++) 
            {
                if (k % 2 != 0)
                    System.out.print("0 ");
                else
                    System.out.print("1 ");
            }
            System.out.println();
        }

	}

}
