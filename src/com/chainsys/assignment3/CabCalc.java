package com.chainsys.assignment3;
import java.util.*;

public class CabCalc {
	Scanner ip = new Scanner(System.in);
	//Show Cab Price Details
	public void showDetails() 
	{
		System.out.println("Hi Welcome.\nSelec your Ride.!");
		System.out.println("Mini\t20rs/km\t3-Seater\nComfy\t40rs/km\t5-Seater\nPrime\t60rs/km\t7-Seater\n");
	}
	
	//Get Detail from User
	public void getDetail()
	{
		int i=0;
		while(i==0)
		{
			System.out.print("Choose the Car: ");
			String car = ip.next();
			if (car.equals("Mini"))
			{
				System.out.print("Enter No of Person: ");
				int carSeat = ip.nextInt();
				++i;
				while(i==1)
				{
					if (carSeat <= 3 && carSeat > 0)
					{
						System.out.print("Enter the Distance:");
						int dist = ip.nextInt();
						System.out.print("\nTotal Cost for Your Ride is "+(dist*20));
						++i;
					}
					else
					{
						System.out.println("Invalied Car Seats");
						--i;
					}
				}
			}
			else if(car.equals("Comfy"))
			{
				System.out.print("Enter No of Person: ");
				int carSeat = ip.nextInt();
				++i;
				while(i==1)
				{
					if (carSeat <= 5 && carSeat > 0)
					{
						System.out.print("Enter the Distance:");
						int dist = ip.nextInt();
						System.out.print("\nTotal Cost for Your Ride is "+(dist*40));
						++i;
					}
					else
					{
						System.out.println("Invalied Car Seats");
						--i;
					}
				}
			}
			else if(car.equals("Prime"))
			{
				System.out.print("Enter No of Person: ");
				int carSeat = ip.nextInt();
				++i;
				while(i==1)
				{
					if (carSeat <= 7 && carSeat > 0)
					{
						System.out.print("Enter the Distance:");
						int dist = ip.nextInt();
						System.out.print("\nTotal Cost for Your Ride is "+(dist*60));
						++i;
					}
					else
					{
						System.out.println("Invalied Car Seats");
						--i;
					}
				}
			}
			else
			{
				System.out.println("Invalied Car Type.");
			}
		}
		
		
	}


}
