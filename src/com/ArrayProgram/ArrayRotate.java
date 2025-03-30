package com.ArrayProgram;

import java.util.Arrays;

public class ArrayRotate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
//                   7,6,5,4,3,2,1  2,1,3,4,5,6,7
//                   6,7,5,4,3,2,1  2,1,7,6,5,4,3
//                   6,7,1,2,3,4,5  3,4,5,6,7,1,2
        int n = arr.length;
        int rotation = 2;
        int k = rotation % n;

//        reverse(arr , 0, n-1);
        reverse(arr, 0,k-1);
        reverse(arr,k,n-1);
        reverse(arr , 0, n-1);
        System.out.println(Arrays.toString(arr));

    }
    public static void reverse(int[] arr  , int i  , int j){


        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
