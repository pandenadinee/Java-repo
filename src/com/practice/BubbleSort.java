package com.practice;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,5,3,7,4,8,1,6};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static int[] sort(int[] arr){
        int n = arr.length;
        for (int i = 0; i<n; i++){
            for (int j = 0; j<n-1; j++){
                if (arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
