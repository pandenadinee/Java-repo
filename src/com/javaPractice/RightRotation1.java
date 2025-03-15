package com.javaPractice;

import java.util.Arrays;

public class RightRotation1 {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50,60};
        int n = array.length;
        int k = 2;
        int rotation = k % n;
        for(int i =1; i<=rotation; i++){
            int temp = array[n-1];
            for(int j = n-1; j>0; j--){
                array[j] = array[j-1];
            }
            array[0] = temp;
        }
        System.out.println(Arrays.toString(array));

    }
}
