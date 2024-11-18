package com.tcs;
import java.util.*;

public class ReverseArr {
	

	
		public static void main(String[] args){
		    Scanner sc= new Scanner(System.in);
		    int n=sc.nextInt();
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		    }
		    int[] arrays=reverese(arr);
		    System.out.println(Arrays.toString(arrays));
		}
		public static int[] reverese(int[] arr){
		    int[] array=new int[arr.length];
		    for(int i=0;i<arr.length;i++){
		       array[i]=arr[arr.length-1-i];
		    }
		    return array;
		}
	

}
