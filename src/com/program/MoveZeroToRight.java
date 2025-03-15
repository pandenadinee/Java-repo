package com.program;

import java.util.Arrays;

public class MoveZeroToRight {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0, 7, 8};
        moveZeroToRight(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void moveZeroToRight(int[] arr) {
        int n = arr.length;
        int nonZeroIndex = 0;
        int current = 0;
        while (current < n) {
            if (arr[current] != 0) {
                int temp = arr[nonZeroIndex];
                arr[nonZeroIndex] = arr[current];
                arr[current] = temp;
                nonZeroIndex++;
            }
            current++;
        }
    }
}
