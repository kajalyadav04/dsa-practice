package com.tcs;

import java.util.*;

public class SecondLarSecMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {6,5,3,2,0};
		int[] k=secMaxMin(arr);
		System.out.println(k[0]);
		System.out.println(k[1]);

	}

	private static int[] secMaxMin(int[] arr) {
		// TODO Auto-generated method 
     Arrays.sort(arr);
     int secMax=arr[arr.length-2];
     int secMin=arr[1];
     return new int[]{secMax,secMin};
		
	}

}
