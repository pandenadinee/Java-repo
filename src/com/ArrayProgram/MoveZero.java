package com.ArrayProgram;

import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        int[] arr = {1,0,2,0,0,3,4,0,5};
        moveToRight(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] moveToRight(int[] arr){
        int n = arr.length;
        int i = 0;
        int j = 0;
        while (j<n){
            if (arr[j] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]   = temp;
                i++;
            }
            j++;
        }
        return arr;
    }
}
