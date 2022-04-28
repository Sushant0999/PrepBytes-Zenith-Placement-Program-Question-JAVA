package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Get_the_Sunlight {
    public static void main(String[] args) throws IOException {

        //write your code here
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t!=0){
            int max = 0, n = s.nextInt(), count = 1;
            int[] a = new int[n];
            for (int i = 0; i < n; i++){
                a[i] = s.nextInt();
            }
            max = a[0];
            for (int i = 1; i < n; i++){
                if(max < a[i]){
                    count++;
                    max = a[i];
                }
            }
            System.out.println(count);
            t--;
        }
    }
}
