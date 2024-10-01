package com.lnct;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 36, 78, 22, 11, 6, 5, 78 };
		int n = arr.length;
		int[] res = sort(arr, n);

		System.out.println(Arrays.toString(res));

	}

	private static int[] sort(int[] arr, int n) {
		// TODO Auto-generated method stub
		for (int i = 0; i < n; i++) {
			boolean flag = false;
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;
				}

			}

			if (flag == false) {
				return arr;
			}
		}
		return arr;

	}

}
