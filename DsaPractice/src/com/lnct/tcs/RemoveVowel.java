package com.lnct.tcs;

import java.util.Scanner;

public class RemoveVowel {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String string=scanner.nextLine();
		String a= removeVowels(string);
		System.out.println(a);
		
		
	}
	
	   public static String removeVowels(String s) {
	        // code here
	        String str="";
	        for(int i=0;i<s.length();i++){
	            char ch=s.charAt(i);
	            if("aeiou".indexOf(ch)!=-1){
	                continue;
	            }
	            else {
	                str+=ch;
	            }
	            
	            
	        }
	        return str;
	    }
	  public static  String removeVowelsusingStringBuikder(String s) {
	        // code here
	        StringBuilder str = new StringBuilder();
	        for(int i=0;i<s.length();i++){
	            char ch=s.charAt(i);
	            if("aeiouAEIOU".indexOf(ch)!=-1){
	                continue;
	            }
	            else {
	                str.append(ch);
	            }
	            
	            
	        }
	        return str.toString();
	    }
	  public static String removeVowelsUsingLogic(String s) {
	        // code here
	        StringBuilder str = new StringBuilder();
	        for(int i=0;i<s.length();i++){
	            char ch=s.charAt(i);
	            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
	                continue;
	            }
	            else {
	                str.append(ch);
	            }
	            
	            
	        }
	        return str.toString();
	    
	  }
	  public static String removeVr(String s){
	        return s.replaceAll("[aeiouAEIOU]","" );
	     }

	  
	

}
