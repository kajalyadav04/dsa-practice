package com.lnct;

import java.util.Scanner;

public class BorderLessSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Enter code here
		
		        Scanner sc= new Scanner(System.in);
		        int n = sc.nextInt();
		        int m=sc.nextInt();
		        int[][] arr=new int[n][m];
		        for(int i=0;i<n;i++){
		            for(int j=0;j<m;j++){
		                arr[i][j]=sc.nextInt();
		            }
		        }
		        // System.out.println(Arrays.deepToString(arr));
		       int res= borderless(n,m,arr);
		       System.out.println(res);
		    }
		    public static int borderless(int n,int m,int[][] arr){
		        int sum=0;
		        for(int i=0;i<n;i++){
		            for(int j=0;j<m;j++){
		                if(i==0||j==0||i==n-1||j==m-1){
		                continue;
		                }
		                else{
		                    sum=sum+arr[i][j];
		                    // System.out.println(arr[i][j]+" ");
		                }
		            }
		        }
		        return sum;
		        
		    }
		

	}


