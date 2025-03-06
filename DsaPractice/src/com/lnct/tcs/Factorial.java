package com.lnct.tcs;

import java.util.Scanner;

public class Factorial {
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0){
		    int n=sc.nextInt();
		    long k=factorial(n);
		    System.out.println(k);
		}

	}
	public static long factorial(int n){
	    long fact=1;
	    for(int i=1;i<=n;i++){
	        fact=fact*i;
	    }
	  	return fact;
	}


}
