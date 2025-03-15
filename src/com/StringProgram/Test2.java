package com.StringProgram;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        //  2 1 7 6 5 4 3
        // 3 4 5 6 7 1 2
        int n = arr.length;
        int k = 2;
        k = k % n;
        reverse(arr, 0, k - 1);
        reverse(arr, k , n -1);
        reverse(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int[] arr ,int i , int j){
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
