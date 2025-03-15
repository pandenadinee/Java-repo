package com.javaPractice;

import java.util.*;

public class Demo3 {
    public static void main(String[] args) {
        String s = "this is uday uday is man";
//        is2man1this1uday2
        // isismanthisudayuday
        Frequency(s);

    }
    public static void Frequency(String s){
        String[] arr = s.split(" ");
        int n = arr.length;

        TreeMap<String , Integer> map = new TreeMap<>(Comparator.reverseOrder());
        for(int i = 0; i<n; i++){
           String key  = arr[i];
           if(map.containsKey(key)){
              int val =  map.get(key);
              map.put(key, val+1);
           }
           else {
               map.put(key,1);
           }
        }
        System.out.println(map);

        String result = " ";

        Set<Map.Entry<String,Integer>> entry = map.entrySet();
        Iterator<Map.Entry<String ,Integer>> itr = entry.iterator();
        while (itr.hasNext()){
            Map.Entry<String, Integer> next = itr.next();
            for(int i = 1; i<=next.getValue(); i++){
                result = result +next.getKey();
            }
//            result = result + next.getKey()+next.getValue();
        }
        System.out.println(result);
    }
}
