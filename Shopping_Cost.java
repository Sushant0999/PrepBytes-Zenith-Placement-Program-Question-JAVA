package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Shopping_Cost {
    public static void main(String[] args) throws IOException {

        //write your code here
        int Q,P,T;
        double Total,Final;
        Scanner s = new Scanner(System.in);
        T = s.nextInt();
        while (T!=0) {
            Q = s.nextInt();
            P = s.nextInt();
            Total = Q * P;
            if(Q > 100){
                Final = (Total * 20) / 100;
                System.out.println(Total - Final);
            }
            else{
                System.out.println(Total);
            }
            T--;
        }
    }
}
