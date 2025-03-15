package com.javaPractice;


import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66,77};
        int n = arr.length;
        int[] arr1 = new int[n];

        for(int i =0 , j =n-1; i<=n-1&j>=0; i++,j--){
            arr1[j] = arr[i];
//            System.out.println(arr1[j]);
        }
        System.out.println(Arrays.toString(arr1));
    }
}
