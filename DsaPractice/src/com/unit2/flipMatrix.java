package com.unit2;

import java.util.Scanner;

public class flipMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Enter code here
		        Scanner sc= new Scanner(System.in);
		        int n=sc.nextInt();
		        int[][] arr= new int[n][n];
		        for(int i=0;i<n;i++){
		            for(int j=0;j<n;j++){
		                arr[i][j]=sc.nextInt();
		            }
		            
		        
		        }
		        flipMatrix(n,arr);
		        // System.out.println(Arrays.deepToString(arr));
		    }
		    public static void flipMatrix(int n,int[][] arr){
		        int[][] array= new int[n][n];
		        for(int i=0;i<n;i++){
		            for(int j=n-1;j>=0;j--){
		                if(arr[i][j]==0){
		                    System.out.print("1 ");
		                }
		                else{
		                    System.out.print("0 ");
		                
		                }
		                // System.out.println();
		            }
		                
		            System.out.println();
		        
		        }
		        
		    }
		    
		    
		

	}


