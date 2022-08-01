package main.java.com.chainsys.day9;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Collections {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<CollectionsUser> user = new ArrayList<CollectionsUser>();
		CollectionsUser cUser = new CollectionsUser();
		al.add(3269);
		al.add(3169);
		al.add(2, 3000);
		al.sort(null); // Sorts the Integer ArrayList
		System.out.println("ArrayList: "+al);
		
		pq.add(3002);
		pq.add(3001);
		pq.add(3000);
		System.out.println("Priority Queue: "+pq); // Priority Queue Print Only Sorted Array
		System.out.println("Peek :"+pq.peek()); // Peek Prints First Element
		pq.poll(); //Poll Removes First Element
		System.out.println("After Poll :"+pq);
		
		user.add(cUser);
		System.out.println(user.toString());
		
	}

}
