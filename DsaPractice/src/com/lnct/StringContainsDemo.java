package com.lnct;

public class StringContainsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "hello world";
		String str2 = "her";
		boolean k = stringContainsUsingInbuildfn(str1, str2);
		System.out.println(k);

	}

	private static boolean stringContainsUsingInbuildfn(String str1, String str2) {
		// TODO Auto-generated method stub
		if (str1.contains(str2)) {
			return true;
		}
		return false;
	}

}
