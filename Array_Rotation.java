package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Array_Rotation {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int k = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            rotatedArray(n,k,arr);
            for (int i = 0; i < arr.length; i++){
                System.out.print(arr[i]+" ");
            }
        }

    }

    //Brute-Force Approach
    private static int[] rotatedArray(int n, int k, int[] arr) {
        if(k == 0 || k == n)
            return arr;
        k = k % n;
       rotate(n,k,arr);
       return arr;
    }
    //Brute-Force Approach
    private static void rotate(int n, int k, int[] arr) {
        int[] front = new int[k];
        int[] rear = new int[n - k];
        int loc = 0;
        for (int i = 0; i < n - k; i++){
            rear[loc] = arr[i];
            loc++;
        }
        loc = 0;
        for (int i = n - k; i < arr.length; i++){
            front[loc] = arr[i];
            loc++;
        }
        for (int i = 0; i < front.length; i++){
            arr[i] = front[i];
        }
        loc = 0;
        for (int i = front.length; i < arr.length; i++){
            arr[i] = rear[loc];
            loc++;
        }
    }
    //Optimized Approach

}
