package com.company;

import java.io.IOException;
import java.util.Scanner;

public class PrepBuddy_and_Socks {
    public static void main(String[] args) throws IOException {

        //write your code here
        Scanner s = new Scanner(System.in);
        int T = s.nextInt(),N;
        while(T!=0){
            N =  s.nextInt();
            System.out.println(N + 1);
            T--;
        }
    }
}
