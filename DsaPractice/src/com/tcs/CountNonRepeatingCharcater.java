package com.tcs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountNonRepeatingCharcater {
public static void main(String[] args) {
	    
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        Map<Character,Integer> map=CountNonRepeatingChar(s);
        for(char ch:s.toCharArray()){
	        if(map.get(ch)==1){
	            System.out.println(ch);
	        }else{
	            continue;
	        }
	    }
	}
	public static  Map<Character,Integer> CountNonRepeatingChar(String str){
	    String s=str.replaceAll("\\s","");
	    Map<Character,Integer> map= new HashMap<>();
	    for(char ch:s.toCharArray()){
	        map.put(ch,map.getOrDefault(ch,0)+1);
	        
	    }
	    return map;
	    
	}

}
