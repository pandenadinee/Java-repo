package com.practice;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,10,5,8,9};
        int target = 10;
        Arrays.sort(arr);
       int result = binarySearch(arr,target);
        System.out.println(result);

    }
    public static int binarySearch(int[] arr , int target){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while (left<=right){
            int mid = (left + right) /2;
            if (arr[mid] == target){
                return mid;
            }
            else if (arr[mid] < target){
                left = mid +1;
            }
            else if (arr[mid] > target){
                right = mid -1;
            }
        }
        return -1;
    }
}
