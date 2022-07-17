package com.company;
import java.io.IOException;
import java.util.Scanner;

public class Find_the_Leader {
    public static void main(String[] args)throws IOException {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            leader(arr, n);
            System.out.println();
        }
    }

    private static void leader(int[] arr, int n) {
        int max = 0;
        for(int i = n - 1; i >= 0; i--){
            if(arr[i] >= max){
                max = arr[i];
                System.out.print(max+" ");
            }

        }
    }
}
