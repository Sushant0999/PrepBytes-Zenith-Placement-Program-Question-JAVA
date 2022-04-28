package com.company;

import static java.lang.Integer.*;

public class relevel {
    static int binaryLove(int n){
        int sum = 0;
        for(int i = 0; i <= n; i++){
            String res = Integer.toBinaryString(i);
            sum = sum + check(res);
        }
        return sum;
    }
    static int check(String s){
        int total = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1'){
                total++;
            }
        }
        return total;
    }
    public static void main(String[] args) {
        int n = 2;
        System.out.println(binaryLove(n));
    }
}
