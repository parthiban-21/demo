package com.chainsys.assignment3;

import java.util.*;

public class MarkCalc {
	Scanner ip = new Scanner(System.in);
	public void calcMark(int score) 
	{
		if (score<=25)
		{
			System.out.println("Extracurricular Activities ?");
			String activity = ip.next();
			if (activity.equals("Y"))
				System.out.println("Good!, Your Score : "+(++score));
			else if(activity.equals("N"))
				System.out.println("Should Improve!, Your Score : "+(--score));
			else
				System.out.println("Invalied Activivity");
		}
		else 
			System.out.println("Your Score : "+score);
	}
}
