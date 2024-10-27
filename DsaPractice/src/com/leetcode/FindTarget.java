package com.leetcode;

public class FindTarget {

	public int searchInsert(int[] nums, int target) {
		int i = 0;
		for (i = 0; i < nums.length; i++) {
			if (nums[i] <= target) {
				if (nums[i] == target) {
					return i;
				}
			} else {
				return i;
			}
		}
		return i;

	}
}
