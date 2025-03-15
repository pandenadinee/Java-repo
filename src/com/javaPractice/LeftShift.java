package com.javaPractice;

import java.util.Arrays;

public class LeftShift {
    public static void main(String[] args) {
        int[] a = {24,68,10,22,54};
        int n = a.length;
        int shift = 4;
        for(int i = 0; i<shift; i++){
            a[i] = a[i+1];

        }
        a[shift] = 100;
        System.out.println(Arrays.toString(a));
    }
}
