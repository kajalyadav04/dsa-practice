package com.lnct.tcs;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args){
        Scanner sc=  new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
      int[] arr1=  reverseArr(arr,n);
      for(int i=0;i<n;i++){
            System.out.println(arr1[i]);
        }
    }
    public static int[] reverseArr(int[] arr,int n){
        int array[] =new int[n];
        for(int i=n-1;i>=0;i--){
            array[n-i-1]=arr[i];
            
        }
        return array;
    }

}
