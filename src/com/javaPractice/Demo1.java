package com.javaPractice;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {

        int[] arr = {101, 20, 30, 40, 500, 65, 75, 85, 95};
//       Swaping1(arr);
//       Swaping2(arr);
//       RightRotate(arr);
//       LeftRotation(arr);
//       InsertIndex(arr);
//        InsertIndexLeft(arr);
//        Maximum(arr);
        Minimum(arr);


    }
    public static void Swaping1(int[] arr ){
        int n = arr.length;
        int i =0;
        int j = n-1;
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j] ;
            arr[j]   = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void Swaping2(int [] arr){
        int n = arr.length;
        int [] arr1 = new int[n];
        for(int i = 0, j = n-1; i<n-1 & j>=0; i++,j--){
            arr1[i] = arr[j];
        }
        System.out.println(Arrays.toString(arr1));
    }
    public static void RightRotate(int[] arr){
        int n = arr.length;
        int rotation = 3;
        int k = rotation % n;
        for(int i = 0; i<k; i++){
            int temp = arr[n-1];
            for(int j = n-1; j>=0; j--){
                arr[j] = arr[j-1];

            }
             arr[0] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void LeftRotation(int[] arr){
        int n = arr.length;
        int rotation = 4;
        int k = rotation % n;
        for(int i = 0; i<=k; i++){
            int temp = arr[0];
            for(int j = 0; j<n-1; j++){
                arr[j] = arr[j+1];
            }
            arr[n-1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void InsertIndex(int[] arr)   {
        int n = arr.length;
        int insert = 3;
        for(int i  = n-1; i>insert; i--){
            arr[i] = arr[i-1];
        }
        arr[insert] = 50000;
        System.out.println(Arrays.toString(arr));
    }
    public static void InsertIndexLeft(int [] arr){
        int n = arr.length;
        int insertIndex = 3;
        for(int i = 0; i<insertIndex; i++){
            arr[i] = arr[i+1];
        }
        arr[insertIndex] = 10000;
        System.out.println(Arrays.toString(arr));
    }
    public static void Maximum(int[] arr ){
        int n = arr.length;
        int max1 = arr[0];
        int secondMax = arr[0];
        for(int i = 0; i<n; i++){
            if(arr[i]>max1){
                secondMax = max1;
                max1 = arr[i];
            }
            else if(arr[i] >secondMax & secondMax!=max1){
                secondMax = arr[i];
            }
        }
        System.out.println(max1);
        System.out.println(secondMax);
    }
    public static void Minimum(int[] arr ){
        int n = arr.length;
        int min1 = arr[0];
        int secondMin = arr[0];
        for(int  i = 0; i<n; i++){
            if(arr[i] <min1 ){
                secondMin = min1;
                min1 = arr[i];

            } else if (arr[i] <secondMin & secondMin!=min1) {
                secondMin = arr[i];
            }
        }
        System.out.println(min1);
        System.out.println(secondMin);
    }
}
