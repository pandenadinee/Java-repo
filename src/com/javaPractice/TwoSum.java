package com.javaPractice;

import com.StringProgram.Pallindrome;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
       int[] arr = {2,7,11,15};
       int target = 26;

//        twoSum(arr,target);

        twoSumTarget(arr,target);

    }
    public static int[] twoSum(int[] arr , int target){
        int n = arr.length;
        int[] result = new int[2];

        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i] + arr[j] == target){
                    result[0]= i;
                    result[1] = j;
                    System.out.println(Arrays.toString(result));
                    return result;
                }
            }
        }
        return result;
    }

    public static int[] twoSumTarget(int[] arr , int target){
        int n = arr.length;
        HashMap<Integer,Integer>  map = new HashMap<>();
        int[] result =new int[2];

        for(int i = 0; i<n; i++){
            int moreNeeded  = target - arr[i];
            if(map.containsKey(moreNeeded)){
              result[0] = i;
              result[1] = map.get(moreNeeded);
                System.out.println(Arrays.toString(result));
                return result;
            }
            else {
                map.put(arr[i], i);
            }
        }
        return result;
    }
}
