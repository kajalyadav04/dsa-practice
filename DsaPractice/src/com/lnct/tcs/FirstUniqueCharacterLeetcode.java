package com.lnct.tcs;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacterLeetcode {
	public int firstUniqChar(String s) {
        Map<Character,Integer> e = new LinkedHashMap<>();
        for(char ch:s.toCharArray()){
            e.put(ch,e.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry:e.entrySet()){
            if(entry.getValue()==1){
               return s.indexOf(entry.getKey());
            }
           
        }
         return -1;
        
    }

}
