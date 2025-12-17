package com.Demo;

import java.util.Arrays;

public class RightShiftArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int insertIndex = 3;
        int valueToInsert = 100;
        reverse(arr, insertIndex, valueToInsert);

    }
    public static int[] reverse(int[] arr ,int insertIndex ,int valueToInsert){
        int n = arr.length;

        for(int i = n-1; i>=insertIndex; i--){
            arr[i] = arr[i-1];

        }
        arr[insertIndex] = valueToInsert;
        System.out.println(Arrays.toString(arr));
        return arr;

    }
}
