package com.leetcode;

public class IntegerToRoman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String xString="IV";
		int k= romanToInt(xString);
		System.out.println(k);
		

	}
	
	
	    public static int getVal(char ch){
	        int a=0;
	        switch(ch){
	             case 'I':
	            a=1;
	            break;
	            case 'V':
	            a=5;
	            break;
	            case 'X':
	            a=10;
	            break;
	            case 'L':
	            a=50;
	            break;
	            case 'C':
	            a=100;
	            break;
	            case 'D':
	            a=500;
	            break;
	            case 'M':
	            a=1000;
	            break;

	          }
	         return a;

	        }
	    
	    public static int romanToInt(String s) {
	        int sum=0;
	        int n=s.length();
	        for(int i=0;i<n;i++){
	            if(i+1<n && getVal(s.charAt(i))<getVal(s.charAt(i+1))){
	                sum-=getVal(s.charAt(i));
	            }
	            else{
	                sum+=getVal(s.charAt(i));
	            }
	        }
	        return sum;
	        
	    }
	}


