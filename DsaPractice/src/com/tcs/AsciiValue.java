package com.tcs;

import java.util.Scanner;

public class AsciiValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc= new Scanner(System.in);
         String ch=sc.next();
         char c=ch.charAt(0);
         asciifn(c);
	}

	private static void asciifn(char ch) {
		// TODO Auto-generated method stub
		int k=(int)ch;
		System.out.println(k);
		
	}

}
