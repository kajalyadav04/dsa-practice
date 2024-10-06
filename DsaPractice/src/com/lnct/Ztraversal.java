package com.lnct;

import java.util.Scanner;

public class Ztraversal {
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

			zTraversal(m, arr);
			System.out.println();
		}
	}

	public static void zTraversal(int m, int[][] arr) {
		for (int i = 0; i < m; i++) {
			System.out.print(arr[0][i] + " ");
		}

		for (int j = m - 2, k = 1; j >= 0 && k < m; j--, k++) {
			System.out.print(arr[k][j] + " ");

		}
		// for(int k=1;k<m;k++){
		// System.out.print(arr[k][m-1-k]+" ");

		// }

		for (int i = 1; i < m; i++) {
			System.out.print(arr[m - 1][i] + " ");
		}

	}
}
