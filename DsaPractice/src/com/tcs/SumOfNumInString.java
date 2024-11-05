package com.tcs;

import java.util.Scanner;

public class SumOfNumInString {
	public static void main (String[] args) {
		 Scanner sc= new Scanner(System.in);
		 String s=sc.nextLine();
		 int k=sumOfNumberInString(s);
		 System.out.println(k);
		}
		public static int sumOfNumberInString(String s){
		    int sum=0;
		    for(int i=0;i<s.length();i++){
		        char ch=s.charAt(i);
		        if(Character.isDigit(ch)){
		            sum+=Character.getNumericValue(ch);
		        }
		    }
		    return sum;
	}

}
