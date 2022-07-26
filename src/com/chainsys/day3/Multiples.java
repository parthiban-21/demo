package com.chainsys.day3;
import java.util.*;

public class Multiples {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter the Multipication Table:");
		int m = ip.nextInt();
		for (int i=0 ; i<=10; i++)
			System.out.println(i*m);

	}

}
