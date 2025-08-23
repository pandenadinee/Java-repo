package com.collectionProgram;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
//        IdentityHashMap map = new IdentityHashMap();
//        20=uday, 10=krishna, 30=puja, 50=rahul, 40=krishna}

    HashMap map = new HashMap();
//        50=rahul, 20=uday, 40=krishna, 10=krishna, 30=puja}
        map.put(10,"nandini");
        map.put(20,"uday");
        map.put(30,"puja");

        map.put(10,"krishna");
        map.put(40,"krishna");

        map.put(50,"rahul");
        System.out.println(map);
    }
}
