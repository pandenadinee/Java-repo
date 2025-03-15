package com.javaPractice;

import java.util.Arrays;

public class ArraysReverseWithThirdVariable {
    public static void main(String[] args) {
        int[] arr = {1,24,56,3,36,88};
        int n = arr.length;
        for(int i=0 ,  j=n-1; i<j; i++,j--){
            int temp =arr[i];
            arr[i] =arr[j];
            arr[j] =temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}

