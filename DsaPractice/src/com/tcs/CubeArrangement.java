package com.tcs;

import java.util.*;


public class CubeArrangement {
    static class Position {
        int x, y;

        Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Position position = (Position) obj;
            return x == position.x && y == position.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        Map<Integer, Position> cubePositions = new HashMap<>();
        Map<String, int[]> directionVectors = new HashMap<>();
        
        directionVectors.put("right", new int[]{1, 0});
        directionVectors.put("left", new int[]{-1, 0});
        directionVectors.put("top", new int[]{0, 1});
        directionVectors.put("down", new int[]{0, -1});
        
        Set<String> commonFaceSet = new HashSet<>();

        for (int i = 0; i < Q; i++) {
            int cubeA = sc.nextInt();
            int cubeB = sc.nextInt();
            String direction = sc.next();
            
            Position posA = cubePositions.getOrDefault(cubeA, new Position(0, 0));
            
            int[] vector = directionVectors.get(direction);
            Position posB = new Position(posA.x + vector[0], posA.y + vector[1]);
            
            cubePositions.put(cubeB, posB);
            
            String edge1 = cubeA < cubeB ? cubeA + "-" + cubeB : cubeB + "-" + cubeA;
            String edge2 = posA.x == posB.x ? posA.y + "-" + posB.y : posA.x + "-" + posB.x;
            if (!commonFaceSet.contains(edge1)) {
                commonFaceSet.add(edge1);
            }
        }

        System.out.print(commonFaceSet.size());
    }
}
