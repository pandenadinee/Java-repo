package com.javaPractice;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        int[] arr={1,2,3,4,5,6};
        int[] arr1= {100,20,3,40,500,499};
//        TempArray(arr);
//        NewArray(arr);
//        Shift(arr);
//        LeftShifting(arr);
//        Rotation1(arr);
//        Rotation2(arr);
//        Maximum(arr1);
//        Minimum(arr1);
        int num = 2021;
        int temp = num;
        int sum = 0;
        while (num!=0){
            int reminder = num % 10;
            sum = (sum * 10) + reminder;
            num = num/10;
        }
        System.out.println(sum);
        if(sum==temp){
            System.out.println("num is pallindome");
        }
        else {
            System.out.println("num is not pallindrome");
        }

    }
    public static void TempArray(int[] arr ){
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while (i<j){
            int temp = arr[i];
            arr[i]   = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void NewArray(int[] arr ){
        int n = arr.length;
        int[] arr1 = new int[n];
        for(int i=0, j =n-1; i<n&&j>=0; i++,j--){
            arr1[i] = arr[j];
        }
        System.out.println(Arrays.toString(arr1));
    }
    public static void Shift(int[] arr){
        int n = arr.length;
        int insert = 2;
        for(int i = n-1; i>insert; i--){
            arr[i] = arr[i-1];

        }
        arr[insert] = 30;
        System.out.println(Arrays.toString(arr));
    }
    public static void LeftShifting(int[] arr){
        int insert = 4;
        for(int i = 0; i<insert; i++){
            arr[i] = arr[i+1];

        }
        arr[insert] = 40;
        System.out.println(Arrays.toString(arr));
    }
    public static void Rotation1(int[] arr){
        int n = arr.length;
        int rotate = 1;
        int k = rotate %n;
        for(int i = 1; i<=k; i++){
            int temp = arr[n-1];
            for(int j = n-1; j>=0; j--){
                arr[i] = arr[i-1];

            }
            arr[0] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void Rotation2(int[] arr){
        int n = arr.length;
        int rotate = 3;
        int k = rotate %n;
        for(int i = 1; i<=k; i++){
            int temp =arr[0];
            for (int f = 0; f<n-1; f++){
                arr[f] = arr[f+1];
            }
            arr[n-1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public  static  void Maximum(int[] arr1){
        int n = arr1.length;
        int max = arr1[0];
        int max1 = arr1[0];
        for(int i = 0; i<n; i++){
            if(arr1[i]>max){
                max1 = max;
                max = arr1[i];
            } else if (arr1[i]>max1 & max1<max) {
                max1 = arr1[i];

            }
        }
        System.out.println("first maximum="+max+" "+"Second Maximum="+max1);
    }
    public static void Minimum(int[] arr1){
        int n = arr1.length;
        int min = arr1[0];
        int min1 = arr1[0];
        for(int i = 0; i<n-1; i++){
            if (arr1[i]<min){
                min1 = min;
                min = arr1[i];
            } else if (arr1[i]<min1 & min1>min  ) {
                min1 = arr1[i];
            }
        }
        System.out.println("First Minimun="+min+","+"Second Minumum="+min1);
    }
}
