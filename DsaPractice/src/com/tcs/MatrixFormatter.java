package com.tcs;

import java.util.Scanner;



public class MatrixFormatter {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][][] matrices = new int[N][r][c];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < r; j++) {
                for (int k = 0; k < c; k++) {
                    matrices[i][j][k] = sc.nextInt();
                }
            }
        }

        while (sc.hasNextInt()) {
            int matrixIndex = sc.nextInt() - 1;
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print(matrices[matrixIndex][i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}