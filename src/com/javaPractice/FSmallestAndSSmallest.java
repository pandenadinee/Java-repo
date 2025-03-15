package com.javaPractice;

public class FSmallestAndSSmallest {
    public static void main(String[] args) {
        int[] arr = {4,5,3,9,2,7,1};
        int n = arr.length;
        int FSmallest = arr[0];
        int SSmallest = arr[0];
        for(int i =0; i<n; i++){

            if(arr[i] < FSmallest){
                SSmallest = FSmallest;
                FSmallest = arr[i];

            } else if (SSmallest < arr[i] && SSmallest != FSmallest) {
                SSmallest = arr[i];

            }
        }
        System.out.println(FSmallest);
        System.out.println(SSmallest);
    }
}
