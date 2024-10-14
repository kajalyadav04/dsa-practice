package com.leetcode;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] kString={"flower","flow","flight"};
		 String jString=longestCommonPrefix((kString));
		 System.out.println(jString);
		
	}

	// TODO Auto-generated method stub
	public static String longestCommonPrefix(String[] strs) {
		Arrays.sort(strs);
		String str1 = strs[0];
		String str2 = strs[strs.length - 1];

		if (strs == null || strs.length == 0) {
			return "";
		}
		if (str1.length() == 1 && strs.length == 1) {
			return str1;
		}

		int index = 0;
		while (index < str1.length()) {
			if (str1.charAt(index) == str2.charAt(index)) {
				index++;
			} else {
				break;
			}

		}
		if (index == 0) {
			return "";
		} else {
			return index == 0 ? "" : str1.substring(0, index);
		}

	}

}


