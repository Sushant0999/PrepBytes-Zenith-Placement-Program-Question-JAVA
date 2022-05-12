package com.company;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Smallest_Number {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        int min = s.nextInt();
        System.out.println(smallest(size, arr, min));
    }

    private static int smallest(int size, int[] arr, int min) {
        if(arr.length == 0){
            return -1;
        }
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < size; i++) {
            if (hash.containsKey(arr[i])) {
                hash.put(arr[i], hash.get(arr[i]) + 1);
            } else {
                hash.put(arr[i], 1);
            }
        }
        for (int i = 0; i < hash.size(); i++) {
            if (hash.containsKey(i)) {
                if (hash.containsValue(min)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
