package com.linkedInPostProgram;

import java.util.Arrays;

public class MoveZeroToRight {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0,7,8};
//        moveToRight(arr);
        moveToLeft(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static int[] moveToRight(int[] arr){
        int n = arr.length;
        int i = 0;
        int j = 0;
        while (j<n){
            if (arr[j] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;

            }
            j++;
        }
        return arr;
    }
    public static int[] moveToLeft(int[] arr ){
        int n = arr.length;
        int i = n-1;
        int j = n-1;
        while (j>=0){
            if (arr[j] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i--;
            }
            j--;
        }
        return arr;
    }
}
