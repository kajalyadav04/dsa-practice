package com.tcs;

import java.util.Scanner;

public class RemoveSpaces {
	public static void main (String args[]){
		  Scanner sc=new Scanner(System.in);
		  String str=sc.nextLine();
		  String r= removeSpaces(str);
		  System.out.println(r);
		  String kString= removeS(str);
		  System.out.println(kString);
	}
		    
		public static String removeSpaces(String str){
		    // char[] a=str.toCharArray();
		    String s="";
		   for(int i=0;i<str.length();i++){
		       char ch=str.charAt(i);
		       if(ch==' '){
		           continue;
		       }else{
		         s+=ch;  
		       }
		   }
		   return s;
		}
		public static String removeS(String str) {
			String kString= str.replaceAll("\\s+", "");
			return kString;
		}
		

}
