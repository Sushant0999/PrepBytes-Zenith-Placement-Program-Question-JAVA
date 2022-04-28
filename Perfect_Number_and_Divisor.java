package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Perfect_Number_and_Divisor {
    public static void main(String[] args) throws IOException {

        //write your code here
        int n,t,sum = 0,i;
        Scanner s = new Scanner(System.in);
        t = s.nextInt();
        while (t!=0){
            n = s.nextInt();
            for (i = 1;i < n;i++){
                if(n % i == 0){
                    sum = sum + i;
                }
            }
            if(sum != n){
                System.out.println("false");
            }
            else{
                System.out.println("true");
            }
            sum = 0;
            t--;
        }
    }
}
