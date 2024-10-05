package com.lnct;

import java.util.Scanner;

public class Occurence_Each_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Enter code here
		
		        Scanner sc=new Scanner(System.in);
		        int n=sc.nextInt();
		        String s=sc.next();
		        // System.out.println(n);
		        // System.out.println(s);
		        frequencyCheck(n,s);
		    }
		    public static void frequencyCheck(int n,String s){
		        int[] arr= new int[256];
		        for(int i=0;i<n;i++){
		            char ch=s.charAt(i);
		            arr[ch]++;
		            // System.out.println(arr[ch]++);
		            
		        }
		        for(int i=0;i<256;i++){
		            if(arr[i]>0){
		                System.out.println((char)i+"-"+arr[i]);
		            }
		            
		        }
		       
		    }
		

	}


