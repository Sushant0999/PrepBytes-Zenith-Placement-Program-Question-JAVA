package com.company;

import java.util.Scanner;

public class Fascinating_Number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t != 0){
            int n = s.nextInt();
            System.out.println(fascinating(n));
            t--;
        }
    }

    private static int fascinating(int n) {
        int res = n;
        int rem = 0, max = 0;
        while(n > 0){
            rem = n % 10;
            n = n / 10;
            if(rem > max){
                max = rem;
            }
        }
        return near(res,max + 1);
    }
    private static int near(int n, int m){
        n = n / 10;
        n = n * 10;
        return n + m;
    }

}
