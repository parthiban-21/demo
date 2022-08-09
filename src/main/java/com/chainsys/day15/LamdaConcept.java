package main.java.com.chainsys.day15;

import java.util.ArrayList;
import java.util.Scanner;

public class LamdaConcept {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println("Enter 5 Numbers: ");
		for(int i=0;i<5;i++) {
			int num = in.nextInt();
			al.add(num);
		}
		al.sort(null);
		al.forEach((n)->System.out.println(n));
	}
}
