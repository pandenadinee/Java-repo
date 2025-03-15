package com.javaPractice;

import java.util.*;

public class Revision2 {
    public static void main(String[] args) {
        String s = "adabce";

        findFrequency(s);

    }
    public static void findFrequency(String s){
        int n = s.length();
        LinkedHashMap<Character , Integer> map = new LinkedHashMap<>();
        for(int i = 0 ; i<n; i++){
             char key = s.charAt(i);
             if(map.containsKey(key)){
                  int val = map.get(key);
                  map.put(key, val+1);

             }
             else {
                 map.put(key , 1);
             }
        }
        System.out.println(map);

        String result = "";

        Set<Map.Entry<Character,Integer>> set = map.entrySet();

        Iterator<Map.Entry<Character, Integer>> iterator = set.iterator();

        while (iterator.hasNext()){
            Map.Entry<Character, Integer> next = iterator.next();

//            System.out.println(next.getKey() +" "+next.getValue());

            result = result+next.getKey()+next.getValue();

        }
        System.out.println(result);
//


//a2b1c1d1e1
    }
}
