package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Last_One {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t!=0)
        {
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            System.out.println(last(arr, n));
            t--;
        }
    }

    public static int last(int[] arr,int n){
        int index = 0;
        for(int i = n - 1; i >= 0; i--){
            if(arr[i] == 1){
                index = i;
                return index;
            }
        }
        return -1;
    }
}
