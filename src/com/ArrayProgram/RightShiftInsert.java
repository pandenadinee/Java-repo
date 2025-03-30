package com.ArrayProgram;

import java.util.Arrays;

public class RightShiftInsert {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int insertIndex = 3;
        shift(arr,insertIndex);

    }
    public static void shift(int[] arr ,int insertIndex){
        int n = arr.length;
        for (int i = n-1; i>=insertIndex; i--){
            arr[i] = arr[i-1];
        }
        arr[insertIndex] = 30;
        System.out.println(Arrays.toString(arr));

    }
}
