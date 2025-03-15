package com.collectionPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class ListDemo {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(300);
        list.add(100);
        list.add(400);
        list.add(500);
        list.add(200);
        System.out.println(list);
//        list.sort(new ArrayCompDemo());
        list.sort(Comparator.reverseOrder());
//          list.sort(new Comparator<Integer>() {
//              @Override
//              public int compare(Integer o1, Integer o2) {
//                  return Integer.compare(o1, o2);
//              }
//          });
        System.out.println(list);
    }
}
