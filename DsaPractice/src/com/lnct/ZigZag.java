package com.lnct;

import java.util.Scanner;

public class ZigZag {
	//Enter code here
	
	public static void main(String[] args) {
		
	
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int m=sc.nextInt();
	        int[][] arr=new int[n][m];
	        for(int i=0;i<n;i++){
	            for(int j=0;j<m;j++){
	                arr[i][j]=sc.nextInt();
	            }
	        }
	        zigZag(n,m,arr);
	        // System.out.println(Arrays.deepToString(arr));
	    }
	    public static void zigZag(int n,int m,int[][] arr){
	        for(int i=0;i<n;i++){
	           
	                if(i%2==0){
	                    for(int j=m-1;j>=0;j--){
	                     System.out.print(arr[i][j]+" ");
	                     } 
	                }
	                else{
	                    for(int j=0;j<m;j++){
	                     System.out.print(arr[i][j]+" ");
	                     }
	                    
	                }
	                     
	            
	            }
	        }
	        
	     }
	    



