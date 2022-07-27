package main.java.com.chainsys.day8;

import java.util.ArrayList;
import java.util.LinkedList;

public class Collection {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		LinkedList ll = new LinkedList();
		
		al.add("Parthiban");
		al.add(1, 3269);
		//al.remove(0);
		al.add("Chain-Sys");
		
		//Prints Array List
		for (Object object : al) {
			System.out.println(object);
		}
		
		//Is Empty Method
		System.out.println(al.isEmpty());
		
		//Prints Size of Array List
		System.out.println(al.size());
		
		ll.add(al); //Adding Object to Linked List
		
		//Prints Linked List
		for (Object object : ll) {
			System.out.println(object);
		}
	}

}
