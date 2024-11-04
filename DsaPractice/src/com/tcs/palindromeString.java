package com.tcs;

import java.util.Scanner;

public class palindromeString {
	
	    public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        String k = sc.next();
	        int r=k.length();
	        StringBuilder s=new StringBuilder();
	        for(int i=k.length()-1;i>=0;i--){
	            char ch = k.charAt(i);
	            s.append(ch);
	            
	            
	            
	        }
	        String l=s.toString();
	        if(l.equals(k)){
	            System.out.println("y");
	        }
	        else{
	            System.out.println("n");
	        }
	    }
	

}
