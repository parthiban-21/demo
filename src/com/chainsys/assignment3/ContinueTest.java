package com.chainsys.assignment3;
import java.util.*;

public class ContinueTest {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the End Number: ");
		int endNum = ip.nextInt();
		for (int i=0;i<=endNum;i++)
		{
			if (i%2!=0)
				continue;
			System.out.println(i);
		}
	}

}
