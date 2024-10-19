package com.leetcode;

import java.util.*;

public class TwoDiArr {

	static int[][] directionTwoDArr = { { 1, 0 }, { 0, -1 }, { -1, 0 }, { 0, 1 } };

	static class EachBox {
		int x, y, moves;

		EachBox(int x, int y, int moves) {
			this.x = x;
			this.y = y;
			this.moves = moves;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int row = sc.nextInt();
		int column = sc.nextInt();
		int[][] grid = new int[row][column];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				grid[i][j] = sc.nextInt();
			}
		}

		int[] source = { sc.nextInt(), sc.nextInt() };
		int[] destination = { sc.nextInt(), sc.nextInt() };
		int[] movementRule = { sc.nextInt(), sc.nextInt() };
		if (source[0] < 0 || source[0] >= row || source[1] < 0 || source[1] >= column || destination[0] < 0|| destination[0] >= row || destination[1] < 0 || destination[1] >= column) {
			return;
		}

		int soln = minrowoves(grid, source, destination, movementRule);

		System.out.print(soln);
	}

	public static int minrowoves(int[][] grid, int[] source, int[] destination, int[] movementRule) {
		int row = grid.length, column = grid[0].length;

		int[][] moves = { { movementRule[0], movementRule[1] }, { movementRule[1], -movementRule[0] },
				{ -movementRule[1], movementRule[0] }, { -movementRule[0], -movementRule[1] } };

		Queue<EachBox> queue = new LinkedList<>();
		boolean[][] visited = new boolean[row][column];

		queue.offer(new EachBox(source[0], source[1], 0));
		visited[source[0]][source[1]] = true;

		while (!queue.isEmpty()) {
			EachBox current = queue.poll();

			if (current.x == destination[0] && current.y == destination[1]) {
				return current.moves;
			}

			for (int[] move : moves) {
				int currXaxis = current.x + move[0];
				int currYaxis = current.y + move[1];

				if (currXaxis >= 0 && currYaxis >= 0 && currXaxis < row && currYaxis < column
						&& grid[currXaxis][currYaxis] == 0 && !visited[currXaxis][currYaxis]) {
					visited[currXaxis][currYaxis] = true;
					queue.offer(new EachBox(currXaxis, currYaxis, current.moves + 1));
				}
			}
		}

		return -1;
	}

}
