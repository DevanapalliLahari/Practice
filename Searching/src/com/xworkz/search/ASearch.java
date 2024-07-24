
package com.xworkz.search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;

class Node1 {
    int row, col;
    int gCost, hCost, fCost;
    Node1 parent;

    Node1(int row, int col) {
        this.row = row;
        this.col = col;
    }

    void calculateCosts(Node1 endNode) {
        this.hCost = Math.abs(this.row - endNode.row) + Math.abs(this.col - endNode.col);
        if (this.parent != null) {
            this.gCost = this.parent.gCost + 1;
        }
        this.fCost = this.gCost + this.hCost;
    }
}


public class ASearch {
    private static final int[][] DIRECTIONS = {
            {-1, 0}, {1, 0}, {0, -1}, {0, 1},
            {-1, -1}, {-1, 1}, {1, -1}, {1, 1}
    };

    public static List<Node1> aStarSearch(int[][] grid, Node1 startNode, Node1 endNode) {
        PriorityQueue<Node1> openList = new PriorityQueue<>(Comparator.comparingInt(node -> node.fCost));
        HashSet<Node1> closedList = new HashSet<>();

        startNode.calculateCosts(endNode);
        openList.add(startNode);

        while (!openList.isEmpty()) {
            Node1 currentNode = openList.poll();
            closedList.add(currentNode);

            if (currentNode.row == endNode.row && currentNode.col == endNode.col) {
                return constructPath(currentNode);
            }

            for (int[] direction : DIRECTIONS) {
                int newRow = currentNode.row + direction[0];
                int newCol = currentNode.col + direction[1];

                if (isValid(grid, newRow, newCol) && !isBlocked(grid, newRow, newCol)) {
                    Node1 neighbor = new Node1(newRow, newCol);
                    if (closedList.contains(neighbor)) {
                        continue;
                    }

                    neighbor.parent = currentNode;
                    neighbor.calculateCosts(endNode);

                    if (!openList.contains(neighbor)) {
                        openList.add(neighbor);
                    } else {
                        for (Node1 node : openList) {
                            if (node.equals(neighbor) && node.gCost > neighbor.gCost) {
                                openList.remove(node);
                                openList.add(neighbor);
                                break;
                            }
                        }
                    }
                }
            }
        }
        return Collections.emptyList(); // No path found
    }

    private static boolean isValid(int[][] grid, int row, int col) {
        return row >= 0 && row < grid.length && col >= 0 && col < grid[0].length;
    }

    private static boolean isBlocked(int[][] grid, int row, int col) {
        return grid[row][col] == 1; // Assuming 1 represents a blocked cell
    }

    private static List<Node1	> constructPath(Node1 currentNode) {
        List<Node1> path = new ArrayList<>();
        for (Node1 node = currentNode; node != null; node = node.parent) {
            path.add(node);
        }
        Collections.reverse(path);
        return path;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {0, 0, 0, 0, 0},
                {0, 1, 1, 1, 0},
                {0, 0, 0, 1, 0},
                {0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0}
        };

        Node1 startNode = new Node1(0, 0);
        Node1 endNode = new Node1(4, 4);

        List<Node1> path = aStarSearch(grid, startNode, endNode);

        if (path.isEmpty()) {
            System.out.println("No path found");
        } else {
            System.out.println("Path found:");
            for (Node1 node : path) {
                System.out.println("[" + node.row + ", " + node.col + "]");
            }
        }
    }
}
   