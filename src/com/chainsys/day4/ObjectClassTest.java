package com.chainsys.day4;

public class ObjectClassTest {

	public static void main(String[] args) {
		ObjectClass[] obj=new ObjectClass[4];
		obj[0]=new ObjectClass(2, 56728933);
		obj[1]=new ObjectClass(6, 46378921);
		obj[2]=new ObjectClass(36,45367892);
		obj[3]=new ObjectClass(16,673892809);
		
		for(int i=0;i<obj.length;i++) {
			System.out.println(obj[i].eno+" "+obj[i].mobile);
		}
		
		
	}

}
