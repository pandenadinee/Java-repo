package com.collectionPractice;

import java.util.Comparator;

public class MapComp implements Comparator<Department> {

    @Override
    public int compare(Department o1, Department o2) {

        return -Integer.compare(o1.num,o2.num);


    }
}
