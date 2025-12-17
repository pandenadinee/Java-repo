package com.Demo;

import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        int[] arr = {2, 0, 4, 0, 5, 0, 1};
        moveToRight(arr);
        moveToLeft(arr);
    }
    public static void moveToRight(int[] arr){
        int n = arr.length;
        int i = 0;
        int j = 0;

        while (j < n){
            if (arr[j] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void moveToLeft(int[] arr) {
        int n = arr.length;
        int i = n-1;
        int j = n-1;

        while (j >= 0){
            if (arr[j] != 0){
                int temp = arr[i];
                arr [i] = arr[j];
                arr[j] = temp;
                i--;
            }
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
