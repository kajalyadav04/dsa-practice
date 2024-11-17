package com.tcs;

import java.util.*;

public class CountTheShapes {

	static class Graph {
		private final Map<String, List<String>> adjList = new HashMap<>();

		public void addEdge(int x1, int y1, int x2, int y2) {
			String point1 = x1 + "," + y1;
			String point2 = x2 + "," + y2;
			adjList.computeIfAbsent(point1, k -> new ArrayList<>()).add(point2);
			adjList.computeIfAbsent(point2, k -> new ArrayList<>()).add(point1);
		}

		public int countClosedFigures() {
			Set<String> visited = new HashSet<>();
			int closedFigures = 0;

			for (String node : adjList.keySet()) {
				if (!visited.contains(node) && dfs(node, null, node, visited)) {
					closedFigures++;
				}
			}
			return closedFigures;
		}

		private boolean dfs(String node, String parent, String startNode, Set<String> visited) {
			Stack<String> stack = new Stack<>();
			stack.push(node);
			Map<String, String> parentMap = new HashMap<>();

			while (!stack.isEmpty()) {
				String current = stack.pop();

				if (visited.contains(current)) {
					if (current.equals(startNode)) {
						return true;
					}
					continue;
				}

				visited.add(current);

				for (String neighbor : adjList.getOrDefault(current, new ArrayList<>())) {
					if (!neighbor.equals(parentMap.get(current))) {
						stack.push(neighbor);
						parentMap.put(neighbor, current);
					}
				}
			}
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Graph graph = new Graph();

		for (int i = 0; i < n; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			graph.addEdge(x1, y1, x2, y2);
		}

		System.out.println(graph.countClosedFigures());
		
	}
}
