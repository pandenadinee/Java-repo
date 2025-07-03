package com.linkedInPostProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringCharacterFrequency {
    public static void main(String[] args) {
        String s = "nandini";
        frequency(s);

    }
    public static void frequency(String s){
        int n = s.length();
        HashMap<Character , Integer> map = new HashMap<>();
        for (int i = 0; i<n; i++){
            char ch = s.charAt(i);
            if (map.containsKey(ch)){
               int val = map.get(ch);
               map.put(ch , val +1 );
            }
            else{
                map.put(ch , 1);
            }
        }
        System.out.println(map);
       Set<Map.Entry<Character , Integer>> entrySet =  map.entrySet();
       for (Map.Entry<Character ,Integer> entry:entrySet){
           System.out.println(entry);
       }
    }
}
