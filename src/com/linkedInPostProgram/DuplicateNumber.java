package com.linkedInPostProgram;

import java.util.Arrays;
import java.util.HashSet;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1, 6, 3, 5, 6, 1, 7, 8, 5, 3, 6, 1};
        Arrays.sort(arr);
        duplicate(arr);

    }
    public static void duplicate(int[] arr){
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<n-1; i++){
            if (arr[i] == arr[i+1]){
                set.add(arr[i]);
            }
        }
        System.out.println(set);
        for (Integer i :set){
            System.out.println(i);
        }
    }
}
