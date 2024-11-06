package com.tcs;

import java.util.Scanner;

public class captilizeFirstAndLast {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String k=captilalize(s);
		System.out.println(k);
	    // System.out.println(s);
	}
	    public static String captilalize(String s){
	        String firstLetter = s.substring(0,1).toUpperCase();
	        String middleLetter = s.substring(1,s.length()-1);
	        String lastLetter = s.substring(s.length()-1).toUpperCase();
	        return firstLetter+middleLetter+lastLetter;
	    }

}
