package com.homepage;

import javax.swing.border.EmptyBorder;
import java.util.*;

public class UniqueElement {
    public static void main(String[] args) {
        int [] arr = {1,5,1,2,5,3,4,2,8,9};
        Arrays.sort(arr);
        unique(arr);
    }
    public static void unique(int[] arr){
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            int key = arr[i];
            if (map.containsKey(key)){
                int value = map.get(key);
                map.put(key , value+1);
            }
            else map.put(key , 1);
        }
        System.out.println(map);
       Set<Map.Entry<Integer,Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<Integer , Integer>> iterator = entrySet.iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer , Integer> entry = iterator.next();
            if (entry.getValue() == 1){
                System.out.println(entry.getKey());
            }
        }

    }
}
