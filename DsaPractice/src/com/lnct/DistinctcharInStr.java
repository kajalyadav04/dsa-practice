package com.lnct;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class DistinctcharInStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Enter code here

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		// System.out.println(s);
		keepDistincts(s);
	}

	public static void keepDistincts(String s) {
		String str = "";
		Set<Character> distinctChar = new LinkedHashSet<>();
		for (char ch : s.toCharArray()) {
			distinctChar.add(ch);
		}
		for (char ch : distinctChar) {
			str = str + ch;

		}
		System.out.println(str);

	}

}
