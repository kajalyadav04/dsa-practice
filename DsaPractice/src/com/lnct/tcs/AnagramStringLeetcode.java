package com.lnct.tcs;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramStringLeetcode {
	public static void main(String args[]) {
		Scanner sc =  new Scanner(System.in);
		String n1=sc.next();
		String n2=sc.next();
		boolean k=	isAnagram(n1,n2);
		if(k) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
	
	    public static boolean isAnagram(String s, String t) {
	        if(s.length()!=t.length()){
	                return false;
	            }
	        int[] count= new int[26];
	        for(int i=0;i<s.length();i++){

	            count[s.charAt(i)-'a']++;
	        }
	         for(int i=0;i<t.length();i++){

	            count[t.charAt(i)-'a']--;
	        }
	        for(int k:count){
	            if(k!=0){
	                return false;
	            }
	            
	        }
	        return true;
	        
	    }
	    public boolean isAnagramLogic(String s, String t) {
	        if(s.length()!=t.length()){
	                return false;
	            }
	        char[] a=s.toCharArray();
	        char[] b=t.toCharArray();
	        Arrays.sort(a);
	        Arrays.sort(b);
	      
	        return Arrays.equals(a,b);
	}
	
}
