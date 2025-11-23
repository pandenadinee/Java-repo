package com.practice;

import java.util.Arrays;

public class ArrayRightRotation {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
//                     50,10,20,30,40
//                     40,50,10,20,30
        int k = 2;
        int n = arr.length;
        int count = k % n;
        reverse(arr, 0, n-1);
//              {50,40,30,20,10}
        reverse(arr, 0 , count-1);
//              {40,50,30,20,10}
        reverse(arr,count,n-1 );
//              {40,50,10,20,30}

        System.out.println(Arrays.toString(arr));

    }
    public static void reverse(int[] arr ,int i ,int j){

        while (i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]   = temp;
            i++;
            j--;
        }
    }
}
