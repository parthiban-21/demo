package com.chainsys.hackerrank;
import java.io.*;
import java.util.*;
public class StringIntro {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int a1 = A.length();
        int b1 = B.length();
        
        System.out.println(a1+b1);
        
        if (a1>b1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

	}

}
