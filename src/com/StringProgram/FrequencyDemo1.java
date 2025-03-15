package com.StringProgram;

import java.util.*;

public class FrequencyDemo1 {
    public static void main(String[] args) {
        String s = "aaabbbbdddddfgh";
        TreeMap<Character,Integer> map = new TreeMap<>(Comparator.reverseOrder());
        int n = s.length();
        for(int i = 0; i<n; i++){
            char key = s.charAt(i);
            if(map.containsKey(key)){
                int val = map.get(key);
                map.put(key,val+1);
            }
            else{
                map.put(key,1);
            }
        }
        System.out.println(map);
       Set<Map.Entry<Character,Integer>> set =  map.entrySet();
       Iterator<Map.Entry<Character,Integer>> iter=  set.iterator();
       String res = "";
       while (iter.hasNext() ){
        Map.Entry<Character,Integer> e =   iter.next();
       res =  res + e.getKey()+e.getValue();
       }

        System.out.println(res);

//        Set<Integer> sh = new HashSet<>();
//        sh.add(10);
//        sh.add(20);
//        Iterator<Integer> it = sh.iterator();
//        while (it.hasNext()){
//            int i = it.next();
//        }


    }
}
