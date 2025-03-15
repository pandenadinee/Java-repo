package com.program;

import java.util.Arrays;

public class RightShift {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
//        rightShift(arr);
        leftshift(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void rightShift(int[] arr){
        int n = arr.length;
        int insertIndex = arr[2];
        for(int i = n-1; i>insertIndex; i--){
            arr[i] = arr[i-1];

        }
        arr[insertIndex] = 20;
    }
    public static void leftshift(int[] arr){
        int n = arr.length;
        int insetIndex = arr[3];
        for(int i = 0; i<insetIndex; i++){
            arr[i] = arr[i+1];
        }
        arr[insetIndex] = 40;
    }
}
