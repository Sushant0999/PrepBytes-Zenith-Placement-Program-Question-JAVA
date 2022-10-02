package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Tina_Loves_A {
    public static void main(String[] args) throws IOException {

        //write your code here
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();
        while(t-- > 0){
            String s1 = s.nextLine();
            System.out.println(tina_love_a(s1));
        }
    }

    private static int tina_love_a(String s1) {
        int count = 0, len = s1.length();
        for (int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) == 'a'){
                count++;
            }
        }
        if(count <= len / 2){
            return (count * 2) - 1;
        }
        return len;
    }
}
