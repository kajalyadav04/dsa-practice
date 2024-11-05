package com.tcs;

import java.util.Scanner;

public class RemoveCharExceptAlpa {
	
	    
	    public static void main(String[] args){
	        Scanner sc= new Scanner(System.in);
	        String s=sc.nextLine();
	       String k= removeVr(s);
	       System.out.println(k);
	       String kString= removeChRegrex(s);
	       System.out.println(kString);
	       
	    }
	    private static String removeChRegrex(String s) {
			// TODO Auto-generated method stub
			return s.replaceAll("[^a-zA-Z]", "");
		}
		public static String removeVr(String s){
	        String l="";
	       for(int i=0;i<s.length();i++){
	           char ch=s.charAt(i);
	           if(Character.isLetter(ch)){
	               l=l+ch;
	           }
	       }
	       return l;
	    }
	}


