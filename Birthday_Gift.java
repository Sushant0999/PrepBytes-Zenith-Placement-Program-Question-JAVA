package com.company;

import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner s = new Scanner(System.in);
      
      int t = s.nextInt();
      
      while(t-- > 0){
        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();

        // Check if B can be reached from A using C
        if (C != 0 && (B - A) % C == 0 && (B - A) / C >= 0) {
            System.out.println("YES");
        } else if (A == B) {
            // Handle the case when A is already equal to B
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
       }
      }

        // Input A, B, and C
        
  }
