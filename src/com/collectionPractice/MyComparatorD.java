package com.collectionPractice;

import java.util.Comparator;

public class MyComparatorD implements Comparator<Teacher> {



    @Override
    public int compare(Teacher o1, Teacher o2) {

        return - Integer.compare(o1.roll, o2.roll);
//        if(o1.roll < o2. roll) return  1;
//        else if(o1.roll > o2.roll ) return  -1;
//        else return  0;


    }
}
