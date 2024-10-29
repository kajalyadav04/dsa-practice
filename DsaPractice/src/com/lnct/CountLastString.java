package com.lnct;

public class CountLastString {
	
	    public int lengthOfLastWord(String s) {
	    String k = s.trim();
	    int count =0;
	    for(int i=k.length()-1;i>=0;i--){
	        if(k.charAt(i)!=' '){
	         count++;
	        }else{
	            break;
	        }
	        
	    }
	    return count;
	        
	    }
	

}
