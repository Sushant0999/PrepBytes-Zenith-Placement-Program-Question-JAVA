package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Input_and_Add_Numbes {
    public static void main(String args[]) throws IOException {

        //write your code here
        int n,m;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        m = s.nextInt();
        System.out.println(n+m);
    }
}
