package com.lnct;

public class FactorialUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		int fact=1;
		factorialNumber(n,fact);
		

	}

	private static void factorialNumber(int n,int fact) {
		// TODO Auto-generated method stub
		
		if(n==0) {
			System.out.println("result: "+fact);
			return;
		}
		
		
		fact=fact*n;
//		System.out.println(fact);
		factorialNumber(n-1,fact);
		
	}

}
