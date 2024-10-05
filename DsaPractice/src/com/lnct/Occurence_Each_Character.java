package com.lnct;

import java.util.*;

public class Occurence_Each_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Enter code here

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		// System.out.println(n);
		// System.out.println(s);
		frequencyCheck(n, s);
		frequencyCheckUsingHashMap(n, s);
	}

	public static void frequencyCheck(int n, String s) {
		int[] arr = new int[256];
		for (int i = 0; i < n; i++) {
			char ch = s.charAt(i);
			arr[ch]++;
			// System.out.println(arr[ch]++);

		}
		for (int i = 0; i < 256; i++) {
			if (arr[i] > 0) {
				System.out.println((char) i + "-" + arr[i]);
			}

		}

	}

	public static void frequencyCheckUsingHashMap(int n, String s) {
		Map<Character, Integer> hashMap = new HashMap<>();
		char[] arr = new char[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.charAt(i);

		}

		for (char ch : arr) {
			if (hashMap.containsKey(ch)) {
				hashMap.put(ch, hashMap.get(ch) + 1);
			} else {
				hashMap.put(ch, 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
			System.out.print(entry.getKey() + "-" + entry.getValue() + "\n");

		}
	}

}
