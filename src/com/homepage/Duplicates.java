package com.homepage;

import java.util.Arrays;
import java.util.HashSet;

public class Duplicates {
    public static void main(String[] args) {
        int [] arr = {1,5,1,2,5,3,4,2,1};
        Arrays.sort(arr);
        duplicates(arr);

    }
    public static void duplicates(int [] arr){
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<n-1; i++){
            if (arr[i] == arr[i+1]){
                set.add(arr[i]);
            }

        }
        System.out.println(set);
    }
}
