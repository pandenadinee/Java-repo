package com.linkedInPostProgram;

public class FindFirstAndSecondMaximum {
    public static void main(String[] args) {
        int[] arr = {4,7,3,9,1,5,6};
        miniumum(arr);

    }
    public static void miniumum(int[] arr ){
        int n = arr.length;
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++){
            if (arr[i] > firstMax){
                secondMax = firstMax;
                firstMax = arr[i];
            }
            else if (arr[i] > secondMax && secondMax < firstMax){
                secondMax = arr[i];
            }
        }
        System.out.println(firstMax );
        System.out.println(secondMax);
    }
}
