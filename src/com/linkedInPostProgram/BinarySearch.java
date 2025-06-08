package com.linkedInPostProgram;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 3, 1, 8, 5, 9,7};
        int target = 6;
        Arrays.sort(arr);
//        [1,2,3,4,5,6,7,8,9]
       int index =  binarySearch(arr , target);
        System.out.println(index);



    }
    public static int binarySearch(int[] arr , int target){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while (low <= high){

            int mid = (low + high) /2;

            if (arr[mid] == target){
                return mid;
            }
            else if (arr[mid] < target){
                low = mid +1;
            }
            else if (arr[mid] > target){
                high = mid -1;
            }
        }
        return -1;
    }
}
