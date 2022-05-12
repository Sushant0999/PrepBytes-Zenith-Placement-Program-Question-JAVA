package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Lower_and_Upper_Triangular_Matrices {
    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(System.in);
        int rows1 = s.nextInt(), cols1 = s.nextInt();
        int[][] matrix1 = new int[rows1][cols1];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = s.nextInt();
            }
        }
        upperMatrix(matrix1,rows1,cols1);
        lowerMatrix(matrix1,rows1,cols1);
    }

    private static void lowerMatrix(int[][] matrix1, int rows1, int cols1) {
        for(int i = 0; i < rows1; i++){
            for (int j = 0; j < cols1; j++){
                if(i > j){
                    System.out.print('0'+" ");
                }else{
                    System.out.print(matrix1[i][j]+" ");
                }
            }
            System.out.println();
        }
    }

    private static void upperMatrix(int[][] matrix,int row,int col){

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(i < j){
                    System.out.print('0'+" ");
                }else{
                    System.out.print(matrix[i][j]+" ");
                }
            }

            System.out.println();
        }
    }

}

