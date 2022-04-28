package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Print_Double_Number {
    public static void main(String args[]) throws IOException {

        //write your code here
        double N;
        Scanner s = new Scanner(System.in);
        N = s.nextDouble();
        System.out.format("%.2f",N);
    }
}
