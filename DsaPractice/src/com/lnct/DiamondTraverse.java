package com.lnct;

import java.util.Scanner;

public class DiamondTraverse {

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
			diamondProblem(n, arr);

			System.out.println();
		}
	}

	public static void diamondProblem(int n, int[][] arr) {
		int mid = n / 2;
		for (int i = mid, j = n - 1; j >= mid && i >= 0; j--, i--) {
			System.out.print(arr[i][j] + " ");
		}
		for (int i = 1, j = mid - 1; i <= mid && j >= 0; i++, j--) {
			System.out.print(arr[i][j] + " ");
		}
		for (int j = mid + 1, i = 1; j < n && i <= mid; i++, j++) {
			System.out.print(arr[j][i] + " ");
		}
		for (int i = n - 2, k = mid + 1; i >= mid - 1 && k < n - 1; i--, k++) {
			System.out.print(arr[i][k] + " ");
		}

	}

}
