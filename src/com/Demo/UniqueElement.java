package com.Demo;

import kotlin.jvm.internal.markers.KMutableMap;

import java.util.*;

public class UniqueElement {
    public static void main(String[] args) {
        int[] arr = {1, 6, 3, 5, 6, 1, 7, 8, 5, 3, 6, 1};
        Arrays.sort(arr);
        unique(arr);

    }
    public static void unique(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            if (map.containsKey(key)) {
                int val = map.get(key);
                map.put(key, val + 1);
            } else {
                map.put(key, 1);
            }
        }
        System.out.println(map);

        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Integer,Integer> entry : entrySet){
           if (entry.getValue() == 1){
               System.out.println(entry.getKey());
           }
        }
    }
}
