package com.javaPractice;

import java.util.Arrays;

public class LeftRotation {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80};
        int n = arr.length;

        int k = 41;
        int rotation = k % n;
        for(int i = 1; i<=rotation; i++){
            int temp = arr[0];
            for(int j = 0; j<n-1; j++){
                arr[j] = arr[j+1];

            }
            arr[n -1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
