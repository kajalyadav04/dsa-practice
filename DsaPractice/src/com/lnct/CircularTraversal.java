package com.lnct;

import java.util.Scanner;

public class CircularTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Enter code here

		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for (int i = 0; i < test; i++) {
			int n = sc.nextInt();
			int[][] arr = new int[n][n];
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					arr[j][k] = sc.nextInt();
				}
			}
			circularTraversal(n, arr);

			System.out.println();
		}
	}

	public static void circularTraversal(int n, int[][] arr) {
		for (int j = n - 1; j >= 0; j--) {
			System.out.print(arr[j][0] + " ");
		}
		for (int j = 1; j < n; j++) {
			System.out.print(arr[0][j] + " ");
		}
		for (int j = 1; j < n; j++) {
			System.out.print(arr[j][n - 1] + " ");
		}
		for (int j = n - 2; j > 0; j--) {
			System.out.print(arr[n - 1][j] + " ");
		}

	}

}
