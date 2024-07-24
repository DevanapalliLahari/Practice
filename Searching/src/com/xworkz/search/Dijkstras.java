package com.xworkz.search;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Dijkstras {
    static class Edge {
        int firstVertex;
        int secondVertex;
        int weight;

        Edge(int firstVertex, int secondVertex, int weight) {
            this.firstVertex = firstVertex;
            this.secondVertex = secondVertex;
            this.weight = weight;
        }
    }

    static class Pair implements Comparable<Pair> {
        int vertex;
        String pathOfTheSourceNode;
        int weightOfThePath;

        public Pair(int vertex, String pathOfTheSourceNode, int weightOfThePath) {
            this.vertex = vertex;
            this.pathOfTheSourceNode = pathOfTheSourceNode;
            this.weightOfThePath = weightOfThePath;
        }

        @Override
        public int compareTo(Pair other) {
            return Integer.compare(this.weightOfThePath, other.weightOfThePath);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
        int vertices = Integer.parseInt(bufferReader.readLine());
        ArrayList<Edge>[] graph = new ArrayList[vertices + 1];
        for (int i = 0; i <= vertices; i++) {
            graph[i] = new ArrayList<>();
        }
        int edge = Integer.parseInt(bufferReader.readLine());
        for (int i = 0; i < edge; i++) {
            String[] part = bufferReader.readLine().split(" ");
            int firstVertex = Integer.parseInt(part[0]);
            int secondVertex = Integer.parseInt(part[1]);
            int weight = Integer.parseInt(part[2]);
            graph[firstVertex].add(new Edge(firstVertex, secondVertex, weight));
            graph[secondVertex].add(new Edge(secondVertex, firstVertex, weight));
        }
        int sourceVertex = Integer.parseInt(bufferReader.readLine());
        boolean[] visited = new boolean[vertices + 1];
        PriorityQueue<Pair> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new Pair(sourceVertex, sourceVertex + " ", 0));

        while (!priorityQueue.isEmpty()) {
            Pair current = priorityQueue.remove();
            if (visited[current.vertex]) {
                continue;
            }
            visited[current.vertex] = true;
            System.out.println(current.vertex + " via " + current.pathOfTheSourceNode + " @ " + current.weightOfThePath);

            for (Edge edgeObj : graph[current.vertex]) {
                if (!visited[edgeObj.secondVertex]) {
                    priorityQueue.add(new Pair(edgeObj.secondVertex, current.pathOfTheSourceNode + " --> " + edgeObj.secondVertex, current.weightOfThePath + edgeObj.weight));
                }
            }
        }
    }
}
