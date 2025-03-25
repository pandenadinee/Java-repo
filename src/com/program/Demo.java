package com.program;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {1,0,4,3,0,0,8,0,7};
        moveToRight(arr);
    }
    public static void moveToRight(int[] arr){
        int n = arr.length;
        int i = 0;
        int j = 0;
        while (j<n){
            if (arr[j] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
