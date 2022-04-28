package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Fit_Square {
    public static void main(String[] args) throws IOException {

        //write your code here
        int M,N,T;
        Scanner s = new Scanner(System.in);
        T = s.nextInt();
        while (T!=0) {
            M = s.nextInt();
            N = s.nextInt();
            System.out.println((M * N)/ 2);
            T--;
        }
    }
}
