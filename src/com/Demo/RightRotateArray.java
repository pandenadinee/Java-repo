package com.Demo;

import java.util.Arrays;

public class RightRotateArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        int rotate = 3;
        int n = arr.length;
        int k = rotate % n;

        rotate(arr,0 ,n-1);
        rotate(arr,0 ,k-1);
        rotate(arr, k ,n-1   );
        System.out.println(Arrays.toString(arr));



    }
    public static void rotate(int[] arr , int left , int right){
        while (left <= right){

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

    }
}
