package com.lnct;

public class StringContainsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "hello world";
		String str2 = "her";
		boolean k = stringContainsUsingInbuildfn(str1, str2);
		System.out.println(k);
		boolean p = stringContainsUsingLogic(str1, str2);
		System.out.println(k);
	}

	private static boolean stringContainsUsingLogic(String str1, String str2) {
		// TODO Auto-generated method stub
		int n = str1.length();
		int m = str2.length();
		if (m > n) {
			return false;
		}
		for (int i = 0; i < n - m; i++) {
			int j;
			for (j = 0; j < m; j++) {
				if (str1.charAt(i + j) != str2.charAt(j)) {
					break;
				}
			}
			if (j == m) {
				return true;
			}
		}
		return false;

	}

	private static boolean stringContainsUsingInbuildfn(String str1, String str2) {
		// TODO Auto-generated method stub
		if (str1.contains(str2)) {
			return true;
		}
		return false;
	}

}
