package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Interesting_Array {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            int k = s.nextInt();
            intrestingArray(n, arr, k);
        }
    }

    private static void intrestingArray(int n, int[] arr, int k) {
        //Brute-Force Approach
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (arr[i] + arr[j] == k) {
//                    System.out.println(i + " " + j);
//                    return;
//                }
//            }
//        }
//        System.out.println("no answer");
        //Optimized Approach
        int y = 0, x = 0;
        for (int i = n - 1; i >= 0; i--) {
            x = k % arr[i];
            y = check(x, arr, n);
            if (x != -1 && arr[i] + arr[y] == k && y < i) {
                System.out.println(y + " " + i);
                return;
            }
        }
        System.out.println("no answer");
    }

    private static int check(int x, int[] arr, int n) {
//        for (int i = 0; i < n; i++) {
//            if (arr[i] == x) {
//                return i;
//            }
//            if(x < arr[i]){
//                break;
//            }
//        }
        int front = 0;
        int last = n;
        while (front <= last){
            int mid = (front + last) / 2;
            if(arr[mid] == x){
                return mid;
            }else if(x > arr[mid]){
                front = mid + 1;
            }else {
                last = mid - 1;
            }
        }
        return -1;
    }
}
