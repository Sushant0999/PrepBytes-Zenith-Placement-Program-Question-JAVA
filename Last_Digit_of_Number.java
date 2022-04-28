package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Last_Digit_of_Number {
    public static void main(String args[]) throws IOException {

        //write your code here
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        System.out.println(n%10);
    }
}
