package com.tcs;

import java.util.Scanner;

public class PrintAscii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch=sc.next().charAt(0);
//		System.out.println(ch);
		int k=asciiFunction(ch);
		System.out.println(k);
		

	}
	public static int asciiFunction(char ch) {
		int n=(int)ch;
		return n;
		
	}

}
