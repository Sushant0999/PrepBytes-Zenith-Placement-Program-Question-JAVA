package com.company;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Smallest_Number {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        int k = s.nextInt();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(smallest(size, arr, k));
    }

    //Optimal Approach
    private static int smallest(int size, int[] arr, int min) {
        HashSet<Integer> set = new HashSet<>();
        int count = 1;
        for(int i = 0; i < size; i++){
            if(set.contains(arr[i])){
                count++;
            }if(count == min){
                return arr[i];
            }
            set.add(arr[i]);
        }
        return -1;
    }
    //BruteForce Approach

    /*public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), count = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int k = s.nextInt();
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == k) {
                System.out.println(arr[i]);
                break;
            }
        }
    }*/
}
