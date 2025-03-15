package com.javaPractice;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Arrays;

public class BinarySearchDemo {
    public static void main(String[] args) {
        int[] arr = {2,9,3,1,4,6,5,9,7};
        int target = 9;
        sortArray(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(findingTargetIndex(target, arr));


    }
    public static void sortArray(int[] arr) {
        int n = arr.length;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }
    public static int findingTargetIndex( int target,int[] arr){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while (low<=high){
            int mid = (low + high)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid]<target){
                low = mid+1;
            }
            else if (arr[mid]>target){
                high = mid - 1;
            }
        }
        return -1;

    }

}
