package com.lnct;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 36, 78, 23, 3, 2, 1, 65,23 };
		int n = arr.length;
		sortArray(arr, n);
		System.out.println(Arrays.toString(arr));

	}

	private static void sortArray(int[] arr, int n) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length - 1; i++) {
			int max = i;
			for (int j = i + 1; j < arr.length - 1; j++) {
				if (arr[max] > arr[j]) {
					max = j;
				}

			}
			int temp = arr[max];
			arr[max] = arr[i];
			arr[i] = temp;

		}

	}
}
