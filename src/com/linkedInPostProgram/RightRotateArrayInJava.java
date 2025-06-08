package com.linkedInPostProgram;

import java.util.Arrays;

public class RightRotateArrayInJava {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
//                   8,1,2,3,4,5,6,7
//                   7,8,1,2,3,4,5,6
//                   6,7,8,1,2,3,4,5
        int n = arr.length;
        int rotation = 2;
        int count = rotation % n;
        for (int i = 0; i<=count; i++){
            int temp = arr[n-1];
            for (int j = n-1; j>0; j--){
                arr[j] = arr[j-1];
            }
            arr[0] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }


}

