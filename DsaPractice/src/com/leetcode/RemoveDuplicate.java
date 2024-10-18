package com.leetcode;

import java.util.HashSet;

public class RemoveDuplicate {

	public int removeDuplicates(int[] nums) {
		HashSet<Integer> s = new HashSet<>();

		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (!s.contains(nums[i])) {
				s.add(nums[i]);
				nums[j++] = nums[i];
			}

		}
		return j;
	}

}
