package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Journey_of_Bablu_and_Dablu {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t != 0) {
            int n = s.nextInt();
            check_seat(n);
            t--;
        }
    }

    private static void check_seat(int n) {
        String[] arr = {"LB","MB","UB","LB","MB","UB","SU","SL"};
        int num = n;
        int rem = n % 8;
        if(rem == 0 || rem == 7){

        }else{
            System.out.println(Integer.toString(n-3)+arr[rem - 1]);
        }
    }
}
