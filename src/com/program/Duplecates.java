package com.program;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Duplecates {
    public static void main(String[] args) {
        int[] arr = {1,4,5,2,1,2,4,5,2,6,7,9};
        duplicateEle(arr);

    }
    public static void duplicateEle(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        HashSet<Integer> set = new HashSet<>();

        for(int i=1; i<n; i++){
            if(arr[i]==arr[i-1]){
                set.add(arr[i]);
            }
        }
        for(Integer i :set){
            System.out.println(i);
        }

        }

    }

