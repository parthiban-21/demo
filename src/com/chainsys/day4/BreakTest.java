package com.chainsys.day4;
import java.util.*;

public class BreakTest {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter the End Number: ");
		int endNum = ip.nextInt();
		for (int i=0;i<=endNum;i++)
		{
			if (i%2!=0)
				break;
			System.out.println(i);
		}
	}

}
