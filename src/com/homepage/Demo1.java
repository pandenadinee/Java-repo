package com.homepage;

import java.util.Arrays;
import java.util.HashSet;

public class Demo1 {
    public static void main(String[] args) {
        int[] arr = { 1,2,0,0,3,0,6,0,5};
        moveZeroToRight(arr);

    }
    public static void moveZeroToRight(int[] arr){
        int n = arr.length;
       int i = 0;
       int j = 0;
       while (j<n){
          if (arr[j] != 0 ){
              int temp = arr[i];
              arr[i] = arr[j];
              arr[j]  = temp;
              i++;
          }
          j++;
    }
        System.out.println(Arrays.toString(arr));
    }

}
