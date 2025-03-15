package com.javaPractice;

import java.util.Arrays;

public class CodingPractice {
    public static void main(String[] args) {

        int[] arr = {6,8,2,9,10,1};
//        int[] arr = {1,2,3,4,5,6};
//        insertRight(arr);
//        insertLeft(arr);
//        RRotation(arr);
//        LRotation(arr);
//        Reverse(arr);
//        LargeNo(arr);
        Smaller(arr);
//        arrayrRevers(arr);

    }
    public static void insertRight(int[] arr){
        int n = arr.length;
        int insert = arr[1];
        for(int i = n-1; i>insert; i--){
            arr[i] = arr[i-1];

        }
        arr[insert] = 2000;
        System.out.println(Arrays.toString(arr));
    }
    public static void insertLeft(int[] arr){
        int n = arr.length;
        int insert = arr[5];
        for(int i =0; i<insert; i++){
            arr[i] = arr[i+1];
        }
        arr[insert] = 500;
        System.out.println(Arrays.toString(arr));
    }
    public static void RRotation(int[] arr){
        int n = arr.length;
        int rotaion=3;
        int k = rotaion%n;
        for(int i = 1; i<=k; i++){
            int temp = arr[n-1];
            for(int j = n-1; j>0; j--){
                arr[j] = arr[j-1];
            }
            arr[0] = temp;

        }
        System.out.println(Arrays.toString(arr));
    }
    public static void LRotation(int[] arr){
        int n = arr.length;
        int rotaion=2;
        int k = rotaion%n;
        for(int i = 1; i<=k; i++){
            int temp = arr[0];
            for(int j = 0; j<n-1; j++){
                arr[j] = arr[j+1];
            }
            arr[n-1] = temp;

        }
        System.out.println(Arrays.toString(arr));
    }
    public static void Reverse(int[] arr){
        int n = arr.length;
        int[] a1=new int[n];
        for(int i =n-1, j = 0; i>=0 && j<=n; i--,j++){
            a1[j] = arr[i];

        }
        System.out.println(Arrays.toString(a1));
    }
    public static void LargeNo(int[] arr){
        int n =arr.length;
        int large = arr[0];
        int secondLarge = arr[0];
        for(int i =0; i<n; i++){

            if(arr[i]>large){
                secondLarge = large;
                large = arr[i];
            } else if (arr[i]>secondLarge & secondLarge<large) {
                secondLarge = arr[i];
            }
        }
        System.out.println(large);
        System.out.println(secondLarge);
    }
    public static void Smaller(int[] arr){
        int n = arr.length;
        int small = arr[0];
        int SecondSmall = arr[0];
        for (int i =0; i<n; i++){
            if (arr[i]<small){
                SecondSmall = small;
                small = arr[i];
            } else if (arr[i]<SecondSmall & SecondSmall>small) {
                SecondSmall = arr[i];

            }
        }
        System.out.println(small+" "+SecondSmall);
    }
    public static void arrayrRevers(int[] arr){
        int n = arr.length;
        for (int i = 0 ,j=n-1; i<j; i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }

    }


