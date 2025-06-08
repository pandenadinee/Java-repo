package com.linkedInPostProgram;

public class FindFirstAndSecondMinimum {
    public static void main(String[] args) {
        int[] arr = {4,7,3,9,1,5,6};
        miniumum(arr);

    }
    public static void miniumum(int[] arr ){
        int n = arr.length;
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++){
            if (arr[i] < firstMin){
                secondMin = firstMin;
                firstMin = arr[i];
            }
            else if (arr[i] < secondMin && secondMin > firstMin){
                secondMin = arr[i];
            }
        }
        System.out.println(firstMin );
        System.out.println(secondMin);
    }
}
