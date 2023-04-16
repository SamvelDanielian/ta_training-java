package com.epam.training.student_Samvel_Danielyan.matrices;
import java.util.Arrays;

public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {
        int[][] transposed = new int[matrix[0].length][matrix.length];

            if (!(matrix.length == 0 || matrix[0].length == 0)) {

                for (int i = 0; i < transposed.length; i++) {
                  for (int j = 0; j < matrix.length; j++) {
                    transposed[i][j] = matrix[j][i];
                  }
                }
            }
        return transposed;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        int[][] matrix = {
                {1, 2},
                {7, -13} };

        int[][] result = transpose(matrix);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }

}
