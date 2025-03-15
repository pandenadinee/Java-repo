package com.javaPractice;

public class FirstLargestl {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,5,8,0};
        int n = arr.length;
        int largest = arr[0];
        for(int i = 0; i<n; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
