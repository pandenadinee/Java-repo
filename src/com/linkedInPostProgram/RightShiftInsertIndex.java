package com.linkedInPostProgram;

import java.util.Arrays;

public class RightShiftInsertIndex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int insertIndex = 3;
        int valueToInsert = 100;

        rightShift(arr, insertIndex, valueToInsert);

    }

    public static void rightShift(int[] arr, int insertIndex, int value) {
        int n = arr.length;

        for (int i = n - 1; i > insertIndex; i--) {
            arr[i] = arr[i - 1];
        }
        arr[insertIndex] = value;

        System.out.println("Modified array: " + Arrays.toString(arr));
    }
}
