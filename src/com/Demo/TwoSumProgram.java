package com.Demo;

import java.io.StringWriter;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSumProgram {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        twoSum(arr , target );


    }
    public static int[] twoSum(int[] arr , int target){
        int n = arr.length;
        int[] resultArray = new int[2];

        HashMap<Integer,Integer> map = new HashMap<>();

       for (int i = 0 ; i<n; i++){
           int moreNeeded = target - arr[i];
           if (map.containsKey(moreNeeded)){
               resultArray[0] = i;
               resultArray[1] = map.get(moreNeeded);


               System.out.println(Arrays.toString(resultArray));
           }
           else {
               map.put(arr[i] , i);
           }
       }
       return resultArray;

    }
}
