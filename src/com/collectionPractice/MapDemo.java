package com.collectionPractice;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap();
        hm.put(1,"rahul");
        hm.put(2,"puja");
        hm.put(3,"sanjay");
        hm.put(4,"chandan");
        Object ob = hm.put(4, "aarushi");
        System.out.println(ob);
        System.out.println(hm);
        Set s = hm.keySet();
        System.out.println(s);
        Collection c = hm.values();
        System.out.println(c);
        Set<Map.Entry<Integer,String>> s1  = hm.entrySet();
        Iterator<Map.Entry<Integer,String>> iterator = s1.iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, String> e = iterator.next();
            System.out.println(e.getKey() + " " + e.getValue());



        }


//        System.out.println(hm.get(3));
//        hm.replace(3,"sanjay","raha");
//        System.out.println(hm);
//        System.out.println(hm.remove(1));
//        hm.put(2,"nandini");
//        System.out.println(hm);

    }
}
