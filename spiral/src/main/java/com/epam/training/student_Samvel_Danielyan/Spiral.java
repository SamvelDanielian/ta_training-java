package com.epam.training.student_Samvel_Danielyan;

class Spiral {
    static int[][] spiral(int rows, int columns) {
        int[][] mat = new int[rows][columns];
        int counter = 1;
        int startCol = 0;
        int endCol = columns - 1;
        int startRows = 0;
        int endRows = rows - 1;

        while (startRows <= endRows && startCol <= endCol) {
            for (int i = startCol; i <= endCol; i++) {
                mat[startRows][i] = counter;
                counter++;
            }
            startRows++;

            for (int j = startRows; j <= endRows; j++) {
                mat[j][endCol] = counter;
                counter++;
            }
            endCol--;

            if (startRows > endRows) {
                break;
            }
            for (int l = endCol; l >= startCol; l--) {
                mat[endRows][l] = counter;
                counter++;
            }
            endRows--;

            if (startCol > endCol) {
                break;
            }
            for (int y = endRows; y >= startRows; y--) {
                mat[y][startCol] = counter;
                counter++;
            }
            startCol++;
        }
        return mat;
    }
}
