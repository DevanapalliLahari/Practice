package com.xworkz.arrays;

import java.util.*;

public class Problem1 {

    public static List<int[]> getSkyline(int[][] buildings) {
        if (buildings.length == 0) {
            return new ArrayList<>();
        }
        return mergeSort(buildings, 0, buildings.length - 1);
    }

    private static List<int[]> mergeSort(int[][] buildings, int start, int end) {
        if (start == end) {
            List<int[]> result = new ArrayList<>();
            result.add(new int[] {buildings[start][0], buildings[start][2]});
            result.add(new int[] {buildings[start][1], 0});
            return result;
        }

        int mid = start + (end - start) / 2;
        List<int[]> leftSkyline = mergeSort(buildings, start, mid);
        List<int[]> rightSkyline = mergeSort(buildings, mid + 1, end);

        return merge(leftSkyline, rightSkyline);
    }

    private static List<int[]> merge(List<int[]> left, List<int[]> right) {
        List<int[]> result = new ArrayList<>();
        int leftHeight = 0, rightHeight = 0, currentHeight = 0;
        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            int[] point;
            if (left.get(i)[0] < right.get(j)[0]) {
                point = left.get(i);
                leftHeight = point[1];
                i++;
            } else if (left.get(i)[0] > right.get(j)[0]) {
                point = right.get(j);
                rightHeight = point[1];
                j++;
            } else {
                point = left.get(i);
                leftHeight = point[1];
                rightHeight = right.get(j)[1];
                i++;
                j++;
            }

            int maxHeight = Math.max(leftHeight, rightHeight);
            if (currentHeight != maxHeight) {
                result.add(new int[] {point[0], maxHeight});
                currentHeight = maxHeight;
            }
        }

        while (i < left.size()) {
            result.add(left.get(i));
            i++;
        }

        while (j < right.size()) {
            result.add(right.get(j));
            j++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] buildings = {
            {1, 3, 3}, 
            {2, 4, 4}, 
            {5, 6, 1}
        };
        
        List<int[]> skyline = getSkyline(buildings);
        
        for (int[] point : skyline) {
            System.out.println(Arrays.toString(point));
        }
    }
}
