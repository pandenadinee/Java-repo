package com.collectionPractice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TypeCast {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet();
        s.add(10);
        s.add(20);
        s.add(35);
        Iterator<Integer> iterator = s.iterator();
        while (iterator.hasNext()){
           int i =  iterator.next();
           if( i % 2== 0){
               System.out.println(i);
           }
        }


    }
}
