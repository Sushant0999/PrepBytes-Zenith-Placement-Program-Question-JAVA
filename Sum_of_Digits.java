package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Sum_of_Digits {
    public static void main(String args[]) throws IOException {

        //write your code here
        int X,sum = 0,rem = 0;
        Scanner s = new Scanner(System.in);
        X = s.nextInt();
        while(X>0){
            rem = X % 10;
            sum = sum + rem;
            X = X / 10;
        }
        System.out.println(sum);
    }
}
