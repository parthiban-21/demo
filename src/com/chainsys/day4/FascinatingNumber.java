package com.chainsys.day4;

import java.util.Scanner;

public class FascinatingNumber {

	public static void main(String[] args) {
		int num, n2, n3,t = 0;   
		Scanner ip=new Scanner(System.in);  
		System.out.print("Enter any Number: ");  
		num = ip.nextInt();  
		n2 = num * 2;  
		n3 = num * 3;  
		//concatenating num, n2, and n3
		// Include a String to Convert Int to String
		String concatstr = num + "" + n2 + n3;  
		System.out.println("Concat String : "+concatstr);
		//checks all digits present or not 
		for(char c = '1'; c <= '9'; c++)  
		{  
			int count = 0;   
			for(int i = 0; i < concatstr.length(); i++)  
			{  
				char ch = concatstr.charAt(i);   
				if(ch == c)    
					count++;  
			}  
			if(count > 1 || count == 0)  
			{  
				t = 1;  
				break;  
			}  
		}  
		if(t==0)  
			System.out.println(num + " is a fascinating number.");  
		else  
			System.out.println(num + " is not a fascinating number.");  
	}

}
