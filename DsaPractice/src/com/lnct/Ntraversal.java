package com.lnct;

import java.util.Scanner;

public class Ntraversal {
	// Enter code here

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = 0;
		int[][] arr = null;
		for (int i = 0; i < n; i++) {
			m = sc.nextInt();
			arr = new int[m][m];
			for (int k = 0; k < m; k++) {
				for (int j = 0; j < m; j++) {
					arr[k][j] = sc.nextInt();
				}
			}

			nTraversal(m, arr);
			System.out.println();
		}

	}

	public static void nTraversal(int m, int[][] arr) {
		for (int i = m - 1; i > 0; i--) {
			System.out.print(arr[i][0] + " ");
		}
		for (int j = 0; j < m; j++) {
			System.out.print(arr[j][j] + " ");
		}
		for (int i = m - 2; i >= 0; i--) {
			System.out.print(arr[i][m - 1] + " ");
		}

	}

}
