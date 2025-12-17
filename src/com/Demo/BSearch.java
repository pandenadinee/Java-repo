package com.Demo;

import java.util.Arrays;

public class BSearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 3, 1, 8, 5, 9,7};
        int target = 3;
        Arrays.sort(arr);
//        {1,2,3,4,5,6,7,8,9}

        System.out.println(checkTarget(arr, target));

    }
    public static int checkTarget(int[] arr , int target){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = (low + high) / 2;
            if (arr[mid] == target){
                return mid;
            }
            else if (arr[mid] < target){
                low = mid +1;
            }
            else if (arr[mid] > target){
                high = mid - 1;
            }
        }
        return -1;
    }
}
