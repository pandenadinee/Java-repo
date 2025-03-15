package com.collectionPractice;

import java.util.*;

public class TreezMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,Character> m = new TreeMap();
        m.put(20,'a');
        m.put(40,'b');
        m.put(50,'c');
        m.put(100,'x');
        System.out.println(m);

        System.out.println(m.get(20));
//        Set s = m.keySet();
//        System.out.println(s);
//        Collection c = m.values();
//        System.out.println(c);
        Set<Map.Entry<Integer,Character>> s1 = m.entrySet();
        Iterator<Map.Entry<Integer, Character>> iterator = s1.iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, Character> itr = iterator.next();

            System.out.println(itr.getKey());
            System.out.println(itr.getValue());
        }
        System.out.println(m);
    }
}