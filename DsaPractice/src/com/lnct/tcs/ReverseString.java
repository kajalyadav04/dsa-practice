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
	public static String reverseStringUsingLogic(String s) {
        // code here
        StringBuilder k= new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            k.append(ch);
            
        }
        return k.toString();
    }

}
