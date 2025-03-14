package com.lnct.tcs;


import java.util.*;

public class AlanFreq {
	//Enter code here
	
	    public static void main(String args[]){
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        String s=sc.next();
	        HashMap<Character,Integer> map= freq(n,s);
	        for(Map.Entry<Character,Integer> e:map.entrySet()){
	            System.out.println(e.getKey()+"-"+e.getValue());
	        }
	        
	    }
	    public static HashMap<Character,Integer> freq(int n,String s){
	        HashMap<Character,Integer> e= new HashMap<>();
	        for(char ch:s.toCharArray()){
	            if(e.containsKey(ch)){
	                e.put(ch,e.getOrDefault(ch, 0)+1);
	            }
	            else{
	                e.put(ch,1);
	            }
	        }
	        return e;
	    }
	}


