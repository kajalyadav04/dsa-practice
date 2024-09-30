package com.lnct;

public class NaturalNumSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		int res=naturalNumSumUsingFormula(n);
		System.out.println(res);

	}

	private static int naturalNumSumUsingFormula(int n) {
		// TODO Auto-generated method stub
		int sum = n*(n+1)/2;
		return sum;
		
	}

}
