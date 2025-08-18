package com.practice;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,10,4,8,9};
        int target = 10;
        int index = linear(arr , target);
        System.out.println(index);
    }
    public static int linear(int[] arr , int target){
        int n = arr.length;
        for (int i = 0; i<=n; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
