package com.thinkinjava;



public class URShift {

	public static void main(String[] args) {
		int i = -1;
		System.out.println(Integer.toBinaryString(i));
		i>>>=10;
		System.out.println(i);
		System.out.println(Integer.toBinaryString(i));
		
		long l = -1;
		System.out.println(Long.toBinaryString(l));
		l>>>=10;
		System.out.println(l);
		
		short s = 0x7fff;
		System.out.println(Integer.toBinaryString(s));
		//s>>>=10;
		System.out.println(s);
		
		byte b = 127;
		b>>>=10;
		System.out.println(b);
		
		int i1 =0x2f;
		System.out.println(i1);
	}

}
