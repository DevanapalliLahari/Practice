package com.xworkz.arrays;

public class Problem2 {
	public static int maxSumSubmatrix(int[][] matrix) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
			return 0;
		int rows = matrix.length;
		int cols = matrix[0].length;
		int maxSum = Integer.MIN_VALUE;

		for (int left = 0; left < cols; left++) {
			int[] temp = new int[rows];

			for (int right = left; right < cols; right++) {
				for (int i = 0; i < rows; i++) {
					temp[i] += matrix[i][right];
				}

				maxSum = Math.max(maxSum, kadane(temp));
			}
		}

		return maxSum;
	}

	private static int kadane(int[] array) {
		int maxEnding = array[0], result = array[0];
		for (int i = 1; i < array.length; i++) {
			maxEnding = Math.max(array[i], maxEnding + array[i]);
			result = Math.max(result, maxEnding);
		}
		return result;
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, -1, -4, -20 }, { -8, -3, 4, 2, 1 }, { 3, 8, 10, 1, 3 }, { -4, -1, 1, 7, -6 } };

		int maxSum = maxSumSubmatrix(matrix);
		System.out.println("Maximum sum of submatrix: " + maxSum);
	}
}
