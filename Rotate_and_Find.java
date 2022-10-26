package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Rotate_and_Find {
    public static void main(String[] args) throws IOException {

        //write your code here
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0){
            int n = s.nextInt();
            boolean flag = true;
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = s.nextInt();
            }
            int x = s.nextInt();
            for(int i = 0; i < n; i++){
                if(arr[i] == x){
                    System.out.println(i);
                    flag = false;
                }
            }
            if(flag == true)
            System.out.println("-1");
        }
    }
}
