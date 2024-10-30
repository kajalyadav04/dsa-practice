package com.leetcode;

public class FindTarget {

	public static int searchInsert(int[] nums, int target) {
		int i;
		for (i = 0; i < nums.length; i++) {

			if (nums[i] == target) {
				return i;
			}
		}

		return i;

	}

	public static void main(String[] args) {
		int[] nums = { 8, 6, 2, 3, 7 };
		int target = 3;
		int k = searchInsert(nums, target);
		System.out.println(k);

	}
}
