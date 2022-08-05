package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Binary {
    public static void main(String args[]) throws IOException {

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int[] arr = new int[n];
            arr[0] = 0;
            binary(arr, 1, n);
            arr[0] = 1;
            binary(arr, 1, n);
        }
    }

    public static void binary(int[] arr, int k, int n) {
        if (k == n) {
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i]);
            }
            System.out.println();
        } else {
            if (arr[k - 1] == 0) {
                arr[k] = 0;
                binary(arr, k + 1, n);
                arr[k] = 1;
                binary(arr, k + 1, n);
            } else {
                arr[k] = 0;
                binary(arr, k + 1, n);
            }
        }
    }
}
