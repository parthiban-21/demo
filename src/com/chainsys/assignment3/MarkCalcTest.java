package com.chainsys.assignment3;
import java.util.*;

public class MarkCalcTest {
	public static void main(String args[]) {
		MarkCalc obj = new MarkCalc();
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter the Mark Scored out of 100 :");
		int mark = inp.nextInt();
		if (mark >=0 && mark <=100)
			obj.calcMark(mark);
		else
			System.out.println("Invalied Mark");
		
	}

}
