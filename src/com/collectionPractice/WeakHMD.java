package com.collectionPractice;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHMD {
    public static void main(String[] args) {
//        WeakHashMap w = new WeakHashMap<>();
        HashMap w = new HashMap<>();
        w.put(3,'g');
        w.put(5,'k');
        w.put(7,'k');
        w.put(2,'s');

        System.out.println(w);
        w=null;
        System.out.println(w);

    }
}
