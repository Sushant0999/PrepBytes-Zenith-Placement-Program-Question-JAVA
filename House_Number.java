package com.company;

import java.util.Scanner;

public class House_Number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t != 0) {
            int n = s.nextInt();
            System.out.println(houseNumber(n));
            t--;
        }
    }

    private static long houseNumber(long n) {
        long[] arr = new long[13];
        for (int i = 1; i < 13; i++) {
            arr[i] = (long) Math.pow(10, i) - 1;
        }
        for (int i = 2; i < 13; i++) {
            for (int j = 1; j <= i - 1; j++) {
                arr[i] = arr[i] - arr[j];
            }
        }
        long count = 0;
        for (int i = 1; i < 13; i++) {
            if (n - arr[i] >= 0) {
                count += arr[i] * i;
                n = n - arr[i];
            } else {
                count += n * i;
                break;
            }
        }

        return count;
    }
}


//refernce https://youtu.be/5Q2-PTtWZK8