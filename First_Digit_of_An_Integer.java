package com.company;

import java.io.IOException;
import java.util.Scanner;

public class First_Digit_of_An_Integer {
    public static void main(String[] args) throws IOException {

        //write your code here
        int n, rem = 0, t;
        Scanner s = new Scanner(System.in);
        t = s.nextInt();
        while (t != 0) {
            n = s.nextInt();
            while (n > 0) {
                rem = n % 10;

                n = n / 10;
            }
            System.out.println(rem);
            t--;
        }
    }
}
