package com.Demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringFrequencyDemo2 {
    public static void main(String[] args) {
        String s = "this is a test this test is simple and this is useful";
         frequency(s);

    }
    public static void frequency(String s){
        String[] arr = s.split(" ");
        int n = arr.length;
        HashMap<String , Integer>  map = new HashMap<>();

        for (int i = 0; i<n;i++){
            String key = arr[i];
            if (map.containsKey(key)){
               int val =  map.get(key);
               map.put(key , val+1);
            }
            else map.put(key , 1);
        }
        System.out.println(map);
        Set< Map.Entry<String , Integer>> entrySet = map.entrySet();
        for (Map.Entry<String , Integer> entry :entrySet){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
