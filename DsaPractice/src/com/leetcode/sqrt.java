package com.leetcode;

public class sqrt {
	public int mySqrt(int x) {
        int start = 1;
        int end=x;
        long mid = start + (end-start)/2;
    if(mid*mid==x){
        return (int) mid;
        
    }
    else if(mid*mid>x){
         mid=mid-1;

    }
    else{
        mid=mid+1;
    }
    return (int) mid;
    }

}
