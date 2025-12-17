package com.Demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringFrequencyDemo1 {
    public static void main(String[] args) {
        String s  = "nandini";
        frequency(s);

    }
    public static void frequency(String s){

        char[] ch = s.toCharArray();
        int n = ch.length;

        HashMap<Character ,Integer> map = new HashMap<>();
        for (int i = 0; i<n; i++){
            char letter= ch[i];
            if (map.containsKey(letter)){
                int val = map.get(letter);
                map.put(letter, val+1);

            }
            else map.put(letter , 1);
        }
        System.out.println(map);
       Set<Map.Entry<Character , Integer>> entrySet =  map.entrySet();
       for ( Map.Entry<Character,Integer> entry:entrySet){
           System.out.println(entry.getKey()+ " = " +entry.getValue());

       }
    }
}
