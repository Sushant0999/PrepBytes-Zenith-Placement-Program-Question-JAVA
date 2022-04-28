package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Number_of_Occurences {
    public static void main(String[] args) throws IOException {

        //write your code here
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t!=0){
            int n = s.nextInt(), count = 0;
            char[] a = new char[n];
            for (int i = 0; i < a.length; i++){
                a[i] = s.next().charAt(0);
            }
            for (char c : a) {
                if (c == 'x') {
                    count++;
                }
            }
            System.out.println(count);
            t--;
        }
    }
}
