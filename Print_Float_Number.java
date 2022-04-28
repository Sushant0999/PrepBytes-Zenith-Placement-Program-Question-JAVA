package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Print_Float_Number {
    public static void main(String args[]) throws IOException {

        //write your code here
        float N,M;
        Scanner s = new Scanner(System.in);
        N = s.nextFloat();
        M = s.nextFloat();
        System.out.format("%.2f",N);
        System.out.format(" "+"%.2f",M);
    }
}
