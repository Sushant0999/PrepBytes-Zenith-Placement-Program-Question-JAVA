package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Character_Value {
    public static void main(String[] args) throws IOException {

        //write your code here
        char c;
        Scanner s = new Scanner(System.in);
        c = s.next().charAt(0);
        if (c == 'P' || c == 'p'){
            System.out.println("PrepBytes");
        }
        else if (c == 'Z' || c == 'z'){
            System.out.println("Zenith");
        }
        else if (c == 'E' || c == 'e'){
            System.out.println("Expert Coder");
        }
        else if(c == 'D' || c == 'd'){
            System.out.println("Data Structure");
        }
    }
}
