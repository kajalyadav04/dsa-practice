package com.lnct.tcs;

import java.util.Scanner;

public class VowelConsonent {
	//Enter code here
	
	    public static void main(String args[]){
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	       
	        String str=sc.next();
	        
	       int[] arr= countVC(n,str);
	       System.out.println(arr[0]);
	       System.out.println(arr[1]);
	        
	    }
	    public static int[] countVC(int n,String str){
	            int c=0;
	            int v=0;
	            int arr[]=new int[2];
	            for(int i=0;i<n;i++){
	                char k=Character.toLowerCase(str.charAt(i));
	                
//	                if(k=='a'||k=='e'||k=='i'||k=='o'||k=='u'||k=='A'||k=='E'||k=='I'||k=='O'||k=='U'){
//	                    v++;
//	                }
	                if("aeiou".indexOf(k)!=-1) {
	                	v++;
	                }
	                else{
	                    c++;
	                }
	                
	                
	             }
	             arr[0]=v;
	             arr[1]=c;
	        return arr;
	    }
	}


