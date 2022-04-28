package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Missing_in_AP {
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
            int low=0,high=n-1;
            int mid=low+(high-low)/2;
            int cd=0;
            if((arr[mid]-arr[mid-1])==(arr[mid+1]-arr[mid]))
                cd=arr[mid]-arr[mid-1];
            else
                cd=Math.abs((arr[mid]-arr[mid-1])-(arr[mid+1]-arr[mid]));
            for (int i= 0; i < n-1 ; i++){
                if(arr[i]+cd==arr[i+1]) {
                    continue;
                }
                else{
                    System.out.println(arr[i]+cd);
                    break;
                }
            }
            t--;
        }
    }
}
