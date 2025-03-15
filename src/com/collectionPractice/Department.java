package com.collectionPractice;

import java.util.Comparator;
import java.util.TreeMap;

public class Department {
    Integer num;
    String userName;

    Department(int num , String userName){
        this.num = num;
        this.userName = userName;

    }
    public String toString(){
        return this.userName+" "+this.num;
    }

    public static void main(String[] args) {
        Department d1 = new Department(100,"aadi");
        Department d2 = new Department(200,"pankaj");
        Department d3 = new Department(300,"niraj");
        Department d4 = new Department(400,"sneha");
        Department d5 = new Department(500,"aparajita");


        TreeMap<Department,String> t = new TreeMap<>(new Comparator<Department>() {
            @Override
            public int compare(Department o1, Department o2) {
                return 0;
            }
        });
        t.put(d1,"sharma");
        t.put(d2,"shahu");
        t.put(d3,"pandey");
        t.put(d4,"ydav");
        t.put(d5,"pandey");
        System.out.println(t);
    }
}
