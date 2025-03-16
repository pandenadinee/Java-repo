package com.program;

import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class UniqueElement {
    public static void main(String[] args) {
        int[] arr =  {1,4,5,8,2,1,2,4,5,2,6,7,9};
        unique(arr);
    }
    public static void unique(int[] arr){
        int n = arr.length;

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
           int k =  arr[i];
           if(map.containsKey(k)){
              int val =  map.get(k);
              map.put(k , val+1);
           }
           else {
               map.put(k,1);
           }
        }
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();


        Iterator<Map.Entry<Integer, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,Integer> entry = iterator.next();
            if (entry.getValue()==1){
                System.out.println(entry.getKey());

            }
        }
    }
}
