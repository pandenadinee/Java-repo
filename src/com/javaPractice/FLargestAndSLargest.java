package com.javaPractice;

public class FLargestAndSLargest {
    public static void main(String[] args) {
        int[] arr = {2,6,8,23,9,65,11};
        int n = arr.length;
        int FLargest = arr[0];
        int SLargest = arr[0];
        for(int i = 0; i<n; i++){
            if(arr[i] > FLargest){
                SLargest = FLargest;
                FLargest = arr[i];

            } else if (arr[i] >SLargest && SLargest!=FLargest) {
                SLargest = arr[i];

            }
        }
        System.out.println(FLargest);
        System.out.println(SLargest);

    }
}
