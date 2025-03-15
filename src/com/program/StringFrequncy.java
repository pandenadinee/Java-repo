package com.program;

import java.util.*;

public class StringFrequncy {
    public static void main(String[] args) {
        String s = "nandini";
        frequency(s);
    }
    public static void frequency(String s){
        int n = s.length();

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            char key = s.charAt(i);
            if(map.containsKey(key)){
                int val = map.get(key);
                map.put(key , val+1);
            }
            else {
                map.put(key,1);
            }
        }
        System.out.println(map);
        String result = "";
        Set<Map.Entry<Character,Integer>> set = map.entrySet();
        Iterator<Map.Entry<Character,Integer>>itr = set.iterator();
        while (itr.hasNext()){
           Map.Entry<Character,Integer> entry =  itr.next();
           char ch = entry.getKey();
           int value = entry.getValue();

           if (value != 1){
               System.out.println(ch);
           }


//           for(int i = 0; i<value; i++){
//
//               result = result +ch;
//           }


//           String s1 = entry.getKey()+""+entry.getValue();
//            System.out.print(s1);

//            System.out.println(entry);


        }

//        System.out.println(result);
//        for(Map.Entry<Character, Integer> i :set){
//            System.out.println(i);
//        }
    }
}
