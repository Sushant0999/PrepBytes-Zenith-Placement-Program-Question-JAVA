package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Peak_House {
    public static void main(String[] args) throws IOException {

        //write your code here
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t!=0){
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            int max = 0, j = 0;
            for(int i = 0; i < n; i++){
                if(arr[i] > max){
                    max = arr[i];
                    j = i;
                }
            }
            System.out.println(j);
            t--;
        }
    }
}
