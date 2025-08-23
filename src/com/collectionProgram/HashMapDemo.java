package com.collectionProgram;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put(10,"nandini");
        map.put(20,"uday");
        map.put(30,"puja");
        map.put(10,"krishna");
        map.put(40,"krishna");
        map.put(null,null);
        map.put(50,"rahul");
        map.put(null,"adi");
        map.put(60,null);
        System.out.println(map);

        Boolean b = map.containsKey(10);
        System.out.println(b);

        Boolean  result = map.containsValue("neha");
        System.out.println(result);


    }
}
