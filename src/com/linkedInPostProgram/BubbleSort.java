package com.linkedInPostProgram;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,6,4,8,2,9,7,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] sort(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            for (int j = 0; j<n-1; j++){

                if (arr[j] >arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
        return arr;
    }
}
