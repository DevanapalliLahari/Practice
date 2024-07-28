package com.xworkz.arrays;

public class SpiralMatrix {

    public static void main(String[] args) {
        int[][] mat = new int[][] { { 3, 4, 5 }, { 2, 4, 8 }, { 4, 2, 1 } };
        int length = mat.length;
        int[][] result = SpiralMatrix.matrix(length);
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] matrix(int length) {
        int matrix[][] = new int[length][length];
        int rowStart = 0, rowEnd = length - 1;
        int colStart = 0, colEnd = length - 1;
        int value = 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            // Fill the top row
            for (int i = colStart; i <= colEnd; i++) {
                matrix[rowStart][i] = value++;
            }
            rowStart++;

            // Fill the right column
            for (int i = rowStart; i <= rowEnd; i++) {
                matrix[i][colEnd] = value++;
            }
            colEnd--;

            // Fill the bottom row
            if (rowStart <= rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    matrix[rowEnd][i] = value++;
                }
                rowEnd--;
            }

            // Fill the left column
            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    matrix[i][colStart] = value++;
                }
                colStart++;
            }
        }

        return matrix;
    }
}
