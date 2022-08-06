package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Same_String {

    public static void main(String args[]) throws IOException {

        //write your code here
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();
        while (t-- > 0) {
            String s1 = s.nextLine();
            String s2 = "";
            string(s1, 0, s2);
        }
    }

    private static void string(String s1, int n, String s2) {
        if (n == s1.length()) {
            if(s1.equals(s2)){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
            return;
        }
        s2 = s2 + s1.charAt((s1.length() - n) - 1);
        string(s1, n + 1, s2);
    }
}
