package com.lnct.tcs;

import java.util.Scanner;

public class ReverseString {
	public static  void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String input= sc.next();
		String kString=reverseString(input);
		System.out.println(kString);
	}
	public static String reverseString(String str) {
		StringBuilder kStringBuilder = new StringBuilder(str).reverse();
		return kStringBuilder.toString();
		
	}

}
