package com.Demo;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 6, 7, 2, 8};
        int target = 6;
        Arrays.sort(arr);

        System.out.println(numberSearch(arr, target));

    }

    public static int numberSearch(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
