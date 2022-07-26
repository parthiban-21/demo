package com.chainsys.day5;

import java.util.Arrays;

public class SortAscending {

	public static void main(String[] args) {
		String[] name = {"Ram","Ravi","Siva","Akesh","Saru","Vennila","Jana","Praveen","Thennu","Prathiksha"};
		Arrays.sort(name);
		for (String string : name) {
			System.out.println(string);
		}
	}
}
