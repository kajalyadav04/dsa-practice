package com.leetcode;

public class RemoveParticularNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	    public int removeElement(int[] nums, int val) {
	        int j=0;
	        for(int i:nums){
	            if(i==val){
	                continue;
	            }
	            else{
	                nums[j++]=i;
	            }
	            
	        }
	        return j;
	    }

}
