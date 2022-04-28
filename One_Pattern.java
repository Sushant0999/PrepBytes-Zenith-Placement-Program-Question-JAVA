package com.company;

import java.io.IOException;

public class One_Pattern {
    public static void main(String args[]) throws IOException {

        //write your code here
        for (int i = 0; i < 5; i++) {
            // printing '*' in each column.
            for (int j = 0; j <= i; j++) {
                System.out.print(" 1 ");
            }
            System.out.println(" ");
        }
    }
}
