package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Mixed_Input {
    public static void main(String args[]) throws IOException {

        //write your code here
        int N;
        float M;
        char ch;
        Scanner s = new Scanner(System.in);
        N = s.nextInt();
        M = s.nextFloat();
        ch = s.next().charAt(0);
        System.out.format(N+"$"+"%.2f",M);
        System.out.println("$"+ch);
    }
}
