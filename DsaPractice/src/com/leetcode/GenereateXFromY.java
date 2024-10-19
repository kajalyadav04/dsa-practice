package com.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GenereateXFromY {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String stringX = scanner.nextLine();
		String stringY = scanner.nextLine();
		int s = scanner.nextInt();
		int r = scanner.nextInt();

		generateStringFromAnotherString(stringX, stringY, s, r);

	}

	private static void generateStringFromAnotherString(String stringX, String stringY, int s, int r) {

		Set<String> ySubstrings = new HashSet<>();
		Set<String> reverseYSubstrings = new HashSet<>();
//		System.out.println(reverseY);
//		System.out.println(stringY);
//		System.out.println(s);
//		System.out.println(r);

		for (int i = 0; i < stringY.length(); i++) {
			for (int j = i + 1; j <= stringY.length(); j++) {
				ySubstrings.add(stringY.substring(i, j));
			}
		}
		StringBuilder reverseStringY = new StringBuilder(stringY).reverse();
		String reverseY = reverseStringY.toString();
		for (int i = 0; i < reverseY.length(); i++) {
			for (int j = i + 1; j <= reverseY.length(); j++) {
				reverseYSubstrings.add(reverseY.substring(i, j));
			}
		}
		int[] dp = new int[stringX.length() + 1];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;
		for (int k = 1; k <= stringX.length(); k++) {
			for (int l = 1; l <= k; l++) {
				String subXString = stringX.substring(k - l, k);
				if (ySubstrings.contains(subXString)) {
					dp[k] = Math.min(dp[k], dp[k - l] + s);
				}
				if (reverseYSubstrings.contains(subXString)) {
					dp[k] = Math.min(dp[k], dp[k - l] + r);
				}
			}
		}
		if (dp[stringX.length()] == Integer.MAX_VALUE) {
			System.out.print("Impossible");
		} else {
			System.out.print(dp[stringX.length()]);
		}
	}
}