package com.collectionPractice;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(20);
        hs.add(30);
        hs.add("nandini");
        hs.add('x');
        System.out.println(hs);
        hs.add(20);
        System.out.println(hs);
        System.out.println(hs.size());
        System.out.println(hs.isEmpty());

        hs.remove(20);
        System.out.println(hs);
        hs.add(null);
        System.out.println(hs);

    }
}
