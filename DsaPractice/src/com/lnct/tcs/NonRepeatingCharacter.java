package com.lnct.tcs;

import java.util.HashMap;

public class NonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aa";
		char c=nonrepeatingChar(str);
		System.out.println(c);
		

	}

	private static char nonrepeatingChar(String str) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> eHashMap = new HashMap<>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(eHashMap.containsKey(ch)) {
				eHashMap.put(ch,eHashMap.getOrDefault(ch,0)+1);
			}else {
				eHashMap.put(ch, 1);
			}
		}
		for(char ch:str.toCharArray()) {
			if(eHashMap.get(ch)==1) {
				return ch;
			}
		}
		return '$';
	}

}
