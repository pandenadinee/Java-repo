package com.javaPractice;

import java.util.Arrays;

public class RightShift {
    public static void main(String[] args) {
        int[] a = {1,2,9,4,5,6,7};
        int n = a.length;
        int insert = a[3];
        for(int i=n-1; i>insert; i--){
            a[i] =a[i-1];
        }
        a[insert] =10;
        System.out.println(Arrays.toString(a));
    }
}
