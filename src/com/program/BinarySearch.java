package com.program;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 8, 3, 6, 2, 4, 9, 11, 1};
        int target = 9;
        Arrays.sort(arr);
        int index = binarySearch(arr, target);
        System.out.println("Target found at index : " + index);

    }

    public static int binarySearch(int[] arr, int target) {
        int n = arr.length;

        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            }
        }
        return -1;
    }
}

