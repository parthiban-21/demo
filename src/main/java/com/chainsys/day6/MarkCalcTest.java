package main.java.com.chainsys.day6;
import java.util.*;
public class MarkCalcTest {

	public static void main(String[] args) {
		MarkCalc obj = new MarkCalc();
		Scanner ip = new Scanner(System.in);
		double avg = obj.AverageCalc(10,20,30,40);
		System.out.println("Average is "+avg);
		System.out.println("Any ExtraCurricular Activities?");
		String extra = ip.next();
		if (extra.equals("Yes"))
			System.out.println("Average is "+obj.AverageCalc(extra,avg));
		else if(extra.equals("No"))
			System.out.println("Must Improve, Average is "+avg);
		else
			System.out.println("Invalied Input");
	}

}
