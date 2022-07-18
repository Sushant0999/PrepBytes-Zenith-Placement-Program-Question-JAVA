package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Chaturs_Exam_Paper {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();
        while(t-- > 0){
            String S = "";
            S = s.nextLine();
            System.out.println(chaturExam(S));
        }
    }

    private static int chaturExam(String s1){
        int count = 0;
        for (int i = 0; i < s1.length() / 2; i++){
            count += Math.abs(s1.charAt(i) - s1.charAt(s1.length() - 1 - i));
        }
        return count;
    }
}
