package com.chainsys.day4;
import java.util.*;
public class ArrayTest {
	public static void main(String args[]) {
		int a1[];
		int a2[] = {1,2,5,4,3};
		String name[] = {"Raj","Raju","Raja"};
		int a3[]= new int [2];
		// Prints Array
		System.out.println(Arrays.toString(a2));
		// Sort Array
		Arrays.sort(a2);
		// Print Array after Sorting
		System.out.println(Arrays.toString(a2));
		// Binary Search
		System.out.println(Arrays.binarySearch(a2,4));
		// Copy Array
		Arrays.copyOf(a2, 8);
		System.out.println(Arrays.toString(a2));
		}
}
