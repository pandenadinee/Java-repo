package com.collectionPractice;

import java.util.Comparator;

public class IntComp implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
//        if(o1 < o2 ) return +1;
//        else if( o1 > o2 ) return -1;
//        else return 0;
        return -Integer.compare(o1, o2);
    }
}
