package com.leetcode;

public class FindTheIndexOfString {

	
	    public int strStr(String haystack, String needle) {
	    //     if(haystack.length()==needle.length()){
	    //         return 0;
	    //     }
	    //     for(int i=0;i<haystack.length()-needle.length();i++){
	    //         if(haystack.charAt(i)==needle.charAt(0)){
	    //             if(haystack.substring(i,needle.length()+i).equals(needle)){
	    //                 return i;
	    //             }
	    //             else{
	    //                 return -1;
	    //             }
	    //         }
	            
	    //     }
	    // return -1;
	    if(haystack.contains(needle)){
	        return haystack.indexOf(needle);
	    }
	    else{
	        return -1;
	    }
	}
	

}
