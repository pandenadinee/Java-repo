package com.Demo;

public class Minimum {
    public static void main(String[] args) {
        int [] arr = {4,2,5,8,4,1,9};
        min(arr);
    }
    public static void min(int [] arr){
        int n = arr.length;
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i =0; i<n; i++){
            if (arr[i] < firstMin){
                secondMin = firstMin;
                firstMin = arr[i];
            }
            else if (arr[i] < secondMin & secondMin > firstMin){
                secondMin = arr[i];
            }
        }
        System.out.println(firstMin);
        System.out.println(secondMin);
    }
}
