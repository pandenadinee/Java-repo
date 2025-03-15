package com.javaPractice;

public class FirstSmallest {
    public static void main(String[] args) {
        int[] arr = {5,2,7,1,6};
        int n = arr.length;
        int smallest = arr[0];
        for(int i = 0; i<n; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println(smallest);
        }
    }

