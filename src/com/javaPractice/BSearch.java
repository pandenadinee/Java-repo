package com.javaPractice;

import java.util.Arrays;

public class BSearch {
    public static void main(String[] args) {
        int[] arr = {4,2,9,5,8,6,3,1};
        int target = 6;
        int index = binarSearch(arr,target);
        System.out.println(index);
    }
    public static int  binarSearch(int[] arr , int target){
        Arrays.sort(arr);
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while (low<=high){
            int mid =( low + high ) / 2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target) {
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return -1;
    }
}
