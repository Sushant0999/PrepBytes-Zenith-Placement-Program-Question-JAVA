package com.company;

import java.io.IOException;
import java.util.Scanner;

public class V_Pattern {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        char ch = s.next().charAt(0);
        vpattern(5);
    }

    private static void vpattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for(int k = n - i; k >= 1; k--){
                System.out.print(" ");
            }
            for(int k = n - i; k >= 1; k--){
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
