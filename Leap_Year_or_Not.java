package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Leap_Year_or_Not {
    public static void main(String args[]) throws IOException {

        //write your code here
        int y,t;
        Scanner s = new Scanner(System.in);
        t = s.nextInt();
        while(t!=0){
            y = s.nextInt();
            if(y % 4 == 0 && y % 100 != 0 || y % 400 == 0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            t--;
        }
    }
}
