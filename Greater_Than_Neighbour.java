package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Greater_Than_Neighbour {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t != 0) {
            int n = s.nextInt();
            int[] arr = new int[1000];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            neighbour(arr);
            t--;
        }
    }

    private static void neighbour(int[] arr) {
        int count = 0;
        int[] arrayList = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                if (arr[i] > arr[i + 1]) {
                    System.out.print(i+" ");
                    count++;
                }
            } else if (i == arr.length - 1) {
                if (arr[i] > arr[arr.length - 1]) {
                    System.out.print(i+" ");
                    count++;
                }
            } else {
                if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                    System.out.print(i+" ");
                    count++;
                }
            }
        }
        if(count == 0){
            System.out.println(-1);
        }
        System.out.println();
    }
}
