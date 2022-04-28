package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Difficulty_Coding {
    public static void main(String[] args) throws IOException {

        //write your code here
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t!=0){
            int n = s.nextInt(), flag = 0;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++){
                arr[i] = s.nextInt();
            }
            for (int i = 0; i < n; i++){
                if(arr[i] == 1){
                    flag++;
                    break;
                }
            }
            if(flag == 1){
                System.out.println("hard");
            }
            else{
                System.out.println("easy");
            }
            t--;
        }
    }
}
