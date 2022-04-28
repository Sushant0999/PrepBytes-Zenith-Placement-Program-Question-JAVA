package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Clock_and_Angles {
    public static void main(String[] args) throws IOException {

        //write your code here
        int h,m,sum;
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while(t!=0) {
            h = s.nextInt();
            m = s.nextInt();
            sum = (h * 60 + m ) / 2 - m * 6;
            if(sum > 180){
                System.out.println(Math.abs(360 - sum));
            }
            else {
                System.out.println(Math.abs(sum));
            }
            t--;
        }
    }
}
