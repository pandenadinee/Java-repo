package com.collectionProgram;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>(Comparator.reverseOrder());
        map.put(1,"ram");
        map.put(5,"sita");
        map.put(2,"puja");
        map.put(4,"jaya");
        System.out.println(map);
    }
}
