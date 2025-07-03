package com.linkedInPostProgram;

import java.util.Arrays;

public class RightRotateArray2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6,7,8};
//                   8,1,2,3,4,5,6,7
//                   7,8,1,2,3,4,5,6
        int n = arr.length;
        int rotation = 2;
        int count = rotation % n;
        reverse(arr , 0 , n-1);
        reverse(arr, 0,count-1);
        reverse(arr, count, n-1);
//        reverse(arr , 0 , n-1);

        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int[] arr , int left ,int right){
        while (left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
