package com.company;

import java.util.Scanner;

public class Arranging_Stones {
    static int getMax(int[] arr,int start,int end){
        int max = start;
        for (int i = 0; i <= end; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            int last = arr.length - i - 1;
            int max = getMax(arr,0,last);
            swap(arr,max,last);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0){
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            sort(arr);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
