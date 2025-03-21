package com.homepage;

import java.util.Arrays;

public class NormalSearch {
    public static void main(String[] args) {
        int[] arr = { 4,2,9,3,7,6,1,5};
        int target =6;
        Arrays.sort(arr);
        System.out.println(search(arr, target));

    }
    public static int search(int[] arr , int target){
        for(int i = 0; i<arr.length; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
