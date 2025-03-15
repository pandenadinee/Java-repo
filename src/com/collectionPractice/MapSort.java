package com.collectionPractice;

import java.util.TreeMap;

public class MapSort {
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>(new IntComp());
        map.put(10, "uday");
        map.put(5, "rah");
        map.put(1,"mohit");
        map.put(2,"suresh");
        System.out.println(map);

    }
}
