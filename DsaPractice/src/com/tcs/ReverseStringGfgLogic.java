package com.tcs;

import java.util.Scanner;

public class ReverseStringGfgLogic {
	public static void main(String[] args){
	    
	    Scanner sc = new Scanner(System.in);
	    String s=sc.next();
	    String r=reverseStr(s);
	    System.out.println(r);
	    String kString=reverseStringUsingtoCharArray(s);
	    System.out.println(kString);
	    }
	    public static String reverseStr(String s){
	        String newStr="";
	        for(int i=0;i<s.length();i++){
	            char ch=s.charAt(i);
	            newStr=ch+newStr;
	        }
	        return newStr;
	    }
	    public static String reverseStringUsingtoCharArray(String str) {
	    	char[] a=str.toCharArray();
	        String s="";
	        for(int i=a.length-1;i>=0;i--){
	           s+=a[i];
	        }
	        return s;
	    }

}
