package com.chainsys.day3;
import java.util.*;
public class Rain {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int i=0;
		while(i==0)
		{
			System.out.println("Is it Raining?");
			String rainState = ip.next();
			if (rainState.equals("Yes"))
			{
				System.out.println("Take an Umbrella.");
				System.out.println("Whats is the Temperature?");
				int temp = ip.nextInt();
				if(temp<=32)
					System.out.println("Bring Heavy Jacket");
				else if(temp>32 && temp<=50)
					System.out.println("Bring Light Jacket");
				else
					System.out.println("No Jacket Required");
				++i;
			}
			else if(rainState.equals("No"))
			{
				System.out.println("No Need Umbrella");
				++i;
			}
			else
			{
				System.out.println("Invalied Input");
			}
		}
	}

}
