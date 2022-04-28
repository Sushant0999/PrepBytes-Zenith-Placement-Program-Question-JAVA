package com.company;

import java.util.Scanner;

public class Maximum_Choclates {
    static long choclate(int n,long[] arr){
        long tina = 0;
        sort(n,arr);
        for (int i = 0; i < n; i++){
            if(i % 2 == 0){
                tina = tina + arr[i];
            }
        }
        return tina;
    }
    static void sort(int n, long[] arr){
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n -i - 1; j++){
                if(arr[j] < arr[j + 1]){
                    long temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long t = s.nextInt();
        while(t!=0){
            int n = s.nextInt();
            long[] arr = new long[n];
            for(int i = 0; i < n; i++){
                arr[i] = s.nextLong();
            }
            System.out.println(choclate(n,arr));
            t--;
        }
    }
}
