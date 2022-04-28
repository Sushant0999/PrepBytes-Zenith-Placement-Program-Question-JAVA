package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Transition_Point {
    public static void main(String[] args) throws IOException {

        //write your code here
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t!=0){
            int n = s.nextInt(), temp = 0,flag = 0;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++){
                arr[i] = s.nextInt();
            }
            for (int i = 0; i < n; i++){
                if(arr[i] > 0){
                    temp = i;
                    break;
                }else{
                    flag++;
                }
            }
            if(flag == arr.length){
                System.out.println("-1");
            }
            else{
                System.out.println(temp);
            }
            t--;
        }
    }
}
