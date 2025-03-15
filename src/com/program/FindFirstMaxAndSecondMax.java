package com.program;

public class FindFirstMaxAndSecondMax {
    public static void main(String[] args) {
        int[] arr = {3,6,2,7,9,4,5,10,8};
        firstAndSecomdMax(arr);
    }

    public static void firstAndSecomdMax(int[] arr){
        int n = arr.length;
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            if(arr[i]>firstMax){
                secondMax = firstMax;
                firstMax  = arr[i];
            }
            else if (arr[i] > secondMax && secondMax < firstMax){
                secondMax = arr[i];
            }
        }
        System.out.println("First Max : " +firstMax);
        System.out.println("Second Max : " +secondMax);
    }
}
