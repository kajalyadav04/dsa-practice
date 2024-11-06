package com.tcs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class FreqChar {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		Map<Character,Integer> map =freqQuant(s);
		for(Map.Entry<Character,Integer> mapEntry:map.entrySet()){
	            System.out.println(mapEntry.getKey()+" "+mapEntry.getValue());
	        }
		
	    // System.out.println(s);
	}
	    public static Map freqQuant(String str){
	        String s =str.replaceAll("\\s","");
	        Map<Character,Integer> map = new HashMap<Character,Integer>();
	        for(int i=0;i<s.length();i++){
	            char ch=s.charAt(i);
	           if(map.containsKey(ch)){
	               map.put(ch,map.get(ch)+1);
	           }
	           else{
	               map.put(ch,1);
	           }
	        }
	        
	       return map; 
	    }
	}


