package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Boxes_and_Toys {
    public static void main(String[] args)throws IOException {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int count = 0;
        while(t!=0){
            int toys = s.nextInt(), capacity = s.nextInt();
            if(max_capacity(toys,capacity) >= 2){
                count = count + 1;
            }
            t--;
        }
        System.out.println(count);
    }

    private static int max_capacity(int toys, int capacity) {
        return (capacity - toys);
    }


}
