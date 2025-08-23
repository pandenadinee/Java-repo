package com.collectionProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo2 {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"apple");
        map.put(2,"banana");
        map.put(3,"watermelon");
         map.put(4,"kiwi");
        System.out.println(map);
        Set<Map.Entry<Integer,String>> entrySet = map.entrySet();
        for (Map.Entry<Integer,String > entry   :entrySet){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
