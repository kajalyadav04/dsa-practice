package com.tcs;

public class SecondLarSecondSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {9,8,8,6,5,23,3,2,0,7};
		largetSmallest(arr);
//		System.out.println(k[0]);
//		System.out.println(k[1]);
//		

	}
	public static void largetSmallest(int[] arr){
		int largest=Integer.MIN_VALUE;
		int smallest=Integer.MAX_VALUE;
		int secLargest=Integer.MIN_VALUE;
		int secsmallest=Integer.MAX_VALUE;
		for(int num:arr) {
			if(num>largest) {
				secLargest=largest;
				largest=num;
				
			}
			else if(num>secLargest&&num!=largest) {
				secLargest=num;
			}
		}
		System.out.println(secLargest);
		System.out.println(largest);
		
	}

}
