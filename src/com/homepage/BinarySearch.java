package com.homepage;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1,2,4,9,3,8,6,7,5};
        int target = 8;
        Arrays.sort(arr);
        System.out.println(search(arr, target));

    }
    public static int search(int[] arr  , int target){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while (low <= high){
            int mid = (low + high) / 2;
            if (arr[mid] == target){
                return mid;
            }
            else if (arr[mid] < target){
                low= mid+1;
            }
            else if (arr[mid] > target){
                high = mid-1;
            }
        }
        return -1;

    }
}
