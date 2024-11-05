package com.tcs;

import java.util.Scanner;

public class RemoveVowel {
	
	    public static void main(String args[]){
	        Scanner sc=new Scanner(System.in);
	        String s=sc.nextLine();
	        String p= removeVowel(s);
	        System.out.println(p);
	        
	        String k= removeVr(s);
	        System.out.println(k);
	     }
	     public static String removeVr(String s){
	         return s.replaceAll("[aeiouAEIOU]","");
	     }

	    public static String removeVowel(String s){
	         String newStr="";
	        for(int i=0;i<s.length();i++){
	            char ch=s.charAt(i);
	           
	            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
	              continue;  
	            }else{
	                newStr+=ch;
	            }
	            
	        }
	        return newStr;
	    } 
	}


