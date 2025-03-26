package com.lnct.tcs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Anjali";
		remfn(s);
		

	}

	private static void remfn(String s) {
		// TODO Auto-generated method stub
		StringBuilder string=new StringBuilder();
		Map<Character, Integer> eMap= new LinkedHashMap<>();
		for(char ch:s.toLowerCase().toCharArray()) {
			eMap.put(ch,eMap.getOrDefault(ch,0)+1);
		}
		for(Map.Entry<Character, Integer> e:eMap.entrySet())	{
			if(e.getValue()==1) {
				string.append(e.getKey());
			}
			
		}
		System.out.println(string);
	}
	
}
