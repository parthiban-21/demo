package com.chainsys.day6;

import java.util.Scanner;

public class BankCakcTest {

	public static void main(String[] args) {
		BankCalc obj = new BankCalc();
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter the Bank No to Get Balance : ");
		int bank = ip.nextInt();
		if (bank>0 && bank <=3)
			System.out.println("Balance in Bank "+bank+" is $"+obj.getBalance(bank-1));
		else
			System.out.println("Invalied Bank Number");
	}

}
