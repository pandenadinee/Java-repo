package com.program;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 17;
        twoSumTarget(arr, target);
    }

    public static int[] twoSumTarget(int[] arr, int target) {
        int n = arr.length;
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int moreNeeded = target - arr[i];
            if (map.containsKey(moreNeeded)) {
                result[0] = i;
                result[1] = map.get(moreNeeded);

                System.out.println(Arrays.toString(result));
            } else {
                map.put(arr[i], i);
            }
        }
        return result;
    }
}
