package com.company;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Fake_Password {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();
        while (t-- > 0) {
            String original = "";
            String fake = "";
            original = s.nextLine();
            fake = s.nextLine();
            password(original, fake);
        }
    }

    private static void password(String original, String fake) {
//        char first = '0';
//        char[] temp = fake.toCharArray();
//        for (int j = 0; j < 2; j++) {
//            first = temp[0];
//            for (int i = 0; i < fake.length() - 1; i++) {
//                temp[i] = temp[i + 1];
//            }
//            temp[temp.length - 1] = first;
//        }
//        fake = String.copyValueOf(temp);
//        if (fake.compareTo(original) != 0){
//            System.out.println("No");
//        }else{
//            System.out.println("Yes");
//        }
        int start = 0;
        int last = fake.length() - 2;
        int length = fake.length();
        int front = length - last;
        String first = fake.substring(start, front);
        String firstHalf = fake.substring(front, length);
        String second = fake.substring(last, length);
        String secondHalf = fake.substring(start, last);
        String temp1 = second.concat(secondHalf);
        String temp2 = firstHalf.concat(first);
        System.out.println(temp1);
        System.out.println(temp2);
        if (temp1.compareTo(original) == 0 || temp2.compareTo(original) == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
//string
//ngstri