package com.company;

import java.util.Scanner;

public class Floor_of_a_Number {
    static int floor(int n, int[] A){
        int temp = 0, flag = 0;
        for (int i = 0; i < A.length; i++){
            if(n >= A[i]){
                temp = i;
            }
            else{
                flag++;
            }
        }
        if(flag == A.length){
            return -1;
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t!=0){
            int n = s.nextInt(),x = s.nextInt();
            int[] A = new int[n];
            for (int i = 0; i < n; i++){
                A[i] = s.nextInt();
            }
            System.out.println(floor(x,A));
            t--;
        }
    }
}
