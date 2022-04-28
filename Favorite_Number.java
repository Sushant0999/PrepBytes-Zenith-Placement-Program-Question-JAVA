package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Favorite_Number {
    public static void main(String[] args) throws IOException {

        //write your code here
        int X,sum = 0,rem = 0,t;
        Scanner s = new Scanner(System.in);
        t = s.nextInt();
        while(t!=0) {
            s.reset();
            X = s.nextInt();
            while (X > 0) {
                rem = X % 10;
                if (rem == 5) {
                    sum++;
                }
                X = X / 10;
            }
            System.out.println(sum);
            sum = 0;
            t--;
        }

    }
}
