package com.linkedInPostProgram;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 3, 1, 8, 5, 9};
        int target = 1;
        System.out.println(search(arr, target));


    }

    public static int search(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
