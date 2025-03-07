package com.lnct.tcs;

import java.util.Scanner;

public class SmallLargestInArr {
	//Enter code here

	    public static void main(String[] args){
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int arr[] =new int[n];
	        
	        for(int i=0;i<n;i++){
	            arr[i]=sc.nextInt();
	        }
	        int[] arr1=smallLargest(arr,n);
	        System.out.println(arr1[0]);
	        System.out.println(arr1[1]);
	        
	    }
	    public static int[] smallLargest(int[] arr,int n){
	        
	        int max=arr[0];
	        int min=arr[0];
	        int arr1[] = new int[n];
	        if(n==1){
	            return new int[]{arr[0],arr[0]};
	        }
	        for(int i=0;i<n;i++){
	            if(arr[i]>max){
	                max=arr[i];
	            }
	            if(arr[i]<min){
	                min=arr[i];
	            }
	            
	        }
	        arr1[0]=min;
	        arr1[1]=max;
	        return arr1;
	    
	    }
	}


