package com.Demo;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,2,5,1,6,3,8,9,0};
        sort(arr);
    }
    public static void sort (int[] arr){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            for (int j = 0; j<n-1; j++ ){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
