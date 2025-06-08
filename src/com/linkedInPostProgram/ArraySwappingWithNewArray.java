package com.linkedInPostProgram;

import java.util.Arrays;

public class ArraySwappingWithNewArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        swap(arr);

    }

    public static void swap(int[] arr) {
        int[] arr1 = new int[arr.length];
        int n = arr1.length;
        for (int i = 0, j = n - 1; i < n && j >= 0; i++, j--) {
            arr1[i] = arr[j];
        }
        System.out.println(Arrays.toString(arr1));
    }
}
