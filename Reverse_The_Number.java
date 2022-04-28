package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Reverse_The_Number {
    public static void main(String[] args) throws IOException {

        //write your code here
        int X,rev = 0,rem = 0;
        Scanner s = new Scanner(System.in);
        s.reset();
        X = s.nextInt();
        while (X > 0){
            rem = X % 10;
            rev = rev * 10 + rem;
            X = X / 10;
        }
        System.out.println(rev);
    }
}
