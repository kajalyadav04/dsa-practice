package com.lnct.tcs;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramNumber {
	public static void main(String args[]) {
		Scanner sc =  new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		boolean k=	anagramUsingSumandProduct(n1,n2);
		if(k) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
	public static boolean anagramUsingSumandProduct(int n1,int n2) {
		int sum1=0;
		
		int sum2=0;
		int product1=1;
		int product2=1;
		while(n1>0) {
			int rem=n1%10;
			sum1+=rem;
			product1*=rem;
			n1=n1/10;
		}
		while(n2>0) {
			int rem=n2%10;
			sum2+=rem;
			product2*=rem;
			n2=n2/10;
		}
		if(n1!=0 || n2!=0) {
			return false;
		}else {
			if(sum1==sum2&&product1==product2) {
				return true;
			}
		}
		
		
		
		return false;
		
	}
	public static boolean anagramNumUsingString(int n1,int n2) {
		String s = String.valueOf(n1);
		String t = String.valueOf(n2);
		if(s.length()!=t.length()) {
			return false;
		}
		char[] a1=s.toCharArray();
		char[] a2=t.toCharArray();
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		return Arrays.equals(a1, a2);
		
		
	}
	private static boolean anagramNum(int n1, int n2) {
		// TODO Auto-generated method stub
		int[] count=new int[10];
		
		while(n1>0) {
			int rem=n1%10;
			count[rem]++;
			n1=n1/10;
			
			
		}
		while(n2>0) {
			int reminder=n2%10;
			count[reminder]--;
			n2=n2/10;	
		}
		for(int c:count) {
			if(c!=0) {
				return false;
			}
		}
			
				
			
		return true;
		
	}


}
