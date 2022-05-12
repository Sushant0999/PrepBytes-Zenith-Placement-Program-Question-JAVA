package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Find_the_Missing {
    public static void main(String[] args) throws IOException {

        //write your code here
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 1; i < n; i++) {
                arr[i] = s.nextInt();
            }
            System.out.println(missing(arr, n));
        }
    }

    private static int missing(int[] arr, int n) {
        int sum = 0, total = 0;
        for (int i = 1; i < arr.length; i++) {
            sum = sum + arr[i];
            total = total + i;
        }
        total = total + n;
        return total - sum;
    }

}
