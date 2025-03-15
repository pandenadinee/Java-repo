package com.javaPractice;

import java.util.Arrays;

public class Demo4 {
    public static void main(String[] args) {
        int[] arr = {9,3,6,4,7,1,5,2};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void BubbleSort(int[] arr){
        int n = arr.length;
        for(int i =0; i<n; i++){
            for(int j = 0; j<n-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
    }
}
