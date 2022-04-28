package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Number_Pattern {
    public static void main(String[] args) throws IOException {

        //write your code here
        //Outer Loop for number of Rows
        for(int i=5 ;i>= 1;i--)
        {
            // printing '*' in each column.
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
