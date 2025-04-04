package com.ArrayProgram;

import javax.sound.midi.MidiFileFormat;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1,4,3,10,6,8};
        int target = 18;
        index(arr,target);


    }
    public static int[] index(int[] arr , int target){
        int n = arr.length;
        int[] arr1 = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            int moreNeeded = target-arr[i];
            if (map.containsKey(moreNeeded)){
                arr1[0]  = i;
                arr1[1] = map.get(moreNeeded);
                System.out.println(Arrays.toString(arr1));
            }
            else{
                map.put(arr[i] , i);

            }
        }
        return arr1;
    }
}
