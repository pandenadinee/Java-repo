package com.StringProgram;

import java.util.HashMap;

public class HashMapWordFrequency {
    public static void main(String[] args) {
        String s = "My name is Nandini My husband name is Uday My kids name is Aarushi and Aparajita";
        String[] arr = s.split(" ");
        int n = arr.length;

        HashMap<String,Integer> map = new HashMap<>();

        for(int i = 0 ; i < n ; i++){
            String k = arr[i];

            if(map.containsKey(k)){
                int val = map.get(k);
                map.put(k,val+1);
            }
            else {
                map.put(k,1);
            }
        }
        System.out.println(map);
    }
}
