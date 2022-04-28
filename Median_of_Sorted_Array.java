package com.company;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Median_of_Sorted_Array {
    public static void main(String[] args) throws IOException {

        //write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[((n+1)/2)-1]);
    }
}
