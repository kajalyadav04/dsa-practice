package com.lnct;

public class NaturalNumSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		int res=naturalNumSumUsingFormula(n);
		System.out.println(res);
		int k=naturalNumSumUsingLogic(n);
		System.out.println(k);

	}

	private static int naturalNumSumUsingLogic(int n) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		return sum;
	}

	private static int naturalNumSumUsingFormula(int n) {
		// TODO Auto-generated method stub
		int sum = n*(n+1)/2;
		return sum;
		
	}

}
