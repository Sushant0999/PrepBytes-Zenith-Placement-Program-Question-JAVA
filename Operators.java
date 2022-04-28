package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Operators {
    public static void main(String[] args) throws IOException {

        //write your code here
        int x,y;
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        y = s.nextInt();
        if(x>y){
            System.out.println(x+" is greater than "+y);
        }
        else if(x<y){
            System.out.println(x+" is smaller than "+y);
        }
        else{
            System.out.println(x+" is equal to "+y);
        }
    }
}
