package com.javaPractice;

import java.util.Arrays;

public class BubbleSortingProgram {
    public static void main(String[] args) {
        int[] arr = {7, 4, 6, 3, 9, 1, 2, 0, 8};
        Sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void Sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }
}
