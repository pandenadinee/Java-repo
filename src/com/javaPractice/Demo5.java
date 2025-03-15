package com.javaPractice;

import java.util.Arrays;

public class Demo5 {
    public static void main(String[] args) {
        int[] arr = {9, 3, 6, 4, 7, 1, 5, 2};
        int target = 9;
        Arrays.sort(arr);
       int ans =  BinarySearch(arr, target);
        System.out.println(ans);

        System.out.println(Arrays.toString(arr));

    }
    public static int BinarySearch(int[] arr, int target) {
        int n =arr.length;
        int low =0;
        int high = n-1;
        while (low<=high){
            int mid = (low + high) /2;

            if(arr[mid] == target){
                return mid;
            }
            else if (arr[mid] < target){
                low = mid +1;

            }
            else{
                high = mid -1;
            }
        }
        return -1;
    }
}