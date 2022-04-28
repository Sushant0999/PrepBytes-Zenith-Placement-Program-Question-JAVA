package com.company;

import java.util.Scanner;

class Books_Left {
    static void Check_Book_Left(long[] arr, long k) {
        int count = 0, i;
        for (i = 0; i < arr.length && arr[i] <= k; i++) {
            if (arr[i] <= k) {
                count++;
            } else {
                break;
            }
        }
        for (int j = arr.length - 1; j > i && arr[j] <= k; j--) {
            if (arr[j] <= k) {
                count++;
            } else {
                break;
            }
        }
        long now_left = (arr.length - count);
        System.out.println(now_left);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Check_Book_Left(arr, k);
    }
}

