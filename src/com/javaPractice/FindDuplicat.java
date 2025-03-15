package com.javaPractice;

import java.util.*;



public class FindDuplicat {
    public static void main(String[] args) {
        int[] arr = {2,4,3,1,2,4,6,1,7,9,6};
//        duplicate(arr);

        uniqueElement(arr);

    }
    public static void duplicate(int[] arr){
       int n = arr.length;
       Arrays.sort(arr);
       Set<Integer> set = new HashSet<>();
       for(int i = 0; i<n-1; i++){
           if(arr[i] == arr[i+1]){
               set.add(arr[i]);
           }
       }
       for(Integer i : set){
           System.out.println(i);
       }
    }
    public static void uniqueElement(int[] arr){
        int n = arr.length;
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
           int k =  arr[i];
            if(map.containsKey(k)){
               int val = map.get(k);
               map.put(k , val+1);
            }
            else {
                map.put(k , 1);
            }
        }
        Set<Map.Entry<Integer,Integer>> entry = map.entrySet();
       Iterator<Map.Entry<Integer,Integer>>itr = entry.iterator();
       while (itr.hasNext()){
          Map.Entry<Integer,Integer> next = itr.next();
          if(next.getValue() == 1){
              System.out.println(next.getKey());
          }
       }
    }
}
