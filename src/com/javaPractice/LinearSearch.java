package com.javaPractice;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,4,3,1,4,6,5,9,7};
        int target = 7;
        System.out.println(LinearDemo(arr, target));

    }
    public static int LinearDemo(int[] arr ,int target  ){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
