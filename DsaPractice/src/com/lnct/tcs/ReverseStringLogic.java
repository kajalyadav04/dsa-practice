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
		for(int i=input.length()-1;i>=0;i--) {
			char ch=input.charAt(i);
			reString+=ch;
		}
		return reString;
	}

	private static String reverseString(String input) {
		// TODO Auto-generated method stub
		char[] arr= input.toCharArray();
		String reString="";
		for(int i=arr.length-1;i>=0;i--) {
			 reString+=arr[i];
		}
		return reString;
	}

}
