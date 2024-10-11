package com.leetcode;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,3,5,7,5,2};
		int target=9;
		int[] k=twoSum(nums,target);
		System.out.println(Arrays.toString(k));
		

	}
	
	    public static int[] twoSum(int[] nums, int target) {
	        int[] arr = new int[2];
	        for(int i=0;i<nums.length;i++){
	            for(int j=0;j<nums.length;j++){
	                if(i==j){
	                    continue;
	                }
	            if(nums[i]+nums[j]==target){
	               arr[0]=i;
	               arr[1]=j;
	               return arr;
	            }
	        }
	        }
	        
	         return arr;
	        
	    }
	

}
