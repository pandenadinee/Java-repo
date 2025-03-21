package com.homepage;

import java.util.Arrays;

public class BBShort {
    public static void main(String[] args) {
        int[] arr = {7, 4, 6, 3, 9, 1, 2, 0, 8, 5};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void sort(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
