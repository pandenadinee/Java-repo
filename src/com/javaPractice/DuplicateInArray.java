package com.javaPractice;

import java.util.*;

public class DuplicateInArray {
    public static void main(String[] args) {
        int[] arr = {1,4,3,4,1,3,8,6,5,4};
//        FindingDuplicateElement1(arr);


        int[] arr1={1,2,1,3,4,1,2,6};
        FindingDuplicateElement2(arr1);
//        FindingUniqueElement(arr1);

    }
    public static void FindingDuplicateElement1(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    break;
                }
            }
        }

    }
    public static void FindingDuplicateElement2(int[] arr1){
        int n = arr1.length;
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(arr1);
        for(int i = 1; i<n-1; i++){
            if(arr1[i]==arr1[i+1]){
                set.add(arr1[i]);
            }
        }
        System.out.println(set);
        for(Integer i :set){
            System.out.println(i);
        }
//        Iterator<Integer> iterator = set.iterator();
//        while (iterator.hasNext()){
//            Integer re = iterator.next();
//            System.out.println(re);
//        }
    }
    public static void FindingUniqueElement(int[] arr1){
        int n = arr1.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            int k = arr1[i];
            if(map.containsKey(k)){
                int val = map.get(k);
                map.put(k , val+1);
            }
            else {
                map.put(k,1);
            }
        }
        System.out.println(map);
       Set<Map.Entry<Integer,Integer>> set = map.entrySet();
       for( Map.Entry<Integer,Integer> entry :set){
           if(entry.getValue() == 1 ){
               System.out.println(entry.getKey());
           }
       }

//      Iterator<Map.Entry<Integer,Integer>>  itr = entry.iterator();
//      while (itr.hasNext()){
//
//         Map.Entry<Integer,Integer> next = itr.next();
//         if(next.getValue() > 1){
//             System.out.println(next.getKey() + "->" + next.getValue() );
//         }
//
//
//      }

      }
    }


