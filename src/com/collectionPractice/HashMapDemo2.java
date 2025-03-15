package com.collectionPractice;

import java.util.*;

public class HashMapDemo2 {
    public static void main(String[] args) {
        HashMap<Integer,String> h = new HashMap<>();
        h.put(45,"puja");
        h.put(989888,"mohi");
        h.put(346,"abc");
        h.put(76,"sima");
        System.out.println(h);
        Collection c = h.values();
//        System.out.println(c);
        Set s = h.keySet();
//        System.out.println(s);
        Set<Map.Entry<Integer,String>> s1 = h.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = s1.iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, String> itr = iterator.next();
            System.out.println(itr.getKey());
            System.out.println(itr.getValue());
            if(itr.getKey() == 3)
                itr.setValue("chetna");


        }
        System.out.println(h);

    }
}
