package com.leetcode;

public class AddBinary {
	public String addBinary(String a, String b) {
        int aLength = a.length();
        int blength = b.length();
        
        StringBuilder res = new StringBuilder();
        int c=0;
        int i = aLength-1;
        int j = blength-1;
        while( i>=0||j>=0||c==1){
        
         int p = (i>=0)? a.charAt(i)-'0':0;
         int q = (j>=0)? b.charAt(j)-'0':0;
         int sum=p+q+c;
         res.append(sum%2);
         c=sum/2;
        
        i--;
        j--;
        
    }

    
  return res.reverse().toString(); 
    }    
}
