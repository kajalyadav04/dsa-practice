package com.lnct;

public class FactorialUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		int fact=1;
		factorialNumber(n,fact);
		int ans = factorialNumberV2(n);
		//5*fact(4)*fact(3)*fact(2)*
		System.out.println("factrial: "+ans);
	}

	private static int factorialNumberV2(int n) {
		if(n==0) {
			return n;
		}
		return n*factorialNumberV2(n-1);
	}

	private static void factorialNumber(int n,int fact) {
		// TODO Auto-generated method stub
		
		if(n==0) {
			System.out.println("result: "+fact);
			return;
		}
		
		
		fact=fact*n;
		System.out.println(fact);
		factorialNumber(n-1,fact);
		
	}
	

}
