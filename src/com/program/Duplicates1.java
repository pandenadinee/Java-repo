package com.program;

public class Duplicates1 {
    public static void main(String[] args) {
        int[] arr = {1,2,5,1,6,2,5,6,7,8,9};
        dupicate(arr);
    }
    public static void dupicate(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);

                }
            }
        }
    }
}
