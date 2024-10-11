package com.unit2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BagOfLetters {

	// TODO Auto-generated method stub
	// Enter code here

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str1 = sc.next();
		int m = sc.nextInt();
		String str2 = sc.next();
		bagOfLetters(n, m, str1, str2);
	}

	public static void bagOfLetters(int n, int m, String str1, String str2) {
		int count = 0;
		Set<Character> bagOfletter = new HashSet<>();

		for (char ch : str1.toCharArray()) {
			bagOfletter.add(ch);

		}
		for (char ch1 : str2.toCharArray()) {
			if (bagOfletter.contains(ch1)) {
				count++;
			}

		}
		if (count == m) {
			System.out.println("Yes");

		} else {
			System.out.println("No");
		}
	}

}
