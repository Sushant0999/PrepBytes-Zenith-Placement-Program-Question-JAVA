package com.company;

import java.util.Scanner;

public class Birthday_Gift {
    static String gift(int a, int b, int c) {
        if(a >= 0 && b >= 0 && c >= 0){
            while(a <= b){
                if(c == 0 && a != b){
                    break;
                }
                if(a == b || b % a == 0){
                    return "YES";
                }else{
                    a = a + c;
                }
            }
        }else{
            if(a >= b){
                while(a >= b){
                    if(c == 0 && a != b){
                        break;
                    }
                    if(a == b){
                        return "YES";
                    }else{
                        a = a + c;
                    }
                }
            }else{
                while(b >= a){
                    if(c == 0 && a != b){
                        break;
                    }
                    if(a == b){
                        return "YES";
                    }else{
                        a = a + c;
                    }
                }
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while (t != 0) {
            int a = s.nextInt(), b = s.nextInt(), c = s.nextInt();
            System.out.println(gift(a, b, c));
            t--;
        }


    }
}
