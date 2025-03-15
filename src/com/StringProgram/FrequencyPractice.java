package com.StringProgram;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class FrequencyPractice {
    public static void main(String[] args) {
        String s = "abbbbfdfdfdaaz";
        int n = s.length();
//        HashMap<Character,Integer> map = new HashMap<>();
        TreeMap<Character,Integer>   map = new TreeMap<>(Comparator.reverseOrder());

        for(int i =0; i<n; i++){
            Character key =s.charAt(i);
            if(map.containsKey(key)){
               int val =  map.get(key);
               map.put(key,val+1);
            }
            else {
                map.put(key, 1);
            }
        }
        System.out.println(map);
    }

}
