package com.javaPractice;

import java.lang.management.MemoryNotificationInfo;

public class FLSL {
    public static void main(String[] args) {
        int[] arr = {4,2,9,5,8,6,3,1};
//        largest(arr);
        Minimum(arr);

    }
    public static void largest(int[] arr){
        int n = arr.length;
        int fLargest = Integer.MIN_VALUE;
        int sLargest = Integer.MIN_VALUE;

        for(int i= 0; i<n; i++){
            if(arr[i] > fLargest ){
                sLargest = fLargest;
                fLargest = arr[i];
            }

              else if (arr[i] > sLargest && sLargest<fLargest){
                  sLargest = arr[i];
            }

        }
        System.out.println(fLargest);
        System.out.println(sLargest);
    }
    public static void Minimum(int[] arr){
        int n=arr.length;
        int fMin = Integer.MAX_VALUE;
        int sMin = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++){
            if(arr[i] < fMin){
                sMin = fMin;
                fMin = arr[i];
            }
            else if (arr[i] < sMin && sMin>fMin){
                sMin = arr[i];
            }
        }
        System.out.println(fMin);
        System.out.println(sMin);
    }
}
