package com.tcs;

import java.util.Scanner;

public class ReverseStringGfgLogic {
	public static void main(String[] args){
	    
	    Scanner sc = new Scanner(System.in);
	    String s=sc.next();
	    String r=reverseStr(s);
	    System.out.println(r);
	    }
	    public static String reverseStr(String s){
	        String newStr="";
	        for(int i=0;i<s.length();i++){
	            char ch=s.charAt(i);
	            newStr=ch+newStr;
	        }
	        return newStr;
	    }

}
