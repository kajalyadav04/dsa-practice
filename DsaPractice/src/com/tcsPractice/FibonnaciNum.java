package com.tcsPractice;

import java.util.Scanner;

public class FibonnaciNum {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		
		fib(n);
	}
	public static void fib(int n ) {
		int a=0;
		int b=1;
		
		for(int i=0;i<n;i++) {
			System.out.print(a+" ");
			int c=a+b;
			a=b;
			b=c;
		}
	}
	

}
