package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Rearrange_the_Array {
    public static void main(String[] args) throws IOException {

        //write your code here
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt(), right = n - 1, left = 0;
            int[] arr = new int[n];
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (count == n)
                    break;
                for (int k = n - 1; k >= 0; k--) {
                    res[count] = arr[right];
                    right--;
                    break;
                }
                count++;
                if (count == n)
                    break;
                for (int j = 0; j < n; j++) {
                    res[count] = arr[left];
                    left++;
                    break;
                }
                count++;
            }
            for(int i = 0; i < n; i++){
                System.out.print(res[i]+" ");
            }
        }
    }
}
