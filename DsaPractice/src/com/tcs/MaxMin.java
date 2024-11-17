package com.tcs;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
//		int[] arr =  new int[n];
//		for(int i=0;i<n;i++) {
//			arr[i]=sc.nextInt();
//		}
		int [] arr= {4,6,2,3,0};
		int[] array=maxMin(arr);
		System.out.println(Arrays.toString(array));

	}
	public static int[] maxMin(int arr[]) {
		int lar=arr[0];
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>lar) {
				lar=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return new int[]{lar,min};
	}
	
}
