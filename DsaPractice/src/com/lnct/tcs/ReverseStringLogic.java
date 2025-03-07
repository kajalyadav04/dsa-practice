package com.lnct.tcs;

import java.util.Scanner;

public class ReverseStringLogic {
	public static  void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String input= sc.next();
		String kString=reverseString(input);
		System.out.println(kString);
		String kString2=reverseStringUsingChatAt(input);
		System.out.println(kString2);
	}

	private static String reverseStringUsingChatAt(String input) {
		// TODO Auto-generated method stub
		String reString="";
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			reString+=ch;
		}
		return reString;
	}

	private static String reverseString(String input) {
		// TODO Auto-generated method stub
		char[] arr= input.toCharArray();
		String reString="";
		for(int i=0;i<arr.length;i++) {
			 reString+=arr[arr.length-i];
		}
		return reString;
	}

}
