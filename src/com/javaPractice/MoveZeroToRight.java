package com.javaPractice;

import java.util.Arrays;

public class MoveZeroToRight {
    public static void main(String[] args) {
        int[] arr = {3,0,5,1,0,6,9,0,4};
//        MoveToRight(arr);
        MoveToLeft(arr);

    }
    public static void MoveToRight(int[] arr){
        int n = arr.length;
        int i = 0;
        int j = 0;
        while (j<n){
            if(arr[j] !=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void MoveToLeft(int[] arr){
        int n = arr.length;
        int i = n-1;
        int j = n-1;
        while (j>=0){
            if(arr[j] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i--;
            }
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
