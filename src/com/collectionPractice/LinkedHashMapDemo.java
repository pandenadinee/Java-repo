package com.collectionPractice;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> l = new LinkedHashMap<>();
        l.put("Tiger",100);
        l.put("Sun",234);
        l.put("Chitah",290);
        l.put("Dates",340);
        l.put("Zebra",110);
        System.out.println(l);

    }
}
