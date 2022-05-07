package com.company;

import java.util.Scanner;

public class Operations_on_Matrix {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rows1 = s.nextInt(), cols1 = s.nextInt();
        int[][] matrix1 = new int[rows1][cols1];
        int[][] matrix2 = new int[rows1][cols1];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = s.nextInt();
            }
        }
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix2[i][j] = s.nextInt();
            }
        }
        add(matrix1, matrix2, rows1, cols1);
        multiply(matrix1, matrix2, rows1, cols1);
    }

    private static void multiply(int[][] matrix1, int[][] matrix2, int row, int col) {
        int[][] result = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                for (int k = 0; k < row; k++){
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void add(int[][] matrix1, int[][] matrix2, int row, int col) {
        int[][] result = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] += matrix1[i][j] + matrix2[i][j];
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
